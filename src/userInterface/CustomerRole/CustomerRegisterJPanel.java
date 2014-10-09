/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.CustomerRole;

import business.Business;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import system.Customer.Customer;
import system.Location.Location;
import system.Location.SubLocation;
import system.NetWork.NetWork;
import system.Person.Person;

/**
 *
 * @author Administrator
 */
public class CustomerRegisterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerRegisterJPanel
     */
    JPanel container;
    Business business;
//Customer c;
    Person p;

    public CustomerRegisterJPanel(
            JPanel container,
            Person p,
            Business business) {
        initComponents();
        this.container = container;
        this.business = business;
//        this.c=(Customer)p;
        this.p = p;
        populateNetWorkComboBox();
        addStateJPanel.setVisible(false);
     nextStepButton.setVisible(false);
    }

    private void populateNetWorkComboBox() {
        networkJComboBox.removeAllItems();


        for (NetWork network : business.getNetWorkDirectory().getNetWorkList()) {
            networkJComboBox.addItem(network);
        }


    }

    private void populateStateComboBox(NetWork network) {
        stateJComboBox.removeAllItems();

        for (Location l : network.getLocationDirectory().getLocationList()) {
            stateJComboBox.addItem(l);
        }
    }

    private void populateCityComboBox(Location l) {
        cityJComboBox.removeAllItems();
        for (SubLocation sbl : l.getSblocation()) {
            cityJComboBox.addItem(sbl);
        }
    }

    public void createPersonProfile() {
        try {
            p.setFirstName(fnJTextField.getText());
            p.setLastName(lnJTextField.getText());
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            p.setDob(formatter.parse(dboJTextField.getText()));
            p.setAge(Integer.parseInt(ageJTextField.getText()));
//            p.setSsn(ssnJTextField.getText());
            p.setGender(genderJTextField.getText());
            p.setTelephoneNo(phonenumJTextField.getText());
            Location l = (Location) stateJComboBox.getSelectedItem();
            p.setLocation(l);
            p.getLocation().setCountry(networkJComboBox.getSelectedItem().toString());
            p.getLocation().setState(l.getName());
            p.getLocation().setCity(l.getCity());
            p.getLocation().setStreet(streetJTextField.getText());
            nextStepButton.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Information!");
            nextStepButton.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fnJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lnJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dboJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        phonenumJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ageJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        streetJTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cityJComboBox = new javax.swing.JComboBox();
        networkJComboBox = new javax.swing.JComboBox();
        stateJComboBox = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        nextStepButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        genderJTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        saveJButton = new javax.swing.JButton();
        addStateJButton = new javax.swing.JButton();
        addStateJPanel = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        addStateNameJTextField = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        addCityNameJTextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Customer Register");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jLabel2.setText("First Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));
        add(fnJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 100, -1));

        jLabel3.setText("Last Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));
        add(lnJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 100, -1));

        jLabel4.setText("Date of Birth:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));
        add(dboJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 100, -1));

        jLabel5.setText("Phone number:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        phonenumJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumJTextFieldActionPerformed(evt);
            }
        });
        add(phonenumJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 100, -1));

        jLabel7.setText("Age:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));
        add(ageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 100, -1));

        jLabel6.setText("Country:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));
        add(streetJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 110, -1));

        jLabel9.setText("Address:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        jLabel10.setText("Street:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        jLabel11.setText("City:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, -1, -1));

        jLabel12.setText("State:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        add(cityJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 90, -1));

        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 90, -1));

        stateJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateJComboBoxActionPerformed(evt);
            }
        });
        add(stateJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 90, -1));

        jLabel13.setText("(Important!)");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        jLabel14.setText("Billing Address:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        nextStepButton.setText("Next Step");
        nextStepButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextStepButtonActionPerformed(evt);
            }
        });
        add(nextStepButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Create Person Profile");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        jLabel16.setText("Gender:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));
        add(genderJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 100, -1));

        jLabel17.setText("(yyyy/MM/dd)");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        saveJButton.setText("Save");
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });
        add(saveJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, -1));

        addStateJButton.setText("Add Location");
        addStateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStateJButtonActionPerformed(evt);
            }
        });
        add(addStateJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 110, -1));

        addStateJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setText("State Name:");
        addStateJPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        addStateJPanel.add(addStateNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, -1));

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        addStateJPanel.add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel20.setText("City Name:");
        addStateJPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        addStateJPanel.add(addCityNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, -1));

        add(addStateJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 190, 170));

        jLabel19.setText("Can't find Location?");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void phonenumJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenumJTextFieldActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void nextStepButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextStepButtonActionPerformed
   
        CustomerRegister2JPanel customerRegister2JPanel = new CustomerRegister2JPanel(container, p, business);
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("RegisterCustomer2", customerRegister2JPanel);
        layout.next(container);
    }//GEN-LAST:event_nextStepButtonActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        // TODO add your handling code here:
        NetWork network = (NetWork) networkJComboBox.getSelectedItem();
        if (network != null) {
            populateStateComboBox(network);
        }

    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void stateJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateJComboBoxActionPerformed
        // TODO add your handling code here:
        Location l = (Location) stateJComboBox.getSelectedItem();
        if (l != null) {
            populateCityComboBox(l);
        }
    }//GEN-LAST:event_stateJComboBoxActionPerformed
    private void addLocation() {
        Location l = new Location();
        l.setName(addStateNameJTextField.getText());
        l.setState(addStateNameJTextField.getText());
        NetWork n = (NetWork) networkJComboBox.getSelectedItem();
        boolean checkL = n.getLocationDirectory().checkLocationName(addStateNameJTextField.getText());
        if (checkL == false) {
            n.getLocationDirectory().getLocationList().add(l);
        }
        l.setCountry(n.getName());
//             = network.getLocationDirectory().creLocation();
//        e.setLocation(l);
//        e.getLocation().setName(wr.getStateInfo());
//        e.getLocation().setCountry(n.getName());
//        e.getLocation().setState(l.getName());
        SubLocation sbl = new SubLocation();
        sbl.setName(addCityNameJTextField.getText());
        l.setCity(sbl.getName());
        boolean checkSubL = l.checkSubLocationName(addCityNameJTextField.getText());
        if (checkSubL == false) {
            l.getSblocation().add(sbl);
        }
        populateStateComboBox(n);
        populateCityComboBox(l);
    }

    private void addSubLocation() {
        Location l = (Location) stateJComboBox.getSelectedItem();
        SubLocation sbl = new SubLocation();
        boolean checkSubL = l.checkSubLocationName(addCityNameJTextField.getText());
        if (checkSubL == false) {
            l.getSblocation().add(sbl);
        }
        populateCityComboBox(l);

    }
    private void addStateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStateJButtonActionPerformed
        // TODO add your handling code here:
        addStateJPanel.setVisible(true);
//        addLocation();
    }//GEN-LAST:event_addStateJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        // TODO add your handling code here:
        addLocation();
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
        // TODO add your handling code here:
        createPersonProfile();
        Customer c= business.getCustomerDirectory().creCustomer(p);
//        nextStepButton.setVisible(true);
    }//GEN-LAST:event_saveJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addCityNameJTextField;
    private javax.swing.JButton addStateJButton;
    private javax.swing.JPanel addStateJPanel;
    private javax.swing.JTextField addStateNameJTextField;
    private javax.swing.JTextField ageJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox cityJComboBox;
    private javax.swing.JTextField dboJTextField;
    private javax.swing.JTextField fnJTextField;
    private javax.swing.JTextField genderJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lnJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JButton nextStepButton;
    private javax.swing.JTextField phonenumJTextField;
    private javax.swing.JButton saveJButton;
    private javax.swing.JComboBox stateJComboBox;
    private javax.swing.JTextField streetJTextField;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
