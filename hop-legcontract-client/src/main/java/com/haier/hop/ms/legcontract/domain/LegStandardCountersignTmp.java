package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * </p>
 *
 * @author xuxu
 * @since 2019-07-11
 */
@TableName("leg_standard_countersign_tmp")
public class LegStandardCountersignTmp extends Model<LegStandardCountersignTmp> {

	private static final long serialVersionUID = 1L;

	@TableId("ROW_ID")
	private String rowId;
	@TableField("PROC_ID")
	private String procId;
	@TableField("NODE_ID")
	private String nodeId;
	@TableField("NODE_NAME")
	private String nodeName;
	@TableField("NODE_DESC")
	private String nodeDesc;
	@TableField("ASSIGNEE_SN")
	private String assigneeSn;
	@TableField("ASSIGNEE_NAME")
	private String assigneeName;
	@TableField("RESULT")
	private String result;
	@TableField("CREATE_TIME")
	private Date createTime;
	@TableField("FLAG")
	private String flag;
	@TableField("TASK_KEY")
	private String taskKey;
	@TableField("TASK_ID")
	private String taskId;
	@TableField("NOT_REVIEW")
	private String notReview;
	/**
	 * 标准合同公议规则 1:是 0 否
	 */
	@TableField("IS_RULE")
	private String isRule;
	@TableField("UPDATE_TIME")
	private Date updateTime;

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

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getTaskKey() {
		return taskKey;
	}

	public void setTaskKey(String taskKey) {
		this.taskKey = taskKey;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getNotReview() {
		return notReview;
	}

	public void setNotReview(String notReview) {
		this.notReview = notReview;
	}

	public String getIsRule() {
		return isRule;
	}

	public void setIsRule(String isRule) {
		this.isRule = isRule;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	protected Serializable pkVal() {
		return this.rowId;
	}

	@Override
	public String toString() {
		return "LegStandardCountersignTmp{" + "rowId=" + rowId + ", procId=" + procId + ", nodeId=" + nodeId
				+ ", nodeName=" + nodeName + ", assigneeSn=" + assigneeSn + ", assigneeName=" + assigneeName
				+ ", result=" + result + ", createTime=" + createTime + ", flag=" + flag + ", taskKey=" + taskKey
				+ ", taskId=" + taskId + ", notReview=" + notReview + ", isRule=" + isRule + ", updateTime="
				+ updateTime + "}";
	}
}
