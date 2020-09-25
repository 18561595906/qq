package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 合同标签信息
 * </p>
 *
 * @author xuxu
 * @since 2019-06-18
 */
@TableName("leg_contract_tag")
public class LegContractTag extends Model<LegContractTag> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ROW_ID")
    private BigDecimal rowId;
    /**
     * 标签编码
     */
    @TableField("TAG_CODE")
    private String tagCode;
    /**
     * 标签值
     */
    @TableField("TAG_VALUE")
    private String tagValue;
    /**
     * 标签备注
     */
    @TableField("TAG_DESC")
    private String tagDesc;


    public BigDecimal getRowId() {
        return rowId;
    }

    public void setRowId(BigDecimal rowId) {
        this.rowId = rowId;
    }

    public String getTagCode() {
        return tagCode;
    }

    public void setTagCode(String tagCode) {
        this.tagCode = tagCode;
    }

    public String getTagValue() {
        return tagValue;
    }

    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    public String getTagDesc() {
        return tagDesc;
    }

    public void setTagDesc(String tagDesc) {
        this.tagDesc = tagDesc;
    }

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegContractTag{" +
        "rowId=" + rowId +
        ", tagCode=" + tagCode +
        ", tagValue=" + tagValue +
        ", tagDesc=" + tagDesc +
        "}";
    }
}
