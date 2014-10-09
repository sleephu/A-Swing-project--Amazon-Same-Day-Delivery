/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Role;

import business.Business;
import javax.swing.JPanel;
import system.Enterprise.Enterprise;
import system.Organization.Organization;
import system.UserAccount.UserAccount;
import userInterface.AmazonRole.AccountingDeptRole.AccountDeptWorkAreaJPanel;

/**
 *
 * @author Administrator
 */
public class AmazonAccountingDeptRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel container, UserAccount userAccount, Organization inOrganization, Enterprise inEnterprise, Business business) {
       return new AccountDeptWorkAreaJPanel(container, business, userAccount, inOrganization); //To change body of generated methods, choose Tools | Templates.
    } 
    
}
