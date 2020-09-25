package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 案件申诉
 * </p>
 *
 * @author shiyingxin
 * @since 2019-09-27
 */
@TableName("leg_lcmsinfo")
public class LegLcmsinfo extends Model<LegLcmsinfo> {

	private static final long serialVersionUID = 1L;

	@TableId("ROW_ID")
	private String rowId;
	@TableField("ANJ_BIANH")
	private String anjBianh;
	@TableField("ANJ_MINGCH")
	private String anjMingch;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getAnjBianh() {
		return anjBianh;
	}

	public void setAnjBianh(String anjBianh) {
		this.anjBianh = anjBianh;
	}

	public String getAnjMingch() {
		return anjMingch;
	}

	public void setAnjMingch(String anjMingch) {
		this.anjMingch = anjMingch;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegLcmsinfo{" + "rowId=" + rowId + ", anjBianh=" + anjBianh + ", anjMingch=" + anjMingch + "}";
	}
}
