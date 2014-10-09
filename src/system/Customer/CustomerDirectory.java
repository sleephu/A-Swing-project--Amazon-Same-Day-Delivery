/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Customer;

import java.util.ArrayList;
import system.Person.Person;

/**
 *
 * @author Administrator
 */
public class CustomerDirectory {
    private ArrayList<Customer>customerList;

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public CustomerDirectory() {
    customerList = new ArrayList<>();
    }
public Customer creCustomer(Person p){
 Customer c = new Customer();
 customerList.add(c);
 c.setAge(p.getAge());
 c.setDob(p.getDob());
 c.setFirstName(p.getFirstName());
 c.setLastName(p.getLastName());
 c.setGender(p.getGender());
 c.setLocation(p.getLocation());
 c.setSsn(p.getSsn());
 c.setTelephoneNo(p.getTelephoneNo());
 return c;

}
  
    
}
