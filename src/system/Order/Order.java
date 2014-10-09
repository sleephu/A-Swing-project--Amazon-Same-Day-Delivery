/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Order;

import java.util.ArrayList;
import java.util.Date;
import system.UserAccount.UserAccount;

/**
 *
 * @author Administrator
 */
public class Order {
     
    public static final String PENDING = "pending";
    public static final String Cancel = "Cancel";
    public static final String Confirm = "Confirm";
    private static int count = 1;
    private ArrayList<OrderItem> ois = new ArrayList<>();
    private int orderNum;
    private String orderStatus;
//    private Customer customer;
//    private Employee salesPerson;
//    private Employee deliverEmployee;
    private Date orderDate;
    private UserAccount customer;
    

    public UserAccount getCustomer() {
        return customer;
    }

    public void setCustomer(UserAccount customer) {
        this.customer = customer;
    }

   

//    public Employee getDeliverEmployee() {
//        return deliverEmployee;
//    }
//
//    public void setDeliverEmployee(Employee deliverEmployee) {
//        this.deliverEmployee = deliverEmployee;
//    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

//    public Date getPackagingDate() {
//        return packagingDate;
//    }
//
//    public void setPackagingDate(Date packagingDate) {
//        this.packagingDate = packagingDate;
//    }
//
//    public Date getShippingDate() {
//        return shippingDate;
//    }
//
//    public void setShippingDate(Date shippingDate) {
//        this.shippingDate = shippingDate;
//    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Order.count = count;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }

 
    public Order() {
        orderNum = count;
        count++;
    }

    public ArrayList<OrderItem> getOis() {
        return ois;
    }

    public void setOis(ArrayList<OrderItem> ois) {
        this.ois = ois;
    }

    public OrderItem createOrderItem() {
        OrderItem oi = new OrderItem();
        ois.add(oi);
        return oi;
    }
    public void removeOrderItem(OrderItem oi){
           ois.remove(oi);
    }

    public int getTotalQuantity() {
        int sum = 0;
        for (OrderItem oi : ois) {
            sum += oi.getQuantity();
        }
        return sum;
    }

    public double getEachOrderCommission() {
        int sum = 0;
        for (OrderItem oi : ois) {
            sum += (oi.getProduct().getActualPrice() - oi.getProduct().getTargetPrice()) * oi.getQuantity();
        }
        return sum;
    }
    public double getEachOrderPrice(){
     double sum = 0;
     for(OrderItem oi: ois){
      sum+= oi.getProduct().getActualPrice()*oi.getQuantity()+this.getEachOrderTax();
     }
     return sum;
    }
    public double getEachOrderTax(){
    double sum=0;
    for(OrderItem oi: ois){
      sum+=oi.getProduct().getTax();
    }
    return sum;
    }
 

    @Override
    public String toString() {
        return String.valueOf(orderNum);
    }
}
