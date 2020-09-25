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
 * 商业政策合同信息表
 * </p>
 *
 * @author xuxu
 * @since 2019-06-18
 */
@TableName("leg_contract_gpms_tmp")
public class LegContractGpmsTmp extends Model<LegContractGpmsTmp> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 申请人姓名
	 */
	@TableField("APPLIER_NAME")
	private String applierName;
	/**
	 * 创建时间
	 */
	@TableField("CREATE_TIME")
	private Date createTime;
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
	 * 合同状态1：公议中，2：驳回 ，3：公议通过
	 */
	@TableField("CONT_STATUS")
	private String contStatus;
	/**
	 * 合同编码（生成规则公议时间+流水号）
	 */
	@TableField("CONTRACT_NO")
	private String contractNo;
	/**
	 * 合同表单查看链接地址
	 */
	@TableField("URL")
	private String url;
	/**
	 * 合同ID
	 */
	@TableField("CONTRACT_ID")
	private String contractId;
	/**
	 * 申请人ID
	 */
	@TableField("APPLIER_ID")
	private String applierId;
	/**
	 * 合同类型
	 */
	@TableField("CONTRACT_CODE")
	private String contractCode;
	/**
	 * 合同保存路径
	 */
	@TableField("CONT_URL")
	private String contUrl;
	/**
	 * 合同名称
	 */
	@TableField("CONTRACT_NAME")
	private String contractName;
	/**
	 * gpms合同类型
	 */
	@TableField("CONTRACT_GPMS_TYPE")
	private String contractGpmsType;
	/**
	 * 合同渠道
	 */
	@TableField("CONTRACT_CHANNEL")
	private String contractChannel;
	/**
	 * 政策年度：开始时间
	 */
	@TableField("BEGIN_DATE")
	private Date beginDate;
	/**
	 * 政策年度：结束时间
	 */
	@TableField("END_DATE")
	private Date endDate;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getApplierName() {
		return applierName;
	}

	public void setApplierName(String applierName) {
		this.applierName = applierName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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

	public String getContStatus() {
		return contStatus;
	}

	public void setContStatus(String contStatus) {
		this.contStatus = contStatus;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

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

	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getContUrl() {
		return contUrl;
	}

	public void setContUrl(String contUrl) {
		this.contUrl = contUrl;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
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

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegContractGpmsTmp{" + "rowId=" + rowId + ", applierName=" + applierName + ", createTime=" + createTime
				+ ", procId=" + procId + ", contNo=" + contNo + ", contStatus=" + contStatus + ", contractNo="
				+ contractNo + ", url=" + url + ", contractId=" + contractId + ", applierId=" + applierId
				+ ", contractCode=" + contractCode + ", contUrl=" + contUrl + ", contractName=" + contractName
				+ ", contractGpmsType=" + contractGpmsType + ", contractChannel=" + contractChannel + ", beginDate="
				+ beginDate + ", endDate=" + endDate + "}";
	}
}
