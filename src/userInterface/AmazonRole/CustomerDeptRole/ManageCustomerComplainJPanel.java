/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AmazonRole.CustomerDeptRole;

import business.Business;
import java.awt.CardLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import system.Order.Order;
import system.Order.OrderItem;
import system.Organization.Organization;
import system.UserAccount.UserAccount;
import system.WorkQueue.CustomerComplainRequest;
import system.WorkQueue.WorkRequest;

/**
 *
 * @author Administrator
 */
public class ManageCustomerComplainJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomerComplainJPanel
     */
    JPanel container;
    Business business;
    UserAccount ua;
    Organization o;
    public ManageCustomerComplainJPanel(
          JPanel container,
    Business business,
    UserAccount ua
  ) {
        initComponents();
        this.container =container;
        this.business=business;
        this.ua=ua;
        for(Organization organization: business.getDepartmentDirectory().getDepartmentList()){
                     if(organization.getType().equals(Organization.OrganizationType.CustomerDept)){
                     this.o= organization;
                     }
        }
//        this.o=o;
       populateTableData();
    }
 private void populateTableData() {
        DefaultTableModel model = (DefaultTableModel)complainJTable.getModel();
        model.setNumRows(0);
//        for(NetWork n: netWorkDirectory.getNetWorkList()){
//        for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
//            if(e instanceof Business){
        for (WorkRequest wr : o.getWorkQueue().getWorkRequestList()) {
//            System.out.println("wr:"+wr);
            
//           ua.setOrganizationType(Organization.OrganizationType.CustomerDept); 
//            if(wr.getId()==13){
//                 System.out.println(wr.getReceiverO()+"rrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
             if(wr.getWorkRequestType().equals(WorkRequest.WorkRequestType.CustomerComplainRequest)){
            Object[] row = new Object[8];
            row[0] = wr;    // don't need to get message
            row[1] =wr.getSender().getUserName();
            for(Organization or: business.getDepartmentDirectory().getDepartmentList()){
               if(or.getType().equals(Organization.OrganizationType.AmazonSalesDept)){
                    for(Order o: or.getMasterOrderList().getOrders()){
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
           
            model.addRow(row);
             }    
            
//            }
 }
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        complainJPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        complainJTable = new javax.swing.JTable();
        processJButton = new javax.swing.JButton();
        viewDetailJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Manage Customer Complain");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        complainJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        complainJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ComplainID", "UserName", "OrderId", "OrderItem", "ComplainType", "Reason", "Status", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(complainJTable);

        complainJPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 670, 100));

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        complainJPanel.add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 80, -1));

        viewDetailJButton.setText("View Detail");
        viewDetailJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailJButtonActionPerformed(evt);
            }
        });
        complainJPanel.add(viewDetailJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        complainJPanel.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        add(complainJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 700, 370));
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        //        // TODO add your handling code here:
        //        int selectedRow = orderJTable.getSelectedRow();
        //        if (selectedRow < 0) {
            //            return;
            //        }
        //
        //        Order order = (Order) orderJTable.getValueAt(selectedRow, 0);
        //        order.setOrderStatus(Order.Cancel);
        //Icon icon = new ImageIcon(person.getImage());
        //        imageLabel.setIcon(icon);
         int selectedRow = complainJTable.getSelectedRow();
        if(selectedRow < 0){
            return;
        }
        
        CustomerComplainRequest wr = (CustomerComplainRequest) complainJTable.getValueAt(selectedRow, 0);
         ProcessComplainJPanel ProcessComplainJPanel = new ProcessComplainJPanel(container,ua,wr,business);
        container.add("ProcessComplainJPanel", ProcessComplainJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_processJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void viewDetailJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailJButtonActionPerformed
        // TODO add your handling code here:
         int selectedRow = complainJTable.getSelectedRow();
        if(selectedRow < 0){
            return;
        }
        
        CustomerComplainRequest wr = (CustomerComplainRequest) complainJTable.getValueAt(selectedRow, 0);
        Icon icon = new ImageIcon(wr.getImage());
        ViewComplainDetailJPanel viewComplainDetailJPanel = new ViewComplainDetailJPanel(container, business,ua,wr,icon);
        container.add("ViewComplainDetailJPanel", viewComplainDetailJPanel);

        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_viewDetailJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JPanel complainJPanel;
    private javax.swing.JTable complainJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton viewDetailJButton;
    // End of variables declaration//GEN-END:variables
}
