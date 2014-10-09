/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ShippingEnterpriseRole;

import business.Business;
import java.awt.CardLayout;
import javax.swing.JPanel;
import system.Enterprise.Enterprise;
import system.UserAccount.UserAccount;


public class ShippingEnterpriseWorkAreaJPanel extends javax.swing.JPanel {

     JPanel container;
    Business business;
    UserAccount ua;
//    ShippingEnterprise shippingEnterprise;
    Enterprise enterprise;
    public ShippingEnterpriseWorkAreaJPanel(JPanel container, Business business, UserAccount ua,
    Enterprise enterprise) {
        initComponents();
        this.container = container;
        this.business= business;
        this.ua =ua;
//        this.shippingEnterprise= (ShippingEnterprise)enterprise;
        this.enterprise =enterprise;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageOrganizationJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        userJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        manageLocationJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageOrganizationJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 240, -1));

        manageEmployeeJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 240, -1));

        userJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userJButton.setText("Manage User");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 240, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Shipping Enterprise AdminRole");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        manageLocationJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageLocationJButton.setText("Manage Location");
        manageLocationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageLocationJButtonActionPerformed(evt);
            }
        });
        add(manageLocationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 240, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(container, enterprise);
        container.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(container, enterprise);
        container.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(container,business, enterprise);
        container.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout)container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageLocationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageLocationJButtonActionPerformed
        // TODO add your handling code here:

        ManageLocationJPanel manageLocationJPanel = new ManageLocationJPanel(container, enterprise,business);
        container.add("ManageLocationJPanel", manageLocationJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_manageLocationJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageLocationJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    // End of variables declaration//GEN-END:variables
}
