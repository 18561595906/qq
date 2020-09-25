package com.haier.hop.ms.legcontract.dto;

public class LegTyAttachmentDto {

	// 合同名称
	private String contractName;

	// 附件名称
	private String fileName;

	// 附件名称
	private String fileUrl;

	// 附件id
	private String fileRowId;

	private Integer sizeFrist;
	private Integer sizeLast;

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getFileRowId() {
		return fileRowId;
	}

	public void setFileRowId(String fileRowId) {
		this.fileRowId = fileRowId;
	}

	public Integer getSizeFrist() {
		return sizeFrist;
	}

	public void setSizeFrist(Integer sizeFrist) {
		this.sizeFrist = sizeFrist;
	}

	public Integer getSizeLast() {
		return sizeLast;
	}

	public void setSizeLast(Integer sizeLast) {
		this.sizeLast = sizeLast;
	}

}
