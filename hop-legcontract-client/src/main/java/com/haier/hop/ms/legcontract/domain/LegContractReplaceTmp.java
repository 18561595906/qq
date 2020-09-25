package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * 流程范本上传文件对应关系
 */
@TableName("leg_contract_replace_tmp")
public class LegContractReplaceTmp extends Model<LegContractReplaceTmp>{


    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ROW_ID")
    private String rowId;

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
     * 流程id
     */
    @TableField("PROC_ID")
    private String procId;

    /**
     * 合同模板类型
     */
    @TableField("SPECIFIC_TYPE")
    private String specificType;

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
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

    public String getProcId() {
        return procId;
    }

    public void setProcId(String procId) {
        this.procId = procId;
    }

    public String getSpecificType() {
        return specificType;
    }

    public void setSpecificType(String specificType) {
        this.specificType = specificType;
    }

    @Override
    public String toString() {
        return "LegContractReplaceTmp [rowId=" + rowId + ", procId=" + procId + ", beforeFileUrl=" + beforeFileUrl + ", afterFileUrl="
                + afterFileUrl + ", uploadTime=" + uploadTime + ", uploadEmpSn=" + uploadEmpSn + ", uploadEmpName=" + uploadEmpName
                + ", specificType=" + specificType + "]";
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }
}
