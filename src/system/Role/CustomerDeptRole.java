/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Role;

import system.Organization.Organization;
import business.Business;
import javax.swing.JPanel;
import system.Enterprise.Enterprise;
import system.UserAccount.UserAccount;
import userInterface.AmazonRole.CustomerDeptRole.CustomerManageDeptWorkAreaJPanel;
/**
 *
 * @author Administrator
 */
public class CustomerDeptRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel container, UserAccount userAccount, Organization inOrganization, Enterprise inEnterprise, Business business) {
              return new CustomerManageDeptWorkAreaJPanel(container,userAccount,business,inEnterprise,inOrganization);
    }

  
    
}
