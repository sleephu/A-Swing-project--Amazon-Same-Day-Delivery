/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Shipping;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class ShippingList {
    private ArrayList<Shipping>shippingList;

    public ShippingList() {
    shippingList= new ArrayList<>();
    }

    
    public ArrayList<Shipping> getShippingList() {
        return shippingList;
    }

    public void setShippingList(ArrayList<Shipping> shippingList) {
        this.shippingList = shippingList;
    }
    public Shipping creShipping(){
  Shipping s= new Shipping();
  shippingList.add(s);
        return s;
    }
    
}
