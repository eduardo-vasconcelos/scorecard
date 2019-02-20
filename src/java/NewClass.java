
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eduardovasconcelos
 */
public class NewClass {
    
    public static void main(String args[]){
        EntityManagerFactory emf = null;
        
        EntityManager manager = emf.createEntityManager();
        
        manager.getTransaction().begin();    
        
        
    }
    
}
