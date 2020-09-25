package com.haier.hop.ms.legcontract.dto;

/**
 * <p>
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-17
 */
public class LegContractSupplierToDoListDto {

	// 流程实例id
	private String procId;

	// 任务id
	private String taskId;

	// 当前节点
	private String taskName;

	// 申请人
	private String applierName;

	// 业务单元
	private String bizName;

	// 申请时间
	private String createTime;

	// 任务描述
	private String taskDesc;

	// 合同名称
	private String contractName;

	// 签约方名称
	private String compName;

	public String getProcId() {
		return procId;
	}

	public void setProcId(String procId) {
		this.procId = procId;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getApplierName() {
		return applierName;
	}

	public void setApplierName(String applierName) {
		this.applierName = applierName;
	}

	public String getBizName() {
		return bizName;
	}

	public void setBizName(String bizName) {
		this.bizName = bizName;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getTaskDesc() {
		return taskDesc;
	}

	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

}
