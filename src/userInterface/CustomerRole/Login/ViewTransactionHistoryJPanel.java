/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.CustomerRole.Login;

import business.Business;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import system.Customer.Customer;
import system.Order.OrderItem;
import system.Organization.Organization;
import system.Transcation.Transcation;
import system.UserAccount.UserAccount;

/**
 *
 * @author Administrator
 */
public class ViewTransactionHistoryJPanel extends javax.swing.JPanel {
    
    JPanel container;
    Business business;
    Customer c;
    UserAccount ua;

    public ViewTransactionHistoryJPanel(JPanel container,
            Business business,
            Customer c,
            UserAccount ua) {
        initComponents();
        this.container = container;
        this.business = business;
        this.c = c;
        this.ua = ua;
        invoiceJPanel.setVisible(false);
        paymentJPanel.setVisible(false);
        popData();
    }
    
    private void popData() {
        DefaultTableModel model = (DefaultTableModel) customerTransactionJTable.getModel();
        model.setNumRows(0);
        for(Organization o: business.getDepartmentDirectory().getDepartmentList()){
        if(o.getType().equals(Organization.OrganizationType.AmazonAccountingDept)){
           for (Transcation t : o.getTranscationList().getTranscationList()) {
            if(t.getpReceiver()!=null&&t.getpReceiver().equals(ua)){
//            if (t.getpReceiver().equals(ua.getPerson())) {
                Object[] row = new Object[7];
                row[0] = t;
                if(t.getO()!=null){
                     row[1] = t.getO();
                }else {
                    row[1] = t.getMessage();
                }
                
                row[2] = t.getMoneyAmount();
                row[3] = t.getIniCreater();
                row[4] = t.getpReceiver();
                row[5] = t.getIniDate();
                row[6] = t.getCompleteDate();
                
                model.addRow(row);
//            }
        }else if(t.getIniCreater().equals(ua)){
              Object[] row = new Object[7];
                row[0] = t;
                row[1] = t.getO();
                row[2] = t.getMoneyAmount();
                row[3] = t.getIniCreater();
                row[4] = t.getAmazonReceiver();
                row[5] = t.getIniDate();
                row[6] = t.getCompleteDate();
                
                model.addRow(row);
            }
    }  
        }
        }
       
    }
    private void popInvoiceTable(Transcation t) {
        int rowCount = invoiceJTable.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) invoiceJTable.getModel()).removeRow(i);
        }
//        if(t.getPayment().getInvoice()==null){
//            JOptionPane.showMessageDialog(null, "This transaction is not for order, no invoice record");
//            return;
//        }
        for (OrderItem oi : t.getPayment().getInvoice().getOrder().getOis()) {
//            if (invoice.getOrder().getCustomer().equals(customer)) {
            Object row[] = new Object[8];
            row[0] = t.getPayment().getInvoice();
            row[1] = t.getPayment().getInvoice().getOrder().getOrderNum();
            row[2] = oi.getProduct().getName();
            row[3] = oi.getProduct().getQuantity();
            row[4] = oi.getProduct().getActualPrice();
            row[5]=t.getO().getEachOrderTax();
            row[6] = t.getPayment().getInvoice().getOrder().getEachOrderPrice();
            row[7] = t.getPayment().getInvoice().getDate();
//                row[7]=t.getPayment().getInvoice().getInvoiceStatus();
            ((DefaultTableModel) invoiceJTable.getModel()).addRow(row);

//            }
        }
    }
// private void popInvoiceTable(Transcation t) {
//        int rowCount = invoiceJTable.getRowCount();
//        for (int i = rowCount - 1; i >= 0; i--) {
//            ((DefaultTableModel) invoiceJTable.getModel()).removeRow(i);
//        }
//
////        for (Invoice invoice :t.getPayment().ge) {
//            Object row[] = new Object[5];
//            row[0] = t.getPayment().getInvoice();
//            row[1] = t.getO();
//            row[2] = t.getO().getEachOrderPrice();
//            row[3]=t.getPayment().getInvoice().getDate();
//            row[4]=t.getPayment().getInvoice().getInvoiceStatus();
//           
//            ((DefaultTableModel) invoiceJTable.getModel()).addRow(row);
////        }
//    }

    private void popPaymentTable(Transcation t) {
        int rowCount = paymentJTable.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) paymentJTable.getModel()).removeRow(i);
        }
  
//        for (Order o :business.getMasterOrderList().getOrders()) {
//            if(o.equals(t.getO())){
        Object row[] = new Object[5];
        row[0] = t.getPayment();
        row[1] = t.getO();
        row[2] = t.getO().getEachOrderPrice();
        row[3] = t.getPayment().getInvoice().getDate();
        row[4] = t.getPayment().getInvoice().getInvoiceStatus();
        
        ((DefaultTableModel)paymentJTable.getModel()).addRow(row);
        }
//    }
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTransactionJTable = new javax.swing.JTable();
        backjButton1 = new javax.swing.JButton();
        viewInvoiceJButton = new javax.swing.JButton();
        viewPaymentJButton = new javax.swing.JButton();
        invoiceJPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        invoiceJTable = new javax.swing.JTable();
        paymentJPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        paymentJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("View Transaction History");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        customerTransactionJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transaction ID", "Reason", "Amount", "Sender", "Receiver", "InitialDate", "CompleteDate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customerTransactionJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 560, 120));

        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 90, -1));

        viewInvoiceJButton.setText("View Invoice");
        viewInvoiceJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInvoiceJButtonActionPerformed(evt);
            }
        });
        add(viewInvoiceJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 150, 30));

        viewPaymentJButton.setText("View Payment");
        viewPaymentJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPaymentJButtonActionPerformed(evt);
            }
        });
        add(viewPaymentJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 160, 30));

        invoiceJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Invoice");
        invoiceJPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

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
        jScrollPane3.setViewportView(invoiceJTable);

        invoiceJPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 540, 130));

        add(invoiceJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 570, 180));

        paymentJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paymentJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Payment ID", "OrderId", "Paid Amount", "Payment Date", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(paymentJTable);

        paymentJPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 430, 120));

        jLabel3.setText("View  Payment");
        paymentJPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 100, -1));

        add(paymentJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 520, 190));
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backjButton1ActionPerformed
    
    private void viewInvoiceJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInvoiceJButtonActionPerformed
        // TODO add your handling code here:
        //        for(Customer c: business.getCustomerDirectory().getCustomerList()){
        //            if(c.equals(ua.getPerson())){
//                ViewInvoiceJPanel vijp = new ViewInvoiceJPanel(container, business, c);
//                container.add("ViewInvoiceJPanel", vijp);
//
//                CardLayout layout = (CardLayout)container.getLayout();
//                layout.next(container);
        //            }
        //        }
       
        int selectedRow = customerTransactionJTable.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }
        
        Transcation t = (Transcation) customerTransactionJTable.getValueAt(selectedRow, 0);
         if(t.getPayment().getInvoice()==null){
            JOptionPane.showMessageDialog(null, "This transaction is not for order, no invoice record");
            return;
        }
        invoiceJPanel.setVisible(true);
        popInvoiceTable(t);
    }//GEN-LAST:event_viewInvoiceJButtonActionPerformed
    
    private void viewPaymentJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPaymentJButtonActionPerformed
        // TODO add your handling code here:
        //        for(Customer c: business.getCustomerDirectory().getCustomerList()){
        //            if(c.equals(ua.getPerson())){
//                ViewPaymentJPanel pjp = new ViewPaymentJPanel(container,business,c);
//                container.add("PayJPanel", pjp);
//
//                CardLayout layout = (CardLayout) container.getLayout();
//                layout.next(container);
        //            }
        //        }
       
        int selectedRow = customerTransactionJTable.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }
        
        Transcation t = (Transcation) customerTransactionJTable.getValueAt(selectedRow, 0);
         if(t.getPayment().getInvoice()==null){
            JOptionPane.showMessageDialog(null, "This transaction is not for order, no payment record");
            return;
        }
        paymentJPanel.setVisible(true);  
        popPaymentTable(t);
    }//GEN-LAST:event_viewPaymentJButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JTable customerTransactionJTable;
    private javax.swing.JPanel invoiceJPanel;
    private javax.swing.JTable invoiceJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel paymentJPanel;
    private javax.swing.JTable paymentJTable;
    private javax.swing.JButton viewInvoiceJButton;
    private javax.swing.JButton viewPaymentJButton;
    // End of variables declaration//GEN-END:variables
}
