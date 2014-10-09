/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Employee;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class EmployeeDirectory {
      private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        this.employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    public Employee creEmployee(){
       
     Employee e = new Employee();
     employeeList.add(e);
     
     return e;
       
    }
    public void removeEmployee(Employee e){
     employeeList.remove(e);
    }
}
