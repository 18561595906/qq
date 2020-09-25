package com.haier.hop.ms.legcontract.dto;

import java.util.List;

import com.haier.hop.ms.legcontract.domain.LegAttachment;

/**
 *   封装海模智云合同回传状态接口需要的参数
 * @author ltd
 *
 */
public class HmzyStateDto {
	
	// 合同编号（海模智云系统，对应合同信息传输接口contract_id）
	private String contractId;
	
	// 云超市合同编号
	private String ContractNo;
	
	/*1、待发起合同 2、合同已发起 3、待用印申请 4、内部（海尔）先用印  5、外部先用印  6、全部内部用印  7、外部用印完成 8、全部用印完成 
	  9、内部退回（回到用印申请）10、外部退回（回到用印申请）11、合同驳回（回到合同发起页）12、已发起用印申请13、合同归档（线下流程）*/
	private String printType;
	
	// 用印跳转链接（合同发起链接）
	private String printUrl;
	
	// 下载跳转链接
	private String viewUrl;
	
	// 用印方工号
	private String printCode;
	
	// 用印方名称
	private String printName;
	
	// 更新时间,使用时间戳System.currentTimeMillis()
	private String printDate;
	
	// 归档附件
	private List<LegAttachment> attachments;

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getContractNo() {
		return ContractNo;
	}

	public void setContractNo(String contractNo) {
		ContractNo = contractNo;
	}

	public String getPrintType() {
		return printType;
	}

	public void setPrintType(String printType) {
		this.printType = printType;
	}

	public String getPrintUrl() {
		return printUrl;
	}

	public void setPrintUrl(String printUrl) {
		this.printUrl = printUrl;
	}

	public String getViewUrl() {
		return viewUrl;
	}

	public void setViewUrl(String viewUrl) {
		this.viewUrl = viewUrl;
	}

	public String getPrintCode() {
		return printCode;
	}

	public void setPrintCode(String printCode) {
		this.printCode = printCode;
	}

	public String getPrintName() {
		return printName;
	}

	public void setPrintName(String printName) {
		this.printName = printName;
	}

	public String getPrintDate() {
		return printDate;
	}

	public void setPrintDate(String printDate) {
		this.printDate = printDate;
	}

	public List<LegAttachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<LegAttachment> attachments) {
		this.attachments = attachments;
	}
	
}
