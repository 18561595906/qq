package com.haier.hop.ms.legcontract.dto;

import java.math.BigDecimal;

/**
 * <p>
 * entity
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-12
 */
public class LegDelegateCertainAmountDto {

	/**
	 * 合同金额范围（开始）
	 */
	private BigDecimal contractTotalStart;

	/**
	 * 合同金额范围（结束）
	 */
	private BigDecimal contractTotalEnd;

	/**
	 * 被授权人编码
	 */
	private String certainAmountSn;

	/**
	 * 被授权人名称
	 */
	private String certainAmountName;

	public BigDecimal getContractTotalStart() {
		return contractTotalStart;
	}

	public void setContractTotalStart(BigDecimal contractTotalStart) {
		this.contractTotalStart = contractTotalStart;
	}

	public BigDecimal getContractTotalEnd() {
		return contractTotalEnd;
	}

	public void setContractTotalEnd(BigDecimal contractTotalEnd) {
		this.contractTotalEnd = contractTotalEnd;
	}

	public String getCertainAmountSn() {
		return certainAmountSn;
	}

	public void setCertainAmountSn(String certainAmountSn) {
		this.certainAmountSn = certainAmountSn;
	}

	public String getCertainAmountName() {
		return certainAmountName;
	}

	public void setCertainAmountName(String certainAmountName) {
		this.certainAmountName = certainAmountName;
	}

}
