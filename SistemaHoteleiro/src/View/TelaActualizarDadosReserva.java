package View;

import connection.ConnectionFactory;
import controller.ReservaController;
import dao.ReservaJpaController;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Reserva;

/**
 *
 * @author Augusto Chissano
 */
public class TelaActualizarDadosReserva extends javax.swing.JFrame {

    private ReservaJpaController controllerReserva;
    private Reserva reserva;

    /**
     * Preenche a tabela com os registros da base de dados, recuperados pelo id.
     *
     * @param id parametro para buscar buscar registros na base de dados.
     */
    public void preencherCampos(Long id) {

        controllerReserva = new ReservaJpaController(ConnectionFactory.getEmf());
        reserva = controllerReserva.findReserva(id);

        lblId.setText(String.valueOf(id));
        txtNome.setText(reserva.getNome());
        txtCelular.setText(reserva.getCelular());
        txtEndereco.setText(reserva.getEndereco());
        txtEmail.setText(reserva.getEmail());
        txtNacionalidade.setText(reserva.getNacionalidade());
        txtNumerodeQuarto.setText(String.valueOf(reserva.getQuarto()));
        txtNrBi.setText(reserva.getNrBi());
        txtValordeReserva.setText(String.valueOf(reserva.getValor()));

    }

    /**
     * Creates new form TelaCadastroHospedes
     */
    public TelaActualizarDadosReserva() {
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

        panelCadastroCliente = new javax.swing.JPanel();
        jcbSexo = new javax.swing.JComboBox<>();
        lblNome = new javax.swing.JLabel();
        lblApelido = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblNacionalidade = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtNacionalidade = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblTelemovel = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblDataCheckIn = new javax.swing.JLabel();
        jdcDatadeCheckIn = new com.toedter.calendar.JDateChooser();
        lblDatadeNascimento = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        lblNumeroQuarto = new javax.swing.JLabel();
        txtNumerodeQuarto = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblTituloNoTopo = new javax.swing.JLabel();
        jdcDatadeNascimento = new com.toedter.calendar.JDateChooser();
        lblValorReserva = new javax.swing.JLabel();
        txtValordeReserva = new javax.swing.JTextField();
        txtNrBi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Check-in");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCadastroCliente.setBackground(new java.awt.Color(0, 82, 114));
        panelCadastroCliente.setForeground(new java.awt.Color(0, 51, 51));

        jcbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "Masculino", "Feminino" }));
        jcbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSexoActionPerformed(evt);
            }
        });

        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome:");

        lblApelido.setForeground(new java.awt.Color(255, 255, 255));
        lblApelido.setText("Endereço:");

        lblSexo.setForeground(new java.awt.Color(255, 255, 255));
        lblSexo.setText("Sexo:");

        lblNacionalidade.setForeground(new java.awt.Color(255, 255, 255));
        lblNacionalidade.setText("Nacionalidade:");

        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email:");

        lblTelemovel.setForeground(new java.awt.Color(255, 255, 255));
        lblTelemovel.setText("Telemóvel:");

        lblDataCheckIn.setForeground(new java.awt.Color(255, 255, 255));
        lblDataCheckIn.setText("Data de Check-in:");

        lblDatadeNascimento.setForeground(new java.awt.Color(255, 255, 255));
        lblDatadeNascimento.setText("Numero de BI");

        lblNumeroQuarto.setForeground(new java.awt.Color(255, 255, 255));
        lblNumeroQuarto.setText("Número do Quarto:");

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/arrow_refresh.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnActualizarMousePressed(evt);
            }
        });
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
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
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblTituloNoTopo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTituloNoTopo.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloNoTopo.setText("ACTUALIZAÇÃO DE DADOS DE RESERVAS");

        lblValorReserva.setForeground(new java.awt.Color(255, 255, 255));
        lblValorReserva.setText("Valor Pago:");

        txtValordeReserva.setEditable(false);

        jLabel1.setText("ID");

        lblId.setText("ID_Reserva");

        javax.swing.GroupLayout panelCadastroClienteLayout = new javax.swing.GroupLayout(panelCadastroCliente);
        panelCadastroCliente.setLayout(panelCadastroClienteLayout);
        panelCadastroClienteLayout.setHorizontalGroup(
            panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCadastroClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(334, 334, 334))
            .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(lblDatadeNascimento)
                    .addComponent(lblNacionalidade)
                    .addComponent(lblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApelido)
                    .addComponent(lblNome))
                .addGap(18, 18, 18)
                .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloNoTopo)
                    .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                        .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNacionalidade)
                            .addComponent(jcbSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEndereco)
                            .addComponent(txtNome)
                            .addComponent(jdcDatadeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNrBi))
                        .addGap(57, 57, 57)
                        .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmail)
                            .addComponent(lblDataCheckIn)
                            .addComponent(lblTelemovel)
                            .addComponent(lblNumeroQuarto)
                            .addComponent(lblValorReserva))
                        .addGap(18, 18, 18)
                        .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail)
                            .addComponent(jdcDatadeCheckIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCelular)
                            .addComponent(txtNumerodeQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValordeReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblId))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        panelCadastroClienteLayout.setVerticalGroup(
            panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblTituloNoTopo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblId))
                .addGap(18, 18, 18)
                .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome)
                    .addComponent(lblTelemovel)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                        .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApelido))
                        .addGap(20, 20, 20)
                        .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDataCheckIn)
                            .addComponent(lblSexo)))
                    .addGroup(panelCadastroClienteLayout.createSequentialGroup()
                        .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jdcDatadeCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNacionalidade)
                    .addComponent(lblNumeroQuarto)
                    .addComponent(txtNumerodeQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNrBi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDatadeNascimento)
                    .addComponent(lblValorReserva)
                    .addComponent(txtValordeReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jdcDatadeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(panelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnCancelar))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        getContentPane().add(panelCadastroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jcbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbSexoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMousePressed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarMousePressed

    private void btnActualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMousePressed
        // TODO add your handling code here:
        //Capturando e tratando os valores da tela
        Long id = Long.parseLong(lblId.getText());
        String nome = txtNome.getText();
        String celular = txtCelular.getText();
        String endereco = txtEndereco.getText();
        String email = txtEmail.getText();
        String genero = jcbSexo.getSelectedItem().toString();
        Date date = jdcDatadeCheckIn.getDate();
        LocalDate checkIn = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        String nacionalidade = txtNacionalidade.getText();
        Long quarto = Long.parseLong(txtNumerodeQuarto.getText());
        String nrBi = txtNrBi.getText();
        Double valor = Double.parseDouble(txtValordeReserva.getText());

        if (ReservaController.actualizar(id, nome, celular, endereco, email, genero, checkIn, nacionalidade, quarto, nrBi, valor)) {
            JOptionPane.showMessageDialog(null, "Dados actualizados com sucesso!");
            this.dispose();
            new TelaConsultaDeReservas11().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar actualizar dados!");
        }

    }//GEN-LAST:event_btnActualizarMousePressed

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
            java.util.logging.Logger.getLogger(TelaActualizarDadosReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaActualizarDadosReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaActualizarDadosReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaActualizarDadosReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaActualizarDadosReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> jcbSexo;
    private com.toedter.calendar.JDateChooser jdcDatadeCheckIn;
    private com.toedter.calendar.JDateChooser jdcDatadeNascimento;
    private javax.swing.JLabel lblApelido;
    private javax.swing.JLabel lblDataCheckIn;
    private javax.swing.JLabel lblDatadeNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNacionalidade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumeroQuarto;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelemovel;
    private javax.swing.JLabel lblTituloNoTopo;
    private javax.swing.JLabel lblValorReserva;
    private javax.swing.JPanel panelCadastroCliente;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNacionalidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNrBi;
    private javax.swing.JTextField txtNumerodeQuarto;
    private javax.swing.JTextField txtValordeReserva;
    // End of variables declaration//GEN-END:variables
}
