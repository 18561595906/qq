package com.haier.hop.ms.legcontract.dto;

/**
 * <p>
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-17
 */
public class LegPartnerDto {

	// 公司编码
	private String code;
	// 公司名称
	private String name;
	// 联系电话/地址
	private String phone;
	// 公司类型
	private String companyType;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

}
