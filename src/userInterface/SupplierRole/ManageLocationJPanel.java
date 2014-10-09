/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SupplierRole;

import business.Business;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import system.Enterprise.Enterprise;
import system.Location.Location;
import system.Location.SubLocation;
import system.NetWork.NetWork;

/**
 *
 * @author Administrator
 */
public class ManageLocationJPanel extends javax.swing.JPanel {

   
    JPanel container;
    Business business;
    Enterprise e;
    public ManageLocationJPanel(JPanel container,
    Enterprise e,
    Business business) {
        initComponents();
        this.container=container;
        this.e=e;
        this.business=business;
    }
private void populateTree(){
    DefaultTreeModel model= (DefaultTreeModel)locationJTree.getModel();
    DefaultMutableTreeNode root  =(DefaultMutableTreeNode)model.getRoot();
    root.removeAllChildren();
    DefaultMutableTreeNode networkNode;
    DefaultMutableTreeNode locationNode;
    DefaultMutableTreeNode sbLNode;
     DefaultMutableTreeNode entNode;
//    ArrayList<NetWork> networkList = netWorkDirectory.getNetWorkList();
//    for(int i = 0; i<networkList.size(); i++){
//    Network net = networkList.get(i);
//   networkNode = new DefaultMutableTreeNode(net.getName());
//   root.insert(networkNode, i);
//    }
    for(NetWork net:business.getNetWorkDirectory().getNetWorkList()){
     
//  boolean check=netWorkDirectory.checkNetWorkName(net.getName());
//  if(check== true){
//  return;
//  }  
  networkNode = new DefaultMutableTreeNode(net.getName());
   if(e.getLocation().getCountry().equals(net.getName()))  
  root.insert(networkNode, 0);
    
    ArrayList<Location>locationList= net.getLocationDirectory().getLocationList();
    for(Location l: locationList){
   
//       boolean checkL=net.getLocationDirectory().checkLocationName(l.getName());
//  if(checkL== true){
//  return;
//  } 
  locationNode = new DefaultMutableTreeNode(l.getName());
    networkNode.insert(locationNode, 0);
  
    ArrayList<SubLocation>sbList= l.getSblocation();
    for(int j=0; j<sbList.size(); j++){
        SubLocation sbL = sbList.get(j);
    
//        boolean checkSubL=l.checkSubLocationName(sbL.getName());
//  if(checkSubL== true){
//  return;
//  }
   sbLNode = new DefaultMutableTreeNode(sbL.getName());
     locationNode.insert(sbLNode, j);
     
     
//        ArrayList<Enterprise> entList = net.getEnterpriseDirectory().getEnterpriseList();
//     for(Enterprise e: entList){
//     if(e.getLocation().getCity().equals(sbL.getName())){
//          entNode = new DefaultMutableTreeNode();
//     sbLNode.insert(entNode, 0);
//     }
//    }
    
    }
    }}
   
//root = new DefaultMutableTreeNode("Global");
// root.removeAllChildren();
//model = new DefaultTreeModel(root);
//model.addTreeModelListener(new MyTreeModelListener() { });
//
//locationJTree = new JTree(model);
//locationJTree.setEditable(true);
//locationJTree.getSelectionModel().setSelectionMode
//        (TreeSelectionModel.SINGLE_TREE_SELECTION);
//locationJTree.setShowsRootHandles(true);
    model.reload();
    

 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        creStateJButton = new javax.swing.JButton();
        creCityJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        refreshTreeJButton = new javax.swing.JButton();
        locationJTree = new javax.swing.JTree();
        lblSelectNodeJLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Location");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        creStateJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        creStateJButton.setText("Manage State");
        creStateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creStateJButtonActionPerformed(evt);
            }
        });
        add(creStateJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        creCityJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        creCityJButton.setText("Manage City");
        creCityJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creCityJButtonActionPerformed(evt);
            }
        });
        add(creCityJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 130, -1));

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        refreshTreeJButton.setText("Refresh Tree");
        refreshTreeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTreeJButtonActionPerformed(evt);
            }
        });
        add(refreshTreeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Global");
        locationJTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        locationJTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                locationJTreeValueChanged(evt);
            }
        });
        add(locationJTree, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 150, 270));
        add(lblSelectNodeJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 11, 260, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void creStateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creStateJButtonActionPerformed
        // TODO add your handling code here:
        // DefaultMutableTreeNode node =(DefaultMutableTreeNode)locationJTree.getLastSelectedPathComponent();
        //      NetWork n = (NetWork)locationJTree.getLastSelectedPathComponent();
        CreateStateJPanel createStateJPanel = new CreateStateJPanel(container,e,business);
        CardLayout layout = (CardLayout)container.getLayout();
        container.add("CreateStateJPanel",createStateJPanel);
        layout.next(container);
        //        if (countryJTextField.getText().equals("")) {
            //            JOptionPane.showMessageDialog(null, "Invalid name!");
            //        } else {
            //            NetWork netWork = netWorkDirectory.creNetWork();
            //           Location l= netWork.getLocationDirectory().creLocation();
            //            l.setCountry(countryJTextField.getText());
            //
            //            netWork.setLocation(l);
            //            popdata();
            //        }
    }//GEN-LAST:event_creStateJButtonActionPerformed

    private void creCityJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creCityJButtonActionPerformed
        // TODO add your handling code here:
        CreateCityJPanel createCityJPanel = new CreateCityJPanel(container,e,business);
        CardLayout layout = (CardLayout)container.getLayout();
        container.add("CreateCityJPanel",createCityJPanel);
        layout.next(container);
    }//GEN-LAST:event_creCityJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void refreshTreeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTreeJButtonActionPerformed
        // TODO add your handling code here:
        populateTree();
    }//GEN-LAST:event_refreshTreeJButtonActionPerformed

    private void locationJTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_locationJTreeValueChanged
        // TODO add your handling code here:
        DefaultMutableTreeNode node =(DefaultMutableTreeNode)locationJTree.getLastSelectedPathComponent();
        if(node!=null)
        lblSelectNodeJLabel.setText(node.toString());
    }//GEN-LAST:event_locationJTreeValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton creCityJButton;
    private javax.swing.JButton creStateJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblSelectNodeJLabel;
    private javax.swing.JTree locationJTree;
    private javax.swing.JButton refreshTreeJButton;
    // End of variables declaration//GEN-END:variables
}
