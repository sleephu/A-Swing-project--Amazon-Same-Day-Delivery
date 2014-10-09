/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Invoice;

import java.util.Date;
import system.Order.Order;

/**
 *
 * @author Administrator
 */
public class Invoice {
     private int id;
    private Order order;
    private Date date;
      public static final String Paid = "paid";
    public static final String PartialPaid = "partialPaid";
    public static final String PENDING = "pending";
    private String invoiceStatus;
   private static int count = 1;
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
        Invoice.count = count;
    }
    public Invoice(){
     id = count;
     count++;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }

   
}
