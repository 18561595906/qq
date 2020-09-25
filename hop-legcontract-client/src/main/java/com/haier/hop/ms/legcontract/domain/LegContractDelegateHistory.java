package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 平台长授权历史
 * </p>
 *
 * @author shiyingxin
 * @since 2019-09-20
 */
@TableName("leg_contract_delegate_history")
public class LegContractDelegateHistory extends Model<LegContractDelegateHistory> {

	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 合同流水号
	 */
	@TableField("CONTRACT_NO")
	private String contractNo;
	/**
	 * 合同流程ID
	 */
	@TableField("PROC_ID")
	private String procId;
	/**
	 * 授权人编码
	 */
	@TableField("CERTIGIER_EMP_SN")
	private String certigierEmpSn;
	/**
	 * 被授权人编码
	 */
	@TableField("AUTHORIZED_EMP_SN")
	private String authorizedEmpSn;
	/**
	 * 审核时间
	 */
	@TableField("APPROVE_TIME")
	private String approveTime;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getProcId() {
		return procId;
	}

	public void setProcId(String procId) {
		this.procId = procId;
	}

	public String getCertigierEmpSn() {
		return certigierEmpSn;
	}

	public void setCertigierEmpSn(String certigierEmpSn) {
		this.certigierEmpSn = certigierEmpSn;
	}

	public String getAuthorizedEmpSn() {
		return authorizedEmpSn;
	}

	public void setAuthorizedEmpSn(String authorizedEmpSn) {
		this.authorizedEmpSn = authorizedEmpSn;
	}

	public String getApproveTime() {
		return approveTime;
	}

	public void setApproveTime(String approveTime) {
		this.approveTime = approveTime;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegContractDelegateHistory{" + "rowId=" + rowId + ", contractNo=" + contractNo + ", procId=" + procId
				+ ", certigierEmpSn=" + certigierEmpSn + ", authorizedEmpSn=" + authorizedEmpSn + ", approveTime="
				+ approveTime + "}";
	}
}
