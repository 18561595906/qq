package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 海贸云商合同信息
 * </p>
 *
 * @author shiyingxin
 * @since 2020-03-06
 */
@TableName("leg_tspcontract")
public class LegTspcontract extends Model<LegTspcontract> {

	private static final long serialVersionUID = 1L;

	@TableId("row_id")
	private String rowId;
	/**
	 * 流程id
	 */
	@TableField("proc_id")
	private String procId;
	/**
	 * 云超市合同流水号
	 */
	@TableField("cont_no")
	private String contNo;
	/**
	 * 云超市合同编号
	 */
	@TableField("contract_no")
	private String contractNo;
	/**
	 * 创建人姓名
	 */
	@TableField("created_name")
	private String createdName;
	/**
	 * 创建人工号
	 */
	@TableField("created_sn")
	private String createdSn;
	/**
	 * TSP合同名称
	 */
	@TableField("tsp_contract_name")
	private String tspContractName;
	/**
	 * 客户中文名称
	 */
	private String customer;
	/**
	 * TSP协议编号
	 */
	private String agreementno;
	/**
	 * 生效日期
	 */
	private String signingdate;
	/**
	 * 截止日期
	 */
	private String closingdate;
	/**
	 * 收费方式0:实报实销，1:按照标准收费
	 */
	private String receivefeemodel;
	/**
	 * 投保人
	 */
	private String policyholder;
	/**
	 * 被投保人
	 */
	private String insuredperson;
	/**
	 * 代理费结算模式 model1：按报关总价百分比 model2：按退税总额百分比 model3：每1美金收取人民币
	 */
	private String agentfeemodel;
	/**
	 * 代理费率
	 */
	private BigDecimal agencyfee;
	/**
	 * 最低收费CNY
	 */
	private BigDecimal minimumcharge;
	/**
	 * 备注
	 */
	private String memo;
	/**
	 * 系统单号
	 */
	private String docno;
	/**
	 * 协议创建时间
	 */
	private String datecreated;
	/**
	 * 印章管理员姓名
	 */
	@TableField("admin_name")
	private String adminName;
	/**
	 * 印章管理员工号
	 */
	@TableField("admin_sn")
	private String adminSn;
	/**
	 * 印章名称
	 */
	@TableField("seal_name")
	private String sealName;
	/**
	 * 印章归属公司
	 */
	@TableField("seal_comp")
	private String sealComp;
	/**
	 * 印章归属公司编码
	 */
	@TableField("seal_compno")
	private String sealCompno;
	/**
	 * 数据状态1有效0无效
	 */
	@TableField("active_flag")
	private String activeFlag;
	/**
	 * 数据生成时间
	 */
	@TableField("created_time")
	private Date createdTime;
	/**
	 * 合同状态 1:TSP合同成功触发到leg 2:leg印章管理员用印确认 3:TSP合同归档文本传到leg 4;归档复核完毕
	 */
	@TableField("contract_status")
	private String contractStatus;
	/**
	 * 用印确认时间
	 */
	@TableField("sealconfirm_time")
	private Date sealconfirmTime;
	/**
	 * 合同归档时间
	 */
	@TableField("conarchive_time")
	private Date conarchiveTime;
	/**
	 * 归档复核/流程结束时间
	 */
	@TableField("archivecheck_time")
	private Date archivecheckTime;

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

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getCreatedName() {
		return createdName;
	}

	public void setCreatedName(String createdName) {
		this.createdName = createdName;
	}

	public String getCreatedSn() {
		return createdSn;
	}

	public void setCreatedSn(String createdSn) {
		this.createdSn = createdSn;
	}

	public String getTspContractName() {
		return tspContractName;
	}

	public void setTspContractName(String tspContractName) {
		this.tspContractName = tspContractName;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getAgreementno() {
		return agreementno;
	}

	public void setAgreementno(String agreementno) {
		this.agreementno = agreementno;
	}

	public String getSigningdate() {
		return signingdate;
	}

	public void setSigningdate(String signingdate) {
		this.signingdate = signingdate;
	}

	public String getClosingdate() {
		return closingdate;
	}

	public void setClosingdate(String closingdate) {
		this.closingdate = closingdate;
	}

	public String getReceivefeemodel() {
		return receivefeemodel;
	}

	public void setReceivefeemodel(String receivefeemodel) {
		this.receivefeemodel = receivefeemodel;
	}

	public String getPolicyholder() {
		return policyholder;
	}

	public void setPolicyholder(String policyholder) {
		this.policyholder = policyholder;
	}

	public String getInsuredperson() {
		return insuredperson;
	}

	public void setInsuredperson(String insuredperson) {
		this.insuredperson = insuredperson;
	}

	public String getAgentfeemodel() {
		return agentfeemodel;
	}

	public void setAgentfeemodel(String agentfeemodel) {
		this.agentfeemodel = agentfeemodel;
	}

	public BigDecimal getAgencyfee() {
		return agencyfee;
	}

	public void setAgencyfee(BigDecimal agencyfee) {
		this.agencyfee = agencyfee;
	}

	public BigDecimal getMinimumcharge() {
		return minimumcharge;
	}

	public void setMinimumcharge(BigDecimal minimumcharge) {
		this.minimumcharge = minimumcharge;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getDocno() {
		return docno;
	}

	public void setDocno(String docno) {
		this.docno = docno;
	}

	public String getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(String datecreated) {
		this.datecreated = datecreated;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminSn() {
		return adminSn;
	}

	public void setAdminSn(String adminSn) {
		this.adminSn = adminSn;
	}

	public String getSealName() {
		return sealName;
	}

	public void setSealName(String sealName) {
		this.sealName = sealName;
	}

	public String getSealComp() {
		return sealComp;
	}

	public void setSealComp(String sealComp) {
		this.sealComp = sealComp;
	}

	public String getSealCompno() {
		return sealCompno;
	}

	public void setSealCompno(String sealCompno) {
		this.sealCompno = sealCompno;
	}

	public String getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getContractStatus() {
		return contractStatus;
	}

	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public Date getSealconfirmTime() {
		return sealconfirmTime;
	}

	public void setSealconfirmTime(Date sealconfirmTime) {
		this.sealconfirmTime = sealconfirmTime;
	}

	public Date getConarchiveTime() {
		return conarchiveTime;
	}

	public void setConarchiveTime(Date conarchiveTime) {
		this.conarchiveTime = conarchiveTime;
	}

	public Date getArchivecheckTime() {
		return archivecheckTime;
	}

	public void setArchivecheckTime(Date archivecheckTime) {
		this.archivecheckTime = archivecheckTime;
	}

	@Override
	protected Serializable pkVal() {
		return this.rowId;
	}

	@Override
	public String toString() {
		return "LegTspcontract{" + "rowId=" + rowId + ", procId=" + procId + ", contNo=" + contNo + ", contractNo="
				+ contractNo + ", createdName=" + createdName + ", createdSn=" + createdSn + ", tspContractName="
				+ tspContractName + ", customer=" + customer + ", agreementno=" + agreementno + ", signingdate="
				+ signingdate + ", closingdate=" + closingdate + ", receivefeemodel=" + receivefeemodel
				+ ", policyholder=" + policyholder + ", insuredperson=" + insuredperson + ", agentfeemodel="
				+ agentfeemodel + ", agencyfee=" + agencyfee + ", minimumcharge=" + minimumcharge + ", memo=" + memo
				+ ", docno=" + docno + ", datecreated=" + datecreated + ", adminName=" + adminName + ", adminSn="
				+ adminSn + ", sealName=" + sealName + ", sealComp=" + sealComp + ", sealCompno=" + sealCompno
				+ ", activeFlag=" + activeFlag + ", createdTime=" + createdTime + ", contractStatus=" + contractStatus
				+ ", sealconfirmTime=" + sealconfirmTime + ", conarchiveTime=" + conarchiveTime + ", archivecheckTime="
				+ archivecheckTime + "}";
	}
}
