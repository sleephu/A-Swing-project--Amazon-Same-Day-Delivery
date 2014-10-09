/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.UserAccount;

import java.awt.image.BufferedImage;
import system.Enterprise.Enterprise;
import system.Organization.Organization.OrganizationType;
import system.Person.Person;
import system.Role.Role;
import system.finacialAccount.FinacialAccountDirectory;

public class UserAccount {

    private String userName;
    private String password;
    private Role role;
//    private BufferedImage image;
    private OrganizationType organizationType;

    public OrganizationType getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(OrganizationType organizationType) {
        this.organizationType = organizationType;
    }

//    public BufferedImage getImage() {
//        return image;
//    }
//
//    public void setImage(BufferedImage image) {
//        this.image = image;
//    }
//    private Employee employee;
//    private WorkQueue workQueue;
    private Enterprise enterprise;
//    private String enterpriseName;
    private Person person;
    private FinacialAccountDirectory finacialAccountList;

    public FinacialAccountDirectory getFinacialAccountList() {
        return finacialAccountList;
    }

    public void setFinacialAccountList(FinacialAccountDirectory finacialAccountList) {
        this.finacialAccountList = finacialAccountList;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

//    private Supplier supplier;
//    private UserAccountType type;
//
//    public UserAccountType getType() {
//        return type;
//    }
//
//    public void setType(UserAccountType type) {
//        this.type = type;
//    }
    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

//    public Supplier getSupplier() {
//        return supplier;
//    }
//
//    public void setSupplier(Supplier supplier) {
//        this.supplier = supplier;
//    }
    public UserAccount() {
//     workQueue = new WorkQueue();
        finacialAccountList = new FinacialAccountDirectory();
    }
//     public enum UserAccountType{
//   Pass("Pass"),InProcess("InProcess"),Reject("Reject");
//     private String value;
//
//        private UserAccountType(String value) {
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
//    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

//    public Employee getEmployee() {
//        return employee;
//    }
//
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }
//    public WorkQueue getWorkQueue() {
//        return workQueue;
//    }
//
//    public void setWorkQueue(WorkQueue workQueue) {
//        this.workQueue = workQueue;
//    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return userName; //To change body of generated methods, choose Tools | Templates.
    }
}
