package com.haier.hop.ms.legcontractown.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.annotations.TableField;
import com.haier.hop.ms.legcontractown.domain.LegOverseasHope;

/**
 * <p>
 * </p>
 *
 * @author xuejinxin
 * @since 2020-04-16
 */
public class ContractSearchDto {

	/**
	 * 主键
	 */
	@TableField("ROW_ID")
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
	 * 销售预算(本年销售预算)
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
	 * 销售量（须有经销家电经验）
	 */
	@TableField("SALE_QUANTITY")
	private String saleQuantity;
	/**
	 * 销售排名（在当地家电排名）
	 */
	@TableField("SALE_RANKING")
	private String saleRanking;
	/**
	 * 知名品牌（曾经使某一品牌成为知名品牌）
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
	 * 合同状态 1.申请 2.公议 3.签署 4.归档 5.复核 6.完成 8.用印确认 10.归档确认 11.电子盖章 20.撤销状态
	 */
	@TableField("CONT_STATUS")
	private BigDecimal contStatus;
	@TableField("UPDATE_TIME")
	private Date updateTime;
	/**
	 * 付款码
	 */
	private List<String> payCodeList;
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
	 * 修改条款（非标准合同原因）
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
	 * 合同类型：0：海外自产合同，1：海外OEM合同（仅对海外合同用）
	 */
	@TableField("CONTRACT_TYPE")
	private BigDecimal contractType;
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
	/**
	 * 合同份数
	 */
	@TableField("CONTRACT_SUM")
	private String contractSum;
	/**
	 * 合同背景
	 */
	@TableField("CONTRACT_CONTEXT")
	private String contractContext;
	/**
	 * 用印文件名称
	 */
	@TableField("SEAL_FILE_NAME")
	private String sealFileName;
	/**
	 * 单份文件页数
	 */
	@TableField("SEAL_PAGE_NUM")
	private String sealPageNum;
	/**
	 * 份数
	 */
	@TableField("SEAL_FILE_NUM")
	private String sealFileNum;
	/**
	 * 用印个数
	 */
	@TableField("SEAL_NUM")
	private String sealNum;
	/**
	 * 流失理由
	 */
	@TableField("REASONS_FOR_LOSS")
	private String reasonsForLoss;
	/**
	 * 关差方案或其他
	 */
	@TableField("SCHEME_OR_OTHER")
	private String schemeOrOther;
	/**
	 * 是否是流失客户 客户流失流程会赋值为1，否则为"" 区分原合同流程和客户流失流程
	 */
	@TableField("IS_LOSS")
	private String isLoss;
	/**
	 * 合同状态
	 */
	private String contStatusName;
	/**
	 * 合同开始时间
	 */
	private String startDate;
	/**
	 * 合同结束时间
	 */
	private String endDate;
	/**
	 * 合同提交审核时间
	 */
	private String submitDate;
	/**
	 * hop号
	 */
	private String hope;
	/**
	 * hop号
	 */
	private List<LegOverseasHope> hopes;
	/**
	 * 小微主或者产品线海外支持部长
	 */
	private String xwzName;
	/**
	 * 海外用户口碑平台或者产品线技术支持增值平台
	 */
	private String kbName;
	/**
	 * 海外订单商务或者690海外区域小微主
	 */
	private String swName;
	/**
	 * 全球平台或者HIC/HSP业务
	 */
	private String qqName;
	/**
	 * 海外财务平台或者HIC/HSP财务
	 */
	private String cwName;
	/**
	 * 690法务平台或者HIC/HSP小微主
	 */
	private String fwName;
	/**
	 * 法律平台
	 */
	private String fwptName;
	/**
	 * 大区长
	 */
	private String ptzName;
	/**
	 * 大区长审批时间
	 */
	private String approvalDate;
	/**
	 * 归档时间
	 */
	private String gdDate;
	/**
	 * 复核时间
	 */
	private String fhDate;
	/**
	 * 合同类型
	 */
	private String contractTypeDesc;
	/**
	 * 备注
	 */
	private String remake;
	/**
	 * 备注
	 */
	private String nodeName;
	/**
	 * 当前审批人
	 */
	private String assigneeSn;
	// 当前页数
	private int currentPage;
	// 每页数据条数
	private int pageSize;
	// 当前页第一条
	private int sizeFrist;
	// 当前页最后一条
	private int sizeLast;
	// 是否有分页
	private String kbn;

	private List<String> jyts;
	private List<String> regions;

	// 有效开始时间
	private Date startTime;
	// 有效开始时间
	private Date endTime;
	// 有效开始时间
	private String approveStartTime;
	// 有效开始时间
	private String approveEndTime;
	private List<String> conProductList;

	public String getContStatusName() {
		return contStatusName;
	}

	public void setContStatusName(String contStatusName) {
		this.contStatusName = contStatusName;
	}

	public List<String> getConProductList() {
		return conProductList;
	}

	public void setConProductList(List<String> conProductList) {
		this.conProductList = conProductList;
	}

	public Date getStartTime() {
		return startTime;
	}

	public List<LegOverseasHope> getHopes() {
		return hopes;
	}

	public void setHopes(List<LegOverseasHope> hopes) {
		this.hopes = hopes;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getApproveStartTime() {
		return approveStartTime;
	}

	public void setApproveStartTime(String approveStartTime) {
		this.approveStartTime = approveStartTime;
	}

	public String getApproveEndTime() {
		return approveEndTime;
	}

	public void setApproveEndTime(String approveEndTime) {
		this.approveEndTime = approveEndTime;
	}

	public List<String> getJyts() {
		return jyts;
	}

	public void setJyts(List<String> jyts) {
		this.jyts = jyts;
	}

	public List<String> getRegions() {
		return regions;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public void setRegions(List<String> regions) {
		this.regions = regions;
	}

	public String getAssigneeSn() {
		return assigneeSn;
	}

	public void setAssigneeSn(String assigneeSn) {
		this.assigneeSn = assigneeSn;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(String submitDate) {
		this.submitDate = submitDate;
	}

	public String getHope() {
		return hope;
	}

	public void setHope(String hope) {
		this.hope = hope;
	}

	public String getXwzName() {
		return xwzName;
	}

	public void setXwzName(String xwzName) {
		this.xwzName = xwzName;
	}

	public String getKbName() {
		return kbName;
	}

	public void setKbName(String kbName) {
		this.kbName = kbName;
	}

	public String getSwName() {
		return swName;
	}

	public void setSwName(String swName) {
		this.swName = swName;
	}

	public String getQqName() {
		return qqName;
	}

	public void setQqName(String qqName) {
		this.qqName = qqName;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getSizeFrist() {
		return sizeFrist;
	}

	public void setSizeFrist(int sizeFrist) {
		this.sizeFrist = sizeFrist;
	}

	public int getSizeLast() {
		return sizeLast;
	}

	public void setSizeLast(int sizeLast) {
		this.sizeLast = sizeLast;
	}

	public String getKbn() {
		return kbn;
	}

	public void setKbn(String kbn) {
		this.kbn = kbn;
	}

	public String getCwName() {
		return cwName;
	}

	public void setCwName(String cwName) {
		this.cwName = cwName;
	}

	public String getFwName() {
		return fwName;
	}

	public void setFwName(String fwName) {
		this.fwName = fwName;
	}

	public String getFwptName() {
		return fwptName;
	}

	public void setFwptName(String fwptName) {
		this.fwptName = fwptName;
	}

	public String getPtzName() {
		return ptzName;
	}

	public void setPtzName(String ptzName) {
		this.ptzName = ptzName;
	}

	public String getApprovalDate() {
		return approvalDate;
	}

	public void setApprovalDate(String approvalDate) {
		this.approvalDate = approvalDate;
	}

	public String getGdDate() {
		return gdDate;
	}

	public void setGdDate(String gdDate) {
		this.gdDate = gdDate;
	}

	public String getFhDate() {
		return fhDate;
	}

	public void setFhDate(String fhDate) {
		this.fhDate = fhDate;
	}

	public String getContractTypeDesc() {
		return contractTypeDesc;
	}

	public void setContractTypeDesc(String contractTypeDesc) {
		this.contractTypeDesc = contractTypeDesc;
	}

	public String getRemake() {
		return remake;
	}

	public void setRemake(String remake) {
		this.remake = remake;
	}

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

	public List<String> getPayCodeList() {
		return payCodeList;
	}

	public void setPayCodeList(List<String> payCodeList) {
		this.payCodeList = payCodeList;
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

	public BigDecimal getContractType() {
		return contractType;
	}

	public void setContractType(BigDecimal contractType) {
		this.contractType = contractType;
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

	public String getContractSum() {
		return contractSum;
	}

	public void setContractSum(String contractSum) {
		this.contractSum = contractSum;
	}

	public String getContractContext() {
		return contractContext;
	}

	public void setContractContext(String contractContext) {
		this.contractContext = contractContext;
	}

	public String getSealFileName() {
		return sealFileName;
	}

	public void setSealFileName(String sealFileName) {
		this.sealFileName = sealFileName;
	}

	public String getSealPageNum() {
		return sealPageNum;
	}

	public void setSealPageNum(String sealPageNum) {
		this.sealPageNum = sealPageNum;
	}

	public String getSealFileNum() {
		return sealFileNum;
	}

	public void setSealFileNum(String sealFileNum) {
		this.sealFileNum = sealFileNum;
	}

	public String getSealNum() {
		return sealNum;
	}

	public void setSealNum(String sealNum) {
		this.sealNum = sealNum;
	}

	public String getReasonsForLoss() {
		return reasonsForLoss;
	}

	public void setReasonsForLoss(String reasonsForLoss) {
		this.reasonsForLoss = reasonsForLoss;
	}

	public String getSchemeOrOther() {
		return schemeOrOther;
	}

	public void setSchemeOrOther(String schemeOrOther) {
		this.schemeOrOther = schemeOrOther;
	}

	public String getIsLoss() {
		return isLoss;
	}

	public void setIsLoss(String isLoss) {
		this.isLoss = isLoss;
	}

}
