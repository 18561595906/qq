package com.haier.hop.ms.legcontract.domain;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 合同模块审批人确认类型
 * </p>
 *
 * @author xuxu
 * @since 2019-07-11
 */
@TableName("leg_contract_approve_type")
public class LegContractApproveType extends Model<LegContractApproveType> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ROW_ID")
    private String rowId;
    /**
     * 业务类型：1：自主申报；2：合同公议
     */
    @TableField("BUSINESS_TYPE")
    private String businessType;
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
     * 审批人规则类型：1:经营体；2:族群；3:业务主人；
     */
    @TableField("APPROVE_RULE_TYPE")
    private Integer approveRuleType;
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
     * 最后修改时间
     */
    @TableField("UPDATE_DATE")
    private Date updateDate;
    /**
     * 最后修改人
     */
    @TableField("UPDATE_BY")
    private String updateBy;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
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

    public Integer getApproveRuleType() {
        return approveRuleType;
    }

    public void setApproveRuleType(Integer approveRuleType) {
        this.approveRuleType = approveRuleType;
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

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegContractApproveType{" +
        "rowId=" + rowId +
        ", businessType=" + businessType +
        ", businessUnitCode=" + businessUnitCode +
        ", businessUnitName=" + businessUnitName +
        ", nodeId=" + nodeId +
        ", nodeName=" + nodeName +
        ", approveRuleType=" + approveRuleType +
        ", approveRule=" + approveRule +
        ", createDate=" + createDate +
        ", createBy=" + createBy +
        ", updateDate=" + updateDate +
        ", updateBy=" + updateBy +
        "}";
    }
}
