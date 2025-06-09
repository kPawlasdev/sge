
package model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import javax.security.auth.login.LoginException;
import util.JPAUtil;

/**
 *
 * @author kauan
 */
public class UsuarioDAO extends GenericDAO<Usuario>{
    
    public UsuarioDAO() {
        super(Usuario.class);
    }
    
    public Usuario login(String login, String senha) throws LoginException{
        EntityManager em = JPAUtil.getEntityManager();
        try{
            String jpql = "SELECT u FROM Usuario u WHERE u.login = :login AND u.senha = :senha";
            TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
            query.setParameter("login", login);
            query.setParameter("senha", senha);
            Usuario usuario = query.getSingleResultOrNull();
            
            if (usuario == null) {
                throw new LoginException("Login ou senha inválidos");
            }
            
            return usuario;
        }catch(Exception e){
            throw new LoginException("Login ou senha inválidos");
        }finally{
            em.close();
        }
    }
    
    public boolean nomeJaCadastrado(String login){
        EntityManager em = JPAUtil.getEntityManager();
        try{
            String jpql = "SELECT u FROM Usuario u WHERE u.login = :login";
            TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
            query.setParameter("login", login);
            Usuario usuario = query.getSingleResultOrNull();
            if(usuario == null){
                return false;
            }else{
                return true;
            }
        }finally{
            em.close();
        }
    }
    
}
