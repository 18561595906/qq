package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 金融保理系统对接合同数据
 * </p>
 *
 * @author shiyingxin
 * @since 2020-03-27
 */
@TableName("leg_contract_gxht")
public class LegContractGxht extends Model<LegContractGxht> {

	private static final long serialVersionUID = 1L;

	/**
	 * 转让人名称
	 */
	@TableField("applier_name")
	private String applierName;
	/**
	 * 主合同签署日
	 */
	@TableField("begin_date")
	private String beginDate;
	/**
	 * 项目编号
	 */
	@TableField("biz_code")
	private String bizCode;
	/**
	 * 合同编号
	 */
	@TableField("contract_no")
	private String contractNo;
	/**
	 * 合同份数（4）
	 */
	@TableField("contract_num")
	private String contractNum;
	/**
	 * 甲方签约单位
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
	 * 主合同签署日
	 */
	@TableField("create_time")
	private Date createTime;
	/**
	 * 主合同有效期
	 */
	@TableField("effective_date")
	private Date effectiveDate;
	/**
	 * 合同付款金额
	 */
	@TableField("pay_amount")
	private String payAmount;
	/**
	 * 同步时间
	 */
	@TableField("sync_time")
	private Date syncTime;

	/**
	 * 合同文件名称
	 */
	@TableField("file_name")
	private String fileName;

	/**
	 * 合同文本路径
	 */
	@TableField("path")
	private String path;

	@TableField(exist = false)
	private String beginDateFrom;

	@TableField(exist = false)
	private String beginDateTo;

	public String getApplierName() {
		return applierName;
	}

	public void setApplierName(String applierName) {
		this.applierName = applierName;
	}

	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getBizCode() {
		return bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getContractNum() {
		return contractNum;
	}

	public void setContractNum(String contractNum) {
		this.contractNum = contractNum;
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

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public Date getSyncTime() {
		return syncTime;
	}

	public void setSyncTime(Date syncTime) {
		this.syncTime = syncTime;
	}

	public String getBeginDateFrom() {
		return beginDateFrom;
	}

	public void setBeginDateFrom(String beginDateFrom) {
		this.beginDateFrom = beginDateFrom;
	}

	public String getBeginDateTo() {
		return beginDateTo;
	}

	public void setBeginDateTo(String beginDateTo) {
		this.beginDateTo = beginDateTo;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegContractGxht{" + "applierName=" + applierName + ", beginDate=" + beginDate + ", bizCode=" + bizCode
				+ ", contractNo=" + contractNo + ", contractNum=" + contractNum + ", contractPartner1="
				+ contractPartner1 + ", contractPartner2=" + contractPartner2 + ", contractType=" + contractType
				+ ", createTime=" + createTime + ", effectiveDate=" + effectiveDate + ", payAmount=" + payAmount
				+ ", syncTime=" + syncTime + ", fileName=" + fileName + ", path=" + path + "}";
	}
}
