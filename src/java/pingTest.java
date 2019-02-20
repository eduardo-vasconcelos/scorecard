
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardovasconcelos
 */
public class pingTest {

    public static void main(String args[]) {

        InetAddress address = null;
        int delay = 200;
        String addr = "10.0.";
        
        for(int j =5;j<255;j++){
            
            addr = "192.168."+j+".";
            System.out.println(addr);

        for (int i = 0; i < (255); i++) {
            try {
                address = InetAddress.getByName(addr +i);
                try {
                    if(address.isReachable(delay))
                        System.out.println("Sucesso!!! Endereço "+ addr + i + " foi alcançado");
                    /*else
                        System.out.println("Endereço "+ addr + i + ".1 não foi alcançado");*/
                } catch (IOException ex) {
                    System.out.println("Erro ao conectar");
                }
                /*address = InetAddress.getByName(addr+ i + ".2");
                try {
                    if(address.isReachable(delay))
                        System.out.println("Sucesso!!! Endereço "+ addr + i + ".2 foi alcançado");
                    else
                        System.out.println("Endereço "+ addr + i + ".2 não foi alcançado");
                } catch (IOException ex) {
                    System.out.println("Erro ao conectar");
                }
                address = InetAddress.getByName(addr + i + ".100");
                try {
                    if(address.isReachable(delay))
                        System.out.println("Sucesso!!! Endereço "+ addr + i + ".100 foi alcançado");
                    else
                        System.out.println("Endereço "+ addr + i + ".100 não foi alcançado");
                } catch (IOException ex) {
                    System.out.println("Erro ao conectar");
                }*/
                /*address = InetAddress.getByName(addr + i + ".254");
                try {
                    if(address.isReachable(delay))
                        System.out.println("Sucesso!!! Endereço "+ addr + i + ".254 foi alcançado");
                    else
                        System.out.println("Endereço "+ addr + i + ".254 não foi alcançado");
                } catch (IOException ex) {
                    System.out.println("Erro ao conectar");
                }*/
            } catch (UnknownHostException e) {
                System.out.println("Cannot lookup host ");
                return;
            }
        }
    }
    }

}
