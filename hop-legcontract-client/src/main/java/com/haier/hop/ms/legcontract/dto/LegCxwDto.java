package com.haier.hop.ms.legcontract.dto;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-12-18
 */
public class LegCxwDto {

	/**
	 * 渠道类型
	 */
	private String channelType;

	/**
	 * 网点名称
	 */
	private String serviceName;

	/**
	 * 中心名称
	 */
	private String branchName;

	/**
	 * V码
	 */
	private String vcode;
	
	/**
	 *	状态
	 */
	private String isUsed;

	public String getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(String isUsed) {
		this.isUsed = isUsed;
	}

	public String getChannelType() {
		return channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getVcode() {
		return vcode;
	}

	public void setVcode(String vcode) {
		this.vcode = vcode;
	}

}
