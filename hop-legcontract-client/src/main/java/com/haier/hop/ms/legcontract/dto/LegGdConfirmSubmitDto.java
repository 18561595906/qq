package com.haier.hop.ms.legcontract.dto;

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-17
 */
public class LegGdConfirmSubmitDto {

	/**
	 * 工作流信息
	 */
	private LegActivitiDto legActivitiDto;

	/**
	 * 印章使用信息
	 */
	private List<LegSealUseInfoDto> sealUseInfo;

	/**
	 * 归档时间
	 */
	private Date archivesDate;

	public LegActivitiDto getLegActivitiDto() {
		return legActivitiDto;
	}

	public void setLegActivitiDto(LegActivitiDto legActivitiDto) {
		this.legActivitiDto = legActivitiDto;
	}

	public List<LegSealUseInfoDto> getSealUseInfo() {
		return sealUseInfo;
	}

	public void setSealUseInfo(List<LegSealUseInfoDto> sealUseInfo) {
		this.sealUseInfo = sealUseInfo;
	}

	public Date getArchivesDate() {
		return archivesDate;
	}

	public void setArchivesDate(Date archivesDate) {
		this.archivesDate = archivesDate;
	}

}
