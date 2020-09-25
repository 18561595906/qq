package com.haier.hop.ms.legcontract.domain;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 合同标签页面属性确定
 * </p>
 *
 * @author wangdh
 * @since 2019-07-30
 */
@TableName("leg_contract_tagpage")
public class LegContractTagpage extends Model<LegContractTagpage> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ROW_ID")
    private BigDecimal rowId;
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
     * 范本
     */
    @TableField("TAG_MODEL")
    private String tagModel;
    /**
     * 附件类型
     */
    @TableField("TAG_ATTACH_TYPE")
    private String tagAttachType;
    /**
     * 字段标记号
     */
    @TableField("TAG_NUM")
    private String tagNum;
    /**
     * 字段类型
     */
    @TableField("TAG_TYPE")
    private String tagType;
    /**
     * 限制条件
     */
    @TableField("TAG_LIMIT")
    private String tagLimit;
    /**
     * 单元
     */
    @TableField("TAG_UNIT")
    private String tagUnit;
    /**
     * 合同金额最小值
     */
    @TableField("TAG_MIN")
    private BigDecimal tagMin;
    /**
     * 合同金额最大值
     */
    @TableField("TAG_MAX")
    private BigDecimal tagMax;
    /**
     * 第四级菜单
     */
    @TableField("TAG_UNIT_FOUR")
    private String tagUnitFour;


    public BigDecimal getRowId() {
        return rowId;
    }

    public void setRowId(BigDecimal rowId) {
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

    public String getTagModel() {
        return tagModel;
    }

    public void setTagModel(String tagModel) {
        this.tagModel = tagModel;
    }

    public String getTagAttachType() {
        return tagAttachType;
    }

    public void setTagAttachType(String tagAttachType) {
        this.tagAttachType = tagAttachType;
    }

    public String getTagNum() {
        return tagNum;
    }

    public void setTagNum(String tagNum) {
        this.tagNum = tagNum;
    }

    public String getTagType() {
        return tagType;
    }

    public void setTagType(String tagType) {
        this.tagType = tagType;
    }

    public String getTagLimit() {
        return tagLimit;
    }

    public void setTagLimit(String tagLimit) {
        this.tagLimit = tagLimit;
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
        return "LegContractTagpage{" +
        "rowId=" + rowId +
        ", contractType=" + contractType +
        ", tagSection=" + tagSection +
        ", tagModular=" + tagModular +
        ", tagModel=" + tagModel +
        ", tagAttachType=" + tagAttachType +
        ", tagNum=" + tagNum +
        ", tagType=" + tagType +
        ", tagLimit=" + tagLimit +
        ", tagUnit=" + tagUnit +
        ", tagMin=" + tagMin +
        ", tagMax=" + tagMax +
        ", tagUnitFour=" + tagUnitFour +
        "}";
    }
}
