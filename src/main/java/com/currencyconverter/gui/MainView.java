/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.currencyconverter.gui;

import com.currencyconverter.logic.CalculateConversion;
import com.currencyconverter.logic.CurrencyList;
import com.currencyconverter.logic.ExchangeRate;
import com.currencyconverter.logic.ValidateInput;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author DMT
 */
public class MainView extends javax.swing.JFrame {

    DefaultComboBoxModel model = new DefaultComboBoxModel();
    private final List<String> currencyList = CurrencyList.getCurrencyList();
    private double result;

    /**
     * Creates new form MainView
     */
    public MainView() {
        fillComboBox();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Currency Converter");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(162, 155, 254));
        jPanel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(142, 68, 173));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Currency Converter");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(142, 68, 173));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Choose the type of conversion you want to perform");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(142, 68, 173));
        jLabel3.setText("Enter the amount");

        jButton1.setBackground(new java.awt.Color(142, 68, 173));
        jButton1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Click Here To Convert");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jComboBox1.setModel(model);

        jSeparator1.setBackground(new java.awt.Color(142, 68, 173));
        jSeparator1.setForeground(new java.awt.Color(142, 68, 173));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (ValidateInput.validate(jTextField1.getText())) {
            switch (jComboBox1.getSelectedIndex()) {
                case 0 -> {
                    result = CalculateConversion.calculate(Double.parseDouble(jTextField1.getText()), ExchangeRate.EX_RATE_ARS_TO_USD);
                    JOptionPane.showMessageDialog(rootPane, "You have $" + result + " USD", "Conversion Output", JOptionPane.INFORMATION_MESSAGE);
                }
                case 1 -> {
                    result = CalculateConversion.calculate(Double.parseDouble(jTextField1.getText()), ExchangeRate.EX_RATE_ARS_TO_EUR);
                    JOptionPane.showMessageDialog(rootPane, "You have $" + result + " EUR", "Conversion Output", JOptionPane.INFORMATION_MESSAGE);
                }
                case 2 -> {
                    result = CalculateConversion.calculate(Double.parseDouble(jTextField1.getText()), ExchangeRate.EX_RATE_ARS_TO_GBP);
                    JOptionPane.showMessageDialog(rootPane, "You have $" + result + " GBP", "Conversion Output", JOptionPane.INFORMATION_MESSAGE);
                }
                case 3 -> {
                    result = CalculateConversion.calculate(Double.parseDouble(jTextField1.getText()), ExchangeRate.EX_RATE_ARS_TO_JPY);
                    JOptionPane.showMessageDialog(rootPane, "You have $" + result + " JPY", "Conversion Output", JOptionPane.INFORMATION_MESSAGE);
                }
                case 4 -> {
                    result = CalculateConversion.calculate(Double.parseDouble(jTextField1.getText()), ExchangeRate.EX_RATE_ARS_TO_KRW);
                    JOptionPane.showMessageDialog(rootPane, "You have $" + result + " KRW", "Conversion Output", JOptionPane.INFORMATION_MESSAGE);
                }
                case 5 -> {
                    result = CalculateConversion.calculate(Double.parseDouble(jTextField1.getText()), ExchangeRate.EX_RATE_USD_TO_ARS);
                    JOptionPane.showMessageDialog(rootPane, "You have $" + result + " ARS", "Conversion Output", JOptionPane.INFORMATION_MESSAGE);
                }
                case 6 -> {
                    result = CalculateConversion.calculate(Double.parseDouble(jTextField1.getText()), ExchangeRate.EX_RATE_EUR_TO_ARS);
                    JOptionPane.showMessageDialog(rootPane, "You have $" + result + " ARS", "Conversion Output", JOptionPane.INFORMATION_MESSAGE);
                }
                case 7 -> {
                    result = CalculateConversion.calculate(Double.parseDouble(jTextField1.getText()), ExchangeRate.EX_RATE_GBP_TO_ARS);
                    JOptionPane.showMessageDialog(rootPane, "You have $" + result + " ARS", "Conversion Output", JOptionPane.INFORMATION_MESSAGE);
                }
                case 8 -> {
                    result = CalculateConversion.calculate(Double.parseDouble(jTextField1.getText()), ExchangeRate.EX_RATE_JPY_TO_ARS);
                    JOptionPane.showMessageDialog(rootPane, "You have $" + result + " ARS", "Conversion Output", JOptionPane.INFORMATION_MESSAGE);
                }
                case 9 -> {
                    result = CalculateConversion.calculate(Double.parseDouble(jTextField1.getText()), ExchangeRate.EX_RATE_KRW_TO_ARS);
                    JOptionPane.showMessageDialog(rootPane, "You have $" + result + " ARS", "Conversion Output", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Amount input must be numeric and greather than 0", "Amount Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            // Set System L&F
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private void fillComboBox() {
        for (String currency : currencyList) {
            model.addElement(currency);
        }
    }
}