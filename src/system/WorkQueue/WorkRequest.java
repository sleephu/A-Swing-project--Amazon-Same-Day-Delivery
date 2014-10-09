/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.WorkQueue;

import java.util.Date;
import system.Enterprise.Enterprise;
import system.Order.OrderItem;
import system.Organization.Organization.OrganizationType;
import system.Product.Product;
import system.Role.Role;
import system.UserAccount.UserAccount;

/**
 *
 * @author Administrator
 */
public class WorkRequest {

    private String message;
    private UserAccount sender;
    private Role receiver;
    private OrganizationType receiverO;
  

    public OrganizationType getReceiverO() {
        return receiverO;
    }

    public void setReceiverO(OrganizationType receiverO) {
        this.receiverO = receiverO;
    }
    private String status;
    private String countryInfo;
    private String cityInfo;
    private String stateInfo;
    private String typeInfo;
    private Date iniDate;
    private Date compleDate;
    private static int count;
//    private BufferedImage image;
    private int id;
    private Enterprise shippingEnterprise;
    private Product product;
    private WorkRequestType workRequestType;
    private OrderItem orderItem;

    //    private Order order;
    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }
   
  

   
    
    public WorkRequestType getWorkRequestType() {
        return workRequestType;
    }

    public void setWorkRequestType(WorkRequestType workRequestType) {
        this.workRequestType = workRequestType;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Enterprise getShippingEnterprise() {
        return shippingEnterprise;
    }

    public void setShippingEnterprise(Enterprise shippingEnterprise) {
        this.shippingEnterprise = shippingEnterprise;
    }

    public Role getReceiver() {
        return receiver;
    }

    public void setReceiver(Role receiver) {
        this.receiver = receiver;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        WorkRequest.count = count;
    }

//    public BufferedImage getImage() {
//        return image;
//    }
//
//    public void setImage(BufferedImage image) {
//        this.image = image;
//    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public WorkRequest() {
        id = count;
        ++count;
    }

    public enum WorkRequestType {

        TempEnterpriseRequest("TempEnterprise"),InventoryRequest("InventoryRequest"),ShippingRequest("ShippingRequest"), CustomerShippingRequest("CustomerShippingRequest"),CustomerReturnRequest("ReturnRequest"), CustomerComplainRequest("CustomerComplainRequest");
        private String value;

        private WorkRequestType(String value) {
            this.value = value;

        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }

    //    public Date getDate() {
    //        return date;
    //    }
    //
    //    public void setDate(Date date) {
    //        this.date = date;
    //    }
    public Date getIniDate() {
        return iniDate;
    }

    public void setIniDate(Date iniDate) {
        this.iniDate = iniDate;
    }

    public Date getCompleDate() {
        return compleDate;
    }

    public void setCompleDate(Date compleDate) {
        this.compleDate = compleDate;
    }

    
    public String getTypeInfo() {
        return typeInfo;
    }

    public void setTypeInfo(String typeInfo) {
        this.typeInfo = typeInfo;
    }

    public String getCountryInfo() {
        return countryInfo;
    }

    public void setCountryInfo(String countryInfo) {
        this.countryInfo = countryInfo;
    }

    public String getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(String cityInfo) {
        this.cityInfo = cityInfo;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

//    public UserAccount getReceiver() {
//        return receiver;
//    }
//
//    public void setReceiver(UserAccount receiver) {
//        this.receiver = receiver;
//    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
