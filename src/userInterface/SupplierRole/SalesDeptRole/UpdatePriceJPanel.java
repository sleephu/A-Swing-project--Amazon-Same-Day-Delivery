/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SupplierRole.SalesDeptRole;

import java.awt.CardLayout;
import javax.swing.JPanel;
import system.Order.OrderItem;
import system.Product.Product;

/**
 *
 * @author Administrator
 */
public class UpdatePriceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdatePriceJPanel
     */
    JPanel userProcessContainer;
//    Business business;
    OrderItem oi;
    Product product;
    public UpdatePriceJPanel(JPanel userProcessContainer,
//    Business business,
//    OrderItem oi
    Product product
            ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
//        this.business =business;
//        this.product = oi.getProduct();
     this.product =product;
//        this.oi =oi;
        nameField.setText(product.getName());
        idField.setText(String.valueOf(product.getProductId()));
          targetPriceField.setText(String.valueOf(product.getTargetPrice()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        targetPriceField = new javax.swing.JTextField();
        backButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        saveButton1 = new javax.swing.JButton();
        updateButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Update Price");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 29, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Product ID:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 139, 100, 30));

        idField.setEditable(false);
        idField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 139, 210, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Product Target Price:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 189, 170, 30));

        targetPriceField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(targetPriceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 189, 210, 30));

        backButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton1.setText("<< Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Product Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 99, -1, 30));

        nameField.setEditable(false);
        nameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 99, 210, -1));

        saveButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        saveButton1.setText("SAVE");
        saveButton1.setEnabled(false);
        saveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton1ActionPerformed(evt);
            }
        });
        add(saveButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 281, 70, 30));

        updateButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updateButton1.setText("Update Price");
        updateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButton1ActionPerformed(evt);
            }
        });
        add(updateButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 141, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButton1ActionPerformed

    private void saveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton1ActionPerformed

//        product.setName(nameField.getText());
        product.setTargetPrice(Double.parseDouble(targetPriceField.getText()));
//        product.setQuantity(Integer.parseInt(quantityField.getText()));
//        product.setLeftQuantity(product.getQuantity());
        nameField.setEditable(false);
//        targetPriceField.setEditable(false);
//        quantityField.setEditable(false);
        saveButton1.setEnabled(false);
    }//GEN-LAST:event_saveButton1ActionPerformed

    private void updateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButton1ActionPerformed
        nameField.setEditable(true);
        targetPriceField.setEditable(true);
//        quantityField.setEditable(true);
        saveButton1.setEnabled(true);
    }//GEN-LAST:event_updateButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton1;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton saveButton1;
    private javax.swing.JTextField targetPriceField;
    private javax.swing.JButton updateButton1;
    // End of variables declaration//GEN-END:variables
}
