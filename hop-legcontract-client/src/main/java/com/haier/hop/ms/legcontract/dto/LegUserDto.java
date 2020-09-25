package com.haier.hop.ms.legcontract.dto;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-17
 */
public class LegUserDto {

	/**
	 * 用户账号
	 */
	private String userNo;

	/**
	 * 用户名称
	 */
	private String userName;

	/**
	 * 用户邮箱
	 */
	private String userEmail;

	/**
	 * 用户电话
	 */
	private String userPhone;

	/**
	 * 平台长
	 */
	private String ptzName;

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getPtzName() {
		return ptzName;
	}

	public void setPtzName(String ptzName) {
		this.ptzName = ptzName;
	}

}
