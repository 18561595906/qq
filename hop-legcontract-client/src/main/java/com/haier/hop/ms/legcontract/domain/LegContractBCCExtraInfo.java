package com.haier.hop.ms.legcontract.domain;

import java.util.List;

import lombok.Data;

@Data
public class LegContractBCCExtraInfo {

	// 收付款方式
	private String payType;

	// 描述
	private String payTypeString;

	// 预算体编码
	private String budgetCode;

	// 预算体名称
	private String budgetName;

	// 里程碑
	private List<LegMilepostData> payDetails;

	// 合同名称
	private String contractType;

	// 合同一级类别类型
	private String contractTopType;

	// Word 合同额外信息
	private LegContractBCCExtraWord extraWord;

	// 付款方式(1一次性付款，2分期付款)
	private String paymentType;

	// 付款时间
	private String paymentDate;

	// 一次性付款描述
	private String paymentTypeStr = "其他";

	//付款周期
	private String paymentZq;

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPayTypeString() {
		return payTypeString;
	}

	public void setPayTypeString(String payTypeString) {
		this.payTypeString = payTypeString;
	}

	public String getBudgetCode() {
		return budgetCode;
	}

	public void setBudgetCode(String budgetCode) {
		this.budgetCode = budgetCode;
	}

	public String getBudgetName() {
		return budgetName;
	}

	public void setBudgetName(String budgetName) {
		this.budgetName = budgetName;
	}

	public List<LegMilepostData> getPayDetails() {
		return payDetails;
	}

	public void setPayDetails(List<LegMilepostData> payDetails) {
		this.payDetails = payDetails;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getContractTopType() {
		return contractTopType;
	}

	public void setContractTopType(String contractTopType) {
		this.contractTopType = contractTopType;
	}

	public LegContractBCCExtraWord getExtraWord() {
		return extraWord;
	}

	public void setExtraWord(LegContractBCCExtraWord extraWord) {
		this.extraWord = extraWord;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentTypeStr() {
		return paymentTypeStr;
	}

	public void setPaymentTypeStr(String paymentTypeStr) {
		this.paymentTypeStr = paymentTypeStr;
	}

}
