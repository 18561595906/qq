package com.haier.hop.ms.legcontract.dto;

import com.haier.hop.ms.legcontract.domain.LegAttachment;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-17
 */
public class LegSealAttachmentDto {

	/**
	 * 附件信息
	 */
	private LegAttachment attachmentInfo;

	/**
	 * 是否已经盖过章
	 */
	private boolean stamped;

	public LegAttachment getAttachmentInfo() {
		return attachmentInfo;
	}

	public void setAttachmentInfo(LegAttachment attachmentInfo) {
		this.attachmentInfo = attachmentInfo;
	}

	public boolean isStamped() {
		return stamped;
	}

	public void setStamped(boolean stamped) {
		this.stamped = stamped;
	}

}
