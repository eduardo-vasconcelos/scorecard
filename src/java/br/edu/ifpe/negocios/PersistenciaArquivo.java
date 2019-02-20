/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.negocios;

import java.io.Serializable;

/**
 *
 * @author eduardovasconcelos
 */
public class PersistenciaArquivo implements Persistencia, Serializable, Cloneable{
    
    private String enderecoArquivo;

    @Override
    public void inserir(Animal animal) {
        System.out.println("O animal "+animal.nome+" foi inserido no arquivo:"+this.enderecoArquivo);
    }

    @Override
    public void recuperar() {
        System.out.println("O animal foi recuperado do arquivo: "+this.enderecoArquivo);
    }
    
}
