/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SupplierRole.ProductManageDeptRole;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import system.Enterprise.Enterprise;
import system.Organization.Organization;
import system.UserAccount.UserAccount;
import system.WorkQueue.InventoryWR;
import system.WorkQueue.WorkRequest;

/**
 *
 * @author Administrator
 */
public class ViewInventoryRequestJPanel extends javax.swing.JPanel {

    JPanel container;
    Enterprise e;
    UserAccount ua;
    Organization o;

    public ViewInventoryRequestJPanel(JPanel container,
            Enterprise e,
            UserAccount ua,
            Organization o) {
        initComponents();
        this.container = container;
        this.e = e;
        this.ua = ua;
        this.o = o;
        populateTableData();
    }

    private void populateTableData() {
        DefaultTableModel model = (DefaultTableModel) inventoryRequestJTable.getModel();
        model.setNumRows(0);
//        for(NetWork n: netWorkDirectory.getNetWorkList()){
//        for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
//            if(e instanceof Business){
        for (WorkRequest wr : o.getWorkQueue().getWorkRequestList()) {
//            System.out.println("wr:"+wr);

//           ua.setOrganizationType(Organization.OrganizationType.CustomerDept); 
//            if(wr.getId()==13){
//                 System.out.println(wr.getReceiverO()+"rrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
            if (wr.getWorkRequestType().equals(WorkRequest.WorkRequestType.InventoryRequest)) {
                Object[] row = new Object[5];
                row[0] = wr;    // don't need to get message
                row[1] = wr.getProduct().getProductId();
//            for(Order o: business.getMasterOrderList().getOrders()){
//                  for(OrderItem oi:o.getOis()){
////                        }
//                if(o.getCustomer().equals(wr.getSender())&&oi.equals(wr.getOrderItem())){
                row[2] = wr.getProduct().getName();
                row[3] = wr.getProduct().getTargetPrice();
                row[4] = wr.getMessage();
                model.addRow(row);
            }
        }

//            }
// }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryRequestJTable = new javax.swing.JTable();
        processButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("View Inventory Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        backButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton1.setText("<< Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, 30));

        inventoryRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RequestID", "Product ID", "Product Name", "Product Price", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(inventoryRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 560, 130));

        processButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        processButton.setText("Process");
        processButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processButtonActionPerformed(evt);
            }
        });
        add(processButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        container.remove(this);

        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backButton1ActionPerformed

    private void processButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = inventoryRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }

        InventoryWR iwr = (InventoryWR) inventoryRequestJTable.getValueAt(selectedRow, 0);

        ManageProductPanel ManageProductPanel = new ManageProductPanel(container, iwr.getProduct());
        container.add("ManageProductPanel", ManageProductPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_processButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton1;
    private javax.swing.JTable inventoryRequestJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processButton;
    // End of variables declaration//GEN-END:variables
}
