/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Location;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class LocationDirectory {
    private ArrayList<Location> locationList;

    public LocationDirectory() {
    locationList = new ArrayList<>();
    }

    public ArrayList<Location> getLocationList() {
        return locationList;
    }

    public void setLocationList(ArrayList<Location> locationList) {
        this.locationList = locationList;
    }
    public Location creLocation(){
    Location location = new Location();
    locationList.add(location);
    return location;
    
    }
    public boolean checkLocationName(String name){
     ArrayList<String> existedLocationNameList = new ArrayList<>();
        for(Location l: locationList){
            existedLocationNameList.add(l.getName());
        }
//            if(!existedUserAccountUserNameList.contains(ua.getUserName())){
//      return true;
     
//        }
  return existedLocationNameList.contains(name);
  }
    
}
