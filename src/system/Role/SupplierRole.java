/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Role;

import javax.swing.JPanel;
import system.Organization.Organization;
import business.Business;
import system.Enterprise.Enterprise;
import system.UserAccount.UserAccount;
import userInterface.SupplierRole.SupplierWorkAreaJPanel;

/**
 *
 * @author Administrator
 */
public class SupplierRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel container, UserAccount userAccount, Organization inOrganization, Enterprise inEnterprise, Business business) {
      return new SupplierWorkAreaJPanel(container, business,userAccount, inEnterprise); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
