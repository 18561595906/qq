package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 合同归档表
 * </p>
 *
 * @author shiyingxin
 * @since 2019-07-15
 */
@TableName("leg_contract_archives")
public class LegContractArchives extends Model<LegContractArchives> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 合同编码
	 */
	@TableField("CONTRACT_CODE")
	private String contractCode;
	/**
	 * 归档地址
	 */
	@TableField("ARCHIVES_ADDRESS")
	private String archivesAddress;
	/**
	 * 归档人工号
	 */
	@TableField("ARCHIVES_SN")
	private String archivesSn;
	/**
	 * 归档人姓名
	 */
	@TableField("ARCHIVES_NAME")
	private String archivesName;
	/**
	 * 归档时间
	 */
	@TableField("ARCHIVES_DATE")
	private Date archivesDate;
	/**
	 * 纸质合同保管人工号
	 */
	@TableField("PAPER_CONTRACT_SN")
	private String paperContractSn;
	/**
	 * 纸质合同保管人
	 */
	@TableField("PAPER_CONTRACT_NAME")
	private String paperContractName;
	/**
	 * 流程Id
	 */
	@TableField("PROC_ID")
	private String procId;
	/**
	 * 纸质合同保管人电话
	 */
	@TableField("PAPER_CONTRACT_TELE")
	private String paperContractTele;
	/**
	 * 纸质合同保管人邮箱
	 */
	@TableField("PAPER_CONTRACT_EMAIL")
	private String paperContractEmail;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getArchivesAddress() {
		return archivesAddress;
	}

	public void setArchivesAddress(String archivesAddress) {
		this.archivesAddress = archivesAddress;
	}

	public String getArchivesSn() {
		return archivesSn;
	}

	public void setArchivesSn(String archivesSn) {
		this.archivesSn = archivesSn;
	}

	public String getArchivesName() {
		return archivesName;
	}

	public void setArchivesName(String archivesName) {
		this.archivesName = archivesName;
	}

	public Date getArchivesDate() {
		return archivesDate;
	}

	public void setArchivesDate(Date archivesDate) {
		this.archivesDate = archivesDate;
	}

	public String getPaperContractSn() {
		return paperContractSn;
	}

	public void setPaperContractSn(String paperContractSn) {
		this.paperContractSn = paperContractSn;
	}

	public String getPaperContractName() {
		return paperContractName;
	}

	public void setPaperContractName(String paperContractName) {
		this.paperContractName = paperContractName;
	}

	public String getProcId() {
		return procId;
	}

	public void setProcId(String procId) {
		this.procId = procId;
	}

	public String getPaperContractTele() {
		return paperContractTele;
	}

	public void setPaperContractTele(String paperContractTele) {
		this.paperContractTele = paperContractTele;
	}

	public String getPaperContractEmail() {
		return paperContractEmail;
	}

	public void setPaperContractEmail(String paperContractEmail) {
		this.paperContractEmail = paperContractEmail;
	}

	@Override
	protected Serializable pkVal() {
		return this.rowId;
	}

	@Override
	public String toString() {
		return "LegContractArchives{" + "rowId=" + rowId + ", contractCode=" + contractCode + ", archivesAddress="
				+ archivesAddress + ", archivesSn=" + archivesSn + ", archivesName=" + archivesName + ", archivesDate="
				+ archivesDate + ", paperContractSn=" + paperContractSn + ", paperContractName=" + paperContractName
				+ ", procId=" + procId + ", paperContractTele=" + paperContractTele + ", paperContractEmail="
				+ paperContractEmail + "}";
	}
}
