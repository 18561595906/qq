package com.haier.hop.ms.legcontractown.dto;

import java.util.List;

import com.haier.hop.ms.legcontract.domain.LegAttachment;
import com.haier.hop.ms.legcontract.domain.LegContractArchives;
import com.haier.hop.ms.legcontract.domain.LegSeal;
import com.haier.hop.ms.legcontractown.domain.LegOverseasBrand;
import com.haier.hop.ms.legcontractown.domain.LegOverseasContractSeal;
import com.haier.hop.ms.legcontractown.domain.LegOverseasHisAttachment;
import com.haier.hop.ms.legcontractown.domain.LegOverseasHope;
import com.haier.hop.ms.legcontractown.domain.LegOverseasListMdm;
import com.haier.hop.ms.legcontractown.domain.LegOverseasNode;
import com.haier.hop.ms.legcontractown.domain.VLegOverserContractAll;

/**
 * <p>
 * </p>
 *
 * @author xuejinxin
 * @since 2020-04-15
 */
public class OverseasChangeDto extends VLegOverserContractAll {
	private static final long serialVersionUID = 1L;
	private List<String> countrys;// 客户国家多选list
	private List<LegOverseasBrand> brands;
	private List<LegOverseasListMdm> countryMdms;// 国家下拉框list
	private String countryName;
	private List<ContractPriceDto> priceDtos;// 合同金额
	private List<ContractPriceDto> avgPriceDtos;// 年均合同金额
	private String avoidSchemebDesc;// 风险规避方案其他时的描述
	private List<String> dealTypeList;// 成交方式多选list
	private String dealTypeDesc;// 成交方式其他时的描述
	private List<String> saleAreaCountryList;// 产品销售区域多选list
	private String afterSalesDesc;// 售后服务的描述
	private List<String> currencyList;// 合同货币多选list
	private String currencyDesc;// 合同货币其他时的描述
	private List<String> signerList;// 签约主体多选list
	private String signerDesc;// 签约主体其他时的描述
	private List<String> fromCountryList;// 目的国家多选list
	private List<LegOverseasContractSeal> sealList; // 用印list
	private String sealOtherName; // 用印名称 其他时
	private List<LegOverseasHisAttachment> attachments;
	private List<LegOverseasNode> nodes;// 节点信息
	private List<LegOverseasNode> sealNames;// 用印名称信息
	private String applierName;
	private String applierTel;
	private String applierPhone;
	private String applierEmail;
	private String flg;// 暂存区分（0：暂存 1：提交）
	private String proId;// 流程号
	private String taskId;// 任务Id
	private String nodeId;
	private String taskKey;
	private String nodeName;
	private String nodeDesc;
	private String result;
	private String resultDesc;
	private LegSeal sealInfo;
	private List<LegAttachment> attachmentPdfs;// 合同归档文件
	private LegContractArchives archives;// 合同归档表
	private List<LegOverseasHope> Hopes;// 合同hop表
	private String assigneeSn;
	private String assigneeName;
	// 新合同信息
	private List<LegOverseasHisAttachment> attachmentChanges;
	private List<LegAttachment> attachmentChangePdfs;// 合同归档文件
	private VLegOverserContractAll newContract;// 新合同数据
	private List<String> changeList;// 变更项
	private String sealOtherNewName; // 用印名称 其他时
	private List<String> currencyNewList;// 合同货币多选list
	private String currencyNewDesc;// 合同货币其他时的描述
	private List<ContractPriceDto> priceNewDtos;// 合同金额
	private List<ContractPriceDto> avgPriceNewDtos;// 年均合同金额
	private List<String> dealTypeNewList;// 成交方式多选list
	private String dealTypeNewDesc;// 成交方式其他时的描述
	private List<String> signerNewList;// 签约主体多选list
	private String signerNewDesc;// 签约主体其他时的描述
	private List<LegOverseasNode> newNodes;// 节点信息

	public List<String> getChangeList() {
		return changeList;
	}

	public void setChangeList(List<String> changeList) {
		this.changeList = changeList;
	}

	public List<String> getCurrencyNewList() {
		return currencyNewList;
	}

	public List<LegOverseasHisAttachment> getAttachmentChanges() {
		return attachmentChanges;
	}

	public void setAttachmentChanges(List<LegOverseasHisAttachment> attachmentChanges) {
		this.attachmentChanges = attachmentChanges;
	}

	public String getSealOtherNewName() {
		return sealOtherNewName;
	}

	public void setSealOtherNewName(String sealOtherNewName) {
		this.sealOtherNewName = sealOtherNewName;
	}

	public void setCurrencyNewList(List<String> currencyNewList) {
		this.currencyNewList = currencyNewList;
	}

	public String getCurrencyNewDesc() {
		return currencyNewDesc;
	}

	public void setCurrencyNewDesc(String currencyNewDesc) {
		this.currencyNewDesc = currencyNewDesc;
	}

	public List<ContractPriceDto> getPriceNewDtos() {
		return priceNewDtos;
	}

	public void setPriceNewDtos(List<ContractPriceDto> priceNewDtos) {
		this.priceNewDtos = priceNewDtos;
	}

	public List<ContractPriceDto> getAvgPriceNewDtos() {
		return avgPriceNewDtos;
	}

	public void setAvgPriceNewDtos(List<ContractPriceDto> avgPriceNewDtos) {
		this.avgPriceNewDtos = avgPriceNewDtos;
	}

	public List<String> getDealTypeNewList() {
		return dealTypeNewList;
	}

	public void setDealTypeNewList(List<String> dealTypeNewList) {
		this.dealTypeNewList = dealTypeNewList;
	}

	public String getDealTypeNewDesc() {
		return dealTypeNewDesc;
	}

	public void setDealTypeNewDesc(String dealTypeNewDesc) {
		this.dealTypeNewDesc = dealTypeNewDesc;
	}

	public List<String> getSignerNewList() {
		return signerNewList;
	}

	public void setSignerNewList(List<String> signerNewList) {
		this.signerNewList = signerNewList;
	}

	public String getSignerNewDesc() {
		return signerNewDesc;
	}

	public void setSignerNewDesc(String signerNewDesc) {
		this.signerNewDesc = signerNewDesc;
	}

	public String getAssigneeSn() {
		return assigneeSn;
	}

	public void setAssigneeSn(String assigneeSn) {
		this.assigneeSn = assigneeSn;
	}

	public String getAssigneeName() {
		return assigneeName;
	}

	public List<LegAttachment> getAttachmentChangePdfs() {
		return attachmentChangePdfs;
	}

	public void setAttachmentChangePdfs(List<LegAttachment> attachmentChangePdfs) {
		this.attachmentChangePdfs = attachmentChangePdfs;
	}

	public void setAssigneeName(String assigneeName) {
		this.assigneeName = assigneeName;
	}

	public List<String> getCountrys() {
		return countrys;
	}

	public List<LegAttachment> getAttachmentPdfs() {
		return attachmentPdfs;
	}

	public List<LegOverseasNode> getNewNodes() {
		return newNodes;
	}

	public void setNewNodes(List<LegOverseasNode> newNodes) {
		this.newNodes = newNodes;
	}

	public VLegOverserContractAll getNewContract() {
		return newContract;
	}

	public void setNewContract(VLegOverserContractAll newContract) {
		this.newContract = newContract;
	}

	public void setAttachmentPdfs(List<LegAttachment> attachmentPdfs) {
		this.attachmentPdfs = attachmentPdfs;
	}

	public LegSeal getSealInfo() {
		return sealInfo;
	}

	public LegContractArchives getArchives() {
		return archives;
	}

	public List<LegOverseasHope> getHopes() {
		return Hopes;
	}

	public void setHopes(List<LegOverseasHope> hopes) {
		Hopes = hopes;
	}

	public void setArchives(LegContractArchives archives) {
		this.archives = archives;
	}

	public void setSealInfo(LegSeal sealInfo) {
		this.sealInfo = sealInfo;
	}

	public String getTaskKey() {
		return taskKey;
	}

	public void setTaskKey(String taskKey) {
		this.taskKey = taskKey;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getNodeDesc() {
		return nodeDesc;
	}

	public void setNodeDesc(String nodeDesc) {
		this.nodeDesc = nodeDesc;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getResultDesc() {
		return resultDesc;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}

	public void setCountrys(List<String> countrys) {
		this.countrys = countrys;
	}

	public List<LegOverseasBrand> getBrands() {
		return brands;
	}

	public void setBrands(List<LegOverseasBrand> brands) {
		this.brands = brands;
	}

	public List<LegOverseasListMdm> getCountryMdms() {
		return countryMdms;
	}

	public String getSealOtherName() {
		return sealOtherName;
	}

	public void setSealOtherName(String sealOtherName) {
		this.sealOtherName = sealOtherName;
	}

	public String getFlg() {
		return flg;
	}

	public void setFlg(String flg) {
		this.flg = flg;
	}

	public List<LegOverseasNode> getSealNames() {
		return sealNames;
	}

	public void setSealNames(List<LegOverseasNode> sealNames) {
		this.sealNames = sealNames;
	}

	public void setCountryMdms(List<LegOverseasListMdm> countryMdms) {
		this.countryMdms = countryMdms;
	}

	public List<LegOverseasNode> getNodes() {
		return nodes;
	}

	public String getProId() {
		return proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public void setNodes(List<LegOverseasNode> nodes) {
		this.nodes = nodes;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public List<ContractPriceDto> getAvgPriceDtos() {
		return avgPriceDtos;
	}

	public void setAvgPriceDtos(List<ContractPriceDto> avgPriceDtos) {
		this.avgPriceDtos = avgPriceDtos;
	}

	public String getAfterSalesDesc() {
		return afterSalesDesc;
	}

	public void setAfterSalesDesc(String afterSalesDesc) {
		this.afterSalesDesc = afterSalesDesc;
	}

	public List<ContractPriceDto> getPriceDtos() {
		return priceDtos;
	}

	public String getAvoidSchemebDesc() {
		return avoidSchemebDesc;
	}

	public void setAvoidSchemebDesc(String avoidSchemebDesc) {
		this.avoidSchemebDesc = avoidSchemebDesc;
	}

	public String getCurrencyDesc() {
		return currencyDesc;
	}

	public void setCurrencyDesc(String currencyDesc) {
		this.currencyDesc = currencyDesc;
	}

	public void setPriceDtos(List<ContractPriceDto> priceDtos) {
		this.priceDtos = priceDtos;
	}

	public String getDealTypeDesc() {
		return dealTypeDesc;
	}

	public void setDealTypeDesc(String dealTypeDesc) {
		this.dealTypeDesc = dealTypeDesc;
	}

	public String getSignerDesc() {
		return signerDesc;
	}

	public void setSignerDesc(String signerDesc) {
		this.signerDesc = signerDesc;
	}

	public List<String> getDealTypeList() {
		return dealTypeList;
	}

	public void setDealTypeList(List<String> dealTypeList) {
		this.dealTypeList = dealTypeList;
	}

	public List<String> getSaleAreaCountryList() {
		return saleAreaCountryList;
	}

	public void setSaleAreaCountryList(List<String> saleAreaCountryList) {
		this.saleAreaCountryList = saleAreaCountryList;
	}

	public List<String> getCurrencyList() {
		return currencyList;
	}

	public void setCurrencyList(List<String> currencyList) {
		this.currencyList = currencyList;
	}

	public List<String> getSignerList() {
		return signerList;
	}

	public void setSignerList(List<String> signerList) {
		this.signerList = signerList;
	}

	public List<String> getFromCountryList() {
		return fromCountryList;
	}

	public void setFromCountryList(List<String> fromCountryList) {
		this.fromCountryList = fromCountryList;
	}

	public List<LegOverseasContractSeal> getSealList() {
		return sealList;
	}

	public void setSealList(List<LegOverseasContractSeal> sealList) {
		this.sealList = sealList;
	}

	public List<LegOverseasHisAttachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<LegOverseasHisAttachment> attachments) {
		this.attachments = attachments;
	}

	public String getApplierName() {
		return applierName;
	}

	public void setApplierName(String applierName) {
		this.applierName = applierName;
	}

	public String getApplierTel() {
		return applierTel;
	}

	public void setApplierTel(String applierTel) {
		this.applierTel = applierTel;
	}

	public String getApplierPhone() {
		return applierPhone;
	}

	public void setApplierPhone(String applierPhone) {
		this.applierPhone = applierPhone;
	}

	public String getApplierEmail() {
		return applierEmail;
	}

	public void setApplierEmail(String applierEmail) {
		this.applierEmail = applierEmail;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
