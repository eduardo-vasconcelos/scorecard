/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.negocios;

import java.util.Date;

/**
 *
 * @author eduardovasconcelos
 */
public class Historico {
    
    private int codigo;
    private Date Data;
    private int statusAterior;
    private String descricao;
    private String parecer;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the Data
     */
    public Date getData() {
        return Data;
    }

    /**
     * @param Data the Data to set
     */
    public void setData(Date Data) {
        this.Data = Data;
    }

    /**
     * @return the statusAterior
     */
    public int getStatusAterior() {
        return statusAterior;
    }

    /**
     * @param statusAterior the statusAterior to set
     */
    public void setStatusAterior(int statusAterior) {
        this.statusAterior = statusAterior;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the parecer
     */
    public String getParecer() {
        return parecer;
    }

    /**
     * @param parecer the parecer to set
     */
    public void setParecer(String parecer) {
        this.parecer = parecer;
    }
       
}
