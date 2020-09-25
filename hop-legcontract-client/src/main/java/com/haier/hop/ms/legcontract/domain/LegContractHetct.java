package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 对接地产-成本系统合同数据
 * </p>
 *
 * @author shiyingxin
 * @since 2020-04-15
 */
@TableName("leg_contract_hetct")
public class LegContractHetct extends Model<LegContractHetct> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableField("hetct_id")
	private String hetctId;
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
	 * 申请人邮箱
	 */
	@TableField("contract_email")
	private String contractEmail;
	/**
	 * 申请人电话
	 */
	@TableField("contract_phone")
	private String contractPhone;
	/**
	 * 开始时间
	 */
	@TableField("begin_date")
	private Date beginDate;
	/**
	 * 合同编码
	 */
	@TableField("contract_no")
	private String contractNo;
	/**
	 * 合同名称
	 */
	@TableField("contract_name")
	private String contractName;
	/**
	 * 合同份数
	 */
	@TableField("contract_num")
	private BigDecimal contractNum;
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
	 * 合同类型
	 */
	@TableField("contract_type")
	private String contractType;
	/**
	 * 合同保证金
	 */
	private BigDecimal deposit;
	/**
	 * 结束时间
	 */
	@TableField("end_date")
	private Date endDate;
	/**
	 * 合同付款金额
	 */
	@TableField("contract_amount")
	private BigDecimal contractAmount;
	/**
	 * 合同付款人民币金额
	 */
	@TableField("pay_cny")
	private BigDecimal payCny;
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
	
	//内网地址
	@TableField("pdfurl")
	private String pdfurl;
	//外网地址
	@TableField("wpdfurl")
	private String wpdfurl;
	//线上线下标志
	@TableField("signetType")
	private String signetType;
	

	public String getHetctId() {
		return hetctId;
	}

	public void setHetctId(String hetctId) {
		this.hetctId = hetctId;
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

	public BigDecimal getContractNum() {
		return contractNum;
	}

	public void setContractNum(BigDecimal contractNum) {
		this.contractNum = contractNum;
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

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public BigDecimal getDeposit() {
		return deposit;
	}

	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public BigDecimal getContractAmount() {
		return contractAmount;
	}

	public void setContractAmount(BigDecimal contractAmount) {
		this.contractAmount = contractAmount;
	}

	public BigDecimal getPayCny() {
		return payCny;
	}

	public void setPayCny(BigDecimal payCny) {
		this.payCny = payCny;
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

	/**
	 * @return the pdfurl
	 */
	public String getPdfurl() {
		return pdfurl;
	}

	/**
	 * @param pdfurl the pdfurl to set
	 */
	public void setPdfurl(String pdfurl) {
		this.pdfurl = pdfurl;
	}

	/**
	 * @return the wpdfurl
	 */
	public String getWpdfurl() {
		return wpdfurl;
	}

	/**
	 * @param wpdfurl the wpdfurl to set
	 */
	public void setWpdfurl(String wpdfurl) {
		this.wpdfurl = wpdfurl;
	}

	/**
	 * @return the signetType
	 */
	public String getSignetType() {
		return signetType;
	}

	/**
	 * @param signetType the signetType to set
	 */
	public void setSignetType(String signetType) {
		this.signetType = signetType;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegContractHetct{" + "hetctId=" + hetctId + ", applierId=" + applierId + ", applierName=" + applierName
				+ ", contractEmail=" + contractEmail + ", contractPhone=" + contractPhone + ", beginDate=" + beginDate
				+ ", contractNo=" + contractNo + ", contractName=" + contractName + ", contractNum=" + contractNum
				+ ", firstParty=" + firstParty + ", customerName=" + customerName + ", contractType=" + contractType
				+ ", deposit=" + deposit + ", endDate=" + endDate + ", contractAmount=" + contractAmount + ", payCny="
				+ payCny + ", sourceName=" + sourceName + ", contractStatus=" + contractStatus + ", remark=" + remark
				+ ", reserved1=" + reserved1 + ", reserved2=" + reserved2 + ", reserved3=" + reserved3 + ", reserved4="
				+ reserved4 + ", createDate=" + createDate + ", updateDate=" + updateDate
				+ ", pdfurl=" + pdfurl + ", wpdfurl=" + wpdfurl + ", signetType=" + signetType
				+ "}";
	}
}
