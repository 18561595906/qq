package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2020-02-22
 */
@TableName("leg_gpms_contract_info")
public class LegGpmsContractInfo extends Model<LegGpmsContractInfo> {

	private static final long serialVersionUID = 1L;

	@TableId("row_id")
	private String rowId;
	/**
	 * 申请人ID
	 */
	@TableField("appliy_id")
	private String appliyId;
	/**
	 * 合同编号
	 */
	@TableField("contract_id")
	private String contractId;
	@TableField("contract_name")
	private String contractName;
	@TableField("contract_type1_sn")
	private String contractType1Sn;
	@TableField("contract_type2_sn")
	private String contractType2Sn;
	@TableField("contract_code")
	private String contractCode;
	private String url;
	@TableField("proc_id")
	private String procId;
	@TableField("product_code")
	private String productCode;
	@TableField("channel_code")
	private String channelCode;
	@TableField("brand_code")
	private String brandCode;
	@TableField("contract_gpms_type")
	private String contractGpmsType;
	@TableField("contract_channel")
	private String contractChannel;
	@TableField("begin_date")
	private String beginDate;
	@TableField("end_date")
	private String endDate;
	@TableField("create_date")
	private Date createDate;
	@TableField("create_user")
	private String createUser;
	@TableField("update_date")
	private Date updateDate;
	@TableField("update_user")
	private String updateUser;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getAppliyId() {
		return appliyId;
	}

	public void setAppliyId(String appliyId) {
		this.appliyId = appliyId;
	}

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getContractType1Sn() {
		return contractType1Sn;
	}

	public void setContractType1Sn(String contractType1Sn) {
		this.contractType1Sn = contractType1Sn;
	}

	public String getContractType2Sn() {
		return contractType2Sn;
	}

	public void setContractType2Sn(String contractType2Sn) {
		this.contractType2Sn = contractType2Sn;
	}

	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getProcId() {
		return procId;
	}

	public void setProcId(String procId) {
		this.procId = procId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getBrandCode() {
		return brandCode;
	}

	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public String getContractGpmsType() {
		return contractGpmsType;
	}

	public void setContractGpmsType(String contractGpmsType) {
		this.contractGpmsType = contractGpmsType;
	}

	public String getContractChannel() {
		return contractChannel;
	}

	public void setContractChannel(String contractChannel) {
		this.contractChannel = contractChannel;
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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	@Override
	protected Serializable pkVal() {
		return this.rowId;
	}

	@Override
	public String toString() {
		return "LegGpmsContractInfo{" + "rowId=" + rowId + ", appliyId=" + appliyId + ", contractId=" + contractId
				+ ", contractName=" + contractName + ", contractType1Sn=" + contractType1Sn + ", contractType2Sn="
				+ contractType2Sn + ", contractCode=" + contractCode + ", url=" + url + ", procId=" + procId
				+ ", productCode=" + productCode + ", channelCode=" + channelCode + ", brandCode=" + brandCode
				+ ", contractGpmsType=" + contractGpmsType + ", contractChannel=" + contractChannel + ", beginDate="
				+ beginDate + ", endDate=" + endDate + "}";
	}
}
