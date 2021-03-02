package com.newhut.jpa.tutorial.main;

import com.newhut.jpa.tutorial.entity.Alien;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @Source 1: What is JPA_JPA Implementation - Navin Neddy
 * @Source 2: https://www.codejava.net/frameworks/hibernate/java-hibernate-jpa-annotations-tutorial-for-beginners
 * @author uha
 */
public class App {
    
    private static Logger logger;
    
    public static void main(String[] args) {
       
        try {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaTutorialPU");
        EntityManager em = emf.createEntityManager();
        
        Alien alien = em.find(Alien.class, 1);
        
        System.out.println("The value for Alien coming from DB are: " + alien);
        } catch (Exception ex) {
            logger.log(Level.SEVERE, "Error on method main: {0}", ex);
        }
            
    }
    
}
