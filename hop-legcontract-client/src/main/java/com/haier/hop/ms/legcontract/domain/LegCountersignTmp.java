package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 在线编辑临时会签表
 * </p>
 *
 * @author xuejinxin
 * @since 2019-07-02
 */
@TableName("leg_countersign_tmp")
public class LegCountersignTmp extends Model<LegCountersignTmp> {

	private static final long serialVersionUID = 1L;

	/**
	 * 编码
	 */
	@TableField("ROW_ID")
	private String rowId;
	/**
	 * 流程实例编码
	 */
	@TableField("PROC_ID")
	private String procId;
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
	 * 节点审批人
	 */
	@TableField("ASSIGNEE_SN")
	private String assigneeSn;
	/**
	 * 公议人名称
	 */
	@TableField("ASSIGNEE_NAME")
	private String assigneeName;
	/**
	 * 审批结论 1：同意 0：不同意 2:非公议人
	 */
	@TableField("RESULT")
	private String result;
	/**
	 * 创建时间
	 */
	@TableField("CREATE_TIME")
	private Date createTime;
	/**
	 * 1：有效审批人 0：无效审批人
	 */
	@TableField("FLAG")
	private String flag;
	/**
	 * 任务定义
	 */
	@TableField("TASK_KEY")
	private String taskKey;
	/**
	 * 任务编码
	 */
	@TableField("TASK_ID")
	private String taskId;
	/**
	 * 0是正常，1是非公议人
	 */
	@TableField("NOT_REVIEW")
	private String notReview;
	/**
	 * 0是我方，1是对方
	 */
	@TableField("WHICH_SIDE")
	private String whichSide;

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

	public String getWhichSide() {
		return whichSide;
	}

	public void setWhichSide(String whichSide) {
		this.whichSide = whichSide;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegCountersignTmp{" + "rowId=" + rowId + ", procId=" + procId + ", nodeId=" + nodeId + ", nodeName="
		        + nodeName + ", assigneeSn=" + assigneeSn + ", assigneeName=" + assigneeName + ", result=" + result
		        + ", createTime=" + createTime + ", flag=" + flag + ", taskKey=" + taskKey + ", taskId=" + taskId
		        + ", notReview=" + notReview + ", whichSide=" + whichSide + "}";
	}
}
