package com.haier.hop.ms.legcontract.dto;

/**
 * 海模智云传合同信息到云超市，返回云超市的合同信息
 * @author Think
 *
 */
public class HmzyReturnDto {
	
	private String contNo; // 合同流水号
	private String contractUrl; // 合同发起url
	
	public String getContNo() {
		return contNo;
	}
	public void setContNo(String contNo) {
		this.contNo = contNo;
	}
	public String getContractUrl() {
		return contractUrl;
	}
	public void setContractUrl(String contractUrl) {
		this.contractUrl = contractUrl;
	}
	
	
}
