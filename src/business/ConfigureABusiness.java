/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import system.Employee.Employee;
import system.Enterprise.Enterprise;
import system.NetWork.NetWork;
import system.Organization.Organization;
import system.Person.Person;
import system.Role.HRManagerRole;
import system.Role.SystemAdminRole;
import system.UserAccount.UserAccount;

/**
 *
 * @author Administrator
 */
public class ConfigureABusiness {

    public static Business configureABusiness() {

        Business business = Business.getInstance();
//        NetWork netWork = new NetWork("Global");
//        business.getNetWorkDirectory().getNetWorkList().add(netWork);
//        netWork.getEnterpriseDirectory().getEnterpriseList().add(business);
        Person p = business.getPersonDirectory().crePerson();
        p.setFirstName("tu");
        p.setLastName("hu");
        Employee e = business.getEmployeeDirectory().creEmployee();
        e.setEmpId("000001");
        e.setEmpName("hutu");
        UserAccount ua = business.getUserAccountDirectoty().creUserAccount("admin", "admin", e, new SystemAdminRole());
        ua.setUserName("admin");
        ua.setPassword("admin");
        ua.setPerson(e);
        ua.setRole(new SystemAdminRole());
//        ua.setOrganizationType(Organization.OrganizationType.AdministrationDept);
        //important step
//        enterprise.getOrganizationList().add(system);
//        NetWork n = business.getNetWorkDirectory().creNetWork("Global");
//        Enterprise en= n.getEnterpriseDirectory().createEnterprise("Amazon", Enterprise.EnterpriseType.Amazon);
//        en.setEnterpriseName("Amazon");
//        en.setEnterpriseType(Enterprise.EnterpriseType.Amazon);
        Organization o = business.getDepartmentDirectory().creOrganization(Organization.OrganizationType.AdministrationDept);
        o.setType(Organization.OrganizationType.AdministrationDept);
        Person p2 = business.getPersonDirectory().crePerson();
        p2.setFirstName("S");
        p2.setLastName("S");
        Employee employee = o.getEmployeeDirectory().creEmployee();
        employee.setEmpName("ad");
        employee.setEmpId("000002");
        UserAccount userAccount = business.getUserAccountDirectoty().creUserAccount("ad", "ad", employee, new HRManagerRole());
        userAccount.setUserName("ad");
        userAccount.setPassword("ad");
        userAccount.setPerson(employee);
        userAccount.setRole(new HRManagerRole());
        userAccount.setOrganizationType(Organization.OrganizationType.AdministrationDept);
        return business;


    }
}
