package com.haier.hop.ms.legcontract.dto;

import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-12-16
 */
public class LegContractSupplierCompletedDto {
	// 当前节点
	private String nodeName;
	// 申请人
	private String applierName;
	// 所属部门
	private String jytName;
	// 申请时间
	private String startTime;
	// 任务描述
	private String taskDesc;
	// 流程id
	private String procId;
	// 附件信息
	private List<LegContractSupplierAttDto> attList;

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getApplierName() {
		return applierName;
	}

	public void setApplierName(String applierName) {
		this.applierName = applierName;
	}

	public String getJytName() {
		return jytName;
	}

	public void setJytName(String jytName) {
		this.jytName = jytName;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTaskDesc() {
		return taskDesc;
	}

	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	public String getProcId() {
		return procId;
	}

	public void setProcId(String procId) {
		this.procId = procId;
	}

	public List<LegContractSupplierAttDto> getAttList() {
		return attList;
	}

	public void setAttList(List<LegContractSupplierAttDto> attList) {
		this.attList = attList;
	}

}
