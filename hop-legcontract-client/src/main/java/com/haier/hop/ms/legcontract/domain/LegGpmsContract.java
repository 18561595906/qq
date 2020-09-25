package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 商业政策信息合同接口表
 * </p>
 *
 * @author shiyingxin
 * @since 2020-02-21
 */
@TableName("leg_gpms_contract")
public class LegGpmsContract extends Model<LegGpmsContract> {

    private static final long serialVersionUID = 1L;

    @TableId("row_id")
    private String rowId;
    /**
     * 合同ID
     */
    @TableField("contract_id")
    private String contractId;
    /**
     * 合同信息
     */
    @TableField("contract_msg")
    private String contractMsg;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getContractMsg() {
        return contractMsg;
    }

    public void setContractMsg(String contractMsg) {
        this.contractMsg = contractMsg;
    }

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegGpmsContract{" +
        "rowId=" + rowId +
        ", contractId=" + contractId +
        ", contractMsg=" + contractMsg +
        "}";
    }
}
