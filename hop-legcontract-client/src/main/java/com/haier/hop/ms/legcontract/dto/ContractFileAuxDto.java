package com.haier.hop.ms.legcontract.dto;

/**
 * <p>
 * 	合同辅助附件
 * </p>
 *
 * @author liugan
 * @since 2020-04-23
 */
public class ContractFileAuxDto {
	
	/**
	 * 	合同辅助附件名称
	 */
	private String att_name_aux;
	
	
	/**
	 * 	合同辅助附件类型 合同:contract 合同模板:template 公司:company 印章:seal 综合:待补充 ... 其它系统：otherSys
	 */
	private String att_type_aux;
	
	/**
	 * 	合同辅助附件名称（带类型后缀）
	 */
	private String file_name_aux;
	
	/**
	 * 	合同辅助附件类型
	 */
	private String file_type_aux;
	
	/**
	 * 	合同辅助附件地址
	 */
	private String file_url_aux;
	
	/**
	 * 	合同辅助附件后缀
	 */
	private String suffix_aux;

	public String getAtt_name_aux() {
		return att_name_aux;
	}

	public void setAtt_name_aux(String att_name_aux) {
		this.att_name_aux = att_name_aux;
	}

	public String getAtt_type_aux() {
		return att_type_aux;
	}

	public void setAtt_type_aux(String att_type_aux) {
		this.att_type_aux = att_type_aux;
	}

	public String getFile_name_aux() {
		return file_name_aux;
	}

	public void setFile_name_aux(String file_name_aux) {
		this.file_name_aux = file_name_aux;
	}

	public String getFile_type_aux() {
		return file_type_aux;
	}

	public void setFile_type_aux(String file_type_aux) {
		this.file_type_aux = file_type_aux;
	}

	public String getFile_url_aux() {
		return file_url_aux;
	}

	public void setFile_url_aux(String file_url_aux) {
		this.file_url_aux = file_url_aux;
	}

	public String getSuffix_aux() {
		return suffix_aux;
	}

	public void setSuffix_aux(String suffix_aux) {
		this.suffix_aux = suffix_aux;
	}
}
