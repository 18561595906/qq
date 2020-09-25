package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-07-22
 */
@TableName("leg_contract_favorites")
public class LegContractFavorites extends Model<LegContractFavorites> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 合同名称
	 */
	@TableField("CONTRACT_NAME")
	private String contractName;
	/**
	 * 合同编码
	 */
	@TableField("CONTRACT_CODE")
	private String contractCode;
	/**
	 * 创建人
	 */
	@TableField("CREATED_BY")
	private String createdBy;
	/**
	 * 创建时间
	 */
	@TableField("CREATED_DATE")
	private Date createdDate;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegContractFavorites{" + "rowId=" + rowId + ", contractName=" + contractName + ", contractCode="
				+ contractCode + ", createdBy=" + createdBy + ", createdDate=" + createdDate + "}";
	}
}
