package com.haier.hop.ms.legcontract.domain;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wushilei
 * @since 2020-05-17
 */
@TableName("leg_review_gpms")
public class LegReviewGpms extends Model<LegReviewGpms> {

    private static final long serialVersionUID = 1L;

    @TableField("REVIEW_RESULT")
    private String reviewResult;
    @TableField("REVIEW_DATE")
    private Date reviewDate;
    @TableField("REVIEW_DESC")
    private String reviewDesc;
    @TableField("ROW_ID")
    private Integer rowId;
    @TableField("REVIEW_SN")
    private String reviewSn;
    @TableField("REVIEW_USER")
    private String reviewUser;
    @TableField("CREATE_TIME")
    private Date createTime;
    @TableField("PROC_ID")
    private String procId;
    @TableField("NODE_NAME")
    private String nodeName;
    @TableField("ROLE_CODE")
    private String roleCode;
    @TableField("ROLE_NAME")
    private String roleName;
    @TableField("TASK_ID")
    private String taskId;


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

    public Integer getRowId() {
        return rowId;
    }

    public void setRowId(Integer rowId) {
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

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegReviewGpms{" +
        "reviewResult=" + reviewResult +
        ", reviewDate=" + reviewDate +
        ", reviewDesc=" + reviewDesc +
        ", rowId=" + rowId +
        ", reviewSn=" + reviewSn +
        ", reviewUser=" + reviewUser +
        ", createTime=" + createTime +
        ", procId=" + procId +
        ", nodeName=" + nodeName +
        ", roleCode=" + roleCode +
        ", roleName=" + roleName +
        ", taskId=" + taskId +
        "}";
    }
}
