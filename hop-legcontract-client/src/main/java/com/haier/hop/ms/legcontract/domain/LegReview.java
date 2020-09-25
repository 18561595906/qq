package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 流程审核表
 * </p>
 *
 * @author shiyingxin
 * @since 2019-07-04
 */
@TableName("leg_review")
public class LegReview extends Model<LegReview> {

	private static final long serialVersionUID = 1L;

	@TableField("ROW_ID")
	private String rowId;
	/**
	 * 审核人编码
	 */
	@TableField("REVIEW_SN")
	private String reviewSn;
	/**
	 * 审核人
	 */
	@TableField("REVIEW_USER")
	private String reviewUser;
	/**
	 * 审核结果
	 */
	@TableField("REVIEW_RESULT")
	private String reviewResult;
	/**
	 * 审核时间
	 */
	@TableField("REVIEW_DATE")
	private Date reviewDate;
	/**
	 * 审批意见
	 */
	@TableField("REVIEW_DESC")
	private String reviewDesc;
	/**
	 * 流程实例ID
	 */
	@TableField("PRO_ID")
	private String proId;
	/**
	 * 节点名称
	 */
	@TableField("NODE_NAME")
	private String nodeName;
	/**
	 * 版本号
	 */
	@TableField("VERSION_NO")
	private Integer versionNo;
	/**
	 * 是否删除
	 */
	@TableField("IS_DELETE")
	private Integer isDelete;
	/**
	 * 审批轮数
	 */
	@TableField("REVIEW_NUMBER")
	private Integer reviewNumber;
	/**
	 * 节点ID
	 */
	@TableField("NODE_ID")
	private String nodeId;
	/**
	 * 任务编码
	 */
	@TableField("TASK_ID")
	private String taskId;
	/**
	 * 附件的rowId
	 */
	@TableField("FILE_ROW_ID")
	private String fileRowId;
	/**
	 * 附件名称
	 */
	@TableField("FILE_NAME")
	private String fileName;
	/**
	 * 附件url
	 */
	@TableField("FILE_URL")
	private String fileUrl;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getReviewSn() {
		return reviewSn;
	}

	public void setReviewSn(String reviewSn) {
		this.reviewSn = reviewSn;
	}

	public String getReviewUser() {
		return reviewUser;
	}

	public void setReviewUser(String reviewUser) {
		this.reviewUser = reviewUser;
	}

	public String getReviewResult() {
		return reviewResult;
	}

	public void setReviewResult(String reviewResult) {
		this.reviewResult = reviewResult;
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	public String getReviewDesc() {
		return reviewDesc;
	}

	public void setReviewDesc(String reviewDesc) {
		this.reviewDesc = reviewDesc;
	}

	public String getProId() {
		return proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public Integer getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(Integer versionNo) {
		this.versionNo = versionNo;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Integer getReviewNumber() {
		return reviewNumber;
	}

	public void setReviewNumber(Integer reviewNumber) {
		this.reviewNumber = reviewNumber;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getFileRowId() {
		return fileRowId;
	}

	public void setFileRowId(String fileRowId) {
		this.fileRowId = fileRowId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegReview{" + "rowId=" + rowId + ", reviewSn=" + reviewSn + ", reviewUser=" + reviewUser
				+ ", reviewResult=" + reviewResult + ", reviewDate=" + reviewDate + ", reviewDesc=" + reviewDesc
				+ ", proId=" + proId + ", nodeName=" + nodeName + ", versionNo=" + versionNo + ", isDelete=" + isDelete
				+ ", reviewNumber=" + reviewNumber + ", nodeId=" + nodeId + ", taskId=" + taskId + ", fileRowId="
				+ fileRowId + ", fileName=" + fileName + ", fileUrl=" + fileUrl + "}";
	}
}
