/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.CustomerRole.Login;

import business.Business;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import system.Order.Order;
import system.Order.OrderItem;
import system.Organization.Organization;
import system.Shipping.Shipping;
import system.UserAccount.UserAccount;
import system.WorkQueue.WorkRequest;

/**
 *
 * @author Administrator
 */
public class ViewReturnRequestJPanel extends javax.swing.JPanel {

    JPanel container;
    Business business;
    UserAccount ua;
    Organization salesO;

    public ViewReturnRequestJPanel(JPanel container,
            Business business,
            UserAccount ua) {
        initComponents();
        this.container = container;
        this.business = business;
        this.ua = ua;

        for (Organization o : business.getDepartmentDirectory().getDepartmentList()) {
            if (o.getType().equals(Organization.OrganizationType.AmazonSalesDept)) {
                this.salesO = o;
            }
        }
        populateTableData();
    }

    private void populateTableData() {
        DefaultTableModel model = (DefaultTableModel) complainJTable.getModel();
        model.setNumRows(0);
//        for(NetWork n: netWorkDirectory.getNetWorkList()){
//        for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
//            if(e instanceof Business){

        for (WorkRequest wr : salesO.getWorkQueue().getWorkRequestList()) {
//            System.out.println("wr:"+wr);

//           ua.setOrganizationType(Organization.OrganizationType.CustomerDept); 
//            if(wr.getId()==13){
//                 System.out.println(wr.getReceiverO()+"rrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
            if (wr.getWorkRequestType().equals(WorkRequest.WorkRequestType.CustomerReturnRequest) && wr.getSender().equals(ua)) {
                Object[] row = new Object[8];
                row[0] = wr;    // don't need to get message
                row[1] = wr.getSender().getUserName();

                for (Order o : salesO.getMasterOrderList().getOrders()) {
                    for (OrderItem oi : o.getOis()) {
//                        }
                        if (o.getCustomer().equals(wr.getSender()) && oi.equals(wr.getOrderItem())) {
                            row[2] = o.getOrderNum();
                            row[3] = oi.getProduct().getName();
                        }
                     for (Organization or : business.getDepartmentDirectory().getDepartmentList()) {
                            if (or.getType().equals(Organization.OrganizationType.AmazonShippingDept)) {
                                if(or.getShippingList().getShippingList().isEmpty()){
                                row[5]="Not Delivered Yet";
                                }else {
                                        for (Shipping s : or.getShippingList().getShippingList()) {
                                    if (s.getOi().equals(oi)) {
                                        row[5] = s.getDeliveredDate(); 
                                }
                            }
                                }
                            }
                            
                        }

                    }


                }

                row[4] = wr.getMessage();
                row[6] = wr.getIniDate();
                row[7] = wr.getStatus();

                model.addRow(row);
            }
        }
//        }
//        }


//            }
// }
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("View Return Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        complainJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        complainJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RequestID", "UserName", "OrderId", "Return OrderItem", "Reason", "DateDelivered", "RequestDate", "Status"
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

        complainJPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 880, 100));

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        complainJPanel.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        add(complainJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 920, 370));
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
