package com.haier.hop.ms.legcontract.dto;

import java.util.List;

/**
 * <p>
 * 添加新族群
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-25
 */
public class LegContractAddCategoryDto {

	// 申请人Id
	private String applicantId;

	// 申请人名称
	private String applicantName;

	// 业务单元编码
	private String businessUnitCode;

	// 业务单元名称
	private String businessUnitName;

	// 节点Id
	private String nodeId;

	// 节点名称
	private String nodeName;

	// 规则(公议人)List
	private List<String> ruleList;

	public String getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(String applicantId) {
		this.applicantId = applicantId;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getBusinessUnitCode() {
		return businessUnitCode;
	}

	public void setBusinessUnitCode(String businessUnitCode) {
		this.businessUnitCode = businessUnitCode;
	}

	public String getBusinessUnitName() {
		return businessUnitName;
	}

	public void setBusinessUnitName(String businessUnitName) {
		this.businessUnitName = businessUnitName;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public List<String> getRuleList() {
		return ruleList;
	}

	public void setRuleList(List<String> ruleList) {
		this.ruleList = ruleList;
	}

}
