package com.haier.hop.ms.legcontract.dto;

import java.util.List;

import com.haier.hop.ms.legcontract.domain.LegAttachment;
import com.haier.hop.ms.legcontract.domain.LegTspcontract;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-25
 */
public class LegTspcontractSelectDto {

	/**
	 * 基本信息
	 */
	public LegTspcontract tspcontractInfo;

	/**
	 * 合同附件pdf
	 */
	public List<LegAttachment> pdfAttachmentList;

	/**
	 * 合同扫描件
	 */
	public List<LegAttachment> scanAttachmentList;

	public LegTspcontract getTspcontractInfo() {
		return tspcontractInfo;
	}

	public void setTspcontractInfo(LegTspcontract tspcontractInfo) {
		this.tspcontractInfo = tspcontractInfo;
	}

	public List<LegAttachment> getPdfAttachmentList() {
		return pdfAttachmentList;
	}

	public void setPdfAttachmentList(List<LegAttachment> pdfAttachmentList) {
		this.pdfAttachmentList = pdfAttachmentList;
	}

	public List<LegAttachment> getScanAttachmentList() {
		return scanAttachmentList;
	}

	public void setScanAttachmentList(List<LegAttachment> scanAttachmentList) {
		this.scanAttachmentList = scanAttachmentList;
	}

}
