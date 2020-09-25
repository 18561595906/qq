package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 合同数据-融租
 * </p>
 *
 * @author shiyingxin
 * @since 2020-04-03
 */
@TableName("leg_contract_hrt")
public class LegContractHrt extends Model<LegContractHrt> {

	private static final long serialVersionUID = 1L;

	@TableField("SEARCH_TERM_1")
	private String searchTerm1;
	/**
	 * id
	 */
	@TableField("contract_id")
	private String contractId;
	/**
	 * 合同号
	 */
	@TableField("contract_no")
	private String contractNo;
	/**
	 * 业务类型
	 */
	@TableField("biz_type")
	private String bizType;
	/**
	 * 承租人名称
	 */
	private String lessee;
	/**
	 * 利率类型
	 */
	@TableField("rate_type")
	private String rateType;
	/**
	 * 支付类型
	 */
	@TableField("pay_type")
	private BigDecimal payType;
	/**
	 * 还款期数
	 */
	@TableField("repay_period")
	private BigDecimal repayPeriod;
	/**
	 * 支付频率
	 */
	@TableField("pay_frequency")
	private String payFrequency;
	/**
	 * 合同期限（月）
	 */
	@TableField("contract_deadline")
	private String contractDeadline;
	/**
	 * 租赁融资额
	 */
	@TableField("lease_facility")
	private BigDecimal leaseFacility;
	/**
	 * 租赁物总价款
	 */
	@TableField("lease_total_price")
	private BigDecimal leaseTotalPrice;
	/**
	 * 租金总额
	 */
	@TableField("total_rent")
	private BigDecimal totalRent;
	/**
	 * 首付款
	 */
	@TableField("pay_advance")
	private BigDecimal payAdvance;
	/**
	 * 手续费
	 */
	@TableField("handling_fee")
	private BigDecimal handlingFee;
	/**
	 * 保证金
	 */
	@TableField("margin_money")
	private BigDecimal marginMoney;
	/**
	 * 留购价款
	 */
	@TableField("purchase_price")
	private BigDecimal purchasePrice;
	/**
	 * 来源系统名
	 */
	@TableField("source_name")
	private String sourceName;
	/**
	 * 合同状态
	 */
	@TableField("contract_status")
	private String contractStatus;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 保留字段1
	 */
	private String reserved1;
	/**
	 * 保留字段2
	 */
	private String reserved2;
	/**
	 * 保留字段3
	 */
	private String reserved3;
	/**
	 * 保留字段4
	 */
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

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getBizType() {
		return bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getLessee() {
		return lessee;
	}

	public void setLessee(String lessee) {
		this.lessee = lessee;
	}

	public String getRateType() {
		return rateType;
	}

	public void setRateType(String rateType) {
		this.rateType = rateType;
	}

	public BigDecimal getPayType() {
		return payType;
	}

	public void setPayType(BigDecimal payType) {
		this.payType = payType;
	}

	public BigDecimal getRepayPeriod() {
		return repayPeriod;
	}

	public void setRepayPeriod(BigDecimal repayPeriod) {
		this.repayPeriod = repayPeriod;
	}

	public String getPayFrequency() {
		return payFrequency;
	}

	public void setPayFrequency(String payFrequency) {
		this.payFrequency = payFrequency;
	}

	public String getContractDeadline() {
		return contractDeadline;
	}

	public void setContractDeadline(String contractDeadline) {
		this.contractDeadline = contractDeadline;
	}

	public BigDecimal getLeaseFacility() {
		return leaseFacility;
	}

	public void setLeaseFacility(BigDecimal leaseFacility) {
		this.leaseFacility = leaseFacility;
	}

	public BigDecimal getLeaseTotalPrice() {
		return leaseTotalPrice;
	}

	public void setLeaseTotalPrice(BigDecimal leaseTotalPrice) {
		this.leaseTotalPrice = leaseTotalPrice;
	}

	public BigDecimal getTotalRent() {
		return totalRent;
	}

	public void setTotalRent(BigDecimal totalRent) {
		this.totalRent = totalRent;
	}

	public BigDecimal getPayAdvance() {
		return payAdvance;
	}

	public void setPayAdvance(BigDecimal payAdvance) {
		this.payAdvance = payAdvance;
	}

	public BigDecimal getHandlingFee() {
		return handlingFee;
	}

	public void setHandlingFee(BigDecimal handlingFee) {
		this.handlingFee = handlingFee;
	}

	public BigDecimal getMarginMoney() {
		return marginMoney;
	}

	public void setMarginMoney(BigDecimal marginMoney) {
		this.marginMoney = marginMoney;
	}

	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
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

	public String getSearchTerm1() {
		return searchTerm1;
	}

	public void setSearchTerm1(String searchTerm1) {
		this.searchTerm1 = searchTerm1;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegContractHrt{" + "contractId=" + contractId + ", contractNo=" + contractNo + ", bizType=" + bizType
				+ ", lessee=" + lessee + ", rateType=" + rateType + ", payType=" + payType + ", repayPeriod="
				+ repayPeriod + ", payFrequency=" + payFrequency + ", contractDeadline=" + contractDeadline
				+ ", leaseFacility=" + leaseFacility + ", leaseTotalPrice=" + leaseTotalPrice + ", totalRent="
				+ totalRent + ", payAdvance=" + payAdvance + ", handlingFee=" + handlingFee + ", marginMoney="
				+ marginMoney + ", purchasePrice=" + purchasePrice + ", sourceName=" + sourceName + ", contractStatus="
				+ contractStatus + ", remark=" + remark + ", reserved1=" + reserved1 + ", reserved2=" + reserved2
				+ ", reserved3=" + reserved3 + ", reserved4=" + reserved4 + ", createDate=" + createDate
				+ ", updateDate=" + updateDate + ", searchTerm1=" + searchTerm1 + "}";
	}
}
