package com.haier.hop.ms.legcontract.dto;

import java.util.List;

/**
 * <p>
 * 平台长授权信息
 * </p>
 *
 * @author shiyingxin
 * @since 2019-09-20
 */
public class LegDelegateSelectDto {
	/**
	 * 授权人名称
	 */
	private String certigierEmpName;

	private List<String> bizNameList;

	private List<String> contractNameList;

	private List<String> partnerNameList;

	private Integer sizeFrist;

	private Integer sizeLast;

	public String getCertigierEmpName() {
		return certigierEmpName;
	}

	public void setCertigierEmpName(String certigierEmpName) {
		this.certigierEmpName = certigierEmpName;
	}

	public List<String> getBizNameList() {
		return bizNameList;
	}

	public void setBizNameList(List<String> bizNameList) {
		this.bizNameList = bizNameList;
	}

	public List<String> getContractNameList() {
		return contractNameList;
	}

	public void setContractNameList(List<String> contractNameList) {
		this.contractNameList = contractNameList;
	}

	public List<String> getPartnerNameList() {
		return partnerNameList;
	}

	public void setPartnerNameList(List<String> partnerNameList) {
		this.partnerNameList = partnerNameList;
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
