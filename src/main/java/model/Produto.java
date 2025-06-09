
package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kauan
 */

@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    @Column(name = "nome")
    String nome;
    
    @Column(name = "preco")
    double preco;
    
    @Column(name = "quantidade")
    int quantidade;
    
    @ManyToMany(mappedBy = "produtos")
    List<Venda> vendas = new ArrayList();
    
    @ManyToMany(mappedBy = "produtos")
    List<Entrada> entradas = new ArrayList();
    
    public Produto(){}

    public Produto(int id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "id=" + id + "\nnome=" + nome + "\npreco=" + preco + "\nquantidade=" + quantidade;
    }
    
    
    
}
