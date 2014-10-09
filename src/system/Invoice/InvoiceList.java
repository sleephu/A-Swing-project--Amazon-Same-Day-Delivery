/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Invoice;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class InvoiceList {
     private ArrayList<Invoice> invoiceList;
    public InvoiceList(){
    invoiceList = new ArrayList<>();
    }

    public ArrayList<Invoice> getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(ArrayList<Invoice> invoiceList) {
        this.invoiceList = invoiceList;
    }
    public Invoice creInvoice(){
           Invoice invoice = new Invoice();
           invoiceList.add(invoice);
           return invoice;
    }
    public void deleteInvoice(Invoice i){
                          invoiceList.remove(i);
    }
}
