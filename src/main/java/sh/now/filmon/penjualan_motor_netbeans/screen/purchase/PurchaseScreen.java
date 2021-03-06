/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sh.now.filmon.penjualan_motor_netbeans.screen.purchase;

import sh.now.filmon.penjualan_motor_netbeans.model.Customer;
import sh.now.filmon.penjualan_motor_netbeans.model.Motorcycle;
import sh.now.filmon.penjualan_motor_netbeans.model.Purchase;
import sh.now.filmon.penjualan_motor_netbeans.repository.CustomerRepositoryImpl;
import sh.now.filmon.penjualan_motor_netbeans.repository.MotorcycleRepositoryImpl;
import sh.now.filmon.penjualan_motor_netbeans.repository.PurchaseRepositoryImpl;
import sh.now.filmon.penjualan_motor_netbeans.repository.contract.CustomerRepository;
import sh.now.filmon.penjualan_motor_netbeans.repository.contract.MotorcycleRepository;
import sh.now.filmon.penjualan_motor_netbeans.repository.contract.PurchaseRepository;
import sh.now.filmon.penjualan_motor_netbeans.screen.contract.ScreenInterface;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 * @author arifikhsanudin
 */
public class PurchaseScreen extends javax.swing.JFrame implements ScreenInterface {
    public Integer purchaseId;
    PurchaseRepository purchaseRepository = new PurchaseRepositoryImpl();
    CustomerRepository customerRepository = new CustomerRepositoryImpl();
    MotorcycleRepository motorcycleRepository = new MotorcycleRepositoryImpl();

    /**
     * Creates new form PurchaseScreen
     */

    public PurchaseScreen() {
        init();
    }

    public PurchaseScreen(Integer purchaseId) {
        this.purchaseId = purchaseId;
        init();
    }

    void init() {
        initComponents();
        populateView();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        comboBoxCustomer = new javax.swing.JComboBox<>();
        buttonSave = new javax.swing.JButton();
        comboBoxMotorcycle = new javax.swing.JComboBox<>();
        labelTitle = new javax.swing.JLabel();
        buttonExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textFieldDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Tanggal sewa");

        buttonSave.setText("Simpan");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        labelTitle.setText("Penjualan");
        labelTitle.setFont(new java.awt.Font("Gilroy Light", 1, 24)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(0, 102, 255));

        buttonExit.setText("Keluar");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        jLabel1.setText("Id");

        labelId.setText("Id");

        jLabel3.setText("Nama penyewa");

        jLabel4.setText("Nama mobil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel3))
                                                .addGap(25, 25, 25)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(labelId)
                                                        .addComponent(comboBoxCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(102, 102, 102))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelTitle)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(buttonSave)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(buttonExit))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jLabel5))
                                                                .addGap(33, 33, 33)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(comboBoxMotorcycle, 0, 221, Short.MAX_VALUE)
                                                                        .addComponent(textFieldDate))))
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelTitle)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(labelId))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(comboBoxCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(comboBoxMotorcycle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(textFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonExit)
                                        .addComponent(buttonSave))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        if (isEdit()) {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Update?", "Peringatan", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                purchaseRepository.update(new Purchase(
                                Integer.parseInt(labelId.getText()),
                                new Motorcycle(Integer.parseInt(Objects.requireNonNull(comboBoxMotorcycle.getSelectedItem()).toString().split(" ")[0])),
                                new Customer(Integer.parseInt(Objects.requireNonNull(comboBoxCustomer.getSelectedItem()).toString().split(" ")[0])),
                                textFieldDate.getText()
                        )
                );
            }
        } else {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Tambah baru?", "Peringatan", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                purchaseRepository.add(new Purchase(
                                new Motorcycle(Integer.parseInt(Objects.requireNonNull(comboBoxMotorcycle.getSelectedItem()).toString().split(" ")[0])),
                                new Customer(Integer.parseInt(Objects.requireNonNull(comboBoxCustomer.getSelectedItem()).toString().split(" ")[0])),
                                textFieldDate.getText()
                        )
                );
            }
        }
        this.setVisible(false);
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_buttonExitActionPerformed

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
            java.util.logging.Logger.getLogger(PurchaseScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchaseScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonSave;
    private javax.swing.JComboBox<String> comboBoxMotorcycle;
    private javax.swing.JComboBox<String> comboBoxCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTextField textFieldDate;
    // End of variables declaration//GEN-END:variables

    @Override
    public void populateView() {
        comboBoxCustomer.removeAllItems();
        comboBoxMotorcycle.removeAllItems();
        customerRepository.getCustomers().forEach(user -> comboBoxCustomer.addItem(user.getId() + " (" + user.getName() + ")"));
        motorcycleRepository.getMotorcycles().forEach(car -> comboBoxMotorcycle.addItem(car.getId() + " (" + car.getName() + ")"));

        comboBoxCustomer.addActionListener(actionEvent -> {
            var comboBox = (JComboBox) actionEvent.getSource();
            String name = (String) comboBox.getSelectedItem();
            System.out.println(name);
        });
        comboBoxMotorcycle.addActionListener(actionEvent -> {
            var comboBox = (JComboBox) actionEvent.getSource();
            String name = (String) comboBox.getSelectedItem();
            System.out.println(name);
        });

        if (isEdit()) {
            Purchase purchase = purchaseRepository.getOne(purchaseId);
            labelId.setText(purchase.getId().toString());
            comboBoxCustomer.setSelectedItem(purchase.customer.getId() + " (" + purchase.customer.getName() + ")");
            comboBoxMotorcycle.setSelectedItem(purchase.motorcycle.getId() + " (" + purchase.motorcycle.getName() + ")");
            textFieldDate.setText(purchase.getDate());
        }
    }

    private boolean isEdit() {
        return purchaseId != null;
    }
}
