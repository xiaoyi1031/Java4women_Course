/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "emloyee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Emloyee.findAll", query = "SELECT e FROM Emloyee e"),
    @NamedQuery(name = "Emloyee.findById", query = "SELECT e FROM Emloyee e WHERE e.id = :id"),
    @NamedQuery(name = "Emloyee.findByActive", query = "SELECT e FROM Emloyee e WHERE e.active = :active"),
    @NamedQuery(name = "Emloyee.findByBirthdate", query = "SELECT e FROM Emloyee e WHERE e.birthdate = :birthdate"),
    @NamedQuery(name = "Emloyee.findByFirstname", query = "SELECT e FROM Emloyee e WHERE e.firstname = :firstname"),
    @NamedQuery(name = "Emloyee.findByGender", query = "SELECT e FROM Emloyee e WHERE e.gender = :gender"),
    @NamedQuery(name = "Emloyee.findByLastname", query = "SELECT e FROM Emloyee e WHERE e.lastname = :lastname"),
    @NamedQuery(name = "Emloyee.findByProfilepic", query = "SELECT e FROM Emloyee e WHERE e.profilepic = :profilepic"),
    @NamedQuery(name = "Emloyee.findByDtype", query = "SELECT e FROM Emloyee e WHERE e.dtype = :dtype"),
    @NamedQuery(name = "Emloyee.findBySalary", query = "SELECT e FROM Emloyee e WHERE e.salary = :salary"),
    @NamedQuery(name = "Emloyee.findByVacation", query = "SELECT e FROM Emloyee e WHERE e.vacation = :vacation"),
    @NamedQuery(name = "Emloyee.findByDailyrate", query = "SELECT e FROM Emloyee e WHERE e.dailyrate = :dailyrate"),
    @NamedQuery(name = "Emloyee.findByTerm", query = "SELECT e FROM Emloyee e WHERE e.term = :term")})
public class Emloyee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Column(name = "ACTIVE")
    private Boolean active;
    @Column(name = "BIRTHDATE")
    @Temporal(TemporalType.DATE)
    private Date birthdate;
    @Size(max = 255)
    @Column(name = "FIRSTNAME")
    private String firstname;
    @Column(name = "GENDER")
    private Boolean gender;
    @Size(max = 255)
    @Column(name = "LASTNAME")
    private String lastname;
    @Column(name = "PROFILEPIC")
    private Short profilepic;
    @Size(max = 31)
    @Column(name = "DTYPE")
    private String dtype;
    @Column(name = "SALARY")
    private Integer salary;
    @Column(name = "VACATION")
    private Integer vacation;
    @Column(name = "DAILYRATE")
    private Integer dailyrate;
    @Column(name = "TERM")
    private Integer term;

    public Emloyee() {
    }

    public Emloyee(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Short getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(Short profilepic) {
        this.profilepic = profilepic;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getVacation() {
        return vacation;
    }

    public void setVacation(Integer vacation) {
        this.vacation = vacation;
    }

    public Integer getDailyrate() {
        return dailyrate;
    }

    public void setDailyrate(Integer dailyrate) {
        this.dailyrate = dailyrate;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Emloyee)) {
            return false;
        }
        Emloyee other = (Emloyee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Emloyee[ id=" + id + " ]";
    }
    
}
