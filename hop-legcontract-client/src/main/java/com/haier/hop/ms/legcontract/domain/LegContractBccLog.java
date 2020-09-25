package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author mbx
 * @describe 存放bcc接口的日志
 */
@TableName("leg_contract_bcc_log")
public class LegContractBccLog extends Model<LegContractBccLog> {

    private static final long serialVersionUID = 1L;

    @TableId("ROW_ID")
    private int rowId;

    /**
     * 合同id
     */
    @TableField("CONTRACT_ID")
    private String contractId;

    /**
     * JSON值
     */
    @TableField("JSON_VALUE")
    private String jsonValue;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private Date createTime;

    /**
     * BBC返回结果
     */
    @TableField("REPRESENT")
    private String represent;

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

    public String getJsonValue() {
        return jsonValue;
    }

    public void setJsonValue(String jsonValue) {
        this.jsonValue = jsonValue;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRepresent() {
        return represent;
    }

    public void setRepresent(String represent) {
        this.represent = represent;
    }

    @Override
    public String toString() {
        return "LegContractBccLog{" +
                "rowId=" + rowId +
                ", contractId=" + contractId +
                ", jsonValue=" + jsonValue +
                ", createTime=" + createTime +
                ", represent=" + represent +
                "}";
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }
}
