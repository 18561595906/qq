package com.haier.hop.ms.legcontract.dto;

public class LegAssistInfoDto {

	//节点ID
	private String nodeId;
	//节点名称
	private String nodeName;
	//节点描述
	private String nodeDesc;
	//关联合同编号
	private String contractProId;
	//删除流程ID
	private String procId;

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

	public String getContractProId() {
		return contractProId;
	}

	public void setContractProId(String contractProId) {
		this.contractProId = contractProId;
	}

	public String getProcId() {
		return procId;
	}

	public void setProcId(String procId) {
		this.procId = procId;
	}
	
	
}
