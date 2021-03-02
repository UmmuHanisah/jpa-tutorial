package com.newhut.jpa.tutorial.main;

import com.newhut.jpa.tutorial.entity.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author uha
 */
public class UserDAOTest {
    
    public static void main(String[] args) {
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("UsersDB");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        
        User newUser = new User();
        newUser.setEmail("ummujoy@gmail.com");
        newUser.setFullname("Ummu Hanisah");
        newUser.setPassword("ummujoy");
        em.persist(newUser);
        
        em.getTransaction().commit();
        em.close();
        factory.close();
    }
}
