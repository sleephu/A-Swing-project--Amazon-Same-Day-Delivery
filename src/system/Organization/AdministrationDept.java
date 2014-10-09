/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Organization;

import java.util.ArrayList;
import system.Role.HRManagerRole;
import system.Role.Role;

/**
 *
 * @author Administrator
 */
public class AdministrationDept extends Organization {

    public AdministrationDept() {
        super(Organization.OrganizationType.AdministrationDept.getValue());
    }
 
    @Override
    public ArrayList<Role> getSupportedRoles() {
   
      ArrayList<Role> roleList = new ArrayList<>();
      roleList.add(new HRManagerRole());
      return roleList;
    
    
    }
    
}
