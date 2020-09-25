package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 车小微信息
 * </p>
 *
 * @author shiyingxin
 * @since 2019-12-18
 */
@TableName("leg_cxw_branch")
public class LegCxwBranch extends Model<LegCxwBranch> {

	private static final long serialVersionUID = 1L;

	@TableId("row_id")
	private String rowId;
	/**
	 * 网点编号
	 */
	@TableField("branch_code")
	private String branchCode;
	/**
	 * 网点名称
	 */
	@TableField("branch_name")
	private String branchName;
//    /**
//     * 合同关联id
//     */
//    @TableField("rela_id")
//    private String relaId;
	/**
	 * 0：待用印 1：已终止 2：废止
	 */
	@TableField("is_used")
	private String isUsed;
	/**
	 * 创建时间
	 */
	@TableField("create_time")
	private Date createTime;
	/**
	 * 创建人
	 */
	@TableField("create_by")
	private String createBy;
	/**
	 * 流程实例号
	 */
	@TableField("proc_id")
	private String procId;
	/**
	 * 更新时间
	 */
	@TableField("update_time")
	private Date updateTime;
	/**
	 * 免登录Key
	 */
	private String authkey;
	/**
	 * 网点抓取类型
	 */
	@TableField("channel_type")
	private String channelType;
	/**
	 * 0:未回传 1:已回传
	 */
	@TableField("is_back")
	private String isBack;
	/**
	 * 中心名称
	 */
	@TableField("dept_name")
	private String deptName;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
//
//	public String getRelaId() {
//		return relaId;
//	}
//
//	public void setRelaId(String relaId) {
//		this.relaId = relaId;
//	}

	public String getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(String isUsed) {
		this.isUsed = isUsed;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getProcId() {
		return procId;
	}

	public void setProcId(String procId) {
		this.procId = procId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getAuthkey() {
		return authkey;
	}

	public void setAuthkey(String authkey) {
		this.authkey = authkey;
	}

	public String getChannelType() {
		return channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getIsBack() {
		return isBack;
	}

	public void setIsBack(String isBack) {
		this.isBack = isBack;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	protected Serializable pkVal() {
		return this.rowId;
	}

	@Override
	public String toString() {
		return "LegCxwBranch{" + "rowId=" + rowId + ", branchCode=" + branchCode + ", branchName=" + branchName
				+ ", relaId=" + "" + ", isUsed=" + isUsed + ", createTime=" + createTime + ", createBy=" + createBy
				+ ", procId=" + procId + ", updateTime=" + updateTime + ", authkey=" + authkey + ", channelType="
				+ channelType + ", isBack=" + isBack + ", deptName=" + deptName + "}";
	}
}
