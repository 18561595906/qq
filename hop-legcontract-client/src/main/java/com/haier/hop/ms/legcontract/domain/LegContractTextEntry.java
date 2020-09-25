package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 里程碑文本带入可配置业务单元合同类型
 * </p>
 *
 * @author wangdh
 * @since 2019-07-30
 */
@TableName("leg_contract_text_entry")
public class LegContractTextEntry extends Model<LegContractTextEntry> {

	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId("ROW_ID")
	private BigDecimal rowId;
	/**
	 * 类型，业务单元或者合同类型 或者 里程碑的书签名
	 */
	@TableField("TYPE")
	private String type;
	/**
	 * 合同类型或者业务单元编码
	 */
	@TableField("VALUE")
	private String value;
	/**
	 * 是否启用1是-1不是
	 */
	@TableField("FLAG")
	private BigDecimal flag;
	/**
	 * 扩展（用来存放实体类的属性名，通过反射取值）
	 */
	@TableField("REMAKE")
	private String remake;

	public BigDecimal getRowId() {
		return rowId;
	}

	public void setRowId(BigDecimal rowId) {
		this.rowId = rowId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public BigDecimal getFlag() {
		return flag;
	}

	public void setFlag(BigDecimal flag) {
		this.flag = flag;
	}

	public String getRemake() {
		return remake;
	}

	public void setRemake(String remake) {
		this.remake = remake;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegContractTextEntry{" + "rowId=" + rowId + ", type=" + type + ", value=" + value + ", flag=" + flag
				+ ", remake=" + remake + "}";
	}
}
