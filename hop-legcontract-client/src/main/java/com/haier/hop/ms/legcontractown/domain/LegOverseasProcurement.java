package com.haier.hop.ms.legcontractown.domain;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 海外客户销售额表（数据只用近12月的销售额）
 * </p>
 *
 * @author xuejinxin
 * @since 2020-04-16
 */
@TableName("leg_overseas_procurement")
public class LegOverseasProcurement extends Model<LegOverseasProcurement> {

    private static final long serialVersionUID = 1L;

    /**
     * 客户编码
     */
    @TableField("CUSTOMER_CODE")
    private String customerCode;
    /**
     * 月份
     */
    @TableField("PERIOD_MONTH")
    private String periodMonth;
    /**
     * 销售额
     */
    @TableField("AMT")
    private BigDecimal amt;


    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getPeriodMonth() {
        return periodMonth;
    }

    public void setPeriodMonth(String periodMonth) {
        this.periodMonth = periodMonth;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegOverseasProcurement{" +
        "customerCode=" + customerCode +
        ", periodMonth=" + periodMonth +
        ", amt=" + amt +
        "}";
    }
}
