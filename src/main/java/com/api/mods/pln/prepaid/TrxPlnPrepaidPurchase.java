
package com.api.mods.pln.prepaid;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author root
 */
@XmlRootElement(name="trx")
public class TrxPlnPrepaidPurchase {
    
    String trx_id;
    String rc;
    String stan;
    String datetime;
    String merchant_code;
    String bank_code;
    String terminal_id;
    String material_number;
    String subscriber_id;
    String pln_refno;
    String switcher_refno;
    String subscriber_name;
    String subscriber_segmentation;
    String power;
    String admin_charge;
    String distribution_code;
    String service_unit;
    String service_unit_phone;
    String max_kwh_unit;
    String total_repeat;
    String token;
    String amount;
    String angsuran;
    String power_purchase;
    String jml_kwh;
    String ppn;
    String ppj;
    String meterai;
    String info_text;
    String power_purchase_unsold;
    String power_purchase_unsold2;
    String saldo;
    String bit11;
    String bit12;
    String bit48;
    String bit62;
    String harga;
    
    
    public String getHarga() {
            return harga;
    }

    @XmlElement(name="harga")
    public void setHarga(String harga) {
            this.harga = harga;
    }
    
    public String getPowerPurchase() {
            return power_purchase;
    }

    @XmlElement(name="power_purchase")
    public void setPowerPurchase(String power_purchase) {
            this.power_purchase = power_purchase;
    }
    
    public String getAngsuran() {
            return angsuran;
    }

    @XmlElement(name="angsuran")
    public void setAngsuran(String angsuran) {
            this.angsuran = angsuran;
    }
    
    public String getAmount() {
            return amount;
    }

    @XmlElement(name="amount")
    public void setAmount(String amount) {
            this.amount = amount;
    }
    
    public String getInfoText() {
            return info_text;
    }

    @XmlElement(name="info_text")
    public void setInfoText(String info_text) {
            this.info_text = info_text;
    }
    
    public String getMeterai() {
            return meterai;
    }

    @XmlElement(name="meterai")
    public void setMeterai(String meterai) {
            this.meterai = meterai;
    }
    
    public String getPpn() {
            return ppn;
    }

    @XmlElement(name="ppn")
    public void setPpn(String ppn) {
            this.ppn = ppn;
    }
    
    public String getPpj() {
            return ppj;
    }

    @XmlElement(name="ppj")
    public void setPpj(String ppj) {
            this.ppj = ppj;
    }
    
    public String getToken() {
            return token;
    }

    @XmlElement(name="token")
    public void setToken(String token) {
            this.token = token;
    }
    
    public String getJmlKwh() {
            return jml_kwh;
    }

    @XmlElement(name="jml_kwh")
    public void setJmlKwh(String jml_kwh) {
            this.jml_kwh = jml_kwh;
    }

    public String getTrx_id() {
            return trx_id;
    }

    @XmlElement(name="trx_id")
    public void setTrx_id(String trx_id) {
            this.trx_id = trx_id;
    }

    public String getRc() {
            return rc;
    }

    @XmlElement(name="rc")
    public void setRc(String rc) {
            this.rc = rc;
    }

    public String getStan() {
            return stan;
    }

    @XmlElement(name="stan")
    public void setStan(String stan) {
            this.stan = stan;
    }
    
    public String getDatetime() {
            return datetime;
    }

    @XmlElement(name="datetime")
    public void setDatetime(String datetime) {
            this.datetime = datetime;
    }
    
    public String getMerchantCode() {
            return merchant_code;
    }

    @XmlElement(name="merchant_code")
    public void setMerchantCode(String merchant_code) {
            this.merchant_code = merchant_code;
    }
    
    public String getBankCode() {
            return bank_code;
    }

    @XmlElement(name="bank_code")
    public void setBankCode(String bank_code) {
            this.bank_code = bank_code;
    }
    
    public String getTerminalId() {
            return terminal_id;
    }

    @XmlElement(name="terminal_id")
    public void setTerminalId(String terminal_id) {
            this.terminal_id = terminal_id;
    }
    
    public String getMaterialNumber() {
            return material_number;
    }

    @XmlElement(name="material_number")
    public void setMaterialNumber(String material_number) {
            this.material_number = material_number;
    }
    
    public String getSubscriberId() {
            return subscriber_id;
    }

    @XmlElement(name="subscriber_id")
    public void setSubscriberId(String subscriber_id) {
            this.subscriber_id = subscriber_id;
    }
    
    public String getPlnRefno() {
            return pln_refno;
    }

    @XmlElement(name="pln_refno")
    public void setPlnRefno(String pln_refno) {
            this.pln_refno = pln_refno;
    }
    
    public String getSwitcherRefno() {
            return switcher_refno;
    }

    @XmlElement(name="switcher_refno")
    public void setSwitcherRefno(String switcher_refno) {
            this.switcher_refno = switcher_refno;
    }
    
    public String getSubscriberName() {
            return subscriber_name;
    }

    @XmlElement(name="subscriber_name")
    public void setSubscriberName(String subscriber_name) {
            this.subscriber_name = subscriber_name;
    }
    
    public String getSubscriberSegmentation() {
            return subscriber_segmentation;
    }

    @XmlElement(name="subscriber_segmentation")
    public void setSubscriberSegmentation(String subscriber_segmentation) {
            this.subscriber_segmentation = subscriber_segmentation;
    }
    
    public String getPower() {
            return power;
    }

    @XmlElement(name="power")
    public void setPower(String power) {
            this.power = power;
    }
    
    public String getAdminCharge() {
            return admin_charge;
    }

    @XmlElement(name="admin_charge")
    public void setAdminCharge(String admin_charge) {
            this.admin_charge = admin_charge;
    }
    
    public String getDistributionCode() {
            return distribution_code;
    }

    @XmlElement(name="distribution_code")
    public void setDistributionCode(String distribution_code) {
            this.distribution_code = distribution_code;
    }
    
    public String getServiceUnit() {
            return service_unit;
    }

    @XmlElement(name="service_unit")
    public void setServiceUnit(String service_unit) {
            this.service_unit = service_unit;
    }
    
    public String getServiceUnitPhone() {
            return service_unit_phone;
    }

    @XmlElement(name="service_unit_phone")
    public void setServiceUnitPhone(String service_unit_phone) {
            this.service_unit_phone = service_unit_phone;
    }
    
    public String getMaxKwhUnit() {
            return max_kwh_unit;
    }

    @XmlElement(name="max_kwh_unit")
    public void setMaxKwhUnit(String max_kwh_unit) {
            this.max_kwh_unit = max_kwh_unit;
    }
    
    public String getTotalRepeat() {
            return total_repeat;
    }

    @XmlElement(name="total_repeat")
    public void setTotalRepeat(String total_repeat) {
            this.total_repeat = total_repeat;
    }
    
    public String getPowerPurchaseUnsold() {
            return power_purchase_unsold;
    }

    @XmlElement(name="power_purchase_unsold")
    public void setPowerPurchaseUnsold(String power_purchase_unsold) {
            this.power_purchase_unsold = power_purchase_unsold;
    }
    
    public String getPowerPurchaseUnsold2() {
            return power_purchase_unsold2;
    }

    @XmlElement(name="power_purchase_unsold2")
    public void setPowerPurchaseUnsold2(String power_purchase_unsold2) {
            this.power_purchase_unsold2 = power_purchase_unsold2;
    }
    
    public String getSaldo() {
            return saldo;
    }

    @XmlElement(name="saldo")
    public void setSaldo(String saldo) {
            this.saldo = saldo;
    }
    
    public String getBit11() {
            return bit11;
    }

    @XmlElement(name="bit11")
    public void setBit11(String bit11) {
            this.bit11 = bit11;
    }
    
    public String getBit12() {
            return bit12;
    }

    @XmlElement(name="bit12")
    public void setBit12(String bit12) {
            this.bit12 = bit12;
    }
    
    public String getBit48() {
            return bit48;
    }

    @XmlElement(name="bit48")
    public void setBit48(String bit48) {
            this.bit48 = bit48;
    }
    
    public String getBit62() {
            return bit62;
    }

    @XmlElement(name="bit62")
    public void setBit62(String bit62) {
            this.bit62 = bit62;
    }

}

