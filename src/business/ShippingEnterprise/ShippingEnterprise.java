/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.ShippingEnterprise;

import java.util.ArrayList;
import system.Enterprise.Enterprise;
import system.Role.Role;
import system.Role.ShippingEnterpriseRole;

/**
 *
 * @author Administrator
 */
public class ShippingEnterprise extends Enterprise {

    public ShippingEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.ShippingEnterprise);
    }
     @Override
    public ArrayList<Role> getSupportedRoles() {
         ArrayList<Role> roleList = new ArrayList<>();
      roleList.add(new ShippingEnterpriseRole());
      return roleList;
//        return null;
    }

    
}
