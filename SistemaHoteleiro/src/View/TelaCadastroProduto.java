package View;

import connection.ConnectionFactory;
import controller.ProdutoController;
import dao.ProdutoJpaController;
import java.awt.Color;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import model.Produto;
import org.apache.commons.lang3.StringUtils;
import validacoes.Validacao;

/**
 *
 * @author Augusto Chissano
 */
public class TelaCadastroProduto extends javax.swing.JFrame {

    private Produto produto;
    private ProdutoJpaController controllerProduto;
    private List<Produto> produtos;

    /**
     * Captura o primeiro valor da linha selecionada na tabela.
     *
     * @return primeiro valor na tabela correspondente ao ID.
     */
    public Long pegarId() {
        int linhaSelecionada = tblProdutos.getSelectedRow();
        if (linhaSelecionada == -1) {

        } else {
            Long id = Long.parseLong(tblProdutos.getValueAt(linhaSelecionada, 0).toString());
            return id;
        }
        return -1l;
    }

    /**
     * Preencher os campos na tela, com dados recuperados na base de dados a
     * partir do ID.
     *
     * @param id valor para efectuar uma pesquisa na base de dados.
     */
    public void preencherCampos(Long id) {
        produto = controllerProduto.findProduto(id);

        txtNomeDescricao.setText(produto.getDescricao());
        txtQuantidade.setText(String.valueOf(produto.getQuantidade()));
        txtPrecoVenda.setText(String.valueOf(produto.getPreco()));
        txtPrecoAquisicao.setText(String.valueOf(produto.getCusto()));

    }

    /**
     * Limpar os campos
     */
    private void limparCampos() {
        txtNomeDescricao.setText("");
        txtQuantidade.setText("");
        txtPrecoVenda.setText("");
        txtPrecoAquisicao.setText("");

    }

    /**
     * Preenche a tabela com os dados, recuperados a partir da base dados.
     */
    private void preencherTabela() {

        controllerProduto = new ProdutoJpaController(ConnectionFactory.getEmf());
        produtos = controllerProduto.findProdutoEntities();

        DefaultTableModel tabela = (DefaultTableModel) tblProdutos.getModel();
        tabela.setNumRows(0);
        for (Produto produto : produtos) {
            Object[] obj = new Object[]{
                produto.getId(),
                produto.getDescricao(),
                produto.getPreco(),
                produto.getValidade(),
                produto.getCusto(),
                produto.getQuantidade()
            };
            tabela.addRow(obj);
        }
    }

    /**
     * Creates new form TelaCadastroProduto
     */
    public TelaCadastroProduto() {
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
        lblTitulonoTopo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        lblNomeDescricao = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        lblPrecoVenda = new javax.swing.JLabel();
        txtNomeDescricao = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtPrecoVenda = new javax.swing.JTextField();
        lblValidade = new javax.swing.JLabel();
        jdcValidade = new com.toedter.calendar.JDateChooser();
        lblPrecoAquisicao = new javax.swing.JLabel();
        txtPrecoAquisicao = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 82, 114));

        lblTitulonoTopo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitulonoTopo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulonoTopo.setText("CADASTRO DE PRODUTOS");

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome/Descrição", "Preço de Venda", "Validade", "Preço de Aquisição", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProdutos.getTableHeader().setReorderingAllowed(false);
        tblProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblProdutosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblProdutos);

        lblNomeDescricao.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeDescricao.setText("Nome/Descrição:");

        lblQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantidade.setText("Quantidade:");

        lblPrecoVenda.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecoVenda.setText("Preço de Venda:");

        txtNomeDescricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeDescricaoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeDescricaoFocusLost(evt);
            }
        });

        txtQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQuantidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQuantidadeFocusLost(evt);
            }
        });

        txtPrecoVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecoVendaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecoVendaFocusLost(evt);
            }
        });

        lblValidade.setForeground(new java.awt.Color(255, 255, 255));
        lblValidade.setText("Validade:");

        lblPrecoAquisicao.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecoAquisicao.setText("Preço de Aquisição:");

        txtPrecoAquisicao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecoAquisicaoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecoAquisicaoFocusLost(evt);
            }
        });

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/add.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCadastrarMousePressed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/arrow_refresh.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnActualizarMousePressed(evt);
            }
        });

        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icons/cancel.png"))); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRemoverMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulonoTopo)
                .addGap(235, 235, 235))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblPrecoVenda)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrecoAquisicao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNomeDescricao, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtPrecoAquisicao)
                    .addComponent(txtPrecoVenda, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeDescricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValidade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblQuantidade, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtQuantidade)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemover))
                    .addComponent(jdcValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblTitulonoTopo)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNomeDescricao)
                        .addComponent(txtNomeDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblValidade))
                    .addComponent(jdcValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQuantidade)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadastrar)
                            .addComponent(btnActualizar)
                            .addComponent(btnRemover)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecoVenda)
                            .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecoAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecoAquisicao))))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMousePressed
        // TODO add your handling code here:
        if (!txtNomeDescricao.getText().isEmpty() && !txtPrecoAquisicao.getText().isEmpty() && !txtPrecoVenda.getText().isEmpty() && !txtQuantidade.getText().isEmpty()) {
            String descricao = txtNomeDescricao.getText();
            Integer quantidade = Integer.parseInt(txtQuantidade.getText());
            Double preco = Double.parseDouble(txtPrecoVenda.getText());
            Double custo = Double.parseDouble(txtPrecoAquisicao.getText());
            Date date = jdcValidade.getDate();
            LocalDate validade = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            if (ProdutoController.cadastrar(descricao, quantidade, preco, custo, validade)) {
                JOptionPane.showMessageDialog(null, "Produto adicionado");
                limparCampos();
                preencherTabela();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao adicionar produto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos");
        }
    }//GEN-LAST:event_btnCadastrarMousePressed

    private void btnActualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMousePressed
        // TODO add your handling code here:

        if (pegarId() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um registro");
        } else {

            String descricao = txtNomeDescricao.getText();
            Integer quantidade = Integer.parseInt(txtQuantidade.getText());
            Double preco = Double.parseDouble(txtPrecoVenda.getText());
            Double custo = Double.parseDouble(txtPrecoAquisicao.getText());
            Date date = jdcValidade.getDate();
            LocalDate validade = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            if (ProdutoController.actualizar(pegarId(), descricao, quantidade, preco, custo, validade)) {
                JOptionPane.showMessageDialog(null, "Dados actualizados com sucesso!!");
                limparCampos();
                preencherTabela();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao actualizar produto");
            }

        }
    }//GEN-LAST:event_btnActualizarMousePressed

    private void tblProdutosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutosMousePressed
        // TODO add your handling code here:
        preencherCampos(pegarId());
    }//GEN-LAST:event_tblProdutosMousePressed

    private void btnRemoverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverMousePressed
        // TODO add your handling code here:
        if (pegarId() == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um registro");
        } else {
            if (ProdutoController.remover(pegarId())) {
                JOptionPane.showMessageDialog(null, "Produto removido");
                limparCampos();
                preencherTabela();
            }
        }
    }//GEN-LAST:event_btnRemoverMousePressed

    private void btnCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_btnCadastrarMouseEntered

    private void txtNomeDescricaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeDescricaoFocusLost
        // TODO add your handling code here:
        if (!Validacao.validarTexto(txtNomeDescricao.getText())) {
            txtNomeDescricao.setBorder(new LineBorder(Color.red));
        }
    }//GEN-LAST:event_txtNomeDescricaoFocusLost

    private void txtNomeDescricaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeDescricaoFocusGained
        // TODO add your handling code here:
        txtNomeDescricao.setBorder(new LineBorder(Color.white));
    }//GEN-LAST:event_txtNomeDescricaoFocusGained

    private void txtPrecoVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoVendaFocusLost
        // TODO add your handling code here:
        if (!StringUtils.isNumeric(txtPrecoVenda.getText())) {
            txtPrecoVenda.setBorder(new LineBorder(Color.red));
        }
    }//GEN-LAST:event_txtPrecoVendaFocusLost

    private void txtPrecoVendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoVendaFocusGained
        // TODO add your handling code here:
        txtPrecoVenda.setBorder(new LineBorder(Color.white));
    }//GEN-LAST:event_txtPrecoVendaFocusGained

    private void txtPrecoAquisicaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoAquisicaoFocusLost
        // TODO add your handling code here:
        if (!StringUtils.isNumeric(txtPrecoAquisicao.getText())) {
            txtPrecoAquisicao.setBorder(new LineBorder(Color.red));
        }
    }//GEN-LAST:event_txtPrecoAquisicaoFocusLost

    private void txtPrecoAquisicaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoAquisicaoFocusGained
        // TODO add your handling code here:
        txtPrecoAquisicao.setBorder(new LineBorder(Color.white));
    }//GEN-LAST:event_txtPrecoAquisicaoFocusGained

    private void txtQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantidadeFocusLost
        // TODO add your handling code here:
        if (!StringUtils.isNumeric(txtQuantidade.getText())) {
            txtQuantidade.setBorder(new LineBorder(Color.red));
        }
    }//GEN-LAST:event_txtQuantidadeFocusLost

    private void txtQuantidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantidadeFocusGained
        // TODO add your handling code here:

        txtQuantidade.setBorder(new LineBorder(Color.white));
    }//GEN-LAST:event_txtQuantidadeFocusGained

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
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcValidade;
    private javax.swing.JLabel lblNomeDescricao;
    private javax.swing.JLabel lblPrecoAquisicao;
    private javax.swing.JLabel lblPrecoVenda;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblTitulonoTopo;
    private javax.swing.JLabel lblValidade;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtNomeDescricao;
    private javax.swing.JTextField txtPrecoAquisicao;
    private javax.swing.JTextField txtPrecoVenda;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}