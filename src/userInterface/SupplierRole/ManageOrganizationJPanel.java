/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SupplierRole;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import system.Enterprise.Enterprise;
import system.Organization.DepartmentDirectory;
import system.Organization.Organization;
import system.Organization.Organization.OrganizationType;

/**
 *
 * @author Administrator
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganizationJPanel
     */
    JPanel container;
//    Business business;
//    Supplier s;
    Enterprise e;
    DepartmentDirectory departmentDirectory;
    public ManageOrganizationJPanel( JPanel container,
  Enterprise e) {
        initComponents();
        this.container = container;
//        this.business = business;
//        this.s =(Supplier)e;
        this.e = e;
        departmentDirectory = e.getDepartmentDirectory();
        populateTableData();
        populateTypeCombo();
    }
    private void populateTypeCombo(){
    for(OrganizationType t: Organization.OrganizationType.values()){
        if(t.equals(Organization.OrganizationType.SupplierSalesDept)||t.equals(Organization.OrganizationType.ProductManageDept)||t.equals(Organization.OrganizationType.EnterpriseAccountingDept))
               orgTypeJComboBox.addItem(t);
               
    }
    
       
    }
private void populateTableData(){
          DefaultTableModel model = (DefaultTableModel)orgJTable.getModel();
          model.setNumRows(0);
          for(Organization o: departmentDirectory.getDepartmentList()){
                 Object[] row = new Object[2];
                 row[0]= o.getOrgId();
                 row[1]=o.getOrgName();
                 model.addRow(row);
          }

}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        orgJTable = new javax.swing.JTable();
        creJButton = new javax.swing.JButton();
        orgTypeJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orgJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orgJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 340, 110));

        creJButton.setText("Create");
        creJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creJButtonActionPerformed(evt);
            }
        });
        add(creJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        add(orgTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 140, -1));

        jLabel2.setText("Organization Type");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Manage Organization");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout)container.getLayout();
        layout.previous(container);
                
    }//GEN-LAST:event_backJButtonActionPerformed

    private void creJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creJButtonActionPerformed
        // TODO add your handling code here:
     Organization o= departmentDirectory.creOrganization((OrganizationType)orgTypeJComboBox.getSelectedItem());
     o.setType((OrganizationType)orgTypeJComboBox.getSelectedItem());
     populateTableData();
    }//GEN-LAST:event_creJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton creJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orgJTable;
    private javax.swing.JComboBox orgTypeJComboBox;
    // End of variables declaration//GEN-END:variables
}
