package com.haier.hop.ms.legcontract.dto;

import com.haier.hop.ms.legcontract.domain.LegContractDelegatePower;

/**
 * <p>
 * 平台长授权信息
 * </p>
 *
 * @author shiyingxin
 * @since 2019-09-20
 */
public class LegContractSelectDelegatePowerDto extends LegContractDelegatePower {

	private static final long serialVersionUID = 1L;

	/**
	 * 业务单元名称
	 */
	private String bizName;

	/**
	 * 合同类型编码
	 */
	private String contractCode;

	/**
	 * 合同类型名称
	 */
	private String contractName;

	/**
	 * 签约公司
	 */
	private String partnerName;

	public String getBizName() {
		return bizName;
	}

	public void setBizName(String bizName) {
		this.bizName = bizName;
	}

	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getPartnerName() {
		return partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

}
