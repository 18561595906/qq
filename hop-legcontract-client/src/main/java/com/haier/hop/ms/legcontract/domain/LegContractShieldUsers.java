package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 合同并联公议屏蔽人员表
 * </p>
 *
 * @author shiyingxin
 * @since 2020-01-14
 */
@TableName("leg_contract_shield_users")
public class LegContractShieldUsers extends Model<LegContractShieldUsers> {

    private static final long serialVersionUID = 1L;

    @TableId("row_id")
    private String rowId;
    /**
     * 合同类型编码
     */
    @TableField("contract_code")
    private String contractCode;
    /**
     * 业务单元编码
     */
    @TableField("business_unit_code")
    private String businessUnitCode;
    /**
     * 公议节点ID
     */
    @TableField("node_id")
    private String nodeId;
    /**
     * 人员工号
     */
    @TableField("emp_sn")
    private String empSn;
    /**
     * 人员名称
     */
    @TableField("emp_name")
    private String empName;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public String getBusinessUnitCode() {
        return businessUnitCode;
    }

    public void setBusinessUnitCode(String businessUnitCode) {
        this.businessUnitCode = businessUnitCode;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
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

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegContractShieldUsers{" +
        "rowId=" + rowId +
        ", contractCode=" + contractCode +
        ", businessUnitCode=" + businessUnitCode +
        ", nodeId=" + nodeId +
        ", empSn=" + empSn +
        ", empName=" + empName +
        "}";
    }
}
