package com.haier.hop.ms.legcontract.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 最终业务用户表
 * </p>
 *
 * @author shiyingxin
 * @since 2019-07-24
 */
@TableName("leg_final_busness_user")
public class LegFinalBusnessUser extends Model<LegFinalBusnessUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ROW_ID")
    private BigDecimal rowId;
    /**
     * 业务单元层级
     */
    @TableField("BUSINESS_UNIT_RATE")
    private String businessUnitRate;
    /**
     * 业务单元编码
     */
    @TableField("BUSINESS_UNIT_CODE")
    private String businessUnitCode;
    /**
     * 业务单元名称
     */
    @TableField("BUSINESS_UNIT_NAME")
    private String businessUnitName;
    /**
     * 签约主体
     */
    @TableField("CONTRACT_PARTNER")
    private String contractPartner;
    /**
     * 签约主体编码
     */
    @TableField("CONTRACT_PARTNER_SN")
    private String contractPartnerSn;
    /**
     * 一级合同类别编码
     */
    @TableField("CONTRACT_TYPE1_SN")
    private String contractType1Sn;
    /**
     * 一级合同类别
     */
    @TableField("CONTRACT_TYPE1")
    private String contractType1;
    /**
     * 二级合同类别编码
     */
    @TableField("CONTRACT_TYPE2_SN")
    private String contractType2Sn;
    /**
     * 二级合同类别
     */
    @TableField("CONTRACT_TYPE2")
    private String contractType2;
    /**
     * 合同编码
     */
    @TableField("CONTRACT_CODE")
    private String contractCode;
    /**
     * 合同名称
     */
    @TableField("CONTRACT_NAME")
    private String contractName;
    /**
     * 向下合同金额
     */
    @TableField("CONTRACT_AMOUNT_DOWN")
    private BigDecimal contractAmountDown;
    /**
     * 向上合同金额
     */
    @TableField("CONTRACT_AMOUNT_UP")
    private BigDecimal contractAmountUp;
    /**
     * (终审)业务负责人
     */
    @TableField("BUSINESS_OWNER")
    private String businessOwner;
    /**
     * (终审)业务负责人工号
     */
    @TableField("BUSINESS_OWNER_SN")
    private String businessOwnerSn;
    /**
     * 创建时间
     */
    @TableField("CREATE_DATE")
    private Date createDate;
    /**
     * 创建人
     */
    @TableField("CREATE_BY")
    private String createBy;
    /**
     * 最后修改时间
     */
    @TableField("UPDATE_DATE")
    private Date updateDate;
    /**
     * 最后修改人
     */
    @TableField("UPDATE_BY")
    private String updateBy;


    public BigDecimal getRowId() {
        return rowId;
    }

    public void setRowId(BigDecimal rowId) {
        this.rowId = rowId;
    }

    public String getBusinessUnitRate() {
        return businessUnitRate;
    }

    public void setBusinessUnitRate(String businessUnitRate) {
        this.businessUnitRate = businessUnitRate;
    }

    public String getBusinessUnitCode() {
        return businessUnitCode;
    }

    public void setBusinessUnitCode(String businessUnitCode) {
        this.businessUnitCode = businessUnitCode;
    }

    public String getBusinessUnitName() {
        return businessUnitName;
    }

    public void setBusinessUnitName(String businessUnitName) {
        this.businessUnitName = businessUnitName;
    }

    public String getContractPartner() {
        return contractPartner;
    }

    public void setContractPartner(String contractPartner) {
        this.contractPartner = contractPartner;
    }

    public String getContractPartnerSn() {
        return contractPartnerSn;
    }

    public void setContractPartnerSn(String contractPartnerSn) {
        this.contractPartnerSn = contractPartnerSn;
    }

    public String getContractType1Sn() {
        return contractType1Sn;
    }

    public void setContractType1Sn(String contractType1Sn) {
        this.contractType1Sn = contractType1Sn;
    }

    public String getContractType1() {
        return contractType1;
    }

    public void setContractType1(String contractType1) {
        this.contractType1 = contractType1;
    }

    public String getContractType2Sn() {
        return contractType2Sn;
    }

    public void setContractType2Sn(String contractType2Sn) {
        this.contractType2Sn = contractType2Sn;
    }

    public String getContractType2() {
        return contractType2;
    }

    public void setContractType2(String contractType2) {
        this.contractType2 = contractType2;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }


    public BigDecimal getContractAmountDown() {
        return contractAmountDown;
    }

    public void setContractAmountDown(BigDecimal contractAmountDown) {
        this.contractAmountDown = contractAmountDown;
    }

    public BigDecimal getContractAmountUp() {
        return contractAmountUp;
    }

    public void setContractAmountUp(BigDecimal contractAmountUp) {
        this.contractAmountUp = contractAmountUp;
    }

    public String getBusinessOwner() {
        return businessOwner;
    }

    public void setBusinessOwner(String businessOwner) {
        this.businessOwner = businessOwner;
    }

    public String getBusinessOwnerSn() {
        return businessOwnerSn;
    }

    public void setBusinessOwnerSn(String businessOwnerSn) {
        this.businessOwnerSn = businessOwnerSn;
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

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegFinalBusnessUser{" +
        "rowId=" + rowId +
        ", businessUnitRate=" + businessUnitRate +
        ", businessUnitCode=" + businessUnitCode +
        ", businessUnitName=" + businessUnitName +
        ", contractPartner=" + contractPartner +
        ", contractPartnerSn=" + contractPartnerSn +
        ", contractType1Sn=" + contractType1Sn +
        ", contractType1=" + contractType1 +
        ", contractType2Sn=" + contractType2Sn +
        ", contractType2=" + contractType2 +
        ", contractCode=" + contractCode +
        ", contractName=" + contractName +
        ", contractAmountDown=" + contractAmountDown +
        ", contractAmountUp=" + contractAmountUp +
        ", businessOwner=" + businessOwner +
        ", businessOwnerSn=" + businessOwnerSn +
        ", createDate=" + createDate +
        ", createBy=" + createBy +
        ", updateDate=" + updateDate +
        ", updateBy=" + updateBy +
        "}";
    }
}
