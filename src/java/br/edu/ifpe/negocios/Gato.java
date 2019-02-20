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

public class Gato extends Animal{
    
    @Override
    public void emitirSom() {
        System.out.println("miau");
    }
    
    public void arranhar(){
        System.out.println("RRUUUAAAAAUUUUU");
    }

    @Override
    public String toString() {
        return super.toString()+" e faz miau";
    }
    
   
    
    
    
    //mesmo que você não queira ter um contrutor
    //com argumetos, você precisa referenciar
    //o contrutor do pai.
    public Gato(){
        super(0,"");
    }

    public Gato(int peso, String nome) {
        super(peso, nome);
    }
    
}
