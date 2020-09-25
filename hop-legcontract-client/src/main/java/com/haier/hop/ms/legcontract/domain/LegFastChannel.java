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
 * 快速通道表
 * </p>
 *
 * @author shiyingxin
 * @since 2019-11-20
 */
@TableName("leg_fast_channel")
public class LegFastChannel extends Model<LegFastChannel> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ROW_ID")
    private String rowId;
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
     * 最小金额
     */
    @TableField("MIN_AMOUNT")
    private BigDecimal minAmount;
    /**
     * 最大金额
     */
    @TableField("MAX_AMOUNT")
    private BigDecimal maxAmount;
    /**
     * 负责律师
     */
    @TableField("LAWYER")
    private String lawyer;
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
    /**
     * 业务单元编码
     */
    @TableField("BUSINESS_UNIT_ID")
    private String businessUnitId;
    @TableField("PROC_ID")
    private String procId;
    /**
     * 快速通道公议节点
     */
    @TableField("NODE_ID")
    private String nodeId;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
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

    public BigDecimal getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(BigDecimal minAmount) {
        this.minAmount = minAmount;
    }

    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    public String getLawyer() {
        return lawyer;
    }

    public void setLawyer(String lawyer) {
        this.lawyer = lawyer;
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

    public String getBusinessUnitId() {
        return businessUnitId;
    }

    public void setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

    public String getProcId() {
        return procId;
    }

    public void setProcId(String procId) {
        this.procId = procId;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegFastChannel{" +
        "rowId=" + rowId +
        ", businessUnitRate=" + businessUnitRate +
        ", businessUnitCode=" + businessUnitCode +
        ", businessUnitName=" + businessUnitName +
        ", contractCode=" + contractCode +
        ", contractName=" + contractName +
        ", minAmount=" + minAmount +
        ", maxAmount=" + maxAmount +
        ", lawyer=" + lawyer +
        ", createDate=" + createDate +
        ", createBy=" + createBy +
        ", updateDate=" + updateDate +
        ", updateBy=" + updateBy +
        ", businessUnitId=" + businessUnitId +
        ", procId=" + procId +
        ", nodeId=" + nodeId +
        "}";
    }
}
