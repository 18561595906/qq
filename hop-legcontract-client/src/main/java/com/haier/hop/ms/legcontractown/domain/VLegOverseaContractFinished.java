package com.haier.hop.ms.legcontractown.domain;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * VIEW
 * </p>
 *
 * @author xuejinxin
 * @since 2020-06-17
 */
@TableName("v_leg_oversea_contract_finished")
public class VLegOverseaContractFinished extends Model<VLegOverseaContractFinished> {

	private static final long serialVersionUID = 1L;

	@TableField("CONTRACT_TYPE")
	private Integer contractType;
	@TableField("CONT_NO")
	private String contNo;
	@TableField("PROC_ID")
	private String procId;
	@TableField("start_user")
	private String startUser;
	@TableField("START_USER_ID")
	private String startUserId;
	@TableField("PROCESS_TYPE")
	private String processType;
	@TableField("PROCESS_NAME")
	private String processName;
	@TableField("PROCESS_DESC")
	private String processDesc;
	@TableField("START_TIME")
	private String startTime;
	@TableField("END_TIME")
	private String endTime;
	// 当前页数
	@TableField(exist = false)
	private int currentPage;
	// 每页数据条数
	@TableField(exist = false)
	private int pageSize;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public String getStartUserId() {
		return startUserId;
	}

	public void setStartUserId(String startUserId) {
		this.startUserId = startUserId;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getContNo() {
		return contNo;
	}

	public Integer getContractType() {
		return contractType;
	}

	public void setContractType(Integer contractType) {
		this.contractType = contractType;
	}

	public void setContNo(String contNo) {
		this.contNo = contNo;
	}

	public String getProcId() {
		return procId;
	}

	public void setProcId(String procId) {
		this.procId = procId;
	}

	public String getStartUser() {
		return startUser;
	}

	public void setStartUser(String startUser) {
		this.startUser = startUser;
	}

	public String getProcessType() {
		return processType;
	}

	public void setProcessType(String processType) {
		this.processType = processType;
	}

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public String getProcessDesc() {
		return processDesc;
	}

	public void setProcessDesc(String processDesc) {
		this.processDesc = processDesc;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "VLegOverseaContractFinished{" + "contNo=" + contNo + ", procId=" + procId + ", startUser=" + startUser
				+ ", processType=" + processType + ", processName=" + processName + ", processDesc=" + processDesc
				+ ", startTime=" + startTime + ", endTime=" + endTime + "}";
	}
}
