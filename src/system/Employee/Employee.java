/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Employee;

import system.Person.Person;

/**
 *
 * @author Administrator
 */
public class Employee extends Person {
     
    private String empId; 
    private String empName;
    private double wage;
    private double commission;
 
  
    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

 

//     public enum Type{
//     Manager("deptManagerType"), SalesPerson("salesPerson"), DeliverEmployee("deliverEmployee"); 
//     private String value;
//
//        private Type(String value) {
//      this.value = value;
//        
//        }
//
//        public String getValue() {
//            return value;
//        }
//
//        public void setValue(String value) {
//            this.value = value;
//        }
//      
//        
     
//    }
//    public Person getPerson() {
//        return person;
//    }
//
//    public void setPerson(Person person) {
//        this.person = person;
//    }

public String getEmpName(){
return empName;
}
    public String getEmpName(Person p) {
        return p.getFirstName()+""+p.getLastName();
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }


    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }


   
    public double getCommission() {
        
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

//     public int getTotalQuantity(MasterOrderList mol){
//     int sum =0;
//     for(Order o: mol.getOrders()){
//     if(o.getSalesPerson().getPerson().getName().equals(this.getPerson().getName())&&o.getOrderStatus().equals(Order.APPROVE)){
//      sum+= o.getTotalQuantity();
//     }
//     }
//     return sum;
//     }   
//public int getTotalCommission(MasterOrderList mol){
//           int sum=0;
//           for(Order o: mol.getOrders()){
//           if(o.getSalesPerson().getPerson().getName().equals(this.getPerson().getName())&&o.getOrderStatus().equals(Order.APPROVE))
//           {  sum+= o.getEachOrderCommission();
//           }
//}
//           return sum;
//}
// public int getTotalCommission(Order o,MasterOrderList mol){
//       int sum =0;
//       int eachOrderItemC;
//       for(OrderItem oi: o.getOis()){
//        if(o.getSalesPerson().getPerson().getName().equals(this.getPerson().getName())&&o.getOrderStatus().equals(Order.APPROVE)){
//              /*eachOrderC*/ eachOrderItemC=oi.getQuantity()*oi.getActualPrice()-oi.getQuantity()*oi.getProduct().getTargetPrice();// each employee's total orderItems' commission
//            for(Order order:mol.getOrders()){
////            if(order.getOrderNum()==o.getOrderNum()){
//                sum += /*o.getTotalQuantity()*/eachOrderItemC; // each order's totalQuantity* each employee's each orderItem's commission
////            }
//            }  
//        }
//       
//       }
//       return sum;
//}

    
    @Override
    public String toString() {
        return empName;
    }
}
