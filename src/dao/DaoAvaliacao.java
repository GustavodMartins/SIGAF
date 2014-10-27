/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import Conexao.Conexao;
import Interface.IDao;
import Logico.Avaliacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author GUSTAVO
 */
public class DaoAvaliacao implements IDao<Avaliacao>{
    
    private Connection conexao;
    
    public DaoAvaliacao(){
        try {
            this.conexao = Conexao.getConexao();
        } catch (Exception ex) {
            Logger.getLogger(DaoAvaliacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void incluir(Avaliacao objeto) throws SQLException {
         String sql = "INSERT INTO avaliacao (dtavainicial, pesoinicial,altura, pesoalcancado,dtfinal,obsercacao,pesofinal,objetivo,codusuario,pesoPlanejado) VALUES(?,?,?,?,?,?,?,?,?,?)";
       try{
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setDate(1, Anulavel.getData(objeto.getDataInicial()));
        stmt.setFloat(2, objeto.getPesoInicial());
        stmt.setFloat(3, objeto.getAltura());
        stmt.setFloat(4, objeto.getPesoAlcancado());
        stmt.setDate(5, Anulavel.getData(objeto.getDataFinal()));
        stmt.setString(6, objeto.getObservacao());
        stmt.setFloat(7, objeto.getPesoFinal());
        stmt.setString(8, objeto.getObjetivo());
        stmt.setInt(9, objeto.getIdUsuario());
        stmt.setFloat(10,objeto.getPesoPlanejado());
           
        stmt.execute();
       }catch(SQLException e){
                System.out.println(e);
                }
    }

    
    public void editar(Avaliacao objeto) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    @Override
    public List<Avaliacao> pesquisar(Avaliacao objeto) throws SQLException {
     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    
}
