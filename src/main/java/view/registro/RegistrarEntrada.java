/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.registro;

import com.sun.jdi.InvalidTypeException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import model.Entrada;
import model.EntradaDAO;
import model.Produto;
import model.ProdutoDAO;

/**
 *
 * @author kauan
 */
public class RegistrarEntrada extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RegistrarEntrada.class.getName());

    /**
     * Creates new form RegistrarVenda
     */
    public RegistrarEntrada() {
        initComponents();
        for(Produto p : produtoDAO.listar()){
            ProdutoComboBox.addItem(p.getNome());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegistrarEntradaPanel = new javax.swing.JPanel();
        ProdutoComboBox = new javax.swing.JComboBox<>();
        QntField = new javax.swing.JTextField();
        DataField = new javax.swing.JTextField();
        ProdutoLabel = new javax.swing.JLabel();
        QntLabel = new javax.swing.JLabel();
        DataLabel = new javax.swing.JLabel();
        TituloLabel = new javax.swing.JLabel();
        AdicionarButton = new javax.swing.JButton();
        FinalizarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        RegistrarEntradaPanel.setBackground(new java.awt.Color(206, 212, 218));

        ProdutoComboBox.setBackground(new java.awt.Color(233, 236, 239));

        QntField.setBackground(new java.awt.Color(233, 236, 239));

        DataField.setBackground(new java.awt.Color(233, 236, 239));

        ProdutoLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ProdutoLabel.setForeground(new java.awt.Color(52, 58, 64));
        ProdutoLabel.setText("Produto:");

        QntLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        QntLabel.setForeground(new java.awt.Color(52, 58, 64));
        QntLabel.setText("Quantidade:");

        DataLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DataLabel.setForeground(new java.awt.Color(52, 58, 64));
        DataLabel.setText("Data:");

        TituloLabel.setFont(new java.awt.Font("sansserif", 3, 36)); // NOI18N
        TituloLabel.setForeground(new java.awt.Color(52, 58, 64));
        TituloLabel.setText("<html>\nRegistrar entrada<br/>\nde produtos<br/>\n</html>");

        AdicionarButton.setBackground(new java.awt.Color(233, 236, 239));
        AdicionarButton.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        AdicionarButton.setForeground(new java.awt.Color(52, 58, 64));
        AdicionarButton.setText("Adicionar Item");
        AdicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarButtonActionPerformed(evt);
            }
        });

        FinalizarButton.setBackground(new java.awt.Color(233, 236, 239));
        FinalizarButton.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        FinalizarButton.setForeground(new java.awt.Color(52, 58, 64));
        FinalizarButton.setText("Finalizar");
        FinalizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegistrarEntradaPanelLayout = new javax.swing.GroupLayout(RegistrarEntradaPanel);
        RegistrarEntradaPanel.setLayout(RegistrarEntradaPanelLayout);
        RegistrarEntradaPanelLayout.setHorizontalGroup(
            RegistrarEntradaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistrarEntradaPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(RegistrarEntradaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProdutoLabel)
                    .addComponent(QntLabel)
                    .addComponent(DataLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(RegistrarEntradaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistrarEntradaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(QntField)
                        .addComponent(ProdutoComboBox, 0, 350, Short.MAX_VALUE)
                        .addComponent(DataField))
                    .addGroup(RegistrarEntradaPanelLayout.createSequentialGroup()
                        .addComponent(AdicionarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FinalizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistrarEntradaPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
        );
        RegistrarEntradaPanelLayout.setVerticalGroup(
            RegistrarEntradaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarEntradaPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(TituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(RegistrarEntradaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProdutoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProdutoLabel))
                .addGap(18, 18, 18)
                .addGroup(RegistrarEntradaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QntField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QntLabel))
                .addGap(18, 18, 18)
                .addGroup(RegistrarEntradaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataLabel))
                .addGap(27, 27, 27)
                .addGroup(RegistrarEntradaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FinalizarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdicionarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        ProdutoComboBox.getAccessibleContext().setAccessibleName("Selecionar produto");
        ProdutoComboBox.getAccessibleContext().setAccessibleDescription("Campo para selecionar o produto");
        QntField.getAccessibleContext().setAccessibleName("Campo quantidade");
        QntField.getAccessibleContext().setAccessibleDescription("Campo para informar quanto do produto informado foi abastecido");
        DataField.getAccessibleContext().setAccessibleName("Campo data");
        DataField.getAccessibleContext().setAccessibleDescription("Campo para informar a data que os produtos chegaram");
        TituloLabel.getAccessibleContext().setAccessibleDescription("Titulo da tela");
        AdicionarButton.getAccessibleContext().setAccessibleName("Botão adicionar item");
        AdicionarButton.getAccessibleContext().setAccessibleDescription("Botão para adicionar ao registro mais um produto que chegou ao estoque ");
        FinalizarButton.getAccessibleContext().setAccessibleName("Botão finalizar");
        FinalizarButton.getAccessibleContext().setAccessibleDescription("Botão para finalizar registro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RegistrarEntradaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegistrarEntradaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarButtonActionPerformed
        // TODO add your handling code here:
        registrar();
        ProdutoComboBox.setSelectedIndex(0);
        QntField.setText("");
        DataField.setEditable(false);
    }//GEN-LAST:event_AdicionarButtonActionPerformed

    private void FinalizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarButtonActionPerformed
        // TODO add your handling code here:
        registrar();
        entradaDAO.cadastrar(entrada);
        this.dispose();
    }//GEN-LAST:event_FinalizarButtonActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new RegistrarEntrada().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarButton;
    private javax.swing.JTextField DataField;
    private javax.swing.JLabel DataLabel;
    private javax.swing.JButton FinalizarButton;
    private javax.swing.JComboBox<String> ProdutoComboBox;
    private javax.swing.JLabel ProdutoLabel;
    private javax.swing.JTextField QntField;
    private javax.swing.JLabel QntLabel;
    private javax.swing.JPanel RegistrarEntradaPanel;
    private javax.swing.JLabel TituloLabel;
    // End of variables declaration//GEN-END:variables
    Entrada entrada = new Entrada();
    ProdutoDAO produtoDAO = new ProdutoDAO();
    EntradaDAO entradaDAO = new EntradaDAO();
    
    boolean registrar(){
        try{
            int selecionado = ProdutoComboBox.getSelectedIndex();
            Produto produto = produtoDAO.listar().get(selecionado);

            String data = DataField.getText();
            String formato = "^([0-2][0-9]|3[01])/(0[1-9]|1[0-2])/([0-9]{4})$";
            int quantidade = Integer.parseInt(QntField.getText());
            double total = produto.getPreco()*quantidade;
            
            if(!data.matches(formato)){
                throw new InvalidTypeException("data");
            }else if(quantidade < 0){
                throw new InvalidTypeException("quantidade < 0");
            }else if(QntField.getText().isBlank() || DataField.getText().isBlank()){
                throw new InvalidTypeException("campo vazio");
            }
            
            entrada.addProduto(produto);
            entrada.setDataString(data);
            entrada.setQuantidade(entrada.getQuantidade() + quantidade);
            
            produto.setQuantidade(produto.getQuantidade() + quantidade);
            produtoDAO.atualizar(produto);
            
            return true;
        }catch(InvalidTypeException e1){
            switch(e1.getMessage()){
                case("data"):
                    JOptionPane.showMessageDialog(this, "Informe a data no formato dd/MM/aaaa (data/mês/ano)");
                break;
                case("quantidade < 0"):
                    JOptionPane.showMessageDialog(this, "O número de produtos vendidos não pode ser menor que 0");
                break;
                case("campo vazio"):
                    JOptionPane.showMessageDialog(this, "Devem ser informados valores em todos os campos");
                break;
            }
            return false;
        }catch(NumberFormatException e2){
            JOptionPane.showMessageDialog(this, "Quantidades devem ser registradas como números inteiros");
            return false;
        }
    }
}
