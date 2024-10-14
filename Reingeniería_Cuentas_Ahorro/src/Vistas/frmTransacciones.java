package Vistas;

import Reglas.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @authors Roa Porras, Pimiento Escobar, Muñoz Aguilar.
 */
public class frmTransacciones extends javax.swing.JFrame {

    CuentaCorriente cuenta = new CuentaCorriente();

    public frmTransacciones(int tipoCuenta, double tasa) {
        initComponents();
        this.setTitle("Tus Movimientos Bancarios");
        this.setSize(1000, 700);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        TFBalance.setEditable(false);
        TFTasa.setEditable(false);
        TFTasa.setText(String.valueOf(tasa) + "%");

        if (tipoCuenta == 0) {
            JLValorTipoCuenta.setText("CUENTA CORRIENTE");
            this.cuenta = new CuentaCorriente();
        } else {
            JLValorTipoCuenta.setText("CUENTA DE AHORROS");
            this.cuenta = new CuentaAhorros(tasa);
        }

        //Generamos la estructura del movimiento:
        Object[] movimiento = {"Abrir", getFechaMovimiento(), 0.0, 0.0, TFTasa.getText()};
        registrarMovimiento(movimiento);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLBienvenida = new javax.swing.JLabel();
        JLTipoCuenta = new javax.swing.JLabel();
        JLValorTipoCuenta = new javax.swing.JLabel();
        JLDepositar = new javax.swing.JLabel();
        JLRetirar = new javax.swing.JLabel();
        JLBalance = new javax.swing.JLabel();
        JLTasa = new javax.swing.JLabel();
        TFRetirar = new javax.swing.JTextField();
        TFDepositar = new javax.swing.JTextField();
        TFBalance = new javax.swing.JTextField();
        TFTasa = new javax.swing.JTextField();
        JBDepositar = new javax.swing.JButton();
        JBRetirar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTKardex = new javax.swing.JTable();
        JBExportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));

        JLBienvenida.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        JLBienvenida.setText("¡Digita aquí cada una de tus transacciones Bancarias!");

        JLTipoCuenta.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        JLTipoCuenta.setText("Tipo de Cuenta:");

        JLValorTipoCuenta.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        JLValorTipoCuenta.setText("CUENTA DE AHORROS");

        JLDepositar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        JLDepositar.setText("Valor a Depositar:");

        JLRetirar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        JLRetirar.setText("Valor a Retirar:");

        JLBalance.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        JLBalance.setText("Balance:");

        JLTasa.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        JLTasa.setText("Tasa De Interes:");

        TFRetirar.setText("0");
        TFRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFRetirarActionPerformed(evt);
            }
        });

        TFDepositar.setText("0");
        TFDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFDepositarActionPerformed(evt);
            }
        });

        TFBalance.setText("0.0");
        TFBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFBalanceActionPerformed(evt);
            }
        });

        TFTasa.setText("0");
        TFTasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFTasaActionPerformed(evt);
            }
        });

        JBDepositar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        JBDepositar.setText("Depositar");
        JBDepositar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBDepositarMouseClicked(evt);
            }
        });
        JBDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBDepositarActionPerformed(evt);
            }
        });

        JBRetirar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        JBRetirar.setText("Retirar");
        JBRetirar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBRetirarMouseClicked(evt);
            }
        });

        JTKardex.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Movimiento", "Fecha", "Valor", "Saldo", "Tasa interes"
            }
        ){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Aquí se establece que ninguna celda es editable
            }
        }
    );
    jScrollPane1.setViewportView(JTKardex);

    JBExportar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
    JBExportar.setText("Exportar Kardex");
    JBExportar.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            JBExportarMouseClicked(evt);
        }
    });
    JBExportar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            JBExportarActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(312, 312, 312)
                    .addComponent(JLBienvenida))
                .addGroup(layout.createSequentialGroup()
                    .addGap(369, 369, 369)
                    .addComponent(JBExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(JLTipoCuenta)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JLValorTipoCuenta)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(JLRetirar)
                                                .addComponent(JLDepositar))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(TFDepositar)
                                                .addComponent(TFRetirar)))
                                        .addComponent(JBDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(50, 50, 50)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(JLTasa)
                                                .addComponent(JLBalance))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(TFTasa)
                                                .addComponent(TFBalance)))
                                        .addComponent(JBRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
            .addContainerGap(50, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(15, 15, 15)
            .addComponent(JLBienvenida)
            .addGap(25, 25, 25)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(JLTipoCuenta)
                .addComponent(JLValorTipoCuenta))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLDepositar)
                        .addComponent(TFDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLBalance))
                    .addGap(25, 25, 25)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLRetirar)
                        .addComponent(TFRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLTasa)))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(TFBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25)
                    .addComponent(TFTasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(29, 29, 29)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(JBDepositar)
                .addComponent(JBRetirar))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(25, 25, 25)
            .addComponent(JBExportar)
            .addGap(25, 25, 25))
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBDepositarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBDepositarActionPerformed

    private void TFTasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFTasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFTasaActionPerformed

    private void TFBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFBalanceActionPerformed

    private void TFDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFDepositarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFDepositarActionPerformed

    private void TFRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFRetirarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFRetirarActionPerformed

    private void JBDepositarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBDepositarMouseClicked
        try {
            if (TFDepositar.getText().matches("\\d+\\.\\d+\\s*%?") && Double.parseDouble(TFDepositar.getText()) > 0) {
                cuenta.depositar(Double.parseDouble(TFDepositar.getText()));
                //Generamos la estructura del movimiento:
                Object[] movimiento = {"Depositar", getFechaMovimiento(), Double.valueOf(TFDepositar.getText()),
                    cuenta.getBalance(), TFTasa.getText()};
                registrarMovimiento(movimiento);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Error: El valor a depositar no es un número válido. Por favor, ingrese un número valido.",
                        "Deposito Invalido",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Error: El valor a depositar no es un número válido. Por favor, ingrese un número valido.",
                    "Deposito Invalido",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBDepositarMouseClicked

    private void JBRetirarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBRetirarMouseClicked
        try {
            if (TFRetirar.getText().matches("\\d+\\.\\d+\\s*%?") && Double.parseDouble(TFRetirar.getText()) > 0) {
                if (cuenta.retirar(Double.parseDouble(TFRetirar.getText())) == true) {
                    //Generamos la estructura del movimiento:
                    Object[] movimiento = {"Retirar", getFechaMovimiento(), Double.valueOf(TFRetirar.getText()),
                        cuenta.getBalance(), TFTasa.getText()};
                    registrarMovimiento(movimiento);
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "Error: El valor a retirar no es un número válido. Por favor, ingrese un número valido.",
                        "Retiro Invalido",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Error: El valor a retirar no es un número válido. Por favor, ingrese un número valido.",
                    "Retiro Invalido",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JBRetirarMouseClicked

    private void JBExportarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBExportarMouseClicked
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Kardex.csv"))) {
            DefaultTableModel model = (DefaultTableModel) JTKardex.getModel();

            // Escribir encabezados de las columnas
            for (int i = 0; i < model.getColumnCount(); i++) {
                bw.write(model.getColumnName(i) + ",");
            }
            bw.newLine();

            // Escribir los datos de las filas
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    bw.write(model.getValueAt(i, j).toString() + ",");
                }
                bw.newLine();
            }

            JOptionPane.showMessageDialog(null,
                    "¡Se exportaron exitosamente los datos de su cuenta!",
                    "Exportación Exitosa",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_JBExportarMouseClicked

    private void JBExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExportarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBExportarActionPerformed

    private String getFechaMovimiento() {
        LocalDateTime fechaActual = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm");
        String fechaMovimiento = fechaActual.format(formatter);
        return fechaMovimiento;
    }

    private void registrarMovimiento(Object[] movimiento) {
        //Obtenemos el modelo de la tabla:
        DefaultTableModel model = (DefaultTableModel) JTKardex.getModel();
        //Añadimos el movimiento a la tabla
        model.addRow(movimiento);

        //Actualizamos el Balance y los valores a Depositar o Retirar.
        TFBalance.setText(String.valueOf(cuenta.getBalance()));
        reiniciarTextFields();
    }

    private void reiniciarTextFields() {
        TFRetirar.setText("0");
        TFDepositar.setText("0");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBDepositar;
    private javax.swing.JButton JBExportar;
    private javax.swing.JButton JBRetirar;
    private javax.swing.JLabel JLBalance;
    private javax.swing.JLabel JLBienvenida;
    private javax.swing.JLabel JLDepositar;
    private javax.swing.JLabel JLRetirar;
    private javax.swing.JLabel JLTasa;
    private javax.swing.JLabel JLTipoCuenta;
    private javax.swing.JLabel JLValorTipoCuenta;
    private javax.swing.JTable JTKardex;
    private javax.swing.JTextField TFBalance;
    private javax.swing.JTextField TFDepositar;
    private javax.swing.JTextField TFRetirar;
    private javax.swing.JTextField TFTasa;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
}
