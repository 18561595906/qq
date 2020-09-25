package com.haier.hop.ms.legcontract.dto;

import com.baomidou.mybatisplus.annotations.TableField;

import java.math.BigDecimal;

/**
 * <p>
 * 范本替换历史表
 * </p>
 *
 * @author shiyingxin
 * @since 2020-05-15
 */
public class LegStandardContractReplaceDto {
	private String rowId;
	private String fileUrlNew;
	private String fileUrlOld;
	private String fileUrl;
	private String fileName;
	private String rowId1;
	private String fileUrlNew1;
	private String fileUrlOld1;
	private String fileUrl1;
	private String fileName1;
	private String version;
	private BigDecimal delflag;
	private Integer batch;
	private String uploadRole;
	private String uploadReason;
	private String contractId;
	private String procId;
	private String definedId;

	/**
	 * 上传时间
	 */
	@TableField("UPLOAD_TIME")
	private String uploadTime;
	/**
	 * 上传工号人
	 */
	private String empSn;
	/**
	 * 上传工姓名
	 */
	private String empName;

	public String getFileUrl() {
		return fileUrl;
	}

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getRowId1() {
		return rowId1;
	}

	public void setRowId1(String rowId1) {
		this.rowId1 = rowId1;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getFileName() {
		return fileName;
	}

	public String getFileUrlOld() {
		return fileUrlOld;
	}

	public void setFileUrlOld(String fileUrlOld) {
		this.fileUrlOld = fileUrlOld;
	}

	public String getFileUrlOld1() {
		return fileUrlOld1;
	}

	public void setFileUrlOld1(String fileUrlOld1) {
		this.fileUrlOld1 = fileUrlOld1;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileUrl1() {
		return fileUrl1;
	}

	public String getFileUrlNew() {
		return fileUrlNew;
	}

	public void setFileUrlNew(String fileUrlNew) {
		this.fileUrlNew = fileUrlNew;
	}

	public String getFileUrlNew1() {
		return fileUrlNew1;
	}

	public void setFileUrlNew1(String fileUrlNew1) {
		this.fileUrlNew1 = fileUrlNew1;
	}

	public void setFileUrl1(String fileUrl1) {
		this.fileUrl1 = fileUrl1;
	}

	public String getFileName1() {
		return fileName1;
	}

	public void setFileName1(String fileName1) {
		this.fileName1 = fileName1;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getUploadTime() {
		return uploadTime;
	}

	public void setUploadTime(String uploadTime) {
		this.uploadTime = uploadTime;
	}

	public String getEmpSn() {
		return empSn;
	}

	public void setEmpSn(String empSn) {
		this.empSn = empSn;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public BigDecimal getDelflag() {
		return delflag;
	}

	public void setDelflag(BigDecimal delflag) {
		this.delflag = delflag;
	}

	public Integer getBatch() {
		return batch;
	}

	public void setBatch(Integer batch) {
		this.batch = batch;
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

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getProcId() {
		return procId;
	}

	public void setProcId(String procId) {
		this.procId = procId;
	}

	public String getDefinedId() {
		return definedId;
	}

	public void setDefinedId(String definedId) {
		this.definedId = definedId;
	}
}
