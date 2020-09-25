package com.haier.hop.ms.legcontract.dto;

import com.haier.hop.ms.legcontract.domain.LegContractBCCExtraInfo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-12-09
 */
public class LegContractUpdateDto {

	/**
	 * 项目编码
	 */
	private String projectCode;
	/**
	 * 项目名称
	 */
	private String projectName;
	/**
	 * 业务单元编码
	 */
	private String bizCode;
	/**
	 * 合同编码
	 */
	private String contractCode;
	/**
	 * 合同名称
	 */
	private String contractName;
	/**
	 * 合同背景
	 */
	private String backgroud;
	/**
	 * 合同付款金额
	 */
	private BigDecimal payAmount;
	/**
	 * 合同付款币种
	 */
	private String payCurrency;
	/**
	 * 合同付款金额人民币
	 */
	private BigDecimal payCny;
	/**
	 * 大写金额
	 */
	private String upperAmount;

	/**
	 * 语言
	 */
	private String language;

	/**
	 * 合同标的物（非必填）
	 */
	private String corpore;
	/**
	 * 开始时间
	 */
	private Date beginDate;
	/**
	 * 结束时间
	 */
	private Date endDate;
	/**
	 * 申请人
	 */
	private String applierId;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 来源系统
	 */
	private String sysId;
	/**
	 * 收付款类型（1：海尔为收款方 2：海尔为付款方 3：无款项收付 4：甲方为收款方 5：甲方为付款方）
	 */
	private String payType;
	/**
	 * 确定不确定金额
	 */
	private String materPayType;

	/**
	 * 是否有起止日期（1：有，2：没有）
	 */
	private String isBegintoend;
	/**
	 * 合同份数
	 */
	private BigDecimal contractNum;
	/**
	 * 业务单元名称
	 */
	private String bizName;
	/**
	 * 申请人姓名
	 */
	private String applierName;
	/**
	 * 合同描述
	 */
	private String contractDes;
	/**
	 * 合同类型 0非标 1标准 2按标准编辑
	 */
	private String contractType;
	/**
	 * 合同别名
	 */
	private String contractAlias;
	/**
	 * 合同经办人电话
	 */
	private String contractPhone;
	/**
	 * 合同经办人邮箱
	 */
	private String contractEmail;
	/**
	 * 风险预案
	 */
	private String riskPlan;
	/**
	 * 合同有效期（月单位）
	 */
	private BigDecimal effectiveDate;
	/**
	 * 合同类型1、外部 2、内部 3、借款担保
	 */
	private String contractInsideType;
	/**
	 * 合同保证金
	 */
	private BigDecimal deposit;
	/**
	 * 不确定时,预计合同交易金额
	 */
	private BigDecimal estimateCny;

	/**
	 * 合同变更关联合同号
	 */
	private String relatedMecCode;

	/**
	 * 合同变更关联合同名称
	 */
	private String oldContractName;
	
	/**
	 * 1:新流程线上用印0:线下
	 */
	private String sealType;

	//BCC合同交互额外信息
	private LegContractBCCExtraInfo bccExtra;

	public LegContractBCCExtraInfo getBccExtra() {
		return bccExtra;
	}

	public void setBccExtra(LegContractBCCExtraInfo bccExtra) {
		this.bccExtra = bccExtra;
	}

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

	public String getBizCode() {
		return bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
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

	public String getBackgroud() {
		return backgroud;
	}

	public void setBackgroud(String backgroud) {
		this.backgroud = backgroud;
	}

	public BigDecimal getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(BigDecimal payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayCurrency() {
		return payCurrency;
	}

	public void setPayCurrency(String payCurrency) {
		this.payCurrency = payCurrency;
	}

	public BigDecimal getPayCny() {
		return payCny;
	}

	public void setPayCny(BigDecimal payCny) {
		this.payCny = payCny;
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

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getApplierId() {
		return applierId;
	}

	public void setApplierId(String applierId) {
		this.applierId = applierId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getSysId() {
		return sysId;
	}

	public void setSysId(String sysId) {
		this.sysId = sysId;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getMaterPayType() {
		return materPayType;
	}

	public void setMaterPayType(String materPayType) {
		this.materPayType = materPayType;
	}

	public String getIsBegintoend() {
		return isBegintoend;
	}

	public void setIsBegintoend(String isBegintoend) {
		this.isBegintoend = isBegintoend;
	}

	public BigDecimal getContractNum() {
		return contractNum;
	}

	public void setContractNum(BigDecimal contractNum) {
		this.contractNum = contractNum;
	}

	public String getBizName() {
		return bizName;
	}

	public void setBizName(String bizName) {
		this.bizName = bizName;
	}

	public String getApplierName() {
		return applierName;
	}

	public void setApplierName(String applierName) {
		this.applierName = applierName;
	}

	public String getContractDes() {
		return contractDes;
	}

	public void setContractDes(String contractDes) {
		this.contractDes = contractDes;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getContractAlias() {
		return contractAlias;
	}

	public void setContractAlias(String contractAlias) {
		this.contractAlias = contractAlias;
	}

	public String getContractPhone() {
		return contractPhone;
	}

	public void setContractPhone(String contractPhone) {
		this.contractPhone = contractPhone;
	}

	public String getContractEmail() {
		return contractEmail;
	}

	public void setContractEmail(String contractEmail) {
		this.contractEmail = contractEmail;
	}

	public String getRiskPlan() {
		return riskPlan;
	}

	public void setRiskPlan(String riskPlan) {
		this.riskPlan = riskPlan;
	}

	public BigDecimal getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(BigDecimal effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getContractInsideType() {
		return contractInsideType;
	}

	public void setContractInsideType(String contractInsideType) {
		this.contractInsideType = contractInsideType;
	}

	public BigDecimal getDeposit() {
		return deposit;
	}

	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}

	public BigDecimal getEstimateCny() {
		return estimateCny;
	}

	public void setEstimateCny(BigDecimal estimateCny) {
		this.estimateCny = estimateCny;
	}

	public String getRelatedMecCode() {
		return relatedMecCode;
	}

	public void setRelatedMecCode(String relatedMecCode) {
		this.relatedMecCode = relatedMecCode;
	}

	public String getOldContractName() {
		return oldContractName;
	}

	public void setOldContractName(String oldContractName) {
		this.oldContractName = oldContractName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getSealType() {
		return sealType;
	}

	public void setSealType(String sealType) {
		this.sealType = sealType;
	}

}
