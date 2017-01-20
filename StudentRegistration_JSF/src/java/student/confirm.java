/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author User
 */
@Named(value = "confirm")
@Dependent
public class confirm {
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Creates a new instance of confirm
     */
    public confirm() {
    }
    
    public String navigation(){
        
        if (this.location.equalsIgnoreCase("Stockholm"))
             return "confirmation";
        else if (this.location.equalsIgnoreCase("Göteborg"))
             return "confirmation";
        else
             return "no confirmation";
    }
    
}
