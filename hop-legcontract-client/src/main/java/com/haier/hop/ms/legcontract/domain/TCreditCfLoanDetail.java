package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 互联网金融对接合同信息：消金借款明细
 * </p>
 *
 * @author shiyingxin
 * @since 2020-04-15
 */
@TableName("t_credit_cf_loan_detail")
public class TCreditCfLoanDetail extends Model<TCreditCfLoanDetail> {

	private static final long serialVersionUID = 1L;

	/**
	 * 消金借款编号
	 */
	@TableField("cf_loan_code")
	private String cfLoanCode;
	/**
	 * 合作方客户ID
	 */
	@TableField("customer_id")
	private String customerId;
	/**
	 * 合同编号
	 */
	@TableField("contract_code")
	private String contractCode;
	/**
	 * 借款状态
	 */
	@TableField("review_status")
	private String reviewStatus;
	/**
	 * 标的编号
	 */
	@TableField("target_code")
	private String targetCode;
	/**
	 * 标的名称
	 */
	@TableField("target_name")
	private String targetName;
	/**
	 * 还款方式
	 */
	@TableField("repayment_type")
	private String repaymentType;
	/**
	 * 是否上传合同
	 */
	@TableField("is_up_contract")
	private String isUpContract;
	/**
	 * 借款人姓名
	 */
	@TableField("borrower_name")
	private String borrowerName;
	/**
	 * 借款金额
	 */
	@TableField("borrower_loan_amount")
	private BigDecimal borrowerLoanAmount;
	/**
	 * 放款金额
	 */
	@TableField("borrower_fk_amount")
	private BigDecimal borrowerFkAmount;
	/**
	 * 手续费
	 */
	@TableField("borrower_charge_amount")
	private BigDecimal borrowerChargeAmount;
	/**
	 * 借款利率
	 */
	@TableField("borrower_interest_rate")
	private BigDecimal borrowerInterestRate;
	/**
	 * 借款利息
	 */
	@TableField("borrower_interest")
	private BigDecimal borrowerInterest;
	/**
	 * 借款期限
	 */
	@TableField("borrower_due_time")
	private String borrowerDueTime;
	/**
	 * 借款期限单位
	 */
	@TableField("borrower_due_time_type")
	private String borrowerDueTimeType;
	/**
	 * 借款商户名
	 */
	@TableField("merchant_name")
	private String merchantName;
	/**
	 * 海融易编号
	 */
	@TableField("hry_id")
	private String hryId;
	/**
	 * 存管开户结果
	 */
	@TableField("op_status")
	private String opStatus;
	/**
	 * 登记日期
	 */
	@TableField("create_time")
	private Date createTime;
	/**
	 * 更新日期
	 */
	@TableField("update_time")
	private Date updateTime;
	/**
	 * 借款人类型
	 */
	@TableField("borrower_type")
	private String borrowerType;
	/**
	 * 借款人证件类型
	 */
	@TableField("borrower_id_type")
	private String borrowerIdType;
	/**
	 * 发标利率(年化)
	 */
	@TableField("bid_rate")
	private BigDecimal bidRate;
	/**
	 * 推荐人服务费率
	 */
	@TableField("service_rate")
	private BigDecimal serviceRate;
	/**
	 * 签约模式
	 */
	@TableField("contract_pattern")
	private String contractPattern;
	/**
	 * 备注信息
	 */
	@TableField("comment_info")
	private String commentInfo;
	/**
	 * 担保人
	 */
	private String guarantor;
	/**
	 * 担保函编号
	 */
	@TableField("guarantee_letter")
	private String guaranteeLetter;
	/**
	 * 项目所在省市编码
	 */
	@TableField("region_id")
	private String regionId;
	/**
	 * 标的还款方式
	 */
	@TableField("bid_repayment_type")
	private String bidRepaymentType;
	/**
	 * 逾期规则
	 */
	@TableField("overdue_rules")
	private String overdueRules;
	/**
	 * 项目描述
	 */
	@TableField("pro_desc")
	private String proDesc;
	/**
	 * 资产安全
	 */
	@TableField("ass_security")
	private String assSecurity;
	/**
	 * 放款成功时间
	 */
	@TableField("completion_time")
	private String completionTime;
	/**
	 * 企业名称
	 */
	@TableField("company_name")
	private String companyName;
	/**
	 * 统一社会信用代码
	 */
	@TableField("credit_code")
	private String creditCode;
	/**
	 * 法人姓名
	 */
	@TableField("corporation_name")
	private String corporationName;
	/**
	 * 联系人
	 */
	@TableField("rel_name")
	private String relName;
	/**
	 * 购买商品名称
	 */
	@TableField("goods_name")
	private String goodsName;
	/**
	 * 合作方客户名称
	 */
	@TableField("customer_name")
	private String customerName;
	/**
	 * 风险等级
	 */
	@TableField("risk_level")
	private String riskLevel;
	/**
	 * 标的状态
	 */
	@TableField("cf_target_status")
	private String cfTargetStatus;
	/**
	 * 同步时间
	 */
	@TableField("sync_time")
	private Date syncTime;

	// 创建时间开始
	@TableField(exist = false)
	private Date createDateFrom;

	// 创建时间结束
	@TableField(exist = false)
	private Date createDateTo;

	public String getCfLoanCode() {
		return cfLoanCode;
	}

	public void setCfLoanCode(String cfLoanCode) {
		this.cfLoanCode = cfLoanCode;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getReviewStatus() {
		return reviewStatus;
	}

	public void setReviewStatus(String reviewStatus) {
		this.reviewStatus = reviewStatus;
	}

	public String getTargetCode() {
		return targetCode;
	}

	public void setTargetCode(String targetCode) {
		this.targetCode = targetCode;
	}

	public String getTargetName() {
		return targetName;
	}

	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}

	public String getRepaymentType() {
		return repaymentType;
	}

	public void setRepaymentType(String repaymentType) {
		this.repaymentType = repaymentType;
	}

	public String getIsUpContract() {
		return isUpContract;
	}

	public void setIsUpContract(String isUpContract) {
		this.isUpContract = isUpContract;
	}

	public String getBorrowerName() {
		return borrowerName;
	}

	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}

	public BigDecimal getBorrowerLoanAmount() {
		return borrowerLoanAmount;
	}

	public void setBorrowerLoanAmount(BigDecimal borrowerLoanAmount) {
		this.borrowerLoanAmount = borrowerLoanAmount;
	}

	public BigDecimal getBorrowerFkAmount() {
		return borrowerFkAmount;
	}

	public void setBorrowerFkAmount(BigDecimal borrowerFkAmount) {
		this.borrowerFkAmount = borrowerFkAmount;
	}

	public BigDecimal getBorrowerChargeAmount() {
		return borrowerChargeAmount;
	}

	public void setBorrowerChargeAmount(BigDecimal borrowerChargeAmount) {
		this.borrowerChargeAmount = borrowerChargeAmount;
	}

	public BigDecimal getBorrowerInterestRate() {
		return borrowerInterestRate;
	}

	public void setBorrowerInterestRate(BigDecimal borrowerInterestRate) {
		this.borrowerInterestRate = borrowerInterestRate;
	}

	public BigDecimal getBorrowerInterest() {
		return borrowerInterest;
	}

	public void setBorrowerInterest(BigDecimal borrowerInterest) {
		this.borrowerInterest = borrowerInterest;
	}

	public String getBorrowerDueTime() {
		return borrowerDueTime;
	}

	public void setBorrowerDueTime(String borrowerDueTime) {
		this.borrowerDueTime = borrowerDueTime;
	}

	public String getBorrowerDueTimeType() {
		return borrowerDueTimeType;
	}

	public void setBorrowerDueTimeType(String borrowerDueTimeType) {
		this.borrowerDueTimeType = borrowerDueTimeType;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getHryId() {
		return hryId;
	}

	public void setHryId(String hryId) {
		this.hryId = hryId;
	}

	public String getOpStatus() {
		return opStatus;
	}

	public void setOpStatus(String opStatus) {
		this.opStatus = opStatus;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getBorrowerType() {
		return borrowerType;
	}

	public void setBorrowerType(String borrowerType) {
		this.borrowerType = borrowerType;
	}

	public String getBorrowerIdType() {
		return borrowerIdType;
	}

	public void setBorrowerIdType(String borrowerIdType) {
		this.borrowerIdType = borrowerIdType;
	}

	public BigDecimal getBidRate() {
		return bidRate;
	}

	public void setBidRate(BigDecimal bidRate) {
		this.bidRate = bidRate;
	}

	public BigDecimal getServiceRate() {
		return serviceRate;
	}

	public void setServiceRate(BigDecimal serviceRate) {
		this.serviceRate = serviceRate;
	}

	public String getContractPattern() {
		return contractPattern;
	}

	public void setContractPattern(String contractPattern) {
		this.contractPattern = contractPattern;
	}

	public String getCommentInfo() {
		return commentInfo;
	}

	public void setCommentInfo(String commentInfo) {
		this.commentInfo = commentInfo;
	}

	public String getGuarantor() {
		return guarantor;
	}

	public void setGuarantor(String guarantor) {
		this.guarantor = guarantor;
	}

	public String getGuaranteeLetter() {
		return guaranteeLetter;
	}

	public void setGuaranteeLetter(String guaranteeLetter) {
		this.guaranteeLetter = guaranteeLetter;
	}

	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getBidRepaymentType() {
		return bidRepaymentType;
	}

	public void setBidRepaymentType(String bidRepaymentType) {
		this.bidRepaymentType = bidRepaymentType;
	}

	public String getOverdueRules() {
		return overdueRules;
	}

	public void setOverdueRules(String overdueRules) {
		this.overdueRules = overdueRules;
	}

	public String getProDesc() {
		return proDesc;
	}

	public void setProDesc(String proDesc) {
		this.proDesc = proDesc;
	}

	public String getAssSecurity() {
		return assSecurity;
	}

	public void setAssSecurity(String assSecurity) {
		this.assSecurity = assSecurity;
	}

	public String getCompletionTime() {
		return completionTime;
	}

	public void setCompletionTime(String completionTime) {
		this.completionTime = completionTime;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCreditCode() {
		return creditCode;
	}

	public void setCreditCode(String creditCode) {
		this.creditCode = creditCode;
	}

	public String getCorporationName() {
		return corporationName;
	}

	public void setCorporationName(String corporationName) {
		this.corporationName = corporationName;
	}

	public String getRelName() {
		return relName;
	}

	public void setRelName(String relName) {
		this.relName = relName;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getRiskLevel() {
		return riskLevel;
	}

	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getCfTargetStatus() {
		return cfTargetStatus;
	}

	public void setCfTargetStatus(String cfTargetStatus) {
		this.cfTargetStatus = cfTargetStatus;
	}

	public Date getSyncTime() {
		return syncTime;
	}

	public void setSyncTime(Date syncTime) {
		this.syncTime = syncTime;
	}

	public Date getCreateDateFrom() {
		return createDateFrom;
	}

	public void setCreateDateFrom(Date createDateFrom) {
		this.createDateFrom = createDateFrom;
	}

	public Date getCreateDateTo() {
		return createDateTo;
	}

	public void setCreateDateTo(Date createDateTo) {
		this.createDateTo = createDateTo;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "TCreditCfLoanDetail{" + "cfLoanCode=" + cfLoanCode + ", customerId=" + customerId + ", contractCode="
				+ contractCode + ", reviewStatus=" + reviewStatus + ", targetCode=" + targetCode + ", targetName="
				+ targetName + ", repaymentType=" + repaymentType + ", isUpContract=" + isUpContract + ", borrowerName="
				+ borrowerName + ", borrowerLoanAmount=" + borrowerLoanAmount + ", borrowerFkAmount=" + borrowerFkAmount
				+ ", borrowerChargeAmount=" + borrowerChargeAmount + ", borrowerInterestRate=" + borrowerInterestRate
				+ ", borrowerInterest=" + borrowerInterest + ", borrowerDueTime=" + borrowerDueTime
				+ ", borrowerDueTimeType=" + borrowerDueTimeType + ", merchantName=" + merchantName + ", hryId=" + hryId
				+ ", opStatus=" + opStatus + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", borrowerType=" + borrowerType + ", borrowerIdType=" + borrowerIdType + ", bidRate=" + bidRate
				+ ", serviceRate=" + serviceRate + ", contractPattern=" + contractPattern + ", commentInfo="
				+ commentInfo + ", guarantor=" + guarantor + ", guaranteeLetter=" + guaranteeLetter + ", regionId="
				+ regionId + ", bidRepaymentType=" + bidRepaymentType + ", overdueRules=" + overdueRules + ", proDesc="
				+ proDesc + ", assSecurity=" + assSecurity + ", completionTime=" + completionTime + ", companyName="
				+ companyName + ", creditCode=" + creditCode + ", corporationName=" + corporationName + ", relName="
				+ relName + ", goodsName=" + goodsName + ", customerName=" + customerName + ", riskLevel=" + riskLevel
				+ ", cfTargetStatus=" + cfTargetStatus + ", syncTime=" + syncTime + "}";
	}
}
