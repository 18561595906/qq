package com.haier.hop.ms.legcontract.dto;

import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-12-16
 */
public class LegContractSupplierDto {

	/**
	 * 是否允许自动签章
	 */
	private String gzType;

	/**
	 * 合同名称
	 */
	private String contractName;

	/**
	 * 附件信息
	 */
	private List<LegSealAttachmentDto> sealAttachmentList;
	// private List<LegElectronisSealDto> electronisSealDto;

	public String getGzType() {
		return gzType;
	}

	public void setGzType(String gzType) {
		this.gzType = gzType;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public List<LegSealAttachmentDto> getSealAttachmentList() {
		return sealAttachmentList;
	}

	public void setSealAttachmentList(List<LegSealAttachmentDto> sealAttachmentList) {
		this.sealAttachmentList = sealAttachmentList;
	}

}
