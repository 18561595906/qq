package com.haier.hop.ms.legcontract.dto;

import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-17
 */
public class LegNodeAssigneeDto {

	/**
	 * 公议人编码
	 */
	private String assigneeSn;

	/**
	 * 公议人名称
	 */
	private String assigneeName;

	/**
	 * 是否是固定公议人
	 */
	private String isGdAssignee;

	/**
	 * 电子签名
	 */
	private byte[] empSignature;

	/**
	 * 公议时间
	 */
	private Date assignTime;

	/**
	 * 公议结论
	 */
	private String assignResult;
	
	/**
	 * 风险抵押金
	 */
	private String accountPeriod;
	
	/**
	 * 账期
	 */
	private String riskMortgage;

	public String getAccountPeriod() {
		return accountPeriod;
	}

	public void setAccountPeriod(String accountPeriod) {
		this.accountPeriod = accountPeriod;
	}

	public String getRiskMortgage() {
		return riskMortgage;
	}

	public void setRiskMortgage(String riskMortgage) {
		this.riskMortgage = riskMortgage;
	}

	public String getAssigneeSn() {
		return assigneeSn;
	}

	public void setAssigneeSn(String assigneeSn) {
		this.assigneeSn = assigneeSn;
	}

	public String getAssigneeName() {
		return assigneeName;
	}

	public void setAssigneeName(String assigneeName) {
		this.assigneeName = assigneeName;
	}

	public byte[] getEmpSignature() {
		return empSignature;
	}

	public void setEmpSignature(byte[] empSignature) {
		this.empSignature = empSignature;
	}

	public Date getAssignTime() {
		return assignTime;
	}

	public void setAssignTime(Date assignTime) {
		this.assignTime = assignTime;
	}

	public String getAssignResult() {
		return assignResult;
	}

	public void setAssignResult(String assignResult) {
		this.assignResult = assignResult;
	}

	public String getIsGdAssignee() {
		return isGdAssignee;
	}

	public void setIsGdAssignee(String isGdAssignee) {
		this.isGdAssignee = isGdAssignee;
	}

}
