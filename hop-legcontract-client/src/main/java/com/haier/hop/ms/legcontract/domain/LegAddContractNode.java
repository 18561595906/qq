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
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-10-21
 */
@TableName("leg_add_contract_node")
public class LegAddContractNode extends Model<LegAddContractNode> {

	private static final long serialVersionUID = 1L;

	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 业务单元Code
	 */
	@TableField("BIZ_CODE")
	private String bizCode;
	/**
	 * 合同金额大于等于LOW_AMOUNT
	 */
	@TableField("LOW_AMOUNT")
	private BigDecimal lowAmount;
	/**
	 * 合同金额小于HIGH_AMOUNT
	 */
	@TableField("HIGH_AMOUNT")
	private BigDecimal highAmount;
	/**
	 * 节点ID
	 */
	@TableField("APPROVER_NODE")
	private String approverNode;
	/**
	 * 节点名称
	 */
	@TableField("APPROVER_NAME")
	private String approverName;
	/**
	 * 公议人，可以有多个, 逗号隔开
	 */
	@TableField("NODE_APPROVER")
	private String nodeApprover;
	/**
	 * 创建人工号
	 */
	@TableField("CREATED_BY")
	private String createdBy;
	/**
	 * 创建时间
	 */
	@TableField("CREATED_TIME")
	private Date createdTime;
	/**
	 * 更新人工号
	 */
	@TableField("UPDATE_BY")
	private String updateBy;
	/**
	 * 更新时间
	 */
	@TableField("UPDATE_TIME")
	private Date updateTime;
	/**
	 * 是否启用：1启用；0 关闭
	 */
	@TableField("ENABLED")
	private String enabled;
	/**
	 * 业务单元名称
	 */
	@TableField("BIZ_NAME")
	private String bizName;
	/**
	 * 合同类型
	 */
	@TableField("CONTRACT_CODE")
	private String contractCode;
	/**
	 * 合同类型名称
	 */
	@TableField("CONTRACT_CODE_NAME")
	private String contractCodeName;

	/**
	 * 签约方编码
	 */
	@TableField("CONTRACT_PARTY_CODE")
	private String contractPartyCode;

	/**
	 * 签约方名称
	 */
	@TableField("CONTRACT_PARTY_NAME")
	private String contractPartyName;
	
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

	public String getBizCode() {
		return bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public BigDecimal getLowAmount() {
		return lowAmount;
	}

	public void setLowAmount(BigDecimal lowAmount) {
		this.lowAmount = lowAmount;
	}

	public BigDecimal getHighAmount() {
		return highAmount;
	}

	public void setHighAmount(BigDecimal highAmount) {
		this.highAmount = highAmount;
	}

	public String getApproverNode() {
		return approverNode;
	}

	public void setApproverNode(String approverNode) {
		this.approverNode = approverNode;
	}

	public String getNodeApprover() {
		return nodeApprover;
	}

	public void setNodeApprover(String nodeApprover) {
		this.nodeApprover = nodeApprover;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getBizName() {
		return bizName;
	}

	public void setBizName(String bizName) {
		this.bizName = bizName;
	}

	public String getApproverName() {
		return approverName;
	}

	public void setApproverName(String approverName) {
		this.approverName = approverName;
	}

	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getContractCodeName() {
		return contractCodeName;
	}

	public void setContractCodeName(String contractCodeName) {
		this.contractCodeName = contractCodeName;
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
		return null;
	}

	@Override
	public String toString() {
		return "LegAddContractNode{" + "rowId=" + rowId + ", bizCode=" + bizCode + ", lowAmount=" + lowAmount
				+ ", highAmount=" + highAmount + ", approverNode=" + approverNode + ", nodeApprover=" + nodeApprover
				+ ", createdBy=" + createdBy + ", createdTime=" + createdTime + ", updateBy=" + updateBy
				+ ", updateTime=" + updateTime + ", enabled=" + enabled + ", bizName=" + bizName + ", approverName="
				+ approverName + ", contractCode=" + contractCode + ", sign=" + sign + ", contractCodeName=" + contractCodeName + "}";
	}
}
