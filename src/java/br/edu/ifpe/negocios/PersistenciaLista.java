/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.negocios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardovasconcelos
 */
public class PersistenciaLista extends Persistencia{
    
    private List<Animal> lista = new ArrayList<>();

    @Override
    public void inserir(Animal animal) {
        this.lista.add(animal);
        System.out.println("O animal "+animal.nome+" foi inserido na lista");
    }

    @Override
    public void recuperar() {
        System.out.println("O animal foi recuperado da lista");
    }   
}
