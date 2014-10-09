/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Product;

import system.Inventory.LeftProduct;


public class Product {

    private int productId;
    private String name;
    private double targetPrice; 
    private int quantity;
    private LeftProduct leftProduct;
    private double actualPrice;
   private double tax;

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
   
    public double getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(double actualPrice) {
        this.actualPrice = actualPrice;
    }
    
   
    public double getLeftRate(){
        return leftProduct.getLeftQuantity()/this.getQuantity();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
  

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(double targetPrice) {
        this.targetPrice = targetPrice;
    }

    public LeftProduct getLeftProduct() {
        return leftProduct;
    }

    public void setLeftProduct(LeftProduct leftProduct) {
        this.leftProduct = leftProduct;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    
    

}
