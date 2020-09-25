package com.haier.hop.ms.legcontract.dto;

import java.util.List;

import com.haier.hop.ms.legcontract.domain.LegAttachment;
import com.haier.hop.ms.legcontract.domain.LegContractArchives;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-17
 */
public class LegContractArchivesDto {

	/**
	 * 合同归档信息
	 */
	private LegContractArchives archivesInfo;

	/**
	 * 合同电子版信息
	 */
	private List<LegAttachment> electronicAttachmentInfo;

	public LegContractArchives getArchivesInfo() {
		return archivesInfo;
	}

	public void setArchivesInfo(LegContractArchives archivesInfo) {
		this.archivesInfo = archivesInfo;
	}

	public List<LegAttachment> getElectronicAttachmentInfo() {
		return electronicAttachmentInfo;
	}

	public void setElectronicAttachmentInfo(List<LegAttachment> electronicAttachmentInfo) {
		this.electronicAttachmentInfo = electronicAttachmentInfo;
	}

}
