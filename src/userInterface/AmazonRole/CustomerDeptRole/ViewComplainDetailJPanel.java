/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AmazonRole.CustomerDeptRole;

import business.Business;
import java.awt.CardLayout;
import javax.swing.JPanel;
import system.UserAccount.UserAccount;
import system.WorkQueue.WorkRequest;
import javax.swing.Icon;
import system.Order.Order;
import system.Organization.Organization;
public class ViewComplainDetailJPanel extends javax.swing.JPanel {

     JPanel container;
    Business business;
    UserAccount ua;
    WorkRequest ccr;
    Icon icon;
    public ViewComplainDetailJPanel( JPanel container,
    Business business,
    UserAccount ua,
    WorkRequest ccr,
    Icon icon) {
        initComponents();
        this.container =container;
        this.business =business;
        this.ua=ua;
        this.ccr=ccr;
        this.icon =icon;
//       Icon icon = new ImageIcon(ua.getImage());
        imageLabel.setIcon(icon);
        customerUserNameJTextField.setText(ccr.getSender().getUserName());
        for(Organization or: business.getDepartmentDirectory().getDepartmentList()){
         if(or.getType().equals(Organization.OrganizationType.AmazonSalesDept)){
            for(Order o: or.getMasterOrderList().getOrders()){
                if(o.getCustomer().equals(ccr.getSender())){
            orderIDJTextField.setText(String.valueOf(o.getOrderNum()));
            }
        }
         }
        }
     
        productNameJTextField.setText(ccr.getOrderItem().getProduct().getName());
        complainTypeJTextArea.setText(ccr.getTypeInfo());
        reasonJTextField.setText(ccr.getMessage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        orderIDJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        complainTypeJTextArea = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        reasonJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        customerUserNameJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        productNameJTextField = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Picture:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));
        add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 190, 90));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("View Customer Complain Detail");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, -1, -1));

        jLabel5.setText("Order ID:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));
        add(orderIDJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 100, -1));

        jLabel2.setText("Complain Type:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, 20));

        complainTypeJTextArea.setColumns(20);
        complainTypeJTextArea.setRows(5);
        jScrollPane2.setViewportView(complainTypeJTextArea);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 170, 60));

        jLabel6.setText("Reason:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));
        add(reasonJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 130, -1));

        jLabel3.setText("Customer UserName:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));
        add(customerUserNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 130, -1));

        jLabel4.setText("Product Name:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));
        add(productNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextArea complainTypeJTextArea;
    private javax.swing.JTextField customerUserNameJTextField;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField orderIDJTextField;
    private javax.swing.JTextField productNameJTextField;
    private javax.swing.JTextField reasonJTextField;
    // End of variables declaration//GEN-END:variables
}