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
@TableName("leg_countersign_gpms")
public class LegCountersignGpms extends Model<LegCountersignGpms> {

    private static final long serialVersionUID = 1L;

    @TableField("ROLE_CODE")
    private String roleCode;
    @TableField("ROLE_NAME")
    private String roleName;
    @TableField("CONTRACT_ID")
    private Integer contractId;
    @TableField("ROW_ID")
    private Integer rowId;
    @TableField("PROC_ID")
    private String procId;
    @TableField("ASSIGNEE_SN")
    private String assigneeSn;
    @TableField("TASK_KEY")
    private String taskKey;
    @TableField("TASK_ID")
    private String taskId;
    @TableField("CREATE_TIME")
    private Date createTime;
    @TableField("ASSIGNEE_NAME")
    private String assigneeName;
    @TableField("RESULT")
    private String result;


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

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public Integer getRowId() {
        return rowId;
    }

    public void setRowId(Integer rowId) {
        this.rowId = rowId;
    }

    public String getProcId() {
        return procId;
    }

    public void setProcId(String procId) {
        this.procId = procId;
    }

    public String getAssigneeSn() {
        return assigneeSn;
    }

    public void setAssigneeSn(String assigneeSn) {
        this.assigneeSn = assigneeSn;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegCountersignGpms{" +
        "roleCode=" + roleCode +
        ", roleName=" + roleName +
        ", contractId=" + contractId +
        ", rowId=" + rowId +
        ", procId=" + procId +
        ", assigneeSn=" + assigneeSn +
        ", taskKey=" + taskKey +
        ", taskId=" + taskId +
        ", createTime=" + createTime +
        ", assigneeName=" + assigneeName +
        ", result=" + result +
        "}";
    }
}
