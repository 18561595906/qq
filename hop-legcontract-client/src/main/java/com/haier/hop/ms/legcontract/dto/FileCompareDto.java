package com.haier.hop.ms.legcontract.dto;

import java.util.List;
import java.util.Map;

import com.haier.hop.ms.legcontract.domain.LegAttachment;

/**
 * 文本比对数据接收类
 * 
 * @author wushilei
 * @date 2019/09/04
 */
public class FileCompareDto {
	/**
	 * doc文件列表
	 */
	private List<LegAttachment> docfiles;
	/**
	 * pdf文件列表
	 */
	private List<LegAttachment> pdffiles;
	/**
	 * 合同信息Map
	 */
	private List<Map<String, String>> map;
	/**
	 * sharePoint文件标识
	 */
	private String docId;

	public List<LegAttachment> getDocfiles() {
		return docfiles;
	}

	public void setDocfiles(List<LegAttachment> docfiles) {
		this.docfiles = docfiles;
	}

	public List<LegAttachment> getPdffiles() {
		return pdffiles;
	}

	public void setPdffiles(List<LegAttachment> pdffiles) {
		this.pdffiles = pdffiles;
	}

	public List<Map<String, String>> getMap() {
		return map;
	}

	public void setMap(List<Map<String, String>> map) {
		this.map = map;
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}
}
