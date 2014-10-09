/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SupplierRole;

import business.Business;
import system.Employee.Employee;
import system.Role.Role;
import system.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import system.Enterprise.Enterprise;
import system.NetWork.NetWork;
import system.Organization.Organization;
import system.UserAccount.UserAccountDirectory;

/**
 *
 * @author Administrator
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    JPanel container;
   Business business;
//    Supplier s;
    Enterprise e;
    UserAccountDirectory userAccountDirectory;
    public ManageUserAccountJPanel(JPanel container,
    Business business,
            Enterprise e) {
        initComponents();
        this.container = container;
        this.business = business;
//        this.s = (Supplier)e;
        this.e =e;
        this.userAccountDirectory = e.getUserAccountDirectoty();
        populateOrganization();
       
    }
    private void populateOrganization(){
    for(Organization o: e.getDepartmentDirectory().getDepartmentList()){
             orgJComboBox.addItem(o);
    } 
   
    }
    private void populateEmployee(){
        empJComboBox.removeAllItems();
        Organization o= (Organization)orgJComboBox.getSelectedItem();
         for(Employee e: o.getEmployeeDirectory().getEmployeeList()){
             
          empJComboBox.addItem(e);
         }
    }
    private void populateRole(){
        roleJComboBox.removeAllItems();
      Organization o= (Organization)orgJComboBox.getSelectedItem();
      for(Role r: o.getSupportedRoles()){
      roleJComboBox.addItem(r);
      }
    }
    private void createUserAccount(){
           Organization o = (Organization)orgJComboBox.getSelectedItem();
          
           UserAccount ua = new UserAccount();
             String userName = userNameJTextField.getText();
            for (NetWork n : business.getNetWorkDirectory().getNetWorkList()) {
            boolean check = business.getUserAccountDirectoty().checkUserName(userName);
            if (check == true) {
                JOptionPane.showMessageDialog(null, "UserName has exsited!");
                return;
            }
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                boolean checkE = e.getUserAccountDirectoty().checkUserName(userName);
                if (checkE == true) {
                    JOptionPane.showMessageDialog(null, "UserName has exsited!");
                    return;
                }
                for (Organization organization : e.getDepartmentDirectory().getDepartmentList()) {
                    boolean checkO = organization.getUserAccountDirectoty().checkUserName(userName);
                    if (checkO == true) {
                        JOptionPane.showMessageDialog(null, "UserName has exsited!");
                        return;
                    }
                }
            }
        }
             ua.setUserName(userName);
           
//             boolean check =business.getUserAccountDirectoty().checkUserName(userName);
//                     userAccountDirectory.checkUserName(userName);  
//             if(check==true){
//                 JOptionPane.showMessageDialog(null, "UserName has exsited!");
//                return;
//             }else{
//           UserAccount ua = o.getUserAccountDirectoty().creUserAccount();
                o.getUserAccountDirectoty().getUserAccountList().add(ua);
//                userAccountDirectory.getUserAccountList().add(ua);
//           ua.setUserName(userNameJTextField.getText());
           ua.setPassword(pwJTextField.getText());
           ua.setPerson((Employee)empJComboBox.getSelectedItem());
           ua.setRole((Role)roleJComboBox.getSelectedItem());
           // setEnterprise
           ua.setEnterprise(e);
           ua.setOrganizationType(o.getType());
//             }
           populateTable();
           
    
    }
    private void populateTable(){
            Organization o = (Organization)orgJComboBox.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel)userAccountJTable.getModel();
         model.setNumRows(0);
         for(UserAccount ua: o.getUserAccountDirectoty().getUserAccountList()){
          Object [] row = new Object [2];
          row[0]= ua.getUserName();
          row[1]=ua.getRole();
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
        userAccountJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        orgJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        creJButton = new javax.swing.JButton();
        empJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        pwJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        userNameJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userAccountJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserName", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userAccountJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 340, 110));

        jLabel1.setText("Employee:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        orgJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgJComboBoxActionPerformed(evt);
            }
        });
        add(orgJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 190, -1));

        jLabel2.setText("Organization:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        creJButton.setText("Create");
        creJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creJButtonActionPerformed(evt);
            }
        });
        add(creJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        add(empJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 190, -1));

        jLabel3.setText("Role:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        add(roleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 190, -1));

        jLabel4.setText("Password:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));
        add(pwJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 90, -1));

        jLabel5.setText("UserName:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));
        add(userNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 90, -1));

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void orgJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgJComboBoxActionPerformed
        // TODO add your handling code here:
        populateEmployee();
        populateRole();
        populateTable();
    }//GEN-LAST:event_orgJComboBoxActionPerformed

    private void creJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creJButtonActionPerformed
        // TODO add your handling code here:
        createUserAccount();
       
    }//GEN-LAST:event_creJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout)container.getLayout();
        layout.previous(container);

    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton creJButton;
    private javax.swing.JComboBox empJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox orgJComboBox;
    private javax.swing.JTextField pwJTextField;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTable userAccountJTable;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
