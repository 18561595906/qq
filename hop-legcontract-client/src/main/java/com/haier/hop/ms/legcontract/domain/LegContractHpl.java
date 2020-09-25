package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 对接海尔小额贷款合同数据表
 * </p>
 *
 * @author shiyingxin
 * @since 2020-03-26
 */
@TableName("leg_contract_hpl")
public class LegContractHpl extends Model<LegContractHpl> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableField("contract_id")
	private String contractId;
	/**
	 * 业务客户经理工号
	 */
	@TableField("applier_id")
	private String applierId;
	/**
	 * 业务客户经理姓名
	 */
	@TableField("applier_name")
	private String applierName;
	/**
	 * 业务客户经理邮箱
	 */
	@TableField("contract_email")
	private String contractEmail;
	/**
	 * 业务客户经理电话
	 */
	@TableField("contract_phone")
	private String contractPhone;
	/**
	 * 贷款合同开始日期
	 */
	@TableField("begin_date")
	private Date beginDate;
	/**
	 * 合同编号
	 */
	@TableField("contract_no")
	private String contractNo;
	/**
	 * 合同名称
	 */
	@TableField("contract_name")
	private String contractName;
	/**
	 * 客户名称
	 */
	@TableField("contract_partner1")
	private String contractPartner1;
	/**
	 * 乙方签约单位
	 */
	@TableField("contract_partner2")
	private String contractPartner2;
	/**
	 * 合同类型 0非标 1标准 2按标准编辑
	 */
	@TableField("contract_type")
	private String contractType;
	/**
	 * 贷款合同开始日期
	 */
	@TableField("create_time")
	private Date createTime;
	/**
	 * 贷款期限
	 */
	@TableField("effective_date")
	private BigDecimal effectiveDate;
	/**
	 * 贷款合同结束日期
	 */
	@TableField("end_date")
	private Date endDate;
	/**
	 * 贷款金额
	 */
	@TableField("pay_amount")
	private BigDecimal payAmount;
	/**
	 * 贷款金额
	 */
	@TableField("pay_cny")
	private BigDecimal payCny;
	/**
	 * 1：海尔是付款方 0：海尔是收款方
	 */
	@TableField("receive_payer")
	private String receivePayer;
	/**
	 * 借据号
	 */
	private String loanacno;
	/**
	 * 贷款状态
	 */
	private String acflag;
	/**
	 * 最后到期日
	 */
	@TableField("loan_enddate")
	private Date loanEnddate;
	/**
	 * 起息日
	 */
	private Date firstintedate;
	/**
	 * 第一次扣款日
	 */
	private Date firstpaydate;
	/**
	 * 还款日
	 */
	private BigDecimal payday;
	/**
	 * 放款日期
	 */
	@TableField("loan_begindate")
	private Date loanBegindate;
	/**
	 * 还款间隔单位
	 */
	private String retufreq;
	/**
	 * 还款间隔
	 */
	private BigDecimal retuincr;
	/**
	 * 币种
	 */
	private String currsign;
	/**
	 * 发放金额
	 */
	private BigDecimal tcapi;
	/**
	 * 期数
	 */
	private BigDecimal tterm;
	/**
	 * 还款方式
	 */
	private String retukindname;
	/**
	 * 真实利率
	 */
	private BigDecimal pinterate;
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
	private String busino;
	private String contpaperno;
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

	// 贷款开始时间From
	@TableField(exist = false)
	private Date beginDateFrom;

	// 贷款开始时间To
	@TableField(exist = false)
	private Date beginDateTo;

	// 同步时间From
	@TableField(exist = false)
	private Date createDateFrom;

	// 同步时间To
	@TableField(exist = false)
	private Date createDateTo;

	/**
	 * 贷款合同开始日期
	 */
	@TableField(exist = false)
	private String beginDateStr;

	/**
	 * 贷款合同结束日期
	 */
	@TableField(exist = false)
	private String endDateStr;

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
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

	public String getContractEmail() {
		return contractEmail;
	}

	public void setContractEmail(String contractEmail) {
		this.contractEmail = contractEmail;
	}

	public String getContractPhone() {
		return contractPhone;
	}

	public void setContractPhone(String contractPhone) {
		this.contractPhone = contractPhone;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
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

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public BigDecimal getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(BigDecimal effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public BigDecimal getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(BigDecimal payAmount) {
		this.payAmount = payAmount;
	}

	public BigDecimal getPayCny() {
		return payCny;
	}

	public void setPayCny(BigDecimal payCny) {
		this.payCny = payCny;
	}

	public String getReceivePayer() {
		return receivePayer;
	}

	public void setReceivePayer(String receivePayer) {
		this.receivePayer = receivePayer;
	}

	public String getLoanacno() {
		return loanacno;
	}

	public void setLoanacno(String loanacno) {
		this.loanacno = loanacno;
	}

	public String getAcflag() {
		return acflag;
	}

	public void setAcflag(String acflag) {
		this.acflag = acflag;
	}

	public Date getLoanEnddate() {
		return loanEnddate;
	}

	public void setLoanEnddate(Date loanEnddate) {
		this.loanEnddate = loanEnddate;
	}

	public Date getFirstintedate() {
		return firstintedate;
	}

	public void setFirstintedate(Date firstintedate) {
		this.firstintedate = firstintedate;
	}

	public Date getFirstpaydate() {
		return firstpaydate;
	}

	public void setFirstpaydate(Date firstpaydate) {
		this.firstpaydate = firstpaydate;
	}

	public BigDecimal getPayday() {
		return payday;
	}

	public void setPayday(BigDecimal payday) {
		this.payday = payday;
	}

	public Date getLoanBegindate() {
		return loanBegindate;
	}

	public void setLoanBegindate(Date loanBegindate) {
		this.loanBegindate = loanBegindate;
	}

	public String getRetufreq() {
		return retufreq;
	}

	public void setRetufreq(String retufreq) {
		this.retufreq = retufreq;
	}

	public BigDecimal getRetuincr() {
		return retuincr;
	}

	public void setRetuincr(BigDecimal retuincr) {
		this.retuincr = retuincr;
	}

	public String getCurrsign() {
		return currsign;
	}

	public void setCurrsign(String currsign) {
		this.currsign = currsign;
	}

	public BigDecimal getTcapi() {
		return tcapi;
	}

	public void setTcapi(BigDecimal tcapi) {
		this.tcapi = tcapi;
	}

	public BigDecimal getTterm() {
		return tterm;
	}

	public void setTterm(BigDecimal tterm) {
		this.tterm = tterm;
	}

	public String getRetukindname() {
		return retukindname;
	}

	public void setRetukindname(String retukindname) {
		this.retukindname = retukindname;
	}

	public BigDecimal getPinterate() {
		return pinterate;
	}

	public void setPinterate(BigDecimal pinterate) {
		this.pinterate = pinterate;
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

	public String getBusino() {
		return busino;
	}

	public void setBusino(String busino) {
		this.busino = busino;
	}

	public String getContpaperno() {
		return contpaperno;
	}

	public void setContpaperno(String contpaperno) {
		this.contpaperno = contpaperno;
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

	public Date getBeginDateFrom() {
		return beginDateFrom;
	}

	public void setBeginDateFrom(Date beginDateFrom) {
		this.beginDateFrom = beginDateFrom;
	}

	public Date getBeginDateTo() {
		return beginDateTo;
	}

	public void setBeginDateTo(Date beginDateTo) {
		this.beginDateTo = beginDateTo;
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

	public String getBeginDateStr() {
		return beginDateStr;
	}

	public void setBeginDateStr(String beginDateStr) {
		this.beginDateStr = beginDateStr;
	}

	public String getEndDateStr() {
		return endDateStr;
	}

	public void setEndDateStr(String endDateStr) {
		this.endDateStr = endDateStr;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegContractHpl{" + "contractId=" + contractId + ", applierId=" + applierId + ", applierName="
				+ applierName + ", contractEmail=" + contractEmail + ", contractPhone=" + contractPhone + ", beginDate="
				+ beginDate + ", contractNo=" + contractNo + ", contractName=" + contractName + ", contractPartner1="
				+ contractPartner1 + ", contractPartner2=" + contractPartner2 + ", contractType=" + contractType
				+ ", createTime=" + createTime + ", effectiveDate=" + effectiveDate + ", endDate=" + endDate
				+ ", payAmount=" + payAmount + ", payCny=" + payCny + ", receivePayer=" + receivePayer + ", loanacno="
				+ loanacno + ", acflag=" + acflag + ", loanEnddate=" + loanEnddate + ", firstintedate=" + firstintedate
				+ ", firstpaydate=" + firstpaydate + ", payday=" + payday + ", loanBegindate=" + loanBegindate
				+ ", retufreq=" + retufreq + ", retuincr=" + retuincr + ", currsign=" + currsign + ", tcapi=" + tcapi
				+ ", tterm=" + tterm + ", retukindname=" + retukindname + ", pinterate=" + pinterate + ", sourceName="
				+ sourceName + ", contractStatus=" + contractStatus + ", remark=" + remark + ", busino=" + busino
				+ ", contpaperno=" + contpaperno + ", reserved1=" + reserved1 + ", reserved2=" + reserved2
				+ ", reserved3=" + reserved3 + ", reserved4=" + reserved4 + ", createDate=" + createDate
				+ ", updateDate=" + updateDate + "}";
	}
}
