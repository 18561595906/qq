package com.haier.hop.ms.legcontract.dto;

import java.util.Date;

/**
 * <p>
 * 合同关联付款公司
 * </p>
 *
 * @author shiyingxin
 * @since 2019-08-05
 */
public class LegContractAccountCompany {

	/**
	 * ID
	 */
	private String rowId;
	/**
	 * 付款公司编码
	 */
	private String accountCompanyCode;
	/**
	 * 付款公司名称
	 */
	private String accountCompanyName;
	/**
	 * 合作方编码
	 */
	private String partnerNo;
	/**
	 * 合作方名称
	 */
	private String partnerName;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 流程ID
	 */
	private String procId;
	/**
	 * 创建人
	 */
	private String createBy;
	/**
	 * 创建人姓名
	 */
	private String createByName;
	/**
	 * 接口返回值
	 */
	private String result;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getAccountCompanyCode() {
		return accountCompanyCode;
	}

	public void setAccountCompanyCode(String accountCompanyCode) {
		this.accountCompanyCode = accountCompanyCode;
	}

	public String getAccountCompanyName() {
		return accountCompanyName;
	}

	public void setAccountCompanyName(String accountCompanyName) {
		this.accountCompanyName = accountCompanyName;
	}

	public String getPartnerNo() {
		return partnerNo;
	}

	public void setPartnerNo(String partnerNo) {
		this.partnerNo = partnerNo;
	}

	public String getPartnerName() {
		return partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getProcId() {
		return procId;
	}

	public void setProcId(String procId) {
		this.procId = procId;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getCreateByName() {
		return createByName;
	}

	public void setCreateByName(String createByName) {
		this.createByName = createByName;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "LegContractAccountCompany{" + "rowId=" + rowId + ", accountCompanyCode=" + accountCompanyCode
				+ ", accountCompanyName=" + accountCompanyName + ", partnerNo=" + partnerNo + ", partnerName="
				+ partnerName + ", createTime=" + createTime + ", procId=" + procId + ", createBy=" + createBy
				+ ", createByName=" + createByName + ", result=" + result + "}";
	}
}
