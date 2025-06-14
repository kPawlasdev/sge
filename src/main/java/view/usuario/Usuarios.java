/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.usuario;

import view.usuario.EditarUsuario;
import view.usuario.CadastroUsuarios;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Usuario;
import model.UsuarioDAO;
import util.ViewUtil;

/**
 *
 * @author kauan
 */
public class Usuarios extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Usuarios.class.getName());

    /**
     * Creates new form Usuarios
     */
    public Usuarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsuariosPanel = new javax.swing.JPanel();
        PesquisarField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        UsuariosTable = new javax.swing.JTable();
        ExcluirButton = new javax.swing.JButton();
        CadastrarButton = new javax.swing.JButton();
        EditarButton = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        Produtos = new javax.swing.JMenuItem();
        Vendas = new javax.swing.JMenuItem();
        Usuários = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        UsuariosPanel.setBackground(new java.awt.Color(206, 212, 218));
        UsuariosPanel.setPreferredSize(new java.awt.Dimension(680, 450));

        PesquisarField.setBackground(new java.awt.Color(233, 236, 239));
        PesquisarField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PesquisarFieldKeyReleased(evt);
            }
        });

        UsuariosTable.setBackground(new java.awt.Color(233, 236, 239));
        UsuariosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Permissões"
            }
        ));
        jScrollPane1.setViewportView(UsuariosTable);
        UsuariosTable.getAccessibleContext().setAccessibleName("Tabela usuários");
        UsuariosTable.getAccessibleContext().setAccessibleDescription("tabela com usuários cadastrados");

        ExcluirButton.setBackground(new java.awt.Color(233, 236, 239));
        ExcluirButton.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        ExcluirButton.setText("Excluir");
        ExcluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirButtonActionPerformed(evt);
            }
        });

        CadastrarButton.setBackground(new java.awt.Color(233, 236, 239));
        CadastrarButton.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        CadastrarButton.setText("<html> Cadastrar<br/> usuário<br/> </html>");
        CadastrarButton.setToolTipText("");
        CadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarButtonActionPerformed(evt);
            }
        });

        EditarButton.setBackground(new java.awt.Color(233, 236, 239));
        EditarButton.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        EditarButton.setText("Editar");
        EditarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UsuariosPanelLayout = new javax.swing.GroupLayout(UsuariosPanel);
        UsuariosPanel.setLayout(UsuariosPanelLayout);
        UsuariosPanelLayout.setHorizontalGroup(
            UsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsuariosPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(UsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PesquisarField)
                    .addComponent(jScrollPane1)
                    .addGroup(UsuariosPanelLayout.createSequentialGroup()
                        .addComponent(CadastrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(EditarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(ExcluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
        );
        UsuariosPanelLayout.setVerticalGroup(
            UsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuariosPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(PesquisarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(UsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UsuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ExcluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EditarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CadastrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        PesquisarField.getAccessibleContext().setAccessibleName("Barra de pesquisa");
        PesquisarField.getAccessibleContext().setAccessibleDescription("campo para pesquisar usuários cadastrados");
        ExcluirButton.getAccessibleContext().setAccessibleDescription("botão para excluir usuário selecionado");
        CadastrarButton.getAccessibleContext().setAccessibleDescription("botão para abrir tela de cadastro de usuários");
        EditarButton.getAccessibleContext().setAccessibleDescription("botão para abrir tela de edição de usuários");

        MenuBar.setPreferredSize(new java.awt.Dimension(25, 25));

        Menu.setText("Menu");

        Produtos.setText("Produtos");
        Produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutosActionPerformed(evt);
            }
        });
        Menu.add(Produtos);
        Produtos.getAccessibleContext().setAccessibleDescription("acessar tela de produtos");

        Vendas.setText("Registros");
        Vendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendasActionPerformed(evt);
            }
        });
        Menu.add(Vendas);
        Vendas.getAccessibleContext().setAccessibleDescription("acessar tela de vendas");

        Usuários.setText("Usuários");
        Usuários.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuáriosActionPerformed(evt);
            }
        });
        Menu.add(Usuários);
        Usuários.getAccessibleContext().setAccessibleDescription("acessar tela de usuários");

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        Menu.add(Sair);
        Sair.getAccessibleContext().setAccessibleDescription("sair");

        MenuBar.add(Menu);
        Menu.getAccessibleContext().setAccessibleDescription("menu de telas");

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(UsuariosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UsuariosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarButtonActionPerformed
        // TODO add your handling code here:
        new CadastroUsuarios().setVisible(true);
    }//GEN-LAST:event_CadastrarButtonActionPerformed

    private void ProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutosActionPerformed
        // TODO add your handling code here:
        ViewUtil.menuProdutos(this);
    }//GEN-LAST:event_ProdutosActionPerformed

    private void VendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendasActionPerformed
        // TODO add your handling code here:
        ViewUtil.menuRegistros(this);
    }//GEN-LAST:event_VendasActionPerformed

    private void UsuáriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuáriosActionPerformed
        // TODO add your handling code here:
        ViewUtil.menuUsuarios(this);
    }//GEN-LAST:event_UsuáriosActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // TODO add your handling code here:
        ViewUtil.menuSair(this);
    }//GEN-LAST:event_SairActionPerformed

    private void EditarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarButtonActionPerformed
        // TODO add your handling code here:
        try{
            int linha = UsuariosTable.getSelectedRow();
            int id = (int) UsuariosTable.getValueAt(linha, 0);
            Usuario usuario = usuarioDAO.obter(id);
            new EditarUsuario(usuario).setVisible(true);
        }catch(IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "Selecione um usuário para editar");
        }
    }//GEN-LAST:event_EditarButtonActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        gerarTabela();
    }//GEN-LAST:event_formWindowGainedFocus

    private void ExcluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirButtonActionPerformed
        // TODO add your handling code here:
        try{
            int linha = UsuariosTable.getSelectedRow();
            int id = (int) UsuariosTable.getValueAt(linha, 0);
            usuarioDAO.excluir(id);
            gerarTabela();
        }catch(IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "Selecione um usuário para excluir");
        }
    }//GEN-LAST:event_ExcluirButtonActionPerformed

    private void PesquisarFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesquisarFieldKeyReleased
        // TODO add your handling code here:
        ViewUtil.barraPesquisa(UsuariosTable, 1, PesquisarField);
    }//GEN-LAST:event_PesquisarFieldKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Usuarios().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarButton;
    private javax.swing.JButton EditarButton;
    private javax.swing.JButton ExcluirButton;
    private javax.swing.JMenu Menu;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JTextField PesquisarField;
    private javax.swing.JMenuItem Produtos;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JPanel UsuariosPanel;
    private javax.swing.JTable UsuariosTable;
    private javax.swing.JMenuItem Usuários;
    private javax.swing.JMenuItem Vendas;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    static UsuarioDAO usuarioDAO = new UsuarioDAO();
    
    void gerarTabela(){
        try{
            List<Usuario> usuarios = usuarioDAO.listar();
            DefaultTableModel model = (DefaultTableModel) UsuariosTable.getModel();
            model.setNumRows(0);

            for(int i = 0; i < usuarios.size(); i++){
                model.addRow(new Object[]{
                    usuarios.get(i).getId(),
                    usuarios.get(i).getLogin(),
                    usuarios.get(i).getPermissoes()
                });
            }
        }catch(Exception e){}
    }

}
