/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SupplierRole.SalesDeptRole;

import business.Business;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import system.Enterprise.Enterprise;
import system.Order.Order;
import system.Order.OrderItem;
import system.Organization.Organization;
import system.Product.Product;

/**
 *
 * @author Administrator
 */
public class ManageCustomerOrderJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Business business;
    Enterprise e;
    Organization pmO;
    public ManageCustomerOrderJPanel(JPanel userProcessContainer,Business business,
    Enterprise e) {
        initComponents();
        this.userProcessContainer =userProcessContainer;
        this.business=business;
        this.e=e;
        for(Organization o: e.getDepartmentDirectory().getDepartmentList()){
        if(o.getType().equals(Organization.OrganizationType.ProductManageDept)){
        this.pmO=o;
        }
        }
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
          for(OrderItem oi:o.getOis()){
           for(Product p: pmO.getProductCatalog().getProductList())
        {
            if(oi.getProduct().equals(p)){
//                    &&p.getLeftProduct().getLeftQuantity()!=p.getQuantity()
            Object row[] = new Object[6];
            row[0] = o.getCustomer();
            row[1] = p.getProductId();
            row[2]=p.getName();
            row[3] = oi.getQuantity();
            row[4]=p.getTargetPrice();
            row[5]=p.getTargetPrice()*oi.getQuantity()+p.getTax();
 
            ((DefaultTableModel)orderJTable.getModel()).addRow(row);
        }
   }
          }
         }
        }
        }
       
//         }
//        }
//        }
       
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderJTable = new javax.swing.JTable();
        backButton4 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Customer Order");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        orderJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer UserName", "ProductID", "Product Name", "Product Quantity", "Product Price", "Product Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 690, 130));

        backButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton4.setText("<< Back");
        backButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton4ActionPerformed(evt);
            }
        });
        add(backButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton4ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderJTable;
    // End of variables declaration//GEN-END:variables
}
