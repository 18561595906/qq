package com.haier.hop.ms.legcontract.dto;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-12-16
 */
public class LegContractSupplierAttDto {
	// 文件名
	private String fileName;
	// 法大大在线查看地址
	private String viewUrl;
	// 法大大下载地址
	private String downLoadUrl;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getViewUrl() {
		return viewUrl;
	}

	public void setViewUrl(String viewUrl) {
		this.viewUrl = viewUrl;
	}

	public String getDownLoadUrl() {
		return downLoadUrl;
	}

	public void setDownLoadUrl(String downLoadUrl) {
		this.downLoadUrl = downLoadUrl;
	}

}
