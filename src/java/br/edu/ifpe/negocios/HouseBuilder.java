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
public class HouseBuilder {
    
    public House prepareBasicHouse(int length, int numberOfBathRooms, String address){
    
        List<Bathroom> bathRooms = new ArrayList<>();
        
        for(int i = 0;i<numberOfBathRooms;i++){
            bathRooms.add(new BasicBathroom());
        }
        
        return new House(length, address, bathRooms);
        
    }
    
    public House prepareLuxuriousHouse(int length, int numberOfBathRooms, String address){
    
        List<Bathroom> bathRooms = new ArrayList<>();
        
        for(int i = 0;i<numberOfBathRooms;i++){
            bathRooms.add(new LuxuriousBathroom());
        }
        
        return new House(length, address, bathRooms);
        
    }
        
}

