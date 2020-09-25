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
 * 合同用印审核表
 * </p>
 *
 * @author shiyingxin
 * @since 2019-08-22
 */
@TableName("leg_contract_seal_approval")
public class LegContractSealApproval extends Model<LegContractSealApproval> {

    private static final long serialVersionUID = 1L;

    @TableId("row_id")
    private String rowId;
    /**
     * 公司编号
     */
    @TableField("company_code")
    private String companyCode;
    /**
     * 公司名称
     */
    @TableField("company_name")
    private String companyName;
    /**
     * 金额下限
     */
    @TableField("min_amount")
    private BigDecimal minAmount;
    /**
     * 金额上限
     */
    @TableField("max_amount")
    private BigDecimal maxAmount;
    /**
     * 用印复审人
     */
    @TableField("yyfs_user")
    private String yyfsUser;
    /**
     * 用印复审人名字
     */
    @TableField("yyfs_username")
    private String yyfsUsername;
    @TableField("create_time")
    private Date createTime;
    @TableField("create_by")
    private String createBy;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
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

    public String getYyfsUser() {
        return yyfsUser;
    }

    public void setYyfsUser(String yyfsUser) {
        this.yyfsUser = yyfsUser;
    }

    public String getYyfsUsername() {
        return yyfsUsername;
    }

    public void setYyfsUsername(String yyfsUsername) {
        this.yyfsUsername = yyfsUsername;
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

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegContractSealApproval{" +
        "rowId=" + rowId +
        ", companyCode=" + companyCode +
        ", companyName=" + companyName +
        ", minAmount=" + minAmount +
        ", maxAmount=" + maxAmount +
        ", yyfsUser=" + yyfsUser +
        ", yyfsUsername=" + yyfsUsername +
        ", createTime=" + createTime +
        ", createBy=" + createBy +
        "}";
    }
}
