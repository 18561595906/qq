package com.haier.hop.ms.legcontract.constant;

/**
 * 用印状态
 * 
 * @author shiyingxin
 *
 */
public enum MassSealType {
	待用印合同("0"), 终止合同("1"), 暂停合同("2"), 已用印合同("3");

	private String value;

	private MassSealType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public String getName() {
		return this.name();
	}

	public static String convert(String value) {
		for (MassSealType c : MassSealType.values()) {
			if (c.getValue().equals(value)) {
				return c.getName();
			}
		}
		return null;
	}
}
