/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logico;

import java.util.Date;

/**
 *
 * @author GUSTAVO
 */
public class Avaliacao {
    
    private int idAvaliacao, idUsuario;
    private Date dataInicial, dataFinal;
    private float pesoInicial, pesoFinal, pesoPlanejado, pesoAlcancado,altura;
    private String observacao, objetivo;

    public int getIdAvaliacao() {
        return idAvaliacao;
    }

    public void setIdAvaliacao(int idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public float getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(float pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public float getPesoFinal() {
        return pesoFinal;
    }

    public void setPesoFinal(float pesoFinal) {
        this.pesoFinal = pesoFinal;
    }

    public float getPesoPlanejado() {
        return pesoPlanejado;
    }

    public void setPesoPlanejado(float pesoPlanejado) {
        this.pesoPlanejado = pesoPlanejado;
    }

    public float getPesoAlcancado() {
        return pesoAlcancado;
    }

    public void setPesoAlcancado(float pesoAlcancado) {
        this.pesoAlcancado = pesoAlcancado;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
    
    
}
