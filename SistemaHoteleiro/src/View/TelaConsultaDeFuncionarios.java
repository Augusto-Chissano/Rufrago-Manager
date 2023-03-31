package View;

import connection.ConnectionFactory;
import controller.FuncionarioController;
import dao.FuncionarioJpaController;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Funcionario;

/**
 *
 * @author Augusto Chissano
 */
public class TelaConsultaDeFuncionarios extends javax.swing.JFrame {

    /**
     *
     */
    public TelaDeActualizacaoDeDadosDeFuncionarios coringa = new TelaDeActualizacaoDeDadosDeFuncionarios();

    /**
     *
     */
    public Funcionario funcionario;
    private FuncionarioJpaController controllerFuncionario;
    private List<Funcionario> funcionarios;

    /**
     * Captura o primeiro valor da linha selecionada na tabela.
     *
     * @return primeiro valor na tabela correspondente ao ID.
     */
    public Long pegarId() {
        int linhaSelecionada = tblFuncionarios.getSelectedRow();
        if (linhaSelecionada == -1) {

        } else {
            Long id = Long.parseLong(tblFuncionarios.getValueAt(linhaSelecionada, 0).toString());
            return id;
        }
        return -1l;
    }

    /**
     * Preenche a tabela com os dados, recuperados a partir da base dados.
     */
    private void preencherTabela() {
        controllerFuncionario = new FuncionarioJpaController(ConnectionFactory.getEmf());
        String nome = txtPesquisa.getText();
        this.controllerFuncionario = new FuncionarioJpaController(ConnectionFactory.getEmf());
        funcionarios = controllerFuncionario.getFuncionarioByLikeNome(nome.trim());

        DefaultTableModel tabela = (DefaultTableModel) tblFuncionarios.getModel();
        tabela.setNumRows(0);
        for (Funcionario funcionario : funcionarios) {
            Object[] obj = new Object[]{
                funcionario.getId(),
                funcionario.getNome(),
                funcionario.getEndereco(),
                funcionario.getGenero(),
                funcionario.getNascimento(),
                funcionario.getNrBi(),
                funcionario.getNuit(),
                funcionario.getEmail(),
                funcionario.getContacto(),
                funcionario.getContactoAlternativo(),
                funcionario.getEstado()
            };
            tabela.addRow(obj);
        }
    }

    /**
     * Creates new form TelaConsultaDeFuncionarios
     */
    public TelaConsultaDeFuncionarios() {
        initComponents();
        preencherTabela();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncionarios = new javax.swing.JTable();
        lblPesquisar = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnActualizarDadosFuncionario = new javax.swing.JButton();
        btnRemoverFuncionario = new javax.swing.JButton();
        btnReadmitirFuncionario = new javax.swing.JButton();
        lblTextoNoTopo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Dados de Funcionários");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 82, 114));

        tblFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Morada", "Sexo", "Data de Nascimento", "Nr. de BI", "NUIT", "Email", "Contacto", "Contacto 2", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFuncionarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblFuncionarios);
        if (tblFuncionarios.getColumnModel().getColumnCount() > 0) {
            tblFuncionarios.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblFuncionarios.getColumnModel().getColumn(4).setPreferredWidth(120);
        }

        lblPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        lblPesquisar.setText("Nome:");

        txtPesquisa.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtPesquisaCaretUpdate(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/magnifier.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnActualizarDadosFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/user_edit.png"))); // NOI18N
        btnActualizarDadosFuncionario.setText("Actualizar Dados");
        btnActualizarDadosFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnActualizarDadosFuncionarioMousePressed(evt);
            }
        });

        btnRemoverFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/delete.png"))); // NOI18N
        btnRemoverFuncionario.setText("Remover Funcionário");
        btnRemoverFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRemoverFuncionarioMousePressed(evt);
            }
        });

        btnReadmitirFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/arrow_refresh.png"))); // NOI18N
        btnReadmitirFuncionario.setText("Readmitir");
        btnReadmitirFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnReadmitirFuncionarioMousePressed(evt);
            }
        });

        lblTextoNoTopo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTextoNoTopo.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoNoTopo.setText("CONSULTA DE DADOS DE FUNCIONÁRIOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 161, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTextoNoTopo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)))
                .addGap(146, 146, 146))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(btnActualizarDadosFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReadmitirFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRemoverFuncionario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(lblTextoNoTopo)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisar)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoverFuncionario)
                    .addComponent(btnActualizarDadosFuncionario)
                    .addComponent(btnReadmitirFuncionario))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtPesquisaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPesquisaCaretUpdate
        // TODO add your handling code here:
        preencherTabela();
    }//GEN-LAST:event_txtPesquisaCaretUpdate

    private void btnRemoverFuncionarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverFuncionarioMousePressed
        // TODO add your handling code here:
        if (FuncionarioController.demitirFuncionario(pegarId())) {
            JOptionPane.showMessageDialog(null, "Funcionario demitido!");
            preencherTabela();
        }

    }//GEN-LAST:event_btnRemoverFuncionarioMousePressed

    private void btnReadmitirFuncionarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReadmitirFuncionarioMousePressed
        // TODO add your handling code here:
        if (FuncionarioController.readmitirFuncionario(pegarId())) {
            JOptionPane.showMessageDialog(null, "Funcionario readmitido!");
            preencherTabela();
        }
    }//GEN-LAST:event_btnReadmitirFuncionarioMousePressed

    private void btnActualizarDadosFuncionarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarDadosFuncionarioMousePressed
        // TODO add your handling code here:
        if (this.pegarId() == -1) {
            JOptionPane.showMessageDialog(null, "Por favor selecione o funcionario para actualizar os dados!");
        } else {
            this.dispose();
            coringa.preencherCampos(this.pegarId());
            coringa.setVisible(true);

        }

    }//GEN-LAST:event_btnActualizarDadosFuncionarioMousePressed

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
            java.util.logging.Logger.getLogger(TelaConsultaDeFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaDeFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaDeFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaDeFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaDeFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarDadosFuncionario;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnReadmitirFuncionario;
    private javax.swing.JButton btnRemoverFuncionario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblTextoNoTopo;
    private javax.swing.JTable tblFuncionarios;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}