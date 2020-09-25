package com.haier.hop.ms.legcontractown.dto;

import java.util.List;

public class LegSignOneDto {
	/**
	 * 节点名ID
	 */
	private String nodeId;

	/**
	 * 节点名
	 */
	private String nodeName;

	/**
	 * 节点描述
	 */
	private String nodeDesc;
	/**
	 * 节点Key
	 */
	private String taskKey;

	private List<LegEmployeeDto> legEmployees;

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

	public String getTaskKey() {
		return taskKey;
	}

	public void setTaskKey(String taskKey) {
		this.taskKey = taskKey;
	}

	public List<LegEmployeeDto> getLegEmployees() {
		return legEmployees;
	}

	public void setLegEmployees(List<LegEmployeeDto> legEmployees) {
		this.legEmployees = legEmployees;
	}

	public String getNodeDesc() {
		return nodeDesc;
	}

	public void setNodeDesc(String nodeDesc) {
		this.nodeDesc = nodeDesc;
	}

}
