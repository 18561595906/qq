package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 
 * </p>
 *
 * @author wdh
 * @since 2019-07-31
 */
@TableName("leg_dictionary_tmp")
public class LegDictionaryTmp extends Model<LegDictionaryTmp> {

	private static final long serialVersionUID = 1L;

	@TableField("ROW_ID")
	private String rowId;
	@TableField("PARENT_ID")
	private Integer parentId;
	@TableField("DIC_CODE")
	private String dicCode;
	@TableField("DIC_VALUE")
	private String dicValue;
	@TableField("DIC_TYPE")
	private Integer dicType;
	@TableField("ORDER_INDEX")
	private Integer orderIndex;
	@TableField("FIELD1")
	private String field1;
	@TableField("FIELD2")
	private String field2;
	@TableField("FIELD3")
	private String field3;
	@TableField("FIELD4")
	private String field4;
	@TableField("FIELD5")
	private String field5;
	@TableField("DIC_DESC")
	private String dicDesc;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
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
		return null;
	}

	@Override
	public String toString() {
		return "LegDictionaryTmp{" + "rowId=" + rowId + ", parentId=" + parentId + ", dicCode=" + dicCode
				+ ", dicValue=" + dicValue + ", dicType=" + dicType + ", orderIndex=" + orderIndex + ", field1="
				+ field1 + ", field2=" + field2 + ", field3=" + field3 + ", field4=" + field4 + ", field5=" + field5
				+ ", dicDesc=" + dicDesc + "}";
	}
}
