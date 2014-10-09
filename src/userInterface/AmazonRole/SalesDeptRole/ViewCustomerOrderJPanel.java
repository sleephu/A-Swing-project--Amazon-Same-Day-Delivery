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
import system.Order.Order;
import system.Order.OrderItem;
import system.Organization.Organization;
import system.Product.Product;

/**
 *
 * @author Administrator
 */
public class ViewCustomerOrderJPanel extends javax.swing.JPanel {

     JPanel userProcessContainer;
    Business business;
    public ViewCustomerOrderJPanel(JPanel userProcessContainer,Business business) {
        initComponents();
          this.userProcessContainer =userProcessContainer;
        this.business=business;
//        this.e=e;
        orderItemJPanel.setVisible(false);
        popData();
    }

    private void popData(){
     int rowCount = orderJTable.getRowCount();
        for(int i=rowCount -1; i>=0; i--){
            ((DefaultTableModel)orderJTable.getModel()).removeRow(i);
        }
//        for(NetWork n:business.getNetWorkDirectory().getNetWorkList()){
//        for(Enterprise en:n.getEnterpriseDirectory().getEnterpriseList()){
//         if(en.getEnterpriseName().equals(e.getEnterpriseName())){
        for(Organization or:business.getDepartmentDirectory().getDepartmentList()){
        if(or.getType().equals(Organization.OrganizationType.AmazonSalesDept)){
           for(Order o: or.getMasterOrderList().getOrders()){
//          for(OrderItem oi:o.getOis()){
//           for(Product p: e.getProductCatalog().getProductList())
        {
//            if(oi.getProduct().equals(p)&&p.getLeftProduct().getLeftQuantity()!=p.getQuantity()){
            Object row[] = new Object[34];
            row[0] = o;
            row[1] = o.getCustomer();
            row[2]=o.getEachOrderPrice();
            row[3]=o.getOrderStatus();
//            row[3] = oi.getQuantity();
//            row[4]=p.getTargetPrice();
//            row[5]=p.getTargetPrice()*oi.getQuantity();
 
            ((DefaultTableModel)orderJTable.getModel()).addRow(row);
        }
   }
        }
        }
      
//          }
//         }
//         }
//        }
//        }     
   }
    private void popOITable(Order o) {
        int rowCount = orderItemJTable.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) orderItemJTable.getModel()).removeRow(i);
        }

        for(OrderItem oi:o.getOis()) {
        Object row[] = new Object[7];
        row[0] = oi.getProduct().getProductId();
        row[1] = oi.getProduct().getName();
        row[2] = oi.getProduct().getTargetPrice();
        row[3] = oi.getProduct().getActualPrice();
        row[4] = oi.getQuantity();
        row[5]=oi.getProduct().getActualPrice()*oi.getQuantity();
        for(NetWork n: business.getNetWorkDirectory().getNetWorkList()){
        for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
            if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.LocalRetalier)){
            for(Organization or: e.getDepartmentDirectory().getDepartmentList()){
            if(or.getType().equals(Organization.OrganizationType.ProductManageDept)){
                for(Product p:or.getProductCatalog().getProductList()){
         if(p.equals(oi.getProduct())){
          row[6]=e.getEnterpriseName();
         }
         }
            }
            }
            }
     
        }
        }
         ((DefaultTableModel)orderItemJTable.getModel()).addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderJTable = new javax.swing.JTable();
        backButton4 = new javax.swing.JButton();
        orderItemJPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderItemJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        viewDetailJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("View Customer Order");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        orderJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "Customer UserName", "OrderAmount", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 690, 130));

        backButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backButton4.setText("<< Back");
        backButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton4ActionPerformed(evt);
            }
        });
        add(backButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 110, -1));

        orderItemJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orderItemJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductID", "ProductName", "Target Price", "Actual Price", "Quantity", "Amount", "LocalRetailer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderItemJTable);

        orderItemJPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 40, 610, 110));

        jLabel2.setText("View Order Detail");
        orderItemJPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        add(orderItemJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 670, 180));

        viewDetailJButton.setText("View Detail");
        viewDetailJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailJButtonActionPerformed(evt);
            }
        });
        add(viewDetailJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton4ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButton4ActionPerformed

    private void viewDetailJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailJButtonActionPerformed
        // TODO add your handling code here:
        orderItemJPanel.setVisible(true);
        int selectedRow = orderJTable.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }

        Order o = (Order) orderJTable.getValueAt(selectedRow, 0);
        popOITable(o);
    }//GEN-LAST:event_viewDetailJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel orderItemJPanel;
    private javax.swing.JTable orderItemJTable;
    private javax.swing.JTable orderJTable;
    private javax.swing.JButton viewDetailJButton;
    // End of variables declaration//GEN-END:variables
}
