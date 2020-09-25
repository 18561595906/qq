package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * sap系统中供应商对应关联公司的余额表
 */
@TableName("leg_sap_balance")
public class LegSapBalance extends Model<LegSapBalance> {

    private static final long serialVersionUID = 1L;

    //主键id
    @TableId("ROW_ID")
    private String rowId;

    //年份
    @TableField("AC_YEAR")
    private String acYear;

    //月
    @TableField("AC_MONTH")
    private String acMonth;

    //日
    @TableField("AC_DATE")
    private String acDate;

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

    //关联公司编码
    @TableField("COMPANY_CODE")
    private String companyCode;

    //关联公司名称
    @TableField("COMPANY_NAME")
    private String companyName;

    //币种
    @TableField("CURRENCY")
    private String currency;

    //余额，负数表示未付；正数表示预存
    @TableField("BALANCE")
    private String balance;

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getAcYear() {
        return acYear;
    }

    public void setAcYear(String acYear) {
        this.acYear = acYear;
    }

    public String getAcMonth() {
        return acMonth;
    }

    public void setAcMonth(String acMonth) {
        this.acMonth = acMonth;
    }

    public String getAcDate() {
        return acDate;
    }

    public void setAcDate(String acDate) {
        this.acDate = acDate;
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

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "LegSapBalance{" + "rowId=" + rowId + ", acYear=" + acYear + ", acMonth=" + acMonth
                + ", acDate=" + acDate + ", vendorCode=" + vendorCode +
                ", vendorName=" + vendorName +
                ", itemCode=" + itemCode +
                ", itemName=" + itemName +
                ", companyCode=" + companyCode +
                ", companyName=" + companyName +
                ", currency=" + currency +
                ", balance=" + balance + "}";
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }
}
