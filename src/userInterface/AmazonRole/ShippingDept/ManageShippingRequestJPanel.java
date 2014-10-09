/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AmazonRole.ShippingDept;

import business.Business;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import system.Order.Order;
import system.Organization.Organization;
import system.UserAccount.UserAccount;
import system.WorkQueue.CustomerShippingRequest;
import system.WorkQueue.WorkRequest;

/**
 *
 * @author Administrator
 */
public class ManageShippingRequestJPanel extends javax.swing.JPanel {

  JPanel container;
  Business business;
  UserAccount ua;
  Organization shippingO;
    public ManageShippingRequestJPanel( JPanel container,
  Business business,
  UserAccount ua) {
        initComponents();
        this.container =container;
        this.business=business;
        this.ua=ua;
       
        for(Organization or:business.getDepartmentDirectory().getDepartmentList()){
        if(or.getType().equals(Organization.OrganizationType.AmazonShippingDept)){
        this.shippingO=or;
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
        for (WorkRequest wr : shippingO.getWorkQueue().getWorkRequestList()) {
//            System.out.println("wr:"+wr);
            
//           ua.setOrganizationType(Organization.OrganizationType.CustomerDept); 
//            if(wr.getId()==13){
//                 System.out.println(wr.getReceiverO()+"rrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
             if(wr.getWorkRequestType().equals(WorkRequest.WorkRequestType.CustomerShippingRequest)){
            Object[] row = new Object[6];
            row[0] = wr;    // don't need to get message
           for(Organization or:business.getDepartmentDirectory().getDepartmentList()){
           if(or.getType().equals(Organization.OrganizationType.AmazonSalesDept)){
           for(Order o: or.getMasterOrderList().getOrders()){
                if(o.getCustomer().equals(wr.getSender())){
            row[1]=o.getOrderNum();
            }
              
        }
           }
           }
              row[2] =wr.getSender().getPerson().getLastName()+""+wr.getSender().getPerson().getFirstName();
//            }
            row[3]=wr.getSender().getPerson().getLocation().getCountry()+"/"+wr.getSender().getPerson().getLocation().getState()+"/"+wr.getSender().getPerson().getLocation().getCity()+"/"+wr.getSender().getPerson().getLocation().getStreet();
            row[4] = wr.getTypeInfo();
            row[5]=wr.getIniDate();
           
            model.addRow(row);
           
           
             }    
            
//            }
 }
  
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        shippingJTable = new javax.swing.JTable();
        processJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Shipping Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        shippingJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RequestID", "OrderID", "CustomerName", "Customer Location", "ShippingType", "RequestDate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(shippingJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 580, 140));

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        // TODO add your handling code here:
            int selectedRow = shippingJTable.getSelectedRow();
        if(selectedRow < 0){
            return;
        }
        
        CustomerShippingRequest wr = (CustomerShippingRequest)shippingJTable.getValueAt(selectedRow, 0);
//        Icon icon = new ImageIcon(wr.getImage());
        ProcessShippingJPanel processShippingJPanel = new ProcessShippingJPanel(container, business,ua,wr,shippingO);
        container.add("ProcessShippingJPanel", processShippingJPanel);

        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_processJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JTable shippingJTable;
    // End of variables declaration//GEN-END:variables
}
