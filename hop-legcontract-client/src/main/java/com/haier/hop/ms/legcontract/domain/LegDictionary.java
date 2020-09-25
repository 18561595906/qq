package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 数据字典
 * </p>
 *
 * @author lixianhua
 * @since 2019-06-18
 */
@TableName("leg_dictionary")
public class LegDictionary extends Model<LegDictionary> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ROW_ID")
    private String rowId;
    /**
     * 父类ID
     */
    @TableField("PARENT_ID")
    private String parentId;
    /**
     * 字典编码
     */
    @TableField("DIC_CODE")
    private String dicCode;
    /**
     * 字典描述
     */
    @TableField("DIC_VALUE")
    private String dicValue;
    /**
     * 数据类型
     */
    @TableField("DIC_TYPE")
    private Integer dicType;
    /**
     * 排序
     */
    @TableField("ORDER_INDEX")
    private Integer orderIndex;
    /**
     * 合同模块：是否前置环节
     */
    @TableField("FIELD1")
    private String field1;
    /**
     * 合同模块：是否标准合同
     */
    @TableField("FIELD2")
    private String field2;
    /**
     * 合同模块：范本编号
     */
    @TableField("FIELD3")
    private String field3;
    /**
     * 拓展字段
     */
    @TableField("FIELD4")
    private String field4;
    /**
     * 拓展字段
     */
    @TableField("FIELD5")
    private String field5;
    /**
     * 字典描述
     */
    @TableField("DIC_DESC")
    private String dicDesc;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getDicCode() {
        return dicCode;
    }

    public void setDicCode(String dicCode) {
        this.dicCode = dicCode;
    }

    public String getDicValue() {
        return dicValue;
    }

    public void setDicValue(String dicValue) {
        this.dicValue = dicValue;
    }

    public Integer getDicType() {
        return dicType;
    }

    public void setDicType(Integer dicType) {
        this.dicType = dicType;
    }

    public Integer getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5;
    }

    public String getDicDesc() {
        return dicDesc;
    }

    public void setDicDesc(String dicDesc) {
        this.dicDesc = dicDesc;
    }

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegDictionary{" +
        "rowId=" + rowId +
        ", parentId=" + parentId +
        ", dicCode=" + dicCode +
        ", dicValue=" + dicValue +
        ", dicType=" + dicType +
        ", orderIndex=" + orderIndex +
        ", field1=" + field1 +
        ", field2=" + field2 +
        ", field3=" + field3 +
        ", field4=" + field4 +
        ", field5=" + field5 +
        ", dicDesc=" + dicDesc +
        "}";
    }
}
