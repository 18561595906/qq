package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 合同申报乙方自动输入
 * </p>
 *
 * @author shiyingxin
 * @since 2019-07-29
 */
@TableName("leg_partner_input")
public class LegPartnerInput extends Model<LegPartnerInput> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private BigDecimal rowId;
	/**
	 * 合同类型编码
	 */
	@TableField("CONTRACT_CODE")
	private String contractCode;
	/**
	 * 合同类型名称
	 */
	@TableField("CONTRACT_NAME")
	private String contractName;
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
	 * 状态 1有效 0无效
	 */
	@TableField("ACTIVE_FLAG")
	private String activeFlag;

	public BigDecimal getRowId() {
		return rowId;
	}

	public void setRowId(BigDecimal rowId) {
		this.rowId = rowId;
	}

	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
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

	public String getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegPartnerInput{" + "rowId=" + rowId + ", contractCode=" + contractCode + ", contractName="
				+ contractName + ", bizCode=" + bizCode + ", bizName=" + bizName + ", activeFlag=" + activeFlag + "}";
	}
}
