/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AmazonRole.CustomerDeptRole;

import business.Business;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import system.Order.Order;
import system.Order.OrderItem;
import system.Organization.Organization;
import system.UserAccount.UserAccount;
import system.WorkQueue.CustomerComplainRequest;

/**
 *
 * @author Administrator
 */
public class ProcessComplainJPanel extends javax.swing.JPanel {
JPanel container;
UserAccount ua;
    CustomerComplainRequest wr;
    Business business;
    public ProcessComplainJPanel(JPanel container,
UserAccount ua,
    CustomerComplainRequest wr,
    Business business) {
        initComponents();
        this.container=container;
        this.ua=ua;
        this.wr=wr;
        this.business=business;
        populateTableData();
        complainJPanel.setVisible(false);
    }
private void populateTableData() {
        DefaultTableModel model = (DefaultTableModel)complainJTable.getModel();
        model.setNumRows(0);
//        for(NetWork n: netWorkDirectory.getNetWorkList()){
//        for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
//            if(e instanceof Business){
//        for (WorkRequest wr : business.getWorkQueue().getWorkRequestList()) {
//            System.out.println("wr:"+wr);
            
//           ua.setOrganizationType(Organization.OrganizationType.CustomerDept); 
//            if(wr.getId()==13){
//                 System.out.println(wr.getReceiverO()+"rrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
//             if(wr.getWorkRequestType().equals(WorkRequest.WorkRequestType.CustomerComplainRequest)){
            Object[] row = new Object[9];
            row[0] = wr;    // don't need to get message
            row[1] =wr.getSender().getUserName();
            for(Organization or:business.getDepartmentDirectory().getDepartmentList()){
            if(or.getType().equals(Organization.OrganizationType.AmazonSalesDept)){
                 for(Order o: or.getMasterOrderList().getOrders()){
                for(OrderItem oi:o.getOis()){
                if(o.getCustomer().equals(wr.getSender())&&oi.equals(wr.getOrderItem())){
            row[2]=o.getOrderNum();
            row[3]=wr.getOrderItem().getProduct().getName();
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
            
//            }
// }
// }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        complainJPanel = new javax.swing.JPanel();
        processJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        complainJTable = new javax.swing.JTable();
        approveJButton = new javax.swing.JButton();
        rejectJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Process Customer Complain");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        complainJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        processJButton.setText("send");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        complainJPanel.add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 70, -1));

        jLabel2.setText("Message:");
        complainJPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        complainJPanel.add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 160, -1));

        add(complainJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 350, 80));

        complainJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ComplainID", "UserName", "OrderId", "OrderItem", "ComplainType", "Message", "Status", "RequestDate", "ProcessedDate"
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 780, 100));

        approveJButton.setText("Approve");
        approveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveJButtonActionPerformed(evt);
            }
        });
        add(approveJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 80, -1));

        rejectJButton.setText("Reject");
        rejectJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectJButtonActionPerformed(evt);
            }
        });
        add(rejectJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, -1, -1));

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));
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
//        int selectedRow = complainJTable.getSelectedRow();
//        if(selectedRow < 0){
//            return;
//        }

//        CustomerComplainRequest wr = (CustomerComplainRequest) complainJTable.getValueAt(selectedRow, 0);
//          Date curDate = new Date(System.currentTimeMillis());
//          wr.setCompleDate(curDate);
         wr.setMessage(messageJTextField.getText());
//         wr.setStatus("processed");
         populateTableData();
    }//GEN-LAST:event_processJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void rejectJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectJButtonActionPerformed
        // TODO add your handling code here:
//        int selectedRow = complainJTable.getSelectedRow();
//        if(selectedRow < 0){
//            return;
//        }

//        CustomerComplainRequest wr = (CustomerComplainRequest) complainJTable.getValueAt(selectedRow, 0);
        Date curDate = new Date(System.currentTimeMillis());
        wr.setCompleDate(curDate);
        wr.setStatus("rejected");
        complainJPanel.setVisible(true);
        populateTableData();
    }//GEN-LAST:event_rejectJButtonActionPerformed

    private void approveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveJButtonActionPerformed
        // TODO add your handling code here:
          Date curDate = new Date(System.currentTimeMillis());
        wr.setCompleDate(curDate);
        wr.setStatus("Approved");
        complainJPanel.setVisible(true);
        populateTableData();
        
    }//GEN-LAST:event_approveJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JPanel complainJPanel;
    private javax.swing.JTable complainJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton rejectJButton;
    // End of variables declaration//GEN-END:variables
}
