/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kauan
 */
public abstract class Registro {
    int id;
    List<Produto> produtos = new ArrayList();
    LocalDate data;
    int quantidade;
        
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
    
    public abstract String tipoRegistro();
}
