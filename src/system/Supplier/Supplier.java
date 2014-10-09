/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Supplier;

import java.util.ArrayList;
import system.Enterprise.Enterprise;
import system.Inventory.LeftProductCatalog;
import system.Product.ProductCatalog;
import system.Role.Role;
import system.Role.SupplierRole;

/**
 *
 * @author Administrator
 */
public class Supplier extends Enterprise {
//    private String name;
//    private ProductCatalog productCatalog;
//    private LeftProductCatalog leftProductCatalog;
//    private Location location;

//    public LeftProductCatalog getLeftProductCatalog() {
//        return leftProductCatalog;
//    }
//
//    public void setLeftProductCatalog(LeftProductCatalog leftProductCatalog) {
//        this.leftProductCatalog = leftProductCatalog;
//    }
// public abstract ArrayList<Role> getSupportedRoles();

 

   
//    public enum SupplierType{
//     
//     FormalSupplier("FormalSupplierType"), TempSupplier("TempSupplierType");
//     private String value;
//
//        private SupplierType(String value) {
//      this.value = value;
//        
//        }
//
//        public String getValue() {
//            return value;
//        }
//
//        public void setValue(String value) {
//            this.value = value;
//        }
//    }
//    public Location getLocation() {
//        return location;
//    }
//
//    public void setLocation(Location location) {
//        this.location = location;
//    }

    
    
    public Supplier(String name){
        super(name,EnterpriseType.LocalRetalier);
//        productCatalog = new ProductCatalog();
    }

   
//    public ProductCatalog getProductCatalog() {
//        return productCatalog;
//    }
//
//    public void setProductCatalog(ProductCatalog productCatalog) {
//        this.productCatalog = productCatalog;
//    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
         ArrayList<Role> roleList = new ArrayList<>();
      roleList.add(new SupplierRole());
      return roleList;
    }
    
}
