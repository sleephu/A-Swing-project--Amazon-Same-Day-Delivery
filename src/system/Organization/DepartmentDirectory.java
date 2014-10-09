/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Organization;

import java.util.ArrayList;
import system.Organization.Organization.OrganizationType;
import system.Role.AmazonSalesDeptRole;

/**
 *
 * @author Administrator
 */
public class DepartmentDirectory {

    private ArrayList<Organization> departmentList;

    public DepartmentDirectory() {
        departmentList = new ArrayList<>();
    }

    public ArrayList<Organization> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(ArrayList<Organization> departmentList) {
        this.departmentList = departmentList;
    }

    public Organization creOrganization(OrganizationType type) {

        if (type.equals(Organization.OrganizationType.AmazonSalesDept)) {
            // Dynamic binding
            Organization o = new AmazonSalesDept();
            departmentList.add(o);
            return o;
        }
//        else if (type.equals(Organization.OrganizationType.ManageSupplierDept)) {
//            Organization org = new ManageExternalDept();
//            departmentList.add(org);
//            return org;
//        } 
        else if (type.equals(Organization.OrganizationType.CustomerDept)) {
            Organization org = new CustomerDept();
            departmentList.add(org);
            return org;
        } else if (type.equals(Organization.OrganizationType.ProductManageDept)) {

            Organization org = new ProductManageDept();
            departmentList.add(org);
            return org;
        } else if (type.equals(Organization.OrganizationType.ShippingDept)) {
            Organization org = new ShippingDept();
            departmentList.add(org);
            return org;
        } else if (type.equals(Organization.OrganizationType.AmazonAccountingDept)) {
            Organization org = new AmazonAccountingDept();
            departmentList.add(org);
            return org;
        } else if (type.equals(Organization.OrganizationType.AdministrationDept)) {
            Organization org = new AdministrationDept();
            departmentList.add(org);
            return org;
        } else if (type.equals(Organization.OrganizationType.EnterpriseAccountingDept)) {
            Organization org = new EnterpriseAccountingDept();
            departmentList.add(org);
            return org;
        } else if (type.equals(Organization.OrganizationType.SupplierSalesDept)) {
            Organization org = new SupplierSalesDept();
            departmentList.add(org);
            return org;
        }
        else if(type.equals(Organization.OrganizationType.AmazonShippingDept)){
         Organization org = new AmazonShippingDept();
            departmentList.add(org);
            return org;
        }

        return null;


    }
}
