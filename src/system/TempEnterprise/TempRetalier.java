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
 * @author Administratord
 */
public class TempRetalier extends Enterprise {

    public TempRetalier(String name) {
        super(name,Enterprise.EnterpriseType.TempRetailerEnterprise);
    }
     @Override
    public ArrayList<Role> getSupportedRoles() {
         ArrayList<Role> roleList = new ArrayList<>();
      roleList.add(new TempRole());
      return roleList;
    }
}
