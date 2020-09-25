package com.haier.hop.ms.legcontract.dto;

/**
 * <p>
 * 关联付款公司
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-25
 */
public class LegAccountCompanyDto {
	/**
	 * 公司编码
	 */
	private String companyCode;

	/**
	 * 公司名称
	 */
	private String companyName;

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
