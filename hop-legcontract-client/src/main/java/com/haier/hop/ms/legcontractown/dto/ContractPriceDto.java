package com.haier.hop.ms.legcontractown.dto;

/**
 * <p>
 * </p>
 *
 * @author xuejinxin
 * @since 2020-04-15
 */
public class ContractPriceDto {
	/**
	 * 合同产品
	 */
	private String product;
	/**
	 * 金额
	 */
	private String price;

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
