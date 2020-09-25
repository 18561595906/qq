package com.haier.hop.ms.legcontract.domain;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 合同模块审批人确认类型临时表
 * </p>
 *
 * @author shiyingxin
 * @since 2019-12-12
 */
@TableName("leg_contract_approve_type_tmp")
public class LegContractApproveTypeTmp extends Model<LegContractApproveTypeTmp> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ROW_ID")
    private String rowId;
    @TableField("PROC_ID")
    private String procId;
    /**
     * 业务单元编码
     */
    @TableField("BUSINESS_UNIT_CODE")
    private String businessUnitCode;
    /**
     * 业务单元名称
     */
    @TableField("BUSINESS_UNIT_NAME")
    private String businessUnitName;
    /**
     * 控制节点编码
     */
    @TableField("NODE_ID")
    private String nodeId;
    /**
     * 控制节点名称
     */
    @TableField("NODE_NAME")
    private String nodeName;
    /**
     * 审批规则
     */
    @TableField("APPROVE_RULE")
    private String approveRule;
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
     * 创建人名称
     */
    @TableField("CREATE_BY_NAME")
    private String createByName;


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

    public String getBusinessUnitCode() {
        return businessUnitCode;
    }

    public void setBusinessUnitCode(String businessUnitCode) {
        this.businessUnitCode = businessUnitCode;
    }

    public String getBusinessUnitName() {
        return businessUnitName;
    }

    public void setBusinessUnitName(String businessUnitName) {
        this.businessUnitName = businessUnitName;
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

    public String getApproveRule() {
        return approveRule;
    }

    public void setApproveRule(String approveRule) {
        this.approveRule = approveRule;
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

    public String getCreateByName() {
        return createByName;
    }

    public void setCreateByName(String createByName) {
        this.createByName = createByName;
    }

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegContractApproveTypeTmp{" +
        "rowId=" + rowId +
        ", procId=" + procId +
        ", businessUnitCode=" + businessUnitCode +
        ", businessUnitName=" + businessUnitName +
        ", nodeId=" + nodeId +
        ", nodeName=" + nodeName +
        ", approveRule=" + approveRule +
        ", createDate=" + createDate +
        ", createBy=" + createBy +
        ", createByName=" + createByName +
        "}";
    }
}
