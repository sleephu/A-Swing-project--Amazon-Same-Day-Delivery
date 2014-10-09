/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AmazonRole.SystemAdminRole;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import system.Location.Location;
import system.Location.SubLocation;
import system.NetWork.NetWork;
import system.NetWork.NetWorkDirectory;

/**
 *
 * @author Administrator
 */
public class CreateCityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateCityJPanel
     */
    JPanel container;
    NetWorkDirectory netWorkDirectory;
    public CreateCityJPanel(
           JPanel container,
    NetWorkDirectory netWorkDirectory   ) {
        initComponents();
        this.container =container;
                this.netWorkDirectory =netWorkDirectory;
    populateComboBox();
    }

     private void populateComboBox(){
//        networkJComboBox.removeAllItems();   
         
        for (NetWork network : netWorkDirectory.getNetWorkList()){
            networkJComboBox.addItem(network);
        
        }
        
    }
     private void populateStateComboBox(){
        stateJComboBox.removeAllItems();
         NetWork n = (NetWork)networkJComboBox.getSelectedItem();
         for (Location l : n.getLocationDirectory().getLocationList()){
            stateJComboBox.addItem(l);
        }
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        creJButton = new javax.swing.JButton();
        cityJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        stateJComboBox = new javax.swing.JComboBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        creJButton.setText("Create");
        creJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creJButtonActionPerformed(evt);
            }
        });
        add(creJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));
        add(cityJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 80, -1));

        jLabel2.setText("City:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Create State");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        jLabel3.setText("Network");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 80, -1));

        jLabel4.setText("State/Province");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        add(stateJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 80, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void creJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creJButtonActionPerformed
        // TODO add your handling code here:

        if (cityJTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Invalid name!");
        } else {

            //            Location l= netWork.getLocationDirectory().creLocation();
//            NetWork netWork = (NetWork)networkJComboBox.getSelectedItem();
            Location l=  (Location)stateJComboBox.getSelectedItem();
//                        SubLocation sbl = l.creSubLocation();
              SubLocation sbl = new SubLocation();
                boolean checkSubL = l.checkSubLocationName(cityJTextField.getText());
                if (checkSubL == false) {
                    l.getSblocation().add(sbl);
                }            
            sbl.setName(cityJTextField.getText());
                        l.setCity(cityJTextField.getText());
            //            l.getLocation().add(sbl);
            //            netWork.setLocation(l);
            //            popdata();
        }
    }//GEN-LAST:event_creJButtonActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        // TODO add your handling code here:
populateStateComboBox();
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField cityJTextField;
    private javax.swing.JButton creJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JComboBox stateJComboBox;
    // End of variables declaration//GEN-END:variables
}
