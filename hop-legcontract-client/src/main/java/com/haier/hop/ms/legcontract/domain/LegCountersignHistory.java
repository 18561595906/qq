package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * </p>
 *
 * @author xuejinxin
 * @since 2019-07-02
 */
@TableName("leg_countersign_history")
public class LegCountersignHistory extends Model<LegCountersignHistory> {

	private static final long serialVersionUID = 1L;

	@TableField("ROW_ID")
	private String rowId;
	@TableField("PROC_ID")
	private String procId;
	@TableField("NODE_ID")
	private String nodeId;
	@TableField("NODE_NAME")
	private String nodeName;
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

	/**
	 * key和value用*隔开 内部用逗号隔开
	 */
	@TableField("KEY_VALUE")
	private String keyValue;
	/**
	 * 0：授权人 1：被授权人 -1：未操作
	 */
	@TableField("TODO_FLG")
	private String todoFlg;

	public String getTodoFlg() {
		return todoFlg;
	}

	public void setTodoFlg(String todoFlg) {
		this.todoFlg = todoFlg;
	}

	public String getKeyValue() {
		return keyValue;
	}

	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}

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
		return "LegCountersignHistory{" + "rowId=" + rowId + ", procId=" + procId + ", nodeId=" + nodeId + ", nodeName="
		        + nodeName + ", assigneeSn=" + assigneeSn + ", assigneeName=" + assigneeName + ", result=" + result
		        + ", createTime=" + createTime + ", flag=" + flag + ", taskKey=" + taskKey + ", taskId=" + taskId
		        + ", notReview=" + notReview + ", whichSide=" + whichSide + "}";
	}
}
