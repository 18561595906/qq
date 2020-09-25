package com.haier.hop.ms.legcontract.dto;

/**
 * 公共接口合同查询
 * 
 * @author wushilei
 * @date 2019/09/04
 */
public class ContractReviewDto {
	/**
	 * 流程编码
	 */
	private String procId;

	/**
	 * 审批人
	 */
	private String assignee;

	/**
	 * 审批结论
	 */
	private String approvalConclusion;

	/**
	 * 审批意见
	 */
	private String approvalOpinion;

	/**
	 * 审批节点
	 */
	private String nodeName;

	public String getProcId() {
		return procId;
	}

	public void setProcId(String procId) {
		this.procId = procId;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getApprovalConclusion() {
		return approvalConclusion;
	}

	public void setApprovalConclusion(String approvalConclusion) {
		this.approvalConclusion = approvalConclusion;
	}

	public String getApprovalOpinion() {
		return approvalOpinion;
	}

	public void setApprovalOpinion(String approvalOpinion) {
		this.approvalOpinion = approvalOpinion;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

}
