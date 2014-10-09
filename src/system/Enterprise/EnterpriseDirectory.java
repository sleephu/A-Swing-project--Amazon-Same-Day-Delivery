/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.Enterprise;

import business.ShippingEnterprise.ShippingEnterprise;
import java.util.ArrayList;
import system.Organization.Organization;
import system.Product.Product;
import system.Supplier.Supplier;
import system.TempEnterprise.TempRetalier;
import system.TempEnterprise.TempShippingEnterprise;

/**
 *
 * @author Administrator
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public Enterprise createEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.LocalRetalier) {
            enterprise = new Supplier(name);
            enterpriseList.add(enterprise);
        } else if (type.equals(Enterprise.EnterpriseType.TempRetailerEnterprise)) {
            enterprise = new TempRetalier(name);
            enterpriseList.add(enterprise);
        } else if (type.equals(Enterprise.EnterpriseType.TempShippingEnterprise)) {
            enterprise = new TempShippingEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type.equals(Enterprise.EnterpriseType.ShippingEnterprise)) {
            enterprise = new ShippingEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }

    public void disableTempEnterprise(Enterprise e) {
        enterpriseList.remove(e);
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public Product getBestSellingProductOfAll() {
        Product bestSellingProduct = null;
        double minRate = 1;
        Product tempProduct;
        for (Enterprise e : enterpriseList) {
            if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.LocalRetalier)) {
                for (Organization o : e.getDepartmentDirectory().getDepartmentList()) {
                    if (o.getType().equals(Organization.OrganizationType.ProductManageDept)) {
                        tempProduct = o.getProductCatalog().getBestSellingProduct();
                        if (tempProduct.getLeftRate() < minRate) {
                            bestSellingProduct = tempProduct;
                            minRate = bestSellingProduct.getLeftRate();
                        }
                    }
                }

            }
        }
        return bestSellingProduct;
    }

    public Enterprise getBestEnterpriseOfAll() {
        Product bestSellingProduct = null;
        Enterprise bestEnterprise = null;
        double minRate = 1;
        Product tempProduct;
        for (Enterprise e : enterpriseList) {
            if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.LocalRetalier)) {
                for (Organization o : e.getDepartmentDirectory().getDepartmentList()) {
                    if (o.getType().equals(Organization.OrganizationType.ProductManageDept)) {
                        tempProduct = o.getProductCatalog().getBestSellingProduct();
                        if (tempProduct.getLeftRate() < minRate) {
                            bestSellingProduct = tempProduct;
                            minRate = bestSellingProduct.getLeftRate();

                        }
                    }
                }

            }
            bestEnterprise = e;
        }
        return bestEnterprise;
    }

}