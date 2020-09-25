package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 平台长授权签约公司
 * </p>
 *
 * @author shiyingxin
 * @since 2019-09-20
 */
@TableName("leg_contract_delegate_partners")
public class LegContractDelegatePartners extends Model<LegContractDelegatePartners> {

	private static final long serialVersionUID = 1L;

	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 公司编码
	 */
	@TableField("PARTNERS_NO")
	private String partnersNo;
	/**
	 * 公司名称
	 */
	@TableField("PARTNERS_NAME")
	private String partnersName;
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

	public String getPartnersNo() {
		return partnersNo;
	}

	public void setPartnersNo(String partnersNo) {
		this.partnersNo = partnersNo;
	}

	public String getPartnersName() {
		return partnersName;
	}

	public void setPartnersName(String partnersName) {
		this.partnersName = partnersName;
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
		return "LegContractDelegatePartners{" + "rowId=" + rowId + ", partnersNo=" + partnersNo + ", partnersName="
				+ partnersName + ", relaId=" + relaId + ", createDate=" + createDate + ", createByEmpSn="
				+ createByEmpSn + ", createByEmpName=" + createByEmpName + ", delflag=" + delflag + "}";
	}
}
