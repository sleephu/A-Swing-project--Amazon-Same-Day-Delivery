/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AmazonRole.ShippingDept;

import business.Business;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import system.Enterprise.Enterprise;
import system.Order.Order;
import system.Order.OrderItem;
import system.Organization.Organization;
import system.Shipping.Shipping;


public class ManageShippingProcessJPanel extends javax.swing.JPanel {
JPanel container;
Business business;
Enterprise e;
Organization shippingO;
    public ManageShippingProcessJPanel(JPanel container,
Business business
) {
        initComponents();
        this.container=container;
        this.business=business;
//        this.e=e;
//        this.o=o;
        for(Organization o:business.getDepartmentDirectory().getDepartmentList()){
        if(o.getType().equals(Organization.OrganizationType.AmazonShippingDept)){
        shippingO=o;
        }
        }
        populateData();
    }
 private void populateData(){
    DefaultTableModel model = (DefaultTableModel)shippingJTable.getModel();
        model.setNumRows(0);
//        for(NetWork n: netWorkDirectory.getNetWorkList()){
//        for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
//            if(e instanceof Business){
        for (Shipping s: shippingO.getShippingList().getShippingList()) {
//            System.out.println("wr:"+wr);
//            if(s.getShippingRequest().getCustomerShippingRequest().getShippingEnterprise().equals(e)){
//           ua.setOrganizationType(Organization.OrganizationType.CustomerDept); 
//            if(wr.getId()==13){
//                 System.out.println(wr.getReceiverO()+"rrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
//             if(wr.getWorkRequestType().equals(WorkRequest.WorkRequestType.CustomerShippingRequest)){
            Object[] row = new Object[11];
            row[0] = s;    // don't need to get message
           for(Organization or:business.getDepartmentDirectory().getDepartmentList()){
           if(or.getType().equals(Organization.OrganizationType.AmazonSalesDept)){
           for(Order order: or.getMasterOrderList().getOrders()){
                for(OrderItem oi:order.getOis()){
                if(oi.equals(s.getOi())){
            row[1]=order.getOrderNum();
            }
                }
               
        }
           }
           }
             row[2]=s.getOi().getProduct().getName();
                 row[3] =s.getShippingRequest().getCustomerShippingRequest().getSender().getPerson().getFirstName()+""+s.getShippingRequest().getCustomerShippingRequest().getSender().getPerson().getLastName();
//            }
            row[4]=s.getShippingRequest().getCustomerShippingRequest().getSender().getPerson().getLocation().getCountry()+"/"+s.getShippingRequest().getCustomerShippingRequest().getSender().getPerson().getLocation().getState()+"/"+s.getShippingRequest().getCustomerShippingRequest().getSender().getPerson().getLocation().getCity()+"/"+s.getShippingRequest().getCustomerShippingRequest().getSender().getPerson().getLocation().getStreet();
            row[5] = s.getShippingRequest().getTypeInfo();
           row[6]=s.getShippingRequest().getCustomerShippingRequest().getShippingEnterprise();
            row[7]=s.getDeliveredEmployee();
           row[8]=s.getShippingDate();
           row[9]=s.getDeliveredDate();
           row[10]=s.getStatus();
           
            model.addRow(row);
             }    
            
//            }
// }
  
  }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        shippingJTable = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Shipping Process");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        shippingJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ShippingID", "OrderID", "OrderItem", "CustomerName", "Customer Location", "ShippingType", "ShippingEnterprise", "DeliverEmployee", "ShippingDate", "DeliveredDate", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(shippingJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 960, 100));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable shippingJTable;
    // End of variables declaration//GEN-END:variables
}
