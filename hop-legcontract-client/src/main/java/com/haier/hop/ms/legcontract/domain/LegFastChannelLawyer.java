package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 快速通道合同对应律师表
 * </p>
 *
 * @author shiyingxin
 * @since 2019-08-22
 */
@TableName("leg_fast_channel_lawyer")
public class LegFastChannelLawyer extends Model<LegFastChannelLawyer> {

    private static final long serialVersionUID = 1L;

    @TableId("ROW_ID")
    private String rowId;
    @TableField("BUSINESS_UNIT_CODE")
    private String businessUnitCode;
    @TableField("BUSINESS_UNIT_NAME")
    private String businessUnitName;
    @TableField("LAWYER_SN")
    private String lawyerSn;
    @TableField("LAWYER_NAME")
    private String lawyerName;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
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

    public String getLawyerSn() {
        return lawyerSn;
    }

    public void setLawyerSn(String lawyerSn) {
        this.lawyerSn = lawyerSn;
    }

    public String getLawyerName() {
        return lawyerName;
    }

    public void setLawyerName(String lawyerName) {
        this.lawyerName = lawyerName;
    }

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegFastChannelLawyer{" +
        "rowId=" + rowId +
        ", businessUnitCode=" + businessUnitCode +
        ", businessUnitName=" + businessUnitName +
        ", lawyerSn=" + lawyerSn +
        ", lawyerName=" + lawyerName +
        "}";
    }
}
