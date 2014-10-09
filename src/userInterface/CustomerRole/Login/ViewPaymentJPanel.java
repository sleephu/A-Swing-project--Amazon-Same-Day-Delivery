/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.CustomerRole.Login;

import business.Business;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import system.Customer.Customer;
import system.Invoice.Invoice;
import system.Organization.Organization;
import system.Payment.Payment;

/**
 *
 * @author Administrator
 */
public class ViewPaymentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPaymentJPanel
     */
    JPanel userProcessContainer;
    Business business;
    Customer customer;
    public ViewPaymentJPanel( JPanel userProcessContainer,
    Business business,
    Customer customer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.customer = customer;
        popPaymentTable();
        invoiceJPanel.setVisible(false);
    }
    
     private void popPaymentTable() {
        int rowCount = paymentJTable.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) paymentJTable.getModel()).removeRow(i);
        }
for(Organization or:business.getDepartmentDirectory().getDepartmentList()){
if(or.getType().equals(Organization.OrganizationType.AmazonAccountingDept)){
     for (Payment payment :or.getPaymentList().getPaymentList()) {
            if (payment.getInvoice().getOrder().getCustomer().getPerson().equals(customer)) {
                Object row[] = new Object[3];
                row[0] = payment;
                row[1]=payment.getDate();
                row[2]=payment.getInvoice().getInvoiceStatus();
                ((DefaultTableModel) paymentJTable.getModel()).addRow(row);

            }
        }
}
}
       
    }
    private void popInvoiceTable(Payment payment) {
        int rowCount = invoiceJTable.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) invoiceJTable.getModel()).removeRow(i);
        }
for(Organization o:business.getDepartmentDirectory().getDepartmentList()){
if(o.getType().equals(Organization.OrganizationType.AmazonAccountingDept)){

        for (Invoice invoice : o.getInvoiceList().getInvoiceList()) {
            if (invoice.getOrder().equals(payment.getInvoice().getOrder())) {
                Object row[] = new Object[5];
                row[0] = invoice;
                row[1] = invoice.getOrder().getOrderNum();
                row[2]= invoice.getOrder().getEachOrderPrice();
                row[3]= payment.getPaidPrice();
//                if(invoice.getOrder().getDeliverEmployee().equals(""))
//                    invoice.getOrder().setDeliverEmployee("Pending");;
          
                row[4] = invoice.getDate();

                ((DefaultTableModel) invoiceJTable.getModel()).addRow(row);

            }
        }
}
}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        paymentJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        viewDetailsJButton = new javax.swing.JButton();
        invoiceJPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        invoiceJTable = new javax.swing.JTable();
        backjButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paymentJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Payment ID", "Payment Date", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(paymentJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 63, 579, 162));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Payment History");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 25, -1, -1));

        viewDetailsJButton.setText("View Details");
        viewDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsJButtonActionPerformed(evt);
            }
        });
        add(viewDetailsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        invoiceJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        invoiceJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice ID", "Order ID", "Product Total Price", "Paid Price", "Invoice Date"
            }
        ));
        jScrollPane3.setViewportView(invoiceJTable);

        invoiceJPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 32, 777, 99));

        add(invoiceJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 286, -1, -1));

        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsJButtonActionPerformed
        // TODO add your handling code here:
        invoiceJPanel.setVisible(true);
        int selectedRow = paymentJTable.getSelectedRow();
        if(selectedRow<0){
        return;
        }
        Payment payment = (Payment)paymentJTable.getValueAt(selectedRow, 0);
         popInvoiceTable(payment);
    }//GEN-LAST:event_viewDetailsJButtonActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JPanel invoiceJPanel;
    private javax.swing.JTable invoiceJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable paymentJTable;
    private javax.swing.JButton viewDetailsJButton;
    // End of variables declaration//GEN-END:variables
}