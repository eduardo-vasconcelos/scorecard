/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.negocios;

/**
 *
 * @author eduardovasconcelos
 */
public class Lei {
    
    private int codigo;
    private String descricao;
    private String tipo;
    private int capitulo;
    private String Artigo;

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
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the capitulo
     */
    public int getCapitulo() {
        return capitulo;
    }

    /**
     * @param capitulo the capitulo to set
     */
    public void setCapitulo(int capitulo) {
        this.capitulo = capitulo;
    }

    /**
     * @return the Artigo
     */
    public String getArtigo() {
        return Artigo;
    }

    /**
     * @param Artigo the Artigo to set
     */
    public void setArtigo(String Artigo) {
        this.Artigo = Artigo;
    }
    
    
}
