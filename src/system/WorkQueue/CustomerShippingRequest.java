/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.WorkQueue;

import system.Employee.Employee;
import system.Order.Order;

/**
 *
 * @author Administrator
 */
public class CustomerShippingRequest extends WorkRequest {

    private String shippingRequestResult;
    private Employee deliverEmployee;
    private Order o;

    public Order getO() {
        return o;
    }

    public void setO(Order o) {
        this.o = o;
    }
    

    public CustomerShippingRequest() {
        super();
    }

    public Employee getDeliverEmployee() {
        return deliverEmployee;
    }

    public void setDeliverEmployee(Employee deliverEmployee) {
        this.deliverEmployee = deliverEmployee;
    }

    public String getShippingRequestResult() {
        return shippingRequestResult;
    }

    public void setShippingRequestResult(String shippingRequestResult) {
        this.shippingRequestResult = shippingRequestResult;
    }
}
