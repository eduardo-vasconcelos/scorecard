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

public class Cachorro extends Animal{

    public Cachorro(int peso, String nome) {
        super(peso, nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("auau");
    }
    
}
