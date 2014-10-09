/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Shipping;

import java.util.Date;
import system.Employee.Employee;
import system.Order.OrderItem;
import system.Payment.Payment;
import system.WorkQueue.ShippingRequest;

/**
 *
 * @author Administrator
 */
public class Shipping {
    private int id;
    private static int count;
    private OrderItem oi;
    private Payment payment;
    private double shippingFee;
    private String shippingMethod;
     private Date deliveredDate;
    private Date shippingDate;
    private String status;
    public static final String Packaging ="Packaging";
     public static final String Shipping = "Shipping";
    public static final String Delivered = "Delivered";
    private Employee deliveredEmployee;
    private ShippingRequest shippingRequest;
private Date packageDate;

    public Date getPackageDate() {
        return packageDate;
    }

    public void setPackageDate(Date packageDate) {
        this.packageDate = packageDate;
    }

    public ShippingRequest getShippingRequest() {
        return shippingRequest;
    }

    public void setShippingRequest(ShippingRequest shippingRequest) {
        this.shippingRequest = shippingRequest;
    }
    

    public Shipping() {
    id=count;
    ++count;
    }

    
    public Employee getDeliveredEmployee() {
        return deliveredEmployee;
    }

    public void setDeliveredEmployee(Employee deliveredEmployee) {
        this.deliveredEmployee = deliveredEmployee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

//    public static void setCount(int count) {
//        Shipping.count = count;
//    }
    

    public double getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(double shippingFee) {
        this.shippingFee = shippingFee;
    }

//    public Order getOrder() {
//        return order;
//    }
//
//    public void setOrder(Order order) {
//        this.order = order;
//    }

    public OrderItem getOi() {
        return oi;
    }

    public void setOi(OrderItem oi) {
        this.oi = oi;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public Date getDeliveredDate() {
        return deliveredDate;
    }

    public void setDeliveredDate(Date deliveredDate) {
        this.deliveredDate = deliveredDate;
    }

   

    public Date getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Date shippingDate) {
        this.shippingDate = shippingDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.valueOf(id); //To change body of generated methods, choose Tools | Templates.
    }
    
 
}
