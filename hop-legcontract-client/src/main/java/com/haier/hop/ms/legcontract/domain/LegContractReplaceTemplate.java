package com.haier.hop.ms.legcontract.domain;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 范本替换历史表
 * </p>
 *
 * @author shiyingxin
 * @since 2020-05-15
 */
@TableName("leg_contract_replace_template")
public class LegContractReplaceTemplate extends Model<LegContractReplaceTemplate> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableField("ROW_ID")
    private String rowId;
    /**
     * 替换之前的文件id
     */
    @TableField("BEFORE_FILE_ID")
    private String beforeFileId;
    /**
     * 替换之后的文件id
     */
    @TableField("AFTER_FILE_ID")
    private String afterFileId;
    /**
     * 替换之前的文件路径
     */
    @TableField("BEFORE_FILE_URL")
    private String beforeFileUrl;
    /**
     * 替换之后的文件路径
     */
    @TableField("AFTER_FILE_URL")
    private String afterFileUrl;
    /**
     * 上传时间
     */
    @TableField("UPLOAD_TIME")
    private String uploadTime;
    /**
     * 上传工号人
     */
    @TableField("UPLOAD_EMP_SN")
    private String uploadEmpSn;
    /**
     * 上传工姓名
     */
    @TableField("UPLOAD_EMP_NAME")
    private String uploadEmpName;
    /**
     * 1有效-1无效，防止多次替换的情况
     */
    @TableField("DELFLAG")
    private BigDecimal delflag;

    /**
     * 操作人角色：1律师；2流程
     */
    @TableField("UPLOAD_ROLE")
    private String uploadRole;

    /**
     * 律师替换原因
     */
    @TableField("UPLOAD_REASON")
    private String uploadReason;

    /**
     * 批次
     */
    @TableField("BATCH")
    private Integer batch;

    /**
     * 合同类型编码
     */
    @TableField("CONTRACT_TYPE")
    private String contractType;

    /**
     * 合同模板类型
     */
    @TableField("SPECIFIC_TYPE")
    private String specificType;

    public Integer getBatch() {
        return batch;
    }

    public void setBatch(Integer batch) {
        this.batch = batch;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getSpecificType() {
        return specificType;
    }

    public void setSpecificType(String specificType) {
        this.specificType = specificType;
    }

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getBeforeFileId() {
        return beforeFileId;
    }

    public void setBeforeFileId(String beforeFileId) {
        this.beforeFileId = beforeFileId;
    }

    public String getAfterFileId() {
        return afterFileId;
    }

    public void setAfterFileId(String afterFileId) {
        this.afterFileId = afterFileId;
    }

    public String getBeforeFileUrl() {
        return beforeFileUrl;
    }

    public void setBeforeFileUrl(String beforeFileUrl) {
        this.beforeFileUrl = beforeFileUrl;
    }

    public String getAfterFileUrl() {
        return afterFileUrl;
    }

    public void setAfterFileUrl(String afterFileUrl) {
        this.afterFileUrl = afterFileUrl;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getUploadEmpSn() {
        return uploadEmpSn;
    }

    public void setUploadEmpSn(String uploadEmpSn) {
        this.uploadEmpSn = uploadEmpSn;
    }

    public String getUploadEmpName() {
        return uploadEmpName;
    }

    public void setUploadEmpName(String uploadEmpName) {
        this.uploadEmpName = uploadEmpName;
    }

    public BigDecimal getDelflag() {
        return delflag;
    }

    public void setDelflag(BigDecimal delflag) {
        this.delflag = delflag;
    }

    public String getUploadRole() {
        return uploadRole;
    }

    public void setUploadRole(String uploadRole) {
        this.uploadRole = uploadRole;
    }

    public String getUploadReason() {
        return uploadReason;
    }

    public void setUploadReason(String uploadReason) {
        this.uploadReason = uploadReason;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegContractReplaceTemplate{" +
        "rowId=" + rowId +
        ", beforeFileId=" + beforeFileId +
        ", afterFileId=" + afterFileId +
        ", beforeFileUrl=" + beforeFileUrl +
        ", afterFileUrl=" + afterFileUrl +
        ", uploadTime=" + uploadTime +
        ", uploadEmpSn=" + uploadEmpSn +
        ", uploadEmpName=" + uploadEmpName +
        ", delflag=" + delflag +
        ", uploadRole="+uploadRole+
        ", uploadReason="+uploadReason+
        ", batch="+batch+
        ", contractType="+contractType+
        ", specificType="+specificType+
        "}";
    }
}
