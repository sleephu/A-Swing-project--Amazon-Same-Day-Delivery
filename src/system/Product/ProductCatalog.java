/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Product;

import java.util.ArrayList;
import system.NetWork.NetWork;
import system.Order.MasterOrderList;
import system.Order.Order;
import system.Order.OrderItem;

/**
 *
 * @author Administrator
 */
public class ProductCatalog {

    private ArrayList<Product> productList;

    public ProductCatalog() {
        productList = new ArrayList<>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public Product newProduct() {
        Product prod = new Product();
        productList.add(prod);
        return prod;
    }

    public void removeProduct(Product p) {
        productList.remove(p);
    }

    public Product findByID(int id) {

        for (Product p : productList) {
            if (p.getProductId() == id) {
                return p;
            }
        }
        return null;
    }

    public boolean checkProductId(int id) {
        ArrayList<Integer> existedProductIdList = new ArrayList<>();
        for (Product p : productList) {
            existedProductIdList.add(p.getProductId());
        }
//            if(!existedUserAccountUserNameList.contains(ua.getUserName())){
//      return true;

//        }
        return existedProductIdList.contains(id);

    }

    public Product getBestSellingProduct() {
        double minRate = 1;
        double tempRate;
        Product bestSellingProduct = null;
        for (Product p : this.getProductList()) {
            tempRate = p.getLeftRate();
            if (tempRate < minRate) {
                minRate = tempRate;
                bestSellingProduct = p;
            }
        }
        return bestSellingProduct;
    }


}
