package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 平台长授权金额范围授权表
 * </p>
 *
 * @author shiyingxin
 * @since 2019-09-20
 */
@TableName("leg_contract_delegate_scope")
public class LegContractDelegateScope extends Model<LegContractDelegateScope> {

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
	 * 合同人民币总金额开始
	 */
	@TableField("CONTRMB_TOTAL_START")
	private BigDecimal contrmbTotalStart;
	/**
	 * 合同人民币总金额结束
	 */
	@TableField("CONTRMB_TOTAL_END")
	private BigDecimal contrmbTotalEnd;
	/**
	 * 被授权人编码
	 */
	@TableField("AUTHORIZED_EMP_SN")
	private String authorizedEmpSn;
	/**
	 * 被授权人名称
	 */
	@TableField("AUTHORIZED_EMP_NAME")
	private String authorizedEmpName;
	/**
	 * 是否为确定金额0不是1是
	 */
	@TableField("IS_ASSESS")
	private Integer isAssess;

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

	public BigDecimal getContrmbTotalStart() {
		return contrmbTotalStart;
	}

	public void setContrmbTotalStart(BigDecimal contrmbTotalStart) {
		this.contrmbTotalStart = contrmbTotalStart;
	}

	public BigDecimal getContrmbTotalEnd() {
		return contrmbTotalEnd;
	}

	public void setContrmbTotalEnd(BigDecimal contrmbTotalEnd) {
		this.contrmbTotalEnd = contrmbTotalEnd;
	}

	public String getAuthorizedEmpSn() {
		return authorizedEmpSn;
	}

	public void setAuthorizedEmpSn(String authorizedEmpSn) {
		this.authorizedEmpSn = authorizedEmpSn;
	}

	public String getAuthorizedEmpName() {
		return authorizedEmpName;
	}

	public void setAuthorizedEmpName(String authorizedEmpName) {
		this.authorizedEmpName = authorizedEmpName;
	}

	public Integer getIsAssess() {
		return isAssess;
	}

	public void setIsAssess(Integer isAssess) {
		this.isAssess = isAssess;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegContractDelegateScope{" + "rowId=" + rowId + ", relaId=" + relaId + ", createDate=" + createDate
				+ ", createByEmpSn=" + createByEmpSn + ", createByEmpName=" + createByEmpName + ", delflag=" + delflag
				+ ", contrmbTotalStart=" + contrmbTotalStart + ", contrmbTotalEnd=" + contrmbTotalEnd
				+ ", authorizedEmpSn=" + authorizedEmpSn + ", authorizedEmpName=" + authorizedEmpName + ", isAssess="
				+ isAssess + "}";
	}
}
