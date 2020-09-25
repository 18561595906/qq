package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * SAP付款明细表对应的实体
 */
@TableName("leg_sap_pay_detail")
public class LegSapPayDetail extends Model<LegSapPayDetail> {

    private static final long serialVersionUID = 1L;

    //主键id
    @TableId("ROW_ID")
    private String rowId;

    //会计凭证编码-与AC_YEAR、COMPANY_CODE三个字段作为数据唯一判断标识
    @TableField("BELNR")
    private String belnr;

    //会计年度
    @TableField("AC_YEAR")
    private String acYear;

    //供应商编码
    @TableField("VENDOR_CODE")
    private String vendorCode;

    //供应商名称
    @TableField("VENDOR_NAME")
    private String vendorName;

    //往来科目编码
    @TableField("ITEM_CODE")
    private String itemCode;

    //往来科目描述
    @TableField("ITEM_NAME")
    private String itemName;

    //付款日期
    @TableField("PAY_DATE")
    private Date payDate;

    //付款日期字符串形式
    private String payDateStr;

    //关联公司编码
    @TableField("COMPANY_CODE")
    private String companyCode;

    //关联公司名称
    @TableField("COMPANY_NAME")
    private String companyName;

    //币种
    @TableField("CURRENCY")
    private String currency;

    //付款金额
    @TableField("AMOUNT")
    private Double amount;

    //付款标识：S已付款，H应付款
    @TableField("TYPE")
    private String type;

    //备注-凭证摘要
    @TableField("REMARK")
    private String remark;

    //创建日期
    @TableField("CREATE_TIME")
    private Date createTime;

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getBelnr() {
        return belnr;
    }

    public void setBelnr(String belnr) {
        this.belnr = belnr;
    }

    public String getAcYear() {
        return acYear;
    }

    public void setAcYear(String acYear) {
        this.acYear = acYear;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPayDateStr() {
        return payDateStr;
    }

    public void setPayDateStr(String payDateStr) {
        this.payDateStr = payDateStr;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "LegSapPayDetail{" + "rowId=" + rowId + ", belnr=" + belnr + ", acYear=" + acYear
                + ", vendorCode=" + vendorCode + ", vendorName=" + vendorName +
                ", itemCode=" + itemCode +
                ", itemName=" + itemName +
                ", payDate=" + payDate +
                ", payDateStr=" + payDateStr +
                ", companyCode=" + companyCode +
                ", companyName=" + companyName +
                ", currency=" + currency +
                ", amount=" + amount +
                ", type=" + type +
                ", remark=" + remark +
                ", createTime="+ createTime +
                "}";
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }
}
