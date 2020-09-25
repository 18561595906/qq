package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 大平台长授权信息表
 * </p>
 *
 * @author shiyingxin
 * @since 2019-09-20
 */
@TableName("leg_contract_delegate_power")
public class LegContractDelegatePower extends Model<LegContractDelegatePower> {

	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 授权时间开始
	 */
	@TableField("DELEGATE_POWER_START_TIME")
	private String delegatePowerStartTime;
	/**
	 * 授权时间结束
	 */
	@TableField("DELEGATE_POWER_START_END")
	private String delegatePowerStartEnd;
	/**
	 * 授权人编码
	 */
	@TableField("CERTIGIER_EMP_SN")
	private String certigierEmpSn;
	/**
	 * 授权人名称
	 */
	@TableField("CERTIGIER_EMP_NAME")
	private String certigierEmpName;
	/**
	 * 删除标志1正常-1删除
	 */
	@TableField("DELFLAG")
	private Integer delflag;
	/**
	 * 授权状态1在授权时间内0不再授权时间内
	 */
	@TableField("STATUS")
	private Integer status;
	/**
	 * 创建时间
	 */
	@TableField("CREATE_DATE")
	private Date createDate;
	/**
	 * 创建人编码
	 */
	@TableField("CREATE_BY_EMP_SN")
	private String createByEmpSn;
	/**
	 * 创建人姓名
	 */
	@TableField("CREATE_BY_EMP_NAME")
	private String createByEmpName;
	/**
	 * 最后修改时间
	 */
	@TableField("LAST_MODIFICATION_DATE")
	private Date lastModificationDate;
	/**
	 * 最后修改人编码
	 */
	@TableField("LAST_MODIFICATION_BY_EMP_SN")
	private String lastModificationByEmpSn;
	/**
	 * 最后修改人姓名
	 */
	@TableField("LAST_MODIFICATION_BY_EMP_NAME")
	private String lastModificationByEmpName;
	/**
	 * 审批状态0正在审批1通过-1驳回
	 */
	@TableField("APPROVE_STATUS")
	private Integer approveStatus;
	/**
	 * 流程id
	 */
	@TableField("PROC_ID")
	private String procId;
	/**
	 * 抢单律师
	 */
	@TableField("AUDIT_LAWYER")
	private String auditLawyer;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getDelegatePowerStartTime() {
		return delegatePowerStartTime;
	}

	public void setDelegatePowerStartTime(String delegatePowerStartTime) {
		this.delegatePowerStartTime = delegatePowerStartTime;
	}

	public String getDelegatePowerStartEnd() {
		return delegatePowerStartEnd;
	}

	public void setDelegatePowerStartEnd(String delegatePowerStartEnd) {
		this.delegatePowerStartEnd = delegatePowerStartEnd;
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

	public Integer getDelflag() {
		return delflag;
	}

	public void setDelflag(Integer delflag) {
		this.delflag = delflag;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateByEmpSn() {
		return createByEmpSn;
	}

	public void setCreateByEmpSn(String createByEmpSn) {
		this.createByEmpSn = createByEmpSn;
	}

	public String getCreateByEmpName() {
		return createByEmpName;
	}

	public void setCreateByEmpName(String createByEmpName) {
		this.createByEmpName = createByEmpName;
	}

	public Date getLastModificationDate() {
		return lastModificationDate;
	}

	public void setLastModificationDate(Date lastModificationDate) {
		this.lastModificationDate = lastModificationDate;
	}

	public String getLastModificationByEmpSn() {
		return lastModificationByEmpSn;
	}

	public void setLastModificationByEmpSn(String lastModificationByEmpSn) {
		this.lastModificationByEmpSn = lastModificationByEmpSn;
	}

	public String getLastModificationByEmpName() {
		return lastModificationByEmpName;
	}

	public void setLastModificationByEmpName(String lastModificationByEmpName) {
		this.lastModificationByEmpName = lastModificationByEmpName;
	}

	public Integer getApproveStatus() {
		return approveStatus;
	}

	public void setApproveStatus(Integer approveStatus) {
		this.approveStatus = approveStatus;
	}

	public String getProcId() {
		return procId;
	}

	public void setProcId(String procId) {
		this.procId = procId;
	}

	public String getAuditLawyer() {
		return auditLawyer;
	}

	public void setAuditLawyer(String auditLawyer) {
		this.auditLawyer = auditLawyer;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegContractDelegatePower{" + "rowId=" + rowId + ", delegatePowerStartTime=" + delegatePowerStartTime
				+ ", delegatePowerStartEnd=" + delegatePowerStartEnd + ", certigierEmpSn=" + certigierEmpSn
				+ ", certigierEmpName=" + certigierEmpName + ", delflag=" + delflag + ", status=" + status
				+ ", createDate=" + createDate + ", createByEmpSn=" + createByEmpSn + ", createByEmpName="
				+ createByEmpName + ", lastModificationDate=" + lastModificationDate + ", lastModificationByEmpSn="
				+ lastModificationByEmpSn + ", lastModificationByEmpName=" + lastModificationByEmpName
				+ ", approveStatus=" + approveStatus + ", procId=" + procId + ", auditLawyer=" + auditLawyer + "}";
	}
}
