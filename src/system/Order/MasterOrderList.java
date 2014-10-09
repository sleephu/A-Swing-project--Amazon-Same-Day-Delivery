/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Order;

import java.util.ArrayList;
import system.Enterprise.Enterprise;
import system.NetWork.NetWork;
import system.Organization.Organization;
import system.Product.Product;

/**
 *
 * @author Administrator
 */
public class MasterOrderList {
     private ArrayList<Order> orders = new ArrayList<>();
 
    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
    public void add(Order order){
    orders.add(order);
    }
 public double getTotalAmount(){
     int sum = 0;
     for(Order o:orders ){
      sum+= o.getEachOrderPrice();
     }
     return sum;
    }
  public double getTotalAmount(NetWork n){
     double sumE = 0;
     for(Order o:orders ){
    for(OrderItem oi: o.getOis()){
    for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
         if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.LocalRetalier)){
         for(Organization or: e.getDepartmentDirectory().getDepartmentList()){
         if(or.getType().equals(Organization.OrganizationType.ProductManageDept)){
         for(Product p: or.getProductCatalog().getProductList()){
    if(oi.getProduct().equals(p)){
    sumE+= oi.getQuantity();
    }     
         }
         }
         }
         }
         }
    }
         
//      sum+= o.getEachOrderPrice();
     }
     return sumE;
    }
  public double getPTotalAmount(NetWork n){
     double sumE = 0;
     for(Order o:orders ){
    for(OrderItem oi: o.getOis()){
    for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
         if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.LocalRetalier)){
         for(Organization or: e.getDepartmentDirectory().getDepartmentList()){
         if(or.getType().equals(Organization.OrganizationType.ProductManageDept)){
         for(Product p: or.getProductCatalog().getProductList()){
    if(oi.getProduct().equals(p)){
    sumE+= oi.getQuantity();
    }     
         }
         }
         }
         }
         }
    }
         
//      sum+= o.getEachOrderPrice();
     }
     return sumE;
    }
}
