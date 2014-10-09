/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Location;

import java.util.ArrayList;
import system.NetWork.NetWork;

/**
 *
 * @author Administrator
 */
public class Location {
    private String country;
    private String state;
    private String city;
    private String street;
    private String name;
    private ArrayList<SubLocation> sblocations;
    public SubLocation creSubLocation(){
     SubLocation sl = new SubLocation();
     sblocations.add(sl);
     return sl;
    }

    public ArrayList<SubLocation> getSblocation() {
        return sblocations;
    }

    public void setSblocation(ArrayList<SubLocation> sblocation) {
        this.sblocations = sblocation;
    }
   
  public boolean checkSubLocationName(String name){
     ArrayList<String> existedSubLocationNameList = new ArrayList<>();
        for(SubLocation sbl: sblocations){
            existedSubLocationNameList.add(sbl.getName());
        }
//            if(!existedUserAccountUserNameList.contains(ua.getUserName())){
//      return true;
     
//        }
  return existedSubLocationNameList.contains(name);
  }
    public Location() {
    sblocations = new ArrayList<>();
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
   

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return name;
    }

    
    
}
