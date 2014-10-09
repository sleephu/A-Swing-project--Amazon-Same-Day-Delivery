/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.TempRole;

import business.Business;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import system.Employee.Employee;
import system.Enterprise.Enterprise;
import system.Enterprise.Enterprise.EnterpriseType;
import system.NetWork.NetWork;
import system.Organization.Organization;
import system.Person.Person;
import system.Role.SystemAdminRole;
import system.Role.TempRole;
import system.UserAccount.UserAccount;
import system.WorkQueue.TempEnterpriseRequest;
import system.WorkQueue.WorkRequest;

/**
 *
 * @author Administrator
 */
public class RetalierRegisterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RetalierRegisterJPanel
     */
    JPanel container;
    Business business;
//    UserAccount ua;
    Person p;
    WorkRequest workRequest;

    public RetalierRegisterJPanel(
            JPanel container,
            //            UserAccount ua,
            Person p,
            Business business) {
        initComponents();
        this.container = container;
//        this.ua = ua;
        this.business = business;
        this.p = p;

//        populateCountry();
        populateComboBox();
    }
//   public void createUser(){
//      ua.setUserName(userNameJTextField.getText());
//      ua.setPassword(passwordJTextField.getText());
//   }

//    private void populateCountry() {
//        countryJComboBox.removeAllItems();
//        for (NetWork nw : business.getNetWorkDirectory().getNetWorkList()) {
//            countryJComboBox.addItem(nw);
//
//
//        }
//    }
    private void populateComboBox() {
        networkJComboBox.removeAllItems();
        enterpriseTypeJComboBox.removeAllItems();

        for (NetWork network : business.getNetWorkDirectory().getNetWorkList()) {
            networkJComboBox.addItem(network);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            if (type.equals(Enterprise.EnterpriseType.TempRetailerEnterprise) || type.equals(Enterprise.EnterpriseType.TempShippingEnterprise)) {
                enterpriseTypeJComboBox.addItem(type);
            }
        }

    }

    private void createWorkRequest() {

//        UserAccount ua = userAccountDirectory.creUser();
//        ua.setPerson(up);
        if (nameJTextField.getText().equals("") || stateJTextField.getText().equals("") || cityJTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Invalid information!");
            return;
        }
//        else {
        NetWork network = (NetWork) networkJComboBox.getSelectedItem();

        if (network == null) {
            JOptionPane.showMessageDialog(null, "No NetWork Selected!");
            return;
        }
        EnterpriseType enterpriseType = (EnterpriseType) enterpriseTypeJComboBox.getSelectedItem();
        Enterprise e = network.getEnterpriseDirectory().createEnterprise(nameJTextField.getText(), enterpriseType);
        Employee employee=e.getEmployeeDirectory().creEmployee();
        employee.setEmpName(nameJTextField.getText());
//                Supplier s = (Supplier) network.getEnterpriseDirectory().createEnterprise(nameJTextField.getText(), Enterprise.EnterpriseType.TempLocalRetalier);
//     s.getLocation().setCountry((String)countryJComboBox.getSelectedItem());
//        e.setEnterpriseName(nameJTextField.getText());
//        Location l = new Location();
//        boolean checkL = network.getLocationDirectory().checkLocationName(stateJTextField.getText());
//        if (checkL == false) {
//            network.getLocationDirectory().getLocationList().add(l);
//        }
//             = network.getLocationDirectory().creLocation();
//        e.setLocation(l);
//        e.getLocation().setName(stateJTextField.getText());
//        e.getLocation().setCountry(network.getName());
//        e.getLocation().setState(l.getName());
//        SubLocation sbl = new SubLocation();
//        boolean checkSubL = l.checkSubLocationName(cityJTextField.getText());
//        if (checkSubL == false) {
//            l.getSblocation().add(sbl);
//        }
//                        = l.creSubLocation();
//        sbl.setName(cityJTextField.getText());
//        e.getLocation().setCity(sbl.getName());
//       s.getLocation().setCity((String)sbl);


//        NetWork nw =(NetWork)countryJComboBox.getSelectedItem();
//        Supplier s = (Supplier)nw.getEnterpriseDirectory().createEnterprise(nameJTextField.getText(), Enterprise.EnterpriseType.TempLocalRetalier);
        UserAccount ua = new UserAccount();
        String userName = userNameJTextField.getText();
        ua.setUserName(userName);
        ua.setPassword(passwordJTextField.getText());
        ua.setEnterprise(e);
        ua.setRole(new TempRole());
        ua.setPerson(employee);
         for (NetWork n : business.getNetWorkDirectory().getNetWorkList()) {
            boolean check = business.getUserAccountDirectoty().checkUserName(userName);
            if (check == true) {
                JOptionPane.showMessageDialog(null, "UserName has exsited!");
                return;
            }
            for (Enterprise en : n.getEnterpriseDirectory().getEnterpriseList()) {
                boolean checkE = en.getUserAccountDirectoty().checkUserName(userName);
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
         e.getUserAccountDirectoty().getUserAccountList().add(ua);
//        for (NetWork n : business.getNetWorkDirectory().getNetWorkList()) {
//            for (Enterprise en : n.getEnterpriseDirectory().getEnterpriseList()) {
//                boolean check = en.getUserAccountDirectoty().checkUserName(userName);
//                if (check == true) {
//                    JOptionPane.showMessageDialog(null, "UserName has exsited!");
//                 e.getUserAccountDirectoty().deleUserAccount(ua);
//                    return;
//                }
//                en.getUserAccountDirectoty().getUserAccountList().add(ua);
//
//            }
//        }
//        System.out.println("Ua is in enterprise?"+ua.getRole());
//else {
//           UserAccount ua = o.getUserAccountDirectoty().creUserAccount();
//                o.getUserAccountDirectoty().getUserAccountList().add(ua);
//                business.getUserAccountDirectoty().getUserAccountList().add(ua);


//                userAccountDirectory.getUserAccountList().add(ua);
//           ua.setUserName(userNameJTextField.getText());
//           ua.setPassword(pwJTextField.getText());

//           ua.setEmployee((Employee)empJComboBox.getSelectedItem());
//           ua.setRole((Role)roleJComboBox.getSelectedItem());
//            business.getUserAccountDirectoty().getUserAccountList().add(ua);
//        business.getUserAccountDirectoty().checkUserName(userNameJTextField.getText());
//        ua.setUserName(userNameJTextField.getText());


//         ua.setSupplier(s);

        TempEnterpriseRequest tswr = new TempEnterpriseRequest();
        tswr.setSender(ua);
        tswr.setReceiver(new SystemAdminRole());
        tswr.setMessage(nameJTextField.getText());
        tswr.setCountryInfo(network.getName());
        tswr.setCityInfo(cityJTextField.getText());
        tswr.setStateInfo(stateJTextField.getText());
        tswr.setTypeInfo(enterpriseType.toString());
        tswr.setStatus("Pending");
        tswr.setWorkRequestType(WorkRequest.WorkRequestType.TempEnterpriseRequest);
        business.getWorkQueue().getWorkRequestList().add(tswr);
//        for(NetWork n: business.getNetWorkDirectory().getNetWorkList()){
//        for (Enterprise e :n.getEnterpriseDirectory().getEnterpriseList() ) {
//            if (e instanceof Business) {
//                e.getWorkQueue().getWorkRequestList().add(tswr);
//            }
//        }}
//        System.out.println("ua"+ua);
//        ua.getWorkQueue().getWorkRequestList().add(pwr);
//        ua.getWorkQueue().getWorkRequestList().add(tswr);
        JOptionPane.showMessageDialog(null, "Request Sent!");
//                        }
//                    }
//                }



//                s.getUserAccountDirectoty().creUserAccount();

//         }
//            }
//        }
    }

//    public void createEnterprise() {
//        if (nameJTextField.getText().equals("") | stateJTextField.getText().equals("") | cityJTextField.getText().equals("")) {
//            JOptionPane.showMessageDialog(null, "Invalid information!");
//        } else {
//            NetWork network = (NetWork) networkJComboBox.getSelectedItem();
//            if (network != null) {
//                Enterprise enterprise = network.getEnterpriseDirectory().createEnterprise(nameJTextField.getText(), Enterprise.EnterpriseType.LocalRetalier);
//                enterprise.getLocation().setCountry((String) networkJComboBox.getSelectedItem());
//                enterprise.getLocation().setState(stateJTextField.getText());
//                enterprise.getLocation().setCity(cityJTextField.getText());
//
//                JOptionPane.showMessageDialog(null, "enterprise created!");
//            }
//        }
//   Enterprise enterprise =nw.getEnterpriseDirectory().createEnterprise(nameJTextField.getText(), Enterprise.EnterpriseType.LocalRetalier);
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        stateJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cityJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        userNameJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        passwordJTextField = new javax.swing.JTextField();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        createJButton = new javax.swing.JButton();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Enterprise Register");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 100, -1));

        jLabel3.setText("Net Work:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));
        add(stateJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 100, -1));

        jLabel4.setText("City:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));
        add(cityJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 100, -1));

        jLabel5.setText("UserName:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));
        add(userNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 100, -1));

        jLabel6.setText("Password:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));
        add(passwordJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 100, -1));

        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 110, -1));

        jLabel7.setText("State:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        createJButton.setText("Send Request");
        createJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJButtonActionPerformed(evt);
            }
        });
        add(createJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        enterpriseTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseTypeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseTypeJComboBoxActionPerformed(evt);
            }
        });
        add(enterpriseTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 110, 20));

        jLabel8.setText("Enterprise Type:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
//private void populateTableData(NetWork nw) {
//        DefaultTableModel model = (DefaultTableModel)enterpriseJTable.getModel();
//        model.setNumRows(0);
//        for (WorkRequest wr : nw.getEnterpriseDirectory().getEnterpriseList()) {
//            if(enterprise instanceof Supplier){
//            Object[] row = new Object[5];
//            row[0] = enterprise;
//            row[1] = .getUserName();
//            row[2] = nw.getLocation();
//            row[3]= nw.getLocation().getState();
//            row[4]=nw.getLocation().getCity();
//            model.addRow(row);
//        }
//}
//}
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void createJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJButtonActionPerformed
        // TODO add your handling code here:
        createWorkRequest();
    }//GEN-LAST:event_createJButtonActionPerformed

    private void enterpriseTypeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseTypeJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseTypeJComboBoxActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField cityJTextField;
    private javax.swing.JButton createJButton;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JTextField stateJTextField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
