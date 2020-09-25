package com.haier.hop.ms.legcontract.dto;

import java.util.List;

import com.haier.hop.ms.legcontract.domain.LegContractPartner;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-17
 */
public class LegPtzSubmitDto {

	/**
	 * 工作流信息
	 */
	private LegActivitiDto legActivitiDto;

	/**
	 * 签约方信息
	 */
	private List<LegContractPartner> partnerList;

	/**
	 * 合同rowId
	 */
	private String contractRowId;

	public LegActivitiDto getLegActivitiDto() {
		return legActivitiDto;
	}

	public void setLegActivitiDto(LegActivitiDto legActivitiDto) {
		this.legActivitiDto = legActivitiDto;
	}

	public List<LegContractPartner> getPartnerList() {
		return partnerList;
	}

	public void setPartnerList(List<LegContractPartner> partnerList) {
		this.partnerList = partnerList;
	}

	public String getContractRowId() {
		return contractRowId;
	}

	public void setContractRowId(String contractRowId) {
		this.contractRowId = contractRowId;
	}

}
