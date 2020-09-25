package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * 合同信息备份表，每次提交合同都保存当前合同关键信息
 * @author ltd
 *
 */
@TableName("leg_contract_backup")
public class LegContractBackup extends Model<LegContractBackup>{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private String rowId;
	
	/**
	 * 流程Id
	 */
	@TableField("PROC_ID")
	private String procId;
	
	/**
	 * 合同流水号
	 */
	@TableField("CONT_NO")
	private String contNo;
	
	/**
	 * 插入时间
	 */
	@TableField("CREATE_TIME")
	private Date createTime;
	
	/**
	 * 里程碑
	 */
	@TableField("goal_List")
	private String goalList;
	
	/**
	 * 印章
	 */
	@TableField("seal_use_list")
	private String sealUseList;
	
	/**
	 * 风险预案
	 */
	@TableField("risk_plan")
	private String riskPlan;
	
	/**
	 * 保证金
	 */
	@TableField("DEPOSIT")
	private BigDecimal deposit;
	
	/**
	 * 合同编码
	 */
	@TableField("contract_code")
	private String contractCode;
	
	/**
	 * 合同类型  0非标 1标准 2按标准编辑
	 */
	@TableField("contract_type")
	private String contractType;
	
	/**
	 * 合同份数
	 */
	@TableField("contract_num")
	private String contractNum;
	
	/**
	 * 业务单元
	 */
	@TableField("biz_code")
	private String bizCode;
	
	/**
	 * 合同开始时间
	 */
	@TableField("BEGIN_DATE")
	private Date beginDate;
	
	/**
	 * 合同结束时间
	 */
	@TableField("END_DATE")
	private Date endDate;
	
	/**
	 * 合同有效期（月单位）
	 */
	@TableField("EFFECTIVE_DATE")
	private BigDecimal effectiveDate;
	
	/**
	 * 合同背景
	 */
	@TableField("backgroud")
	private String backgroud;
	
	/**
	 * 签约方
	 */
	@TableField("partner_list")
	private String partnerList;
	
	/**
	 * 收付款类型（1：海尔为收款方 2：海尔为付款方 3：甲方为收款方 4：甲方为付款方 5：无款项收付 ）
	 */
	@TableField("PAY_TYPE")
	private String payType;
	
	/**
	 * 合同金额
	 */
	@TableField("PAY_AMOUNT")
	private BigDecimal payAmount;
	
	/**
	 * 币种
	 */
	@TableField("PAY_CURRENCY")
	private String payCurrency;
	
	/**
	 * 金额人民币
	 */
	@TableField("PAY_CNY")
	private BigDecimal payCNY;
	
	/**
	 * 付款方式
	 */
	@TableField("pay_list")
	private String payList;
	
	/**
	 * 我方主张的权力
	 */
	@TableField("rights_list")
	private String rightsList;
	
	/**
	 * 我方需规避的风险
	 */
	@TableField("fx_list")
	private String fxList;
	
	/**
	 * 附件
	 */
	@TableField("att_list")
	private String attList;
	
	
	public String getRowId() {
		return rowId;
	}


	public void setRowId(String rowId) {
		this.rowId = rowId;
	}


	public String getProcId() {
		return procId;
	}


	public void setProcId(String procId) {
		this.procId = procId;
	}


	public String getContNo() {
		return contNo;
	}


	public void setContNo(String contNo) {
		this.contNo = contNo;
	}


	public Date getCreateTime() {
		return createTime;
	}


	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


	public String getGoalList() {
		return goalList;
	}


	public void setGoalList(String goalList) {
		this.goalList = goalList;
	}


	public String getSealUseList() {
		return sealUseList;
	}


	public void setSealUseList(String sealUseList) {
		this.sealUseList = sealUseList;
	}


	public String getRiskPlan() {
		return riskPlan;
	}


	public void setRiskPlan(String riskPlan) {
		this.riskPlan = riskPlan;
	}


	public BigDecimal getDeposit() {
		return deposit;
	}


	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}


	public String getContractCode() {
		return contractCode;
	}


	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}


	public String getContractType() {
		return contractType;
	}


	public void setContractType(String contractType) {
		this.contractType = contractType;
	}


	public String getContractNum() {
		return contractNum;
	}


	public void setContractNum(String contractNum) {
		this.contractNum = contractNum;
	}


	public String getBizCode() {
		return bizCode;
	}


	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
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


	public BigDecimal getEffectiveDate() {
		return effectiveDate;
	}


	public void setEffectiveDate(BigDecimal effectiveDate) {
		this.effectiveDate = effectiveDate;
	}


	public String getBackgroud() {
		return backgroud;
	}


	public void setBackgroud(String backgroud) {
		this.backgroud = backgroud;
	}


	public String getPartnerList() {
		return partnerList;
	}


	public void setPartnerList(String partnerList) {
		this.partnerList = partnerList;
	}


	public String getPayType() {
		return payType;
	}


	public void setPayType(String payType) {
		this.payType = payType;
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


	public BigDecimal getPayCNY() {
		return payCNY;
	}


	public void setPayCNY(BigDecimal payCNY) {
		this.payCNY = payCNY;
	}


	public String getPayList() {
		return payList;
	}


	public void setPayList(String payList) {
		this.payList = payList;
	}


	public String getRightsList() {
		return rightsList;
	}


	public void setRightsList(String rightsList) {
		this.rightsList = rightsList;
	}


	public String getFxList() {
		return fxList;
	}


	public void setFxList(String fxList) {
		this.fxList = fxList;
	}


	public String getAttList() {
		return attList;
	}


	public void setAttList(String attList) {
		this.attList = attList;
	}
	
	


	@Override
	public String toString() {
		return "LegContractBackup [rowId=" + rowId + ", procId=" + procId + ", contNo=" + contNo + ", createTime="
				+ createTime + ", goalList=" + goalList + ", sealUseList=" + sealUseList + ", riskPlan=" + riskPlan
				+ ", deposit=" + deposit + ", contractCode=" + contractCode + ", contractType=" + contractType
				+ ", contractNum=" + contractNum + ", bizCode=" + bizCode + ", beginDate=" + beginDate + ", endDate="
				+ endDate + ", effectiveDate=" + effectiveDate + ", backgroud=" + backgroud + ", partnerList="
				+ partnerList + ", payType=" + payType + ", payAmount=" + payAmount + ", payCurrency=" + payCurrency
				+ ", payCNY=" + payCNY + ", payList=" + payList + ", rightsList=" + rightsList + ", fxList=" + fxList
				+ ", attList=" + attList + "]";
	}


	@Override
	protected Serializable pkVal() {
		return null;
	}

}
