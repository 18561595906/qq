package com.haier.hop.ms.legcontract.domain;

import lombok.Data;

@Data
public class LegBCCAdditionalData {

	/**
	 * leg_contract_bcc_extra
	 */
	private int id;

	// 合同
	private String contractId;

	// json字符串
	private String value;

	// 创建时间
	private String createTime;

	// 更新时间
	private String updateTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

}
