package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

@TableName("leg_contract_bcc_extra")
public class LegContractBccExtra extends Model<LegContractBccExtra>{

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId("ROW_ID")
    private int rowId;

    /**
     * 合同id
     */
    @TableField("CONTRACT_ID")
    private String contractId;

    /**
     * json字符串
     */
    @TableField("VALUE")
    private String value;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField("UPDATE_TIME")
    private Date updateTime;

    public int getRowId() {
        return rowId;
    }

    public void setRowId(int rowId) {
        this.rowId = rowId;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "LegContractBccExtra{" + "rowId=" + rowId + ", contractId=" + contractId + ", value=" + value
                + ", createTime=" + createTime + ", updateTime=" + updateTime + "}";
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }
}
