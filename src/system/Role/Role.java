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

/**
 *
 * @author Administrator
 */
public abstract class Role {
      public abstract JPanel createWorkArea(JPanel container,UserAccount userAccount,Organization inOrganization,Enterprise inEnterprise,Business business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
