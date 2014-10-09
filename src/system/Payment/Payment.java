/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Payment;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import system.Invoice.Invoice;

/**
 *
 * @author Administrator
 */
public class Payment {
    private int id;
     private Invoice invoice;
    private Date date;
   private static int count = 0;
   private double paidPrice;
   private String paymentMethod;

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getPaidPrice() {
        return paidPrice;
    }

    public void setPaidPrice(double paidPrice) {
        this.paidPrice = paidPrice;
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

    public static void setCount(int count) {
        Payment.count = count;
    }
    public Payment(){
     id= count;
     count++;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
 
 

 
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return  String.valueOf(id);
    }

   
    
}
