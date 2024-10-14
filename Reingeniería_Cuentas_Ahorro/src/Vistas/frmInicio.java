package Vistas;

import javax.swing.JOptionPane;

/**
 *
 * @authors Roa Porras, Pimiento Escobar, Muñoz Aguilar.
 */
public class frmInicio extends javax.swing.JFrame {

    public frmInicio() {
        initComponents();
        this.setTitle("Tus Movimientos Bancarios");
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);

        BGTipoCuenta.add(RBCorriente);
        BGTipoCuenta.add(RBAhorros);

        RBCorriente.setSelected(true);
        TFTasa.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGTipoCuenta = new javax.swing.ButtonGroup();
        JLBienvenida = new javax.swing.JLabel();
        JLseleccionar = new javax.swing.JLabel();
        RBCorriente = new javax.swing.JRadioButton();
        RBAhorros = new javax.swing.JRadioButton();
        JLTasa = new javax.swing.JLabel();
        TFTasa = new javax.swing.JTextField();
        JBCrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLBienvenida.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        JLBienvenida.setText("¡Bienvenido a tu Software de Gestión de Movimientos Bancarios!");

        JLseleccionar.setText("Seleccione el tipo de cuenta:");

        RBCorriente.setText("Cuenta Corriente");
        RBCorriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBCorrienteActionPerformed(evt);
            }
        });

        RBAhorros.setText("Cuenta Ahorros");
        RBAhorros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBAhorrosActionPerformed(evt);
            }
        });

        JLTasa.setText("Tasa de interes:");

        TFTasa.setText("0 %");
        TFTasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFTasaActionPerformed(evt);
            }
        });

        JBCrear.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        JBCrear.setText("Crear Cuenta");
        JBCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBCrearMouseClicked(evt);
            }
        });
        JBCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(JLBienvenida))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(JLseleccionar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RBCorriente)
                                .addGap(30, 30, 30)
                                .addComponent(RBAhorros))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(JLTasa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFTasa, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(JBCrear)))
                .addGap(35, 35, 35))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {RBAhorros, RBCorriente});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLBienvenida)
                .addGap(18, 18, 18)
                .addComponent(JLseleccionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBCorriente)
                    .addComponent(RBAhorros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLTasa)
                    .addComponent(TFTasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBCrear)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RBCorrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBCorrienteActionPerformed
        if (RBCorriente.isSelected()) {
            TFTasa.setText("0 %");
            TFTasa.setEnabled(false);
        }
    }//GEN-LAST:event_RBCorrienteActionPerformed

    private void RBAhorrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBAhorrosActionPerformed
        if (RBAhorros.isSelected()) {
            TFTasa.setEnabled(true);
        }
    }//GEN-LAST:event_RBAhorrosActionPerformed

    private void TFTasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFTasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFTasaActionPerformed

    private void JBCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBCrearActionPerformed

    private void JBCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBCrearMouseClicked
        try {
            if (TFTasa.getText().matches("\\d+\\.\\d+\\s*%?")) {
                //Obtenemos la tasa
                String tasaPorcentaje = TFTasa.getText().replace("%", "").trim();
                Double tasa = Double.valueOf(tasaPorcentaje);
                
                //Cerramos la pestaña actual
                this.dispose();
                
                //En base a los datos creamos la ventana del Kardex con su respectiva cuenta:
                if (RBCorriente.isSelected()) {
                    new frmTransacciones(0, tasa).setVisible(true); //0 = Cuenta Corriente
                } else {
                    new frmTransacciones(1, tasa).setVisible(true); //1 = Cuenta Ahorros
                }

            } else {
                JOptionPane.showMessageDialog(null,
                        "Error: El valor ingresado no es un número válido. Por favor, ingrese una tasa valida.",
                        "Tasa Invalida",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Error: El valor ingresado no es un número válido. Por favor, ingrese una tasa valida.",
                    "Tasa Invalida",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBCrearMouseClicked
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(frmTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGTipoCuenta;
    private javax.swing.JButton JBCrear;
    private javax.swing.JLabel JLBienvenida;
    private javax.swing.JLabel JLTasa;
    private javax.swing.JLabel JLseleccionar;
    private javax.swing.JRadioButton RBAhorros;
    private javax.swing.JRadioButton RBCorriente;
    private javax.swing.JTextField TFTasa;
    // End of variables declaration//GEN-END:variables
}
