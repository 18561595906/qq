package com.haier.hop.ms.legcontract.domain;

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
 * @author wushilei
 * @since 2020-06-18
 */
@TableName("leg_dzqz_sync")
public class LegDzqzSync extends Model<LegDzqzSync> {

    private static final long serialVersionUID = 1L;

    @TableField("row_id")
    private String rowId;
    /**
     * 电子签章系统单号
     */
    @TableField("signature_id")
    private String signatureId;
    /**
     * 外围系统单据号
     */
    @TableField("ht_code")
    private String htCode;
    /**
     * 文档类型 40:统仓统配合同
     */
    @TableField("doc_type")
    private int docType;
    /**
     * 签章状态 1-发送成功，2-单方签署完成，3-合同完成，4-合同撤销，5-合同拒签，6-合同过期
     */
    private int start;
    /**
     * 状态更新日期
     */
    @TableField("create_date")
    private String createDate;
    /**
     * 记录创建时间
     */
    @TableField("create_date_time")
    private Date createDateTime;
    /**
     * 经办人名称
     */
    @TableField("user_name")
    private String userName;
    /**
     * 合同下载地址
     */
    @TableField("doc_url")
    private String docUrl;
    /**
     * 附件表id
     */
    @TableField("fileId")
    private String fileId;
    /**
     * 国美文件加密串
     */
    @TableField("gm_encrypt_doc")
    private String gmEncryptDoc;
    /**
     * 签署人信息
     */
    @TableField("signer_map")
    private String signerMapString;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getSignatureId() {
        return signatureId;
    }

    public void setSignatureId(String signatureId) {
        this.signatureId = signatureId;
    }

    public String getHtCode() {
        return htCode;
    }

    public void setHtCode(String htCode) {
        this.htCode = htCode;
    }

    public int getDocType() {
        return docType;
    }

    public void setDocType(int docType) {
        this.docType = docType;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDocUrl() {
        return docUrl;
    }

    public void setDocUrl(String docUrl) {
        this.docUrl = docUrl;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getGmEncryptDoc() {
        return gmEncryptDoc;
    }

    public void setGmEncryptDoc(String gmEncryptDoc) {
        this.gmEncryptDoc = gmEncryptDoc;
    }

    public String getSignerMapString() {
        return signerMapString;
    }

    public void setSignerMapString(String signerMapString) {
        this.signerMapString = signerMapString;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegDzqzSync{" +
        "rowId=" + rowId +
        ", signatureId=" + signatureId +
        ", htCode=" + htCode +
        ", docType=" + docType +
        ", start=" + start +
        ", createDate=" + createDate +
        ", createDateTime=" + createDateTime +
        ", userName=" + userName +
        ", docUrl=" + docUrl +
        ", fileId=" + fileId +
        ", gmEncryptDoc=" + gmEncryptDoc +
        ", signerMap=" + signerMapString +
        "}";
    }
}
