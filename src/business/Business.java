/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import system.Enterprise.Enterprise;
import system.NetWork.NetWorkDirectory;

import system.Role.Role;
import system.Role.SystemAdminRole;

/**
 *
 * @author Administrator
 */
public class Business extends Enterprise {
//     private Enterprise enterprise;

    private static Business business;
    private NetWorkDirectory netWorkDirectory;

    public static Business getInstance() {
        if (business == null) {
            business = new Business();
        }
        return business;
    }

    private Business() {
        super(null, Enterprise.EnterpriseType.Amazon);
        this.netWorkDirectory = new NetWorkDirectory();
    }

//    public PersonDirectory getPeronDirectory() {
//        return peronDirectory;
//    }
//
//    public void setPeronDirectory(PersonDirectory peronDirectory) {
//        this.peronDirectory = peronDirectory;
//    }
//    public Enterprise getEnterprise() {
//        return enterprise;
//    }
//
//    public void setEnterprise(Enterprise enterprise) {
//        this.enterprise = enterprise;
//    }
//
//    public Business() {
//        super("",Enterprise.EnterpriseType.Amazon);
////        this.enterprise = new Enterprise("");
//        this.netWorkDirectory = new  NetWorkDirectory();
////        this.peronDirectory = new PersonDirectory();
//    }
    public NetWorkDirectory getNetWorkDirectory() {
        return netWorkDirectory;
    }

    public void setNetWorkDirectory(NetWorkDirectory netWorkDirectory) {
        this.netWorkDirectory = netWorkDirectory;
    }

//    public Enterprise getBestEnterprise(NetWork n) {
////        Product bestSellingProduct = null;
//        Enterprise bestEnterprise = null;
//        double sumE;
//        double maxSum=0;
//        for (Organization org : business.getDepartmentDirectory().getDepartmentList()) {
//            if (org.getType().equals(Organization.OrganizationType.AmazonSalesDept)) {
//                for (Order o : org.getMasterOrderList().getOrders()) {
////                  sumE= org.getMasterOrderList().getTotalAmount(n);
////                  if(sumE>maxSum){
////                  maxSum= sumE;
////                  bestEnterprise
////                  }
//    for(OrderItem oi: o.getOis()){
//    for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
//         if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.LocalRetalier)){
//         for(Organization or: e.getDepartmentDirectory().getDepartmentList()){
//         if(or.getType().equals(Organization.OrganizationType.ProductManageDept)){
//         for(Product p: or.getProductCatalog().getProductList()){
//    if(oi.getProduct().equals(p)){
//    sumE=org.getMasterOrderList().getTotalAmount(n);
//    if(sumE>maxSum){
//        maxSum= sumE;
//        bestEnterprise = e; 
//    }
//   
//    }     
//         }
//         }
//         }
//         }
//         }
//    }
////      sum+= o.getEachOrderPrice();
//                }
//            }
//        }
////     return sumE; 
//        return bestEnterprise;
//    }
//      public Product getBestP(NetWork n) {
//        Product bestSellingProduct = null;
////        Enterprise bestEnterprise = null;
//        double sumE;
//        double maxSum=0;
//        for (Organization org : business.getDepartmentDirectory().getDepartmentList()) {
//            if (org.getType().equals(Organization.OrganizationType.AmazonSalesDept)) {
//                for (Order o : org.getMasterOrderList().getOrders()) {
////                  sumE= org.getMasterOrderList().getTotalAmount(n);
////                  if(sumE>maxSum){
////                  maxSum= sumE;
////                  bestEnterprise
////                  }
//    for(OrderItem oi: o.getOis()){
//    for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
//         if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.LocalRetalier)){
//         for(Organization or: e.getDepartmentDirectory().getDepartmentList()){
//         if(or.getType().equals(Organization.OrganizationType.ProductManageDept)){
//         for(Product p: or.getProductCatalog().getProductList()){
//    if(oi.getProduct().equals(p)){
//    sumE=org.getMasterOrderList().getTotalAmount(n);
//    if(sumE>maxSum){
//        maxSum= sumE;
//        bestSellingProduct = p; 
//    }
//   
//    }     
//         }
//         }
//         }
//         }
//         }
//    }
////      sum+= o.getEachOrderPrice();
//                }
//            }
//        }
////     return sumE; 
//        return bestSellingProduct;
//    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
//        return null;
    }
}
