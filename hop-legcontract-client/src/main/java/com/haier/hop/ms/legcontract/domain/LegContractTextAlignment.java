package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 文本对比表
 * </p>
 *
 * @author shiyingxin
 * @since 2019-09-06
 */
@TableName("leg_contract_text_alignment")
public class LegContractTextAlignment extends Model<LegContractTextAlignment> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 合同流程ID
	 */
	@TableField("PROC_ID")
	private String procId;
	/**
	 * 类型
	 */
	@TableField("TYPE")
	private String type;
	/**
	 * 创建时间
	 */
	@TableField("CREATE_TIME")
	private Date createTime;
	/**
	 * 创建人工号
	 */
	@TableField("CREATE_BY_EMP_SN")
	private String createByEmpSn;
	/**
	 * 创建人姓名
	 */
	@TableField("CREATE_BY_EMP_NAME")
	private String createByEmpName;
	/**
	 * 文本相似度
	 */
	@TableField("SIMILAR_SCORE")
	private BigDecimal similarScore;
	/**
	 * 源文件在达观存放地址
	 */
	@TableField("ORIGIN_FILE_PATH")
	private String originFilePath;
	/**
	 * 目标文件在达观存放地址
	 */
	@TableField("TARGET_FILE_PATH")
	private String targetFilePath;
	/**
	 * 目标文件的主键
	 */
	@TableField("TARGET_FILE_ROW_ID")
	private BigDecimal targetFileRowId;
	/**
	 * 源文件的主键
	 */
	@TableField("ORIGIN_FILE_ROW_ID")
	private BigDecimal originFileRowId;
	/**
	 * 删除标志
	 */
	@TableField("DELFLAG")
	private BigDecimal delflag;
	@TableField("TARGET_PAGE")
	private BigDecimal targetPage;
	@TableField("ORIGIN_PAGE")
	private BigDecimal originPage;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getProcId() {
		return procId;
	}

	public void setProcId(String procId) {
		this.procId = procId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateByEmpSn() {
		return createByEmpSn;
	}

	public void setCreateByEmpSn(String createByEmpSn) {
		this.createByEmpSn = createByEmpSn;
	}

	public String getCreateByEmpName() {
		return createByEmpName;
	}

	public void setCreateByEmpName(String createByEmpName) {
		this.createByEmpName = createByEmpName;
	}

	public BigDecimal getSimilarScore() {
		return similarScore;
	}

	public void setSimilarScore(BigDecimal similarScore) {
		this.similarScore = similarScore;
	}

	public String getOriginFilePath() {
		return originFilePath;
	}

	public void setOriginFilePath(String originFilePath) {
		this.originFilePath = originFilePath;
	}

	public String getTargetFilePath() {
		return targetFilePath;
	}

	public void setTargetFilePath(String targetFilePath) {
		this.targetFilePath = targetFilePath;
	}

	public BigDecimal getTargetFileRowId() {
		return targetFileRowId;
	}

	public void setTargetFileRowId(BigDecimal targetFileRowId) {
		this.targetFileRowId = targetFileRowId;
	}

	public BigDecimal getOriginFileRowId() {
		return originFileRowId;
	}

	public void setOriginFileRowId(BigDecimal originFileRowId) {
		this.originFileRowId = originFileRowId;
	}

	public BigDecimal getDelflag() {
		return delflag;
	}

	public void setDelflag(BigDecimal delflag) {
		this.delflag = delflag;
	}

	public BigDecimal getTargetPage() {
		return targetPage;
	}

	public void setTargetPage(BigDecimal targetPage) {
		this.targetPage = targetPage;
	}

	public BigDecimal getOriginPage() {
		return originPage;
	}

	public void setOriginPage(BigDecimal originPage) {
		this.originPage = originPage;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegContractTextAlignment{" + "rowId=" + rowId + ", procId=" + procId + ", type=" + type
				+ ", createTime=" + createTime + ", createByEmpSn=" + createByEmpSn + ", createByEmpName="
				+ createByEmpName + ", similarScore=" + similarScore + ", originFilePath=" + originFilePath
				+ ", targetFilePath=" + targetFilePath + ", targetFileRowId=" + targetFileRowId + ", originFileRowId="
				+ originFileRowId + ", delflag=" + delflag + ", targetPage=" + targetPage + ", originPage=" + originPage
				+ "}";
	}
}
