/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AmazonRole.AccountingDeptRole;

import business.Business;
import java.awt.CardLayout;
import javax.swing.JPanel;
import system.Organization.Organization;
import system.Transcation.Transcation;
import system.UserAccount.UserAccount;

/**
 *
 * @author Administrator
 */
public class AccountDeptWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ShippingEnterpriseJPanel
     */
    JPanel container;
    Business business;
    UserAccount ua;
//    ShippingEnterprise shippingEnterprise;
    Organization accountOrganization;

    public AccountDeptWorkAreaJPanel(JPanel container, Business business, UserAccount ua,
            //    Enterprise enterprise
            Organization organization) {
        initComponents();
        this.container = container;
        this.business = business;
        this.ua = ua;
//        this.shippingEnterprise= (ShippingEnterprise)enterprise;
        this.accountOrganization = organization;
        sdptNameJLabel.setText(ua.getUserName());
         for(Organization o: business.getDepartmentDirectory().getDepartmentList()){
        if(o.getType().equals(Organization.OrganizationType.AmazonAccountingDept)){
         this.accountOrganization=o;   
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

        manageFAJButton = new javax.swing.JButton();
        creTransactionJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sdptNameJLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageFAJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageFAJButton.setText("View Transaction History");
        manageFAJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageFAJButtonActionPerformed(evt);
            }
        });
        add(manageFAJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 260, -1));

        creTransactionJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        creTransactionJButton.setText("Create Transaction");
        creTransactionJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creTransactionJButtonActionPerformed(evt);
            }
        });
        add(creTransactionJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 260, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Accounting Dept Role:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        sdptNameJLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sdptNameJLabel.setText("jLabel2");
        add(sdptNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 100, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void manageFAJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageFAJButtonActionPerformed
//
//         ManageFAJPanel ManageFAJPanel = new ManageFAJPanel(container, business,accountOrganization,ua);
//        container.add("ManageFAJPanel", ManageFAJPanel);
//        CardLayout layout = (CardLayout) container.getLayout();
//        layout.next(container);
        ViewTransactionHistoryJPanel ViewTransactionHistoryJPanel = new ViewTransactionHistoryJPanel(container, business, ua,accountOrganization);
        container.add("ViewTransactionHistoryJPanel", ViewTransactionHistoryJPanel);

        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_manageFAJButtonActionPerformed

    private void creTransactionJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creTransactionJButtonActionPerformed
        // TODO add your handling code here:
        
//        for(Transcation t: accountOrganization.getTranscationList().getTranscationList()){
        CreateTransactionJPanel createTransactionJPanel = new CreateTransactionJPanel(container, business, ua);
        container.add("CreateTransactionJPanel", createTransactionJPanel);

        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
//        }
    }//GEN-LAST:event_creTransactionJButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton creTransactionJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageFAJButton;
    private javax.swing.JLabel sdptNameJLabel;
    // End of variables declaration//GEN-END:variables
}
