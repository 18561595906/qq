package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 角色表
 * </p>
 *
 * @author wdh
 * @since 2020-04-04
 */
@TableName("leg_employee_role")
public class LegEmployeeRole extends Model<LegEmployeeRole> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ROW_ID")
    private String rowId;
    /**
     * 员工编号
     */
    @TableField("EMP_SN")
    private String empSn;
    /**
     * 员工名称
     */
    @TableField("EMP_NAME")
    private String empName;
    /**
     * 角色编码
     */
    @TableField("ROLE_SN")
    private String roleSn;
    /**
     * 角色名称
     */
    @TableField("ROLE_NAME")
    private String roleName;


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

    public String getRoleSn() {
        return roleSn;
    }

    public void setRoleSn(String roleSn) {
        this.roleSn = roleSn;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegEmployeeRole{" +
        "rowId=" + rowId +
        ", empSn=" + empSn +
        ", empName=" + empName +
        ", roleSn=" + roleSn +
        ", roleName=" + roleName +
        "}";
    }
}
