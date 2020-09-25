package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 电子用印标识记录表
 * </p>
 *
 * @author shiyingxin
 * @since 2019-07-05
 */
@TableName("leg_contract_flag_dzht")
public class LegContractFlagDzht extends Model<LegContractFlagDzht> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 流程编号
	 */
	@TableField("PROC_ID")
	private String procId;
	/**
	 * 文件ID
	 */
	@TableField("FILE_ID")
	private String fileId;
	@TableField("EMP_NO")
	private String empNo;
	/**
	 * 文件预览URL
	 */
	@TableField("VIEW_URL")
	private String viewUrl;
	@TableField("CRT_TIME")
	private Date crtTime;
	@TableField("LST_UPD_TIME")
	private Date lstUpdTime;
	@TableField("SYS_ID")
	private String sysId;
	/**
	 * 印章编码
	 */
	@TableField("SEAL_NO")
	private String sealNo;

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

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getViewUrl() {
		return viewUrl;
	}

	public void setViewUrl(String viewUrl) {
		this.viewUrl = viewUrl;
	}

	public Date getCrtTime() {
		return crtTime;
	}

	public void setCrtTime(Date crtTime) {
		this.crtTime = crtTime;
	}

	public Date getLstUpdTime() {
		return lstUpdTime;
	}

	public void setLstUpdTime(Date lstUpdTime) {
		this.lstUpdTime = lstUpdTime;
	}

	public String getSysId() {
		return sysId;
	}

	public void setSysId(String sysId) {
		this.sysId = sysId;
	}

	public String getSealNo() {
		return sealNo;
	}

	public void setSealNo(String sealNo) {
		this.sealNo = sealNo;
	}

	@Override
	protected Serializable pkVal() {
		return this.rowId;
	}

	@Override
	public String toString() {
		return "LegContractFlagDzht{" + "rowId=" + rowId + ", procId=" + procId + ", fileId=" + fileId + ", empNo="
				+ empNo + ", viewUrl=" + viewUrl + ", crtTime=" + crtTime + ", lstUpdTime=" + lstUpdTime + ", sysId="
				+ sysId + ", sealNo=" + sealNo + "}";
	}
}
