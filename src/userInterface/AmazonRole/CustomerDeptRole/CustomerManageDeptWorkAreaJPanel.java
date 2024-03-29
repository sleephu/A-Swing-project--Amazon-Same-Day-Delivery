/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AmazonRole.CustomerDeptRole;

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
public class CustomerManageDeptWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SalesDeptWorkAreaJPanel
     */
      JPanel userProcessContainer;
   Business business;
   UserAccount ua;
   Enterprise e;
   Organization o;
    public CustomerManageDeptWorkAreaJPanel(JPanel userProcessContainer,UserAccount ua,
   Business business,Enterprise e,Organization o) {
        initComponents();
          this.userProcessContainer =userProcessContainer;
        this.ua =ua;
        this.business= business;
        this.e=e;
        this.o=o;
            msdpNameJLabel.setText(ua.getUserName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageCCJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        msdpNameJLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageCCJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageCCJButton.setText("Manage Customer Complain >>");
        manageCCJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCCJButtonActionPerformed(evt);
            }
        });
        add(manageCCJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area (CustomerManageDept Role) :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        msdpNameJLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add(msdpNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 140, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void manageCCJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCCJButtonActionPerformed
        // TODO add your handling code here:
        ManageCustomerComplainJPanel manageCustomerComplainJPanel = new ManageCustomerComplainJPanel(userProcessContainer, business,ua);
        userProcessContainer.add("ManageCustomerComplainJPanel", manageCustomerComplainJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageCCJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageCCJButton;
    private javax.swing.JLabel msdpNameJLabel;
    // End of variables declaration//GEN-END:variables
}
