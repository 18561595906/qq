package com.haier.hop.ms.legcontract.domain;

import java.util.Date;
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
 * @since 2020-03-03
 */
@TableName("leg_search_contract_config")
public class LegSearchContractConfig extends Model<LegSearchContractConfig> {

    private static final long serialVersionUID = 1L;

    @TableField("row_id")
    private String rowId;
    @TableField("emp_sn")
    private String empSn;
    @TableField("emp_name")
    private String empName;
    @TableField("business_code")
    private String businessCode;
    private String compare;
    private String amount;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    @TableField("create_by")
    private String createBy;
    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;
    @TableField("update_by")
    private String updateBy;
    @TableField("contract_code")
    private String contractCode;
    /**
     * 付款金额条件
     */
    private String compare2;
    /**
     * 付款金额
     */
    private String amount2;
    /**
     * 合同类型：0 不限 1 外部合同 2 内部合同
     */
    @TableField("contract_inside_type")
    private String contractInsideType;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getEmpSn() {
        return empSn;
    }

    public void setEmpSn(String empSn) {
        this.empSn = empSn;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    public String getCompare() {
        return compare;
    }

    public void setCompare(String compare) {
        this.compare = compare;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public String getCompare2() {
        return compare2;
    }

    public void setCompare2(String compare2) {
        this.compare2 = compare2;
    }

    public String getAmount2() {
        return amount2;
    }

    public void setAmount2(String amount2) {
        this.amount2 = amount2;
    }

    public String getContractInsideType() {
        return contractInsideType;
    }

    public void setContractInsideType(String contractInsideType) {
        this.contractInsideType = contractInsideType;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegSearchContractConfig{" +
        "rowId=" + rowId +
        ", empSn=" + empSn +
        ", empName=" + empName +
        ", businessCode=" + businessCode +
        ", compare=" + compare +
        ", amount=" + amount +
        ", createTime=" + createTime +
        ", createBy=" + createBy +
        ", updateTime=" + updateTime +
        ", updateBy=" + updateBy +
        ", contractCode=" + contractCode +
        ", compare2=" + compare2 +
        ", amount2=" + amount2 +
        ", contractInsideType=" + contractInsideType +
        "}";
    }
}
