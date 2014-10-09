/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.CustomerRole.Login;

import business.Business;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import system.Customer.Customer;
import system.Order.Order;
import system.Order.OrderItem;
import system.Organization.Organization;
import system.UserAccount.UserAccount;
import system.WorkQueue.CustomerReturnRequest;
import system.WorkQueue.WorkRequest;


public class ReturnProductJPanel extends javax.swing.JPanel {
   JPanel container;
    Customer c;
    Business business;
    UserAccount userAccount;
    Order o;
    CustomerReturnRequest crr = new CustomerReturnRequest();
 
    public ReturnProductJPanel(  JPanel container,
            Business business,
            Customer c,UserAccount userAccount,Order o) {
        initComponents();
         this.container =container;
        this.c =c;
        this.business =business;        
        this.userAccount =userAccount;
         this.o =o;
//         complainJPanel.setVisible(false);
         reasonJPanel.setVisible(false);
         submitJButton.setVisible(false);
         orderIDJTextField.setText(String.valueOf(o.getOrderNum()));
         popOITable();
    }
   private void popOITable() {
        int rowCount = orderItemJTable.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) orderItemJTable.getModel()).removeRow(i);
        }

        for (OrderItem oi : o.getOis()) {
            
            Object row[] = new Object[3];
            row[0] = oi;
            row[1] = oi.getProduct().getActualPrice();
            row[2] = oi.getQuantity();



            ((DefaultTableModel) orderItemJTable.getModel()).addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        backjButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        orderIDJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderItemJTable = new javax.swing.JTable();
        returnJButton = new javax.swing.JButton();
        reasonJPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        reasonJTextField = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Return Request");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        jLabel5.setText("Order ID:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));
        add(orderIDJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 100, 100, -1));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, 20));

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 70, -1));

        orderItemJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderItemJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 380, 130));

        returnJButton.setText("Return");
        returnJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnJButtonActionPerformed(evt);
            }
        });
        add(returnJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, -1, -1));

        reasonJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Reason:");
        reasonJPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        reasonJPanel.add(reasonJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 130, -1));

        add(reasonJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 250, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        // TODO add your handling code here:
         crr.setMessage(reasonJTextField.getText());
         crr.setStatus("Pending");
        crr.setWorkRequestType(WorkRequest.WorkRequestType.CustomerReturnRequest);
        for(Organization or:business.getDepartmentDirectory().getDepartmentList()){
        if(or.getType().equals(Organization.OrganizationType.AmazonSalesDept)){
             or.getWorkQueue().getWorkRequestList().add(crr);
        }
        }   
//        business.getWorkQueue().getWorkRequestList().add(crr);
        //        Icon icon = new ImageIcon(ccr.getImage());
        //   for(Organization o: business.getDepartmentDirectory().getDepartmentList()){
            //            if(o.getType().getValue().equals(Organization.OrganizationType.CustomerDept.getValue())){
              
                //         System.out.println(business.getWorkQueue().getWorkRequestList()+"lllllllllllllllllllll");
                //            }
            //   }

        //        complainJPanel.setVisible(true);

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void returnJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderItemJTable.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }

        OrderItem orderItem = (OrderItem) orderItemJTable.getValueAt(selectedRow, 0);
        o.setOrderStatus(Order.Cancel);
        reasonJPanel.setVisible(true);
        submitJButton.setVisible(true);
    
        Date curDate = new Date(System.currentTimeMillis());
        crr.setIniDate(curDate);
        crr.setSender(userAccount);
        crr.setOrderItem(orderItem);
      
       
        //        ComplainJPanel complainJPanel = new ComplainJPanel(userProcessContainer, business, customer, userAccount, order);
        //        userProcessContainer.add("complainJPanel", complainJPanel);

        //        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        //        layout.next(userProcessContainer);

    }//GEN-LAST:event_returnJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField orderIDJTextField;
    private javax.swing.JTable orderItemJTable;
    private javax.swing.JPanel reasonJPanel;
    private javax.swing.JTextField reasonJTextField;
    private javax.swing.JButton returnJButton;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
