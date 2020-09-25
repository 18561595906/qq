package com.haier.hop.ms.legcontractown.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * </p>
 *
 * @author xuejinxin
 * @since 2020-06-17
 */
@TableName("leg_overseas_contract_change")
public class LegOverseasContractChange extends Model<LegOverseasContractChange> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 系统流水号
	 */
	@TableField("CONT_ID")
	private String contId;
	/**
	 * 合同编号
	 */
	@TableField("CONT_NO")
	private String contNo;
	/**
	 * 申请人
	 */
	@TableField("APPLIER_ID")
	private String applierId;
	/**
	 * 经办人
	 */
	@TableField("OPERATERS")
	private String operaters;
	/**
	 * 客户信息
	 */
	@TableField("CUST_INFO")
	private String custInfo;
	/**
	 * 客户编码
	 */
	@TableField("CUST_NO")
	private String custNo;
	/**
	 * 国家
	 */
	@TableField("COUNTRY")
	private String country;
	/**
	 * 用户小微
	 */
	@TableField("CUST_XW")
	private String custXw;
	/**
	 * 市场小微
	 */
	@TableField("MARKET_XW")
	private String marketXw;
	/**
	 * 客户类别
	 */
	@TableField("CUST_CATEGORY")
	private String custCategory;
	/**
	 * 注册资金
	 */
	@TableField("REG_FUND")
	private String regFund;
	/**
	 * 去年营销额
	 */
	@TableField("SALE_LAST_YEAR")
	private String saleLastYear;
	/**
	 * 本年销售预算
	 */
	@TableField("SALE_THIS_YEAR")
	private String saleThisYear;
	/**
	 * 当地排名
	 */
	@TableField("RANKING")
	private String ranking;
	/**
	 * 采购额2017
	 */
	@TableField("PUR_AMOUNT_2017")
	private String purAmount2017;
	/**
	 * 目前对海尔逾期额
	 */
	@TableField("OVERDUE")
	private String overdue;
	/**
	 * 逾期率
	 */
	@TableField("OVERDUE_RATE")
	private String overdueRate;
	/**
	 * 逾期次数
	 */
	@TableField("OVERDUE_COUNT")
	private String overdueCount;
	/**
	 * 是否诉讼（Y or N）
	 */
	@TableField("LAWSUIT")
	private String lawsuit;
	/**
	 * 销售预算
	 */
	@TableField("MARKET_BUDGET")
	private String marketBudget;
	/**
	 * 未定事项
	 */
	@TableField("UNCERTAIN")
	private String uncertain;
	/**
	 * 商业模式
	 */
	@TableField("BUSINESS_MODEL")
	private String businessModel;
	/**
	 * 信用风险规避方案
	 */
	@TableField("AVOID_SCHEMEA")
	private String avoidSchemea;
	/**
	 * 合同金额
	 */
	@TableField("CON_FUND")
	private String conFund;
	/**
	 * 合同产品
	 */
	@TableField("CON_PRODUCT")
	private String conProduct;
	/**
	 * 年均合同金额
	 */
	@TableField("CON_FUND_AVERAGE")
	private String conFundAverage;
	/**
	 * 年均合同产品
	 */
	@TableField("CON_PRODUCT_AVERAGE")
	private String conProductAverage;
	/**
	 * 付款方式集合
	 */
	@TableField("PAY_TYPE_LIST")
	private String payTypeList;
	/**
	 * 信用风险规避方案
	 */
	@TableField("AVOID_SCHEMEB")
	private String avoidSchemeb;
	/**
	 * 是否标准合同（Y or N）
	 */
	@TableField("STANDARD_CONTRACT")
	private String standardContract;
	/**
	 * 成交方式
	 */
	@TableField("DEAL_TYPE")
	private String dealType;
	/**
	 * 合同货币
	 */
	@TableField("CURRENCY")
	private String currency;
	/**
	 * 财务条款
	 */
	@TableField("FINANC_TERMS")
	private String financTerms;
	/**
	 * 签约主体
	 */
	@TableField("SIGNER")
	private String signer;
	/**
	 * 法律条款有效开始日期
	 */
	@TableField("CLAUSE_START_DATE")
	private Date clauseStartDate;
	/**
	 * 法律条款有效结束日期
	 */
	@TableField("CLAUSE_END_DATE")
	private Date clauseEndDate;
	/**
	 * 是否无限期（Y or N）
	 */
	@TableField("FOREVER")
	private String forever;
	/**
	 * 售后服务
	 */
	@TableField("AFTER_SALES")
	private String afterSales;
	/**
	 * 销售量
	 */
	@TableField("SALE_QUANTITY")
	private String saleQuantity;
	/**
	 * 销售排名
	 */
	@TableField("SALE_RANKING")
	private String saleRanking;
	/**
	 * 知名品牌
	 */
	@TableField("FAMOUS_BRAND")
	private String famousBrand;
	/**
	 * 华人企业（Y or N）
	 */
	@TableField("CN_COMPANY")
	private String cnCompany;
	/**
	 * 是否经销国内其他公司的同类产品(Y or N）
	 */
	@TableField("OTHER_PRODUCT")
	private String otherProduct;
	/**
	 * 其他公司
	 */
	@TableField("COMPANY")
	private String company;
	/**
	 * 其他公司同类产品
	 */
	@TableField("PRODUCT")
	private String product;
	@TableField("BRAND")
	private String brand;
	/**
	 * 是否用印（Y or N）
	 */
	@TableField("SEAL")
	private String seal;
	/**
	 * 用印名称
	 */
	@TableField("SEAL_NAME")
	private String sealName;
	/**
	 * 流程ID
	 */
	@TableField("PROC_ID")
	private String procId;
	/**
	 * 流程类型
	 */
	@TableField("PRO_TYPE")
	private BigDecimal proType;
	/**
	 * 采购额2017
	 */
	@TableField("PUR_AMOUNT_2016")
	private String purAmount2016;
	/**
	 * 采购额2017
	 */
	@TableField("PUR_AMOUNT_2015")
	private String purAmount2015;
	/**
	 * 付款码
	 */
	@TableField("PAY_CODE1")
	private String payCode1;
	/**
	 * 其他
	 */
	@TableField("PAY_OTHER")
	private String payOther;
	/**
	 * 开证银行
	 */
	@TableField("ISSUE_BANK")
	private String issueBank;
	/**
	 * 销售区域
	 */
	@TableField("SALE_AREA")
	private String saleArea;
	/**
	 * 备件额度
	 */
	@TableField("REPLACE_AMOUNT")
	private String replaceAmount;
	/**
	 * 合同超出1%原因
	 */
	@TableField("REASON")
	private String reason;
	/**
	 * 是否有故障率要求
	 */
	@TableField("IS_FAILURE_RATE")
	private String isFailureRate;
	/**
	 * 原产国家/地区
	 */
	@TableField("FROM_COUNTRY")
	private String fromCountry;
	/**
	 * 目的国家/地区
	 */
	@TableField("TO_COUNTRY")
	private String toCountry;
	/**
	 * 创建时间
	 */
	@TableField("CTEATE_TIME")
	private Date cteateTime;
	/**
	 * 合同状态 1.申请 2.公议 3.签署 4.归档 5.复核 6.完成 8.用印确认 10.归档确认 11.电子盖章
	 */
	@TableField("CONT_STATUS")
	private BigDecimal contStatus;
	@TableField("UPDATE_TIME")
	private Date updateTime;
	/**
	 * 付款码
	 */
	@TableField("PAY_CODE2")
	private String payCode2;
	/**
	 * 付款码
	 */
	@TableField("PAY_CODE3")
	private String payCode3;
	/**
	 * 付款码
	 */
	@TableField("PAY_CODE4")
	private String payCode4;
	/**
	 * 修改条款
	 */
	@TableField("AMEND_CLAUSE")
	private String amendClause;
	/**
	 * 其他客户类别
	 */
	@TableField("CUST_OTHERS")
	private String custOthers;
	/**
	 * 合同-每个产品对应的金额 - 180514 - 为了页面展示建立
	 */
	@TableField("CON_PRICE")
	private String conPrice;
	/**
	 * 年均采购额-每个产品对应的金额 - 180514 - 为了页面展示建立
	 */
	@TableField("CON_PRICE_AVERAGE")
	private String conPriceAverage;
	/**
	 * 合同到期续约
	 */
	@TableField("CHANGE_XUYUE")
	private String changeXuyue;
	/**
	 * 其他
	 */
	@TableField("CHANGE_QITA")
	private String changeQita;
	/**
	 * 变更内容
	 */
	@TableField("CHANGE_CONTENT")
	private String changeContent;
	/**
	 * 合同类型：0：海外自产合同，1：海外OEM合同（仅对海外合同用）
	 */
	@TableField("CONTRACT_TYPE")
	private BigDecimal contractType;
	/**
	 * 变更前原合同的流程ID
	 */
	@TableField("OLD_CONTRACT_PROCID")
	private String oldContractProcid;
	/**
	 * 合同语言：1：中文，2：英文，3：中文+英文
	 */
	@TableField("CONTRACT_LANGUAGE")
	private BigDecimal contractLanguage;
	/**
	 * 用户小微编码（大区编码）
	 */
	@TableField("CUST_XW_CODE")
	private String custXwCode;
	/**
	 * 市场小微编码（小微编码）
	 */
	@TableField("MARKET_XW_CODE")
	private String marketXwCode;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getContId() {
		return contId;
	}

	public void setContId(String contId) {
		this.contId = contId;
	}

	public String getContNo() {
		return contNo;
	}

	public void setContNo(String contNo) {
		this.contNo = contNo;
	}

	public String getApplierId() {
		return applierId;
	}

	public void setApplierId(String applierId) {
		this.applierId = applierId;
	}

	public String getOperaters() {
		return operaters;
	}

	public void setOperaters(String operaters) {
		this.operaters = operaters;
	}

	public String getCustInfo() {
		return custInfo;
	}

	public void setCustInfo(String custInfo) {
		this.custInfo = custInfo;
	}

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCustXw() {
		return custXw;
	}

	public void setCustXw(String custXw) {
		this.custXw = custXw;
	}

	public String getMarketXw() {
		return marketXw;
	}

	public void setMarketXw(String marketXw) {
		this.marketXw = marketXw;
	}

	public String getCustCategory() {
		return custCategory;
	}

	public void setCustCategory(String custCategory) {
		this.custCategory = custCategory;
	}

	public String getRegFund() {
		return regFund;
	}

	public void setRegFund(String regFund) {
		this.regFund = regFund;
	}

	public String getSaleLastYear() {
		return saleLastYear;
	}

	public void setSaleLastYear(String saleLastYear) {
		this.saleLastYear = saleLastYear;
	}

	public String getSaleThisYear() {
		return saleThisYear;
	}

	public void setSaleThisYear(String saleThisYear) {
		this.saleThisYear = saleThisYear;
	}

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}

	public String getPurAmount2017() {
		return purAmount2017;
	}

	public void setPurAmount2017(String purAmount2017) {
		this.purAmount2017 = purAmount2017;
	}

	public String getOverdue() {
		return overdue;
	}

	public void setOverdue(String overdue) {
		this.overdue = overdue;
	}

	public String getOverdueRate() {
		return overdueRate;
	}

	public void setOverdueRate(String overdueRate) {
		this.overdueRate = overdueRate;
	}

	public String getOverdueCount() {
		return overdueCount;
	}

	public void setOverdueCount(String overdueCount) {
		this.overdueCount = overdueCount;
	}

	public String getLawsuit() {
		return lawsuit;
	}

	public void setLawsuit(String lawsuit) {
		this.lawsuit = lawsuit;
	}

	public String getMarketBudget() {
		return marketBudget;
	}

	public void setMarketBudget(String marketBudget) {
		this.marketBudget = marketBudget;
	}

	public String getUncertain() {
		return uncertain;
	}

	public void setUncertain(String uncertain) {
		this.uncertain = uncertain;
	}

	public String getBusinessModel() {
		return businessModel;
	}

	public void setBusinessModel(String businessModel) {
		this.businessModel = businessModel;
	}

	public String getAvoidSchemea() {
		return avoidSchemea;
	}

	public void setAvoidSchemea(String avoidSchemea) {
		this.avoidSchemea = avoidSchemea;
	}

	public String getConFund() {
		return conFund;
	}

	public void setConFund(String conFund) {
		this.conFund = conFund;
	}

	public String getConProduct() {
		return conProduct;
	}

	public void setConProduct(String conProduct) {
		this.conProduct = conProduct;
	}

	public String getConFundAverage() {
		return conFundAverage;
	}

	public void setConFundAverage(String conFundAverage) {
		this.conFundAverage = conFundAverage;
	}

	public String getConProductAverage() {
		return conProductAverage;
	}

	public void setConProductAverage(String conProductAverage) {
		this.conProductAverage = conProductAverage;
	}

	public String getPayTypeList() {
		return payTypeList;
	}

	public void setPayTypeList(String payTypeList) {
		this.payTypeList = payTypeList;
	}

	public String getAvoidSchemeb() {
		return avoidSchemeb;
	}

	public void setAvoidSchemeb(String avoidSchemeb) {
		this.avoidSchemeb = avoidSchemeb;
	}

	public String getStandardContract() {
		return standardContract;
	}

	public void setStandardContract(String standardContract) {
		this.standardContract = standardContract;
	}

	public String getDealType() {
		return dealType;
	}

	public void setDealType(String dealType) {
		this.dealType = dealType;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getFinancTerms() {
		return financTerms;
	}

	public void setFinancTerms(String financTerms) {
		this.financTerms = financTerms;
	}

	public String getSigner() {
		return signer;
	}

	public void setSigner(String signer) {
		this.signer = signer;
	}

	public Date getClauseStartDate() {
		return clauseStartDate;
	}

	public void setClauseStartDate(Date clauseStartDate) {
		this.clauseStartDate = clauseStartDate;
	}

	public Date getClauseEndDate() {
		return clauseEndDate;
	}

	public void setClauseEndDate(Date clauseEndDate) {
		this.clauseEndDate = clauseEndDate;
	}

	public String getForever() {
		return forever;
	}

	public void setForever(String forever) {
		this.forever = forever;
	}

	public String getAfterSales() {
		return afterSales;
	}

	public void setAfterSales(String afterSales) {
		this.afterSales = afterSales;
	}

	public String getSaleQuantity() {
		return saleQuantity;
	}

	public void setSaleQuantity(String saleQuantity) {
		this.saleQuantity = saleQuantity;
	}

	public String getSaleRanking() {
		return saleRanking;
	}

	public void setSaleRanking(String saleRanking) {
		this.saleRanking = saleRanking;
	}

	public String getFamousBrand() {
		return famousBrand;
	}

	public void setFamousBrand(String famousBrand) {
		this.famousBrand = famousBrand;
	}

	public String getCnCompany() {
		return cnCompany;
	}

	public void setCnCompany(String cnCompany) {
		this.cnCompany = cnCompany;
	}

	public String getOtherProduct() {
		return otherProduct;
	}

	public void setOtherProduct(String otherProduct) {
		this.otherProduct = otherProduct;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSeal() {
		return seal;
	}

	public void setSeal(String seal) {
		this.seal = seal;
	}

	public String getSealName() {
		return sealName;
	}

	public void setSealName(String sealName) {
		this.sealName = sealName;
	}

	public String getProcId() {
		return procId;
	}

	public void setProcId(String procId) {
		this.procId = procId;
	}

	public BigDecimal getProType() {
		return proType;
	}

	public void setProType(BigDecimal proType) {
		this.proType = proType;
	}

	public String getPurAmount2016() {
		return purAmount2016;
	}

	public void setPurAmount2016(String purAmount2016) {
		this.purAmount2016 = purAmount2016;
	}

	public String getPurAmount2015() {
		return purAmount2015;
	}

	public void setPurAmount2015(String purAmount2015) {
		this.purAmount2015 = purAmount2015;
	}

	public String getPayCode1() {
		return payCode1;
	}

	public void setPayCode1(String payCode1) {
		this.payCode1 = payCode1;
	}

	public String getPayOther() {
		return payOther;
	}

	public void setPayOther(String payOther) {
		this.payOther = payOther;
	}

	public String getIssueBank() {
		return issueBank;
	}

	public void setIssueBank(String issueBank) {
		this.issueBank = issueBank;
	}

	public String getSaleArea() {
		return saleArea;
	}

	public void setSaleArea(String saleArea) {
		this.saleArea = saleArea;
	}

	public String getReplaceAmount() {
		return replaceAmount;
	}

	public void setReplaceAmount(String replaceAmount) {
		this.replaceAmount = replaceAmount;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getIsFailureRate() {
		return isFailureRate;
	}

	public void setIsFailureRate(String isFailureRate) {
		this.isFailureRate = isFailureRate;
	}

	public String getFromCountry() {
		return fromCountry;
	}

	public void setFromCountry(String fromCountry) {
		this.fromCountry = fromCountry;
	}

	public String getToCountry() {
		return toCountry;
	}

	public void setToCountry(String toCountry) {
		this.toCountry = toCountry;
	}

	public Date getCteateTime() {
		return cteateTime;
	}

	public void setCteateTime(Date cteateTime) {
		this.cteateTime = cteateTime;
	}

	public BigDecimal getContStatus() {
		return contStatus;
	}

	public void setContStatus(BigDecimal contStatus) {
		this.contStatus = contStatus;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getPayCode2() {
		return payCode2;
	}

	public void setPayCode2(String payCode2) {
		this.payCode2 = payCode2;
	}

	public String getPayCode3() {
		return payCode3;
	}

	public void setPayCode3(String payCode3) {
		this.payCode3 = payCode3;
	}

	public String getPayCode4() {
		return payCode4;
	}

	public void setPayCode4(String payCode4) {
		this.payCode4 = payCode4;
	}

	public String getAmendClause() {
		return amendClause;
	}

	public void setAmendClause(String amendClause) {
		this.amendClause = amendClause;
	}

	public String getCustOthers() {
		return custOthers;
	}

	public void setCustOthers(String custOthers) {
		this.custOthers = custOthers;
	}

	public String getConPrice() {
		return conPrice;
	}

	public void setConPrice(String conPrice) {
		this.conPrice = conPrice;
	}

	public String getConPriceAverage() {
		return conPriceAverage;
	}

	public void setConPriceAverage(String conPriceAverage) {
		this.conPriceAverage = conPriceAverage;
	}

	public String getChangeXuyue() {
		return changeXuyue;
	}

	public void setChangeXuyue(String changeXuyue) {
		this.changeXuyue = changeXuyue;
	}

	public String getChangeQita() {
		return changeQita;
	}

	public void setChangeQita(String changeQita) {
		this.changeQita = changeQita;
	}

	public String getChangeContent() {
		return changeContent;
	}

	public void setChangeContent(String changeContent) {
		this.changeContent = changeContent;
	}

	public BigDecimal getContractType() {
		return contractType;
	}

	public void setContractType(BigDecimal contractType) {
		this.contractType = contractType;
	}

	public String getOldContractProcid() {
		return oldContractProcid;
	}

	public void setOldContractProcid(String oldContractProcid) {
		this.oldContractProcid = oldContractProcid;
	}

	public BigDecimal getContractLanguage() {
		return contractLanguage;
	}

	public void setContractLanguage(BigDecimal contractLanguage) {
		this.contractLanguage = contractLanguage;
	}

	public String getCustXwCode() {
		return custXwCode;
	}

	public void setCustXwCode(String custXwCode) {
		this.custXwCode = custXwCode;
	}

	public String getMarketXwCode() {
		return marketXwCode;
	}

	public void setMarketXwCode(String marketXwCode) {
		this.marketXwCode = marketXwCode;
	}

	@Override
	protected Serializable pkVal() {
		return this.rowId;
	}

	@Override
	public String toString() {
		return "LegOverseasContractChange{" + "rowId=" + rowId + ", contId=" + contId + ", contNo=" + contNo
				+ ", applierId=" + applierId + ", operaters=" + operaters + ", custInfo=" + custInfo + ", custNo="
				+ custNo + ", country=" + country + ", custXw=" + custXw + ", marketXw=" + marketXw + ", custCategory="
				+ custCategory + ", regFund=" + regFund + ", saleLastYear=" + saleLastYear + ", saleThisYear="
				+ saleThisYear + ", ranking=" + ranking + ", purAmount2017=" + purAmount2017 + ", overdue=" + overdue
				+ ", overdueRate=" + overdueRate + ", overdueCount=" + overdueCount + ", lawsuit=" + lawsuit
				+ ", marketBudget=" + marketBudget + ", uncertain=" + uncertain + ", businessModel=" + businessModel
				+ ", avoidSchemea=" + avoidSchemea + ", conFund=" + conFund + ", conProduct=" + conProduct
				+ ", conFundAverage=" + conFundAverage + ", conProductAverage=" + conProductAverage + ", payTypeList="
				+ payTypeList + ", avoidSchemeb=" + avoidSchemeb + ", standardContract=" + standardContract
				+ ", dealType=" + dealType + ", currency=" + currency + ", financTerms=" + financTerms + ", signer="
				+ signer + ", clauseStartDate=" + clauseStartDate + ", clauseEndDate=" + clauseEndDate + ", forever="
				+ forever + ", afterSales=" + afterSales + ", saleQuantity=" + saleQuantity + ", saleRanking="
				+ saleRanking + ", famousBrand=" + famousBrand + ", cnCompany=" + cnCompany + ", otherProduct="
				+ otherProduct + ", company=" + company + ", product=" + product + ", brand=" + brand + ", seal=" + seal
				+ ", sealName=" + sealName + ", procId=" + procId + ", proType=" + proType + ", purAmount2016="
				+ purAmount2016 + ", purAmount2015=" + purAmount2015 + ", payCode1=" + payCode1 + ", payOther="
				+ payOther + ", issueBank=" + issueBank + ", saleArea=" + saleArea + ", replaceAmount=" + replaceAmount
				+ ", reason=" + reason + ", isFailureRate=" + isFailureRate + ", fromCountry=" + fromCountry
				+ ", toCountry=" + toCountry + ", cteateTime=" + cteateTime + ", contStatus=" + contStatus
				+ ", updateTime=" + updateTime + ", payCode2=" + payCode2 + ", payCode3=" + payCode3 + ", payCode4="
				+ payCode4 + ", amendClause=" + amendClause + ", custOthers=" + custOthers + ", conPrice=" + conPrice
				+ ", conPriceAverage=" + conPriceAverage + ", changeXuyue=" + changeXuyue + ", changeQita=" + changeQita
				+ ", changeContent=" + changeContent + ", contractType=" + contractType + ", oldContractProcid="
				+ oldContractProcid + ", contractLanguage=" + contractLanguage + ", custXwCode=" + custXwCode
				+ ", marketXwCode=" + marketXwCode + "}";
	}
}
