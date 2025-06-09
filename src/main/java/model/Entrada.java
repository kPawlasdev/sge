/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kauan
 */
@Entity
@Table(name = "entrada")
public class Entrada{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    @ManyToMany
    @JoinTable(
            name = "entrada_produto",
            joinColumns = @JoinColumn(name = "entrada_id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id")
    )
    List<Produto> produtos = new ArrayList();
    
    @Column(name = "data")
    LocalDate data;
    
    @Column(name = "quantidade")
    int quantidade;
    
    public Entrada() {
    }
            
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public LocalDate getData() {
        return data;
    }
    
    public String getDataFormatada(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = this.data;
        String dataFormatada = formatter.format(data);
        return dataFormatada;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    
    public void setDataString(String dataString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataLocalDate = LocalDate.parse(dataString, formatter);
        this.data = dataLocalDate;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public String tipoRegistro() {
        return "Entrada";
    }
}
