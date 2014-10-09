/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Organization;

import java.util.ArrayList;
import system.Role.AmazonSalesDeptRole;
import system.Role.Role;

/**
 *
 * @author Administrator
 */
public class AmazonSalesDept extends Organization {

    public AmazonSalesDept() {
        super(Organization.OrganizationType.AmazonSalesDept.getValue());
    }

    @Override
     public ArrayList<Role> getSupportedRoles() {
      ArrayList<Role> roleList = new ArrayList<>();
      roleList.add(new AmazonSalesDeptRole());
      return roleList;
}
}
