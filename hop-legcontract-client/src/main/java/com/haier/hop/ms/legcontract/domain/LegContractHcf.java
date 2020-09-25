package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 合同数据-海尔消金
 * </p>
 *
 * @author shiyingxin
 * @since 2020-04-15
 */
@TableName("leg_contract_hcf")
public class LegContractHcf extends Model<LegContractHcf> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableField("contract_id")
	private String contractId;
	/**
	 * 贷款合同号
	 */
	@TableField("loan_cont_no")
	private String loanContNo;
	/**
	 * 银行代码
	 */
	@TableField("bank_cde")
	private String bankCde;
	/**
	 * 贷款品种代码
	 */
	@TableField("loan_typ")
	private String loanTyp;
	/**
	 * 借款人发证国家
	 */
	@TableField("iss_ctry")
	private String issCtry;
	/**
	 * 客户编号
	 */
	@TableField("cust_id")
	private String custId;
	/**
	 * 宽限期类型
	 */
	@TableField("loan_grace_typ")
	private String loanGraceTyp;
	/**
	 * 宽限期天数
	 */
	@TableField("loan_od_grace")
	private BigDecimal loanOdGrace;
	/**
	 * 扣款方式
	 */
	@TableField("loan_repay_mthd")
	private String loanRepayMthd;
	/**
	 * 是否采用固定罚息利率
	 */
	@TableField("loan_fix_od_int_ind")
	private String loanFixOdIntInd;
	/**
	 * 计算罚息部分
	 */
	@TableField("loan_od_comm_part")
	private String loanOdCommPart;
	/**
	 * 是否计算复利
	 */
	@TableField("loan_od_cpd_ind")
	private String loanOdCpdInd;
	/**
	 * 下一次利率调整选项
	 */
	@TableField("next_repc_opt")
	private String nextRepcOpt;
	/**
	 * 下一次利率调整间隔
	 */
	@TableField("next_repc_num")
	private BigDecimal nextRepcNum;
	/**
	 * 下一次利率调整间隔单位
	 */
	@TableField("next_repc_unit")
	private String nextRepcUnit;
	/**
	 * 利率调整选项
	 */
	@TableField("rat_chg_opt")
	private String ratChgOpt;
	/**
	 * 信贷合同号
	 */
	@TableField("cmis_loan_cont_no")
	private String cmisLoanContNo;
	/**
	 * 贷款组
	 */
	@TableField("typ_grp")
	private String typGrp;
	/**
	 * 贷款品种版本号
	 */
	@TableField("typ_ver")
	private BigDecimal typVer;
	/**
	 * 营销专案
	 */
	@TableField("loan_prom")
	private String loanProm;
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

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getLoanContNo() {
		return loanContNo;
	}

	public void setLoanContNo(String loanContNo) {
		this.loanContNo = loanContNo;
	}

	public String getBankCde() {
		return bankCde;
	}

	public void setBankCde(String bankCde) {
		this.bankCde = bankCde;
	}

	public String getLoanTyp() {
		return loanTyp;
	}

	public void setLoanTyp(String loanTyp) {
		this.loanTyp = loanTyp;
	}

	public String getIssCtry() {
		return issCtry;
	}

	public void setIssCtry(String issCtry) {
		this.issCtry = issCtry;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getLoanGraceTyp() {
		return loanGraceTyp;
	}

	public void setLoanGraceTyp(String loanGraceTyp) {
		this.loanGraceTyp = loanGraceTyp;
	}

	public BigDecimal getLoanOdGrace() {
		return loanOdGrace;
	}

	public void setLoanOdGrace(BigDecimal loanOdGrace) {
		this.loanOdGrace = loanOdGrace;
	}

	public String getLoanRepayMthd() {
		return loanRepayMthd;
	}

	public void setLoanRepayMthd(String loanRepayMthd) {
		this.loanRepayMthd = loanRepayMthd;
	}

	public String getLoanFixOdIntInd() {
		return loanFixOdIntInd;
	}

	public void setLoanFixOdIntInd(String loanFixOdIntInd) {
		this.loanFixOdIntInd = loanFixOdIntInd;
	}

	public String getLoanOdCommPart() {
		return loanOdCommPart;
	}

	public void setLoanOdCommPart(String loanOdCommPart) {
		this.loanOdCommPart = loanOdCommPart;
	}

	public String getLoanOdCpdInd() {
		return loanOdCpdInd;
	}

	public void setLoanOdCpdInd(String loanOdCpdInd) {
		this.loanOdCpdInd = loanOdCpdInd;
	}

	public String getNextRepcOpt() {
		return nextRepcOpt;
	}

	public void setNextRepcOpt(String nextRepcOpt) {
		this.nextRepcOpt = nextRepcOpt;
	}

	public BigDecimal getNextRepcNum() {
		return nextRepcNum;
	}

	public void setNextRepcNum(BigDecimal nextRepcNum) {
		this.nextRepcNum = nextRepcNum;
	}

	public String getNextRepcUnit() {
		return nextRepcUnit;
	}

	public void setNextRepcUnit(String nextRepcUnit) {
		this.nextRepcUnit = nextRepcUnit;
	}

	public String getRatChgOpt() {
		return ratChgOpt;
	}

	public void setRatChgOpt(String ratChgOpt) {
		this.ratChgOpt = ratChgOpt;
	}

	public String getCmisLoanContNo() {
		return cmisLoanContNo;
	}

	public void setCmisLoanContNo(String cmisLoanContNo) {
		this.cmisLoanContNo = cmisLoanContNo;
	}

	public String getTypGrp() {
		return typGrp;
	}

	public void setTypGrp(String typGrp) {
		this.typGrp = typGrp;
	}

	public BigDecimal getTypVer() {
		return typVer;
	}

	public void setTypVer(BigDecimal typVer) {
		this.typVer = typVer;
	}

	public String getLoanProm() {
		return loanProm;
	}

	public void setLoanProm(String loanProm) {
		this.loanProm = loanProm;
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
		return "LegContractHcf{" + "contractId=" + contractId + ", loanContNo=" + loanContNo + ", bankCde=" + bankCde
				+ ", loanTyp=" + loanTyp + ", issCtry=" + issCtry + ", custId=" + custId + ", loanGraceTyp="
				+ loanGraceTyp + ", loanOdGrace=" + loanOdGrace + ", loanRepayMthd=" + loanRepayMthd
				+ ", loanFixOdIntInd=" + loanFixOdIntInd + ", loanOdCommPart=" + loanOdCommPart + ", loanOdCpdInd="
				+ loanOdCpdInd + ", nextRepcOpt=" + nextRepcOpt + ", nextRepcNum=" + nextRepcNum + ", nextRepcUnit="
				+ nextRepcUnit + ", ratChgOpt=" + ratChgOpt + ", cmisLoanContNo=" + cmisLoanContNo + ", typGrp="
				+ typGrp + ", typVer=" + typVer + ", loanProm=" + loanProm + ", sourceName=" + sourceName
				+ ", contractStatus=" + contractStatus + ", remark=" + remark + ", reserved1=" + reserved1
				+ ", reserved2=" + reserved2 + ", reserved3=" + reserved3 + ", reserved4=" + reserved4 + ", createDate="
				+ createDate + ", updateDate=" + updateDate + "}";
	}
}
