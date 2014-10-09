/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Organization;

import java.util.ArrayList;
import system.Role.AmazonShippingDeptRole;
import system.Role.Role;

/**
 *
 * @author Administrator
 */
public class AmazonShippingDept extends Organization{
     public AmazonShippingDept() {
        super(Organization.OrganizationType.AmazonShippingDept.getValue());
    }
 
     @Override
    public ArrayList<Role> getSupportedRoles() {
      ArrayList<Role> roleList = new ArrayList<>();
      roleList.add(new AmazonShippingDeptRole());
      return roleList;
    }
}
