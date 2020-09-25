package com.haier.hop.ms.legcontract.dto;

import com.haier.hop.ms.legcontract.domain.LegStandardContractTmp;

public class BackAcvitiviDto {

	private LegActivitiDto activitiDto;
	private LegStandardContractTmp legStandardContractTmp;

	public LegActivitiDto getActivitiDto() {
		return activitiDto;
	}

	public void setActivitiDto(LegActivitiDto activitiDto) {
		this.activitiDto = activitiDto;
	}

	public LegStandardContractTmp getLegStandardContractTmp() {
		return legStandardContractTmp;
	}

	public void setLegStandardContractTmp(LegStandardContractTmp legStandardContractTmp) {
		this.legStandardContractTmp = legStandardContractTmp;
	}

}
