/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Transcation;

import java.util.Date;
import system.Enterprise.Enterprise;
import system.Order.Order;
import system.Payment.Payment;
import system.Person.Person;
import system.UserAccount.UserAccount;

/**
 *
 * @author Administrator
 */
public class Transcation {
    private double moneyAmount;
    private Date iniDate;
    private Date completeDate;
    private Payment payment;
    private UserAccount iniCreater;
    private Enterprise receiver;
    private Order o;
    private int id;
    private static int count;
   private String message;
   private UserAccount pReceiver;
   private String amazonReceiver;

    public String getAmazonReceiver() {
        return amazonReceiver;
    }

    public void setAmazonReceiver(String amazonReceiver) {
        this.amazonReceiver = amazonReceiver;
    }

    //
    //    public Person getpReceiver() {
    //        return pReceiver;
    //    }
    //
    //    public void setpReceiver(Person pReceiver) {
    //    }
    //    }
    public UserAccount getpReceiver() {
        return pReceiver;
    }

    public void setpReceiver(UserAccount pReceiver) {
        this.pReceiver = pReceiver;
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
        Transcation.count = count;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public Order getO() {
        return o;
    }

    public void setO(Order o) {
        this.o = o;
    }

    public UserAccount getIniCreater() {
        return iniCreater;
    }

    public void setIniCreater(UserAccount iniCreater) {
        this.iniCreater = iniCreater;
    }

    //    public Role getReceiver() {
    //        return receiver;
    //    }
    //
    //    public void setReceiver(Role receiver) {
    //        this.receiver = receiver;
    //    }
    public Enterprise getReceiver() {
        return receiver;
    }

    public void setReceiver(Enterprise receiver) {
        this.receiver = receiver;
    }

    
    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public Transcation() {
     id=count;
     ++count;
    }

  
    
  
    public Date getIniDate() {
        return iniDate;
    }

    public void setIniDate(Date iniDate) {
        this.iniDate = iniDate;
    }

    public Date getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return String.valueOf(id); //To change body of generated methods, choose Tools | Templates.
    }
    
}
