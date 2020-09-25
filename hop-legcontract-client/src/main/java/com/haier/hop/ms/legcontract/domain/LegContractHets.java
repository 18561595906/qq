package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 对接地产-销售系统合同数据
 * </p>
 *
 * @author shiyingxin
 * @since 2020-04-14
 */
@TableName("leg_contract_hets")
public class LegContractHets extends Model<LegContractHets> {

	private static final long serialVersionUID = 1L;

	@TableField("hets_id")
	private String hetsId;
	/**
	 * 申请人工号
	 */
	@TableField("applier_id")
	private String applierId;
	/**
	 * 申请人姓名
	 */
	@TableField("applier_name")
	private String applierName;
	/**
	 * 开始时间
	 */
	@TableField("begin_date")
	private Date beginDate;
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
	 * 甲方签约单位
	 */
	@TableField("first_party")
	private String firstParty;
	/**
	 * 乙方签约单位
	 */
	@TableField("customer_name")
	private String customerName;
	/**
	 * 合同付款金额
	 */
	@TableField("contract_amount")
	private BigDecimal contractAmount;
	/**
	 * 来源系统
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
	private String reserved1;
	private String reserved2;
	private String reserved3;
	private String reserved4;
	@TableField("create_date")
	private Date createDate;
	@TableField("update_date")
	private Date updateDate;
	/**
	 * 内网地址
	 */
	private String address;
	/**
	 * 外网地址
	 */
	private String outerAddress;
	/**
	 * 如何用印
	 */
	private String seal;
	/**
	 * 项目名称
	 */
	@TableField("parent_project_name")
	private String parentProjectName;
	/**
	 * 类别
	 */
	@TableField("sales_type")
	private String salesType;

	// 创建时间开始
	@TableField(exist = false)
	private Date createDateFrom;

	// 创建时间结束
	@TableField(exist = false)
	private Date createDateTo;

	public String getHetsId() {
		return hetsId;
	}

	public void setHetsId(String hetsId) {
		this.hetsId = hetsId;
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

	public String getFirstParty() {
		return firstParty;
	}

	public void setFirstParty(String firstParty) {
		this.firstParty = firstParty;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public BigDecimal getContractAmount() {
		return contractAmount;
	}

	public void setContractAmount(BigDecimal contractAmount) {
		this.contractAmount = contractAmount;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOuterAddress() {
		return outerAddress;
	}

	public void setOuterAddress(String outerAddress) {
		this.outerAddress = outerAddress;
	}

	public String getSeal() {
		return seal;
	}

	public void setSeal(String seal) {
		this.seal = seal;
	}

	public String getParentProjectName() {
		return parentProjectName;
	}

	public void setParentProjectName(String parentProjectName) {
		this.parentProjectName = parentProjectName;
	}

	public String getSalesType() {
		return salesType;
	}

	public void setSalesType(String salesType) {
		this.salesType = salesType;
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
		return "LegContractHets{" + "hetsId=" + hetsId + ", applierId=" + applierId + ", applierName=" + applierName
				+ ", beginDate=" + beginDate + ", contractNo=" + contractNo + ", contractName=" + contractName
				+ ", firstParty=" + firstParty + ", customerName=" + customerName + ", contractAmount=" + contractAmount
				+ ", sourceName=" + sourceName + ", contractStatus=" + contractStatus + ", remark=" + remark
				+ ", reserved1=" + reserved1 + ", reserved2=" + reserved2 + ", reserved3=" + reserved3 + ", reserved4="
				+ reserved4 + ", createDate=" + createDate + ", updateDate=" + updateDate + ", address=" + address
				+ ", outerAddress=" + outerAddress + ", seal=" + seal + ", parentProjectName=" + parentProjectName
				+ ", salesType=" + salesType + "}";
	}
}
