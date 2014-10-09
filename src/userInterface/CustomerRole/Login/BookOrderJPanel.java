/*
 * BrowseProducts.java
 *
 * Created on October 10, 2008, 9:10 AM
 */
package userInterface.CustomerRole.Login;

import business.Business;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import system.Customer.Customer;
import system.Employee.Employee;
import system.Enterprise.Enterprise;
import system.Invoice.Invoice;
import system.NetWork.NetWork;
import system.Order.Order;
import system.Order.OrderItem;
import system.Organization.Organization;
import system.Product.Product;
import system.Product.ProductCatalog;
import system.Role.Role;
import system.Supplier.SupplierDirectory;
import system.UserAccount.UserAccount;
import system.WorkQueue.InventoryWR;
import system.WorkQueue.WorkRequest;

public class BookOrderJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    SupplierDirectory supplierDir;
    private Business business;
    Customer customer;
    // create a local order but not put into MasterOrderList-------requirement
    private Order order;
//    Supplier supplier;
    Enterprise e;
    ProductCatalog productCatalog;
    private OrderItem orderItem;
    private Product product;
    Employee employee;
    UserAccount ua;
    OrderItem oi;

    public BookOrderJPanel(JPanel userProcessContainer, Business business, Customer customer, UserAccount ua) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
//        this.supplierDir = business.getSupplierDirectory();
        this.business = business;
//        this.employee =employee;
        this.customer = customer;
        this.ua = ua;
        order = new Order();
        showE();

//        suppComboBox1.removeAllItems();
//        for (NetWork n : business.getNetWorkDirectory().getNetWorkList()) {
//            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
//                if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.LocalRetalier)) {
////             if(e instanceof Supplier){
//                    if (e.getLocation().getCountry().equals(ua.getPerson().getLocation().getCountry()) && e.getLocation().getState().equals(ua.getPerson().getLocation().getState()) && e.getLocation().getCity().equals(ua.getPerson().getLocation().getCity())) {
//                        for (Organization o : e.getDepartmentDirectory().getDepartmentList()) {
//                            if (o.getType().equals(Organization.OrganizationType.ProductManageDept)) {
//                                for (Product p : o.getProductCatalog().getProductList()) {
//                                    if (p.getActualPrice() != 0.0) {
//                                        suppComboBox1.addItem(e);
//                                    }
//                                }
//                            }
//
//                        }
//                    } else if (e.getLocation().getCountry().equals(ua.getPerson().getLocation().getCountry()) && e.getLocation().getState().equals(ua.getPerson().getLocation().getState()) && !e.getLocation().getCity().equals(ua.getPerson().getLocation().getCity())) {
//                        for (Organization o : e.getDepartmentDirectory().getDepartmentList()) {
//                            if (o.getType().equals(Organization.OrganizationType.ProductManageDept)) {
//                                for (Product p : o.getProductCatalog().getProductList()) {
//                                    if (p.getActualPrice() != 0.0) {
//                                        suppComboBox1.addItem(e);
//                                    }
//                                }
//                            }
//
//                        }
//                    } else if (e.getLocation().getCountry().equals(ua.getPerson().getLocation().getCountry())&&!e.getLocation().getState().equals(ua.getPerson().getLocation().getState()) && !e.getLocation().getCity().equals(ua.getPerson().getLocation().getCity())) {
//                        for (Organization o : e.getDepartmentDirectory().getDepartmentList()) {
//                            if (o.getType().equals(Organization.OrganizationType.ProductManageDept)) {
//                                for (Product p : o.getProductCatalog().getProductList()) {
//                                    if (p.getActualPrice() != 0.0) {
//                                        suppComboBox1.addItem(e);
//                                    }
//                                }
//                            }
//
//                        }
//                    } else if (!e.getLocation().getCountry().equals(ua.getPerson().getLocation().getCountry()) && !e.getLocation().getState().equals(ua.getPerson().getLocation().getState()) && !e.getLocation().getCity().equals(ua.getPerson().getLocation().getCity())) {
////                        {
//                        for (Organization o : e.getDepartmentDirectory().getDepartmentList()) {
//                            if (o.getType().equals(Organization.OrganizationType.ProductManageDept)) {
//                                for (Product p : o.getProductCatalog().getProductList()) {
//                                    if (p.getActualPrice() != 0.0) {
//                                        suppComboBox1.addItem(e);
//                                    }
//                                }
//                            }
//
//                        }
////                        }
//
//                    }
//
//
//                }
//            }
//        }

    }

    private void showE() {
        suppComboBox1.removeAllItems();
        for (NetWork n : business.getNetWorkDirectory().getNetWorkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.LocalRetalier)) {
//             if(e instanceof Supplier){
                    if(e.getLocation()!=null)
                    {  if (e.getLocation().getCountry().equals(ua.getPerson().getLocation().getCountry()) && e.getLocation().getState().equals(ua.getPerson().getLocation().getState()) && e.getLocation().getCity().equals(ua.getPerson().getLocation().getCity())) {
                        suppComboBox1.addItem(e);
//                        for (Organization o : e.getDepartmentDirectory().getDepartmentList()) {
//                            if (o.getType().equals(Organization.OrganizationType.ProductManageDept)) {
//                                for (Product p : o.getProductCatalog().getProductList()) {
//                                    if (p.getActualPrice() != 0.0) {
//                                        suppComboBox1.addItem(e);
//                                    }
//                                }
//                            }
//
//                        }
                    } else
//                        if (e.getLocation().getCountry().equals(ua.getPerson().getLocation().getCountry()) && e.getLocation().getState().equals(ua.getPerson().getLocation().getState()) && !e.getLocation().getCity().equals(ua.getPerson().getLocation().getCity())) {
                    { 
                        suppComboBox1.addItem(e);
                    }}
                  
//                        for (Organization o : e.getDepartmentDirectory().getDepartmentList()) {
//                            if (o.getType().equals(Organization.OrganizationType.ProductManageDept)) {
//                                for (Product p : o.getProductCatalog().getProductList()) {
//                                    if (p.getActualPrice() != 0.0) {
//                                        suppComboBox1.addItem(e);
//                                    }
//                                }
//                            }
//
//                        }
//                    } else if (e.getLocation().getCountry().equals(ua.getPerson().getLocation().getCountry()) && !e.getLocation().getState().equals(ua.getPerson().getLocation().getState()) && !e.getLocation().getCity().equals(ua.getPerson().getLocation().getCity())) {
//                        suppComboBox1.addItem(e);
//                          for (Organization o : e.getDepartmentDirectory().getDepartmentList()) {
//                            if (o.getType().equals(Organization.OrganizationType.ProductManageDept)) {
//                                for (Product p : o.getProductCatalog().getProductList()) {
//                                    if (p.getActualPrice() != 0.0) {
//                                      
//                                    }
//                                }
//                            }
//
//                        }
//                    } else if (!e.getLocation().getCountry().equals(ua.getPerson().getLocation().getCountry())&&!e.getLocation().getState().equals(ua.getPerson().getLocation().getState()) && !e.getLocation().getCity().equals(ua.getPerson().getLocation().getCity())) {
//                        { 
//                        suppComboBox1.addItem(e);
//                        for (Organization o : e.getDepartmentDirectory().getDepartmentList()) {
//                            if (o.getType().equals(Organization.OrganizationType.ProductManageDept)) {
//                                for (Product p : o.getProductCatalog().getProductList()) {
//                                    if (p.getActualPrice() != 0.0) {
//                                       
//                                    }
//                                }
//                            }
//
//                        }
//                        }

//                    }


                }
            }
        }
    }

    private void popData() {

//        Supplier selectedSupplier = (Supplier) suppComboBox1.getSelectedItem();
        Enterprise selectedEnterprise = (Enterprise) suppComboBox1.getSelectedItem();
        if (selectedEnterprise == null) {
            return;
        }
        int rowCount = productcatalogTable.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) productcatalogTable.getModel()).removeRow(i);
        }

        for (Organization o : selectedEnterprise.getDepartmentDirectory().getDepartmentList()) {
            if (o.getType().equals(Organization.OrganizationType.ProductManageDept)) {
                for (Product p : o.getProductCatalog().getProductList()) {
                    if (p.getActualPrice() != 0.0) {
                        Object row[] = new Object[4];
                        row[0] = p;
                        row[1] = p.getProductId();
                        row[2] = p.getActualPrice();
                        if (p.getLeftProduct().getLeftQuantity() <= 0) {
                            row[3] = "out of inventory";
                        } else {
                            row[3] = p.getLeftProduct().getLeftQuantity();
                        }
                        ((DefaultTableModel) productcatalogTable.getModel()).addRow(row);
                    }
                }
            }
        }

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        productcatalogTable = new javax.swing.JTable();
        suppComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderItemJTable = new javax.swing.JTable();
        quantityJSpinner = new javax.swing.JSpinner();
        addToCartJButton = new javax.swing.JButton();
        checkOutJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        backjButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 511));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productcatalogTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        productcatalogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Model No.", "Price", "Availability"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productcatalogTable);
        productcatalogTable.getColumnModel().getColumn(0).setResizable(false);
        productcatalogTable.getColumnModel().getColumn(1).setResizable(false);
        productcatalogTable.getColumnModel().getColumn(2).setResizable(false);
        productcatalogTable.getColumnModel().getColumn(3).setResizable(false);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 590, 80));

        suppComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppComboBox1ActionPerformed(evt);
            }
        });
        add(suppComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 250, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Order Items:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 110, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Supplier Product Catalog");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 240, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Book Orders");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        orderItemJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Quantity", "Actual Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderItemJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 590, 90));
        add(quantityJSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 50, -1));

        addToCartJButton.setText("Add to Cart");
        addToCartJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartJButtonActionPerformed(evt);
            }
        });
        add(addToCartJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, -1));

        checkOutJButton.setText("check out");
        checkOutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutJButtonActionPerformed(evt);
            }
        });
        add(checkOutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 110, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Supplier:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 70, 30));

        backjButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backjButton3.setText("<< Back");
        backjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton3ActionPerformed(evt);
            }
        });
        add(backjButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void suppComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppComboBox1ActionPerformed
        popData();


    }//GEN-LAST:event_suppComboBox1ActionPerformed

    private void addToCartJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartJButtonActionPerformed
        // TODO add your handling code here:
        // 1.create oi

        int selectedRow = productcatalogTable.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }
        Product product = (Product) productcatalogTable.getValueAt(selectedRow, 0);
        if ((int) quantityJSpinner.getValue() <= 0) {
            JOptionPane.showMessageDialog(null, "Select quantity again please!");
            return;
        }
//        OrderItem
        oi = order.createOrderItem();
        // 2.set product and quantity
        oi.setProduct(product);

        oi.setQuantity((int) quantityJSpinner.getValue());
        oi.getProduct().setActualPrice(product.getActualPrice());
//         product.getLeftProduct().updateLeftQuantity(oi);

        if (product.getLeftProduct().getLeftQuantity() < oi.getQuantity()) {
//               JOptionPane.showMessageDialog(null, "Sorry, the product is out of inventory");
//               order.removeOrderItem(oi); 
            InventoryWR iwr = new InventoryWR();
            iwr.setProduct(product);
            iwr.setWorkRequestType(WorkRequest.WorkRequestType.InventoryRequest);
            iwr.setMessage("Product is in need!");
            for (NetWork n : business.getNetWorkDirectory().getNetWorkList()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.LocalRetalier)) {
//             for(Product p:e.getProductCatalog().getProductList()){
//             if(p.equals(product)){
                        for (Organization o : e.getDepartmentDirectory().getDepartmentList()) {
                            if (o.getType().equals(Organization.OrganizationType.ProductManageDept) && o.getProductCatalog().getProductList().contains(oi.getProduct())) {
                                o.getWorkQueue().getWorkRequestList().add(iwr);
                                for (Role r : o.getSupportedRoles()) {
                                    iwr.setReceiver(r);
                                }
                            }
                        }
                    }
                }
//             }
//             }

            }
            for (Organization o : business.getDepartmentDirectory().getDepartmentList()) {
                if (o.getType().equals(Organization.OrganizationType.AmazonSalesDept)) {
                    o.getWorkQueue().getWorkRequestList().add(iwr);
                }
            }
            JOptionPane.showMessageDialog(null, "Sorry, the product is out of inventory");
            order.removeOrderItem(oi);
            return;
        } else if (product.getLeftProduct().getLeftQuantity() == oi.getQuantity()) {
            InventoryWR iwr = new InventoryWR();
            iwr.setProduct(product);
            iwr.setWorkRequestType(WorkRequest.WorkRequestType.InventoryRequest);
            iwr.setMessage("Out of Inventory!");
            for (NetWork n : business.getNetWorkDirectory().getNetWorkList()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.LocalRetalier)) {
//             for(Product p:e.getProductCatalog().getProductList()){
//             if(p.equals(product)){
                        for (Organization o : e.getDepartmentDirectory().getDepartmentList()) {
                            if (o.getType().equals(Organization.OrganizationType.ProductManageDept) && o.getProductCatalog().getProductList().contains(oi.getProduct())) {
                                o.getWorkQueue().getWorkRequestList().add(iwr);
                                for (Role r : o.getSupportedRoles()) {
                                    iwr.setReceiver(r);
                                }
                            }
                        }
                    }
                }
//             }
//             }

            }
//              JOptionPane.showMessageDialog(null, "Sorry, the product is out of inventory");
//               order.removeOrderItem(oi); 
        }
        product.getLeftProduct().updateLeftQuantity(oi);

//         System.out.println("the left quantity is"+product.getLeftQuantity());

        // 3.refresh oi table
        popOITable();


    }//GEN-LAST:event_addToCartJButtonActionPerformed

    private void checkOutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutJButtonActionPerformed
        // TODO add your handling code here:
        //add local order into masterOrderList;
        if (order.getOis().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Must select some item!");
            return;
        }
        for (Organization o : business.getDepartmentDirectory().getDepartmentList()) {
            if (o.getType().equals(Organization.OrganizationType.AmazonSalesDept)) {
                o.getMasterOrderList().add(order);
            }
        }
     
//        business.getMasterOrderList().add(order);
        order.setOrderStatus(Order.PENDING);
//        order.setDeliverEmployee(employee);
        order.setCustomer(ua);
//        int selectedRow = orderItemJTable.getSelectedRow();
//        if (selectedRow < 0) {
//            return;
//        }
//        Order selectedOrder = (Order) orderItemJTable.getValueAt(selectedRow, 0);   
//        Transcation t = new Transcation();
        for (Organization o : business.getDepartmentDirectory().getDepartmentList()) {
            if (o.getType().equals(Organization.OrganizationType.AmazonAccountingDept)) {
                Invoice invoice = o.getInvoiceList().creInvoice();
                invoice.setOrder(order);
                Date curDate = new Date(System.currentTimeMillis());
                invoice.setDate(curDate);
                invoice.setInvoiceStatus("Pending");
                CheckOutJPanel checkOutJPanel = new CheckOutJPanel(userProcessContainer, business, invoice);
                userProcessContainer.add("CheckOutJPanel", checkOutJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                // clear local order(shopping cart)
                order = new Order();
                // refresh table
                popOITable();
            }
        }
//         Invoice invoice = business.getInvoiceList().creInvoice();


    }//GEN-LAST:event_checkOutJButtonActionPerformed

    private void backjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton3ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton3ActionPerformed
    private void popOITable() {
        int rowCount = orderItemJTable.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) orderItemJTable.getModel()).removeRow(i);
        }

        for (OrderItem oi : order.getOis()) {
            Object row[] = new Object[3];
            row[0] = oi;
            row[1] = oi.getQuantity();
            row[2] = oi.getProduct().getActualPrice();


            ((DefaultTableModel) orderItemJTable.getModel()).addRow(row);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartJButton;
    private javax.swing.JButton backjButton3;
    private javax.swing.JButton checkOutJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderItemJTable;
    private javax.swing.JTable productcatalogTable;
    private javax.swing.JSpinner quantityJSpinner;
    private javax.swing.JComboBox suppComboBox1;
    // End of variables declaration//GEN-END:variables
}
