/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Order;

import system.Product.Product;

/**
 *
 * @author Administrator
 */
public class OrderItem {
    private Product Product;
    private int quantity;
//     private int actualPrice;

//    public int getActualPrice() {
//        return actualPrice;
//    }
//
//    public void setActualPrice(int actualPrice) {
//        this.actualPrice = actualPrice;
//    }

    public Product getProduct() {
        return Product;
    }

    public void setProduct(Product Product) {
        this.Product = Product;
    }

  
    
   
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
  
 
   
     
    @Override
    public String toString() {
        return Product.getName().toString();
    }
}
