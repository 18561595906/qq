package com.haier.hop.ms.legcontract.dto;

import java.util.List;

import com.haier.hop.ms.legcontract.domain.LegAttachment;

public class LegStandardSearchDto {
	/*
	 * 修改范本类型
	 */
	private List<LegAttachment> attachments;
	private List<LegAttachment> deleteList;
	private List<String> addList;

	/**
	 * 替换范本
	 */
	private LegAttachment attachmentOld1;
	private LegAttachment attachmentOld2;
	private LegAttachment attachmentNew1;
	private LegAttachment attachmentNew2;

	public List<LegAttachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<LegAttachment> attachments) {
		this.attachments = attachments;
	}

	public List<LegAttachment> getDeleteList() {
		return deleteList;
	}

	public void setDeleteList(List<LegAttachment> deleteList) {
		this.deleteList = deleteList;
	}

	public List<String> getAddList() {
		return addList;
	}

	public LegAttachment getAttachmentOld1() {
		return attachmentOld1;
	}

	public void setAttachmentOld1(LegAttachment attachmentOld1) {
		this.attachmentOld1 = attachmentOld1;
	}

	public LegAttachment getAttachmentOld2() {
		return attachmentOld2;
	}

	public void setAttachmentOld2(LegAttachment attachmentOld2) {
		this.attachmentOld2 = attachmentOld2;
	}

	public LegAttachment getAttachmentNew1() {
		return attachmentNew1;
	}

	public void setAttachmentNew1(LegAttachment attachmentNew1) {
		this.attachmentNew1 = attachmentNew1;
	}

	public LegAttachment getAttachmentNew2() {
		return attachmentNew2;
	}

	public void setAttachmentNew2(LegAttachment attachmentNew2) {
		this.attachmentNew2 = attachmentNew2;
	}

	public void setAddList(List<String> addList) {
		this.addList = addList;
	}

}
