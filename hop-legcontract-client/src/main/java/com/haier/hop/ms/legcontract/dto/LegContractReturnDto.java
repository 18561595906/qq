package com.haier.hop.ms.legcontract.dto;

import java.util.List;

import com.haier.hop.ms.legcontract.domain.LegSeal;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-25
 */
public class LegContractReturnDto {
	/**
	 * 合同id
	 */
	private String rowId;

	/**
	 * 合同流水号
	 */
	private String contNo;

	/**
	 * 合同临时流程id
	 */
	private String procId;

	/**
	 * 合同日期是否固定
	 */
	private boolean dateFixed;

	/**
	 * 是否可以设置里程碑信息
	 */
	private boolean canSetMilestone;

	/**
	 * 是否有快速通道
	 */
	private String hasFast;

	/**
	 * 是否重大合同
	 */
	private String isZDHT;

	/**
	 * 是否显示不确定金额
	 */
	private boolean showUncertainAmount;

	/**
	 * 是否显示保证金
	 */
	private boolean showDeposit;

	/**
	 * 是否选择批量合同选择框
	 */
	private boolean showBatchcontract;

	/**
	 * 签约方乙方是否可输入
	 */
	private boolean canInput;

	/**
	 * 是否只能选择非标合同
	 */
	private boolean nonstandard;

	/**
	 * 是否需要填写案件编号
	 */
	private boolean inputLcmsNo;

	/**
	 * 系统来源
	 */
	private String sysId;

	/**
	 * 提示信息
	 */
	private String message;

//	/**
//	 * 合同类型 非标/标准/按标准编辑
//	 */
//	private String contractType;

	/**
	 * 流程类型 内部/外部/借贷
	 */
	private String contractInsideType;

	/**
	 * 印章信息
	 */
	private List<LegSeal> sealInfo;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getContNo() {
		return contNo;
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

	public boolean isDateFixed() {
		return dateFixed;
	}

	public void setDateFixed(boolean dateFixed) {
		this.dateFixed = dateFixed;
	}

	public String getSysId() {
		return sysId;
	}

	public void setSysId(String sysId) {
		this.sysId = sysId;
	}

	public List<LegSeal> getSealInfo() {
		return sealInfo;
	}

	public void setSealInfo(List<LegSeal> sealInfo) {
		this.sealInfo = sealInfo;
	}

	public boolean isCanSetMilestone() {
		return canSetMilestone;
	}

	public void setCanSetMilestone(boolean canSetMilestone) {
		this.canSetMilestone = canSetMilestone;
	}

	public String getHasFast() {
		return hasFast;
	}

	public void setHasFast(String hasFast) {
		this.hasFast = hasFast;
	}

	public String getIsZDHT() {
		return isZDHT;
	}

	public void setIsZDHT(String isZDHT) {
		this.isZDHT = isZDHT;
	}

//	public String getContractType() {
//		return contractType;
//	}
//
//	public void setContractType(String contractType) {
//		this.contractType = contractType;
//	}

	public boolean isShowUncertainAmount() {
		return showUncertainAmount;
	}

	public void setShowUncertainAmount(boolean showUncertainAmount) {
		this.showUncertainAmount = showUncertainAmount;
	}

	public boolean isShowDeposit() {
		return showDeposit;
	}

	public void setShowDeposit(boolean showDeposit) {
		this.showDeposit = showDeposit;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isShowBatchcontract() {
		return showBatchcontract;
	}

	public boolean isInputLcmsNo() {
		return inputLcmsNo;
	}

	public void setInputLcmsNo(boolean inputLcmsNo) {
		this.inputLcmsNo = inputLcmsNo;
	}

	public void setShowBatchcontract(boolean showBatchcontract) {
		this.showBatchcontract = showBatchcontract;
	}

	public String getContractInsideType() {
		return contractInsideType;
	}

	public void setContractInsideType(String contractInsideType) {
		this.contractInsideType = contractInsideType;
	}

	public boolean isCanInput() {
		return canInput;
	}

	public void setCanInput(boolean canInput) {
		this.canInput = canInput;
	}

	public boolean isNonstandard() {
		return nonstandard;
	}

	public void setNonstandard(boolean nonstandard) {
		this.nonstandard = nonstandard;
	}

}
