package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2020-01-14
 */
@TableName("leg_employee_freeze_backfoor")
public class LegEmployeeFreezeBackfoor extends Model<LegEmployeeFreezeBackfoor> {

    private static final long serialVersionUID = 1L;

    @TableField("row_id")
    private String rowId;
    @TableField("emp_sn")
    private String empSn;
    @TableField("emp_name")
    private String empName;


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

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegEmployeeFreezeBackfoor{" +
        "rowId=" + rowId +
        ", empSn=" + empSn +
        ", empName=" + empName +
        "}";
    }
}
