/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AmazonRole.SalesDeptRole;

import business.Business;
import java.awt.CardLayout;
import javax.swing.JPanel;
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
public class ReportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReportJPanel
     */
    JPanel userProcessContainer;
    Business business;
    
    public ReportJPanel(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        
 populateNetWorkComboBox();
 reportJPanel.setVisible(false);
 for(Organization o: business.getDepartmentDirectory().getDepartmentList()){
   if(o.getType().equals(Organization.OrganizationType.AmazonSalesDept)){
        salesAmountJTextField.setText(String.valueOf(  o.getMasterOrderList().getTotalAmount()));
 
   }
 }

//        topSellingPJTextField.setText(String.valueOf(business.getEmployeeDirectory()));
//        bestCustomerJTextField.setText(String.valueOf(business.bestCustomer()));
//        bestSPJTextField.setText(String.valueOf(business.bestSPSV()));
//        sPJTextField.setText(String.valueOf(business.bestSPHC()));
    }
        public Enterprise getBestEnterprise(NetWork n) {
//        Product bestSellingProduct = null;
        Enterprise bestEnterprise = null;
        double sumE;
        double maxSum=0;
        for (Organization org : business.getDepartmentDirectory().getDepartmentList()) {
            if (org.getType().equals(Organization.OrganizationType.AmazonSalesDept)) {
                for (Order o : org.getMasterOrderList().getOrders()) {
//                  sumE= org.getMasterOrderList().getTotalAmount(n);
//                  if(sumE>maxSum){
//                  maxSum= sumE;
//                  bestEnterprise
//                  }
    for(OrderItem oi: o.getOis()){
    for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
         if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.LocalRetalier)){
         for(Organization or: e.getDepartmentDirectory().getDepartmentList()){
         if(or.getType().equals(Organization.OrganizationType.ProductManageDept)){
         for(Product p: or.getProductCatalog().getProductList()){
    if(oi.getProduct().equals(p)){
    sumE=org.getMasterOrderList().getTotalAmount(n);
    if(sumE>maxSum){
        maxSum= sumE;
        bestEnterprise = e; 
    }
   
    }     
         }
         }
         }
         }
         }
    }
//      sum+= o.getEachOrderPrice();
                }
            }
        }
//     return sumE; 
        return bestEnterprise;
    }
      public Product getBestP(NetWork n) {
        Product bestSellingProduct = null;
//        Enterprise bestEnterprise = null;
        double sumE;
        double maxSum=0;
        for (Organization org : business.getDepartmentDirectory().getDepartmentList()) {
            if (org.getType().equals(Organization.OrganizationType.AmazonSalesDept)) {
                for (Order o : org.getMasterOrderList().getOrders()) {
//                  sumE= org.getMasterOrderList().getTotalAmount(n);
//                  if(sumE>maxSum){
//                  maxSum= sumE;
//                  bestEnterprise
//                  }
    for(OrderItem oi: o.getOis()){
    for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
         if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.LocalRetalier)){
         for(Organization or: e.getDepartmentDirectory().getDepartmentList()){
         if(or.getType().equals(Organization.OrganizationType.ProductManageDept)){
         for(Product p: or.getProductCatalog().getProductList()){
    if(oi.getProduct().equals(p)){
    sumE=org.getMasterOrderList().getTotalAmount(n);
    if(sumE>maxSum){
        maxSum= sumE;
        bestSellingProduct = p; 
    }
   
    }     
         }
         }
         }
         }
         }
    }
//      sum+= o.getEachOrderPrice();
                }
            }
        }
//     return sumE; 
        return bestSellingProduct;
    }
      private void populateNetWorkComboBox(){
        networkJComboBox.removeAllItems();
      
        
        for (NetWork network : business.getNetWorkDirectory().getNetWorkList()){
            networkJComboBox.addItem(network);
        }
      
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        reportJPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        topSellingPJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bestLocalRetailerJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        salesAmountJTextField = new javax.swing.JTextField();
        viewjButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton4.setText("<< Back");
        backButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton4ActionPerformed(evt);
            }
        });
        add(backButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 115, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Report");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        reportJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Top Selling Product:");
        reportJPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        topSellingPJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topSellingPJTextFieldActionPerformed(evt);
            }
        });
        reportJPanel.add(topSellingPJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 147, -1));

        jLabel5.setText("Best Local Retailer:");
        reportJPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        reportJPanel.add(bestLocalRetailerJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 110, -1));

        jLabel4.setText("Network");
        reportJPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        reportJPanel.add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 110, -1));

        add(reportJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 280, 170));

        jLabel6.setText("SalesAmount:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));
        add(salesAmountJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 150, -1));

        viewjButton1.setText("View Best Local Retailer and product of each network");
        viewjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewjButton1ActionPerformed(evt);
            }
        });
        add(viewjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton4ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButton4ActionPerformed

    private void topSellingPJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topSellingPJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_topSellingPJTextFieldActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        NetWork network = (NetWork)networkJComboBox.getSelectedItem();
        if (network != null){
//            reportJPanel.setVisible(true);
           topSellingPJTextField.setText(String.valueOf(getBestP(network)));
          bestLocalRetailerJTextField.setText(String.valueOf(getBestEnterprise(network)));
          
//          totalSAJTextField.setText(String.valueOf(business.getMasterOrderList().getTotalAmount(network)));
//           bestCustomerJTextField.setText(String.valueOf(business.bestCustomer()));
        }
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void viewjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewjButton1ActionPerformed
        // TODO add your handling code here:
        reportJPanel.setVisible(true);
    }//GEN-LAST:event_viewjButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton4;
    private javax.swing.JTextField bestLocalRetailerJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPanel reportJPanel;
    private javax.swing.JTextField salesAmountJTextField;
    private javax.swing.JTextField topSellingPJTextField;
    private javax.swing.JButton viewjButton1;
    // End of variables declaration//GEN-END:variables
}
