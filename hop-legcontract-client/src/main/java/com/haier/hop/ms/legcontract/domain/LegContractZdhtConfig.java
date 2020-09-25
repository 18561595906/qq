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
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-07-23
 */
@TableName("leg_contract_zdht_config")
public class LegContractZdhtConfig extends Model<LegContractZdhtConfig> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ROW_ID")
    private String rowId;
    /**
     * 业务单元编号
     */
    @TableField("BIZ_CODE")
    private String bizCode;
    /**
     * 业务单元名称
     */
    @TableField("BIZ_NAME")
    private String bizName;
    /**
     * 合同类型编号
     */
    @TableField("CONTRACT_CODE")
    private String contractCode;
    /**
     * 合同类型名称
     */
    @TableField("CONTRACT_NAME")
    private String contractName;
    /**
     * 默认大于该金额，单位：元
     */
    @TableField("AMOUNT")
    private BigDecimal amount;
    /**
     * 签约方编号
     */
    @TableField("PARTNERS_NO")
    private String partnersNo;
    /**
     * 签约方名称
     */
    @TableField("PARTNERS_NAME")
    private String partnersName;
    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private Date createTime;
    /**
     * 创建人
     */
    @TableField("CREATE_BY")
    private String createBy;
    /**
     * 更新时间
     */
    @TableField("UPDATE_TMIE")
    private Date updateTmie;
    /**
     * 更新人
     */
    @TableField("UPDATE_BY")
    private String updateBy;
    /**
     * 0:禁止重大合同；1允许重大合同
     */
    @TableField("IS_ALLOW")
    private String isAllow;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName;
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getPartnersNo() {
        return partnersNo;
    }

    public void setPartnersNo(String partnersNo) {
        this.partnersNo = partnersNo;
    }

    public String getPartnersName() {
        return partnersName;
    }

    public void setPartnersName(String partnersName) {
        this.partnersName = partnersName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTmie() {
        return updateTmie;
    }

    public void setUpdateTmie(Date updateTmie) {
        this.updateTmie = updateTmie;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getIsAllow() {
        return isAllow;
    }

    public void setIsAllow(String isAllow) {
        this.isAllow = isAllow;
    }

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegContractZdhtConfig{" +
        "rowId=" + rowId +
        ", bizCode=" + bizCode +
        ", bizName=" + bizName +
        ", contractCode=" + contractCode +
        ", contractName=" + contractName +
        ", amount=" + amount +
        ", partnersNo=" + partnersNo +
        ", partnersName=" + partnersName +
        ", createTime=" + createTime +
        ", createBy=" + createBy +
        ", updateTmie=" + updateTmie +
        ", updateBy=" + updateBy +
        ", isAllow=" + isAllow +
        "}";
    }
}
