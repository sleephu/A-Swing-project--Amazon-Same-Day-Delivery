/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Inventory;

import system.Order.OrderItem;
import system.Product.Product;

/**
 *
 * @author Administrator
 */
public class LeftProduct  {
    private Product product;
      private int leftQuantity;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getLeftQuantity() {
        return leftQuantity;
    }

    public void setLeftQuantity(int leftQuantity) {
        this.leftQuantity = leftQuantity;
    }
         public int updateLeftQuantity(OrderItem oi){
        leftQuantity =leftQuantity - oi.getQuantity();
        return leftQuantity;
    }
    
   
    
    
}
