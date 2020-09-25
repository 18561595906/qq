package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 新内部流程图进入权限
 * </p>
 *
 * @author liugan
 * @since 2019-10-10
 */
@TableName("leg_company_auth_inside")
public class LegCompanyAuthInside extends Model<LegCompanyAuthInside> {

    private static final long serialVersionUID = 1L;

    @TableId("ROW_ID")
    private String rowId;
    /**
     * 公司编码
     */
    @TableField("COMPANY_CODE")
    private String companyCode;
    /**
     * 公司名称
     */
    @TableField("COMPANY_NAME")
    private String companyName;
    /**
     * 公司所属类型:A.1169 B.690 C.海创汇
     */
    @TableField("COMPANY_TYPE")
    private String companyType;
    @TableField("COMPANY_NEW_TYPE")
    private String companyNewType;


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

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getCompanyNewType() {
        return companyNewType;
    }

    public void setCompanyNewType(String companyNewType) {
        this.companyNewType = companyNewType;
    }

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegCompanyAuthInside{" +
        "rowId=" + rowId +
        ", companyCode=" + companyCode +
        ", companyName=" + companyName +
        ", companyType=" + companyType +
        ", companyNewType=" + companyNewType +
        "}";
    }
}
