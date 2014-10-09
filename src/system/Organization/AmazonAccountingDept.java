/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Organization;

import java.util.ArrayList;
import system.Role.AmazonAccountingDeptRole;
import system.Role.CustomerDeptRole;
import system.Role.Role;

/**
 *
 * @author Administrator
 */
public class AmazonAccountingDept extends Organization {
  public AmazonAccountingDept(){
        super(Organization.OrganizationType.AmazonAccountingDept.getValue());
    }

    
    @Override
    public ArrayList<Role> getSupportedRoles() {
      ArrayList<Role> roleList = new ArrayList<>();
      roleList.add(new AmazonAccountingDeptRole());
      return roleList;
    }
    
    
}
