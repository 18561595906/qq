package com.haier.hop.ms.legcontract.dto;

import java.util.List;

import com.haier.hop.ms.legcontract.domain.LegAttachment;

public class ActivitiFileDto {

	private LegActivitiDto legActivitiDto;
	private List<LegAttachment> legAttachmentList;

	public LegActivitiDto getLegActivitiDto() {
		return legActivitiDto;
	}

	public void setLegActivitiDto(LegActivitiDto legActivitiDto) {
		this.legActivitiDto = legActivitiDto;
	}

	public List<LegAttachment> getLegAttachmentList() {
		return legAttachmentList;
	}

	public void setLegAttachmentList(List<LegAttachment> legAttachmentList) {
		this.legAttachmentList = legAttachmentList;
	}

}
