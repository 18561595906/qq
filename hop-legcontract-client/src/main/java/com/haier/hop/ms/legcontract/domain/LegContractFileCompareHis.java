package com.haier.hop.ms.legcontract.domain;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 文本比对文件历史表
 * </p>
 *
 * @author shiyingxin
 * @since 2019-11-28
 */
@TableName("leg_contract_file_compare_his")
public class LegContractFileCompareHis extends Model<LegContractFileCompareHis> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ROW_ID")
    private String rowId;
    /**
     * 文件附件表主键
     */
    @TableField("ATTACHMENT_RELA_ID")
    private String attachmentRelaId;
    /**
     * 流程id
     */
    @TableField("PROC_ID")
    private String procId;
    /**
     * 合同类型记录合同是标准还是非标或者是按标准编辑
     */
    @TableField("CONTRACT_TYPE")
    private String contractType;
    /**
     * 文件上传时间提交的实际
     */
    @TableField("FILE_UPLOAD_TIME")
    private String fileUploadTime;
    /**
     * 文件在ftp保存的地址
     */
    @TableField("FILE_URL")
    private String fileUrl;
    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private String createTime;
    /**
     * 创建人编码
     */
    @TableField("CREATE_BY_EMP_SN")
    private String createByEmpSn;
    /**
     * 创建人姓名
     */
    @TableField("CREATE_BY_EMP_NAME")
    private String createByEmpName;
    /**
     * 文件名称
     */
    @TableField("FILE_NAME")
    private String fileName;
    /**
     * 删除标志1正常-1删除
     */
    @TableField("DELFLAG")
    private BigDecimal delflag;
    /**
     * 文件类型
     */
    @TableField("FILE_TYPE")
    private String fileType;
    /**
     * 提次数交
     */
    @TableField("COMMIT_TYPE")
    private BigDecimal commitType;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getAttachmentRelaId() {
        return attachmentRelaId;
    }

    public void setAttachmentRelaId(String attachmentRelaId) {
        this.attachmentRelaId = attachmentRelaId;
    }

    public String getProcId() {
        return procId;
    }

    public void setProcId(String procId) {
        this.procId = procId;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getFileUploadTime() {
        return fileUploadTime;
    }

    public void setFileUploadTime(String fileUploadTime) {
        this.fileUploadTime = fileUploadTime;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateByEmpSn() {
        return createByEmpSn;
    }

    public void setCreateByEmpSn(String createByEmpSn) {
        this.createByEmpSn = createByEmpSn;
    }

    public String getCreateByEmpName() {
        return createByEmpName;
    }

    public void setCreateByEmpName(String createByEmpName) {
        this.createByEmpName = createByEmpName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public BigDecimal getDelflag() {
        return delflag;
    }

    public void setDelflag(BigDecimal delflag) {
        this.delflag = delflag;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public BigDecimal getCommitType() {
        return commitType;
    }

    public void setCommitType(BigDecimal commitType) {
        this.commitType = commitType;
    }

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegContractFileCompareHis{" +
        "rowId=" + rowId +
        ", attachmentRelaId=" + attachmentRelaId +
        ", procId=" + procId +
        ", contractType=" + contractType +
        ", fileUploadTime=" + fileUploadTime +
        ", fileUrl=" + fileUrl +
        ", createTime=" + createTime +
        ", createByEmpSn=" + createByEmpSn +
        ", createByEmpName=" + createByEmpName +
        ", fileName=" + fileName +
        ", delflag=" + delflag +
        ", fileType=" + fileType +
        ", commitType=" + commitType +
        "}";
    }
}
