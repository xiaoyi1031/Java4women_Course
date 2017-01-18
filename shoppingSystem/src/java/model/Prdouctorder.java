/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author User
 */
@Entity
@Table(name = "prdouctorder")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prdouctorder.findAll", query = "SELECT p FROM Prdouctorder p"),
    @NamedQuery(name = "Prdouctorder.findById", query = "SELECT p FROM Prdouctorder p WHERE p.id = :id"),
    @NamedQuery(name = "Prdouctorder.findByAmount", query = "SELECT p FROM Prdouctorder p WHERE p.amount = :amount")})
public class Prdouctorder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 255)
    @Column(name = "AMOUNT")
    private String amount;
    @JoinTable(name = "prdouctorder_product", joinColumns = {
        @JoinColumn(name = "PrdouctOrder_ID", referencedColumnName = "ID")}, inverseJoinColumns = {
        @JoinColumn(name = "products_ID", referencedColumnName = "ID")})
    @ManyToMany
    private Collection<Product> productCollection;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID")
    @ManyToOne
    private Customer customerId;

    public Prdouctorder() {
    }

    public Prdouctorder(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @XmlTransient
    public Collection<Product> getProductCollection() {
        return productCollection;
    }

    public void setProductCollection(Collection<Product> productCollection) {
        this.productCollection = productCollection;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
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
        if (!(object instanceof Prdouctorder)) {
            return false;
        }
        Prdouctorder other = (Prdouctorder) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Prdouctorder[ id=" + id + " ]";
    }
    
}
