
package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author kauan
 */

@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    @Column(name = "login", unique = true)
    String login;
    
    @Column(name = "senha")
    String senha;
    
    @Enumerated(EnumType.STRING)
    Permissoes permissoes;
    
    public enum Permissoes{
        PADRAO, GERENTE, ADM;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Usuario(){}

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Permissoes getPermissoes() {
        return permissoes;
    } 

    public void setPermissoes(Permissoes permissoes) {
        this.permissoes = permissoes;
    }
    
    public void setPermissoes(int index){
        switch (index){
            case 0:
                this.permissoes = Permissoes.PADRAO;
            break;
            case 1:
                this.permissoes = Permissoes.GERENTE;
            break;
            case 2:
                this.permissoes = Permissoes.ADM;
            break;
        }
    }
    
    
}
