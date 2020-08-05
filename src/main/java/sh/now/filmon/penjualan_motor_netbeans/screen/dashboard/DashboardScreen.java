/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sh.now.filmon.penjualan_motor_netbeans.screen.dashboard;

import sh.now.filmon.penjualan_motor_netbeans.repository.CustomerRepositoryImpl;
import sh.now.filmon.penjualan_motor_netbeans.repository.MotorcycleRepositoryImpl;
import sh.now.filmon.penjualan_motor_netbeans.repository.PurchaseRepositoryImpl;
import sh.now.filmon.penjualan_motor_netbeans.repository.contract.CustomerRepository;
import sh.now.filmon.penjualan_motor_netbeans.repository.contract.MotorcycleRepository;
import sh.now.filmon.penjualan_motor_netbeans.repository.contract.PurchaseRepository;
import sh.now.filmon.penjualan_motor_netbeans.screen.contract.ScreenInterface;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author arifikhsanudin
 */
public class DashboardScreen extends javax.swing.JFrame implements ScreenInterface {
    CustomerRepository customerRepository = new CustomerRepositoryImpl();
    MotorcycleRepository motorcycleRepository = new MotorcycleRepositoryImpl();
    PurchaseRepository purchaseRepository = new PurchaseRepositoryImpl();

    /**
     * Creates new form Dashboard
     */
    public DashboardScreen() {
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

        labelTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonPurchaseAdd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        refreshCustomer = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        refreshMotorcycle = new javax.swing.JButton();
        buttonCustomerDelete = new javax.swing.JButton();
        refreshPurchase = new javax.swing.JButton();
        buttonCustomerView = new javax.swing.JButton();
        refreshAll = new javax.swing.JButton();
        buttonCustomerAdd = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        buttonMotorcycleAdd = new javax.swing.JButton();
        buttonMotorcycleView = new javax.swing.JButton();
        buttonMotorcycleDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePurchase = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableMotorcycle = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableCustomer = new javax.swing.JTable();
        buttonPurchaseDelete = new javax.swing.JButton();
        buttonPurchaseView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setFont(new java.awt.Font("Gilroy Light", 1, 24)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(0, 102, 255));
        labelTitle.setText("Sistem Informasi Penjualan Motor");

        jLabel2.setFont(new java.awt.Font("Gilroy Light", 0, 18)); // NOI18N
        jLabel2.setText("Pembelian");

        buttonPurchaseAdd.setText("Tambah");
        buttonPurchaseAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPurchaseAddActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Gilroy Light", 0, 18)); // NOI18N
        jLabel4.setText("Motor");

        refreshCustomer.setText("Refresh");
        refreshCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshCustomerActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Gilroy Light", 0, 18)); // NOI18N
        jLabel5.setText("Pembeli");

        refreshMotorcycle.setText("Refresh");
        refreshMotorcycle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshMotorcycleActionPerformed(evt);
            }
        });

        buttonCustomerDelete.setText("Hapus");
        buttonCustomerDelete.setEnabled(false);
        buttonCustomerDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCustomerDeleteActionPerformed(evt);
            }
        });

        refreshPurchase.setText("Refresh");
        refreshPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshPurchaseActionPerformed(evt);
            }
        });

        buttonCustomerView.setText("Lihat");
        buttonCustomerView.setEnabled(false);
        buttonCustomerView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCustomerViewActionPerformed(evt);
            }
        });

        refreshAll.setText("Refresh Semua");
        refreshAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshAllActionPerformed(evt);
            }
        });

        buttonCustomerAdd.setText("Tambah");
        buttonCustomerAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCustomerAddActionPerformed(evt);
            }
        });

        buttonExit.setText("Keluar");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        buttonMotorcycleAdd.setText("Tambah");
        buttonMotorcycleAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMotorcycleAddActionPerformed(evt);
            }
        });

        buttonMotorcycleView.setText("Lihat");
        buttonMotorcycleView.setEnabled(false);
        buttonMotorcycleView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMotorcycleViewActionPerformed(evt);
            }
        });

        buttonMotorcycleDelete.setText("Hapus");
        buttonMotorcycleDelete.setEnabled(false);
        buttonMotorcycleDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMotorcycleDeleteActionPerformed(evt);
            }
        });

        tablePurchase.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Id", "Nama Pembeli", "Nama Motor", "Tanggal"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                    false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablePurchase);

        tableMotorcycle.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Id", "Nama", "Nomor Polisi", "Harga"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean[]{
                    false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableMotorcycle);

        tableCustomer.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Id", "Nama", "Alamat", "Nomor HP"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                    false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableCustomer);

        buttonPurchaseDelete.setText("Hapus");
        buttonPurchaseDelete.setEnabled(false);
        buttonPurchaseDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPurchaseDeleteActionPerformed(evt);
            }
        });

        buttonPurchaseView.setText("Lihat");
        buttonPurchaseView.setEnabled(false);
        buttonPurchaseView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPurchaseViewActionPerformed(evt);
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
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(refreshAll)
                                                .addGap(25, 25, 25)
                                                .addComponent(refreshPurchase)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonPurchaseAdd)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonPurchaseView)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonPurchaseDelete))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addGap(108, 108, 108)
                                                                .addComponent(buttonMotorcycleAdd)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(buttonMotorcycleView)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(buttonMotorcycleDelete))
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(refreshMotorcycle))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel5)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(buttonCustomerAdd)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(buttonCustomerView)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(buttonCustomerDelete))
                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(refreshCustomer)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(labelTitle)
                                                                .addGap(263, 263, 263)
                                                                .addComponent(buttonExit)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonExit)
                                        .addComponent(labelTitle))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(buttonPurchaseDelete)
                                        .addComponent(buttonPurchaseView)
                                        .addComponent(buttonPurchaseAdd)
                                        .addComponent(refreshAll)
                                        .addComponent(refreshPurchase))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(buttonMotorcycleDelete)
                                        .addComponent(buttonMotorcycleView)
                                        .addComponent(buttonMotorcycleAdd)
                                        .addComponent(buttonCustomerDelete)
                                        .addComponent(buttonCustomerView)
                                        .addComponent(buttonCustomerAdd))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(refreshMotorcycle))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(refreshCustomer)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPurchaseAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPurchaseAddActionPerformed
//        new PurchaseScreen().setVisible(true);
    }//GEN-LAST:event_buttonPurchaseAddActionPerformed

    private void refreshCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshCustomerActionPerformed
//        populateTableCustomer();
    }//GEN-LAST:event_refreshCustomerActionPerformed

    private void refreshMotorcycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshMotorcycleActionPerformed
//        populateTableMotorcycle();
    }//GEN-LAST:event_refreshMotorcycleActionPerformed

    private void buttonCustomerDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCustomerDeleteActionPerformed
        Integer customerId = Integer.parseInt(tableCustomer.getValueAt(tableCustomer.getSelectedRow(), 0).toString());
//        int dialogResult = JOptionPane.showConfirmDialog(null, "Hapus?", "Peringatan", JOptionPane.YES_NO_OPTION);
//        if (dialogResult == JOptionPane.YES_OPTION) {
//            customerRepository.delete(customerId);
//            populateTableCustomer();
//        }
    }//GEN-LAST:event_buttonCustomerDeleteActionPerformed

    private void refreshPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshPurchaseActionPerformed
//        populateTablePurchase();
    }//GEN-LAST:event_refreshPurchaseActionPerformed

    private void buttonCustomerViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCustomerViewActionPerformed
        Integer customerId = Integer.parseInt(tableCustomer.getValueAt(tableCustomer.getSelectedRow(), 0).toString());
//        new CustomerScreen(customerId).setVisible(true);
    }//GEN-LAST:event_buttonCustomerViewActionPerformed

    private void refreshAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshAllActionPerformed
        populateView();
    }//GEN-LAST:event_refreshAllActionPerformed

    private void buttonCustomerAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCustomerAddActionPerformed
//        new CustomerScreen().setVisible(true);
    }//GEN-LAST:event_buttonCustomerAddActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null, "Keluar?", "Peringatan", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonMotorcycleAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMotorcycleAddActionPerformed
//        new MotorcycleScreen().setVisible(true);
    }//GEN-LAST:event_buttonMotorcycleAddActionPerformed

    private void buttonMotorcycleViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMotorcycleViewActionPerformed
        Integer motorcycleId = Integer.parseInt(tableMotorcycle.getValueAt(tableMotorcycle.getSelectedRow(), 0).toString());
//        new MotorcycleScreen(motorcycleId).setVisible(true);
    }//GEN-LAST:event_buttonMotorcycleViewActionPerformed

    private void buttonMotorcycleDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMotorcycleDeleteActionPerformed
        Integer motorcycleId = Integer.parseInt(tableMotorcycle.getValueAt(tableMotorcycle.getSelectedRow(), 0).toString());
//        int dialogResult = JOptionPane.showConfirmDialog(null, "Hapus?", "Peringatan", JOptionPane.YES_NO_OPTION);
//        if (dialogResult == JOptionPane.YES_OPTION) {
//            motorcycleRepository.delete(motorcycleId);
//            populateTableMotorcycle();
//        }
    }//GEN-LAST:event_buttonMotorcycleDeleteActionPerformed

    private void buttonPurchaseDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPurchaseDeleteActionPerformed
        Integer purchaseId = Integer.parseInt(tablePurchase.getValueAt(tablePurchase.getSelectedRow(), 0).toString());
//        int dialogResult = JOptionPane.showConfirmDialog(null, "Hapus?", "Peringatan", JOptionPane.YES_NO_OPTION);
//        if (dialogResult == JOptionPane.YES_OPTION) {
//            purchaseRepository.delete(purchaseId);
//            populateTablePurchase();
//        }
    }//GEN-LAST:event_buttonPurchaseDeleteActionPerformed

    private void buttonPurchaseViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPurchaseViewActionPerformed
        Integer purchaseId = Integer.parseInt(tablePurchase.getValueAt(tablePurchase.getSelectedRow(), 0).toString());
//        new PurchaseScreen(purchaseId).setVisible(true);
    }//GEN-LAST:event_buttonPurchaseViewActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCustomerAdd;
    private javax.swing.JButton buttonCustomerDelete;
    private javax.swing.JButton buttonCustomerView;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonMotorcycleAdd;
    private javax.swing.JButton buttonMotorcycleDelete;
    private javax.swing.JButton buttonMotorcycleView;
    private javax.swing.JButton buttonPurchaseAdd;
    private javax.swing.JButton buttonPurchaseDelete;
    private javax.swing.JButton buttonPurchaseView;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JButton refreshAll;
    private javax.swing.JButton refreshCustomer;
    private javax.swing.JButton refreshMotorcycle;
    private javax.swing.JButton refreshPurchase;
    private javax.swing.JTable tableCustomer;
    private javax.swing.JTable tableMotorcycle;
    private javax.swing.JTable tablePurchase;
    // End of variables declaration//GEN-END:variables

    @Override
    public void populateView() {
        populateTableCustomer();
        populateTableMotorcycle();
        populateTablePurchase();
    }

    private void populateTableCustomer() {
        buttonCustomerView.setEnabled(false);
        buttonCustomerDelete.setEnabled(false);

        DefaultTableModel tableModelCustomer = (DefaultTableModel) tableCustomer.getModel();
        tableModelCustomer.setRowCount(0);
        customerRepository.getCustomers().forEach(customer -> {
            tableModelCustomer.addRow(new Object[]{customer.getId(), customer.getName(), customer.getAddress(), customer.getPhoneNumber()});
        });

        tableCustomer.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                buttonCustomerView.setEnabled(true);
                buttonCustomerDelete.setEnabled(true);
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });
    }
    
    private void populateTableMotorcycle() {
        buttonMotorcycleView.setEnabled(false);
        buttonMotorcycleDelete.setEnabled(false);

        DefaultTableModel tableModelMotorcycle = (DefaultTableModel) tableMotorcycle.getModel();
        tableModelMotorcycle.setRowCount(0);
        motorcycleRepository.getMotorcycles().forEach(motorcycle -> {
            tableModelMotorcycle.addRow(new Object[]{motorcycle.getId(), motorcycle.getName(), motorcycle.getPoliceNumber(), motorcycle.getPrice()});
        });

        tableMotorcycle.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                buttonMotorcycleView.setEnabled(true);
                buttonMotorcycleDelete.setEnabled(true);
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });
    }
    
    private void populateTablePurchase() {
        buttonPurchaseView.setEnabled(false);
        buttonPurchaseDelete.setEnabled(false);

        DefaultTableModel purchaseModelCar = (DefaultTableModel) tablePurchase.getModel();
        purchaseModelCar.setRowCount(0);
        purchaseRepository.getPurchases().forEach(purchase -> {
            purchaseModelCar.addRow(new Object[]{purchase.getId(), purchase.motorcycle.getName(), purchase.customer.getName(), purchase.getDate()});
        });

        tablePurchase.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                buttonPurchaseView.setEnabled(true);
                buttonPurchaseDelete.setEnabled(true);
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });
    }
}
