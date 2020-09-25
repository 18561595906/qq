package com.haier.hop.ms.legcontract.dto;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-12-16
 */
public class LegContractReportDto {

	// 合同所属项目编码
	private String projectCode;
	// 合同所属项目名称
	private String projectName;
	// 合同名称
	private String contractName;
	// 合同流水号
	private String contNo;
	// 合同编号
	private String contractNo;
	// 合同编码
	private String contractCode;
	// 合同状态
	private String contStatus;
	// 申请时间
	private String createTime;
	// 业务单元编码
	private String bizCode;
	// 业务单元
	private String bizName;
	// 合同分类
	private String contractAlias;
	// 原合同编号
	private String relatedMecCode;
	// 申请人工号
	private String applierId;
	// 申请人姓名
	private String applierName;
	// 审核律师
	private String lawyerName;
	// 审核时长
	private String reviewTime;
	// 经办人工号
	private String assigneeSn;
	// 经办人姓名
	private String assigneeName;
	// 甲方签约单位
	private String contractPartner1;
	// 乙方签约单位
	private String contractPartner2;
	// 丙方签约单位
	private String contractPartner3;
	// 丁方签约单位
	private String contractPartner4;
	// 用印类型
	private String sealType;
	// 前端系统编号
	private String beforecontractNo;
	// 原合同编码
	private String contractNoOld;
	// 合同类型
	private String contractType;
	// 流程类型
	private String procType;
	// 来源系统
	private String sysFrom;
	// 流程id
	private String procId;
	// 合同背景
	private String backgroud;
	// 收付款类型（1：海尔为收款方 2：海尔为付款方 3：无款项收付 4：甲方为收款方 5：甲方为付款方）
	private String payType;
	// 付款金额
	private String payAmount;
	// 付款金额人民币
	private String payCurrency;
	// 付款币种
	private String payCny;
	// 大写金额
	private String upperAmount;
	// 合同标的物
	private String corpore;
	// 合同表单查看链接地址
	private String url;
	// 开始时间
	private String beginDate;
	// 结束时间
	private String endDate;
	// 是否有起止日期
	private String isBegintoend;
	// 新老系统区分 1：新系统 2：老系统
	private String kbn;

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getContNo() {
		return contNo;
	}

	public void setContNo(String contNo) {
		this.contNo = contNo;
	}

	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getContStatus() {
		return contStatus;
	}

	public void setContStatus(String contStatus) {
		this.contStatus = contStatus;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getBizName() {
		return bizName;
	}

	public void setBizName(String bizName) {
		this.bizName = bizName;
	}

	public String getContractAlias() {
		return contractAlias;
	}

	public void setContractAlias(String contractAlias) {
		this.contractAlias = contractAlias;
	}

	public String getRelatedMecCode() {
		return relatedMecCode;
	}

	public void setRelatedMecCode(String relatedMecCode) {
		this.relatedMecCode = relatedMecCode;
	}

	public String getApplierId() {
		return applierId;
	}

	public void setApplierId(String applierId) {
		this.applierId = applierId;
	}

	public String getApplierName() {
		return applierName;
	}

	public void setApplierName(String applierName) {
		this.applierName = applierName;
	}

	public String getLawyerName() {
		return lawyerName;
	}

	public void setLawyerName(String lawyerName) {
		this.lawyerName = lawyerName;
	}

	public String getReviewTime() {
		return reviewTime;
	}

	public void setReviewTime(String reviewTime) {
		this.reviewTime = reviewTime;
	}

	public String getContractPartner1() {
		return contractPartner1;
	}

	public void setContractPartner1(String contractPartner1) {
		this.contractPartner1 = contractPartner1;
	}

	public String getContractPartner2() {
		return contractPartner2;
	}

	public void setContractPartner2(String contractPartner2) {
		this.contractPartner2 = contractPartner2;
	}

	public String getContractPartner3() {
		return contractPartner3;
	}

	public void setContractPartner3(String contractPartner3) {
		this.contractPartner3 = contractPartner3;
	}

	public String getContractPartner4() {
		return contractPartner4;
	}

	public void setContractPartner4(String contractPartner4) {
		this.contractPartner4 = contractPartner4;
	}

	public String getSealType() {
		return sealType;
	}

	public void setSealType(String sealType) {
		this.sealType = sealType;
	}

	public String getBeforecontractNo() {
		return beforecontractNo;
	}

	public void setBeforecontractNo(String beforecontractNo) {
		this.beforecontractNo = beforecontractNo;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getProcType() {
		return procType;
	}

	public void setProcType(String procType) {
		this.procType = procType;
	}

	public String getSysFrom() {
		return sysFrom;
	}

	public void setSysFrom(String sysFrom) {
		this.sysFrom = sysFrom;
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

	public void setAssigneeName(String assigneeName) {
		this.assigneeName = assigneeName;
	}

	public String getProcId() {
		return procId;
	}

	public void setProcId(String procId) {
		this.procId = procId;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getBizCode() {
		return bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBackgroud() {
		return backgroud;
	}

	public void setBackgroud(String backgroud) {
		this.backgroud = backgroud;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayCurrency() {
		return payCurrency;
	}

	public void setPayCurrency(String payCurrency) {
		this.payCurrency = payCurrency;
	}

	public String getPayCny() {
		return payCny;
	}

	public void setPayCny(String payCny) {
		this.payCny = payCny;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getIsBegintoend() {
		return isBegintoend;
	}

	public void setIsBegintoend(String isBegintoend) {
		this.isBegintoend = isBegintoend;
	}

	public String getUpperAmount() {
		return upperAmount;
	}

	public void setUpperAmount(String upperAmount) {
		this.upperAmount = upperAmount;
	}

	public String getCorpore() {
		return corpore;
	}

	public void setCorpore(String corpore) {
		this.corpore = corpore;
	}

	public String getContractNoOld() {
		return contractNoOld;
	}

	public void setContractNoOld(String contractNoOld) {
		this.contractNoOld = contractNoOld;
	}

	public String getKbn() {
		return kbn;
	}

	public void setKbn(String kbn) {
		this.kbn = kbn;
	}

}
