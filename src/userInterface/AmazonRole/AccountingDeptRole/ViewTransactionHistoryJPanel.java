/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AmazonRole.AccountingDeptRole;

import business.Business;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import system.Organization.Organization;
import system.Transcation.Transcation;
import system.UserAccount.UserAccount;

/**
 *
 * @author Administrator
 */
public class ViewTransactionHistoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewTransactionHistoryJPanel
     */
    JPanel container;
    Business business;
    UserAccount ua;
    Organization  accO;
    public ViewTransactionHistoryJPanel(
          JPanel container,
    Business business,
    UserAccount ua,Organization accO   ) {
        initComponents();
        this.container =container;
        this.business =business;
        this.ua=ua;
      this.accO=accO;
//        for(Organization o:business.getDepartmentDirectory().getDepartmentList()){
//        if(o.getType().equals(Organization.OrganizationType.AmazonAccountingDept)){
//        this.accO=o;
//        }
//        }
          popData();
    }
  private void popData(){
        DefaultTableModel model = (DefaultTableModel)customerTransactionJTable.getModel();
        model.setNumRows(0);
   for(Transcation t: accO.getTranscationList().getTranscationList()){
//               if(t.getReceiver().equals(ua.getRole())){
                 Object[] row = new Object[7];
            row[0] = t;
//            row[1]= t.getO();
               if(t.getO()!=null){
                     row[1] = t.getO();
                }else {
                    row[1] = t.getMessage();
                }
            row[2] = t.getMoneyAmount();
            row[3] = t.getIniCreater();
            if(t.getReceiver()!=null){
            row[4] = t.getReceiver();
            }else if(t.getAmazonReceiver()!=null){
            row[4]=t.getAmazonReceiver();
            }else {
            row[4]=t.getpReceiver();
            }
            row[5] = t.getIniDate();
            row[6] = t.getCompleteDate();
          
            model.addRow(row);
//               }
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

        jLabel1 = new javax.swing.JLabel();
        backjButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTransactionJTable = new javax.swing.JTable();
        processJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("View Transaction History");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });
        add(backjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 100, -1));

        customerTransactionJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transaction ID", "Reason", "Amount", "Sender", "Receiver", "InitialDate", "CompleteDate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customerTransactionJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 610, 120));

        processJButton.setText("Transfer");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout)container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backjButton1ActionPerformed
private void accept(){
 int selectedRow = customerTransactionJTable.getSelectedRow();
        if(selectedRow < 0){
            return;
        }

        Transcation t = (Transcation)customerTransactionJTable.getValueAt(selectedRow, 0);
        Date curDate = new Date(System.currentTimeMillis());
        t.setCompleteDate(curDate);
}
    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = customerTransactionJTable.getSelectedRow();
        if(selectedRow < 0){
            return;
        }

        Transcation t = (Transcation)customerTransactionJTable.getValueAt(selectedRow, 0);
        if(t.getO()==null){
            JOptionPane.showMessageDialog(null, "Invalid action!");
        return;
        }
      TransferJPanel TransferJPanel = new TransferJPanel(container, business,  ua,t);
        container.add("TransferJPanel", TransferJPanel);

        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_processJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JTable customerTransactionJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    // End of variables declaration//GEN-END:variables
}