/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author kauan
 */
public class JPAUtil {
    private static final String PERSISTENCE_UNIT = "PI-Unit";
    private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
    
    public static EntityManager getEntityManager(){
        return factory.createEntityManager();
    }
    
    public static void closeFactory(){
        if (factory != null && factory.isOpen()){
            factory.close();
        }
    }
}
