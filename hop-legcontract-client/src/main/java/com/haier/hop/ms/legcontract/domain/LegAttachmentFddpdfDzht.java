package com.haier.hop.ms.legcontract.domain;

import java.math.BigDecimal;
import java.util.Date;
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
 * @since 2020-04-13
 */
@TableName("leg_attachment_fddpdf_dzht")
public class LegAttachmentFddpdfDzht extends Model<LegAttachmentFddpdfDzht> {

    private static final long serialVersionUID = 1L;

    @TableField("row_id")
    private BigDecimal rowId;
    @TableField("att_name")
    private String attName;
    @TableField("file_name")
    private String fileName;
    @TableField("file_type")
    private String fileType;
    @TableField("file_url")
    private String fileUrl;
    @TableField("file_size")
    private Integer fileSize;
    @TableField("uplod_date")
    private Date uplodDate;
    @TableField("rela_id")
    private Integer relaId;
    @TableField("att_type")
    private String attType;
    @TableField("att_flage")
    private Integer attFlage;
    @TableField("rela_runk")
    private Integer relaRunk;
    @TableField("active_flage")
    private BigDecimal activeFlage;
    @TableField("att_version")
    private BigDecimal attVersion;
    private String suffix;
    @TableField("rela_id_back")
    private Integer relaIdBack;
    @TableField("att_public")
    private Integer attPublic;
    @TableField("proc_id")
    private String procId;
    @TableField("create_date")
    private Date createDate;
    @TableField("contract_no")
    private String contractNo;
    @TableField("file_id_back")
    private BigDecimal fileIdBack;
    @TableField("down_type")
    private String downType;


    public BigDecimal getRowId() {
        return rowId;
    }

    public void setRowId(BigDecimal rowId) {
        this.rowId = rowId;
    }

    public String getAttName() {
        return attName;
    }

    public void setAttName(String attName) {
        this.attName = attName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public Date getUplodDate() {
        return uplodDate;
    }

    public void setUplodDate(Date uplodDate) {
        this.uplodDate = uplodDate;
    }

    public Integer getRelaId() {
        return relaId;
    }

    public void setRelaId(Integer relaId) {
        this.relaId = relaId;
    }

    public String getAttType() {
        return attType;
    }

    public void setAttType(String attType) {
        this.attType = attType;
    }

    public Integer getAttFlage() {
        return attFlage;
    }

    public void setAttFlage(Integer attFlage) {
        this.attFlage = attFlage;
    }

    public Integer getRelaRunk() {
        return relaRunk;
    }

    public void setRelaRunk(Integer relaRunk) {
        this.relaRunk = relaRunk;
    }

    public BigDecimal getActiveFlage() {
        return activeFlage;
    }

    public void setActiveFlage(BigDecimal activeFlage) {
        this.activeFlage = activeFlage;
    }

    public BigDecimal getAttVersion() {
        return attVersion;
    }

    public void setAttVersion(BigDecimal attVersion) {
        this.attVersion = attVersion;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Integer getRelaIdBack() {
        return relaIdBack;
    }

    public void setRelaIdBack(Integer relaIdBack) {
        this.relaIdBack = relaIdBack;
    }

    public Integer getAttPublic() {
        return attPublic;
    }

    public void setAttPublic(Integer attPublic) {
        this.attPublic = attPublic;
    }

    public String getProcId() {
        return procId;
    }

    public void setProcId(String procId) {
        this.procId = procId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public BigDecimal getFileIdBack() {
        return fileIdBack;
    }

    public void setFileIdBack(BigDecimal fileIdBack) {
        this.fileIdBack = fileIdBack;
    }

    public String getDownType() {
        return downType;
    }

    public void setDownType(String downType) {
        this.downType = downType;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegAttachmentFddpdfDzht{" +
        "rowId=" + rowId +
        ", attName=" + attName +
        ", fileName=" + fileName +
        ", fileType=" + fileType +
        ", fileUrl=" + fileUrl +
        ", fileSize=" + fileSize +
        ", uplodDate=" + uplodDate +
        ", relaId=" + relaId +
        ", attType=" + attType +
        ", attFlage=" + attFlage +
        ", relaRunk=" + relaRunk +
        ", activeFlage=" + activeFlage +
        ", attVersion=" + attVersion +
        ", suffix=" + suffix +
        ", relaIdBack=" + relaIdBack +
        ", attPublic=" + attPublic +
        ", procId=" + procId +
        ", createDate=" + createDate +
        ", contractNo=" + contractNo +
        ", fileIdBack=" + fileIdBack +
        ", downType=" + downType +
        "}";
    }
}
