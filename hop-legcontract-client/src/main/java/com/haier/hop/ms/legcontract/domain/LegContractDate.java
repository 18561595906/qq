package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 合同日期配置
 * </p>
 *
 * @author shiyingxin
 * @since 2019-07-22
 */
@TableName("leg_contract_date")
public class LegContractDate extends Model<LegContractDate> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private BigDecimal rowId;
	/**
	 * 合同编号
	 */
	@TableField("CONTRACT_CODE")
	private String contractCode;
	/**
	 * 合同名称
	 */
	@TableField("CONTRACT_NAME")
	private String contractName;
	/**
	 * 业务单元编号
	 */
	@TableField("BIZ_CODE")
	private String bizCode;
	/**
	 * 业务单元名称
	 */
	@TableField("BIZ_NAME")
	private String bizName;

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

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegContractDate{" + "rowId=" + rowId + ", contractCode=" + contractCode + ", contractName="
				+ contractName + ", bizCode=" + bizCode + ", bizName=" + bizName + "}";
	}
}
