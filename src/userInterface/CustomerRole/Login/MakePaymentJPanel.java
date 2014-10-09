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
import system.Invoice.Invoice;
import system.Organization.Organization;
import system.Payment.Payment;
import system.Transcation.Transcation;
import system.WorkQueue.WorkRequest;
import system.finacialAccount.FinacialAccount;

/**
 *
 * @author Administrator
 */
public class MakePaymentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MakePaymentJPanel
     */
    JPanel userProcessContainer;
    Business business;
    Invoice invoice;
    WorkRequest wr;

    public MakePaymentJPanel(JPanel userProcessContainer,
            Business business,
            Invoice invoice,
            WorkRequest wr) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.invoice = invoice;
        this.wr = wr;
        makePaymentJPanel.setVisible(false);
//        poplateRole();
//        popuEnterprise();
//        check();
//        invoiceIDJTextField.setText(String.valueOf(invoice.getId()));
//        orderIDJTextField.setText(String.valueOf(invoice.getOrder().getOrderNum()));
//        totalPriceJTextField.setText(String.valueOf(invoice.getOrder().getEachOrderPrice()));
////        spJTextField.setText(invoice.getOrder().getSalesPerson().getPerson().getName());
//        dateJTextField.setText(String.valueOf(invoice.getDate()));
//        statusJTextField.setText(invoice.getInvoiceStatus());


    }
//    private void popuEnterprise(){
//        enterpriseJComboBox.removeAllItems();
//        for(NetWork n:business.getNetWorkDirectory().getNetWorkList()){
//        for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
//            if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.Amazon)){
//         for(Organization o: e.getDepartmentDirectory().getDepartmentList()){
//        if(o.getType().equals(Organization.OrganizationType.AmazonAccountingDept))    
//            System.out.println("o"+o.getOrgName());
//        for(Role r:o.getSupportedRoles()){
//            System.out.println("r"+r.toString());
//            enterpriseJComboBox.addItem(e);
//            }
//    }
//        }
//        }
//        }
   
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backjButton1 = new javax.swing.JButton();
        makePaymentJPanel = new javax.swing.JPanel();
        payPriceJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        confirmJButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        accountNoJTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        confirmNoJPasswordField = new javax.swing.JPasswordField();
        cancelJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        debitCardJRadioButton = new javax.swing.JRadioButton();
        creditCardJRadioButton = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        makePaymentJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        makePaymentJPanel.add(payPriceJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 110, -1));

        jLabel3.setText("Account No:");
        makePaymentJPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel2.setText("Make Payment");
        makePaymentJPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        confirmJButton.setText("Confirm");
        confirmJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmJButtonActionPerformed(evt);
            }
        });
        makePaymentJPanel.add(confirmJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        jLabel7.setText("Amount:");
        makePaymentJPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        makePaymentJPanel.add(accountNoJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 110, -1));

        jLabel8.setText("Security No:");
        makePaymentJPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        makePaymentJPanel.add(confirmNoJPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 110, -1));

        cancelJButton.setText("Cancel");
        cancelJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelJButtonActionPerformed(evt);
            }
        });
        makePaymentJPanel.add(cancelJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel6.setText("Message:");
        makePaymentJPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));
        makePaymentJPanel.add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 110, -1));

        add(makePaymentJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 380, 220));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Make Payment");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        debitCardJRadioButton.setText("Debit Card");
        debitCardJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debitCardJRadioButtonActionPerformed(evt);
            }
        });
        add(debitCardJRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        creditCardJRadioButton.setText("Credit Card");
        creditCardJRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditCardJRadioButtonActionPerformed(evt);
            }
        });
        add(creditCardJRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jLabel5.setText("Card Type");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    private void check() {
        if (debitCardJRadioButton.isSelected() == true || creditCardJRadioButton.isSelected() == true) {
            makePaymentJPanel.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Choose Your Card Type Please");
        }
    }
    private void cancelJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelJButtonActionPerformed
        // TODO add your handling code here:

        makePaymentJPanel.setVisible(false);

    }//GEN-LAST:event_cancelJButtonActionPerformed
//private void checkAccount(){
//    String  accountNo= accountNoJTextField.getText();
// char[] passwordCharArray = confirmNoJPasswordField.getPassword();
//        String password = String.valueOf(passwordCharArray);
//        if(accountNo.equals("")||password.equals("")){
//            JOptionPane.showMessageDialog(null, "Wrong Account Information!");
//            return;
//        }
//}
    private void confirmJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmJButtonActionPerformed
        // TODO add your handling code here:
        String  accountNo= accountNoJTextField.getText();
       char[] passwordCharArray = confirmNoJPasswordField.getPassword();
        String password = String.valueOf(passwordCharArray);
        if(accountNo.equals("")||password.equals("")){
            JOptionPane.showMessageDialog(null, "Wrong Account Information!");
            return;
        }
        FinacialAccount fa= invoice.getOrder().getCustomer().getFinacialAccountList().creFinacialAccount();
        fa.setAccountNo(accountNoJTextField.getText());
        Transcation t = new Transcation();
        t.setIniCreater(invoice.getOrder().getCustomer());
//         Role r= (Role)roleJComboBox.getSelectedItem();
//        Enterprise e=(Enterprise)enterpriseJComboBox.getSelectedItem();
//        t.setReceiver(business);
        t.setAmazonReceiver("Amazon");
        t.setO(invoice.getOrder());
        for(Organization o: business.getDepartmentDirectory().getDepartmentList()){
        if(o.getType().equals(Organization.OrganizationType.AmazonAccountingDept)){
         Payment payment = o.getPaymentList().crePayment();
        t.setPayment(payment);
        String paidPrice = payPriceJTextField.getText();
        double paidP; 
//        = Double.parseDouble(paidPrice);
//        String paymentMethod = (String) roleJComboBox.getSelectedItem();
//        payment.setPaymentMethod(paymentMethod);
          try{
         paidP= Double.parseDouble(paidPrice);
         if(paidP>=0){
          payment.setPaidPrice(paidP);
           t.setMoneyAmount(paidP);
            fa.setDebt(paidP);
         }
        }catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Invalid Information!");
            return;
        }
//        payment.setPaidPrice(Double.parseDouble(payPriceJTextField.getText()));
//        t.setMoneyAmount(paidP);
//        fa.setDebt(paidP);
        payment.setInvoice(invoice);
//      SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:MM:SS");
        Date curDate = new Date(System.currentTimeMillis());
        payment.setDate(curDate);
        t.setIniDate(curDate);
        t.setMessage(messageJTextField.getText());
        if (payPriceJTextField.getText().equals(String.valueOf(payment.getInvoice().getOrder().getEachOrderPrice()))) {
            invoice.setInvoiceStatus(Invoice.Paid);
            payment.setPaymentMethod("FullPayment");
            JOptionPane.showMessageDialog(null, "Thank you! You've completely paid!");
        } else {
            invoice.setInvoiceStatus(Invoice.PartialPaid);
            payment.setPaymentMethod("Installment");
            JOptionPane.showMessageDialog(null, "Thank you! You've partically paid!");
        }
        }
        }
       
//        fa.getTranscationList().getTranscationList().add(t);
        for(Organization o:business.getDepartmentDirectory().getDepartmentList()){
        if(o.getType().equals(Organization.OrganizationType.AmazonAccountingDept)){
        o.getTranscationList().getTranscationList().add(t);
        }
        }
//        business.getTranscationList().getTranscationList().add(t);
        
    }//GEN-LAST:event_confirmJButtonActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void creditCardJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditCardJRadioButtonActionPerformed
        // TODO add your handling code here:
        check();
    }//GEN-LAST:event_creditCardJRadioButtonActionPerformed

    private void debitCardJRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debitCardJRadioButtonActionPerformed
        // TODO add your handling code here:
         check();
    }//GEN-LAST:event_debitCardJRadioButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountNoJTextField;
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton cancelJButton;
    private javax.swing.JButton confirmJButton;
    private javax.swing.JPasswordField confirmNoJPasswordField;
    private javax.swing.JRadioButton creditCardJRadioButton;
    private javax.swing.JRadioButton debitCardJRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel makePaymentJPanel;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JTextField payPriceJTextField;
    // End of variables declaration//GEN-END:variables
}
