package com.haier.hop.ms.legcontract.domain;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotations.TableId;
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
 * @since 2019-09-12
 */
@TableName("leg_contract_tagpage_fast")
public class LegContractTagpageFast extends Model<LegContractTagpageFast> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ROW_ID")
    private String rowId;
    /**
     * 合同类型
     */
    @TableField("CONTRACT_TYPE")
    private String contractType;
    /**
     * 板块
     */
    @TableField("TAG_SECTION")
    private String tagSection;
    /**
     * 模块
     */
    @TableField("TAG_MODULAR")
    private String tagModular;
    /**
     * 单元
     */
    @TableField("TAG_UNIT")
    private String tagUnit;
    /**
     * 最小金额
     */
    @TableField("TAG_MIN")
    private BigDecimal tagMin;
    /**
     * 最大金额
     */
    @TableField("TAG_MAX")
    private BigDecimal tagMax;
    /**
     * 是否禁用‘0’表示禁用‘1’表示启用
     */
    @TableField("RULE")
    private String rule;
    /**
     * 第四级菜单
     */
    @TableField("TAG_UNIT_FOUR")
    private String tagUnitFour;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getTagSection() {
        return tagSection;
    }

    public void setTagSection(String tagSection) {
        this.tagSection = tagSection;
    }

    public String getTagModular() {
        return tagModular;
    }

    public void setTagModular(String tagModular) {
        this.tagModular = tagModular;
    }

    public String getTagUnit() {
        return tagUnit;
    }

    public void setTagUnit(String tagUnit) {
        this.tagUnit = tagUnit;
    }

    public BigDecimal getTagMin() {
        return tagMin;
    }

    public void setTagMin(BigDecimal tagMin) {
        this.tagMin = tagMin;
    }

    public BigDecimal getTagMax() {
        return tagMax;
    }

    public void setTagMax(BigDecimal tagMax) {
        this.tagMax = tagMax;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getTagUnitFour() {
        return tagUnitFour;
    }

    public void setTagUnitFour(String tagUnitFour) {
        this.tagUnitFour = tagUnitFour;
    }

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegContractTagpageFast{" +
        "rowId=" + rowId +
        ", contractType=" + contractType +
        ", tagSection=" + tagSection +
        ", tagModular=" + tagModular +
        ", tagUnit=" + tagUnit +
        ", tagMin=" + tagMin +
        ", tagMax=" + tagMax +
        ", rule=" + rule +
        ", tagUnitFour=" + tagUnitFour +
        "}";
    }
}
