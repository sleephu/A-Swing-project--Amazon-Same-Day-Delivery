/*
 * ProductManagerWorkAreaJPanel.java
 *
 * Created on October 3, 2008, 8:06 AM
 */
package userInterface.SupplierRole.AccountingDeptRole;

import business.Business;
import java.awt.CardLayout;
import javax.swing.JPanel;
import system.Enterprise.Enterprise;
import system.Organization.Organization;
import system.UserAccount.UserAccount;

/**
 *
 * @author Rushabh
 */
public class AccountingDeptWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
//    Supplier supplier;
    Enterprise e;
    UserAccount ua;
    Business business;
    Organization o;

    /**
     * Creates new form ProductManagerWorkAreaJPanel
     */
    public AccountingDeptWorkAreaJPanel(JPanel userProcessContainer, UserAccount ua, Business business, Enterprise e, Organization o) {

        initComponents();
        this.userProcessContainer = userProcessContainer;
//        this.supplier = (Supplier)e;
        this.e = e;
        this.ua = ua;
        this.business = business;
        this.o = o;
        lblSupplierName.setText(ua.getUserName());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        manageFAButton = new javax.swing.JButton();
        lblSupplierName = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area (Accounting Dept Role) :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        manageFAButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageFAButton.setText("View Transaction History >>");
        manageFAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageFAButtonActionPerformed(evt);
            }
        });
        add(manageFAButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        lblSupplierName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add(lblSupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 130, 30));
    }// </editor-fold>//GEN-END:initComponents
    private void manageFAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageFAButtonActionPerformed

        ViewTransactionHistoryJPanel viewTransactionHistoryJPanel = new ViewTransactionHistoryJPanel(userProcessContainer, business, e, o, ua);
        userProcessContainer.add("ViewTransactionHistoryJPanel", viewTransactionHistoryJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageFAButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblSupplierName;
    private javax.swing.JButton manageFAButton;
    // End of variables declaration//GEN-END:variables
}