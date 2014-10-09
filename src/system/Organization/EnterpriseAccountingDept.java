/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Organization;

import java.util.ArrayList;
import system.Role.EnterpriseAccountingDeptRole;
import system.Role.Role;

/**
 *
 * @author Administrator
 */
public class EnterpriseAccountingDept extends Organization {

    public EnterpriseAccountingDept() {
        super(Organization.OrganizationType.EnterpriseAccountingDept.getValue());
    }
      @Override
    public ArrayList<Role> getSupportedRoles() {
      ArrayList<Role> roleList = new ArrayList<>();
      roleList.add(new EnterpriseAccountingDeptRole());
      return roleList;
    }
    
}
