/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Organization;

import java.util.ArrayList;

import system.Role.Role;
import system.Role.ShippingDeptRole;

/**
 *
 * @author Administrator
 */
public class ShippingDept extends Organization {

    public ShippingDept() {
        super(Organization.OrganizationType.ShippingDept.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new ShippingDeptRole());
        return roleList;
    }
}
