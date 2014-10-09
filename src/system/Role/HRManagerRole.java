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
import userInterface.AmazonRole.HRManagerRole.HRManagerWorkAreaJPanel;

/**
 *
 * @author Administrator
 */
public class HRManagerRole extends Role{


    @Override
    public JPanel createWorkArea(JPanel container, UserAccount userAccount, Organization inOrganization, Enterprise inEnterprise, Business business) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         return new HRManagerWorkAreaJPanel(container,userAccount,business);
    }
    
}
