/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AmazonRole.AccountingDeptRole;

import business.Business;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import system.Enterprise.Enterprise;
import system.NetWork.NetWork;
import system.Order.OrderItem;
import system.Organization.Organization;
import system.Payment.Payment;
import system.Product.Product;
import system.Shipping.Shipping;
import system.Transcation.Transcation;
import system.UserAccount.UserAccount;
import system.finacialAccount.FinacialAccount;

/**
 *
 * @author Administrator
 */
public class TransferJPanel extends javax.swing.JPanel {

    JPanel container;
    Business business;
//    Customer c;
//    Organization o;
    UserAccount ua;
    Transcation nt = new Transcation();
    Transcation t;
// Organization pmO;

    public TransferJPanel(JPanel container, Business business,
            //            Customer c,
            //            Organization o,
            UserAccount ua,
            Transcation t) {
        initComponents();
        this.container = container;
        this.business = business;
//        this.c=c;
//        this.o = o;
        this.ua = ua;
        this.t = t;

//            for(Organization o: business.getDepartmentDirectory().getDepartmentList()){
//            if(o.getType().equals(Organization.OrganizationType.AmazonSalesDept)){
//            this.salesO=o;
//            }
//            }
//        populateRole();
//        populateEnterprise();
        payJPanel.setVisible(false);
        enterpriseJComboBox.setVisible(false);
        customerJComboBox.setVisible(false);
    }

    private void popCustomer() {
        customerJComboBox.removeAllItems();
        for (UserAccount u : business.getUserAccountDirectoty().getUserAccountList()) {
//      for(Customer c: business.getCustomerDirectory().getCustomerList()){
//        if(u.getPerson().equals() ){
            if (t.getpReceiver() != null) {
                if (t.getpReceiver().getPerson().equals(u.getPerson())) //           if(user.getPerson()!=null){
                {
                    customerJComboBox.addItem(u);
                }
            } else if (t.getIniCreater().getPerson().equals(u.getPerson())) {
                customerJComboBox.addItem(u);

            }
//        }

//    }
        }
    }
//   private void popCustomer(){
//    customerJComboBox.removeAllItems();
//    for(Organization o: business.getDepartmentDirectory().getDepartmentList()){
//    if(o.getType().equals(Organization.OrganizationType.CustomerDept)){
//      for(UserAccount user: o.getUserAccountDirectoty().getUserAccountList()){
//           if(user.getPerson()!=null){
//           customerJComboBox.addItem(user);
//           }
//    }
//    }
//    }
//  
//    }

    private void populateEnterprise(ArrayList<Enterprise> eList) {
        enterpriseJComboBox.removeAllItems();
        for (Enterprise e : eList) {
            enterpriseJComboBox.addItem(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backjButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        enterpriseJButton = new javax.swing.JButton();
        personJButton = new javax.swing.JButton();
        customerJComboBox = new javax.swing.JComboBox();
        payJPanel = new javax.swing.JPanel();
        amountJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        accountNoJTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        confirmNoJPasswordField = new javax.swing.JPasswordField();
        cancelJButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Transfer");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backjButton1.setText("Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 70, 20));

        jLabel3.setText("To:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseJComboBoxActionPerformed(evt);
            }
        });
        add(enterpriseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 180, -1));

        enterpriseJButton.setText("Enterprise");
        enterpriseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseJButtonActionPerformed(evt);
            }
        });
        add(enterpriseJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        personJButton.setText("Person");
        personJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personJButtonActionPerformed(evt);
            }
        });
        add(personJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        customerJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        customerJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerJComboBoxActionPerformed(evt);
            }
        });
        add(customerJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 180, -1));

        payJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        payJPanel.add(amountJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 110, -1));

        jLabel7.setText("Account No:");
        payJPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel8.setText("Make Payment");
        payJPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel9.setText("Amount:");
        payJPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        payJPanel.add(accountNoJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 110, -1));

        jLabel10.setText("Security No:");
        payJPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        payJPanel.add(confirmNoJPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 110, -1));

        cancelJButton.setText("Cancel");
        cancelJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelJButtonActionPerformed(evt);
            }
        });
        payJPanel.add(cancelJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel11.setText("Message:");
        payJPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        messageJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageJTextFieldActionPerformed(evt);
            }
        });
        payJPanel.add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 110, -1));

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        payJPanel.add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 70, -1));

        add(payJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 340, 220));
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void enterpriseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseJComboBoxActionPerformed
        // TODO add your handling code here:
        payJPanel.setVisible(true);
        //          Enterprise e= (Enterprise)enterpriseJComboBox.getSelectedItem();
        //        nt.setReceiver(e);
        //        e.getTranscationList().getTranscationList().add(nt);
    }//GEN-LAST:event_enterpriseJComboBoxActionPerformed

    private void enterpriseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseJButtonActionPerformed
        // TODO add your handling code here:
        ArrayList<Enterprise> eList = new ArrayList<>();
        for (NetWork n : business.getNetWorkDirectory().getNetWorkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
//                     if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.LocalRetalier)||e.getEnterpriseType().equals(Enterprise.EnterpriseType.ShippingEnterprise))
//                 for(Organization o: e.getDepartmentDirectory().getDepartmentList()){
//                     if(o.getType().equals(Organization.OrganizationType.EnterpriseAccountingDept))
//                 for(Role r: o.getSupportedRoles()){
                if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.LocalRetalier)) {
                    for (OrderItem oi : t.getO().getOis()) {
                        for (Organization o : e.getDepartmentDirectory().getDepartmentList()) {
                            if (o.getType().equals(Organization.OrganizationType.ProductManageDept)) {
                                for (Product p : o.getProductCatalog().getProductList()) {
                                    if (p.equals(oi.getProduct())) {
                                        eList.add(e);
//                                        populateEnterprise(eList);
                                    }
                                }
                            }
                        }
                    }
                } else if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.ShippingEnterprise)) {
                    for (OrderItem oi : t.getO().getOis()) {
                        for (Organization o : e.getDepartmentDirectory().getDepartmentList()) {
                            if (o.getType().equals(Organization.OrganizationType.ShippingDept)) {
                                for (Shipping s : o.getShippingList().getShippingList()) {
                                    if (s.getOi().equals(oi)) {
                                        eList.add(e);
//                                        populateEnterprise(e);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        populateEnterprise(eList);
        enterpriseJComboBox.setVisible(true);
        customerJComboBox.setVisible(false);
//        populateEnterprise();
        //        Enterprise e= (Enterprise)enterpriseJComboBox.getSelectedItem();
        //        nt.setReceiver(e);
        //        e.getTranscationList().getTranscationList().add(nt);
    }//GEN-LAST:event_enterpriseJButtonActionPerformed

    private void personJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personJButtonActionPerformed
        // TODO add your handling code here:
        if (business.getCustomerDirectory().getCustomerList().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Record");
            return;
        }
        customerJComboBox.setVisible(true);
        enterpriseJComboBox.setVisible(false);
        popCustomer();

    }//GEN-LAST:event_personJButtonActionPerformed

    private void customerJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerJComboBoxActionPerformed
        // TODO add your handling code here:
        payJPanel.setVisible(true);
    }//GEN-LAST:event_customerJComboBoxActionPerformed

    private void cancelJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelJButtonActionPerformed
        // TODO add your handling code here:

        payJPanel.setVisible(false);
    }//GEN-LAST:event_cancelJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        // TODO add your handling code here:
        if (messageJTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Message is null!");
            return;
        }
        FinacialAccount fa = ua.getFinacialAccountList().creFinacialAccount();
        fa.setAccountNo(accountNoJTextField.getText());
        //        fa.setTranscationList(null);

        nt.setIniCreater(ua);
        nt.setO(t.getO());
        //        t.setReceiver((Enterprise)enterpriseJComboBox.getSelectedItem());
        //        System.out.print(t.getReceiver());
        nt.setMessage(messageJTextField.getText());
        //        t.setO(invoice.getOrder());
        Payment payment = business.getPaymentList().crePayment();
        nt.setPayment(payment);

        String paidPrice = amountJTextField.getText();
        double paidP;
        try {
            paidP = Double.parseDouble(paidPrice);
            if (paidP >= 0) {
                payment.setPaidPrice(paidP);
                nt.setMoneyAmount(paidP);
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Invalid Information!");
            return;
        }


        fa.setDebt(paidP);
        //        payment.setInvoice(invoice);
        //      SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:MM:SS");
        Date curDate = new Date(System.currentTimeMillis());
        payment.setDate(curDate);
        nt.setIniDate(curDate);
        //      fa.getTranscationList().getTranscationList().add(t);
        //          e.getTranscationList().getTranscationList().add(nt);
        if (enterpriseJComboBox.isVisible() == true) {
            Enterprise e = (Enterprise) enterpriseJComboBox.getSelectedItem();
            nt.setReceiver(e);
            for (Organization o : e.getDepartmentDirectory().getDepartmentList()) {
                if (o.getType().equals(Organization.OrganizationType.EnterpriseAccountingDept)) {
                    o.getTranscationList().getTranscationList().add(nt);
                }
            }
            //         e.getTranscationList().getTranscationList().add(nt);
        } else {
//              Customer c= (Customer)customerJComboBox.getSelectedItem();
            UserAccount p = (UserAccount) customerJComboBox.getSelectedItem();
//            for(UserAccount p: business.getUserAccountDirectoty().getUserAccountList()){
//            if(ua.getPerson().equals(c)){
            nt.setpReceiver(p);
//            }
//            }

//            UserAccount p= (UserAccount)customerJComboBox.getSelectedItem();
//            nt.setpReceiver(p);
            //        System.out.println("nt.receiver"+nt.getpReceiver());
        }
        for (Organization o : business.getDepartmentDirectory().getDepartmentList()) {
            if (o.getType().equals(Organization.OrganizationType.AmazonAccountingDept)) {
                o.getTranscationList().getTranscationList().add(nt);
            }
        }
        //        business.getTranscationList().getTranscationList().add(nt);

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void messageJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageJTextFieldActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountNoJTextField;
    private javax.swing.JTextField amountJTextField;
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton cancelJButton;
    private javax.swing.JPasswordField confirmNoJPasswordField;
    private javax.swing.JComboBox customerJComboBox;
    private javax.swing.JButton enterpriseJButton;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JPanel payJPanel;
    private javax.swing.JButton personJButton;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
