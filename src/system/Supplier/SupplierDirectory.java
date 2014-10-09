/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Supplier;

import java.util.ArrayList;
import system.Product.Product;

/**
 *
 * @author Administrator
 */
public class SupplierDirectory {
     private ArrayList<Supplier> supplierList;
   
    public SupplierDirectory(){
        supplierList = new ArrayList<>();
    }

    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(ArrayList<Supplier> supplierList) {
        this.supplierList = supplierList;
    }
    
    public Supplier newSupplier(String name){
//       if(supplierType.equals(SupplierType.FormalSupplier)){
        Supplier s = new Supplier(name);
        supplierList.add(s);
        return s;
//       } else if(supplierType.equals(SupplierType.TempSupplier)){
       
//       Supplier s = new TempSupplier();
//        supplierList.add(s);
//        return s;
//       }
       
//       return null;
    }
    public void removeSupplier(Supplier s){
        supplierList.remove(s);
    }

    public Product getBestSellingProductOfAll(){
        Product bestSellingProduct = null;
        double minRate = 1;
        Product tempProduct;
        for(Supplier s: this.getSupplierList()){
            tempProduct = s.getProductCatalog().getBestSellingProduct();
            if(tempProduct.getLeftRate()<minRate){
                bestSellingProduct = tempProduct;
                minRate = bestSellingProduct.getLeftRate();
            } 
        }
        return bestSellingProduct;
    }
}
