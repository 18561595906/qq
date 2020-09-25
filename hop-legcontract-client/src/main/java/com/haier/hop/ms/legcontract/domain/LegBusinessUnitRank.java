package com.haier.hop.ms.legcontract.domain;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 业务单元对应的职级
 * </p>
 *
 * @author shiyingxin
 * @since 2019-11-29
 */
@TableName("leg_business_unit_rank")
public class LegBusinessUnitRank extends Model<LegBusinessUnitRank> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("row_id")
    private String rowId;
    /**
     * 业务单元层级
     */
    @TableField("business_unit_rate")
    private String businessUnitRate;
    /**
     * 业务单元编码
     */
    @TableField("business_unit_code")
    private String businessUnitCode;
    /**
     * 业务单元名称
     */
    @TableField("business_unit_name")
    private String businessUnitName;
    /**
     * 合同经营体长职级要求
     */
    @TableField("indep_manager_rate")
    private Integer indepManagerRate;
    /**
     * 合同公议人职级要求
     */
    @TableField("contract_dis_rate")
    private Integer contractDisRate;
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
     * 修改时间
     */
    @TableField("UPDATE_DATE")
    private Date updateDate;
    /**
     * 修改人
     */
    @TableField("UPDATE_BY")
    private String updateBy;


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

    public Integer getIndepManagerRate() {
        return indepManagerRate;
    }

    public void setIndepManagerRate(Integer indepManagerRate) {
        this.indepManagerRate = indepManagerRate;
    }

    public Integer getContractDisRate() {
        return contractDisRate;
    }

    public void setContractDisRate(Integer contractDisRate) {
        this.contractDisRate = contractDisRate;
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
        return "LegBusinessUnitRank{" +
        "rowId=" + rowId +
        ", businessUnitRate=" + businessUnitRate +
        ", businessUnitCode=" + businessUnitCode +
        ", businessUnitName=" + businessUnitName +
        ", indepManagerRate=" + indepManagerRate +
        ", contractDisRate=" + contractDisRate +
        ", createDate=" + createDate +
        ", createBy=" + createBy +
        ", updateDate=" + updateDate +
        ", updateBy=" + updateBy +
        "}";
    }
}
