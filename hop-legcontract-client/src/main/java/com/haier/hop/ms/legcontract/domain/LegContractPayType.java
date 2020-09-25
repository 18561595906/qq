package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 合同的付款方式
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-18
 */
@TableName("leg_contract_pay_type")
public class LegContractPayType extends Model<LegContractPayType> {

	private static final long serialVersionUID = 1L;

	/**
	 * 编码
	 */
	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 合同编码
	 */
	@TableField("CONTRACT_ID")
	private String contractId;
	/**
	 * 付款方式编码
	 */
	@TableField("PAY_TYPE_CODE")
	private String payTypeCode;
	/**
	 * 付款方式名称
	 */
	@TableField("PAY_TYPE_NAME")
	private String payTypeName;
	/**
	 * 创建时间
	 */
	@TableField("CREATE_TIME")
	private Date createTime;
	/**
	 * 付款方式说明
	 */
	@TableField("PAY_TYPE_MES")
	private String payTypeMes;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getPayTypeCode() {
		return payTypeCode;
	}

	public void setPayTypeCode(String payTypeCode) {
		this.payTypeCode = payTypeCode;
	}

	public String getPayTypeName() {
		return payTypeName;
	}

	public void setPayTypeName(String payTypeName) {
		this.payTypeName = payTypeName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getPayTypeMes() {
		return payTypeMes;
	}

	public void setPayTypeMes(String payTypeMes) {
		this.payTypeMes = payTypeMes;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegContractPayType{" + "rowId=" + rowId + ", contractId=" + contractId + ", payTypeCode=" + payTypeCode
				+ ", payTypeName=" + payTypeName + ", createTime=" + createTime + ", payTypeMes=" + payTypeMes + "}";
	}
}
