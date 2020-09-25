package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 平台长授权业务单元表
 * </p>
 *
 * @author shiyingxin
 * @since 2019-09-20
 */
@TableName("leg_contract_delegate_business")
public class LegContractDelegateBusiness extends Model<LegContractDelegateBusiness> {

	private static final long serialVersionUID = 1L;

	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 业务单元编码
	 */
	@TableField("BIZ_CODE")
	private String bizCode;
	/**
	 * 业务单元名称
	 */
	@TableField("BIZ_NAME")
	private String bizName;
	/**
	 * 关联ID
	 */
	@TableField("RELA_ID")
	private String relaId;
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
	 * 删除标志
	 */
	@TableField("DELFLAG")
	private Integer delflag;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
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

	public String getRelaId() {
		return relaId;
	}

	public void setRelaId(String relaId) {
		this.relaId = relaId;
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

	public Integer getDelflag() {
		return delflag;
	}

	public void setDelflag(Integer delflag) {
		this.delflag = delflag;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegContractDelegateBusiness{" + "rowId=" + rowId + ", bizCode=" + bizCode + ", bizName=" + bizName
				+ ", relaId=" + relaId + ", createDate=" + createDate + ", createByEmpSn=" + createByEmpSn
				+ ", createByEmpName=" + createByEmpName + ", delflag=" + delflag + "}";
	}
}
