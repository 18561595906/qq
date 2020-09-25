package com.haier.hop.ms.legcontract.domain;

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
 * @since 2020-03-04
 */
@TableName("leg_record_form")
public class LegRecordForm extends Model<LegRecordForm> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableField("row_id")
    private String rowId;
    /**
     * 合同名称
     */
    @TableField("contract_code")
    private String contractCode;
    /**
     * 合同编码
     */
    @TableField("contract_name")
    private String contractName;
    /**
     * 人员编码
     */
    @TableField("personnel_number")
    private String personnelNumber;
    /**
     * 人员名称
     */
    @TableField("personnel_name")
    private String personnelName;
    /**
     * 标志
     */
    private String state;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
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

    public String getPersonnelNumber() {
        return personnelNumber;
    }

    public void setPersonnelNumber(String personnelNumber) {
        this.personnelNumber = personnelNumber;
    }

    public String getPersonnelName() {
        return personnelName;
    }

    public void setPersonnelName(String personnelName) {
        this.personnelName = personnelName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegRecordForm{" +
        "rowId=" + rowId +
        ", contractCode=" + contractCode +
        ", contractName=" + contractName +
        ", personnelNumber=" + personnelNumber +
        ", personnelName=" + personnelName +
        ", state=" + state +
        "}";
    }
}
