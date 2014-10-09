/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Organization;

import java.util.ArrayList;
import system.Role.Role;
import system.Role.SupplierSalesDeptRole;

/**
 *
 * @author Administrator
 */
public class SupplierSalesDept extends Organization {

   public SupplierSalesDept() {
        super(Organization.OrganizationType.SupplierSalesDept.getValue());
    }

    @Override
     public ArrayList<Role> getSupportedRoles() {
      ArrayList<Role> roleList = new ArrayList<>();
      roleList.add(new SupplierSalesDeptRole());
      return roleList;
}
    
}
