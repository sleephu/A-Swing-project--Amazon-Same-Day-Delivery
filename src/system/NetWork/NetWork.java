/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.NetWork;

import system.Enterprise.EnterpriseDirectory;
import system.Location.Location;
import system.Location.LocationDirectory;

/**
 *
 * @author Administrator
 */
public class NetWork {
    private String name;
    private Location location;
    private LocationDirectory locationDirectory;
   private EnterpriseDirectory enterpriseDirectory;

//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public NetWork(String name) {
        this.name = name;
  locationDirectory = new LocationDirectory();
  enterpriseDirectory = new EnterpriseDirectory();
    }

    public LocationDirectory getLocationDirectory() {
        return locationDirectory;
    }

    public void setLocationDirectory(LocationDirectory locationDirectory) {
        this.locationDirectory = locationDirectory;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
