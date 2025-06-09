/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package util;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import view.produto.Produtos;
import view.registro.Registros;
import view.usuario.Usuarios;

/**
 *
 * @author kauan
 */
public class ViewUtil {

    public static void menuProdutos(JFrame frame) {
        Produtos produtos = new Produtos();
        frame.dispose();
        produtos.setVisible(true);
    }

    public static void menuRegistros(JFrame frame) {
        Registros vendas = new Registros();
        frame.dispose();
        vendas.setVisible(true);
    }

    public static void menuUsuarios(JFrame frame) {
        Usuarios usuarios = new Usuarios();
        frame.dispose();
        usuarios.setVisible(true);
    }

    public static void menuSair(JFrame frame) {
        frame.dispose();
    }
    
    public static void barraPesquisa(JTable tabela, int coluna, JTextField barraPesquisa){
        String termoPesquisa = barraPesquisa.getText();
        TableRowSorter filtro = new TableRowSorter(tabela.getModel());
        tabela.setRowSorter(filtro);
        
        if(barraPesquisa.getText().isBlank()){
            filtro.setRowFilter(null);
        }else{
            filtro.setRowFilter(RowFilter.regexFilter("(?i)" + termoPesquisa , coluna));
        }
        
    }
}
