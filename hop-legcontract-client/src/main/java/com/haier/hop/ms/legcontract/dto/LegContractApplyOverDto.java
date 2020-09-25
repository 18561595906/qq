package com.haier.hop.ms.legcontract.dto;

import java.util.List;

import com.haier.hop.ms.legcontract.domain.LegAttachment;
import com.haier.hop.ms.legcontract.domain.LegStandardContract;

public class LegContractApplyOverDto {

	private LegStandardContract legStandardContract;

	private LegEmpCategory legEmpCategory;

	private LegActivitiDto legActivitiDto;

	private List<LegAttachment> legAttachmentList;

	public List<LegAttachment> getLegAttachmentList() {
		return legAttachmentList;
	}

	public void setLegAttachmentList(List<LegAttachment> legAttachmentList) {
		this.legAttachmentList = legAttachmentList;
	}

	public LegActivitiDto getLegActivitiDto() {
		return legActivitiDto;
	}

	public void setLegActivitiDto(LegActivitiDto legActivitiDto) {
		this.legActivitiDto = legActivitiDto;
	}

	public LegStandardContract getLegStandardContract() {
		return legStandardContract;
	}

	public void setLegStandardContract(LegStandardContract legStandardContract) {
		this.legStandardContract = legStandardContract;
	}

	public LegEmpCategory getLegEmpCategory() {
		return legEmpCategory;
	}

	public void setLegEmpCategory(LegEmpCategory legEmpCategory) {
		this.legEmpCategory = legEmpCategory;
	}

}
