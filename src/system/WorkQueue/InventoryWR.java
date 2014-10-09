/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.WorkQueue;

/**
 *
 * @author Administrator
 */
public class InventoryWR extends WorkRequest {
    private String inventoryRequest;

    public InventoryWR() {
           super();
    }

    public String getInventoryRequest() {
        return inventoryRequest;
    }

    public void setInventoryRequest(String inventoryRequest) {
        this.inventoryRequest = inventoryRequest;
    }
    
}
