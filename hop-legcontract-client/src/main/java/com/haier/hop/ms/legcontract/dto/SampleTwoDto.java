package com.haier.hop.ms.legcontract.dto;

import java.util.List;

import com.haier.hop.ms.legcontract.domain.LegAttachment;
import com.haier.hop.ms.legcontract.domain.LegContractNode;
import com.haier.hop.ms.legcontract.domain.LegContractRightsRist;
import com.haier.hop.ms.legcontract.domain.LegStandardContract;
import com.haier.hop.ms.legcontract.domain.LegStandardContractTmp;

public class SampleTwoDto {
	// 范本类
	private LegStandardContractTmp legStandardContractTmp;
	private List<LegStandardContract> tmps;
	// 新增合同描述
	private String addContractDesc;
	// 工作流Dto
	private LegActivitiDto legActivitiDto;
	private List<LegContractRightsRist> rights;// 权力list
	private List<LegContractRightsRist> rists;// 风险表
	private List<LegAttachment> legAttachments;// 需求上传附件
	private List<LegAttachment> oldMastAtts;
	private List<LegAttachment> mastAtts;
	private List<LegAttachment> oldMastEditorAtts;
	private List<LegAttachment> mastEditorAtts;
	private List<LegAttachment> oldSpecialAtts;
	private List<LegAttachment> specialAtts;
	private List<LegAttachment> oldSpecialEditorAtts;
	private List<LegAttachment> specialEditorAtts;
	private List<LegAttachment> modifyAtts;
	private List<LegAttachment> oldPolicyAtts;
	private List<LegAttachment> policyAtts;
	// 会签数据
	private List<LegCountersignDto> countersignDtos;
	// 节点名称下拉框
	private List<LegContractNode> list;

	public LegStandardContractTmp getLegStandardContractTmp() {
		return legStandardContractTmp;
	}

	public void setLegStandardContractTmp(LegStandardContractTmp legStandardContractTmp) {
		this.legStandardContractTmp = legStandardContractTmp;
	}

	public String getAddContractDesc() {
		return addContractDesc;
	}

	public void setAddContractDesc(String addContractDesc) {
		this.addContractDesc = addContractDesc;
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

	public List<LegContractRightsRist> getRists() {
		return rists;
	}

	public void setRists(List<LegContractRightsRist> rists) {
		this.rists = rists;
	}

	public List<LegAttachment> getLegAttachments() {
		return legAttachments;
	}

	public void setLegAttachments(List<LegAttachment> legAttachments) {
		this.legAttachments = legAttachments;
	}

	public List<LegAttachment> getOldMastAtts() {
		return oldMastAtts;
	}

	public void setOldMastAtts(List<LegAttachment> oldMastAtts) {
		this.oldMastAtts = oldMastAtts;
	}

	public List<LegAttachment> getMastAtts() {
		return mastAtts;
	}

	public void setMastAtts(List<LegAttachment> mastAtts) {
		this.mastAtts = mastAtts;
	}

	public List<LegAttachment> getOldMastEditorAtts() {
		return oldMastEditorAtts;
	}

	public void setOldMastEditorAtts(List<LegAttachment> oldMastEditorAtts) {
		this.oldMastEditorAtts = oldMastEditorAtts;
	}

	public List<LegAttachment> getMastEditorAtts() {
		return mastEditorAtts;
	}

	public void setMastEditorAtts(List<LegAttachment> mastEditorAtts) {
		this.mastEditorAtts = mastEditorAtts;
	}

	public List<LegAttachment> getOldSpecialAtts() {
		return oldSpecialAtts;
	}

	public void setOldSpecialAtts(List<LegAttachment> oldSpecialAtts) {
		this.oldSpecialAtts = oldSpecialAtts;
	}

	public List<LegAttachment> getSpecialAtts() {
		return specialAtts;
	}

	public void setSpecialAtts(List<LegAttachment> specialAtts) {
		this.specialAtts = specialAtts;
	}

	public List<LegAttachment> getOldSpecialEditorAtts() {
		return oldSpecialEditorAtts;
	}

	public void setOldSpecialEditorAtts(List<LegAttachment> oldSpecialEditorAtts) {
		this.oldSpecialEditorAtts = oldSpecialEditorAtts;
	}

	public List<LegAttachment> getSpecialEditorAtts() {
		return specialEditorAtts;
	}

	public void setSpecialEditorAtts(List<LegAttachment> specialEditorAtts) {
		this.specialEditorAtts = specialEditorAtts;
	}

	public List<LegAttachment> getModifyAtts() {
		return modifyAtts;
	}

	public void setModifyAtts(List<LegAttachment> modifyAtts) {
		this.modifyAtts = modifyAtts;
	}

	public List<LegStandardContract> getTmps() {
		return tmps;
	}

	public void setTmps(List<LegStandardContract> tmps) {
		this.tmps = tmps;
	}

	public List<LegAttachment> getOldPolicyAtts() {
		return oldPolicyAtts;
	}

	public void setOldPolicyAtts(List<LegAttachment> oldPolicyAtts) {
		this.oldPolicyAtts = oldPolicyAtts;
	}

	public List<LegAttachment> getPolicyAtts() {
		return policyAtts;
	}

	public void setPolicyAtts(List<LegAttachment> policyAtts) {
		this.policyAtts = policyAtts;
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
