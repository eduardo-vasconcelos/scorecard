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
public class PersistenciaInternet extends Persistencia{

    private String urlSite;
    
    @Override
    public void inserir(Animal animal) {
        System.out.println("O animal "+animal.nome+" foi inserido no site "+this.urlSite);
    }

    @Override
    public void recuperar() {
        System.out.println("O animal foi recuperado do site: "+this.urlSite);
    }
    
}
