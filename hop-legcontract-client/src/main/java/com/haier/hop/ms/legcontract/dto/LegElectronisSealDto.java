package com.haier.hop.ms.legcontract.dto;

import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-17
 */
public class LegElectronisSealDto {

	/**
	 * 盖章方式
	 */
	private String stampType;

	/**
	 * 印章编号
	 */
	private String sealNo;

	/**
	 * 印章名称
	 */
	private String sealName;

	/**
	 * 盖章附件信息
	 */
	private List<LegSealAttachmentDto> attachmentList;

	public String getStampType() {
		return stampType;
	}

	public void setStampType(String stampType) {
		this.stampType = stampType;
	}

	public String getSealNo() {
		return sealNo;
	}

	public void setSealNo(String sealNo) {
		this.sealNo = sealNo;
	}

	public String getSealName() {
		return sealName;
	}

	public void setSealName(String sealName) {
		this.sealName = sealName;
	}

	public List<LegSealAttachmentDto> getAttachmentList() {
		return attachmentList;
	}

	public void setAttachmentList(List<LegSealAttachmentDto> attachmentList) {
		this.attachmentList = attachmentList;
	}

}
