/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageBean;


import entities.Subject;
import entities.confirm;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author User
 */
@Named(value = "studentBean")
@RequestScoped
public class StudentBean {
    private String firstName;
    private String lastName;
    private int age;
    private String location;
    private Date date;
    
 
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    @Inject
    private confirm con1;

    public confirm getCon1() {
        return con1;
    }

    public void setCon1(confirm con1) {
        this.con1 = con1;
    }
    
    @Inject
    private Subject subject;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * Creates a new instance of StudentBean
     */
    public StudentBean() {
    }
    
}
