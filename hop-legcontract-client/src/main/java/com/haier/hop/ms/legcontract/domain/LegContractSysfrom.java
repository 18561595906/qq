package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-19
 */
@TableName("leg_contract_sysfrom")
public class LegContractSysfrom extends Model<LegContractSysfrom> {

	private static final long serialVersionUID = 1L;

	@TableField("ROW_ID")
	private String rowId;
	@TableField("BIZ_CODE")
	private String bizCode;
	@TableField("BIZ_NAME")
	private String bizName;
	@TableField("CONTRACT_CODE")
	private String contractCode;
	@TableField("CONTRACT_NAME")
	private String contractName;
	@TableField("CREATE_TIME")
	private Date createTime;
	@TableField("CREATE_BY")
	private String createBy;
	@TableField("PARTNER_NO")
	private String partnerNo;
	@TableField("PARTNER_NAME")
	private String partnerName;
	@TableField("SYS_FROM")
	private String sysFrom;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getBizCode() {
		return bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizName() {
		return bizName;
	}

	public void setBizName(String bizName) {
		this.bizName = bizName;
	}

	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getPartnerNo() {
		return partnerNo;
	}

	public void setPartnerNo(String partnerNo) {
		this.partnerNo = partnerNo;
	}

	public String getPartnerName() {
		return partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public String getSysFrom() {
		return sysFrom;
	}

	public void setSysFrom(String sysFrom) {
		this.sysFrom = sysFrom;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegContractSysfrom{" + "rowId=" + rowId + ", bizCode=" + bizCode + ", bizName=" + bizName
				+ ", contractCode=" + contractCode + ", contractName=" + contractName + ", createTime=" + createTime
				+ ", createBy=" + createBy + ", partnerNo=" + partnerNo + ", partnerName=" + partnerName + ", sysFrom="
				+ sysFrom + "}";
	}
}
