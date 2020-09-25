package com.haier.hop.ms.legcontract.dto;

/**
 * <p>
 * 查询印章信息
 * </p>
 *
 * @author shiyingxin
 * @since 2019-10-09
 */
public class LegSealSelectDto {

	/**
	 * 印章编号
	 */
	private String sealNo;

	/**
	 * 印章名称
	 */
	private String sealName;

	/**
	 * 印章类别
	 */
	private String sealTypeName;

	/**
	 * 担保限制1:担保无效;2:借款担保无效;3:无
	 */
	private String restrLimit;

	/**
	 * 签约限制
	 */
	private String signedLimit;

	/**
	 * 是否有电子印章
	 */
	private String isElectronicSeal;

	/**
	 * 管理人
	 */
	private String manageUser;

	/**
	 * 管理人编号
	 */
	private String manageUserno;

	/**
	 * 公司编码
	 */
	private String sealCompano;

	/**
	 * 系统编码
	 */
	private String sysId;

	private Integer SizeFrist;

	private Integer SizeLast;

	public String getSealNo() {
		return sealNo;
	}

	public void setSealNo(String sealNo) {
		this.sealNo = sealNo;
	}

	public String getSealName() {
		return sealName;
	}

	public void setSealName(String sealName) {
		this.sealName = sealName;
	}

	public String getSealTypeName() {
		return sealTypeName;
	}

	public void setSealTypeName(String sealTypeName) {
		this.sealTypeName = sealTypeName;
	}

	public String getRestrLimit() {
		return restrLimit;
	}

	public void setRestrLimit(String restrLimit) {
		this.restrLimit = restrLimit;
	}

	public String getSignedLimit() {
		return signedLimit;
	}

	public void setSignedLimit(String signedLimit) {
		this.signedLimit = signedLimit;
	}

	public String getIsElectronicSeal() {
		return isElectronicSeal;
	}

	public void setIsElectronicSeal(String isElectronicSeal) {
		this.isElectronicSeal = isElectronicSeal;
	}

	public String getManageUser() {
		return manageUser;
	}

	public void setManageUser(String manageUser) {
		this.manageUser = manageUser;
	}

	public String getManageUserno() {
		return manageUserno;
	}

	public void setManageUserno(String manageUserno) {
		this.manageUserno = manageUserno;
	}

	public String getSealCompano() {
		return sealCompano;
	}

	public void setSealCompano(String sealCompano) {
		this.sealCompano = sealCompano;
	}

	public String getSysId() {
		return sysId;
	}

	public void setSysId(String sysId) {
		this.sysId = sysId;
	}

	public Integer getSizeFrist() {
		return SizeFrist;
	}

	public void setSizeFrist(Integer sizeFrist) {
		SizeFrist = sizeFrist;
	}

	public Integer getSizeLast() {
		return SizeLast;
	}

	public void setSizeLast(Integer sizeLast) {
		SizeLast = sizeLast;
	}

}
