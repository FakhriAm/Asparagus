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
@Table(name = "products")
@NamedQueries({
    @NamedQuery(name = "Products.findAll", query = "SELECT p FROM Products p"),
    @NamedQuery(name = "Products.findById", query = "SELECT p FROM Products p WHERE p.id = :id"),
    @NamedQuery(name = "Products.findByCode", query = "SELECT p FROM Products p WHERE p.code = :code"),
    @NamedQuery(name = "Products.findByName", query = "SELECT p FROM Products p WHERE p.name = :name"),
    @NamedQuery(name = "Products.findByDescription", query = "SELECT p FROM Products p WHERE p.description = :description"),
    @NamedQuery(name = "Products.findByProductCategoryId", query = "SELECT p FROM Products p WHERE p.productCategoryId = :productCategoryId"),
    @NamedQuery(name = "Products.findByImage", query = "SELECT p FROM Products p WHERE p.image = :image"),
    @NamedQuery(name = "Products.findByCreateDate", query = "SELECT p FROM Products p WHERE p.createDate = :createDate"),
    @NamedQuery(name = "Products.findByCreateBy", query = "SELECT p FROM Products p WHERE p.createBy = :createBy"),
    @NamedQuery(name = "Products.findByUpdateDate", query = "SELECT p FROM Products p WHERE p.updateDate = :updateDate"),
    @NamedQuery(name = "Products.findByUpdateBy", query = "SELECT p FROM Products p WHERE p.updateBy = :updateBy"),
    @NamedQuery(name = "Products.findByNominal", query = "SELECT p FROM Products p WHERE p.nominal = :nominal"),
    @NamedQuery(name = "Products.findByVcode", query = "SELECT p FROM Products p WHERE p.vcode = :vcode"),
    @NamedQuery(name = "Products.findByHargaModal", query = "SELECT p FROM Products p WHERE p.hargaModal = :hargaModal"),
    @NamedQuery(name = "Products.findByActive", query = "SELECT p FROM Products p WHERE p.active = :active"),
    @NamedQuery(name = "Products.findByGangguan", query = "SELECT p FROM Products p WHERE p.gangguan = :gangguan"),
    @NamedQuery(name = "Products.findByKosong", query = "SELECT p FROM Products p WHERE p.kosong = :kosong")})
public class Products implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    private long id;
    @Id
    @Basic(optional = false)
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "product_category_id")
    private Integer productCategoryId;
    @Column(name = "image")
    private String image;
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
    @Column(name = "nominal")
    private Integer nominal;
    @Column(name = "vcode")
    private String vcode;
    @Column(name = "harga_modal")
    private Long hargaModal;
    @Column(name = "active")
    private Boolean active;
    @Column(name = "gangguan")
    private Boolean gangguan;
    @Column(name = "kosong")
    private Boolean kosong;

    public Products() {
    }

    public Products(String code) {
        this.code = code;
    }

    public Products(String code, long id) {
        this.code = code;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Integer productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public Integer getNominal() {
        return nominal;
    }

    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    public String getVcode() {
        return vcode;
    }

    public void setVcode(String vcode) {
        this.vcode = vcode;
    }

    public Long getHargaModal() {
        return hargaModal;
    }

    public void setHargaModal(Long hargaModal) {
        this.hargaModal = hargaModal;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getGangguan() {
        return gangguan;
    }

    public void setGangguan(Boolean gangguan) {
        this.gangguan = gangguan;
    }

    public Boolean getKosong() {
        return kosong;
    }

    public void setKosong(Boolean kosong) {
        this.kosong = kosong;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Products)) {
            return false;
        }
        Products other = (Products) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Products[code=" + code + "]";
    }

}
