/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Organization;

import java.util.ArrayList;
import system.Role.CustomerDeptRole;
import system.Role.Role;
import system.Role.AmazonSalesDeptRole;

/**
 *
 * @author Administrator
 */
public class CustomerDept extends Organization {

    public CustomerDept() {
        super(Organization.OrganizationType.CustomerDept.getValue());
    }
 
     @Override
    public ArrayList<Role> getSupportedRoles() {
      ArrayList<Role> roleList = new ArrayList<>();
      roleList.add(new CustomerDeptRole());
      return roleList;
    }
    
    
}
