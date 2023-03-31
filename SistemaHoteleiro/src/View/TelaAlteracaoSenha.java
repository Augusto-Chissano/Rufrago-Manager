package View;

import controller.FuncionarioController;
import javax.swing.JOptionPane;

/**
 *
 * @author Augusto Chissano
 */
public class TelaAlteracaoSenha extends javax.swing.JFrame {

    /**
     * Limpar os campos
     */
    public void limparCampos() {
        txtCodigoID.setText("");
        txtConfirmarSenha.setText("");
        txtSenhaAntiga.setText("");
        txtSenhaNova.setText("");
    }

    /**
     * Creates new form TelaAlteracaoSenha
     */
    public TelaAlteracaoSenha() {
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

        jPanel1 = new javax.swing.JPanel();
        lblTitulonoTopo = new javax.swing.JLabel();
        lblSenhaAntiga = new javax.swing.JLabel();
        lblSenhaNova = new javax.swing.JLabel();
        lblSenhaConfirmar = new javax.swing.JLabel();
        lblCodigoID = new javax.swing.JLabel();
        txtSenhaAntiga = new javax.swing.JTextField();
        txtSenhaNova = new javax.swing.JTextField();
        txtCodigoID = new javax.swing.JTextField();
        txtConfirmarSenha = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alteração de Senha");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 81, 114));

        lblTitulonoTopo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitulonoTopo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulonoTopo.setText("ALTERAÇÃO DA SENHA");

        lblSenhaAntiga.setForeground(new java.awt.Color(255, 255, 255));
        lblSenhaAntiga.setText("Senha Antiga:");

        lblSenhaNova.setForeground(new java.awt.Color(255, 255, 255));
        lblSenhaNova.setText("Nova Senha:");

        lblSenhaConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        lblSenhaConfirmar.setText("Confirmar Senha:");

        lblCodigoID.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigoID.setText("Código ID:");

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/accept.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAlterarMousePressed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSenhaNova)
                            .addComponent(lblSenhaAntiga)
                            .addComponent(lblSenhaConfirmar)
                            .addComponent(lblCodigoID))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenhaAntiga, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenhaNova, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoID, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(lblTitulonoTopo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnCancelar)))
                .addContainerGap(298, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblTitulonoTopo)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenhaAntiga)
                    .addComponent(txtSenhaAntiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenhaNova)
                    .addComponent(txtSenhaNova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenhaConfirmar)
                    .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoID)
                    .addComponent(txtCodigoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnCancelar))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarMousePressed

    private void btnAlterarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMousePressed
        // TODO add your handling code here:

        //Em andamento
        if (!txtCodigoID.getText().isEmpty() && !txtConfirmarSenha.getText().isEmpty() && !txtSenhaAntiga.getText().isEmpty() && !txtSenhaNova.getText().isEmpty()) {
            String senhaAntiga = txtSenhaAntiga.getText();
            String novaSenha = txtSenhaNova.getText();
            String confirmar = txtConfirmarSenha.getText();
            Long id = Long.parseLong(txtCodigoID.getText());
            if (novaSenha.equalsIgnoreCase(confirmar)) {
                if (FuncionarioController.alterarSenha(id, novaSenha)) {
                    JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!!");
                    limparCampos();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, confirme a sua nova senha");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
        }
    }//GEN-LAST:event_btnAlterarMousePressed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAlteracaoSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlteracaoSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlteracaoSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlteracaoSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlteracaoSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCodigoID;
    private javax.swing.JLabel lblSenhaAntiga;
    private javax.swing.JLabel lblSenhaConfirmar;
    private javax.swing.JLabel lblSenhaNova;
    private javax.swing.JLabel lblTitulonoTopo;
    private javax.swing.JTextField txtCodigoID;
    private javax.swing.JTextField txtConfirmarSenha;
    private javax.swing.JTextField txtSenhaAntiga;
    private javax.swing.JTextField txtSenhaNova;
    // End of variables declaration//GEN-END:variables
}