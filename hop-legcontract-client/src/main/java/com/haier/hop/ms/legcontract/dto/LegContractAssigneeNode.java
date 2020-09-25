package com.haier.hop.ms.legcontract.dto;


public class LegContractAssigneeNode {

	/**
	 * 节点id
	 */
	private String nodeId;

	/**
	 * 节点名称
	 */
	private String nodeName;

	/**
	 * 节点描述
	 */
	private String nodeDesc;
	
	/**
	 * 节点taskId
	 */
	private String taskId;
	
	/**
	 * 节点taskKey
	 */
	private String taskKey;
	
	/**
	 * 公议人编码
	 */
	private String assigneeSn;

	/**
	 * 公议人名称
	 */
	private String assigneeName;

	/**
	 * 公议结论
	 */
	private String assignResult;
	
	/**
	 * 是否已用印（ 1：同意 0：不同意 -1  未审核）
	 */
	private String result;

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

	public String getNodeDesc() {
		return nodeDesc;
	}

	public void setNodeDesc(String nodeDesc) {
		this.nodeDesc = nodeDesc;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskKey() {
		return taskKey;
	}

	public void setTaskKey(String taskKey) {
		this.taskKey = taskKey;
	}

	public String getAssigneeSn() {
		return assigneeSn;
	}

	public void setAssigneeSn(String assigneeSn) {
		this.assigneeSn = assigneeSn;
	}

	public String getAssigneeName() {
		return assigneeName;
	}

	public void setAssigneeName(String assigneeName) {
		this.assigneeName = assigneeName;
	}

	public String getAssignResult() {
		return assignResult;
	}

	public void setAssignResult(String assignResult) {
		this.assignResult = assignResult;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	
}
