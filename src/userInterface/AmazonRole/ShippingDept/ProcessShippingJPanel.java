/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AmazonRole.ShippingDept;

import business.Business;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import system.Enterprise.Enterprise;
import system.NetWork.NetWork;
import system.Order.Order;
import system.Order.OrderItem;
import system.Organization.Organization;
import system.Product.Product;
import system.UserAccount.UserAccount;
import system.WorkQueue.CustomerShippingRequest;
import system.WorkQueue.ShippingRequest;
import system.WorkQueue.WorkRequest;

/**
 *
 * @author Administrator
 */
public class ProcessShippingJPanel extends javax.swing.JPanel {

    JPanel container;
    Business business;
    UserAccount ua;
    CustomerShippingRequest wr;
//    ShippingRequest sr = new ShippingRequest();
//WorkRequest sr= new WorkRequest();
    Organization shippingO;

    public ProcessShippingJPanel(JPanel container,
            Business business,
            UserAccount ua,
            CustomerShippingRequest wr, //           WorkRequest wr
            Organization shippingO) {
        initComponents();
        this.container = container;
        this.business = business;
        this.ua = ua;
        this.wr = wr;
        this.shippingO = shippingO;
        assignJPanel.setVisible(false);
        orderItemJPanel.setVisible(false);
//        showR();
        popData();


    }
//    private void showR(){
//           DefaultTableModel model = (DefaultTableModel) shippingJTable.getModel();
//        model.setNumRows(0);
//
//        Object[] row = new Object[8];
//        row[0] = wr;    // don't need to get message
////        for (Organization or : business.getDepartmentDirectory().getDepartmentList()) {
////            if (or.getType().equals(Organization.OrganizationType.AmazonSalesDept)) {
////                for (Order o : or.getMasterOrderList().getOrders()) {
////                    if (o.getCustomer().equals(wr.getSender())) {
////                        row[1] = o.getOrderNum();
//        row[1]=wr.getO().getOrderNum();
////                        for (OrderItem oi : o.getOis()) {
////                            row[2] = oi.getProduct().getName();
////                            row[3] = wr.getSender().getPerson().getLastName() + "" + wr.getSender().getPerson().getFirstName();
//////            }
////                            row[4] = wr.getSender().getPerson().getLocation().getCountry() + "/" + wr.getSender().getPerson().getLocation().getState() + "/" + wr.getSender().getPerson().getLocation().getCity() + "/" + wr.getSender().getPerson().getLocation().getStreet();
////                            row[5] = wr.getTypeInfo();
////                            row[6] = wr.getShippingEnterprise();
////                            row[7] = wr.getStatus();
//                            model.addRow(row);
////                        }
////                    }
////
////                }
////            }
//        }

    private void popData() {
        DefaultTableModel model = (DefaultTableModel) shippingJTable.getModel();
        model.setNumRows(0);

        Object[] row = new Object[8];
        row[0] = wr;    // don't need to get message
        for (Organization or : business.getDepartmentDirectory().getDepartmentList()) {
            if (or.getType().equals(Organization.OrganizationType.AmazonSalesDept)) {
                for (Order o : or.getMasterOrderList().getOrders()) {
                    if (o.getCustomer().equals(wr.getSender())) {
                        row[1] = o.getOrderNum();
                        for (OrderItem oi : o.getOis()) {
                            row[2] = oi.getProduct().getName();

                        }
                    }

                }
            }
        }
        row[3] = wr.getSender().getPerson().getLastName() + "" + wr.getSender().getPerson().getFirstName();
//            }
        row[4] = wr.getSender().getPerson().getLocation().getCountry() + "/" + wr.getSender().getPerson().getLocation().getState() + "/" + wr.getSender().getPerson().getLocation().getCity() + "/" + wr.getSender().getPerson().getLocation().getStreet();
        row[5] = wr.getTypeInfo();
        row[6] = wr.getShippingEnterprise();
        row[7] = wr.getStatus();
        model.addRow(row);
    }

    private void popOI() {
        DefaultTableModel model = (DefaultTableModel) orderItemjTable1.getModel();
        model.setNumRows(0);
        for (OrderItem oi : wr.getO().getOis()) {
            Object[] row = new Object[1];
            row[0] = oi;
            model.addRow(row);
        }


    }

    private void popShippingE(OrderItem oi) {
        shippingEnterpriseJComboBox.removeAllItems();
        for (NetWork n : business.getNetWorkDirectory().getNetWorkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.LocalRetalier)) {
                    for (Organization or : e.getDepartmentDirectory().getDepartmentList()) {
                        if (or.getType().equals(Organization.OrganizationType.ProductManageDept)) {
                            for (Product p : or.getProductCatalog().getProductList()) {
//            for (Order o : business.getMasterOrderList().getOrders()) {
//            if (o.getCustomer().equals(wr.getSender())) {
//                                for (OrderItem oi : o.getOis()) {
                                if (p.equals(oi.getProduct())) {
                                    for (Enterprise en : n.getEnterpriseDirectory().getEnterpriseList()) {
                                        if (en.getEnterpriseType().equals(Enterprise.EnterpriseType.ShippingEnterprise)) {
                                            if (wr.getTypeInfo().equals("One-day Shipping")) {
                                                if (en.getLocation().getCountry().equals(e.getLocation().getCountry()) && en.getLocation().getState().equals(e.getLocation().getState()) && en.getLocation().getCity().equals(e.getLocation().getCity())) {
                                                    for (UserAccount ua : en.getUserAccountDirectoty().getUserAccountList()) {
                                                  if(ua.getEnterprise().equals(en)) 
                                                        
                                                        shippingEnterpriseJComboBox.addItem(ua);
                                                    }

                                                } else if (en.getLocation().getCountry().equals(e.getLocation().getCountry()) && en.getLocation().getState().equals(e.getLocation().getState())) {
//                                                    shippingEnterpriseJComboBox.addItem(en);
                                                    for (UserAccount ua : en.getUserAccountDirectoty().getUserAccountList()) {
                                                     if(ua.getEnterprise().equals(en)) 
                                                        shippingEnterpriseJComboBox.addItem(ua);
                                                    }
                                                }
                                            } else {
//                                                shippingEnterpriseJComboBox.addItem(en);
                                                for (UserAccount ua : en.getUserAccountDirectoty().getUserAccountList()) {
                                                     if(ua.getEnterprise().equals(en)) 
                                                    shippingEnterpriseJComboBox.addItem(ua);
                                                }
                                            }
                                        }
                                    }
                                }
//                                }

                            }
                        }
                    }

                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        shippingJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        assignJPanel = new javax.swing.JPanel();
        shippingEnterpriseJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        assignJButton = new javax.swing.JButton();
        viewJButton = new javax.swing.JButton();
        orderItemJPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderItemjTable1 = new javax.swing.JTable();
        processJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Process Shipping Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        shippingJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RequestID", "OrderID", "OrderItem", "CustomerName", "Customer Location", "ShippingType", "ShippingEnterprise", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(shippingJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 840, 100));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        assignJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shippingEnterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        shippingEnterpriseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shippingEnterpriseJComboBoxActionPerformed(evt);
            }
        });
        assignJPanel.add(shippingEnterpriseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 100, -1));

        jLabel2.setText("Shipping Enterprise:");
        assignJPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        assignJButton.setText("Assign");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        assignJPanel.add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        add(assignJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 330, 40));

        viewJButton.setText("View");
        viewJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewJButtonActionPerformed(evt);
            }
        });
        add(viewJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 60, -1));

        orderItemJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orderItemjTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderItem"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderItemjTable1);
        orderItemjTable1.getColumnModel().getColumn(0).setResizable(false);

        orderItemJPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 340, 110));

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        orderItemJPanel.add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        add(orderItemJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 370, 160));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        // TODO add your handling code here:
//            int selectedRow = shippingJTable.getSelectedRow();
//        if(selectedRow < 0){
//            return;
//        }
        ShippingRequest sr = new ShippingRequest();
//        Enterprise e = (Enterprise) shippingEnterpriseJComboBox.getSelectedItem();
        UserAccount ua = (UserAccount) shippingEnterpriseJComboBox.getSelectedItem();
//        CustomerShippingRequest csr = (CustomerShippingRequest)shippingJTable.getValueAt(selectedRow, 0);



        wr.setStatus("In Process");
        Date curDate = new Date(System.currentTimeMillis());
        wr.setCompleDate(curDate);
        sr.setIniDate(curDate);
        sr.setCustomerShippingRequest(wr);
        sr.setOrderItem(wr.getOrderItem());
        sr.setTypeInfo(wr.getTypeInfo());
        sr.setWorkRequestType(WorkRequest.WorkRequestType.ShippingRequest);
        shippingO.getWorkQueue().getWorkRequestList().add(sr);
//        business.getWorkQueue().getWorkRequestList().add(sr);
        for (NetWork n : business.getNetWorkDirectory().getNetWorkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.ShippingEnterprise)) {
                    if (ua.getEnterprise().equals(e)) {
                        wr.setShippingEnterprise(e);
 for (Organization o : e.getDepartmentDirectory().getDepartmentList()) {
            if (o.getType().equals(Organization.OrganizationType.ShippingDept)) {
                o.getWorkQueue().getWorkRequestList().add(sr);
            }
        }

                    }
                }
            }
        }
       
//        e.getWorkQueue().getWorkRequestList().add(sr);
        popData();
        assignJPanel.setVisible(false);
        orderItemJPanel.setVisible(false);
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void shippingEnterpriseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shippingEnterpriseJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shippingEnterpriseJComboBoxActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        // TODO add your handling code here:


        int selectedRow = orderItemjTable1.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }
        OrderItem oi = (OrderItem) orderItemjTable1.getValueAt(selectedRow, 0);
        wr.setOrderItem(oi);
        popShippingE(oi);
        assignJPanel.setVisible(true);
//          ShippingRequest sr = new ShippingRequest();

//          wr1.setOrderItem(wr1.getOrderItem());
//          popShippingE(wr1.getOrderItem());
//       for(OrderItem oi: wr.getO().getOis()){
//       
//       }
//        wr.setOrderItem(null);
//        for (Organization or : business.getDepartmentDirectory().getDepartmentList()) {
//            if (or.getType().equals(Organization.OrganizationType.AmazonSalesDept)) {
//                for (Order o : or.getMasterOrderList().getOrders()) {
//                    if (o.getCustomer().equals(wr.getSender())) {
//                        for (OrderItem oi : o.getOis()) {
//                            wr.setOrderItem(oi);
//                            popShippingE(oi);
//                        }
////                        popShippingE(o);
//                    }
////                    for (OrderItem oi : o.getOis()) {
////                        wr.setOrderItem(oi);
////                        
////                    }
//                }
//            }
//        }

    }//GEN-LAST:event_processJButtonActionPerformed

    private void viewJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewJButtonActionPerformed
        // TODO add your handling code here:
        orderItemJPanel.setVisible(true);
        popOI();
    }//GEN-LAST:event_viewJButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JPanel assignJPanel;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel orderItemJPanel;
    private javax.swing.JTable orderItemjTable1;
    private javax.swing.JButton processJButton;
    private javax.swing.JComboBox shippingEnterpriseJComboBox;
    private javax.swing.JTable shippingJTable;
    private javax.swing.JButton viewJButton;
    // End of variables declaration//GEN-END:variables
}
