package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * VIEW
 * </p>
 *
 * @author shiyingxin
 * @since 2020-03-16
 */
@TableName("v_leg_contract_goip")
public class VLegContractGoip extends Model<VLegContractGoip> {

	private static final long serialVersionUID = 1L;

	/**
	 * 合同流水号
	 */
	@TableField("contNo")
	private String contNo;
	/**
	 * 合同编码（生成规则公议时间+流水号）
	 */
	@TableField("contract_no")
	private String contractNo;
	/**
	 * 合同名称
	 */
	@TableField("contract_name")
	private String contractName;
	/**
	 * 合作方编码
	 */
	@TableField("partners_no")
	private String partnersNo;
	/**
	 * 合作方名称
	 */
	@TableField("partners_name")
	private String partnersName;
	/**
	 * 合作方编码
	 */
	@TableField("partners_no_rel")
	private String partnersNoRel;
	/**
	 * 合作方名称
	 */
	@TableField("partners_name_rel")
	private String partnersNameRel;
	/**
	 * 合同付款金额
	 */
	private BigDecimal amount;
	/**
	 * 里程碑名称
	 */
	@TableField("goal_name")
	private String goalName;
	/**
	 * 付款比例
	 */
	@TableField("goal_pay_ratio")
	private BigDecimal goalPayRatio;
	/**
	 * 付款金额
	 */
	@TableField("goal_pay_money")
	private BigDecimal goalPayMoney;
	@TableField("signDate")
	private String signDate;
	@TableField("beginDate")
	private String beginDate;
	@TableField("endDate")
	private String endDate;

	public String getContNo() {
		return contNo;
	}

	public void setContNo(String contNo) {
		this.contNo = contNo;
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

	public String getPartnersNo() {
		return partnersNo;
	}

	public void setPartnersNo(String partnersNo) {
		this.partnersNo = partnersNo;
	}

	public String getPartnersName() {
		return partnersName;
	}

	public void setPartnersName(String partnersName) {
		this.partnersName = partnersName;
	}

	public String getPartnersNoRel() {
		return partnersNoRel;
	}

	public void setPartnersNoRel(String partnersNoRel) {
		this.partnersNoRel = partnersNoRel;
	}

	public String getPartnersNameRel() {
		return partnersNameRel;
	}

	public void setPartnersNameRel(String partnersNameRel) {
		this.partnersNameRel = partnersNameRel;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getGoalName() {
		return goalName;
	}

	public void setGoalName(String goalName) {
		this.goalName = goalName;
	}

	public BigDecimal getGoalPayRatio() {
		return goalPayRatio;
	}

	public void setGoalPayRatio(BigDecimal goalPayRatio) {
		this.goalPayRatio = goalPayRatio;
	}

	public BigDecimal getGoalPayMoney() {
		return goalPayMoney;
	}

	public void setGoalPayMoney(BigDecimal goalPayMoney) {
		this.goalPayMoney = goalPayMoney;
	}

	public String getSignDate() {
		return signDate;
	}

	public void setSignDate(String signDate) {
		this.signDate = signDate;
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

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "VLegContractGoip{" + "contNo=" + contNo + ", contractNo=" + contractNo + ", contractName="
				+ contractName + ", partnersNo=" + partnersNo + ", partnersName=" + partnersName + ", partnersNoRel="
				+ partnersNoRel + ", partnersNameRel=" + partnersNameRel + ", amount=" + amount + ", goalName="
				+ goalName + ", goalPayRatio=" + goalPayRatio + ", goalPayMoney=" + goalPayMoney + ", signDate="
				+ signDate + ", beginDate=" + beginDate + ", endDate=" + endDate + "}";
	}
}
