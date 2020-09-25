package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 不走合同用印新流程的规则表
 * </p>
 *
 * @author shiyingxin
 * @since 2019-09-19
 */
@TableName("leg_contract_nosealprocess")
public class LegContractNosealprocess extends Model<LegContractNosealprocess> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private BigDecimal rowId;
	/**
	 * 关联印章表ID
	 */
	@TableField("RELA_ID")
	private String relaId;
	/**
	 * 印章名称
	 */
	@TableField("SEAL_NAME")
	private String sealName;
	/**
	 * 业务单元编码
	 */
	@TableField("BUSINESS_UNIT_CODE")
	private String businessUnitCode;
	/**
	 * 业务单元名称
	 */
	@TableField("BUSINESS_UNIT_NAME")
	private String businessUnitName;

	public BigDecimal getRowId() {
		return rowId;
	}

	public void setRowId(BigDecimal rowId) {
		this.rowId = rowId;
	}

	public String getRelaId() {
		return relaId;
	}

	public void setRelaId(String relaId) {
		this.relaId = relaId;
	}

	public String getSealName() {
		return sealName;
	}

	public void setSealName(String sealName) {
		this.sealName = sealName;
	}

	public String getBusinessUnitCode() {
		return businessUnitCode;
	}

	public void setBusinessUnitCode(String businessUnitCode) {
		this.businessUnitCode = businessUnitCode;
	}

	public String getBusinessUnitName() {
		return businessUnitName;
	}

	public void setBusinessUnitName(String businessUnitName) {
		this.businessUnitName = businessUnitName;
	}

	@Override
	protected Serializable pkVal() {
		return this.rowId;
	}

	@Override
	public String toString() {
		return "LegContractNosealprocess{" + "rowId=" + rowId + ", relaId=" + relaId + ", sealName=" + sealName
				+ ", businessUnitCode=" + businessUnitCode + ", businessUnitName=" + businessUnitName + "}";
	}
}
