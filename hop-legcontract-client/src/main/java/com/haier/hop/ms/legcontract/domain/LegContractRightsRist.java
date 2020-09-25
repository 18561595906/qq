package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 标准合同风险表
 * </p>
 *
 * @author xuxu
 * @since 2019-07-11
 */
@TableName("leg_contract_rights_rist")
public class LegContractRightsRist extends Model<LegContractRightsRist> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 内容
	 */
	@TableField("ENTRY")
	private String entry;
	/**
	 * 权利义务标识(1:风险 2:权力)
	 */
	@TableField("FLAG")
	private Integer flag;
	/**
	 * 关联id
	 */
	@TableField("CONS_ID")
	private String consId;
	/**
	 * 修改人编号
	 */
	@TableField("UPDATE_BY_NO")
	private String updateByNo;
	/**
	 * 修改人
	 */
	@TableField("UPDATE_BY")
	private String updateBy;
	/**
	 * 修改时间
	 */
	@TableField("UPDATE_DATE")
	private Date updateDate;
	/**
	 * 1:标准合同（范本）；2：合同申报
	 */
	@TableField("TYPE")
	private Integer type;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getEntry() {
		return entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public String getConsId() {
		return consId;
	}

	public void setConsId(String consId) {
		this.consId = consId;
	}

	public String getUpdateByNo() {
		return updateByNo;
	}

	public void setUpdateByNo(String updateByNo) {
		this.updateByNo = updateByNo;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Override
	protected Serializable pkVal() {
		return this.rowId;
	}

	@Override
	public String toString() {
		return "LegContractRightsRist{" + "rowId=" + rowId + ", entry=" + entry + ", flag=" + flag + ", consId="
				+ consId + ", updateByNo=" + updateByNo + ", updateBy=" + updateBy + ", updateDate=" + updateDate
				+ ", type=" + type + "}";
	}
}
