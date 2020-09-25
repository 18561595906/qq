package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * 协助公议节点删除记录
 * @author ltd
 *
 */
@TableName("leg_assistnode_delete")
public class LegAssistNodeDelete extends Model<LegAssistNodeDelete> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 关联合同流程号
	 */
	@TableField("CONTRACT_PROID")
	private String contractProId;
	/**
	 * 删除的节点编码
	 */
	@TableField("NODE_ID")
	private String nodeId;
	/**
	 * 删除流程的流程号
	 */
	@TableField("PROC_ID")
	private String procId;
	/**
	 * 创建时间
	 */
	@TableField("CREATE_DATE")
	private Date createDate;
	/**
	 * 流程是否完成。1：已完成； 2：未完成
	 */
	@TableField("COMPLETED")
	private String completed;
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
	

	@Override
	public String toString() {
		return "LegAssistNodeDelete [rowId=" + rowId + ", contractProId=" + contractProId + ", nodeId=" + nodeId
				+ ", procId=" + procId + ", createDate=" + createDate + ", completed=" + completed + ", createBy="
				+ createBy + ", deleteFlag=" + deleteFlag + "]";
	}


	public String getRowId() {
		return rowId;
	}


	public void setRowId(String rowId) {
		this.rowId = rowId;
	}


	public String getContractProId() {
		return contractProId;
	}


	public void setContractProId(String contractProId) {
		this.contractProId = contractProId;
	}


	public String getNodeId() {
		return nodeId;
	}


	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}


	public String getProcId() {
		return procId;
	}


	public void setProcId(String procId) {
		this.procId = procId;
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


	public String getCompleted() {
		return completed;
	}


	public void setCompleted(String completed) {
		this.completed = completed;
	}


	@Override
	protected Serializable pkVal() {
		// TODO Auto-generated method stub
		return null;
	}

}
