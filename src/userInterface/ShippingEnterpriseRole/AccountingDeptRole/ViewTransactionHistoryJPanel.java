/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ShippingEnterpriseRole.AccountingDeptRole;

import business.Business;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import system.Enterprise.Enterprise;
import system.Order.OrderItem;
import system.Organization.Organization;
import system.Shipping.Shipping;
import system.Transcation.Transcation;
import system.UserAccount.UserAccount;

/**
 *
 * @author Administrator
 */
public class ViewTransactionHistoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewTransactionHistoryJPanel
     */
    JPanel container;
    Business business;
    Enterprise e;
    UserAccount ua;
    Organization accO;

    public ViewTransactionHistoryJPanel(
            JPanel container,
            Business business,
            Enterprise e,
            UserAccount ua) {
        initComponents();
        this.container = container;
        this.business = business;
        this.e = e;
        this.ua = ua;

        for (Organization o : e.getDepartmentDirectory().getDepartmentList()) {
            if (o.getType().equals(Organization.OrganizationType.EnterpriseAccountingDept)) {
                this.accO = o;
            }
        }
        popData();
    }

    private void popData() {
        DefaultTableModel model = (DefaultTableModel) customerTransactionJTable1.getModel();
        model.setNumRows(0);
        for (Transcation t : accO.getTranscationList().getTranscationList()) {
//               if(t.getReceiver().equals(e)){
            Object[] row = new Object[8];
            row[0] = t;
            row[1] = t.getO();
            if (t.getO() != null) {
                for (Shipping sp : e.getShippingList().getShippingList()) {
                    for (OrderItem oi : t.getO().getOis()) {
                        if (sp.getOi().equals(oi)) {
                            row[2] = oi.getProduct().getName();
                        }
//                        else {
//                            row[2] = t.getMessage();
//                        }
                    }
                }
            } else {
                row[2] = t.getMessage();
            }
            row[3] = t.getMoneyAmount();
            row[4] = t.getIniCreater();
            row[5] = t.getReceiver();
            row[6] = t.getIniDate();
            row[7] = t.getCompleteDate();

            model.addRow(row);
        }
    }
// private void popData(){
//        DefaultTableModel model = (DefaultTableModel)customerTransactionJTable.getModel();
//        model.setNumRows(0);
//   for(Transcation t: e.getTranscationList().getTranscationList()){
////               if(t.getReceiver().equals(e)){
//                 Object[] row = new Object[6];
//            row[0] = t;
//            row[1]= t.getO();
//            row[1] = t.getMoneyAmount();
//            row[2] = t.getIniCreater();
//            row[3] = t.getReceiver();
//            row[4] = t.getIniDate();
//            row[5] = t.getCompleteDate();
//          
//            model.addRow(row);
//               }
//   }
//   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backjButton1 = new javax.swing.JButton();
        acceptJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerTransactionJTable1 = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("View Transaction History");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 100, -1));

        acceptJButton.setText("Confirm");
        acceptJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptJButtonActionPerformed(evt);
            }
        });
        add(acceptJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 110, 30));

        customerTransactionJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transaction ID", "Order", "Reason", "Amount", "Sender", "Receiver", "InitialDate", "CompleteDate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(customerTransactionJTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 690, 120));
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void acceptJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = customerTransactionJTable1.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }

        Transcation t = (Transcation) customerTransactionJTable1.getValueAt(selectedRow, 0);
        Date curDate = new Date(System.currentTimeMillis());
        t.setCompleteDate(curDate);
        popData();
    }//GEN-LAST:event_acceptJButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptJButton;
    private javax.swing.JButton backjButton1;
    private javax.swing.JTable customerTransactionJTable1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
