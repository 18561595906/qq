package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 平台长授权合同类型表
 * </p>
 *
 * @author shiyingxin
 * @since 2019-09-20
 */
@TableName("leg_contract_delegate_con_type")
public class LegContractDelegateConType extends Model<LegContractDelegateConType> {

	private static final long serialVersionUID = 1L;

	@TableId("ROW_ID")
	private String rowId;
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
	/**
	 * 合同类型编码
	 */
	@TableField("CONT_TYPE_CODE")
	private String contTypeCode;
	/**
	 * 合同类型名称
	 */
	@TableField("CONT_TYPE_NAME")
	private String contTypeName;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
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

	public String getContTypeCode() {
		return contTypeCode;
	}

	public void setContTypeCode(String contTypeCode) {
		this.contTypeCode = contTypeCode;
	}

	public String getContTypeName() {
		return contTypeName;
	}

	public void setContTypeName(String contTypeName) {
		this.contTypeName = contTypeName;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegContractDelegateConType{" + "rowId=" + rowId + ", relaId=" + relaId + ", createDate=" + createDate
				+ ", createByEmpSn=" + createByEmpSn + ", createByEmpName=" + createByEmpName + ", delflag=" + delflag
				+ ", contTypeCode=" + contTypeCode + ", contTypeName=" + contTypeName + "}";
	}
}
