package com.haier.hop.ms.legcontract.constant;

/**
 * 甲乙方
 * 
 * @author shiyingxin
 *
 */
public enum PartnerType {
	甲方("1"), 乙方("2"), 丙方("3"), 丁方("4");

	private String value;

	private PartnerType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public String getName() {
		return this.name();
	}

	public static String convert(String value) {
		for (PartnerType c : PartnerType.values()) {
			if (c.getValue().equals(value)) {
				return c.getName();
			}
		}
		return null;
	}
}
