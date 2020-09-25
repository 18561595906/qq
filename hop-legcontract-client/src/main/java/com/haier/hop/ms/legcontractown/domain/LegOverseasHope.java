package com.haier.hop.ms.legcontractown.domain;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * HOPE合同号信息
 * </p>
 *
 * @author xuejinxin
 * @since 2020-04-16
 */
@TableName("leg_overseas_hope")
public class LegOverseasHope extends Model<LegOverseasHope> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableField("ROW_ID")
    private String rowId;
    /**
     * 创建时间
     */
    @TableField("CREATE_DATE")
    private Date createDate;
    /**
     * SAP的合同号
     */
    @TableField("SAP_NO")
    private String sapNo;
    /**
     * sold to 客户
     */
    @TableField("SOLD_CUST")
    private String soldCust;
    /**
     * 产品
     */
    @TableField("PRODUCTS")
    private String products;
    /**
     * 成交方式
     */
    @TableField("DEAL_TYPE")
    private String dealType;
    /**
     * 付款条款
     */
    @TableField("PAY_CLAUSE")
    private String payClause;
    /**
     * 币种
     */
    @TableField("CURRENCY")
    private String currency;
    /**
     * 其他
     */
    @TableField("OTHER")
    private String other;
    /**
     * 海外合同编号
     */
    @TableField("CONT_NO")
    private String contNo;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getSapNo() {
        return sapNo;
    }

    public void setSapNo(String sapNo) {
        this.sapNo = sapNo;
    }

    public String getSoldCust() {
        return soldCust;
    }

    public void setSoldCust(String soldCust) {
        this.soldCust = soldCust;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType;
    }

    public String getPayClause() {
        return payClause;
    }

    public void setPayClause(String payClause) {
        this.payClause = payClause;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getContNo() {
        return contNo;
    }

    public void setContNo(String contNo) {
        this.contNo = contNo;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegOverseasHope{" +
        "rowId=" + rowId +
        ", createDate=" + createDate +
        ", sapNo=" + sapNo +
        ", soldCust=" + soldCust +
        ", products=" + products +
        ", dealType=" + dealType +
        ", payClause=" + payClause +
        ", currency=" + currency +
        ", other=" + other +
        ", contNo=" + contNo +
        "}";
    }
}
