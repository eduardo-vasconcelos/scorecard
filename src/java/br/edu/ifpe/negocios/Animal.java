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

public abstract class Animal {
    
    int peso;
    String nome;
    
    public abstract void emitirSom();
    
    @Override
    public String toString() {
        return "Nome: "+this.nome+" Peso: "+this.peso;
    }
    
    public Animal(int peso, String nome){
        
        this.peso = peso;
        this.nome = nome;
        
    }

    @Override
    public boolean equals(Object obj) {
        
        Animal objAux = null;
        
        if(obj instanceof Animal){
            
            objAux = (Animal)obj;
        }else{
            return false;
        }
        if(objAux.nome.equals(this.nome)&&objAux.peso==peso){
            return true;
        }else{
            return false;
        }
    }   
}
