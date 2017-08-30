/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppoupex;

import java.text.DecimalFormat;

/**
 *
 * @author Fabiano
 */
public class TelaPoupex extends javax.swing.JFrame {

    /**
     * Creates new form TelaPoupex
     */
    public TelaPoupex() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTexT_Juros = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jText_Anos = new javax.swing.JTextField();
        jText_Deposito = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jText_TotalPoupado = new javax.swing.JTextField();
        jButton_OK = new javax.swing.JButton();
        jButton_Limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("App Poupex");
        setBackground(new java.awt.Color(51, 51, 255));
        setResizable(false);

        jLabel1.setText("Desenvolvido por Fabiano Dolzanes");

        jLabel2.setText("Juros ao mês (%) :");

        jTexT_Juros.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel3.setText("Números de Anos: ");

        jLabel4.setText("Depósito Mensal (R$):");

        jText_Anos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jText_Deposito.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel5.setText("Total Poupado (R$): ");

        jText_TotalPoupado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jText_TotalPoupado.setEnabled(false);

        jButton_OK.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_OK.setText("OK");
        jButton_OK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_OKMouseClicked(evt);
            }
        });

        jButton_Limpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_Limpar.setText("Limpar");
        jButton_Limpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_LimparMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jText_Anos)
                            .addComponent(jTexT_Juros, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_OK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_TotalPoupado)
                            .addComponent(jButton_Limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jText_Deposito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTexT_Juros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jText_Anos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jText_Deposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_OK)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jText_TotalPoupado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Limpar)
                        .addGap(33, 33, 33)))
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_OKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_OKMouseClicked
        // pega o valor declarado no texto 
        String Sjuros = jTexT_Juros.getText();
        // converte String para int
        int juros = Integer.parseInt(Sjuros);
        
        // pega o valor declarado no texto 
        String Sano = jText_Anos.getText(); 
        // converte String para int
        int ano = Integer.parseInt(Sano); 
        
        // pega o valor declarado no texto 
        String Sdeposito = jText_Deposito.getText();
        // converte String para int
        int deposito = Integer.parseInt(Sdeposito);
        
        // no objeto poupanca, faço a declaracao das variaveis 
        Poupanca poupanca = new Poupanca(ano, juros, deposito);
        // a funcao ResultadoTotal() vai realizar o calcular e retornar o resultado. 
        double dresult = poupanca.ResultadoTotal();
                
        DecimalFormat df = new DecimalFormat("0.00");
        
        //Imprimir o resultado na Tela...
        jText_TotalPoupado.setText(df.format(dresult));
    
    }//GEN-LAST:event_jButton_OKMouseClicked

    private void jButton_LimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_LimparMouseClicked
        // Limpa Tela...
        jTexT_Juros.setText("");
        jText_Anos.setText("");
        jText_Deposito.setText("");
        jText_TotalPoupado.setText("");
    }//GEN-LAST:event_jButton_LimparMouseClicked

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
            java.util.logging.Logger.getLogger(TelaPoupex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPoupex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPoupex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPoupex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPoupex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Limpar;
    private javax.swing.JButton jButton_OK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTexT_Juros;
    private javax.swing.JTextField jText_Anos;
    private javax.swing.JTextField jText_Deposito;
    private javax.swing.JTextField jText_TotalPoupado;
    // End of variables declaration//GEN-END:variables
}
