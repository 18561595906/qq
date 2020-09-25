package com.haier.hop.ms.legcontract.dto;

import java.io.Serializable;
import java.util.List;

import com.haier.hop.ms.legcontract.domain.LegAttachment;
import com.haier.hop.ms.legcontract.domain.LegReview;
import com.haier.hop.ms.legcontract.domain.LegStandardContractTmp;
import com.haier.hop.ms.legcontract.domain.LegStandardCountersignTmp;

public class LegContractDelegateApproveDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private LegReview legReview;

	private LegStandardContractTmp legStandardContractTmp;

	private List<LegAttachment> attaInfoList;

	private LegActivitiDto legActivitiDto;

	private List<LegStandardCountersignTmp> legStandardCountersignTmpList;

	public LegActivitiDto getLegActivitiDto() {
		return legActivitiDto;
	}

	public void setLegActivitiDto(LegActivitiDto legActivitiDto) {
		this.legActivitiDto = legActivitiDto;
	}

	public LegReview getLegReview() {
		return legReview;
	}

	public void setLegReview(LegReview legReview) {
		this.legReview = legReview;
	}

	public List<LegStandardCountersignTmp> getLegStandardCountersignTmpList() {
		return legStandardCountersignTmpList;
	}

	public void setLegStandardCountersignTmpList(List<LegStandardCountersignTmp> legStandardCountersignTmpList) {
		this.legStandardCountersignTmpList = legStandardCountersignTmpList;
	}

	public LegStandardContractTmp getLegStandardContractTmp() {
		return legStandardContractTmp;
	}

	public void setLegStandardContractTmp(LegStandardContractTmp legStandardContractTmp) {
		this.legStandardContractTmp = legStandardContractTmp;
	}

	public List<LegAttachment> getAttaInfoList() {
		return attaInfoList;
	}

	public void setAttaInfoList(List<LegAttachment> attaInfoList) {
		this.attaInfoList = attaInfoList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
