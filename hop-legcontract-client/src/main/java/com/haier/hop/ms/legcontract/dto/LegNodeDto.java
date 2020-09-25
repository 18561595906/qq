package com.haier.hop.ms.legcontract.dto;

import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-17
 */
public class LegNodeDto {

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
	 * 是否固定节点
	 */
	private String isGdNode;

	/**
	 * 节点rowid
	 */
	private String rowId;

	/**
	 * 节点taskId
	 */
	private String taskId;

	/**
	 * 公议人信息
	 */
	private List<LegNodeAssigneeDto> nodeAssigneeDto;

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

	public String getIsGdNode() {
		return isGdNode;
	}

	public void setIsGdNode(String isGdNode) {
		this.isGdNode = isGdNode;
	}

	public List<LegNodeAssigneeDto> getNodeAssigneeDto() {
		return nodeAssigneeDto;
	}

	public void setNodeAssigneeDto(List<LegNodeAssigneeDto> nodeAssigneeDto) {
		this.nodeAssigneeDto = nodeAssigneeDto;
	}

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
