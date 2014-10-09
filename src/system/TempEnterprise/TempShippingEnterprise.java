/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.TempEnterprise;

import java.util.ArrayList;
import system.Enterprise.Enterprise;
import system.Role.Role;
import system.Role.TempRole;

/**
 *
 * @author Administrator
 */
public class TempShippingEnterprise extends Enterprise {

    public TempShippingEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.TempShippingEnterprise);
    }
     @Override
    public ArrayList<Role> getSupportedRoles() {
         ArrayList<Role> roleList = new ArrayList<>();
      roleList.add(new TempRole());
      return roleList;
    }
}
