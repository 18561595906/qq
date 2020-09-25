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
 * @since 2019-07-22
 */
@TableName("leg_contract_unamount")
public class LegContractUnamount extends Model<LegContractUnamount> {

    private static final long serialVersionUID = 1L;

    @TableId("ROW_ID")
    private BigDecimal rowId;
    @TableField("CONTRACT_CODE")
    private String contractCode;
    @TableField("CONTRACT_NAME")
    private String contractName;
    @TableField("CREATE_DATA")
    private Date createData;
    @TableField("CREATE_BY")
    private String createBy;


    public BigDecimal getRowId() {
        return rowId;
    }

    public void setRowId(BigDecimal rowId) {
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

    public Date getCreateData() {
        return createData;
    }

    public void setCreateData(Date createData) {
        this.createData = createData;
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
        return "LegContractUnamount{" +
        "rowId=" + rowId +
        ", contractCode=" + contractCode +
        ", contractName=" + contractName +
        ", createData=" + createData +
        ", createBy=" + createBy +
        "}";
    }
}
