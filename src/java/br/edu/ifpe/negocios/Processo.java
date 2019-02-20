/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.negocios;

import java.util.Date;
import java.util.List;

/**
 *
 * @author eduardovasconcelos
 */
public class Processo {
    
    private int numero;
    private Date dataAbertura;
    private String instanciaAtual;
    private int status;
    private String decisaoFinal;
    private String descricao;
    private List<Cliente> clientes;
    private List<Advogado> advogadosResponsaveis;
    private List<Lei> leisBasesDoCaso;
    private List<Historico> historicoDecisoes;

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the dataAbertura
     */
    public Date getDataAbertura() {
        return dataAbertura;
    }

    /**
     * @param dataAbertura the dataAbertura to set
     */
    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    /**
     * @return the instanciaAtual
     */
    public String getInstanciaAtual() {
        return instanciaAtual;
    }

    /**
     * @param instanciaAtual the instanciaAtual to set
     */
    public void setInstanciaAtual(String instanciaAtual) {
        this.instanciaAtual = instanciaAtual;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the decisaoFinal
     */
    public String getDecisaoFinal() {
        return decisaoFinal;
    }

    /**
     * @param decisaoFinal the decisaoFinal to set
     */
    public void setDecisaoFinal(String decisaoFinal) {
        this.decisaoFinal = decisaoFinal;
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
     * @return the clientes
     */
    public List<Cliente> getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    /**
     * @return the advogadosResponsaveis
     */
    public List<Advogado> getAdvogadosResponsaveis() {
        return advogadosResponsaveis;
    }

    /**
     * @param advogadosResponsaveis the advogadosResponsaveis to set
     */
    public void setAdvogadosResponsaveis(List<Advogado> advogadosResponsaveis) {
        this.advogadosResponsaveis = advogadosResponsaveis;
    }

    /**
     * @return the leisBasesDoCaso
     */
    public List<Lei> getLeisBasesDoCaso() {
        return leisBasesDoCaso;
    }

    /**
     * @param leisBasesDoCaso the leisBasesDoCaso to set
     */
    public void setLeisBasesDoCaso(List<Lei> leisBasesDoCaso) {
        this.leisBasesDoCaso = leisBasesDoCaso;
    }

    /**
     * @return the historicoDecisoes
     */
    public List<Historico> getHistoricoDecisoes() {
        return historicoDecisoes;
    }

    /**
     * @param historicoDecisoes the historicoDecisoes to set
     */
    public void setHistoricoDecisoes(List<Historico> historicoDecisoes) {
        this.historicoDecisoes = historicoDecisoes;
    }
    
    
    
}
