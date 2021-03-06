/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projetoindividual;

import java.awt.Color;

/**
 *
 * @author marce
 */
public class projetoOp2 extends javax.swing.JFrame {

    /**
     * Creates new form projetoOp2
     */
    public projetoOp2() {
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

        lblValorGasto = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        lblKwh = new javax.swing.JLabel();
        tfKwh = new javax.swing.JTextField();
        lblTipoCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taResultado = new javax.swing.JTextArea();
        btnCalcular = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cbTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        lblValorGasto.setForeground(new java.awt.Color(0, 0, 0));
        lblValorGasto.setText("VALOR GASTO DE ENERGIA MENSALMENTE ");

        tfValor.setBackground(new java.awt.Color(255, 255, 255));
        tfValor.setForeground(new java.awt.Color(0, 0, 0));

        lblKwh.setForeground(new java.awt.Color(0, 0, 0));
        lblKwh.setText("CONSUMO MENSAL DE ENERGIA EM KWH");

        tfKwh.setBackground(new java.awt.Color(255, 255, 255));
        tfKwh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfKwhActionPerformed(evt);
            }
        });

        lblTipoCliente.setForeground(new java.awt.Color(0, 0, 0));
        lblTipoCliente.setText("TIPO DE CLIENTE ");

        taResultado.setColumns(20);
        taResultado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        taResultado.setForeground(new java.awt.Color(0, 0, 0));
        taResultado.setRows(5);
        taResultado.setFocusable(false);
        jScrollPane1.setViewportView(taResultado);

        btnCalcular.setBackground(new java.awt.Color(255, 0, 51));
        btnCalcular.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(0, 0, 0));
        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Eras Medium ITC", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CALCULADORA");

        cbTipo.setBackground(new java.awt.Color(255, 255, 255));
        cbTipo.setForeground(new java.awt.Color(0, 0, 0));
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE UMA OPÇÃO", "1", "2", "3" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorGasto)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cbTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfValor, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfKwh, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTipoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblKwh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 3, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValorGasto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(lblKwh)
                        .addGap(15, 15, 15)
                        .addComponent(tfKwh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTipoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcular))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfKwhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfKwhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfKwhActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
       taResultado.setText("");
       Double valorAtual = Double.valueOf(tfValor.getText());
       Double kwhAtual = Double.valueOf(tfKwh.getText());  
       
       
       
       if (cbTipo.getSelectedItem().equals("SELECIONE UMA OPÇÃO")){
        taResultado.append("Selecione uma opção válida \n");
       }
       else if(cbTipo.getSelectedItem().equals("1")){
        btnCalcular.setBackground(Color.green);
        Double valorEconomizado =  valorAtual * 0.25;
        Double kwhEconomizado = kwhAtual * 0.3;
        Double valorFinal = valorAtual - valorEconomizado;
        Double kwhFinal = kwhAtual - kwhEconomizado;
        Double valorPorcentagem= (valorEconomizado * 100) / valorAtual;
        Double valorPorcentagemKwh= (kwhEconomizado * 100) / kwhAtual;  
        
        taResultado.append(String.format("VALOR ATUAL: %.2f \n"
                + "KWH ATUAL: %.2f \n"
                + "======================================\n"
                + "Com a nossa solução:\n"
                + "VALOR: %.2f \n"
                + "KWH: %.1f \n"
                + "Economia no valor: %.1f%% \n"
                + "Economia de KWH: %.1f%% \n"
                + "Valor economia anual: %.2f \n"
                + "KWH economia anual: %.1f",
                valorAtual, kwhAtual, valorFinal, kwhFinal, valorPorcentagem,
                valorPorcentagemKwh, valorFinal*12, kwhFinal*12));
       }
       else if(cbTipo.getSelectedItem().equals("2")){
        btnCalcular.setBackground(Color.green);
        Double valorEconomizado =  valorAtual * 0.20;
        Double kwhEconomizado = kwhAtual * 0.25;
        Double valorFinal = valorAtual - valorEconomizado;
        Double kwhFinal = kwhAtual - kwhEconomizado;
        Double valorPorcentagem= (valorEconomizado * 100) / valorAtual;
        Double valorPorcentagemKwh= (kwhEconomizado * 100) / kwhAtual;  
        
        taResultado.append(String.format("VALOR ATUAL: %.2f \n"
                + "KWH ATUAL: %.2f \n"
                + "======================================\n"
                + "Com a nossa solução:\n"
                + "VALOR: %.2f \n"
                + "KWH: %.1f \n"
                + "Economia no valor: %.1f%% \n"
                + "Economia de KWH: %.1f%% \n"
                + "Valor economia anual: %.2f \n"
                + "KWH economia anual: %.1f",
                valorAtual, kwhAtual, valorFinal, kwhFinal, valorPorcentagem,
                valorPorcentagemKwh, valorFinal*12, kwhFinal*12));
       }
       else{
        btnCalcular.setBackground(Color.green);
        Double valorEconomizado =  valorAtual * 0.15;
        Double kwhEconomizado = kwhAtual * 0.20;
        Double valorFinal = valorAtual - valorEconomizado;
        Double kwhFinal = kwhAtual - kwhEconomizado;
        Double valorPorcentagem= (valorEconomizado * 100) / valorAtual;
        Double valorPorcentagemKwh= (kwhEconomizado * 100) / kwhAtual;  
        
        taResultado.append(String.format("VALOR ATUAL: %.2f \n"
                + "KWH ATUAL: %.2f \n"
                + "======================================\n"
                + "Com a nossa solução:\n"
                + "VALOR: %.2f \n"
                + "KWH: %.1f \n"
                + "Economia no valor: %.1f%% \n"
                + "Economia de KWH: %.1f%% \n"
                + "Valor economia anual: %.2f \n"
                + "KWH economia anual: %.1f",
                valorAtual, kwhAtual, valorFinal, kwhFinal, valorPorcentagem,
                valorPorcentagemKwh, valorFinal*12, kwhFinal*12));
    }//GEN-LAST:event_btnCalcularActionPerformed
    }
       
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
            java.util.logging.Logger.getLogger(projetoOp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(projetoOp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(projetoOp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(projetoOp2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new projetoOp2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblKwh;
    private javax.swing.JLabel lblTipoCliente;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValorGasto;
    private javax.swing.JTextArea taResultado;
    private javax.swing.JTextField tfKwh;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
