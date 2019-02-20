/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.negocios;

import javax.swing.JOptionPane;

/**
 *
 * @author eduardovasconcelos
 */
public class Consulta implements Impressao{
    
    private int codigo;
    private String nomePaciente;
    private int idadePaciente;
    private String enderecoPaciente;
    private String horaConsulta;
    private String nomeMedico;

    @Override
    public void imprimirConsole() {
        System.out.println(this.toString());
    }

    @Override
    public void imprimirJOptionPane() {
        JOptionPane.showMessageDialog(null, this.toString());
    }
    
}
