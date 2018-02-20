/*
 * To change this template, choose Tools | Templates
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

/**
 *
 * @author ngonar
 */
@Entity
@Table(name = "users")
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u"),
    @NamedQuery(name = "Users.findById", query = "SELECT u FROM Users u WHERE u.id = :id"),
    @NamedQuery(name = "Users.findByCompany", query = "SELECT u FROM Users u WHERE u.company = :company"),
    @NamedQuery(name = "Users.findByFirstName", query = "SELECT u FROM Users u WHERE u.firstName = :firstName"),
    @NamedQuery(name = "Users.findByLastName", query = "SELECT u FROM Users u WHERE u.lastName = :lastName"),
    @NamedQuery(name = "Users.findByEmail", query = "SELECT u FROM Users u WHERE u.email = :email"),
    @NamedQuery(name = "Users.findByPhone", query = "SELECT u FROM Users u WHERE u.phone = :phone"),
    @NamedQuery(name = "Users.findByDiscount", query = "SELECT u FROM Users u WHERE u.discount = :discount"),
    @NamedQuery(name = "Users.findByUsername", query = "SELECT u FROM Users u WHERE u.username = :username"),
    @NamedQuery(name = "Users.findByPassword", query = "SELECT u FROM Users u WHERE u.password = :password"),
    @NamedQuery(name = "Users.findByUid", query = "SELECT u FROM Users u WHERE u.uid = :uid"),
    @NamedQuery(name = "Users.findByRan", query = "SELECT u FROM Users u WHERE u.ran = :ran"),
    @NamedQuery(name = "Users.findBySecretKey", query = "SELECT u FROM Users u WHERE u.secretKey = :secretKey"),
    @NamedQuery(name = "Users.findByPin", query = "SELECT u FROM Users u WHERE u.pin = :pin"),
    @NamedQuery(name = "Users.findByGroupId", query = "SELECT u FROM Users u WHERE u.groupId = :groupId"),
    @NamedQuery(name = "Users.findByImage", query = "SELECT u FROM Users u WHERE u.image = :image"),
    @NamedQuery(name = "Users.findByUserTypeId", query = "SELECT u FROM Users u WHERE u.userTypeId = :userTypeId"),
    @NamedQuery(name = "Users.findByPriceTemplateId", query = "SELECT u FROM Users u WHERE u.priceTemplateId = :priceTemplateId"),
    @NamedQuery(name = "Users.findByManager", query = "SELECT u FROM Users u WHERE u.manager = :manager"),
    @NamedQuery(name = "Users.findByCreateDate", query = "SELECT u FROM Users u WHERE u.createDate = :createDate"),
    @NamedQuery(name = "Users.findByCreateBy", query = "SELECT u FROM Users u WHERE u.createBy = :createBy"),
    @NamedQuery(name = "Users.findByUpdateDate", query = "SELECT u FROM Users u WHERE u.updateDate = :updateDate"),
    @NamedQuery(name = "Users.findByUpdateBy", query = "SELECT u FROM Users u WHERE u.updateBy = :updateBy"),
    @NamedQuery(name = "Users.findByAddress", query = "SELECT u FROM Users u WHERE u.address = :address"),
    @NamedQuery(name = "Users.findByRemark", query = "SELECT u FROM Users u WHERE u.remark = :remark"),
    @NamedQuery(name = "Users.findByXml", query = "SELECT u FROM Users u WHERE u.xml = :xml"),
    @NamedQuery(name = "Users.findByPks", query = "SELECT u FROM Users u WHERE u.pks = :pks")})
public class Users implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "company")
    private String company;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "discount")
    private Double discount;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "uid")
    private String uid;
    @Column(name = "ran")
    private String ran;
    @Column(name = "secret_key")
    private String secretKey;
    @Column(name = "pin")
    private String pin;
    @Column(name = "group_id")
    private Integer groupId;
    @Column(name = "image")
    private String image;
    @Column(name = "user_type_id")
    private Integer userTypeId;
    @Column(name = "price_template_id")
    private Integer priceTemplateId;
    @Column(name = "manager")
    private Integer manager;
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Column(name = "create_by")
    private String createBy;
    @Column(name = "update_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;
    @Column(name = "update_by")
    private String updateBy;
    @Column(name = "address")
    private String address;
    @Column(name = "remark")
    private String remark;
    @Column(name = "XML")
    private Boolean xml;
    @Column(name = "PKS")
    private String pks;

    public Users() {
    }

    public Users(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getRan() {
        return ran;
    }

    public void setRan(String ran) {
        this.ran = ran;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public Integer getPriceTemplateId() {
        return priceTemplateId;
    }

    public void setPriceTemplateId(Integer priceTemplateId) {
        this.priceTemplateId = priceTemplateId;
    }

    public Integer getManager() {
        return manager;
    }

    public void setManager(Integer manager) {
        this.manager = manager;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean getXml() {
        return xml;
    }

    public void setXml(Boolean xml) {
        this.xml = xml;
    }

    public String getPks() {
        return pks;
    }

    public void setPks(String pks) {
        this.pks = pks;
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
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Users[id=" + id + "]";
    }

}
