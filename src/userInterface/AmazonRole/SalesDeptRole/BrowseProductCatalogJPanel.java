/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AmazonRole.SalesDeptRole;

import business.Business;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import system.Enterprise.Enterprise;
import system.NetWork.NetWork;
import system.Organization.Organization;
import system.Product.Product;

import system.Supplier.Supplier;

/**
 *
 * @author Administrator
 */
public class BrowseProductCatalogJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BrowseProductCatalogJPanel
     */
    JPanel userProcessContainer;
    Business business;
    Supplier supplier;

    public BrowseProductCatalogJPanel(JPanel userProcessContainer,
            Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        suppComboBox1.removeAllItems();
        for (NetWork n : business.getNetWorkDirectory().getNetWorkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e instanceof Supplier) {
                    suppComboBox1.addItem(e);
                }
            }
        }
        suppComboBox1ActionPerformed(null);
//        popData();
//        for (Supplier s : business.getSupplierDirectory().getSupplierList()) {
//            suppComboBox1.addItem(s);
//        }
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
        viewPButton = new javax.swing.JButton();
        backButton4 = new javax.swing.JButton();
        delButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productcatalogTable = new javax.swing.JTable();
        suppComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        updatePricejButton1 = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Supplier Product Catalog");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, -1, -1));

        viewPButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewPButton.setText("View Product Detail >>");
        viewPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPButtonActionPerformed(evt);
            }
        });
        add(viewPButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 431, 220, -1));

        backButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton4.setText("<< Back");
        backButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton4ActionPerformed(evt);
            }
        });
        add(backButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 471, 190, -1));

        delButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        delButton5.setText("Delete Product(s)");
        delButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButton5ActionPerformed(evt);
            }
        });
        add(delButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 431, 190, -1));

        productcatalogTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        productcatalogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Model No.", "Target Price", "Actual Price", "Quantity", "Tax"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productcatalogTable);
        productcatalogTable.getColumnModel().getColumn(0).setResizable(false);
        productcatalogTable.getColumnModel().getColumn(1).setResizable(false);
        productcatalogTable.getColumnModel().getColumn(2).setResizable(false);
        productcatalogTable.getColumnModel().getColumn(3).setResizable(false);
        productcatalogTable.getColumnModel().getColumn(4).setResizable(false);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 186, 590, 227));

        suppComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppComboBox1ActionPerformed(evt);
            }
        });
        add(suppComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 78, 250, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Supplier:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 72, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Supplier Product Catalog");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 146, 240, -1));

        updatePricejButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updatePricejButton1.setText("Update Price");
        updatePricejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePricejButton1ActionPerformed(evt);
            }
        });
        add(updatePricejButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 471, 220, -1));

        refreshButton.setText("Refresh");
        refreshButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        refreshButton.setMargin(new java.awt.Insets(2, 1, 2, 1));
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void viewPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPButtonActionPerformed

        int selectedRow = productcatalogTable.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }

        Product product = (Product) productcatalogTable.getValueAt(selectedRow, 0);
        ManageProductJPanel manageProductJPanel = new ManageProductJPanel(userProcessContainer, product);
        userProcessContainer.add("ManageProduct", manageProductJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_viewPButtonActionPerformed

    private void backButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton4ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backButton4ActionPerformed

    private void delButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButton5ActionPerformed

        int selectedRow = productcatalogTable.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }

        Product p = (Product) productcatalogTable.getValueAt(selectedRow, 0);

        supplier.getProductCatalog().removeProduct(p);
    }//GEN-LAST:event_delButton5ActionPerformed

    private void suppComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppComboBox1ActionPerformed
               popData();
//        Supplier selectedSupplier = (Supplier) suppComboBox1.getSelectedItem();
//        if (selectedSupplier == null) {
//            return;
//        }
//
//        int rowCount = productcatalogTable.getRowCount();
//        for (int i = rowCount - 1; i >= 0; i--) {
//            ((DefaultTableModel) productcatalogTable.getModel()).removeRow(i);
//        }
//
//        for (Product p : selectedSupplier.getProductCatalog().getProductList()) {
//            Object row[] = new Object[6];
//            row[0] = p;
//            row[1] = p.getProductId();
//            row[2] = p.getTargetPrice();
//            row[3] = p.getActualPrice();
//            row[4] = p.getLeftProduct().getLeftQuantity();
//            row[5] = p.getTax();
//
//            ((DefaultTableModel) productcatalogTable.getModel()).addRow(row);
//        }

    }//GEN-LAST:event_suppComboBox1ActionPerformed

    private void updatePricejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePricejButton1ActionPerformed
        // TODO add your handling code here:
//        int selectedRow = orderItemJTable.getSelectedRow();
//        if (selectedRow < 0) {
//            return;
//        }
        int selectedRow = productcatalogTable.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }

//        OrderItem oi = (OrderItem) orderItemJTable.getValueAt(selectedRow, 0);
        Product product = (Product) productcatalogTable.getValueAt(selectedRow, 0);
        UpdatePriceJPanel UpdateProductJPanel = new UpdatePriceJPanel(userProcessContainer, business, product);
        userProcessContainer.add("UpdateProductJPanel", UpdateProductJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_updatePricejButton1ActionPerformed
    private void popData() {
        Supplier selectedSupplier = (Supplier) suppComboBox1.getSelectedItem();
        if (selectedSupplier == null) {
            return;
        }

        int rowCount = productcatalogTable.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) productcatalogTable.getModel()).removeRow(i);
        }
for(Organization o: selectedSupplier.getDepartmentDirectory().getDepartmentList()){
if(o.getType().equals(Organization.OrganizationType.ProductManageDept)){
 for (Product p : o.getProductCatalog().getProductList()) {
            Object row[] = new Object[6];
            row[0] = p;
            row[1] = p.getProductId();
            row[2] = p.getTargetPrice();
            row[3] = p.getActualPrice();
            row[4] = p.getLeftProduct().getLeftQuantity();
            row[5] = p.getTax();
            ((DefaultTableModel) productcatalogTable.getModel()).addRow(row);
        }
}
}
       
    }
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed

//        sNameTextField.setText(e.getEnterpriseName());
        popData();



    }//GEN-LAST:event_refreshButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton4;
    private javax.swing.JButton delButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productcatalogTable;
    private javax.swing.JButton refreshButton;
    private javax.swing.JComboBox suppComboBox1;
    private javax.swing.JButton updatePricejButton1;
    private javax.swing.JButton viewPButton;
    // End of variables declaration//GEN-END:variables
}