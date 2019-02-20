/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.negocios;

import java.util.List;

/**
 *
 * @author eduardovasconcelos
 */
public class House {
    
    private int length;
    private String address;
    private List<Bathroom> bathRooms;

    public House(int length, String address, List<Bathroom> bathRooms) {
        this.length = length;
        this.address = address;
        this.bathRooms = bathRooms;
    } 
    
}

