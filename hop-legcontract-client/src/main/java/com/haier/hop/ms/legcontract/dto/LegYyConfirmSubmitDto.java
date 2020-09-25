package com.haier.hop.ms.legcontract.dto;

import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-17
 */
public class LegYyConfirmSubmitDto {

	/**
	 * 合同类型1、外部 2、内部 3、借款担保
	 */
	private String contractInsideType;

	/**
	 * 工作流信息
	 */
	private LegActivitiDto legActivitiDto;

	/**
	 * 印章使用信息
	 */
	private List<LegSealUseInfoDto> sealUseInfo;

	public String getContractInsideType() {
		return contractInsideType;
	}

	public void setContractInsideType(String contractInsideType) {
		this.contractInsideType = contractInsideType;
	}

	public LegActivitiDto getLegActivitiDto() {
		return legActivitiDto;
	}

	public void setLegActivitiDto(LegActivitiDto legActivitiDto) {
		this.legActivitiDto = legActivitiDto;
	}

	public List<LegSealUseInfoDto> getSealUseInfo() {
		return sealUseInfo;
	}

	public void setSealUseInfo(List<LegSealUseInfoDto> sealUseInfo) {
		this.sealUseInfo = sealUseInfo;
	}

}
