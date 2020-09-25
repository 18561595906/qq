package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * 合同协助并联公议节点
 * @author ltd
 *
 */
@TableName("leg_contract_assist_node")
public class LegContractAssistNode extends Model<LegContractAssistNode>{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 流程ID
	 */
	@TableField("PROC_ID")
	private String procId;
	/**
	 * 节点编码，对应leg_contract_node的rowId
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
	 * 公议人工号
	 */
	@TableField("ASSIGNEE_SN")
	private String assigneeSn;
	/**
	 * 公议人姓名
	 */
	@TableField("ASSIGNEE_NAME")
	private String assigneeName;
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
	 * 1:有效 0:无效
	 */
	@TableField("DELETE_FLAG")
	private String deleteFlag;
	
	
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
	public String getNodeDesc() {
		return nodeDesc;
	}
	public void setNodeDesc(String nodeDesc) {
		this.nodeDesc = nodeDesc;
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
	public String getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	
	public String getAssigneeSn() {
		return assigneeSn;
	}
	public void setAssigneeSn(String assigneeSn) {
		this.assigneeSn = assigneeSn;
	}
	
	public String getAssigneeName() {
		return assigneeName;
	}
	public void setAssigneeName(String assigneeName) {
		this.assigneeName = assigneeName;
	}
	@Override
	public String toString() {
		return "LegContractAssistNode [rowId=" + rowId + ", procId=" + procId + ", nodeId=" + nodeId + ", nodeName="
				+ nodeName + ", nodeDesc=" + nodeDesc + ", assigneeSn=" + assigneeSn + ", assigneeName=" + assigneeName
				+ ", createDate=" + createDate + ", createBy=" + createBy + ", deleteFlag=" + deleteFlag + "]";
	}
	
	@Override
	protected Serializable pkVal() {
		// TODO Auto-generated method stub
		return this.rowId;
	}
	
}
