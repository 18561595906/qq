package com.haier.hop.ms.legcontract.dto;

/**
 * <p>
 * 	内部合同 合同类型、金额信息
 * </p>
 *
 * @author liugan
 * @since 2019-10-24
 */
public class LegTypeAmountDto {
	
	/**
	 * 合同类型
	 */
	private String contractType;
	
	/**
	 * 交易项目
	 */	
	private String transaction;
	
	/**
	 * 对方业务人
	 */
	private String adverseUser;
	
	/**
	 * 剩余额度/总额度
	 */
	private String amount;

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getTransaction() {
		return transaction;
	}

	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}

	public String getAdverseUser() {
		return adverseUser;
	}

	public void setAdverseUser(String adverseUser) {
		this.adverseUser = adverseUser;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
}
