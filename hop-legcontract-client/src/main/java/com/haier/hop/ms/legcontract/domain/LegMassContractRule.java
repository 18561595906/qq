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
 * 批量合同选择规则
 * </p>
 *
 * @author shiyingxin
 * @since 2019-07-22
 */
@TableName("leg_mass_contract_rule")
public class LegMassContractRule extends Model<LegMassContractRule> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ROW_ID")
    private BigDecimal rowId;
    /**
     * 业务单元编码
     */
    @TableField("BUSUNIT_CODE")
    private String busunitCode;
    /**
     * 业务单元名称
     */
    @TableField("BUSUNIT_NAME")
    private String busunitName;
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
     * 非标/标准
     */
    @TableField("CONTRACT_TYPE")
    private String contractType;
    /**
     * 状态 1有效 0无效
     */
    @TableField("ACTIVE_FLAG")
    private String activeFlag;
    /**
     * 创建人姓名
     */
    @TableField("CREATED_BY")
    private String createdBy;
    /**
     * 创建人工号
     */
    @TableField("CREATED_BYNO")
    private String createdByno;
    /**
     * 创建时间
     */
    @TableField("CREATED_DATE")
    private Date createdDate;
    /**
     * 金额类型
     */
    @TableField("PAY_TYPE")
    private String payType;
    /**
     * 金额类型名称
     */
    @TableField("PAY_TYPE_NAME")
    private String payTypeName;


    public BigDecimal getRowId() {
        return rowId;
    }

    public void setRowId(BigDecimal rowId) {
        this.rowId = rowId;
    }

    public String getBusunitCode() {
        return busunitCode;
    }

    public void setBusunitCode(String busunitCode) {
        this.busunitCode = busunitCode;
    }

    public String getBusunitName() {
        return busunitName;
    }

    public void setBusunitName(String busunitName) {
        this.busunitName = busunitName;
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

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(String activeFlag) {
        this.activeFlag = activeFlag;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedByno() {
        return createdByno;
    }

    public void setCreatedByno(String createdByno) {
        this.createdByno = createdByno;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayTypeName() {
        return payTypeName;
    }

    public void setPayTypeName(String payTypeName) {
        this.payTypeName = payTypeName;
    }

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegMassContractRule{" +
        "rowId=" + rowId +
        ", busunitCode=" + busunitCode +
        ", busunitName=" + busunitName +
        ", contractCode=" + contractCode +
        ", contractName=" + contractName +
        ", contractType=" + contractType +
        ", activeFlag=" + activeFlag +
        ", createdBy=" + createdBy +
        ", createdByno=" + createdByno +
        ", createdDate=" + createdDate +
        ", payType=" + payType +
        ", payTypeName=" + payTypeName +
        "}";
    }
}
