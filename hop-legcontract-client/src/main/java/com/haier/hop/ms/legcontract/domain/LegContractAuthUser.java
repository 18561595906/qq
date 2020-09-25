package com.haier.hop.ms.legcontract.domain;

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
 * @author lixianhua
 * @since 2019-09-23
 */
@TableName("leg_contract_auth_user")
public class LegContractAuthUser extends Model<LegContractAuthUser> {

    private static final long serialVersionUID = 1L;

    @TableId("ROW_ID")
    private String rowId;
    @TableField("USER_CODE")
    private String userCode;
    @TableField("USER_NAME")
    private String userName;
    @TableField("USER_TYPE")
    private String userType;
    @TableField("USER_ORDER")
    private String userOrder;
    @TableField("COMPANY_CODE")
    private String companyCode;
    @TableField("COMPANY_NAME")
    private String companyName;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserOrder() {
        return userOrder;
    }

    public void setUserOrder(String userOrder) {
        this.userOrder = userOrder;
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

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegContractAuthUser{" +
        "rowId=" + rowId +
        ", userCode=" + userCode +
        ", userName=" + userName +
        ", userType=" + userType +
        ", userOrder=" + userOrder +
        ", companyCode=" + companyCode +
        ", companyName=" + companyName +
        "}";
    }
}
