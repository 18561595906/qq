package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 数据迁移错误信息表
 * </p>
 *
 * @author shiyingxin
 * @since 2019-12-05
 */
@TableName("leg_data_move_err_log")
public class LegDataMoveErrLog extends Model<LegDataMoveErrLog> {

	private static final long serialVersionUID = 1L;

	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 创建时间
	 */
	@TableField("CREATE_TIME")
	private Date createTime;

	/**
	 * 范本id
	 */
	@TableField("STANDARD_ID")
	private String standardId;

	/**
	 * 附件id
	 */
	@TableField("ATT_ID")
	private String attId;

	/**
	 * 错误内容
	 */
	@TableField("CONTENT")
	private String content;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStandardId() {
		return standardId;
	}

	public void setStandardId(String standardId) {
		this.standardId = standardId;
	}

	public String getAttId() {
		return attId;
	}

	public void setAttId(String attId) {
		this.attId = attId;
	}

	@Override
	protected Serializable pkVal() {
		return this.rowId;
	}

	@Override
	public String toString() {
		return "LegDataMoveErrLog{" + "rowId=" + rowId + ", createTime=" + createTime + ", content=" + content + "}";
	}
}
