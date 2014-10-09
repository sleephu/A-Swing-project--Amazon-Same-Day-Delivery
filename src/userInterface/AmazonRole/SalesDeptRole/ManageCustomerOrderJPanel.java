/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AmazonRole.SalesDeptRole;

import business.Business;
import java.awt.CardLayout;
import javax.swing.JPanel;
import system.UserAccount.UserAccount;

/**
 *
 * @author Administrator
 */
public class ManageCustomerOrderJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Business business;
//    Enterprise e;
UserAccount ua;
    public ManageCustomerOrderJPanel(JPanel userProcessContainer, Business business, //    Enterprise e
           UserAccount ua ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.ua=ua;
//        this.e=e;
//        orderItemJPanel.setVisible(false);
//        popData();
    }
//
//   private void popData(){
//     int rowCount = orderJTable.getRowCount();
//        for(int i=rowCount -1; i>=0; i--){
//            ((DefaultTableModel)orderJTable.getModel()).removeRow(i);
//        }
////        for(NetWork n:business.getNetWorkDirectory().getNetWorkList()){
////        for(Enterprise en:n.getEnterpriseDirectory().getEnterpriseList()){
////         if(en.getEnterpriseName().equals(e.getEnterpriseName())){
//         for(Order o: business.getMasterOrderList().getOrders()){
////          for(OrderItem oi:o.getOis()){
////           for(Product p: e.getProductCatalog().getProductList())
//        {
////            if(oi.getProduct().equals(p)&&p.getLeftProduct().getLeftQuantity()!=p.getQuantity()){
//            Object row[] = new Object[3];
//            row[0] = o;
//            row[1] = o.getCustomer();
//            row[2]=o.getEachOrderPrice();
////            row[3] = oi.getQuantity();
////            row[4]=p.getTargetPrice();
////            row[5]=p.getTargetPrice()*oi.getQuantity();
// 
//            ((DefaultTableModel)orderJTable.getModel()).addRow(row);
//        }
//   }
////          }
////         }
////         }
////        }
////        }     
//   }
//    private void popOITable(Order o) {
//        int rowCount = orderJTable.getRowCount();
//        for (int i = rowCount - 1; i >= 0; i--) {
//            ((DefaultTableModel) orderJTable.getModel()).removeRow(i);
//        }
//
//        for(OrderItem oi:o.getOis()) {
//        Object row[] = new Object[7];
//        row[0] = oi.getProduct().getProductId();
//        row[1] = oi.getProduct().getName();
//        row[2] = oi.getProduct().getTargetPrice();
//        row[3] = oi.getProduct().getActualPrice();
//        row[4] = oi.getQuantity();
//        row[5]=oi.getProduct().getActualPrice()*oi.getQuantity();
//        for(NetWork n: business.getNetWorkDirectory().getNetWorkList()){
//        for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
//         for(Product p:e.getProductCatalog().getProductList()){
//         if(p.equals(oi.getProduct())){
//          row[6]=e.getEnterpriseName();
//         }
//         }
//        }
//        }
//         ((DefaultTableModel) orderJTable.getModel()).addRow(row);
//        }
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        viewCustomerOrderJButton = new javax.swing.JButton();
        customerReturnRequestJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Customer Order");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        viewCustomerOrderJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewCustomerOrderJButton.setText("View Customer Order");
        viewCustomerOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomerOrderJButtonActionPerformed(evt);
            }
        });
        add(viewCustomerOrderJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 240, -1));

        customerReturnRequestJButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        customerReturnRequestJButton.setText("Manage Customer Return Request");
        customerReturnRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerReturnRequestJButtonActionPerformed(evt);
            }
        });
        add(customerReturnRequestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 370, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void viewCustomerOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustomerOrderJButtonActionPerformed
        // TODO add your handling code here:

        ViewCustomerOrderJPanel viewCustomerOrderJPanel = new ViewCustomerOrderJPanel(userProcessContainer, business);
        userProcessContainer.add("ViewCustomerOrderJPanel", viewCustomerOrderJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewCustomerOrderJButtonActionPerformed

    private void customerReturnRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerReturnRequestJButtonActionPerformed
        // TODO add your handling code here:
           ManageReturnRequestJPanel manageReturnRequestJPanel = new ManageReturnRequestJPanel(userProcessContainer, business,ua);
        userProcessContainer.add("ManageReturnRequestJPanel", manageReturnRequestJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_customerReturnRequestJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton customerReturnRequestJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton viewCustomerOrderJButton;
    // End of variables declaration//GEN-END:variables
}
