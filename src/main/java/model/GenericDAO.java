/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import util.JPAUtil;

/**
 *
 * @author kauan
 */
public abstract class GenericDAO<T> {
    private final Class<T> entity;
    
    public GenericDAO(Class<T> entity){
        this.entity = entity;
    }
    
    private Class<T> getEntity(){
        return this.entity;
    }
    
    public boolean cadastrar(T entity){
        EntityManager em = JPAUtil.getEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
            return true;
        }catch(Exception e){
            em.getTransaction().rollback();
            
            return false;
        }finally{
            em.close();
        }
    }
    
    public List<T> listar(){
        EntityManager em = JPAUtil.getEntityManager();
        try{
            String jpql = "SELECT x FROM " + entity.getSimpleName() + " x";
            TypedQuery<T> query = em.createQuery(jpql, entity);
            return query.getResultList();
        }finally{
            em.close();
        }
    }
    
    public T obter(int id){
        EntityManager em = JPAUtil.getEntityManager();
        try{
            return em.find(entity, id);
        }finally{
            em.close();
        }
    }
    
    public boolean atualizar(T entity){
        EntityManager em = JPAUtil.getEntityManager();
        try{
            em.getTransaction().begin();
            em.merge(entity);
            em.getTransaction().commit();
            return true;
        }catch(Exception e){
            em.getTransaction().rollback();
            return false;
        }finally{
            em.close();
        }
    }
    
    public boolean excluir(int id){
        EntityManager em = JPAUtil.getEntityManager();
        try{
            T e = em.find(entity, id);
            if(e != null){
                em.getTransaction().begin();
                em.remove(e);
                em.getTransaction().commit();
                return true;
            }else{
                throw new Exception();
            }
        }catch(Exception e){
            em.getTransaction().rollback();
            return false;
        }finally{
            em.close();
            
        }
    }
    
    
}
