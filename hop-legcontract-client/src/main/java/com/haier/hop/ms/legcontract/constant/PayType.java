package com.haier.hop.ms.legcontract.constant;

/**
 * 付款方式
 * 
 * @author shiyingxin
 *
 */
public enum PayType {
	银行转账("1"), 汇款("2"), 支票("3"), 本票("4"), 银行汇票("5"), 信用证("6"), 赊销OA("7"), 其他("8"),
	网上付款("X"),转账扣款("09"),开票直扣("SL01"),下拨扣款("10"),银行支票("C");

	private String value;

	private PayType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public String getName() {
		return this.name();
	}

	public static String convert(String value) {
		for (PayType c : PayType.values()) {
			if (c.getValue().equals(value)) {
				return c.getName();
			}
		}
		return null;
	}
}
