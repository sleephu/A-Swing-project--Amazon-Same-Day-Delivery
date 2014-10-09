/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Payment;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class PaymentList {
    private ArrayList<Payment> paymentList= new ArrayList<>();

    public ArrayList<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(ArrayList<Payment> paymentList) {
        this.paymentList = paymentList;
    }
    public Payment crePayment(){
     Payment payment = new Payment();
     paymentList.add(payment);
     return payment;
     
    }
}
