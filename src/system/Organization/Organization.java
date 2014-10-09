/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Organization;

import java.util.ArrayList;
import system.Customer.CustomerDirectory;
import system.Employee.EmployeeDirectory;
import system.Inventory.LeftProductCatalog;
import system.Invoice.InvoiceList;
import system.Order.MasterOrderList;
import system.Payment.PaymentList;
import system.Person.PersonDirectory;
import system.Product.ProductCatalog;
import system.Role.Role;
import system.Shipping.ShippingList;
import system.Transcation.TranscationList;
import system.UserAccount.UserAccount;
import system.UserAccount.UserAccountDirectory;
import system.WorkQueue.WorkQueue;

/**
 *
 * @author Administrator
 */
public abstract class Organization {

    private int orgId;
    private String orgName;
    private EmployeeDirectory employeeDirectory;
    private WorkQueue workQueue;
    private UserAccountDirectory userAccountDirectoty;
    private static int count;
    private CustomerDirectory customerDirectory;
    private MasterOrderList masterOrderList;
    private PaymentList paymentList;
    private InvoiceList invoiceList;
    private ShippingList shippingList;
    private PersonDirectory personDirectory;
//private FinacialAccountDirectory finacialAccountList;
    private TranscationList transcationList;
    private OrganizationType type;
    private ProductCatalog productCatalog;
    private LeftProductCatalog leftProductCatalog;

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public LeftProductCatalog getLeftProductCatalog() {
        return leftProductCatalog;
    }

    public void setLeftProductCatalog(LeftProductCatalog leftProductCatalog) {
        this.leftProductCatalog = leftProductCatalog;
    }

    public OrganizationType getType() {
        return type;
    }

    public void setType(OrganizationType type) {
        this.type = type;
    }

    public ShippingList getShippingList() {
        return shippingList;
    }

    public void setShippingList(ShippingList shippingList) {
        this.shippingList = shippingList;
    }

    public MasterOrderList getMasterOrderList() {
        return masterOrderList;
    }

    public void setMasterOrderList(MasterOrderList masterOrderList) {
        this.masterOrderList = masterOrderList;
    }

    public PaymentList getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(PaymentList paymentList) {
        this.paymentList = paymentList;
    }

    public InvoiceList getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(InvoiceList invoiceList) {
        this.invoiceList = invoiceList;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public enum OrganizationType {

        CustomerDept("CustomerDept"), AmazonSalesDept("SalesDept"), SupplierSalesDept("SalesDept"), 
//        ManageSupplierDept("ManageSupplierDept"),
        ProductManageDept("ProductManageDept"), AmazonShippingDept("ShippingDept"),
        ShippingDept("ShippingDept"), AmazonAccountingDept("AccountingDept"), AdministrationDept("AdministrationDept"),
        EnterpriseAccountingDept("AccountingDept");
        private String value;

        private OrganizationType(String value) {
            this.value = value;

        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
    // parameterized constructor

    public Organization(String name) {
        this.orgName = name;
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectoty = new UserAccountDirectory();
        orgId = count;
        ++count;
        workQueue = new WorkQueue();
        customerDirectory = new CustomerDirectory();
        masterOrderList = new MasterOrderList();
        paymentList = new PaymentList();
        invoiceList = new InvoiceList();
        shippingList = new ShippingList();
        personDirectory = new PersonDirectory();
//        finacialAccountList = new FinacialAccountDirectory();
        transcationList = new TranscationList();
        productCatalog = new ProductCatalog();
        leftProductCatalog = new LeftProductCatalog();
    }

    public UserAccount authenticateUser(String username, String password) {
        return this.userAccountDirectoty.validate(username, password);
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

//    public FinacialAccountDirectory getFinacialAccountList() {
//        return finacialAccountList;
//    }
//
//    public void setFinacialAccountList(FinacialAccountDirectory finacialAccountList) {
//        this.finacialAccountList = finacialAccountList;
//    }
    public TranscationList getTranscationList() {
        return transcationList;
    }

    public void setTranscationList(TranscationList transcationList) {
        this.transcationList = transcationList;
    }

    public abstract ArrayList<Role> getSupportedRoles();

    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public UserAccountDirectory getUserAccountDirectoty() {
        return userAccountDirectoty;
    }

    public void setUserAccountDirectoty(UserAccountDirectory userAccountDirectoty) {
        this.userAccountDirectoty = userAccountDirectoty;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Organization.count = count;
    }

    @Override
    public String toString() {
        return orgName;
    }
}
