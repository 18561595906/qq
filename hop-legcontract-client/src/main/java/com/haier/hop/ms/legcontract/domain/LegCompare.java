package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 比较表
 * </p>
 *
 * @author shiyingxin
 * @since 2019-07-22
 */
@TableName("leg_compare")
public class LegCompare extends Model<LegCompare> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 流程类型
	 */
	@TableField("PROC_TYPE")
	private String procType;
	/**
	 * 流程Id
	 */
	@TableField("PROC_ID")
	private String procId;
	/**
	 * 比较字段名
	 */
	@TableField("COMPARE_KEY")
	private String compareKey;
	/**
	 * 比较值1
	 */
	@TableField("COMPARE_VALUE1")
	private String compareValue1;
	/**
	 * 比较值2
	 */
	@TableField("COMPARE_VALUE2")
	private String compareValue2;
	/**
	 * 扩展字段1
	 */
	@TableField("FIELD1")
	private String field1;
	/**
	 * 扩展字段2
	 */
	@TableField("FIELD2")
	private String field2;
	/**
	 * 扩展字段3
	 */
	@TableField("FIELD3")
	private String field3;
	/**
	 * 扩展字段4
	 */
	@TableField("FIELD4")
	private String field4;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getProcType() {
		return procType;
	}

	public void setProcType(String procType) {
		this.procType = procType;
	}

	public String getProcId() {
		return procId;
	}

	public void setProcId(String procId) {
		this.procId = procId;
	}

	public String getCompareKey() {
		return compareKey;
	}

	public void setCompareKey(String compareKey) {
		this.compareKey = compareKey;
	}

	public String getCompareValue1() {
		return compareValue1;
	}

	public void setCompareValue1(String compareValue1) {
		this.compareValue1 = compareValue1;
	}

	public String getCompareValue2() {
		return compareValue2;
	}

	public void setCompareValue2(String compareValue2) {
		this.compareValue2 = compareValue2;
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

	@Override
	protected Serializable pkVal() {
		return this.rowId;
	}

	@Override
	public String toString() {
		return "LegCompare{" + "rowId=" + rowId + ", procType=" + procType + ", procId=" + procId + ", compareKey="
				+ compareKey + ", compareValue1=" + compareValue1 + ", compareValue2=" + compareValue2 + ", field1="
				+ field1 + ", field2=" + field2 + ", field3=" + field3 + ", field4=" + field4 + "}";
	}
}
