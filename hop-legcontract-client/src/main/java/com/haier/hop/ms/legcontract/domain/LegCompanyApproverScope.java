package com.haier.hop.ms.legcontract.domain;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 公司公议人员范围表
 * </p>
 *
 * @author liugan
 * @since 2019-12-03
 */
@TableName("leg_company_approver_scope")
public class LegCompanyApproverScope extends Model<LegCompanyApproverScope> {

    private static final long serialVersionUID = 1L;

    @TableField("ROW_ID")
    private String rowId;
    /**
     * 员工号
     */
    @TableField("EMP_SN")
    private String empSn;
    /**
     * 员工姓名
     */
    @TableField("EMP_NAME")
    private String empName;
    /**
     * 公议人范围编码
     */
    @TableField("NODE_ID")
    private String nodeId;
    /**
     * 公议人范围名称
     */
    @TableField("NODE_NAME")
    private String nodeName;
    /**
     * 插入时间
     */
    @TableField("CREATED_DATE")
    private Date createdDate;
    /**
     * 业务单元
     */
    @TableField("COMPANY_TYPE")
    private String companyType;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getEmpSn() {
        return empSn;
    }

    public void setEmpSn(String empSn) {
        this.empSn = empSn;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegCompanyApproverScope{" +
        "rowId=" + rowId +
        ", empSn=" + empSn +
        ", empName=" + empName +
        ", nodeId=" + nodeId +
        ", nodeName=" + nodeName +
        ", createdDate=" + createdDate +
        ", companyType=" + companyType +
        "}";
    }
}
