package com.haier.hop.ms.legcontract.dto;

import java.util.List;

import com.haier.hop.ms.legcontract.domain.LegAttachment;

/**
 * <p>
 * 拆分的批量合同信息
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-17
 */
public class LegBatchContractDto {

	/**
	 * 合同rowId
	 */
	private String rowId;

	/**
	 * 甲方签约方编码
	 */
	private String jfPartnerNo;

	/**
	 * 甲方签约方名称
	 */
	private String jfPartnerName;

	/**
	 * 乙方签约方编码
	 */
	private String yfPartnerNo;

	/**
	 * 乙方签约方名称
	 */
	private String yfPartnerName;

	/**
	 * 合同编号
	 */
	private String contractNo;

	/**
	 * 合同流水号
	 */
	private String contNo;

	/**
	 * 用印状态
	 */
	private String massSealType;

	/**
	 * 附件信息
	 */
	private List<LegAttachment> attachmentList;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getJfPartnerNo() {
		return jfPartnerNo;
	}

	public void setJfPartnerNo(String jfPartnerNo) {
		this.jfPartnerNo = jfPartnerNo;
	}

	public String getJfPartnerName() {
		return jfPartnerName;
	}

	public void setJfPartnerName(String jfPartnerName) {
		this.jfPartnerName = jfPartnerName;
	}

	public String getYfPartnerNo() {
		return yfPartnerNo;
	}

	public void setYfPartnerNo(String yfPartnerNo) {
		this.yfPartnerNo = yfPartnerNo;
	}

	public String getYfPartnerName() {
		return yfPartnerName;
	}

	public void setYfPartnerName(String yfPartnerName) {
		this.yfPartnerName = yfPartnerName;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getContNo() {
		return contNo;
	}

	public void setContNo(String contNo) {
		this.contNo = contNo;
	}

	public String getMassSealType() {
		return massSealType;
	}

	public void setMassSealType(String massSealType) {
		this.massSealType = massSealType;
	}

	public List<LegAttachment> getAttachmentList() {
		return attachmentList;
	}

	public void setAttachmentList(List<LegAttachment> attachmentList) {
		this.attachmentList = attachmentList;
	}

}
