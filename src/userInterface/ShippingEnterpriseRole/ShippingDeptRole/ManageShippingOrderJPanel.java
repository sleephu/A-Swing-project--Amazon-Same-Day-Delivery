/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ShippingEnterpriseRole.ShippingDeptRole;

import business.Business;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import system.Employee.Employee;
import system.Enterprise.Enterprise;
import system.Order.Order;
import system.Order.OrderItem;
import system.Organization.Organization;
import system.Shipping.Shipping;
import system.WorkQueue.CustomerShippingRequest;
import system.WorkQueue.ShippingRequest;
import system.WorkQueue.WorkRequest;

/**
 *
 * @author Administrator
 */
public class ManageShippingOrderJPanel extends javax.swing.JPanel {

    JPanel container;
    Business business;
    Enterprise e;
    Organization o;

    public ManageShippingOrderJPanel(JPanel container,
            Business business,
            Enterprise e,
            Organization o) {
        initComponents();
        this.container = container;
        this.business = business;
        this.e = e;
        this.o = o;
//        populateEmployee();

        populateData();
        empAssJPanel.setVisible(false);
        detailJPanel.setVisible(false);
    }

    private void populateEmployee() {
        employeeJComboBox.removeAllItems();
//        Organization o= (Organization)orgTypeJComboBox.getSelec tedItem();
//        for(Organization o: e.getDepartmentDirectory().getDepartmentList()){
//        if(o.getType().getValue().equals(Organization.OrganizationType.ShippingDept.getValue())){
        for (Employee em : o.getEmployeeDirectory().getEmployeeList()) {

            employeeJComboBox.addItem(em);
        }
    }
//    }
//    }

    private void populateData() {
        DefaultTableModel model = (DefaultTableModel) shippingRequestJTable.getModel();
        model.setNumRows(0);
//        for(NetWork n: netWorkDirectory.getNetWorkList()){
//        for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
//            if(e instanceof Business){
        for (WorkRequest wr : o.getWorkQueue().getWorkRequestList()) {
//            System.out.println("wr:"+wr);

//           ua.setOrganizationType(Organization.OrganizationType.CustomerDept); 
//            if(wr.getId()==13){
//                 System.out.println(wr.getReceiverO()+"rrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
            if (wr instanceof ShippingRequest) {
                Object[] row = new Object[1];
                row[0] = wr;    // don't need to get message

                model.addRow(row);
            }
        }

//            }
// }

    }

    private void populateShippingData(ShippingRequest wr) {
        DefaultTableModel model = (DefaultTableModel) shippingJTable.getModel();
        model.setNumRows(0);
//        for(NetWork n: netWorkDirectory.getNetWorkList()){
//        for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
//            if(e instanceof Business){
//        for (WorkRequest wr : e.getWorkQueue().getWorkRequestList()) {
//            System.out.println("wr:"+wr);

//           ua.setOrganizationType(Organization.OrganizationType.CustomerDept); 
//            if(wr.getId()==13){
//                 System.out.println(wr.getReceiverO()+"rrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
//             if(wr instanceof ShippingRequest){
        Object[] row = new Object[7];
        row[0] = wr;    // don't need to get message
        for (Organization or : business.getDepartmentDirectory().getDepartmentList()) {
            if (or.getType().equals(Organization.OrganizationType.AmazonSalesDept)) {
                for (Order od : or.getMasterOrderList().getOrders()) {
                    for (OrderItem oi : od.getOis()) {
                        if (od.getCustomer().equals(wr.getCustomerShippingRequest().getSender()) && oi.equals(wr.getCustomerShippingRequest().getOrderItem())) {
                            row[1] = od.getOrderNum();
                        }
                    }
//                for(OrderItem oi:o.getOis()){
                  
                }
                  row[2] = wr.getOrderItem();
//                }
                    row[3] = wr.getCustomerShippingRequest().getSender().getPerson().getLastName() + "" + wr.getCustomerShippingRequest().getSender().getPerson().getFirstName();
//            }
                    row[4] = wr.getCustomerShippingRequest().getSender().getPerson().getLocation().getCountry() + "/" + wr.getCustomerShippingRequest().getSender().getPerson().getLocation().getState() + "/" + wr.getCustomerShippingRequest().getSender().getPerson().getLocation().getCity() + "/" + wr.getCustomerShippingRequest().getSender().getPerson().getLocation().getStreet();
                    row[5] = wr.getCustomerShippingRequest().getTypeInfo();
                    row[6] = wr.getIniDate();

                    model.addRow(row);
            }
        }

    }

//            }
// }
//  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        empAssJPanel = new javax.swing.JPanel();
        assignJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        employeeJComboBox = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        shippingRequestJTable = new javax.swing.JTable();
        viewDetailJButton = new javax.swing.JButton();
        detailJPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        shippingJTable = new javax.swing.JTable();
        processJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Shipping Order");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        empAssJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        assignJButton.setText("Assign");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        empAssJPanel.add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jLabel2.setText("Employee:");
        empAssJPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        employeeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        empAssJPanel.add(employeeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 140, -1));

        add(empAssJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 330, 70));

        shippingRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RequestID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(shippingRequestJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, 80));

        viewDetailJButton.setText("View Detail");
        viewDetailJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailJButtonActionPerformed(evt);
            }
        });
        add(viewDetailJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        detailJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        shippingJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RequestID", "OrderID", "OrderItem", "CustomerName", "Customer Location", "ShippingType", "RequestDate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(shippingJTable);

        detailJPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 710, 120));

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        detailJPanel.add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        add(detailJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 720, 180));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = shippingJTable.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }
        Employee em = (Employee) employeeJComboBox.getSelectedItem();
        ShippingRequest csr = (ShippingRequest) shippingJTable.getValueAt(selectedRow, 0);
//         for (Order o : business.getMasterOrderList().getOrders()) {
//            if (o.getCustomer().equals(csr.getSender())) {
//              popShippingE(o);
//            }
//         }
//        csr.setDeliverEmployee(em);
        Shipping shipping = new Shipping();
        shipping.setOi(csr.getOrderItem());
        shipping.setStatus("Packaging");

        shipping.setShippingMethod(csr.getCustomerShippingRequest().getTypeInfo());
        shipping.setDeliveredEmployee(em);
        Date curDate = new Date(System.currentTimeMillis());
        csr.setCompleDate(curDate);
        shipping.setPackageDate(curDate);
        shipping.setShippingRequest(csr);
        o.getShippingList().getShippingList().add(shipping);
        for (Organization so : business.getDepartmentDirectory().getDepartmentList()) {
            if (so.getType().equals(Organization.OrganizationType.AmazonShippingDept)) {
                so.getShippingList().getShippingList().add(shipping);
            }
        }
//        business.getShippingList().getShippingList().add(shipping);

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        // TODO add your handling code here:
        empAssJPanel.setVisible(true);
        populateEmployee();
    }//GEN-LAST:event_processJButtonActionPerformed

    private void viewDetailJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = shippingRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }

        ShippingRequest wr = (ShippingRequest) shippingRequestJTable.getValueAt(selectedRow, 0);
        populateShippingData(wr);
        detailJPanel.setVisible(true);

    }//GEN-LAST:event_viewDetailJButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JPanel detailJPanel;
    private javax.swing.JPanel empAssJPanel;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processJButton;
    private javax.swing.JTable shippingJTable;
    private javax.swing.JTable shippingRequestJTable;
    private javax.swing.JButton viewDetailJButton;
    // End of variables declaration//GEN-END:variables
}
