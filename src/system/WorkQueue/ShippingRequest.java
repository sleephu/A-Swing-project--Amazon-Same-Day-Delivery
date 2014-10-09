/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.WorkQueue;

/**
 *
 * @author Administrator
 */
public class ShippingRequest extends WorkRequest {
    private CustomerShippingRequest customerShippingRequest;

    public ShippingRequest() {
   super();
    }
   
    public CustomerShippingRequest getCustomerShippingRequest() {
        return customerShippingRequest;
    }

    public void setCustomerShippingRequest(CustomerShippingRequest customerShippingRequest) {
        this.customerShippingRequest = customerShippingRequest;
    }
    
}
