/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.CustomerRole.Login;

import business.Business;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import system.Enterprise.Enterprise;
import system.Invoice.Invoice;
import system.NetWork.NetWork;
import system.Order.OrderItem;
import system.Organization.Organization;
import system.Product.Product;
import system.Role.Role;
import system.WorkQueue.CustomerShippingRequest;
import system.WorkQueue.WorkRequest;

/**
 *
 * @author Administrator
 */
public class CheckOutJPanel extends javax.swing.JPanel {

    JPanel container;
    Business business;
    Invoice invoice;
 CustomerShippingRequest ccr = new CustomerShippingRequest();
    public CheckOutJPanel(JPanel container,
            Business business,
            Invoice invoice) {
        initComponents();
        this.container = container;
        this.business = business;
        this.invoice = invoice;
        orderIDJTextField1.setText(String.valueOf(invoice.getOrder().getOrderNum()));
        invoiceJPanel.setVisible(false);
        popInvoiceTable();
        shippingFeeJPanel.setVisible(false);
           
//        populateShippingE();
        
    }

//    private void populateShippingE() {
//        shippingEnterpriseJComboBox.removeAllItems();
//        for (NetWork n : business.getNetWorkDirectory().getNetWorkList()) {
//            if (n.getName().equals(invoice.getOrder().getCustomer().getPerson().getLocation().getCountry())) {
//                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
//                    if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.ShippingEnterprise) && e.getLocation().getName().equals(invoice.getOrder().getCustomer().getPerson().getLocation().getName()) && e.getLocation().getCity().equals(invoice.getOrder().getCustomer().getPerson().getLocation().getCity())) {
//                        shippingEnterpriseJComboBox.addItem(e);
//                    }
//                }
//            }
//        }
//    }

    private void popInvoiceTable() {
        int rowCount = invoiceJTable.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) invoiceJTable.getModel()).removeRow(i);
        }

        for (OrderItem oi : invoice.getOrder().getOis()) {
//            if (invoice.getOrder().getCustomer().equals(customer)) {
            Object row[] = new Object[8];
            row[0] = invoice;
            row[1] = invoice.getOrder().getOrderNum();
            row[2] = oi.getProduct().getName();
            row[3] = oi.getQuantity();
            row[4] = oi.getProduct().getActualPrice();
            row[5]=invoice.getOrder().getEachOrderTax();
            row[6] = invoice.getOrder().getEachOrderPrice();
            row[7] = invoice.getDate();
            ((DefaultTableModel) invoiceJTable.getModel()).addRow(row);

//            }
        }
    }

//   private boolean checkOnedayPossible(){
//    for(NetWork n:business.getNetWorkDirectory().getNetWorkList()){
//      for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
//      for(Product p:e.getProductCatalog().getProductList()){
////            for (Order o : business.getMasterOrderList().getOrders()) {
////            if (o.getCustomer().equals(wr.getSender())) {
//              for(OrderItem oi: invoice.getOrder().getOis()){
//              if(p.equals(oi.getProduct())){
//              for(Enterprise en:n.getEnterpriseDirectory().getEnterpriseList()){
//              if(en instanceof ShippingEnterprise&&en.getLocation().getState().equals(e.getLocation().getState())){
//          return true;
//              }
//              }
//              }
//              }
//            }
     
//      }
//      }
//      }
//    }
//        return false;
//   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        invoiceJPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        makePaymentJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        invoiceJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        orderIDJTextField1 = new javax.swing.JTextField();
        onedayShippingJRadioButton = new javax.swing.JRadioButton();
        threedayShippingJRadioButton = new javax.swing.JRadioButton();
        submitJButton1 = new javax.swing.JButton();
        backjButton1 = new javax.swing.JButton();
        weekDeliverJRadioButton = new javax.swing.JRadioButton();
        shippingFeeJPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        invoiceJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Invoice");
        invoiceJPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 40, 20));

        makePaymentJButton.setText("Make Payment");
        makePaymentJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makePaymentJButtonActionPerformed(evt);
            }
        });
        invoiceJPanel.add(makePaymentJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        invoiceJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice ID", "Order ID", "Product Name", "Quantity", "Price", "TotalTax", "Total Price", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(invoiceJTable);

        invoiceJPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 700, 130));

        add(invoiceJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 730, 230));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Check Out");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jLabel2.setText("Shipping Method:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jLabel7.setText("Order ID:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));
        add(orderIDJTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 75, -1));

        onedayShippingJRadioButton.setText("One-day deliver");
        onedayShippingJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onedayShippingJRadioButtonActionPerformed(evt);
            }
        });
        add(onedayShippingJRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        threedayShippingJRadioButton.setText("Three-day Deliver");
        add(threedayShippingJRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        submitJButton1.setText("Submit");
        submitJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButton1ActionPerformed(evt);
            }
        });
        add(submitJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, 30));

        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 80, 30));

        weekDeliverJRadioButton.setText("Week Deliver");
        add(weekDeliverJRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, -1, -1));

        shippingFeeJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Sorry, but we may not be able to deliver it in one day.");
        shippingFeeJPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        add(shippingFeeJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 310, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void onedayShippingJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onedayShippingJRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_onedayShippingJRadioButtonActionPerformed

    private void makePaymentJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makePaymentJButtonActionPerformed
        // TODO add your handling code here:
//        int selectedRow = invoiceJTable.getSelectedRow();
//        if (selectedRow < 0) {
//            return;
//        }
//
//      Invoice selectedInvoice = (Invoice) invoiceJTable.getValueAt(selectedRow, 0);   
      
        MakePaymentJPanel mpjp = new MakePaymentJPanel(container, business, invoice, ccr);
        container.add("MakePaymentJPanel", mpjp);

        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_makePaymentJButtonActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backjButton1ActionPerformed
//    private void checkout() {
//        CustomerShippingRequest ccr = new CustomerShippingRequest();
//        ccr.setSender(invoice.getOrder().getCustomer());
//        //ccr.setMessage(reasonJTextField.getText());
//        ccr.setReceiver(new ShippingDeptRole());
//        ccr.setStatus("Pending");
//        if(onedayShippingJRadioButton.isSelected() == false && threedayShippingJRadioButton.isSelected() == false && weekDeliverJRadioButton.isSelected() == false) {
//            JOptionPane.showMessageDialog(null, "Choose Your prefered Shipping Method Please!");
//            //return;
//        } else if (onedayShippingJRadioButton.isSelected() == true) {
//            ccr.setTypeInfo("One-day Shipping");
//        } else {
//            ccr.setTypeInfo("Whenever");
//        }
//
//    }
    private void submitJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButton1ActionPerformed
        // TODO add your handling code here:
        ccr.setSender(invoice.getOrder().getCustomer());
        ccr.setO(invoice.getOrder());
//      ccr.setMessage(reasonJTextField.getText());
        for(NetWork n: business.getNetWorkDirectory().getNetWorkList()){
        for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
            if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.Amazon)){
        for(Organization o: e.getDepartmentDirectory().getDepartmentList()){
         if(o.getType().equals(Organization.OrganizationType.AmazonShippingDept)){
         for(Role r: o.getSupportedRoles()){
        ccr.setReceiver(r);  
//        System.out.println("ccr's receiver:"+ccr.getReceiver());
         }
         }
        }
        }
        }
        }
       
        ccr.setStatus("Pending");
        ccr.setWorkRequestType(WorkRequest.WorkRequestType.CustomerShippingRequest);
//      Enterprise e = (Enterprise)shippingEnterpriseJComboBox.getSelectedItem();
//      ccr.setShippingEnterprise(e);
        if (onedayShippingJRadioButton.isSelected() == false && threedayShippingJRadioButton.isSelected() == false && weekDeliverJRadioButton.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Choose Your prefered Shipping Method Please!");
            return;
        } else if (onedayShippingJRadioButton.isSelected() == true) {
            threedayShippingJRadioButton.setSelected(false);
            weekDeliverJRadioButton.setSelected(false);
           
            for(NetWork n:business.getNetWorkDirectory().getNetWorkList()){
      for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
          if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.LocalRetalier)){
          for(Organization o: e.getDepartmentDirectory().getDepartmentList()){
          if(o.getType().equals(Organization.OrganizationType.ProductManageDept)){
           for(Product p:o.getProductCatalog().getProductList()){
//            for (Order o : business.getMasterOrderList().getOrders()) {
//            if (o.getCustomer().equals(wr.getSender())) {
              for(OrderItem oi: invoice.getOrder().getOis()){
              if(p.equals(oi.getProduct())){
              for(Enterprise en:n.getEnterpriseDirectory().getEnterpriseList()){
                  if(en.getEnterpriseType().equals(Enterprise.EnterpriseType.ShippingEnterprise)){
              if(en.getLocation().getCountry().equals(e.getLocation().getCountry())&&en.getLocation().getState().equals(e.getLocation().getState())&&en.getLocation().getCountry().equals(invoice.getOrder().getCustomer().getPerson().getLocation().getCountry())&&en.getLocation().getState().equals(invoice.getOrder().getCustomer().getPerson().getLocation().getState())){
         ccr.setTypeInfo("One-day Shipping");
              }else{
               shippingFeeJPanel.setVisible(true);
                  JOptionPane.showMessageDialog(null, "Please Choose another shipping method!");
                  return;
              }
              }
              }
              }
//            }
     
      }
      }
          }
          }
          }
      }
            }
           
          
            
        } else if (threedayShippingJRadioButton.isSelected() == true) {
            onedayShippingJRadioButton.setSelected(false);
            weekDeliverJRadioButton.setSelected(false);
            ccr.setTypeInfo("Three-day Shipping");
            shippingFeeJPanel.setVisible(false);
        } else {
            onedayShippingJRadioButton.setSelected(false);
            threedayShippingJRadioButton.setSelected(false);
            ccr.setTypeInfo("Week Deliver");
            shippingFeeJPanel.setVisible(false);
        }
         Date curDate = new Date(System.currentTimeMillis());
         ccr.setIniDate(curDate);
        for(Organization o:business.getDepartmentDirectory().getDepartmentList()){
        if(o.getType().equals(Organization.OrganizationType.AmazonShippingDept)){
          o.getWorkQueue().getWorkRequestList().add(ccr);
        }
        }
//        business.getWorkQueue().getWorkRequestList().add(ccr);
        invoiceJPanel.setVisible(true);


    }//GEN-LAST:event_submitJButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JPanel invoiceJPanel;
    private javax.swing.JTable invoiceJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton makePaymentJButton;
    private javax.swing.JRadioButton onedayShippingJRadioButton;
    private javax.swing.JTextField orderIDJTextField1;
    private javax.swing.JPanel shippingFeeJPanel;
    private javax.swing.JButton submitJButton1;
    private javax.swing.JRadioButton threedayShippingJRadioButton;
    private javax.swing.JRadioButton weekDeliverJRadioButton;
    // End of variables declaration//GEN-END:variables
}
