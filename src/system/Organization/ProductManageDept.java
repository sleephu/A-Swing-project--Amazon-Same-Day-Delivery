/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Organization;

import java.util.ArrayList;
import system.Role.ProductManageDeptRole;
import system.Role.Role;

/**
 *
 * @author Administrator
 */
public class ProductManageDept extends Organization {

    public ProductManageDept() {
        super(Organization.OrganizationType.ProductManageDept.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
         ArrayList<Role> roleList = new ArrayList<>();
      roleList.add(new ProductManageDeptRole());
      return roleList;
    
    
    }
    
}
