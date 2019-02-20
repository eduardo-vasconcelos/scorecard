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

public class MainAnimal {
    
    public static void main(String args[]){
        
        Consulta c = new Consulta();
        Pagamento p = new Pagamento();
        
        Impressora i = new Impressora();
        
        i.imprimirConsole(c);
        i.imprimirJOptionPane(p);
        
        
    
        Animal a1 = new Gato(10,"shanim");
        Animal a2 = new Cachorro(20,"bradock");
        
        if(a1 instanceof Gato){
            ((Gato)a1).arranhar();
        }
        
        a1.emitirSom();
        a2.emitirSom();
        
        int a = 10;
        char b = (char)a;
    }
    
    
}
