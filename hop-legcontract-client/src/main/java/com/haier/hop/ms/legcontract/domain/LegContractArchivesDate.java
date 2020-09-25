package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 是否先用印点选时，预定归档时间存储表
 * </p>
 *
 * @author shiyingxin
 * @since 2019-07-15
 */
@TableName("leg_contract_archives_date")
public class LegContractArchivesDate extends Model<LegContractArchivesDate> {

	private static final long serialVersionUID = 1L;

	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 流程ID
	 */
	@TableField("PROC_ID")
	private String procId;
	/**
	 * 预定归档时间
	 */
	@TableField("ARCHIVES_DATE")
	private Date archivesDate;
	/**
	 * 来源类型 0:预计归档时间 2：实际归档时间
	 */
	@TableField("TYPE")
	private String type;
	/**
	 * 员工ID
	 */
	@TableField("USER_ID")
	private String userId;
	/**
	 * 备注
	 */
	@TableField("REMARK")
	private String remark;
	/**
	 * 创建时间
	 */
	@TableField("CREATE_DATE")
	private Date createDate;
	/**
	 * 关联印章编码
	 */
	@TableField("RELA_ID")
	private String relaId;
	/**
	 * 归档时间状态 有效1 无效0
	 */
	@TableField("ACTIVE_FALG")
	private String activeFalg;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getProcId() {
		return procId;
	}

	public void setProcId(String procId) {
		this.procId = procId;
	}

	public Date getArchivesDate() {
		return archivesDate;
	}

	public void setArchivesDate(Date archivesDate) {
		this.archivesDate = archivesDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getRelaId() {
		return relaId;
	}

	public void setRelaId(String relaId) {
		this.relaId = relaId;
	}

	public String getActiveFalg() {
		return activeFalg;
	}

	public void setActiveFalg(String activeFalg) {
		this.activeFalg = activeFalg;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegContractArchivesDate{" + "rowId=" + rowId + ", procId=" + procId + ", archivesDate=" + archivesDate
				+ ", type=" + type + ", userId=" + userId + ", remark=" + remark + ", createDate=" + createDate
				+ ", relaId=" + relaId + ", activeFalg=" + activeFalg + "}";
	}
}
