package com.haier.hop.ms.legcontract.dto;

import java.util.List;

/**
 * 公共接口合同查询
 * 
 * @author wushilei
 * @date 2019/09/04
 */
public class CommonContractDto {
	/**
	 * 合同流水号
	 */
	private String contNo;

	/**
	 * 合同公议状态
	 */
	private String contStatus;

	/**
	 * 合同编号
	 */
	private String contNum;

	/**
	 * 合同名称
	 */
	private String contName;

	/**
	 * 我方签约单位
	 */
	private String msignComp;

	/**
	 * 合同查看链接地址
	 */
	private String contUrl;

	/**
	 * 流程轨迹
	 */
	private List<ContractReviewDto> table1;

	public String getContNo() {
		return contNo;
	}

	public void setContNo(String contNo) {
		this.contNo = contNo;
	}

	public String getContStatus() {
		return contStatus;
	}

	public void setContStatus(String contStatus) {
		this.contStatus = contStatus;
	}

	public String getContNum() {
		return contNum;
	}

	public void setContNum(String contNum) {
		this.contNum = contNum;
	}

	public String getContName() {
		return contName;
	}

	public void setContName(String contName) {
		this.contName = contName;
	}

	public String getMsignComp() {
		return msignComp;
	}

	public void setMsignComp(String msignComp) {
		this.msignComp = msignComp;
	}

	public String getContUrl() {
		return contUrl;
	}

	public void setContUrl(String contUrl) {
		this.contUrl = contUrl;
	}

	public List<ContractReviewDto> getTable1() {
		return table1;
	}

	public void setTable1(List<ContractReviewDto> table1) {
		this.table1 = table1;
	}

}
