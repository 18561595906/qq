package com.haier.hop.ms.legcontract.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 合同范本里程碑
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-18
 */
@TableName("leg_contract_goals_rela_procid")
public class LegContractGoalsRelaProcid extends Model<LegContractGoalsRelaProcid> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ROW_ID")
    private String rowId;
    /**
     * 关联id
     */
    @TableField("RELA_ID")
    private String relaId;
    /**
     * 里程碑名称
     */
    @TableField("GOAL_NAME")
    private String goalName;
    /**
     * 付款时间
     */
    @TableField("GOAL_PAY_DATE")
    private Date goalPayDate;
    /**
     * 付款条件
     */
    @TableField("GOAL_PAY_CONDITION")
    private String goalPayCondition;
    /**
     * 付款比例
     */
    @TableField("GOAL_PAY_RATIO")
    private BigDecimal goalPayRatio;
    /**
     * 付款金额
     */
    @TableField("GOAL_PAY_MONEY")
    private BigDecimal goalPayMoney;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getRelaId() {
        return relaId;
    }

    public void setRelaId(String relaId) {
        this.relaId = relaId;
    }

    public String getGoalName() {
        return goalName;
    }

    public void setGoalName(String goalName) {
        this.goalName = goalName;
    }

    public Date getGoalPayDate() {
        return goalPayDate;
    }

    public void setGoalPayDate(Date goalPayDate) {
        this.goalPayDate = goalPayDate;
    }

    public String getGoalPayCondition() {
        return goalPayCondition;
    }

    public void setGoalPayCondition(String goalPayCondition) {
        this.goalPayCondition = goalPayCondition;
    }

    public BigDecimal getGoalPayRatio() {
        return goalPayRatio;
    }

    public void setGoalPayRatio(BigDecimal goalPayRatio) {
        this.goalPayRatio = goalPayRatio;
    }

    public BigDecimal getGoalPayMoney() {
        return goalPayMoney;
    }

    public void setGoalPayMoney(BigDecimal goalPayMoney) {
        this.goalPayMoney = goalPayMoney;
    }

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegContractGoalsRelaProcid{" +
        "rowId=" + rowId +
        ", relaId=" + relaId +
        ", goalName=" + goalName +
        ", goalPayDate=" + goalPayDate +
        ", goalPayCondition=" + goalPayCondition +
        ", goalPayRatio=" + goalPayRatio +
        ", goalPayMoney=" + goalPayMoney +
        "}";
    }
}
