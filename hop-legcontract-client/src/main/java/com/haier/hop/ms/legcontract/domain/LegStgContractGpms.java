package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 合同数据-GPMS
 * </p>
 *
 * @author shiyingxin
 * @since 2020-04-08
 */
@TableName("leg_stg_contract_gpms")
public class LegStgContractGpms extends Model<LegStgContractGpms> {

	private static final long serialVersionUID = 1L;

	/**
	 * 合同号
	 */
	@TableField("contract_no")
	private String contractNo;
	/**
	 * 合同名称
	 */
	@TableField("contract_name")
	private String contractName;
	/**
	 * 合同模板编号
	 */
	@TableField("contract_tem_no")
	private String contractTemNo;
	/**
	 * 合同类型
	 */
	@TableField("contract_type")
	private String contractType;
	/**
	 * 甲方
	 */
	@TableField("party_a")
	private String partyA;
	/**
	 * 乙方
	 */
	@TableField("party_b")
	private String partyB;
	/**
	 * 丙方
	 */
	@TableField("party_c")
	private String partyC;
	/**
	 * 合同生效时间
	 */
	@TableField("effective_date")
	private String effectiveDate;
	/**
	 * 签章方式
	 */
	private String confirmation;
	/**
	 * 同步时间
	 */
	@TableField("sync_time")
	private Date syncTime;
	/**
	 * 更新时间
	 */
	@TableField("update_time")
	private Date updateTime;

	@TableField(exist = false)
	private String effectiveDateFrom;

	@TableField(exist = false)
	private String effectiveDateTo;

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getContractTemNo() {
		return contractTemNo;
	}

	public void setContractTemNo(String contractTemNo) {
		this.contractTemNo = contractTemNo;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getPartyA() {
		return partyA;
	}

	public void setPartyA(String partyA) {
		this.partyA = partyA;
	}

	public String getPartyB() {
		return partyB;
	}

	public void setPartyB(String partyB) {
		this.partyB = partyB;
	}

	public String getPartyC() {
		return partyC;
	}

	public void setPartyC(String partyC) {
		this.partyC = partyC;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}

	public Date getSyncTime() {
		return syncTime;
	}

	public void setSyncTime(Date syncTime) {
		this.syncTime = syncTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getEffectiveDateFrom() {
		return effectiveDateFrom;
	}

	public void setEffectiveDateFrom(String effectiveDateFrom) {
		this.effectiveDateFrom = effectiveDateFrom;
	}

	public String getEffectiveDateTo() {
		return effectiveDateTo;
	}

	public void setEffectiveDateTo(String effectiveDateTo) {
		this.effectiveDateTo = effectiveDateTo;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegStgContractGpms{" + "contractNo=" + contractNo + ", contractName=" + contractName
				+ ", contractTemNo=" + contractTemNo + ", contractType=" + contractType + ", partyA=" + partyA
				+ ", partyB=" + partyB + ", partyC=" + partyC + ", effectiveDate=" + effectiveDate + ", confirmation="
				+ confirmation + ", syncTime=" + syncTime + ", updateTime=" + updateTime + "}";
	}
}
