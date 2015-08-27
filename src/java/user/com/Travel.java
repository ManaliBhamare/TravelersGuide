/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.com;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Manali Bhamare
 */
@Entity
@Table(name = "travel", catalog = "user_data", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Travel.findAll", query = "SELECT t FROM Travel t"),
    @NamedQuery(name = "Travel.findById", query = "SELECT t FROM Travel t WHERE t.id = :id"),
    @NamedQuery(name = "Travel.findByUserId", query = "SELECT t FROM Travel t WHERE t.userId = :userId")})
public class Travel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Lob
    @Size(max = 65535)
    @Column(name = "places")
    private String places;
    @Lob
    @Size(max = 65535)
    @Column(name = "activities")
    private String activities;
    @Lob
    @Size(max = 65535)
    @Column(name = "experiences")
    private String experiences;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "user_id")
    private int userId;

    public Travel() {
    }

    public Travel(Integer id) {
        this.id = id;
    }

    public Travel(Integer id, int userId) {
        this.id = id;
        this.userId = userId;
    }

    public String getPlaces() {
        return places;
    }

    public void setPlaces(String places) {
        this.places = places;
    }

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }

    public String getExperiences() {
        return experiences;
    }

    public void setExperiences(String experiences) {
        this.experiences = experiences;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
        if (!(object instanceof Travel)) {
            return false;
        }
        Travel other = (Travel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "user.com.Travel[ id=" + id + " ]";
    }
    
}
