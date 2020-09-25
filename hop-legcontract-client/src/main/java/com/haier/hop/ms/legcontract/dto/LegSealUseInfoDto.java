package com.haier.hop.ms.legcontract.dto;

import java.util.Date;

import com.haier.hop.ms.legcontract.domain.LegSealUse;

/**
 * <p>
 * 用印申请开始的印章使用信息
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-17
 */
public class LegSealUseInfoDto extends LegSealUse {

	private static final long serialVersionUID = 1L;

	/**
	 * 归档时间
	 */
	private Date archivesDate;

	/**
	 * 我方是否先用印 0否 1是
	 */
	private String isFirSt;

	/**
	 * 是否显示我方先用印 0否 1是
	 */
	private String showFirSt;

	public Date getArchivesDate() {
		return archivesDate;
	}

	public void setArchivesDate(Date archivesDate) {
		this.archivesDate = archivesDate;
	}

	public String getIsFirSt() {
		return isFirSt;
	}

	public void setIsFirSt(String isFirSt) {
		this.isFirSt = isFirSt;
	}

	public String getShowFirSt() {
		return showFirSt;
	}

	public void setShowFirSt(String showFirSt) {
		this.showFirSt = showFirSt;
	}

}
