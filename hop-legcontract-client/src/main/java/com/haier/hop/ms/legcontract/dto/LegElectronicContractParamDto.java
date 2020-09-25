package com.haier.hop.ms.legcontract.dto;

/**
 * <p>
 * 电子合同参数
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-17
 */
public class LegElectronicContractParamDto {

	/**
	 * 流程实例id
	 */
	private String procId;

	/**
	 * 附件rowId
	 */
	private String attRowId;

	/**
	 * 附件名
	 */
	private String fileName;

	/**
	 * 合同名称
	 */
	private String contractName;

	/**
	 * 用户账号
	 */
	private String empNo;

	/**
	 * 前台返回url
	 */
	private String frontUrl;

	/**
	 * 是否允许自动签章
	 */
	private String gzType;

	/**
	 * 印章编号
	 */
	private String sealNo;

	/**
	 * 系统来源
	 */
	private String sysFrom;

	/**
	 * 盖章校验方式
	 */
	private String sealCheckType;

	public String getProcId() {
		return procId;
	}

	public void setProcId(String procId) {
		this.procId = procId;
	}

	public String getAttRowId() {
		return attRowId;
	}

	public void setAttRowId(String attRowId) {
		this.attRowId = attRowId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getFrontUrl() {
		return frontUrl;
	}

	public void setFrontUrl(String frontUrl) {
		this.frontUrl = frontUrl;
	}

	public String getGzType() {
		return gzType;
	}

	public void setGzType(String gzType) {
		this.gzType = gzType;
	}

	public String getSealNo() {
		return sealNo;
	}

	public void setSealNo(String sealNo) {
		this.sealNo = sealNo;
	}

	public String getSysFrom() {
		return sysFrom;
	}

	public void setSysFrom(String sysFrom) {
		this.sysFrom = sysFrom;
	}

	public String getSealCheckType() {
		return sealCheckType;
	}

	public void setSealCheckType(String sealCheckType) {
		this.sealCheckType = sealCheckType;
	}

	public LegElectronicContractParamDto() {
		super();
	}
	
	public LegElectronicContractParamDto(String attRowId, String fileName, String contractName, String empNo,
			String frontUrl, String gzType, String sysFrom) {
		super();
		this.attRowId = attRowId;
		this.fileName = fileName;
		this.contractName = contractName;
		this.empNo = empNo;
		this.frontUrl = frontUrl;
		this.gzType = gzType;
		this.sysFrom = sysFrom;
	}

}
