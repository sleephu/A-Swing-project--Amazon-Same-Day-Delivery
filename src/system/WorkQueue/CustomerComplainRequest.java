/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package system.WorkQueue;

import java.awt.image.BufferedImage;
import system.Role.Role;

/**
 *
 * @author Administrator
 */
public class CustomerComplainRequest extends WorkRequest {

    private String complainResult;
    private Role complainType;
    private BufferedImage image;
    
    public CustomerComplainRequest(){
        super();
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public Role getComplainType() {
        return complainType;
    }

    public void setComplainType(Role complainType) {
        this.complainType = complainType;
    }

    public String getComplainResult() {
        return complainResult;
    }

    public void setComplainResult(String complainResult) {
        this.complainResult = complainResult;
    }
}
