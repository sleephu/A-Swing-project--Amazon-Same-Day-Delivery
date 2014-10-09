/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Inventory;

import java.util.ArrayList;
import system.Product.Product;

/**
 *
 * @author Administrator
 */
public class LeftProductCatalog {
    private ArrayList<LeftProduct> inventory;

    public LeftProductCatalog() {
    inventory = new ArrayList<>();
    }

    public ArrayList<LeftProduct> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<LeftProduct> inventory) {
        this.inventory = inventory;
    }
      public LeftProduct newLeftProduct(){
        LeftProduct leftProduct = new LeftProduct();
        inventory.add(leftProduct);
          return leftProduct;
    }
    
}
