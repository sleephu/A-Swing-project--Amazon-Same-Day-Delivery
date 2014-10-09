/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.CustomerRole.Login;

import business.Business;
import java.awt.CardLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import system.Customer.Customer;
import system.Enterprise.Enterprise;
import system.NetWork.NetWork;
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
public class ComplainJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ComplainJPanel
     */
    JPanel container;
    Customer c;
    Business business;
    UserAccount userAccount;
    Order o;
   BufferedImage image=null;
    public ComplainJPanel(
            JPanel container,
            Business business,
            Customer c,UserAccount userAccount,Order o) {
        initComponents();
        this.container =container;
        this.c =c;
        this.business =business;        
        this.userAccount =userAccount;
         this.o =o;
//         complainJPanel.setVisible(false);
         orderIDJTextField.setText(String.valueOf(o.getOrderNum()));
//         complainTypeJTextArea.setVisible(false);
         complainTextFieldJPanel.setVisible(false);
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

        jLabel1 = new javax.swing.JLabel();
        backjButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        orderIDJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        productJCheckBox = new javax.swing.JCheckBox();
        shippingJCheckBox = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        reasonJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        complainPicPathJTextField = new javax.swing.JTextField();
        creComplainPicJButton = new javax.swing.JButton();
        submitJButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        orderItemJTable = new javax.swing.JTable();
        complainTextFieldJPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        complainTypeJTextArea = new javax.swing.JTextArea();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Complain");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, -1, -1));

        jLabel5.setText("Order ID:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));
        add(orderIDJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 100, 100, -1));

        jLabel2.setText("Complain Type:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, 20));

        productJCheckBox.setText("Product");
        productJCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productJCheckBoxActionPerformed(evt);
            }
        });
        add(productJCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        shippingJCheckBox.setText("Shipping");
        shippingJCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shippingJCheckBoxActionPerformed(evt);
            }
        });
        add(shippingJCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        jLabel6.setText("Reason:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));
        add(reasonJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 130, -1));

        jLabel3.setText("Upload Picture:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, -1));
        add(complainPicPathJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 130, -1));

        creComplainPicJButton.setText("Upload");
        creComplainPicJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creComplainPicJButtonActionPerformed(evt);
            }
        });
        add(creComplainPicJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, -1));

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 70, -1));

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
        jScrollPane3.setViewportView(orderItemJTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 400, 120));

        complainTextFieldJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        complainTypeJTextArea.setColumns(20);
        complainTypeJTextArea.setRows(5);
        jScrollPane2.setViewportView(complainTypeJTextArea);

        complainTextFieldJPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 60));

        add(complainTextFieldJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 190, 80));
    }// </editor-fold>//GEN-END:initComponents

private void creComplainPic(){
  try{
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
             image = ImageIO.read(f);
//            System.out.println("image"+image);
//            ccr.setImage(image);
            complainPicPathJTextField.setText(f.getAbsolutePath());
            //
            //            Icon icon = new ImageIcon(image);
            //            imageLabel.setIcon(icon);
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Upload failed!");
        }
}

    private void creComplainPicJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creComplainPicJButtonActionPerformed
    creComplainPic();
    }//GEN-LAST:event_creComplainPicJButtonActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backjButton1ActionPerformed
private void complain(WorkRequest ccr){
// CustomerComplainRequest ccr = new CustomerComplainRequest();
     int selectedRow = orderItemJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Choose the item that you complain please.");
            return;
        }

        OrderItem orderItem = (OrderItem) orderItemJTable.getValueAt(selectedRow, 0);
        ccr.setOrderItem(orderItem);
      
        ccr.setSender(userAccount);
        ccr.setMessage(reasonJTextField.getText());
//        ccr.setReceiver(new CustomerDeptRole());
        ccr.setReceiverO(Organization.OrganizationType.CustomerDept);
        ccr.setStatus("Pending");
//        creComplainPic();
    
         Date curDate = new Date(System.currentTimeMillis());
          ccr.setIniDate(curDate);
         check();
         ccr.setTypeInfo(complainTypeJTextArea.getText());
         ccr.setWorkRequestType(WorkRequest.WorkRequestType.CustomerComplainRequest);
//        populateTableData();
//        for(NetWork n: business.getNetWorkDirectory().getNetWorkList()){
//        for (Enterprise e :n.getEnterpriseDirectory().getEnterpriseList() ) {
//            if (e instanceof Business) {
//                e.getWorkQueue().getWorkRequestList().add(tswr);
//            }
//        }}
//        System.out.println("ua"+ua);
//        ua.getWorkQueue().getWorkRequestList().add(pwr);
//        userAccount.getWorkQueue().getWorkRequestList().add(ccr);
         ((CustomerComplainRequest)ccr).setImage(image);
//         for(NetWork n: business.getNetWorkDirectory().getNetWorkList()){
//         for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
//         if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.Amazon)){
         for(Organization or: business.getDepartmentDirectory().getDepartmentList()){
         if(or.getType().equals(Organization.OrganizationType.CustomerDept)){
         or.getWorkQueue().getWorkRequestList().add(ccr);
         }
         }
//         }
//         }
//         }
//         business.getWorkQueue().getWorkRequestList().add(ccr);
        JOptionPane.showMessageDialog(null, "Request Sent!");
}
    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        // TODO add your handling code here:
        CustomerComplainRequest ccr = new CustomerComplainRequest();
        complain(ccr);
         
//        Icon icon = new ImageIcon(ccr.getImage());
//   for(Organization o: business.getDepartmentDirectory().getDepartmentList()){
//            if(o.getType().getValue().equals(Organization.OrganizationType.CustomerDept.getValue())){
         
//         System.out.println(business.getWorkQueue().getWorkRequestList()+"lllllllllllllllllllll");
//            }
//   }
       
//        complainJPanel.setVisible(true);
       
    }//GEN-LAST:event_submitJButtonActionPerformed
private void check(){
    if(productJCheckBox.isSelected()==false&&shippingJCheckBox.isSelected()==false){
        JOptionPane.showMessageDialog(null,"Please select the complain type!");
    }
 if(productJCheckBox.isSelected()==true&&shippingJCheckBox.isSelected()==false){
        complainTypeJTextArea.setText("ProductComplain");
        }
   if(shippingJCheckBox.isSelected()==true&&productJCheckBox.isSelected()==false){
         complainTypeJTextArea.setText("ShippingComplain");
        }
   else{
   complainTypeJTextArea.setText("ProductComplain + ShippingComplain");
   }
}
    private void productJCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productJCheckBoxActionPerformed
        // TODO add your handling code here:
//        if(productJCheckBox.isSelected()==true){
//        complainTypeJTextArea.setText("ProductComplain");
//        }
    }//GEN-LAST:event_productJCheckBoxActionPerformed

    private void shippingJCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shippingJCheckBoxActionPerformed
        // TODO add your handling code here:
//        if(shippingJCheckBox.isSelected()==true){
//         complainTypeJTextArea.setText("ShippingComplain");
//        }
    }//GEN-LAST:event_shippingJCheckBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JTextField complainPicPathJTextField;
    private javax.swing.JPanel complainTextFieldJPanel;
    private javax.swing.JTextArea complainTypeJTextArea;
    private javax.swing.JButton creComplainPicJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField orderIDJTextField;
    private javax.swing.JTable orderItemJTable;
    private javax.swing.JCheckBox productJCheckBox;
    private javax.swing.JTextField reasonJTextField;
    private javax.swing.JCheckBox shippingJCheckBox;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
