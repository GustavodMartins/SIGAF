/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Conexao.Conexao;
import Logico.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GUSTAVO
 */
public class DaoLogin {

    private Connection conexao;

    public DaoLogin() {
        try {
            this.conexao = Conexao.getConexao();
        } catch (Exception ex) {
            Logger.getLogger(DaoLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Boolean Login(Usuario objeto) {
        String sql = "SELECT nome, senha FROM usuario WHERE nome =? AND senha = ?";
        PreparedStatement stmt;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, objeto.getNome());
            stmt.setString(2, objeto.getSenha());
            ResultSet rs = stmt.executeQuery();
            
            if(rs.first()){
                return true;
            
       
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
