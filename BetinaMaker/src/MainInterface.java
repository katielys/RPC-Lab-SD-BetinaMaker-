
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Katiely
 */
public class MainInterface extends javax.swing.JFrame {

    /**
     * Creates new form MainInterface
     */
    public MainInterface() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCalc = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblValorInicial = new javax.swing.JLabel();
        lblvDesejado = new javax.swing.JLabel();
        lblyear = new javax.swing.JLabel();
        jftxtVInicial = new javax.swing.JFormattedTextField();
        jtxtVF = new javax.swing.JFormattedTextField();
        jtxtAno = new javax.swing.JFormattedTextField();
        imagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BetinaMaker");
        setBackground(new java.awt.Color(234, 252, 234));
        setForeground(new java.awt.Color(231, 245, 244));
        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(20, 30));
        setName("frmBetina"); // NOI18N

        btnCalc.setBackground(new java.awt.Color(51, 255, 204));
        btnCalc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCalc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/calcu64.png"))); // NOI18N
        btnCalc.setText("Calcular");
        btnCalc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalcMouseClicked(evt);
            }
        });
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 255, 255));
        btnReset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/reset64.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.setToolTipText("Clique aqui para resetar");
        btnReset.setName("btnReset"); // NOI18N
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lblValorInicial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblValorInicial.setText("Valor Inicial:");

        lblvDesejado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblvDesejado.setText("Valor Desejado:");

        lblyear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblyear.setText("Anos:");

        jftxtVInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jftxtVInicial.setText("15000");
        jftxtVInicial.setToolTipText("Digite aqui o valor que deseja investir");
        jftxtVInicial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jftxtVInicial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jftxtVInicialFocusGained(evt);
            }
        });
        jftxtVInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftxtVInicialActionPerformed(evt);
            }
        });

        jtxtVF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jtxtVF.setText("1040200");
        jtxtVF.setToolTipText("Insira aqui o valor que deseja adquirir ");
        jtxtVF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtVF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtVFFocusGained(evt);
            }
        });
        jtxtVF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtVFActionPerformed(evt);
            }
        });

        jtxtAno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jtxtAno.setText("36");
        jtxtAno.setToolTipText("");
        jtxtAno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtAno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtAnoFocusGained(evt);
            }
        });

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8-expensive-price-64.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnReset)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imagen)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValorInicial)
                            .addComponent(lblyear)
                            .addComponent(lblvDesejado))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnCalc))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtxtVF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(jtxtAno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jftxtVInicial, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(0, 38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValorInicial)
                            .addComponent(jftxtVInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtVF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblvDesejado))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblyear)
                            .addComponent(jtxtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnCalc))
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jftxtVInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftxtVInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftxtVInicialActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCalcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcMouseClicked
        String ano =jtxtAno.getText();
        String vf = jtxtVF.getText();
        String vI = jftxtVInicial.getText();
        
        //verificação se os valores são nulos ou fazem sentido (ex. nao existe ano negativo)
        if(ano.isEmpty()|| Integer.valueOf(ano)<1){
            jtxtAno.setBackground(Color.red);
            jtxtAno.setText("1");
            JOptionPane.showMessageDialog(rootPane,"Por favor preencha os dados adequadamente!");
        }
        
        if(vf.isEmpty()|| Float.valueOf(vf)<0){
            jtxtVF.setBackground(Color.red);
            jtxtVF.setText("10");
            JOptionPane.showMessageDialog(rootPane, "Por favor preencha os dados adequadamente!");
            
        }
        if(vI.isEmpty()|| Float.valueOf(vI)<0){
            jftxtVInicial.setBackground(Color.red);
            jftxtVInicial.setText("10");
            JOptionPane.showMessageDialog(rootPane, "Por favor preencha os dados adequadamente!");
            
        }
        
        

        double soma;
        try {
            soma = new ClientSocket().betinaJuros(Float.valueOf(vI), Float.valueOf(vf), Integer.valueOf(ano));
			//soma = BitConverter.ToDouble(a,0);
			JOptionPane.showMessageDialog(null,"O taxa é : "+ (soma) );

            
        } catch (IOException ex) {
            Logger.getLogger(MainInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       

              
        
        
    }//GEN-LAST:event_btnCalcMouseClicked

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcActionPerformed

    private void jftxtVInicialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jftxtVInicialFocusGained
        jftxtVInicial.setBackground(Color.white);
    }//GEN-LAST:event_jftxtVInicialFocusGained

    private void jtxtVFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtVFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtVFActionPerformed

    private void jtxtVFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtVFFocusGained
       jtxtVF.setBackground(Color.white);
    }//GEN-LAST:event_jtxtVFFocusGained

    private void jtxtAnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtAnoFocusGained
     jtxtAno.setBackground(Color.white);
    }//GEN-LAST:event_jtxtAnoFocusGained

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        jftxtVInicial.setBackground(Color.white);
        jtxtAno.setBackground(Color.white);
        jtxtVF.setBackground(Color.white);
        jftxtVInicial.setText("3");
        jtxtAno.setText("5");
        jtxtVF.setText("1000000");
    }//GEN-LAST:event_btnResetMouseClicked

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
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel imagen;
    private javax.swing.JFormattedTextField jftxtVInicial;
    private javax.swing.JFormattedTextField jtxtAno;
    private javax.swing.JFormattedTextField jtxtVF;
    private javax.swing.JLabel lblValorInicial;
    private javax.swing.JLabel lblvDesejado;
    private javax.swing.JLabel lblyear;
    // End of variables declaration//GEN-END:variables
}
