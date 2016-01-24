/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author devest
 */
@Entity
@Table(name = "CURE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cure.findAll", query = "SELECT c FROM Cure c"),
    @NamedQuery(name = "Cure.findById", query = "SELECT c FROM Cure c WHERE c.id = :id"),
    @NamedQuery(name = "Cure.findByCurename", query = "SELECT c FROM Cure c WHERE c.curename = :curename"),
    @NamedQuery(name = "Cure.findByDescription", query = "SELECT c FROM Cure c WHERE c.description = :description")})
public class Cure implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "CURENAME")
    private String curename;
    @Size(max = 255)
    @Column(name = "DESCRIPTION")
    private String description;
    @JoinColumn(name = "ID_PERSON", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Person idPerson;

    public Cure() {
    }

    public Cure(Long id) {
        this.id = id;
    }

    public Cure(Long id, String curename) {
        this.id = id;
        this.curename = curename;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurename() {
        return curename;
    }

    public void setCurename(String curename) {
        this.curename = curename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Person getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Person idPerson) {
        this.idPerson = idPerson;
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
        if (!(object instanceof Cure)) {
            return false;
        }
        Cure other = (Cure) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Cure[ id=" + id + " ]";
    }
    
}
