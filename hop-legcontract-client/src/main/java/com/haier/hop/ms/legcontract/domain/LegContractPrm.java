package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 日日顺物流合同数据对接表
 * </p>
 *
 * @author shiyingxin
 * @since 2020-04-15
 */
@TableName("leg_contract_prm")
public class LegContractPrm extends Model<LegContractPrm> {

	private static final long serialVersionUID = 1L;

	@TableField("contract_id")
	private String contractId;
	/**
	 * 客户ID
	 */
	@TableField("customer_id")
	private BigDecimal customerId;
	/**
	 * 客户代码
	 */
	@TableField("customer_code")
	private String customerCode;
	/**
	 * 客户中文全称
	 */
	@TableField("customer_chinese_name")
	private String customerChineseName;
	/**
	 * 业务范畴
	 */
	private String bss;
	/**
	 * 信用期限类型
	 */
	@TableField("credit_period_type")
	private String creditPeriodType;
	/**
	 * 利润中心
	 */
	@TableField("profit_center")
	private String profitCenter;
	/**
	 * 默认币种
	 */
	private String currency;
	/**
	 * 信用期限（天）
	 */
	@TableField("credit_period")
	private BigDecimal creditPeriod;
	/**
	 * 合同开始日期
	 */
	@TableField("maturity_date_begin")
	private Date maturityDateBegin;
	/**
	 * 合同截止日期
	 */
	@TableField("maturity_date_end")
	private Date maturityDateEnd;
	/**
	 * 合作伙伴分类
	 */
	@TableField("partner_category")
	private String partnerCategory;
	/**
	 * 信用等级
	 */
	@TableField("credit_rating")
	private String creditRating;
	/**
	 * 信用额度（万元）
	 */
	@TableField("line_credit")
	private BigDecimal lineCredit;
	/**
	 * 来源系统
	 */
	@TableField("source_name")
	private String sourceName;
	@TableField("contract_status")
	private String contractStatus;
	private String remark;
	private String reserved1;
	private String reserved2;
	private String reserved3;
	private String reserved4;
	/**
	 * 创建时间
	 */
	@TableField("create_date")
	private Date createDate;
	/**
	 * 更新时间
	 */
	@TableField("update_date")
	private Date updateDate;

	// 创建时间开始
	@TableField(exist = false)
	private Date createDateFrom;

	// 创建时间结束
	@TableField(exist = false)
	private Date createDateTo;

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public BigDecimal getCustomerId() {
		return customerId;
	}

	public void setCustomerId(BigDecimal customerId) {
		this.customerId = customerId;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerChineseName() {
		return customerChineseName;
	}

	public void setCustomerChineseName(String customerChineseName) {
		this.customerChineseName = customerChineseName;
	}

	public String getBss() {
		return bss;
	}

	public void setBss(String bss) {
		this.bss = bss;
	}

	public String getCreditPeriodType() {
		return creditPeriodType;
	}

	public void setCreditPeriodType(String creditPeriodType) {
		this.creditPeriodType = creditPeriodType;
	}

	public String getProfitCenter() {
		return profitCenter;
	}

	public void setProfitCenter(String profitCenter) {
		this.profitCenter = profitCenter;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getCreditPeriod() {
		return creditPeriod;
	}

	public void setCreditPeriod(BigDecimal creditPeriod) {
		this.creditPeriod = creditPeriod;
	}

	public Date getMaturityDateBegin() {
		return maturityDateBegin;
	}

	public void setMaturityDateBegin(Date maturityDateBegin) {
		this.maturityDateBegin = maturityDateBegin;
	}

	public Date getMaturityDateEnd() {
		return maturityDateEnd;
	}

	public void setMaturityDateEnd(Date maturityDateEnd) {
		this.maturityDateEnd = maturityDateEnd;
	}

	public String getPartnerCategory() {
		return partnerCategory;
	}

	public void setPartnerCategory(String partnerCategory) {
		this.partnerCategory = partnerCategory;
	}

	public String getCreditRating() {
		return creditRating;
	}

	public void setCreditRating(String creditRating) {
		this.creditRating = creditRating;
	}

	public BigDecimal getLineCredit() {
		return lineCredit;
	}

	public void setLineCredit(BigDecimal lineCredit) {
		this.lineCredit = lineCredit;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getContractStatus() {
		return contractStatus;
	}

	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getReserved1() {
		return reserved1;
	}

	public void setReserved1(String reserved1) {
		this.reserved1 = reserved1;
	}

	public String getReserved2() {
		return reserved2;
	}

	public void setReserved2(String reserved2) {
		this.reserved2 = reserved2;
	}

	public String getReserved3() {
		return reserved3;
	}

	public void setReserved3(String reserved3) {
		this.reserved3 = reserved3;
	}

	public String getReserved4() {
		return reserved4;
	}

	public void setReserved4(String reserved4) {
		this.reserved4 = reserved4;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
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
		return "LegContractPrm{" + "contractId=" + contractId + ", customerId=" + customerId + ", customerCode="
				+ customerCode + ", customerChineseName=" + customerChineseName + ", bss=" + bss + ", creditPeriodType="
				+ creditPeriodType + ", profitCenter=" + profitCenter + ", currency=" + currency + ", creditPeriod="
				+ creditPeriod + ", maturityDateBegin=" + maturityDateBegin + ", maturityDateEnd=" + maturityDateEnd
				+ ", partnerCategory=" + partnerCategory + ", creditRating=" + creditRating + ", lineCredit="
				+ lineCredit + ", sourceName=" + sourceName + ", contractStatus=" + contractStatus + ", remark="
				+ remark + ", reserved1=" + reserved1 + ", reserved2=" + reserved2 + ", reserved3=" + reserved3
				+ ", reserved4=" + reserved4 + ", createDate=" + createDate + ", updateDate=" + updateDate + "}";
	}
}
