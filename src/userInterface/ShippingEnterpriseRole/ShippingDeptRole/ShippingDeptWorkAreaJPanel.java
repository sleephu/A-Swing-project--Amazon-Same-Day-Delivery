/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ShippingEnterpriseRole.ShippingDeptRole;

import userInterface.ShippingEnterpriseRole.*;
import business.Business;
import java.awt.CardLayout;
import javax.swing.JPanel;
import system.Enterprise.Enterprise;
import system.Organization.Organization;
import system.UserAccount.UserAccount;

/**
 *
 * @author Administrator
 */
public class ShippingDeptWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ShippingEnterpriseJPanel
     */
     JPanel container;
    Business business;
    UserAccount ua;
//    ShippingEnterprise shippingEnterprise;
    Enterprise e;
    Organization o;
    public ShippingDeptWorkAreaJPanel(JPanel container, Business business, UserAccount ua,
    Enterprise e,Organization o) {
        initComponents();
        this.container = container;
        this.business= business;
        this.ua =ua;
//        this.shippingEnterprise= (ShippingEnterprise)enterprise;
        this.e =e;
        this.o=o;
        sdptNameJLabel.setText(ua.getUserName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageEmployeeJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sdptNameJLabel = new javax.swing.JLabel();
        manageProcessJButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageEmployeeJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageEmployeeJButton.setText("Manage Shipping Request");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 300, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -ShippingDept Role:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        sdptNameJLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sdptNameJLabel.setText("jLabel2");
        add(sdptNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 100, 30));

        manageProcessJButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageProcessJButton1.setText("Manage Shipping Process");
        manageProcessJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageProcessJButton1ActionPerformed(evt);
            }
        });
        add(manageProcessJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 300, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        ManageShippingOrderJPanel manageShippingOrderJPanel = new ManageShippingOrderJPanel(container,business, e,o);
        container.add("ManageShippingOrderJPanel", manageShippingOrderJPanel);

        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageProcessJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageProcessJButton1ActionPerformed
        // TODO add your handling code here:
         ManageShippingProcessJPanel ManageShippingProcessJPanel = new ManageShippingProcessJPanel(container,business, e,o);
        container.add("ManageShippingProcessJPanel", ManageShippingProcessJPanel);

        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_manageProcessJButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageProcessJButton1;
    private javax.swing.JLabel sdptNameJLabel;
    // End of variables declaration//GEN-END:variables
}
