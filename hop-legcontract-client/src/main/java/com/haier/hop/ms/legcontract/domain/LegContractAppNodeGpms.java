package com.haier.hop.ms.legcontract.domain;

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
 * @since 2020-02-21
 */
@TableName("leg_contract_app_node_gpms")
public class LegContractAppNodeGpms extends Model<LegContractAppNodeGpms> {

    private static final long serialVersionUID = 1L;

    @TableId("row_id")
    private String rowId;
    /**
     * 合同一级分类编码
     */
    @TableField("contract_type1_sn")
    private String contractType1Sn;
    /**
     * 合同一级分类名称
     */
    @TableField("contract_type1")
    private String contractType1;
    /**
     * 合同二级分类编码
     */
    @TableField("contract_type2_sn")
    private String contractType2Sn;
    /**
     * 合同二级分类名称
     */
    @TableField("contract_type2")
    private String contractType2;
    /**
     * 合同三级分类编码
     */
    @TableField("contract_code")
    private String contractCode;
    /**
     * 合同三级分类名称
     */
    @TableField("contract_name")
    private String contractName;
    /**
     * 角色编码
     */
    @TableField("role_code")
    private String roleCode;
    /**
     * 角色名称
     */
    @TableField("role_name")
    private String roleName;
    /**
     * 创建时间
     */
    @TableField("create_date")
    private Date createDate;
    /**
     * 创建人
     */
    @TableField("create_by")
    private String createBy;
    /**
     * 修改时间
     */
    @TableField("update_date")
    private Date updateDate;
    /**
     * 修改人
     */
    @TableField("update_by")
    private String updateBy;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getContractType1Sn() {
        return contractType1Sn;
    }

    public void setContractType1Sn(String contractType1Sn) {
        this.contractType1Sn = contractType1Sn;
    }

    public String getContractType1() {
        return contractType1;
    }

    public void setContractType1(String contractType1) {
        this.contractType1 = contractType1;
    }

    public String getContractType2Sn() {
        return contractType2Sn;
    }

    public void setContractType2Sn(String contractType2Sn) {
        this.contractType2Sn = contractType2Sn;
    }

    public String getContractType2() {
        return contractType2;
    }

    public void setContractType2(String contractType2) {
        this.contractType2 = contractType2;
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

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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
        return "LegContractAppNodeGpms{" +
        "rowId=" + rowId +
        ", contractType1Sn=" + contractType1Sn +
        ", contractType1=" + contractType1 +
        ", contractType2Sn=" + contractType2Sn +
        ", contractType2=" + contractType2 +
        ", contractCode=" + contractCode +
        ", contractName=" + contractName +
        ", roleCode=" + roleCode +
        ", roleName=" + roleName +
        ", createDate=" + createDate +
        ", createBy=" + createBy +
        ", updateDate=" + updateDate +
        ", updateBy=" + updateBy +
        "}";
    }
}
