/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Enterprise;

import java.util.ArrayList;
import system.Location.Location;
import system.Organization.DepartmentDirectory;
import system.Organization.Organization;
import system.Role.Role;

/**
 *
 * @author Administrator
 */
public abstract class Enterprise extends Organization {
//      private int enterpriseId;
    private String enterpriseName;
    private DepartmentDirectory  departmentDirectory;
    private EnterpriseType enterpriseType;
    private Location location;

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
//    private static int count = 1;

//    public int getEnterpriseId() {
//        return enterpriseId;
//    }
//
//    public void setEnterpriseId(int enterpriseId) {
//        this.enterpriseId = enterpriseId;
//    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public Enterprise(String name, EnterpriseType type) {
        super(name);
//        enterpriseId = count;
//        count++;
     departmentDirectory = new DepartmentDirectory();
     this.enterpriseType = type;

    }
 public enum EnterpriseType{
 LocalRetalier("LocalRetalier"),TempRetailerEnterprise("TempRetalierEnterprise"),TempEnterprise("TempEnterprise"),TempShippingEnterprise("TempShippingEnterprise"),Amazon("Amazon"),ShippingEnterprise("ShippingEnterprise");
  private String value; 

        private EnterpriseType(String value) {
this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
        
  
 }


    public DepartmentDirectory getDepartmentDirectory() {
        return departmentDirectory;
    }

    public void setDepartmentDirectory(DepartmentDirectory departmentDirectory) {
        this.departmentDirectory = departmentDirectory;
    }

   
//
//    public static int getCount() {
//        return count;
//    }
//
//    public static void setCount(int count) {
//        Enterprise.count = count;
//    }
    
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }
    

    @Override
    public String toString() {
        return enterpriseName;
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
//          ArrayList<Role> roleList = new ArrayList<>();
//      roleList.add(new GeneralManagerRole());
//      return roleList;
        return null;
    }
}
