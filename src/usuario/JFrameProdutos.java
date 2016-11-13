package usuario;

import banco.Banco;
import dados.Produto;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utilitarios.LtpUtil;
import utilitarios.LtpUtilException;

/**
 * Classe do JFrameProdutos
 * @author Natasha
 * @since 12/11/16
 * @version 1.1
 */
public class JFrameProdutos extends javax.swing.JFrame {

    /**
     * Método que cria um novo jFrame
     * @author Natasha Kaweski
     * @since 12/11/16
     * @version 1.0
     */
    public JFrameProdutos() {
        initComponents();
        this.setSize( 600, 400 );
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneProdutos = new javax.swing.JTabbedPane();
        jPanelPesquisar = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jButtonPesquisarCodigo = new javax.swing.JButton();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonPesquisarNome = new javax.swing.JButton();
        jScrollPanePesquisaProdutos = new javax.swing.JScrollPane();
        jTablePesquisaProdutos = new javax.swing.JTable();
        jPanelncluir = new javax.swing.JPanel();
        jLabelIncluirNome = new javax.swing.JLabel();
        jTextFieldIncluirNome = new javax.swing.JTextField();
        jLabelIncluirCodUnidade = new javax.swing.JLabel();
        jTextFieldIncluirCodUnidade = new javax.swing.JTextField();
        jLabelIncluirPreco = new javax.swing.JLabel();
        jTextFieldIncluirPreco = new javax.swing.JTextField();
        jLabelExemplo = new javax.swing.JLabel();
        jLabelIncluirProduto = new javax.swing.JLabel();
        jButtonIncluir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelAlterarProduto = new javax.swing.JLabel();
        jLabelAlterarCodigo = new javax.swing.JLabel();
        jTextFieldAlterarCodigo = new javax.swing.JTextField();
        jButtonBuscarCodPraAlterar = new javax.swing.JButton();
        jLabelAlterarNome = new javax.swing.JLabel();
        jTextFieldAlterarNome = new javax.swing.JTextField();
        jLabelAlterarPreco = new javax.swing.JLabel();
        jTextFieldAlterarPreco = new javax.swing.JTextField();
        jButtonAlterar = new javax.swing.JButton();
        jLabelAlterarUnidade = new javax.swing.JLabel();
        jTextFieldAlterarUnidade = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));

        jLabelCodigo.setText("Código");

        jButtonPesquisarCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario/imagens/search.png"))); // NOI18N
        jButtonPesquisarCodigo.setBorder(null);
        jButtonPesquisarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarCodigoActionPerformed(evt);
            }
        });

        jLabelNome.setText("Nome");

        jButtonPesquisarNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario/imagens/search.png"))); // NOI18N
        jButtonPesquisarNome.setBorder(null);
        jButtonPesquisarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarNomeActionPerformed(evt);
            }
        });

        jTablePesquisaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPanePesquisaProdutos.setViewportView(jTablePesquisaProdutos);

        javax.swing.GroupLayout jPanelPesquisarLayout = new javax.swing.GroupLayout(jPanelPesquisar);
        jPanelPesquisar.setLayout(jPanelPesquisarLayout);
        jPanelPesquisarLayout.setHorizontalGroup(
            jPanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPanePesquisaProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                    .addGroup(jPanelPesquisarLayout.createSequentialGroup()
                        .addComponent(jLabelCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisarCodigo)
                        .addGap(53, 53, 53)
                        .addComponent(jLabelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNome)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisarNome)))
                .addContainerGap())
        );
        jPanelPesquisarLayout.setVerticalGroup(
            jPanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPesquisarNome)
                    .addGroup(jPanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCodigo)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonPesquisarCodigo))
                    .addGroup(jPanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelNome)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPanePesquisaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jTabbedPaneProdutos.addTab("Pesquisar", jPanelPesquisar);

        jLabelIncluirNome.setText("Nome do Produto");

        jLabelIncluirCodUnidade.setText("Código da Unidade");

        jLabelIncluirPreco.setText("Preço do Produto");

        jLabelExemplo.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabelExemplo.setText("Exemplo: 9.99 ou 1000.90");

        jLabelIncluirProduto.setText("Incluir");

        jButtonIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario/imagens/add.png"))); // NOI18N
        jButtonIncluir.setText("Incluir");
        jButtonIncluir.setBorder(null);
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });

        jLabelAlterarProduto.setText("Alterar");

        jLabelAlterarCodigo.setText("Código do Produto");

        jButtonBuscarCodPraAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario/imagens/search.png"))); // NOI18N
        jButtonBuscarCodPraAlterar.setBorder(null);
        jButtonBuscarCodPraAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarCodPraAlterarActionPerformed(evt);
            }
        });

        jLabelAlterarNome.setText("Nome");

        jLabelAlterarPreco.setText("Preço");

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario/imagens/pencil.png"))); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setBorder(null);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jLabelAlterarUnidade.setText("Código da Unidade");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario/imagens/close.png"))); // NOI18N
        jButton1.setText("Excluir");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelncluirLayout = new javax.swing.GroupLayout(jPanelncluir);
        jPanelncluir.setLayout(jPanelncluirLayout);
        jPanelncluirLayout.setHorizontalGroup(
            jPanelncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelncluirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanelncluirLayout.createSequentialGroup()
                        .addComponent(jLabelIncluirCodUnidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldIncluirCodUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelIncluirPreco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelncluirLayout.createSequentialGroup()
                                .addComponent(jLabelExemplo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldIncluirPreco)))
                    .addGroup(jPanelncluirLayout.createSequentialGroup()
                        .addComponent(jLabelIncluirNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldIncluirNome))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelncluirLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonIncluir))
                    .addGroup(jPanelncluirLayout.createSequentialGroup()
                        .addComponent(jLabelAlterarCodigo)
                        .addGap(67, 67, 67)
                        .addComponent(jLabelAlterarNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAlterarNome))
                    .addGroup(jPanelncluirLayout.createSequentialGroup()
                        .addComponent(jTextFieldAlterarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBuscarCodPraAlterar)
                        .addGroup(jPanelncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelncluirLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabelAlterarUnidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAlterarUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addComponent(jLabelAlterarPreco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAlterarPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelncluirLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAlterar))))
                    .addGroup(jPanelncluirLayout.createSequentialGroup()
                        .addGroup(jPanelncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIncluirProduto)
                            .addComponent(jLabelAlterarProduto))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelncluirLayout.setVerticalGroup(
            jPanelncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelncluirLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabelIncluirProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIncluirNome)
                    .addComponent(jTextFieldIncluirNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIncluirCodUnidade)
                    .addComponent(jTextFieldIncluirCodUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIncluirPreco)
                    .addComponent(jTextFieldIncluirPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelExemplo)
                .addGap(8, 8, 8)
                .addComponent(jButtonIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAlterarProduto)
                .addGap(11, 11, 11)
                .addGroup(jPanelncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAlterarCodigo)
                    .addComponent(jTextFieldAlterarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAlterarNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAlterarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarCodPraAlterar)
                    .addGroup(jPanelncluirLayout.createSequentialGroup()
                        .addGroup(jPanelncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAlterarUnidade)
                            .addComponent(jTextFieldAlterarUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAlterarPreco)
                            .addComponent(jTextFieldAlterarPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAlterar)
                            .addComponent(jButton1))))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jTabbedPaneProdutos.addTab("Incluir e Alterar", jPanelncluir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneProdutos)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneProdutos)
        );

        getAccessibleContext().setAccessibleName("Produtos");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Método que pesquisa produto pelo código
     * @author Natasha Kaweski
     * @since 12/11/16
     * @version 1.0
     * @param evt 
     */
    private void jButtonPesquisarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarCodigoActionPerformed
        // Captura o que foi digitado no campo de texto de código
        String codigo = jTextFieldCodigo.getText();
        
        // Validação
        if ( codigo.isEmpty() || !codigo.matches("[0-9]{1,5}") ) {
            JOptionPane.showMessageDialog(this, "O código deve conter apenas números.");
            return;
        }
        
        // Checkpoint!
        try {
            ResultSet resposta = banco.Banco.pesquisarClienteCodigo(Integer.parseInt(codigo));
            
            if ( resposta.next() ) {
                LtpUtil.loadFormatJTable(jScrollPanePesquisaProdutos, banco.Banco.pesquisarProdutoCodigo(Integer.parseInt(codigo)),false);
            } else {
                JOptionPane.showMessageDialog(this, "Não existe produto para o código digitado.");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (LtpUtilException ex) {
            Logger.getLogger(JFrameCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonPesquisarCodigoActionPerformed
    
    /**
     * Método que pesquisa produto pelo nome
     * @author Natasha Kaweski
     * @since 12/11/16
     * @version 1.1
     * @param evt 
     */
    private void jButtonPesquisarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarNomeActionPerformed
        // Captura o que foi digitado no campo de texto de nome
        String nome = jTextFieldNome.getText().toUpperCase();
        
        // Validação
        if ( nome.isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Nome inválido.");
            return;
        }
        
        // Checkpoint!
        try {
            ResultSet resposta = banco.Banco.pesquisarProdutoNome(nome);
            
            if ( resposta.next() ) LtpUtil.loadFormatJTable(jScrollPanePesquisaProdutos, banco.Banco.pesquisarProdutoNome(jTextFieldNome.getText()),false);
            else JOptionPane.showMessageDialog(this, "Não existe produto para o nome digitado.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (LtpUtilException ex) {
            Logger.getLogger(JFrameCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonPesquisarNomeActionPerformed
    
    /**
     * Método que cadastra um novo produto
     * @author Natasha Kaweski
     * @since 12/11/16
     * @version 1.0
     * @param evt 
     */
    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
       // Declaração das variáveis
        int codigo = 0;
        String nome = jTextFieldIncluirNome.getText().toUpperCase();
        String codigoUnidade = jTextFieldIncluirCodUnidade.getText();
        double preco = 0;
        String erro = "";
        Date dataPreco = new Date(System.currentTimeMillis());
        
        // Validação dos dados do Cliente
        if ( nome.isEmpty() )
            erro = "Nome inválido.\n";
        
        try {
            preco = Double.parseDouble(jTextFieldIncluirPreco.getText().replace(",", "."));
            if (preco <= 0) {
                jTextFieldIncluirPreco.requestFocus();
                erro += "Preço inválido.\n";
            }
        } catch (NumberFormatException e) {
            jTextFieldIncluirPreco.requestFocus();
            JOptionPane.showMessageDialog(this, e.getMessage());
        } 
        
//        if ( codigoUnidade <= 0 )
//            erro += "Código da unidade inválido.\n";
        
        // Janela contendo os erros encontrados na validação do formulário
        if ( !erro.isEmpty() ) {
            JOptionPane.showMessageDialog(this, erro + ' ' + nome);
        
        // Caso contrário, tenta inserir os dados no banco
        } else {
            Produto produto = new Produto(codigo, nome, Integer.parseInt(codigoUnidade), preco, dataPreco);
            
            try {
                Banco.incluirProduto(produto);
                JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso.");
                
                // Limpa o campo de nome
                jTextFieldIncluirNome.setText("");
                jTextFieldIncluirCodUnidade.setText("");
                jTextFieldIncluirPreco.setText("");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_jButtonIncluirActionPerformed
    
    /**
     * Método que busca um produto pelo código e insere seu nome no campo de nome do formulário
     * @author Natasha Kaweski
     * @since 13/11/16
     * @version 1.0
     * @param evt 
     */
    private void jButtonBuscarCodPraAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarCodPraAlterarActionPerformed
        // Captura o que foi digitado no campo de texto de código
        String codigo = jTextFieldAlterarCodigo.getText();
        
        // Validação
        if ( codigo.isEmpty() || !codigo.matches("[0-9]{1,5}") ) {
            JOptionPane.showMessageDialog(this, "O código deve conter apenas números.");
            return;
        }
        
        // Checkpoint!
        try {
            ResultSet resposta = banco.Banco.pesquisarProdutoCodigo(Integer.parseInt(codigo));
            
            if ( resposta.next() ) {
                jTextFieldAlterarNome.setText( resposta.getNString("PRODUTO") );
                jTextFieldAlterarPreco.setText( resposta.getNString("PRECO") );
                jTextFieldAlterarUnidade.setText( resposta.getNString("CODUNIDADE") );
            }
            else JOptionPane.showMessageDialog(this, "Não existe produto para o código digitado.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonBuscarCodPraAlterarActionPerformed
    
    /**
     * Método que altera um produto já cadastrado
     * @author Natasha Kaweski
     * @since 13/11/16
     * @version 1.0
     * @param evt 
     */
    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // Captura o que foi digitado no campo de texto de código
        String codigo = jTextFieldAlterarCodigo.getText();
        
        // Validação do campo do código
        if ( codigo.isEmpty() || !codigo.matches("[0-9]{1,5}") ) {
            JOptionPane.showMessageDialog(this, "O código deve conter apenas números.");
            return;
        } 
        
        // Checkpoint!
        try {
            ResultSet resposta = banco.Banco.pesquisarProdutoCodigo(Integer.parseInt(codigo));
            
            if ( resposta.next() ) {
        
                // Declaração das variáveis
                String nome = jTextFieldAlterarNome.getText().toUpperCase();
                String codigoUnidade = jTextFieldAlterarUnidade.getText();
                double preco = 0;
                String erro = "";
                Date dataPreco = new Date(System.currentTimeMillis());
        
                // Validação dos dados do Cliente
                if ( nome.isEmpty() )
                    erro = "Nome inválido.\n";

                try {
                    preco = Double.parseDouble(jTextFieldAlterarPreco.getText().replace(",", "."));
                    if (preco <= 0) {
                        jTextFieldAlterarPreco.requestFocus();
                        erro += "Preço inválido.\n";
                    }
                } catch (NumberFormatException e) {
                    jTextFieldAlterarPreco.requestFocus();
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
        
//                if ( codigoUnidade <= 0 )
//                    erro += "Código da unidade inválido.\n";

                // Janela contendo os erros encontrados na validação do formulário
                if ( !erro.isEmpty() ) {
                    JOptionPane.showMessageDialog(this, erro + ' ' + nome);

                // Caso contrário, tenta inserir os dados no banco
                } else {
                    Produto produto = new Produto(Integer.parseInt(codigo), nome, Integer.parseInt(codigoUnidade), preco, dataPreco);

                    try {
                        Banco.alterarProduto(produto);
                        JOptionPane.showMessageDialog(this, "Produto alterado com sucesso.");
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(this, e.getMessage());
                    }
                }
                
            } else {
                JOptionPane.showMessageDialog(this, "Não existe cliente para o código digitado.");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed
    
    /**
     * Método que exclui um produto do banco
     * @author Natasha Kaweski
     * @since 13/11/16
     * @version 1.0
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Pega o cliente com o código informado
        String codigo = jTextFieldAlterarCodigo.getText();
        
        // Validação
        if ( codigo.isEmpty() || !codigo.matches("[0-9]{1,5}") ) {
            JOptionPane.showMessageDialog(this, "O código deve conter apenas números.");
            return;
        }
        
        int reply = JOptionPane.showConfirmDialog(null, "Confirmar exclusão?", "Deletar vendedor", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            try {
                banco.Banco.excluirVendedor(Integer.parseInt(codigo));
                JOptionPane.showMessageDialog(this, "Produto excluído.");
                
                jTextFieldAlterarCodigo.setText("");
                jTextFieldAlterarNome.setText("");
                jTextFieldAlterarUnidade.setText("");
                jTextFieldAlterarPreco.setText("");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscarCodPraAlterar;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonPesquisarCodigo;
    private javax.swing.JButton jButtonPesquisarNome;
    private javax.swing.JLabel jLabelAlterarCodigo;
    private javax.swing.JLabel jLabelAlterarNome;
    private javax.swing.JLabel jLabelAlterarPreco;
    private javax.swing.JLabel jLabelAlterarProduto;
    private javax.swing.JLabel jLabelAlterarUnidade;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelExemplo;
    private javax.swing.JLabel jLabelIncluirCodUnidade;
    private javax.swing.JLabel jLabelIncluirNome;
    private javax.swing.JLabel jLabelIncluirPreco;
    private javax.swing.JLabel jLabelIncluirProduto;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanelPesquisar;
    private javax.swing.JPanel jPanelncluir;
    private javax.swing.JScrollPane jScrollPanePesquisaProdutos;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPaneProdutos;
    private javax.swing.JTable jTablePesquisaProdutos;
    private javax.swing.JTextField jTextFieldAlterarCodigo;
    private javax.swing.JTextField jTextFieldAlterarNome;
    private javax.swing.JTextField jTextFieldAlterarPreco;
    private javax.swing.JTextField jTextFieldAlterarUnidade;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldIncluirCodUnidade;
    private javax.swing.JTextField jTextFieldIncluirNome;
    private javax.swing.JTextField jTextFieldIncluirPreco;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}