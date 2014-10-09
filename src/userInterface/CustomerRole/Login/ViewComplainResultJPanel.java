/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.CustomerRole.Login;

import business.Business;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import system.Customer.Customer;
import system.Order.Order;
import system.Order.OrderItem;
import system.Organization.Organization;
import system.UserAccount.UserAccount;
import system.WorkQueue.WorkRequest;

public class ViewComplainResultJPanel extends javax.swing.JPanel {

    JPanel container;
    Customer c;
    Business business;
    UserAccount userAccount;

    public ViewComplainResultJPanel(
            JPanel container,
            Business business,
            Customer c, 
            UserAccount userAccount) {
        initComponents();
        this.container = container;
        this.c = c;
        this.business = business;
        this.userAccount = userAccount;
        populateTableData();
        
    }
private void populateTableData() {
        DefaultTableModel model = (DefaultTableModel)complainJTable.getModel();
        model.setNumRows(0);
//        for(NetWork n: netWorkDirectory.getNetWorkList()){
//        for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
//            if(e instanceof Business){
        for(Organization or: business.getDepartmentDirectory().getDepartmentList()){
            if(or.getType().equals(Organization.OrganizationType.CustomerDept)){
        for (WorkRequest wr : or.getWorkQueue().getWorkRequestList()) {
//            System.out.println("wr:"+wr);
            
//           ua.setOrganizationType(Organization.OrganizationType.CustomerDept); 
//            if(wr.getId()==13){
//                 System.out.println(wr.getReceiverO()+"rrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
             if(wr.getWorkRequestType().equals(WorkRequest.WorkRequestType.CustomerComplainRequest)&&wr.getSender().equals(userAccount)){
            Object[] row = new Object[9];
            row[0] = wr;    // don't need to get message
            row[1] =wr.getSender().getUserName();
            for(Organization organization: business.getDepartmentDirectory().getDepartmentList()){
            if(organization.getType().equals(Organization.OrganizationType.AmazonSalesDept)){
             for(Order o: organization.getMasterOrderList().getOrders()){
                for(OrderItem oi:o.getOis()){
                if(o.getCustomer().equals(wr.getSender())&&oi.equals(wr.getOrderItem())){
            row[2]=o.getOrderNum();
            row[3]=oi.getProduct().getName();
            }
            }
          
        } 
            
            }
            }
            row[4]=wr.getTypeInfo();
            row[5] = wr.getMessage();
            row[6] = wr.getStatus();
            row[7] = wr.getIniDate();
            row[8]=wr.getCompleDate();
           
            model.addRow(row);
             }    
            
            }
 }
 }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        complainJPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        complainJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("View Complain Result");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        complainJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        complainJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ComplainID", "UserName", "OrderId", "OrderItem", "ComplainType", "Reason", "Status", "RequestDate", "ProcessedDate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(complainJTable);

        complainJPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 750, 110));

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        complainJPanel.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        add(complainJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 810, 220));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JPanel complainJPanel;
    private javax.swing.JTable complainJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
