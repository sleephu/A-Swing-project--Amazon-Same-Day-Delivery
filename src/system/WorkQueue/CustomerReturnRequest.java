/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.WorkQueue;


public class CustomerReturnRequest extends WorkRequest{
    private String CustomerReturnRrsult;

    //    private Date returnDate;
    //    private OrderItem returnedP;
    //    public OrderItem getReturnedP() {
    //        return returnedP;
    //    }
    //
    //    }
    //        this.returnedP = returnedP;
    //    }
    public CustomerReturnRequest() {
   super();
    }
    

    public String getCustomerReturnRrsult() {
        return CustomerReturnRrsult;
    }

    public void setCustomerReturnRrsult(String CustomerReturnRrsult) {
        this.CustomerReturnRrsult = CustomerReturnRrsult;
    }

//    public Date getReturnDate() {
//        return returnDate;
//    }
//
//    public void setReturnDate(Date returnDate) {
//        this.returnDate = returnDate;
//    }
    
}
