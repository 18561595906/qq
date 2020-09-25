package com.haier.hop.ms.legcontract.dto;

import java.io.Serializable;

import com.haier.hop.ms.legcontract.domain.LegAttachment;

public class LegAttachmentDto extends LegAttachment implements Serializable {
	/**
	 * 文件
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * 访问文件的http地址
	 */
	private String httpUrl;

	public String getHttpUrl() {
		return httpUrl;
	}

	public void setHttpUrl(String httpUrl) {
		this.httpUrl = httpUrl;
	}

}
