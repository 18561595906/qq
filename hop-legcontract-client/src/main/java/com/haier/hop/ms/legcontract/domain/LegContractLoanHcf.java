package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 借据表-海尔消金
 * </p>
 *
 * @author shiyingxin
 * @since 2020-04-15
 */
@TableName("leg_contract_loan_hcf")
public class LegContractLoanHcf extends Model<LegContractLoanHcf> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableField("loan_id")
	private String loanId;
	/**
	 * 借据号
	 */
	@TableField("loan_no")
	private String loanNo;
	/**
	 * 分支机构代码
	 */
	@TableField("bch_cde")
	private String bchCde;
	/**
	 * 商户/经销商代码
	 */
	@TableField("dealer_cde")
	private String dealerCde;
	/**
	 * 贷款状态
	 */
	@TableField("loan_sts")
	private String loanSts;
	/**
	 * 贷款月数
	 */
	private BigDecimal tnr;
	/**
	 * 最后到期日
	 */
	@TableField("last_due_dt")
	private String lastDueDt;
	/**
	 * 起息日
	 */
	@TableField("int_start_dt")
	private String intStartDt;
	/**
	 * 账务状态
	 */
	@TableField("loan_debt_sts")
	private String loanDebtSts;
	/**
	 * 第一次扣款日
	 */
	@TableField("fst_paym_dt")
	private String fstPaymDt;
	/**
	 * 还款日
	 */
	@TableField("due_day")
	private BigDecimal dueDay;
	/**
	 * 放款日期
	 */
	@TableField("loan_actv_dt")
	private String loanActvDt;
	/**
	 * 上一次扣款日
	 */
	@TableField("last_setl_dt")
	private String lastSetlDt;
	/**
	 * 当前归还日期
	 */
	@TableField("cur_due_dt")
	private String curDueDt;
	/**
	 * 下一次还款日
	 */
	@TableField("next_due_dt")
	private String nextDueDt;
	/**
	 * 下一次账单日
	 */
	@TableField("next_bill_dt")
	private String nextBillDt;
	/**
	 * 还款间隔单位
	 */
	@TableField("paym_freq_unit")
	private String paymFreqUnit;
	/**
	 * 还款间隔
	 */
	@TableField("paym_freq_freq")
	private BigDecimal paymFreqFreq;
	/**
	 * 币种
	 */
	@TableField("loan_ccy")
	private String loanCcy;
	/**
	 * 发放金额
	 */
	@TableField("orig_prcp")
	private BigDecimal origPrcp;
	/**
	 * 剩余本金
	 */
	@TableField("loan_os_prcp")
	private BigDecimal loanOsPrcp;
	/**
	 * 期数
	 */
	@TableField("loan_tnr")
	private BigDecimal loanTnr;
	/**
	 * 贷款多余天数
	 */
	@TableField("loan_os_day")
	private BigDecimal loanOsDay;
	/**
	 * 核销日期
	 */
	@TableField("charge_dt")
	private String chargeDt;
	/**
	 * 利率调整生效日期
	 */
	@TableField("rat_chg_eff_dt")
	private String ratChgEffDt;
	/**
	 * 业务数据来源
	 */
	@TableField("buss_typ")
	private String bussTyp;
	/**
	 * 还款方式
	 */
	@TableField("loan_paym_mtd")
	private String loanPaymMtd;
	/**
	 * 还款方式类型
	 */
	@TableField("loan_paym_typ")
	private String loanPaymTyp;
	/**
	 * 原最后到期日
	 */
	@TableField("old_last_due_dt")
	private String oldLastDueDt;
	/**
	 * 账单日
	 */
	@TableField("bill_day")
	private BigDecimal billDay;
	/**
	 * 列表编号
	 */
	@TableField("lis_id")
	private String lisId;
	/**
	 * 申请用户编号
	 */
	@TableField("app_user_id")
	private String appUserId;
	/**
	 * 申请用户名
	 */
	@TableField("app_user_name")
	private String appUserName;
	/**
	 * 申请用户机构号
	 */
	@TableField("app_user_org_no")
	private String appUserOrgNo;
	/**
	 * 真实利率
	 */
	@TableField("rl_int_rate")
	private BigDecimal rlIntRate;
	/**
	 * 还款渠道
	 */
	@TableField("paym_channel")
	private String paymChannel;
	/**
	 * 记账渠道
	 */
	@TableField("act_channel")
	private String actChannel;
	/**
	 * 还款渠道获取方式
	 */
	@TableField("paym_channel_type")
	private String paymChannelType;
	/**
	 * 公司代码(收款方)
	 */
	@TableField("ind_commp_code")
	private String indCommpCode;
	/**
	 * 付款方编码
	 */
	@TableField("pay_code")
	private String payCode;
	/**
	 * 商户代码
	 */
	@TableField("dealer_sum")
	private String dealerSum;
	/**
	 * 来源系统名称
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
	 * 备用字段1
	 */
	private String reserved1;
	/**
	 * 备用字段2
	 */
	private String reserved2;
	/**
	 * 备用字段3
	 */
	private String reserved3;
	/**
	 * 备用字段4
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

	// 创建时间开始
	@TableField(exist = false)
	private Date createDateFrom;

	// 创建时间结束
	@TableField(exist = false)
	private Date createDateTo;

	public String getLoanId() {
		return loanId;
	}

	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}

	public String getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(String loanNo) {
		this.loanNo = loanNo;
	}

	public String getBchCde() {
		return bchCde;
	}

	public void setBchCde(String bchCde) {
		this.bchCde = bchCde;
	}

	public String getDealerCde() {
		return dealerCde;
	}

	public void setDealerCde(String dealerCde) {
		this.dealerCde = dealerCde;
	}

	public String getLoanSts() {
		return loanSts;
	}

	public void setLoanSts(String loanSts) {
		this.loanSts = loanSts;
	}

	public BigDecimal getTnr() {
		return tnr;
	}

	public void setTnr(BigDecimal tnr) {
		this.tnr = tnr;
	}

	public String getLastDueDt() {
		return lastDueDt;
	}

	public void setLastDueDt(String lastDueDt) {
		this.lastDueDt = lastDueDt;
	}

	public String getIntStartDt() {
		return intStartDt;
	}

	public void setIntStartDt(String intStartDt) {
		this.intStartDt = intStartDt;
	}

	public String getLoanDebtSts() {
		return loanDebtSts;
	}

	public void setLoanDebtSts(String loanDebtSts) {
		this.loanDebtSts = loanDebtSts;
	}

	public String getFstPaymDt() {
		return fstPaymDt;
	}

	public void setFstPaymDt(String fstPaymDt) {
		this.fstPaymDt = fstPaymDt;
	}

	public BigDecimal getDueDay() {
		return dueDay;
	}

	public void setDueDay(BigDecimal dueDay) {
		this.dueDay = dueDay;
	}

	public String getLoanActvDt() {
		return loanActvDt;
	}

	public void setLoanActvDt(String loanActvDt) {
		this.loanActvDt = loanActvDt;
	}

	public String getLastSetlDt() {
		return lastSetlDt;
	}

	public void setLastSetlDt(String lastSetlDt) {
		this.lastSetlDt = lastSetlDt;
	}

	public String getCurDueDt() {
		return curDueDt;
	}

	public void setCurDueDt(String curDueDt) {
		this.curDueDt = curDueDt;
	}

	public String getNextDueDt() {
		return nextDueDt;
	}

	public void setNextDueDt(String nextDueDt) {
		this.nextDueDt = nextDueDt;
	}

	public String getNextBillDt() {
		return nextBillDt;
	}

	public void setNextBillDt(String nextBillDt) {
		this.nextBillDt = nextBillDt;
	}

	public String getPaymFreqUnit() {
		return paymFreqUnit;
	}

	public void setPaymFreqUnit(String paymFreqUnit) {
		this.paymFreqUnit = paymFreqUnit;
	}

	public BigDecimal getPaymFreqFreq() {
		return paymFreqFreq;
	}

	public void setPaymFreqFreq(BigDecimal paymFreqFreq) {
		this.paymFreqFreq = paymFreqFreq;
	}

	public String getLoanCcy() {
		return loanCcy;
	}

	public void setLoanCcy(String loanCcy) {
		this.loanCcy = loanCcy;
	}

	public BigDecimal getOrigPrcp() {
		return origPrcp;
	}

	public void setOrigPrcp(BigDecimal origPrcp) {
		this.origPrcp = origPrcp;
	}

	public BigDecimal getLoanOsPrcp() {
		return loanOsPrcp;
	}

	public void setLoanOsPrcp(BigDecimal loanOsPrcp) {
		this.loanOsPrcp = loanOsPrcp;
	}

	public BigDecimal getLoanTnr() {
		return loanTnr;
	}

	public void setLoanTnr(BigDecimal loanTnr) {
		this.loanTnr = loanTnr;
	}

	public BigDecimal getLoanOsDay() {
		return loanOsDay;
	}

	public void setLoanOsDay(BigDecimal loanOsDay) {
		this.loanOsDay = loanOsDay;
	}

	public String getChargeDt() {
		return chargeDt;
	}

	public void setChargeDt(String chargeDt) {
		this.chargeDt = chargeDt;
	}

	public String getRatChgEffDt() {
		return ratChgEffDt;
	}

	public void setRatChgEffDt(String ratChgEffDt) {
		this.ratChgEffDt = ratChgEffDt;
	}

	public String getBussTyp() {
		return bussTyp;
	}

	public void setBussTyp(String bussTyp) {
		this.bussTyp = bussTyp;
	}

	public String getLoanPaymMtd() {
		return loanPaymMtd;
	}

	public void setLoanPaymMtd(String loanPaymMtd) {
		this.loanPaymMtd = loanPaymMtd;
	}

	public String getLoanPaymTyp() {
		return loanPaymTyp;
	}

	public void setLoanPaymTyp(String loanPaymTyp) {
		this.loanPaymTyp = loanPaymTyp;
	}

	public String getOldLastDueDt() {
		return oldLastDueDt;
	}

	public void setOldLastDueDt(String oldLastDueDt) {
		this.oldLastDueDt = oldLastDueDt;
	}

	public BigDecimal getBillDay() {
		return billDay;
	}

	public void setBillDay(BigDecimal billDay) {
		this.billDay = billDay;
	}

	public String getLisId() {
		return lisId;
	}

	public void setLisId(String lisId) {
		this.lisId = lisId;
	}

	public String getAppUserId() {
		return appUserId;
	}

	public void setAppUserId(String appUserId) {
		this.appUserId = appUserId;
	}

	public String getAppUserName() {
		return appUserName;
	}

	public void setAppUserName(String appUserName) {
		this.appUserName = appUserName;
	}

	public String getAppUserOrgNo() {
		return appUserOrgNo;
	}

	public void setAppUserOrgNo(String appUserOrgNo) {
		this.appUserOrgNo = appUserOrgNo;
	}

	public BigDecimal getRlIntRate() {
		return rlIntRate;
	}

	public void setRlIntRate(BigDecimal rlIntRate) {
		this.rlIntRate = rlIntRate;
	}

	public String getPaymChannel() {
		return paymChannel;
	}

	public void setPaymChannel(String paymChannel) {
		this.paymChannel = paymChannel;
	}

	public String getActChannel() {
		return actChannel;
	}

	public void setActChannel(String actChannel) {
		this.actChannel = actChannel;
	}

	public String getPaymChannelType() {
		return paymChannelType;
	}

	public void setPaymChannelType(String paymChannelType) {
		this.paymChannelType = paymChannelType;
	}

	public String getIndCommpCode() {
		return indCommpCode;
	}

	public void setIndCommpCode(String indCommpCode) {
		this.indCommpCode = indCommpCode;
	}

	public String getPayCode() {
		return payCode;
	}

	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}

	public String getDealerSum() {
		return dealerSum;
	}

	public void setDealerSum(String dealerSum) {
		this.dealerSum = dealerSum;
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
		return "LegContractLoanHcf{" + "loanId=" + loanId + ", loanNo=" + loanNo + ", bchCde=" + bchCde + ", dealerCde="
				+ dealerCde + ", loanSts=" + loanSts + ", tnr=" + tnr + ", lastDueDt=" + lastDueDt + ", intStartDt="
				+ intStartDt + ", loanDebtSts=" + loanDebtSts + ", fstPaymDt=" + fstPaymDt + ", dueDay=" + dueDay
				+ ", loanActvDt=" + loanActvDt + ", lastSetlDt=" + lastSetlDt + ", curDueDt=" + curDueDt
				+ ", nextDueDt=" + nextDueDt + ", nextBillDt=" + nextBillDt + ", paymFreqUnit=" + paymFreqUnit
				+ ", paymFreqFreq=" + paymFreqFreq + ", loanCcy=" + loanCcy + ", origPrcp=" + origPrcp + ", loanOsPrcp="
				+ loanOsPrcp + ", loanTnr=" + loanTnr + ", loanOsDay=" + loanOsDay + ", chargeDt=" + chargeDt
				+ ", ratChgEffDt=" + ratChgEffDt + ", bussTyp=" + bussTyp + ", loanPaymMtd=" + loanPaymMtd
				+ ", loanPaymTyp=" + loanPaymTyp + ", oldLastDueDt=" + oldLastDueDt + ", billDay=" + billDay
				+ ", lisId=" + lisId + ", appUserId=" + appUserId + ", appUserName=" + appUserName + ", appUserOrgNo="
				+ appUserOrgNo + ", rlIntRate=" + rlIntRate + ", paymChannel=" + paymChannel + ", actChannel="
				+ actChannel + ", paymChannelType=" + paymChannelType + ", indCommpCode=" + indCommpCode + ", payCode="
				+ payCode + ", dealerSum=" + dealerSum + ", sourceName=" + sourceName + ", contractStatus="
				+ contractStatus + ", remark=" + remark + ", reserved1=" + reserved1 + ", reserved2=" + reserved2
				+ ", reserved3=" + reserved3 + ", reserved4=" + reserved4 + ", createDate=" + createDate
				+ ", updateDate=" + updateDate + "}";
	}
}
