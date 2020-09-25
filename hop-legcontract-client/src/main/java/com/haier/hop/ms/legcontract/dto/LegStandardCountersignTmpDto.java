package com.haier.hop.ms.legcontract.dto;

import java.io.Serializable;
import java.util.List;

import com.haier.hop.ms.legcontract.domain.LegAttachment;
import com.haier.hop.ms.legcontract.domain.LegContractRightsRist;
import com.haier.hop.ms.legcontract.domain.LegStandardContract;
import com.haier.hop.ms.legcontract.domain.LegStandardContractTmp;

public class LegStandardCountersignTmpDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private LegStandardContractTmp legStandardContractTmp;

	private LegStandardContract legStandardContract;

	private LegActivitiDto legActivitiDto;

	private List<LegCountersignDto> countersignDtos;

	private List<LegContractRightsRist> legContractRightsRistList;

	private List<LegAttachment> attaInfoList;

	private String saveType;

	private String rejectKbn;

	private String addContractDesc;

	private List<String> nodeDescList;

	public String getAddContractDesc() {
		return addContractDesc;
	}

	public void setAddContractDesc(String addContractDesc) {
		this.addContractDesc = addContractDesc;
	}

	public List<String> getNodeDescList() {
		return nodeDescList;
	}

	public void setNodeDescList(List<String> nodeDescList) {
		this.nodeDescList = nodeDescList;
	}

	public List<String> getNodeDesc() {
		return nodeDescList;
	}

	public void setNodeDesc(List<String> nodeDescList) {
		this.nodeDescList = nodeDescList;
	}

	public List<LegAttachment> getAttaInfoList() {
		return attaInfoList;
	}

	public void setAttaInfoList(List<LegAttachment> attaInfoList) {
		this.attaInfoList = attaInfoList;
	}

	public LegActivitiDto getLegActivitiDto() {
		return legActivitiDto;
	}

	public void setLegActivitiDto(LegActivitiDto legActivitiDto) {
		this.legActivitiDto = legActivitiDto;
	}

	public String getRejectKbn() {
		return rejectKbn;
	}

	public void setRejectKbn(String rejectKbn) {
		this.rejectKbn = rejectKbn;
	}

	public String getSaveType() {
		return saveType;
	}

	public void setSaveType(String saveType) {
		this.saveType = saveType;
	}

	public LegStandardContract getLegStandardContract() {
		return legStandardContract;
	}

	public void setLegStandardContract(LegStandardContract legStandardContract) {
		this.legStandardContract = legStandardContract;
	}

	public LegStandardContractTmp getLegStandardContractTmp() {
		return legStandardContractTmp;
	}

	public void setLegStandardContractTmp(LegStandardContractTmp legStandardContractTmp) {
		this.legStandardContractTmp = legStandardContractTmp;
	}

	public List<LegCountersignDto> getCountersignDtos() {
		return countersignDtos;
	}

	public void setCountersignDtos(List<LegCountersignDto> countersignDtos) {
		this.countersignDtos = countersignDtos;
	}

	public List<LegContractRightsRist> getLegContractRightsRistList() {
		return legContractRightsRistList;
	}

	public void setLegContractRightsRistList(List<LegContractRightsRist> legContractRightsRistList) {
		this.legContractRightsRistList = legContractRightsRistList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
