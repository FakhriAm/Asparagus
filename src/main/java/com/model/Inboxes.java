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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ngonar
 */
@Entity
@Table(name = "inboxes")
@NamedQueries({
    @NamedQuery(name = "Inboxes.findAll", query = "SELECT i FROM Inboxes i"),
    @NamedQuery(name = "Inboxes.findById", query = "SELECT i FROM Inboxes i WHERE i.id = :id"),
    @NamedQuery(name = "Inboxes.findBySender", query = "SELECT i FROM Inboxes i WHERE i.sender = :sender"),
    @NamedQuery(name = "Inboxes.findByMessage", query = "SELECT i FROM Inboxes i WHERE i.message = :message"),
    @NamedQuery(name = "Inboxes.findBySenderType", query = "SELECT i FROM Inboxes i WHERE i.senderType = :senderType"),
    @NamedQuery(name = "Inboxes.findByStatus", query = "SELECT i FROM Inboxes i WHERE i.status = :status"),
    @NamedQuery(name = "Inboxes.findByTerminal", query = "SELECT i FROM Inboxes i WHERE i.terminal = :terminal"),
    @NamedQuery(name = "Inboxes.findByCreateDate", query = "SELECT i FROM Inboxes i WHERE i.createDate = :createDate"),
    @NamedQuery(name = "Inboxes.findByStatusDate", query = "SELECT i FROM Inboxes i WHERE i.statusDate = :statusDate"),
    @NamedQuery(name = "Inboxes.findByUserId", query = "SELECT i FROM Inboxes i WHERE i.userId = :userId"),
    @NamedQuery(name = "Inboxes.findByMediaTypeId", query = "SELECT i FROM Inboxes i WHERE i.mediaTypeId = :mediaTypeId"),
    @NamedQuery(name = "Inboxes.findByIsResponse", query = "SELECT i FROM Inboxes i WHERE i.isResponse = :isResponse"),
    @NamedQuery(name = "Inboxes.findByFreeOfCharge", query = "SELECT i FROM Inboxes i WHERE i.freeOfCharge = :freeOfCharge"),
    @NamedQuery(name = "Inboxes.findByReceiver", query = "SELECT i FROM Inboxes i WHERE i.receiver = :receiver")})

@SequenceGenerator(sequenceName="inboxes_id_seq",name="inbox_gen",allocationSize=1)
public class Inboxes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inbox_gen")
    @Column(name = "id")
    private Long id;
    @Column(name = "sender")
    private String sender;
    @Column(name = "message")
    private String message;
    @Column(name = "sender_type")
    private String senderType;
    @Column(name = "status")
    private Integer status;
    @Column(name = "terminal")
    private Integer terminal;
    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Column(name = "status_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statusDate;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "media_type_id")
    private Integer mediaTypeId;
    @Column(name = "is_response")
    private Boolean isResponse;
    @Column(name = "free_of_charge")
    private Boolean freeOfCharge;
    @Column(name = "receiver")
    private String receiver;
    @Column(name = "idpel")
    private String idpel;
    @Column(name = "msisdn")
    private String msisdn;
    @Column(name = "trx_id")
    private String trxId;
    @Column(name = "prod_id")
    private Integer prodId;
    @Column(name = "trx_type")
    private String trxType;
    @Column(name = "nominal")
    private Integer nominal;

    public Inboxes() {
    }

    public Inboxes(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSenderType() {
        return senderType;
    }

    public void setSenderType(String senderType) {
        this.senderType = senderType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTerminal() {
        return terminal;
    }

    public void setTerminal(Integer terminal) {
        this.terminal = terminal;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMediaTypeId() {
        return mediaTypeId;
    }

    public void setMediaTypeId(Integer mediaTypeId) {
        this.mediaTypeId = mediaTypeId;
    }

    public Boolean getIsResponse() {
        return isResponse;
    }

    public void setIsResponse(Boolean isResponse) {
        this.isResponse = isResponse;
    }

    public Boolean getFreeOfCharge() {
        return freeOfCharge;
    }

    public void setFreeOfCharge(Boolean freeOfCharge) {
        this.freeOfCharge = freeOfCharge;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
    
    public void setTrxId(String trxid) {
        this.trxId = trxid;
    }

    public String getTrxId() {
        return trxId;
    }
    
    public void setTrxType(String trxtype) {
        this.trxType = trxtype;
    }

    public String getTrxType() {
        return trxType;
    }
    
    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodid) {
        this.prodId = prodid;
    }
    
    public String getIdpel() {
        return idpel;
    }

    public void setIdpel(String idpel) {
        this.idpel = idpel;
    }
    
    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }
    
    public Integer getNominal() {
        return nominal;
    }

    public void setNominal(Integer nominal) {
        this.nominal = nominal;
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
        if (!(object instanceof Inboxes)) {
            return false;
        }
        Inboxes other = (Inboxes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Inboxes[id=" + id + "]";
    }

}
