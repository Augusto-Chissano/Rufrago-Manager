package View;

import connection.ConnectionFactory;
import dao.FuncionarioJpaController;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import model.Funcionario;

/**
 *
 * @author Augusto Chissano
 */
public class TelaLogin extends javax.swing.JFrame {

    private TelaPrincipal telaPrincipal;
    private FuncionarioJpaController controllerFuncionario;
    private List<Funcionario> funcionarios;

    /**
     * Metodo para efectuar o login no sistema.
     *
     * @param userName nome de usuario do funcionario
     * @param senha senha do funcionarrio
     * @return true se o funcionario tiver sido cadastrado
     */
    private boolean logar(String userName, String senha) {
        controllerFuncionario = new FuncionarioJpaController(ConnectionFactory.getEmf());
        funcionarios = controllerFuncionario.findFuncionarioEntities();

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNomeDeUsuario().equalsIgnoreCase(userName) && funcionario.getSenha().equalsIgnoreCase(senha) && funcionario.getAcesso().equalsIgnoreCase("Administrador")) {
                telaPrincipal = new TelaPrincipal();
                telaPrincipal.setVisible(true);
                return true;
            }
            if (funcionario.getNomeDeUsuario().equalsIgnoreCase(userName) && funcionario.getSenha().equalsIgnoreCase(senha) && funcionario.getAcesso().equalsIgnoreCase("Funcionário")) {
                telaPrincipal = new TelaPrincipal();
                telaPrincipal.setVisible(true);
                telaPrincipal.ocultarFuncionalidades();
                return true;
            }
        }
        return false;
    }

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
        this.setExtendedState(6);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPalavraPasse = new javax.swing.JLabel();
        lblNomeUsuario = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JTextField();
        txtPalavraPasse = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        lblEsqueceuPalavraPasse = new javax.swing.JLabel();
        lblImagemLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPalavraPasse.setBackground(new java.awt.Color(255, 255, 255));
        lblPalavraPasse.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        lblPalavraPasse.setForeground(new java.awt.Color(255, 255, 255));
        lblPalavraPasse.setText("Palavra-passe:");
        getContentPane().add(lblPalavraPasse, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 400, 100, -1));

        lblNomeUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lblNomeUsuario.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        lblNomeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeUsuario.setText("Nome de usuário:");
        getContentPane().add(lblNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 330, 120, -1));

        txtNomeUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeUsuarioFocusLost(evt);
            }
        });
        txtNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeUsuarioActionPerformed(evt);
            }
        });
        txtNomeUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(txtNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 360, 310, -1));

        txtPalavraPasse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPalavraPasseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPalavraPasseFocusLost(evt);
            }
        });
        txtPalavraPasse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPalavraPasseKeyPressed(evt);
            }
        });
        getContentPane().add(txtPalavraPasse, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 430, 310, -1));

        btnEntrar.setText("Entrar");
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEntrarMousePressed(evt);
            }
        });
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        btnEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEntrarKeyPressed(evt);
            }
        });
        getContentPane().add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 500, -1, -1));

        lblEsqueceuPalavraPasse.setForeground(new java.awt.Color(0, 153, 255));
        lblEsqueceuPalavraPasse.setText("Esqueceu a palavra passe?");
        lblEsqueceuPalavraPasse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEsqueceuPalavraPasse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEsqueceuPalavraPasseMousePressed(evt);
            }
        });
        getContentPane().add(lblEsqueceuPalavraPasse, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 460, -1, -1));

        lblImagemLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Ruf.jpg"))); // NOI18N
        getContentPane().add(lblImagemLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeUsuarioActionPerformed

    private void btnEntrarKeyPressed(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtPalavraPasse.getText().isEmpty()) {
                String nomeDeUsuario = txtNomeUsuario.getText();
                String senha = txtPalavraPasse.getText();
                if (this.logar(nomeDeUsuario, senha)) {
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Dados incorrectos, por favor verique e volte a tentar.");
                }
            }
        }
    }
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtPalavraPasseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPalavraPasseKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtPalavraPasse.getText().isEmpty()) {
                String nomeDeUsuario = txtNomeUsuario.getText();
                String senha = txtPalavraPasse.getText();
                if (this.logar(nomeDeUsuario, senha)) {
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Dados incorrectos, por favor verique e volte a tentar.");
                }
            }
        }

    }//GEN-LAST:event_txtPalavraPasseKeyPressed

    private void txtNomeUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeUsuarioKeyPressed
        // TODO add your handling code here:
        String nomeDeUsuario = txtNomeUsuario.getText();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (nomeDeUsuario.length() != 0) {
                txtPalavraPasse.requestFocus();
            }
        }
    }//GEN-LAST:event_txtNomeUsuarioKeyPressed

    private void btnEntrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMousePressed
        // TODO add your handling code here:
        if (!txtNomeUsuario.getText().isEmpty() && !txtPalavraPasse.getText().isEmpty()) {

            String nomeDeUsuario = txtNomeUsuario.getText();
            String senha = txtPalavraPasse.getText();

            if (this.logar(nomeDeUsuario, senha)) {
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Dados incorrectos, por favor verique e volte a tentar.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos!");
        }

    }//GEN-LAST:event_btnEntrarMousePressed

    private void lblEsqueceuPalavraPasseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEsqueceuPalavraPasseMousePressed
        // TODO add your handling code here:
        new TelaRecuperacaoSenha11().setVisible(true);
    }//GEN-LAST:event_lblEsqueceuPalavraPasseMousePressed

    private void txtNomeUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeUsuarioFocusLost
        // TODO add your handling code here:
        String nomeDeUsuario = txtNomeUsuario.getText();
        if (nomeDeUsuario.isEmpty()) {
            txtNomeUsuario.setBorder(new LineBorder(Color.RED));
        }
    }//GEN-LAST:event_txtNomeUsuarioFocusLost

    private void txtNomeUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeUsuarioFocusGained
        // TODO add your handling code here:
        String nomeDeUsuario = txtNomeUsuario.getText();
        if (nomeDeUsuario.isEmpty()) {
            txtNomeUsuario.setBorder(new LineBorder(Color.white));
        }

    }//GEN-LAST:event_txtNomeUsuarioFocusGained

    private void txtPalavraPasseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPalavraPasseFocusGained
        // TODO add your handling code here:
        txtPalavraPasse.setBorder(new LineBorder(Color.WHITE));
    }//GEN-LAST:event_txtPalavraPasseFocusGained

    private void txtPalavraPasseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPalavraPasseFocusLost
        // TODO add your handling code here:
        if (txtPalavraPasse.getText().isEmpty()) {
            txtPalavraPasse.setBorder(new LineBorder(Color.RED));
        }
    }//GEN-LAST:event_txtPalavraPasseFocusLost

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel lblEsqueceuPalavraPasse;
    private javax.swing.JLabel lblImagemLogin;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel lblPalavraPasse;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JPasswordField txtPalavraPasse;
    // End of variables declaration//GEN-END:variables
}