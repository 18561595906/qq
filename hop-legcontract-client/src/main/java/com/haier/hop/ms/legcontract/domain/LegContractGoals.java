package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 合同范本里程碑
 * </p>
 *
 * @author xuxu
 * @since 2019-06-18
 */
@TableName("leg_contract_goals")
public class LegContractGoals extends Model<LegContractGoals> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ROW_ID")
    private BigDecimal rowId;
    /**
     * 合同里程碑合同类别编码
     */
    @TableField("GOAL_CONTRACT_CODE")
    private String goalContractCode;
    /**
     * 合同里程碑合同类别名称
     */
    @TableField("GOAL_CONTRACT_NAME")
    private String goalContractName;
    /**
     * 合同里程碑数量固定/不固定 0固定1不固定
     */
    @TableField("GOAL_TYPE")
    private BigDecimal goalType;
    /**
     * 合同里程碑数量
     */
    @TableField("GOAL_COUNT")
    private BigDecimal goalCount;


    public BigDecimal getRowId() {
        return rowId;
    }

    public void setRowId(BigDecimal rowId) {
        this.rowId = rowId;
    }

    public String getGoalContractCode() {
        return goalContractCode;
    }

    public void setGoalContractCode(String goalContractCode) {
        this.goalContractCode = goalContractCode;
    }

    public String getGoalContractName() {
        return goalContractName;
    }

    public void setGoalContractName(String goalContractName) {
        this.goalContractName = goalContractName;
    }

    public BigDecimal getGoalType() {
        return goalType;
    }

    public void setGoalType(BigDecimal goalType) {
        this.goalType = goalType;
    }

    public BigDecimal getGoalCount() {
        return goalCount;
    }

    public void setGoalCount(BigDecimal goalCount) {
        this.goalCount = goalCount;
    }

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegContractGoals{" +
        "rowId=" + rowId +
        ", goalContractCode=" + goalContractCode +
        ", goalContractName=" + goalContractName +
        ", goalType=" + goalType +
        ", goalCount=" + goalCount +
        "}";
    }
}
