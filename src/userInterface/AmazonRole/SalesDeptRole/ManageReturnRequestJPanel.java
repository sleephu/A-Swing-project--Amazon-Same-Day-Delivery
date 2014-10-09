/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AmazonRole.SalesDeptRole;

import business.Business;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import system.Order.Order;
import system.Order.OrderItem;
import system.Organization.Organization;
import system.Shipping.Shipping;
import system.UserAccount.UserAccount;
import system.WorkQueue.CustomerReturnRequest;
import system.WorkQueue.WorkRequest;

/**
 *
 * @author Administrator
 */
public class ManageReturnRequestJPanel extends javax.swing.JPanel {

    JPanel container;
    Business business;
    UserAccount ua;
    Organization salesO;

    public ManageReturnRequestJPanel(
            JPanel container,
            Business business,
            UserAccount ua) {
        initComponents();
        this.container = container;
        this.business = business;
        this.ua = ua;

        for (Organization or : business.getDepartmentDirectory().getDepartmentList()) {
            if (or.getType().equals(Organization.OrganizationType.AmazonSalesDept)) {
                this.salesO = or;
            }
        }
        populateTableData();
    }

    private void populateTableData() {
        DefaultTableModel model = (DefaultTableModel) complainJTable.getModel();
        model.setNumRows(0);
//        for(NetWork n: netWorkDirectory.getNetWorkList()){
//        for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
//            if(e instanceof Business){
        for (WorkRequest wr : salesO.getWorkQueue().getWorkRequestList()) {
//            System.out.println("wr:"+wr);

//           ua.setOrganizationType(Organization.OrganizationType.CustomerDept); 
//            if(wr.getId()==13){
//                 System.out.println(wr.getReceiverO()+"rrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
            if (wr.getWorkRequestType().equals(WorkRequest.WorkRequestType.CustomerReturnRequest)) {
                Object[] row = new Object[8];
                row[0] = wr;    // don't need to get message
                row[1] = wr.getSender().getUserName();
                for (Order o : salesO.getMasterOrderList().getOrders()) {
                    for (OrderItem oi : o.getOis()) {
                        if (o.getCustomer().equals(wr.getSender()) && oi.equals(wr.getOrderItem())) {
                            row[2] = o.getOrderNum();
                            row[3] = oi.getProduct().getName();
                        }
                        for (Organization or : business.getDepartmentDirectory().getDepartmentList()) {
                            if (or.getType().equals(Organization.OrganizationType.AmazonShippingDept)) {
                                if (or.getShippingList().getShippingList().isEmpty()) {
                                    row[5] = "Not Delivered Yet";
                                } else {
                                    for (Shipping s : or.getShippingList().getShippingList()) {
                                        if (s.getOi().equals(oi)) {
                                            row[5] = s.getDeliveredDate();
                                        }
                                    }
                                }
                            }

                        }

//                for(NetWork n: business.getNetWorkDirectory().getNetWorkList()){
//                for(Enterprise e:n.getEnterpriseDirectory().getEnterpriseList()){
//                if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.ShippingEnterprise)){
//                for(Shipping s: business.getShippingList().getShippingList()){
//                 if(s.getOi().equals(oi)){
//                 row[5]=s.getDeliveredDate();
//                 }
//                }
//                }
//                }
//                }
                    }
//            row[4]=wr.getTypeInfo();
                }
                row[4] = wr.getMessage();
                row[6] = wr.getIniDate();
                row[7] = wr.getStatus();
                model.addRow(row);
            }

//            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        complainJPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        complainJTable = new javax.swing.JTable();
        processJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Manage Customer Return Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        complainJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        complainJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RequestID", "UserName", "OrderId", "OrderItem", "Reason", "DeliveredDate", "RequestDate", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(complainJTable);

        complainJPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 680, 100));

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        complainJPanel.add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 70, -1));

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        complainJPanel.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        add(complainJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 700, 370));
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        //        // TODO add your handling code here:
        //        int selectedRow = orderJTable.getSelectedRow();
        //        if (selectedRow < 0) {
        //            return;
        //        }
        //
        //        Order order = (Order) orderJTable.getValueAt(selectedRow, 0);
        //        order.setOrderStatus(Order.Cancel);
        //Icon icon = new ImageIcon(person.getImage());
        //        imageLabel.setIcon(icon);
        int selectedRow = complainJTable.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }

        CustomerReturnRequest wr = (CustomerReturnRequest) complainJTable.getValueAt(selectedRow, 0);
        ProcessReturnRequestJPanel ProcessReturnRequestJPanel = new ProcessReturnRequestJPanel(container, ua, wr, business, salesO);
        container.add("ProcessReturnRequestJPanel", ProcessReturnRequestJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_processJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JPanel complainJPanel;
    private javax.swing.JTable complainJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    // End of variables declaration//GEN-END:variables
}
