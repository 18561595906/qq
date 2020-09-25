package com.haier.hop.ms.legcontractown.domain;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 海外合同中国家列表，公司付款编码，市场小V列表fromMDM
 * </p>
 *
 * @author xuejinxin
 * @since 2020-04-16
 */
@TableName("leg_overseas_list_mdm")
public class LegOverseasListMdm extends Model<LegOverseasListMdm> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableField("VALUE_ID")
    private String valueId;
    /**
     * 值集ID
     */
    @TableField("VALUE_SET_ID")
    private String valueSetId;
    /**
     * 值集描述
     */
    @TableField("DESCRIPTION")
    private String description;
    /**
     * 值
     */
    @TableField("VALUE")
    private String value;
    /**
     * 中文描述
     */
    @TableField("VALUE_MEANING")
    private String valueMeaning;
    /**
     * 英文描述
     */
    @TableField("VALUE_MEANING_EN")
    private String valueMeaningEn;
    /**
     * 父值
     */
    @TableField("PARENT_VALUE_LOW")
    private String parentValueLow;
    /**
     * 父值值集ID
     */
    @TableField("PARENT_VALUE_SET_ID")
    private String parentValueSetId;
    /**
     * 活动标识
     */
    @TableField("ACTIVE_FLAG")
    private String activeFlag;
    /**
     * 创建时间
     */
    @TableField("CREATED")
    private Date created;
    /**
     * 创建人
     */
    @TableField("CREATED_BY")
    private String createdBy;
    /**
     * 更新时间
     */
    @TableField("LAST_UPD")
    private Date lastUpd;
    /**
     * 删除标识
     */
    @TableField("DELETE_FLAG")
    private String deleteFlag;
    /**
     * 公司代码
     */
    @TableField("COMPANY_CODE")
    private String companyCode;


    public String getValueId() {
        return valueId;
    }

    public void setValueId(String valueId) {
        this.valueId = valueId;
    }

    public String getValueSetId() {
        return valueSetId;
    }

    public void setValueSetId(String valueSetId) {
        this.valueSetId = valueSetId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValueMeaning() {
        return valueMeaning;
    }

    public void setValueMeaning(String valueMeaning) {
        this.valueMeaning = valueMeaning;
    }

    public String getValueMeaningEn() {
        return valueMeaningEn;
    }

    public void setValueMeaningEn(String valueMeaningEn) {
        this.valueMeaningEn = valueMeaningEn;
    }

    public String getParentValueLow() {
        return parentValueLow;
    }

    public void setParentValueLow(String parentValueLow) {
        this.parentValueLow = parentValueLow;
    }

    public String getParentValueSetId() {
        return parentValueSetId;
    }

    public void setParentValueSetId(String parentValueSetId) {
        this.parentValueSetId = parentValueSetId;
    }

    public String getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(String activeFlag) {
        this.activeFlag = activeFlag;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getLastUpd() {
        return lastUpd;
    }

    public void setLastUpd(Date lastUpd) {
        this.lastUpd = lastUpd;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegOverseasListMdm{" +
        "valueId=" + valueId +
        ", valueSetId=" + valueSetId +
        ", description=" + description +
        ", value=" + value +
        ", valueMeaning=" + valueMeaning +
        ", valueMeaningEn=" + valueMeaningEn +
        ", parentValueLow=" + parentValueLow +
        ", parentValueSetId=" + parentValueSetId +
        ", activeFlag=" + activeFlag +
        ", created=" + created +
        ", createdBy=" + createdBy +
        ", lastUpd=" + lastUpd +
        ", deleteFlag=" + deleteFlag +
        ", companyCode=" + companyCode +
        "}";
    }
}
