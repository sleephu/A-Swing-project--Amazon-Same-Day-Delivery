/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AmazonRole.SalesDeptRole;

import business.Business;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import system.Order.Order;
import system.Order.OrderItem;
import system.Organization.Organization;
import system.UserAccount.UserAccount;
import system.WorkQueue.CustomerReturnRequest;

/**
 *
 * @author Administrator
 */
public class ProcessReturnRequestJPanel extends javax.swing.JPanel {

    JPanel container;
    UserAccount ua;
    CustomerReturnRequest wr;
    Business business;
    Organization salesO;

    public ProcessReturnRequestJPanel(JPanel container,
            UserAccount ua,
            CustomerReturnRequest wr,
            Business business, Organization salesO) {
        initComponents();
        this.container = container;
        this.ua = ua;
        this.wr = wr;
        this.business = business;
        this.salesO = salesO;
        populateTableData();
        messageJPanel.setVisible(false);

    }

    private void populateTableData() {
        DefaultTableModel model = (DefaultTableModel) returnJTable.getModel();
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
        Object[] row = new Object[8];
        row[0] = wr;    // don't need to get message
        row[1] = wr.getSender().getUserName();
        for (Order o : salesO.getMasterOrderList().getOrders()) {
            for (OrderItem oi : o.getOis()) {
                if (o.getCustomer().equals(wr.getSender()) && oi.equals(wr.getOrderItem())) {
                    row[2] = o.getOrderNum();
                    row[3] = wr.getOrderItem().getProduct().getName();
                }
            }
//            row[4]=wr.getTypeInfo();
            
        }
            row[4] = wr.getMessage();
            row[5] = wr.getStatus();
            row[6] = wr.getIniDate();
            row[7] = wr.getCompleDate();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        returnJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        rejectJButton = new javax.swing.JButton();
        approveJButton = new javax.swing.JButton();
        messageJPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        processJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Process Customer Return Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        complainJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        returnJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RequestID", "UserName", "OrderId", "OrderItem", "Message", "Status", "RequestDate", "ProcessedDate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(returnJTable);

        complainJPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 780, 100));

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        complainJPanel.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        rejectJButton.setText("Reject");
        rejectJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectJButtonActionPerformed(evt);
            }
        });
        complainJPanel.add(rejectJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, -1, -1));

        approveJButton.setText("Approve");
        approveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveJButtonActionPerformed(evt);
            }
        });
        complainJPanel.add(approveJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 80, -1));

        messageJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Message:");
        messageJPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));
        messageJPanel.add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 160, -1));

        processJButton.setText("send");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        messageJPanel.add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 70, -1));

        complainJPanel.add(messageJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 330, 110));

        add(complainJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 830, 370));
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
        CardLayout layout = (CardLayout) container.getLayout();
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
        messageJPanel.setVisible(true);
    }//GEN-LAST:event_rejectJButtonActionPerformed

    private void approveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveJButtonActionPerformed
        // TODO add your handling code here:
        Date curDate = new Date(System.currentTimeMillis());
        wr.setCompleDate(curDate);
        wr.setStatus("Approved");
        messageJPanel.setVisible(true);
    }//GEN-LAST:event_approveJButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JPanel complainJPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel messageJPanel;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton rejectJButton;
    private javax.swing.JTable returnJTable;
    // End of variables declaration//GEN-END:variables
}
