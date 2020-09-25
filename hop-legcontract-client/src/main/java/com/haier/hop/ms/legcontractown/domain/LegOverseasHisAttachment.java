package com.haier.hop.ms.legcontractown.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * </p>
 *
 * @author xuejinxin
 * @since 2020-05-22
 */
@TableName("leg_overseas_his_attachment")
public class LegOverseasHisAttachment extends Model<LegOverseasHisAttachment> {

	private static final long serialVersionUID = 1L;

	@TableField("ROW_ID")
	private String rowId;
	@TableField("CONTRACT_ID")
	private String contractId;
	@TableField("ATTACH_PATH")
	private String attachPath;
	@TableField(exist = false)
	private String fileUrl;
	@TableField("FILE_NAME")
	private String fileName;
	@TableField("UPLOAD_DATE")
	private Date uploadDate;

	public String getRowId() {
		return rowId;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getAttachPath() {
		return attachPath;
	}

	public void setAttachPath(String attachPath) {
		this.attachPath = attachPath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegOverseasHisAttachment{" + "rowId=" + rowId + ", contractId=" + contractId + ", attachPath="
				+ attachPath + ", fileName=" + fileName + ", uploadDate=" + uploadDate + "}";
	}
}
