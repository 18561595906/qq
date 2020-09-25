package com.haier.hop.ms.legcontract.dto;

import java.math.BigDecimal;
import java.util.List;

import com.haier.hop.ms.legcontract.domain.LegDictionary;

/**
 * <p>
 *  关联交易额度占用使用dto
 * </p>
 *
 * @author liugan
 * @since 2019-10-11
 */
public class ContractAmountDto {

	// 公司类型
	private String companyType;
	
	// 剩余额度
	private BigDecimal contractAmount;

	// 公司编码
	private String companyCode;
	
	// 合同类型id(选择项)
	private String contractTypeId;
	
	// 合同名称+合同类型
	private String companyName;
	
	// 总额度
	private BigDecimal contractAmountAll;
	
	// 交易类型id(选择项)
	private String transationTypeId;
	
	// 合同类型（下拉框）
	private List<LegDictionary> contractTypeList;
	
	// 交易类型（下拉框）
	private List<LegDictionary> transationTypeList;
	
	// 交易类型显示控制
	private boolean showTransationType;
	
	// 没有额度时，提示信息
	private String noAmountPrompt;
	
	public boolean isShowTransationType() {
		return showTransationType;
	}

	public void setShowTransationType(boolean showTransationType) {
		this.showTransationType = showTransationType;
	}

	public String getNoAmountPrompt() {
		return noAmountPrompt;
	}

	public void setNoAmountPrompt(String noAmountPrompt) {
		this.noAmountPrompt = noAmountPrompt;
	}

	public String getTransationTypeId() {
		return transationTypeId;
	}

	public void setTransationTypeId(String transationTypeId) {
		this.transationTypeId = transationTypeId;
	}

	public List<LegDictionary> getContractTypeList() {
		return contractTypeList;
	}

	public void setContractTypeList(List<LegDictionary> contractTypeList) {
		this.contractTypeList = contractTypeList;
	}

	public List<LegDictionary> getTransationTypeList() {
		return transationTypeList;
	}

	public void setTransationTypeList(List<LegDictionary> transationTypeList) {
		this.transationTypeList = transationTypeList;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public BigDecimal getContractAmountAll() {
		return contractAmountAll;
	}

	public void setContractAmountAll(BigDecimal contractAmountAll) {
		this.contractAmountAll = contractAmountAll;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getContractTypeId() {
		return contractTypeId;
	}

	public void setContractTypeId(String contractTypeId) {
		this.contractTypeId = contractTypeId;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public BigDecimal getContractAmount() {
		return contractAmount;
	}

	public void setContractAmount(BigDecimal contractAmount) {
		this.contractAmount = contractAmount;
	} 
	
}
