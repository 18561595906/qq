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
 * 合同公议节点确认
 * </p>
 *
 * @author shiyingxin
 * @since 2019-07-24
 */
@TableName("leg_contract_app_node")
public class LegContractAppNode extends Model<LegContractAppNode> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 业务单元层级
	 */
	@TableField("BUSINESS_UNIT_RATE")
	private String businessUnitRate;
	/**
	 * 业务单元编码
	 */
	@TableField("BUSINESS_UNIT_CODE")
	private String businessUnitCode;
	/**
	 * 业务单元名称
	 */
	@TableField("BUSINESS_UNIT_NAME")
	private String businessUnitName;
	/**
	 * 一级合同类别编码
	 */
	@TableField("CONTRACT_TYPE1_SN")
	private String contractType1Sn;
	/**
	 * 一级合同类别
	 */
	@TableField("CONTRACT_TYPE1")
	private String contractType1;
	/**
	 * 二级合同类别编码
	 */
	@TableField("CONTRACT_TYPE2_SN")
	private String contractType2Sn;
	/**
	 * 二级合同类别
	 */
	@TableField("CONTRACT_TYPE2")
	private String contractType2;
	/**
	 * 合同编码
	 */
	@TableField("CONTRACT_CODE")
	private String contractCode;
	/**
	 * 合同名称
	 */
	@TableField("CONTRACT_NAME")
	private String contractName;
	/**
	 * 节点编码
	 */
	@TableField("NODE_ID")
	private String nodeId;
	/**
	 * 节点名称
	 */
	@TableField("NODE_NAME")
	private String nodeName;
	/**
	 * 创建时间
	 */
	@TableField("CREATE_DATE")
	private Date createDate;
	/**
	 * 创建人
	 */
	@TableField("CREATE_BY")
	private String createBy;
	/**
	 * 最后修改时间
	 */
	@TableField("UPDATE_DATE")
	private Date updateDate;
	/**
	 * 最后修改人
	 */
	@TableField("UPDATE_BY")
	private String updateBy;
	/**
	 * 签约方
	 */
	@TableField("PARTNER_NO")
	private String partnerNo;
	/**
	 * 金额（大于）
	 */
	@TableField("MIN_AMOUNT")
	private BigDecimal minAmount;
	/**
	 * 金额（小于）
	 */
	@TableField("MAX_AMOUNT")
	private BigDecimal maxAmount;
	/**
	 * 固定公议人
	 */
	@TableField("EMP_SN")
	private String empSn;
	
	/**
	 * 标志（内部合同并联公议节点展示 inContract）
	 */
	@TableField("SIGN")
	private String sign;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getBusinessUnitRate() {
		return businessUnitRate;
	}

	public void setBusinessUnitRate(String businessUnitRate) {
		this.businessUnitRate = businessUnitRate;
	}

	public String getBusinessUnitCode() {
		return businessUnitCode;
	}

	public void setBusinessUnitCode(String businessUnitCode) {
		this.businessUnitCode = businessUnitCode;
	}

	public String getBusinessUnitName() {
		return businessUnitName;
	}

	public void setBusinessUnitName(String businessUnitName) {
		this.businessUnitName = businessUnitName;
	}

	public String getContractType1Sn() {
		return contractType1Sn;
	}

	public void setContractType1Sn(String contractType1Sn) {
		this.contractType1Sn = contractType1Sn;
	}

	public String getContractType1() {
		return contractType1;
	}

	public void setContractType1(String contractType1) {
		this.contractType1 = contractType1;
	}

	public String getContractType2Sn() {
		return contractType2Sn;
	}

	public void setContractType2Sn(String contractType2Sn) {
		this.contractType2Sn = contractType2Sn;
	}

	public String getContractType2() {
		return contractType2;
	}

	public void setContractType2(String contractType2) {
		this.contractType2 = contractType2;
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

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public String getPartnerNo() {
		return partnerNo;
	}

	public void setPartnerNo(String partnerNo) {
		this.partnerNo = partnerNo;
	}

	public BigDecimal getMinAmount() {
		return minAmount;
	}

	public void setMinAmount(BigDecimal minAmount) {
		this.minAmount = minAmount;
	}

	public BigDecimal getMaxAmount() {
		return maxAmount;
	}

	public void setMaxAmount(BigDecimal maxAmount) {
		this.maxAmount = maxAmount;
	}

	public String getEmpSn() {
		return empSn;
	}

	public void setEmpSn(String empSn) {
		this.empSn = empSn;
	}

	/**
	 * @return the sign
	 */
	public String getSign() {
		return sign;
	}

	/**
	 * @param sign the sign to set
	 */
	public void setSign(String sign) {
		this.sign = sign;
	}

	@Override
	protected Serializable pkVal() {
		return this.rowId;
	}

	@Override
	public String toString() {
		return "LegContractAppNode{" + "rowId=" + rowId + ", businessUnitRate=" + businessUnitRate
				+ ", businessUnitCode=" + businessUnitCode + ", businessUnitName=" + businessUnitName
				+ ", contractCode=" + contractCode + ", contractName=" + contractName + ", nodeId=" + nodeId
				+ ", nodeName=" + nodeName + ", createDate=" + createDate + ", createBy=" + createBy + ", updateDate="
				+ updateDate + ", updateBy=" + updateBy + ", partnerNo=" + partnerNo + ", minAmount=" + minAmount
				+ ", maxAmount=" + maxAmount +", sign=" + sign + ", empSn=" + empSn + "}";
	}
}
