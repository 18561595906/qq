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
@TableName("leg_contract_company_config")
public class LegContractCompanyConfig extends Model<LegContractCompanyConfig> {

    private static final long serialVersionUID = 1L;

    @TableField("row_id")
    private String rowId;
    @TableField("company_code")
    private String companyCode;
    @TableField("company_name")
    private String companyName;
    @TableField("emp_sn")
    private String empSn;


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

    public String getEmpSn() {
        return empSn;
    }

    public void setEmpSn(String empSn) {
        this.empSn = empSn;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegContractCompanyConfig{" +
        "rowId=" + rowId +
        ", companyCode=" + companyCode +
        ", companyName=" + companyName +
        ", empSn=" + empSn +
        "}";
    }
}
