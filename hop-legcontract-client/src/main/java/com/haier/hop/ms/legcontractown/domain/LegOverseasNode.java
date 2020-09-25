package com.haier.hop.ms.legcontractown.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.haier.hop.ms.legcontractown.dto.LegEmployeeDto;

/**
 * <p>
 * </p>
 *
 * @author xuejinxin
 * @since 2020-05-24
 */
@TableName("leg_overseas_node")
public class LegOverseasNode extends Model<LegOverseasNode> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableField("ROW_ID")
	private String rowId;
	/**
	 * 节点id
	 */
	@TableField("NODE_ID")
	private String nodeId;
	/**
	 * 节点名称
	 */
	@TableField("NODE_NAME")
	private String nodeName;
	/**
	 * 节点描述
	 */
	@TableField("NODE_DESC")
	private String nodeDesc;
	/**
	 * 区分
	 */
	@TableField("KBN")
	private BigDecimal kbn;
	/**
	 * 区分
	 */
	@TableField("ORDER_BY")
	private Integer orderBy;

	/**
	 * 人员信息
	 */
	@TableField(exist = false)
	private List<LegEmployeeDto> employeeDtos;
	/**
	 * 是否有当前审批节点
	 */
	@TableField(exist = false)
	private Boolean flg = false;
	/**
	 * 审批结果
	 */
	@TableField(exist = false)
	private String reviewResult;
	/**
	 * 审批时间
	 */
	@TableField(exist = false)
	private String reviewDate;
	/**
	 * 审批人
	 */
	@TableField(exist = false)
	private String reviewUserId;
	/**
	 * 审批人
	 */
	@TableField(exist = false)
	private String reviewUser;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public List<LegEmployeeDto> getEmployeeDtos() {
		return employeeDtos;
	}

	public String getReviewUserId() {
		return reviewUserId;
	}

	public void setReviewUserId(String reviewUserId) {
		this.reviewUserId = reviewUserId;
	}

	public void setEmployeeDtos(List<LegEmployeeDto> employeeDtos) {
		this.employeeDtos = employeeDtos;
	}

	public String getNodeId() {
		return nodeId;
	}

	public Boolean getFlg() {
		return flg;
	}

	public void setFlg(Boolean flg) {
		this.flg = flg;
	}

	public String getReviewResult() {
		return reviewResult;
	}

	public void setReviewResult(String reviewResult) {
		this.reviewResult = reviewResult;
	}

	public String getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}

	public String getReviewUser() {
		return reviewUser;
	}

	public void setReviewUser(String reviewUser) {
		this.reviewUser = reviewUser;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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

	public Integer getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(Integer orderBy) {
		this.orderBy = orderBy;
	}

	public String getNodeDesc() {
		return nodeDesc;
	}

	public void setNodeDesc(String nodeDesc) {
		this.nodeDesc = nodeDesc;
	}

	public BigDecimal getKbn() {
		return kbn;
	}

	public void setKbn(BigDecimal kbn) {
		this.kbn = kbn;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegOverseasNode{" + "rowId=" + rowId + ", nodeId=" + nodeId + ", nodeName=" + nodeName + ", nodeDesc="
				+ nodeDesc + ", kbn=" + kbn + "}";
	}
}
