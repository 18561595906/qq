package com.haier.hop.ms.legcontract.domain;

import lombok.Data;

@Data
public class LegDeconstructionPage {

	private int id;

	// 合同编码
	private String contractCode;

	// 合同名称
	private String contractName;

	// 父级合同名称，传BCC用
	private String contractParentname;

	// json
	private String attribute;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getContractParentname() {
		return contractParentname;
	}

	public void setContractParentname(String contractParentname) {
		this.contractParentname = contractParentname;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

}
