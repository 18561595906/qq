package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-07-15
 */
@TableName("leg_seal_detail")
public class LegSealDetail extends Model<LegSealDetail> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 文件名称
	 */
	@TableField("FILE_NAME")
	private String fileName;
	/**
	 * 页数
	 */
	@TableField("PAGE_NUM")
	private BigDecimal pageNum;
	/**
	 * 份数
	 */
	@TableField("COUNT")
	private BigDecimal count;

	/**
	 * 用印个数
	 */
	@TableField("YY_NUM")
	private BigDecimal yyNum;
	/**
	 * 关联ID
	 */
	@TableField("REAL_ID")
	private String realId;
	@TableField("FILE_TYPE")
	private String fileType;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public BigDecimal getPageNum() {
		return pageNum;
	}

	public void setPageNum(BigDecimal pageNum) {
		this.pageNum = pageNum;
	}

	public BigDecimal getCount() {
		return count;
	}

	public void setCount(BigDecimal count) {
		this.count = count;
	}

	public String getRealId() {
		return realId;
	}

	public void setRealId(String realId) {
		this.realId = realId;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public BigDecimal getYyNum() {
		return yyNum;
	}

	public void setYyNum(BigDecimal yyNum) {
		this.yyNum = yyNum;
	}

	@Override
	protected Serializable pkVal() {
		return this.rowId;
	}

	@Override
	public String toString() {
		return "LegSealDetail{" + "rowId=" + rowId + ", fileName=" + fileName + ", pageNum=" + pageNum + ", count="
				+ count + ", realId=" + realId + ", fileType=" + fileType + "}";
	}
}
