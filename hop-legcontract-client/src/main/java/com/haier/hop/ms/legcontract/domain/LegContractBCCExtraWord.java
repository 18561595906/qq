package com.haier.hop.ms.legcontract.domain;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class LegContractBCCExtraWord {
	// 乙方开户行
	private String accountBank;

	// 乙方卡号
	private String accountInfo;

	// 发票类型
	private String invoiceType;

	// 发票税率，格式：0.09
	private BigDecimal invoiceRate;

	// 开票时间
	private String invoicePoint = "发票先到";
	//租赁合同房屋住址
	private String address;

	public String getAccountBank() {
		return accountBank;
	}

	public void setAccountBank(String accountBank) {
		this.accountBank = accountBank;
	}

	public String getAccountInfo() {
		return accountInfo;
	}

	public void setAccountInfo(String accountInfo) {
		this.accountInfo = accountInfo;
	}

	public String getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public BigDecimal getInvoiceRate() {
		return invoiceRate;
	}

	public void setInvoiceRate(BigDecimal invoiceRate) {
		this.invoiceRate = invoiceRate;
	}

	public String getInvoicePoint() {
		return invoicePoint;
	}

	public void setInvoicePoint(String invoicePoint) {
		this.invoicePoint = invoicePoint;
	}

	/*
	 * //一次性付款描述
	 * private String paymentTypeStr = "其他";
	 */

}
