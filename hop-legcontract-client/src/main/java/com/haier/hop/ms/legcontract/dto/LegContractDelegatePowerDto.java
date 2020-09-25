package com.haier.hop.ms.legcontract.dto;

import java.util.List;

import com.haier.hop.ms.legcontract.domain.LegAttachment;

/**
 * <p>
 * 平台长授权信息
 * </p>
 *
 * @author shiyingxin
 * @since 2019-09-20
 */
public class LegContractDelegatePowerDto {

	/**
	 * 流程id
	 */
	private String procId;

	/**
	 * 任务id
	 */
	private String taskId;

	/**
	 * 业务单元编码
	 */
	private String bizCode;

	/**
	 * 业务单元名称
	 */
	private String bizName;

	/**
	 * 合同类型编码
	 */
	private String contractCode;

	/**
	 * 合同类型名称
	 */
	private String contractName;

	/**
	 * 授权人编码
	 */
	private String certigierEmpSn;

	/**
	 * 授权人名称
	 */
	private String certigierEmpName;

	/**
	 * 授权时间开始
	 */
	private String delegatePowerStart;

	/**
	 * 授权时间结束
	 */
	private String delegatePowerEnd;

	/**
	 * 签约公司
	 */
	private List<LegDelegatePartnerDto> partnerList;

	/**
	 * 是否为确定金额 0：不是 1：是
	 */
	private String amountType;

	/**
	 * 被授权人编码（不确定金额）
	 */
	private String uncertainAmountSn;

	/**
	 * 被授权人名称（不确定金额）
	 */
	private String uncertainAmountName;

	/**
	 * 确定金额授权信息
	 */
	private List<LegDelegateCertainAmountDto> certainAmountList;

	/**
	 * 需求附件信息
	 */
	private LegAttachment attachmentInfo;

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

	public String getBizCode() {
		return bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizName() {
		return bizName;
	}

	public void setBizName(String bizName) {
		this.bizName = bizName;
	}

	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getCertigierEmpSn() {
		return certigierEmpSn;
	}

	public void setCertigierEmpSn(String certigierEmpSn) {
		this.certigierEmpSn = certigierEmpSn;
	}

	public String getCertigierEmpName() {
		return certigierEmpName;
	}

	public void setCertigierEmpName(String certigierEmpName) {
		this.certigierEmpName = certigierEmpName;
	}

	public String getDelegatePowerStart() {
		return delegatePowerStart;
	}

	public void setDelegatePowerStart(String delegatePowerStart) {
		this.delegatePowerStart = delegatePowerStart;
	}

	public String getDelegatePowerEnd() {
		return delegatePowerEnd;
	}

	public void setDelegatePowerEnd(String delegatePowerEnd) {
		this.delegatePowerEnd = delegatePowerEnd;
	}

	public List<LegDelegatePartnerDto> getPartnerList() {
		return partnerList;
	}

	public void setPartnerList(List<LegDelegatePartnerDto> partnerList) {
		this.partnerList = partnerList;
	}

	public String getAmountType() {
		return amountType;
	}

	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}

	public String getUncertainAmountSn() {
		return uncertainAmountSn;
	}

	public void setUncertainAmountSn(String uncertainAmountSn) {
		this.uncertainAmountSn = uncertainAmountSn;
	}

	public String getUncertainAmountName() {
		return uncertainAmountName;
	}

	public void setUncertainAmountName(String uncertainAmountName) {
		this.uncertainAmountName = uncertainAmountName;
	}

	public List<LegDelegateCertainAmountDto> getCertainAmountList() {
		return certainAmountList;
	}

	public void setCertainAmountList(List<LegDelegateCertainAmountDto> certainAmountList) {
		this.certainAmountList = certainAmountList;
	}

	public LegAttachment getAttachmentInfo() {
		return attachmentInfo;
	}

	public void setAttachmentInfo(LegAttachment attachmentInfo) {
		this.attachmentInfo = attachmentInfo;
	}

}
