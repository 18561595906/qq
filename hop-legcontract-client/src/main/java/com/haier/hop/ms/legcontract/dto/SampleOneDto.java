package com.haier.hop.ms.legcontract.dto;

import java.util.List;

import com.haier.hop.ms.legcontract.domain.LegAttachment;
import com.haier.hop.ms.legcontract.domain.LegContractNode;
import com.haier.hop.ms.legcontract.domain.LegContractRightsRist;
import com.haier.hop.ms.legcontract.domain.LegStandardContractTmp;

public class SampleOneDto {
	private String saveType;// 暂存保存区分(0:暂存 1:提交)
	// 范本类
	private LegStandardContractTmp legStandardContractTmp;
	// 新增合同描述
	private String addContractDesc;
	// 工作流Dto
	private LegActivitiDto legActivitiDto;
	private List<LegContractRightsRist> rights;// 权力list
	private List<LegContractRightsRist> rights1;// 权力list
	private List<LegContractRightsRist> rists;// 风险表
	private List<LegContractRightsRist> rists1;// 风险表
	private List<LegAttachment> legAttachments;
	private List<LegAttachment> legAttachments1;
	// 会签数据
	private List<LegCountersignDto> countersignDtos;
	// 节点名称下拉框
	private List<LegContractNode> list;

	public String getSaveType() {
		return saveType;
	}

	public void setSaveType(String saveType) {
		this.saveType = saveType;
	}

	public LegStandardContractTmp getLegStandardContractTmp() {
		return legStandardContractTmp;
	}

	public void setLegStandardContractTmp(LegStandardContractTmp legStandardContractTmp) {
		this.legStandardContractTmp = legStandardContractTmp;
	}

	public LegActivitiDto getLegActivitiDto() {
		return legActivitiDto;
	}

	public void setLegActivitiDto(LegActivitiDto legActivitiDto) {
		this.legActivitiDto = legActivitiDto;
	}

	public List<LegContractRightsRist> getRights() {
		return rights;
	}

	public void setRights(List<LegContractRightsRist> rights) {
		this.rights = rights;
	}

	public List<LegContractRightsRist> getRights1() {
		return rights1;
	}

	public void setRights1(List<LegContractRightsRist> rights1) {
		this.rights1 = rights1;
	}

	public List<LegContractRightsRist> getRists() {
		return rists;
	}

	public void setRists(List<LegContractRightsRist> rists) {
		this.rists = rists;
	}

	public List<LegContractRightsRist> getRists1() {
		return rists1;
	}

	public void setRists1(List<LegContractRightsRist> rists1) {
		this.rists1 = rists1;
	}

	public List<LegAttachment> getLegAttachments() {
		return legAttachments;
	}

	public void setLegAttachments(List<LegAttachment> legAttachments) {
		this.legAttachments = legAttachments;
	}

	public String getAddContractDesc() {
		return addContractDesc;
	}

	public void setAddContractDesc(String addContractDesc) {
		this.addContractDesc = addContractDesc;
	}

	public List<LegAttachment> getLegAttachments1() {
		return legAttachments1;
	}

	public void setLegAttachments1(List<LegAttachment> legAttachments1) {
		this.legAttachments1 = legAttachments1;
	}

	public List<LegCountersignDto> getCountersignDtos() {
		return countersignDtos;
	}

	public void setCountersignDtos(List<LegCountersignDto> countersignDtos) {
		this.countersignDtos = countersignDtos;
	}

	public List<LegContractNode> getList() {
		return list;
	}

	public void setList(List<LegContractNode> list) {
		this.list = list;
	}

}
