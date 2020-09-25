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
 * 合同用印申请表
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-19
 */
@TableName("leg_contract_seal")
public class LegContractSeal extends Model<LegContractSeal> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ROW_ID")
    private String rowId;
    /**
     * 合同编号 
     */
    @TableField("CONTRACT_CODE")
    private String contractCode;
    /**
     * 合同名称
     */
    @TableField("CONTRACT_NAME")
    private String contractName;
    /**
     * 合同有效期开始
     */
    @TableField("CONTRACT_VALID_S")
    private Date contractValidS;
    /**
     * 合同有效期结束
     */
    @TableField("CONTRACT_VALID_E")
    private Date contractValidE;
    /**
     * 合同金额
     */
    @TableField("CONTRACT_AMOUNT")
    private String contractAmount;
    /**
     * 业务单元
     */
    @TableField("BIZ_CODE")
    private String bizCode;
    /**
     * 申请用印类别
     */
    @TableField("SEAL_TYPE")
    private BigDecimal sealType;
    /**
     * 印章ID
     */
    @TableField("SEAL_NO")
    private String sealNo;
    /**
     * 印章管理员ID
     */
    @TableField("SEAL_MANAGE_NO")
    private String sealManageNo;
    /**
     * 外部单位
     */
    @TableField("OUTSIDE_UNIT")
    private String outsideUnit;
    /**
     * 用印说明
     */
    @TableField("APPLY_DESC")
    private String applyDesc;
    /**
     * 申请日期
     */
    @TableField("APPLY_DATE")
    private Date applyDate;
    /**
     * 申请人
     */
    @TableField("APPLY_USER")
    private String applyUser;
    /**
     * 状态：0：暂存  1：提交
     */
    @TableField("SEAL_STATUS")
    private BigDecimal sealStatus;
    /**
     * 确认用印
     */
    @TableField("CONFIRM_SEAL")
    private BigDecimal confirmSeal;
    /**
     * 流程ID
     */
    @TableField("PROC_ID")
    private String procId;
    /**
     * 业务单元名称
     */
    @TableField("BIZ_NAME")
    private String bizName;
    /**
     * 申请人名称
     */
    @TableField("APPLY_USERNAME")
    private String applyUsername;
    /**
     * 终审领导人NO
     */
    @TableField("FINAL_LEADER_NO")
    private String finalLeaderNo;
    /**
     * 终审领导人名称
     */
    @TableField("FINAL_LEADER_NAME")
    private String finalLeaderName;
    /**
     * 内部合同是否有起止日期（1：有，2：没有）
     */
    @TableField("IS_BEGINTOEND")
    private BigDecimal isBegintoend;
    /**
     * 合同有效期（月单位）
     */
    @TableField("EFFECTIVE_DATE")
    private BigDecimal effectiveDate;
    /**
     * 用印文件类型
     */
    @TableField("FILE_TYPE")
    private String fileType;


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

    public Date getContractValidS() {
        return contractValidS;
    }

    public void setContractValidS(Date contractValidS) {
        this.contractValidS = contractValidS;
    }

    public Date getContractValidE() {
        return contractValidE;
    }

    public void setContractValidE(Date contractValidE) {
        this.contractValidE = contractValidE;
    }

    public String getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(String contractAmount) {
        this.contractAmount = contractAmount;
    }

    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    public BigDecimal getSealType() {
        return sealType;
    }

    public void setSealType(BigDecimal sealType) {
        this.sealType = sealType;
    }

    public String getSealNo() {
        return sealNo;
    }

    public void setSealNo(String sealNo) {
        this.sealNo = sealNo;
    }

    public String getSealManageNo() {
        return sealManageNo;
    }

    public void setSealManageNo(String sealManageNo) {
        this.sealManageNo = sealManageNo;
    }

    public String getOutsideUnit() {
        return outsideUnit;
    }

    public void setOutsideUnit(String outsideUnit) {
        this.outsideUnit = outsideUnit;
    }

    public String getApplyDesc() {
        return applyDesc;
    }

    public void setApplyDesc(String applyDesc) {
        this.applyDesc = applyDesc;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getApplyUser() {
        return applyUser;
    }

    public void setApplyUser(String applyUser) {
        this.applyUser = applyUser;
    }

    public BigDecimal getSealStatus() {
        return sealStatus;
    }

    public void setSealStatus(BigDecimal sealStatus) {
        this.sealStatus = sealStatus;
    }

    public BigDecimal getConfirmSeal() {
        return confirmSeal;
    }

    public void setConfirmSeal(BigDecimal confirmSeal) {
        this.confirmSeal = confirmSeal;
    }

    public String getProcId() {
        return procId;
    }

    public void setProcId(String procId) {
        this.procId = procId;
    }

    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName;
    }

    public String getApplyUsername() {
        return applyUsername;
    }

    public void setApplyUsername(String applyUsername) {
        this.applyUsername = applyUsername;
    }

    public String getFinalLeaderNo() {
        return finalLeaderNo;
    }

    public void setFinalLeaderNo(String finalLeaderNo) {
        this.finalLeaderNo = finalLeaderNo;
    }

    public String getFinalLeaderName() {
        return finalLeaderName;
    }

    public void setFinalLeaderName(String finalLeaderName) {
        this.finalLeaderName = finalLeaderName;
    }

    public BigDecimal getIsBegintoend() {
        return isBegintoend;
    }

    public void setIsBegintoend(BigDecimal isBegintoend) {
        this.isBegintoend = isBegintoend;
    }

    public BigDecimal getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(BigDecimal effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegContractSeal{" +
        "rowId=" + rowId +
        ", contractCode=" + contractCode +
        ", contractName=" + contractName +
        ", contractValidS=" + contractValidS +
        ", contractValidE=" + contractValidE +
        ", contractAmount=" + contractAmount +
        ", bizCode=" + bizCode +
        ", sealType=" + sealType +
        ", sealNo=" + sealNo +
        ", sealManageNo=" + sealManageNo +
        ", outsideUnit=" + outsideUnit +
        ", applyDesc=" + applyDesc +
        ", applyDate=" + applyDate +
        ", applyUser=" + applyUser +
        ", sealStatus=" + sealStatus +
        ", confirmSeal=" + confirmSeal +
        ", procId=" + procId +
        ", bizName=" + bizName +
        ", applyUsername=" + applyUsername +
        ", finalLeaderNo=" + finalLeaderNo +
        ", finalLeaderName=" + finalLeaderName +
        ", isBegintoend=" + isBegintoend +
        ", effectiveDate=" + effectiveDate +
        ", fileType=" + fileType +
        "}";
    }
}
