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
public class EcaException extends Exception{

    @Override
    public String getMessage() {
        return "O resultado deu uma Eca, resultado inválido";
    }
    
}
