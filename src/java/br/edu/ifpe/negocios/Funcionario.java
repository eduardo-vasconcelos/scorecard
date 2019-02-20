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

public class Funcionario {
    
    String nome;
    String endereco;
    String telefone;
    String funcao;
    
    public static void main(String args[]){
        
        Funcionario almox = new Funcionario();
        almox.funcao = "Almoxerifado";
        
        Funcionario ger = new Funcionario();
        ger.funcao = "Gerente";
        
    }
    
}


