package com.haier.hop.ms.legcontract.dto;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-17
 */
public class LegYysqSubmitDto {

	/**
	 * 工作流信息
	 */
	private LegActivitiDto legActivitiDto;

	/**
	 * 合同信息
	 */
	private LegContractTmpDto legContractTmpDto;

	public LegActivitiDto getLegActivitiDto() {
		return legActivitiDto;
	}

	public void setLegActivitiDto(LegActivitiDto legActivitiDto) {
		this.legActivitiDto = legActivitiDto;
	}

	public LegContractTmpDto getLegContractTmpDto() {
		return legContractTmpDto;
	}

	public void setLegContractTmpDto(LegContractTmpDto legContractTmpDto) {
		this.legContractTmpDto = legContractTmpDto;
	}

}
