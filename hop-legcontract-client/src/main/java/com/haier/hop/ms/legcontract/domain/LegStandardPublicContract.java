package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 标准合同维护的公用合同
 * </p>
 *
 * @author shiyingxin
 * @since 2019-07-22
 */
@TableName("leg_standard_public_contract")
public class LegStandardPublicContract extends Model<LegStandardPublicContract> {

	private static final long serialVersionUID = 1L;

	/**
	 * 标准合同ID
	 */
	@TableField("CON_ID")
	private String conId;
	/**
	 * 附件id[删除]
	 */
	@TableField("ATT_ID")
	private String attId;
	/**
	 * 公用合同编码[删除]
	 */
	@TableField("CONTRACT_CODE")
	private String contractCode;
	/**
	 * 公用合同ID
	 */
	@TableField("CONTRACT_ID")
	private String contractId;
	@TableField("CREATE_TIME")
	private Date createTime;

	public String getConId() {
		return conId;
	}

	public void setConId(String conId) {
		this.conId = conId;
	}

	public String getAttId() {
		return attId;
	}

	public void setAttId(String attId) {
		this.attId = attId;
	}

	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegStandardPublicContract{" + "conId=" + conId + ", attId=" + attId + ", contractCode=" + contractCode
				+ ", contractId=" + contractId + ", createTime=" + createTime + "}";
	}
}
