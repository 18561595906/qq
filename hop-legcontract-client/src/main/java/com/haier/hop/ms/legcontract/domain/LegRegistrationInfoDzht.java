package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 用户注册信息表
 * </p>
 *
 * @author shiyingxin
 * @since 2019-07-09
 */
@TableName("leg_registration_info_dzht")
public class LegRegistrationInfoDzht extends Model<LegRegistrationInfoDzht> {

	private static final long serialVersionUID = 1L;

	/**
	 * 表主键
	 */
	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 供应商V码
	 */
	@TableField("COMPANY_V_CODE")
	private String companyVCode;
	/**
	 * 公司名称
	 */
	@TableField("COMPANY_NAME")
	private String companyName;
	/**
	 * 三证合一编号
	 */
	@TableField("CERTIFICATES_NUM")
	private String certificatesNum;
	/**
	 * 企业邮箱
	 */
	@TableField("COMPANY_EMAIL")
	private String companyEmail;
	/**
	 * 公司注册地址
	 */
	@TableField("COMPANY_ADDR")
	private String companyAddr;
	/**
	 * 供应商电话
	 */
	@TableField("COMPANY_TEL")
	private String companyTel;
	/**
	 * 银行卡
	 */
	@TableField("BANK_CARD")
	private String bankCard;
	/**
	 * 海尔经办人姓名
	 */
	@TableField("HAIER_HANDLER_NAME")
	private String haierHandlerName;
	/**
	 * 海尔经办人工号
	 */
	@TableField("HAIER_HANDLER_CODE")
	private String haierHandlerCode;
	/**
	 * 公司授权书
	 */
	@TableField("COMPANY_COA")
	private String companyCoa;
	/**
	 * 手机号
	 */
	@TableField("PHONE_NUM")
	private String phoneNum;
	/**
	 * 签约专用手机号
	 */
	@TableField("SEAL_PHONE")
	private String sealPhone;
	/**
	 * 业务单元名称
	 */
	@TableField("BUSI_CODE")
	private String busiCode;
	/**
	 * 业务单元名称
	 */
	@TableField("BUSI_NAME")
	private String busiName;
	/**
	 * 姓名
	 */
	@TableField("NAME")
	private String name;
	/**
	 * 身份证
	 */
	@TableField("ID_CARD")
	private String idCard;
	/**
	 * 身份证扫描件
	 */
	@TableField("ID_CARD_PIC")
	private String idCardPic;
	/**
	 * 个人授权书
	 */
	@TableField("PERSONAL_COA")
	private String personalCoa;
	/**
	 * 登录密码
	 */
	@TableField("PASSWORD")
	private String password;
	/**
	 * 临时登录密码
	 */
	@TableField("TMP_PSW")
	private String tmpPsw;
	/**
	 * 企业CA证书编号
	 */
	@TableField("CA_NO")
	private String caNo;
	/**
	 * 印章编号
	 */
	@TableField("SEAL_NO")
	private String sealNo;
	/**
	 * 是否海尔供应商
	 */
	@TableField("IS_INNER")
	private String isInner;
	/**
	 * 录表时间
	 */
	@TableField("CRT_TIME")
	private Date crtTime;
	/**
	 * 最后修改时间
	 */
	@TableField("LST_UPD_TIME")
	private Date lstUpdTime;
	/**
	 * 营业执照扫描件
	 */
	@TableField("BIZ_LICENSE_PIC")
	private String bizLicensePic;
	/**
	 * 从HUC获取的用户唯一ID
	 */
	@TableField("USER_ID")
	private String userId;
	/**
	 * 判断审核状态标示，0：未审核，1：审核通过
	 */
	@TableField("APPROVE_FLAG")
	private String approveFlag;
	/**
	 * HUC测的注册用户名
	 */
	@TableField("HUC_USER_NAME")
	private String hucUserName;
	@TableField("FROM_SYS")
	private String fromSys;
	/**
	 * 法大大验真状态标识，10：已提交待审核，11：-已审核待打款，12：已打款待审核，2：认证成功，3：认证失败
	 */
	@TableField("FDD_APPROVE_FLAG")
	private String fddApproveFlag;
	/**
	 * 银行名称
	 */
	@TableField("BANK_NAME")
	private String bankName;
	/**
	 * 银行账号
	 */
	@TableField("BANK_ID")
	private String bankId;
	/**
	 * 开户支行
	 */
	@TableField("SUBBRANCH_NAME")
	private String subbranchName;
	/**
	 * 开户支行所在省
	 */
	@TableField("SUBBRANCH_PROVINCE")
	private String subbranchProvince;
	/**
	 * 开户支行所在市
	 */
	@TableField("SUBBRANCH_CITY")
	private String subbranchCity;
	/**
	 * 法定代表人姓名
	 */
	@TableField("LEGAL_NAME")
	private String legalName;
	/**
	 * 法定代表人身份证件号
	 */
	@TableField("LEGAL_ID")
	private String legalId;
	/**
	 * 法定代表人手机号
	 */
	@TableField("LEGAL_MOBILE")
	private String legalMobile;
	/**
	 * 法定代表人身份证扫描件
	 */
	@TableField("LEGAL_ID_IMAGE")
	private String legalIdImage;
	/**
	 * 闸口标识，0：海尔审核，1：法大大验真
	 */
	@TableField("CHECK_FLAG")
	private String checkFlag;
	/**
	 * 法大大打款时间
	 */
	@TableField("PAYMONEYTIME")
	private String paymoneytime;
	/**
	 * 法大大驳回原因
	 */
	@TableField("FDD_REMARK")
	private String fddRemark;
	/**
	 * 法人手持证件照片
	 */
	@TableField("LEGAL_HAND_IMAGE")
	private String legalHandImage;
	/**
	 * 支付交易号
	 */
	@TableField("TRANSACTION_ID")
	private String transactionId;
	/**
	 * 交易状态 0代表"未支付" 1代表"已支付" -1代表"已取消"
	 */
	@TableField("TRADE_STATUS")
	private String tradeStatus;
	/**
	 * 平台用户标识
	 */
	@TableField("OPEN_ID")
	private String openId;
	/**
	 * 支付金额
	 */
	@TableField("AMOUNT")
	private String amount;
	/**
	 * 支付时间
	 */
	@TableField("PAY_END_TIME")
	private String payEndTime;
	/**
	 * 0:来自其它系统 1:来自leg
	 */
	@TableField("SYS_NO")
	private String sysNo;
	// 非表字段（0:删除 1：追加）
	@TableField(exist = false)
	private String deleteFlg;

	public String getRowId() {
		return rowId;
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getCompanyVCode() {
		return companyVCode;
	}

	public void setCompanyVCode(String companyVCode) {
		this.companyVCode = companyVCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCertificatesNum() {
		return certificatesNum;
	}

	public void setCertificatesNum(String certificatesNum) {
		this.certificatesNum = certificatesNum;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public String getCompanyAddr() {
		return companyAddr;
	}

	public void setCompanyAddr(String companyAddr) {
		this.companyAddr = companyAddr;
	}

	public String getCompanyTel() {
		return companyTel;
	}

	public void setCompanyTel(String companyTel) {
		this.companyTel = companyTel;
	}

	public String getBankCard() {
		return bankCard;
	}

	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}

	public String getHaierHandlerName() {
		return haierHandlerName;
	}

	public void setHaierHandlerName(String haierHandlerName) {
		this.haierHandlerName = haierHandlerName;
	}

	public String getHaierHandlerCode() {
		return haierHandlerCode;
	}

	public void setHaierHandlerCode(String haierHandlerCode) {
		this.haierHandlerCode = haierHandlerCode;
	}

	public String getCompanyCoa() {
		return companyCoa;
	}

	public void setCompanyCoa(String companyCoa) {
		this.companyCoa = companyCoa;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getSealPhone() {
		return sealPhone;
	}

	public void setSealPhone(String sealPhone) {
		this.sealPhone = sealPhone;
	}

	public String getBusiCode() {
		return busiCode;
	}

	public void setBusiCode(String busiCode) {
		this.busiCode = busiCode;
	}

	public String getBusiName() {
		return busiName;
	}

	public void setBusiName(String busiName) {
		this.busiName = busiName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getIdCardPic() {
		return idCardPic;
	}

	public void setIdCardPic(String idCardPic) {
		this.idCardPic = idCardPic;
	}

	public String getPersonalCoa() {
		return personalCoa;
	}

	public void setPersonalCoa(String personalCoa) {
		this.personalCoa = personalCoa;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTmpPsw() {
		return tmpPsw;
	}

	public void setTmpPsw(String tmpPsw) {
		this.tmpPsw = tmpPsw;
	}

	public String getCaNo() {
		return caNo;
	}

	public void setCaNo(String caNo) {
		this.caNo = caNo;
	}

	public String getSealNo() {
		return sealNo;
	}

	public void setSealNo(String sealNo) {
		this.sealNo = sealNo;
	}

	public String getIsInner() {
		return isInner;
	}

	public void setIsInner(String isInner) {
		this.isInner = isInner;
	}

	public Date getCrtTime() {
		return crtTime;
	}

	public void setCrtTime(Date crtTime) {
		this.crtTime = crtTime;
	}

	public Date getLstUpdTime() {
		return lstUpdTime;
	}

	public void setLstUpdTime(Date lstUpdTime) {
		this.lstUpdTime = lstUpdTime;
	}

	public String getBizLicensePic() {
		return bizLicensePic;
	}

	public void setBizLicensePic(String bizLicensePic) {
		this.bizLicensePic = bizLicensePic;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getApproveFlag() {
		return approveFlag;
	}

	public void setApproveFlag(String approveFlag) {
		this.approveFlag = approveFlag;
	}

	public String getHucUserName() {
		return hucUserName;
	}

	public void setHucUserName(String hucUserName) {
		this.hucUserName = hucUserName;
	}

	public String getFromSys() {
		return fromSys;
	}

	public void setFromSys(String fromSys) {
		this.fromSys = fromSys;
	}

	public String getFddApproveFlag() {
		return fddApproveFlag;
	}

	public void setFddApproveFlag(String fddApproveFlag) {
		this.fddApproveFlag = fddApproveFlag;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getSubbranchName() {
		return subbranchName;
	}

	public void setSubbranchName(String subbranchName) {
		this.subbranchName = subbranchName;
	}

	public String getSubbranchProvince() {
		return subbranchProvince;
	}

	public void setSubbranchProvince(String subbranchProvince) {
		this.subbranchProvince = subbranchProvince;
	}

	public String getSubbranchCity() {
		return subbranchCity;
	}

	public void setSubbranchCity(String subbranchCity) {
		this.subbranchCity = subbranchCity;
	}

	public String getLegalName() {
		return legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getLegalId() {
		return legalId;
	}

	public void setLegalId(String legalId) {
		this.legalId = legalId;
	}

	public String getLegalMobile() {
		return legalMobile;
	}

	public void setLegalMobile(String legalMobile) {
		this.legalMobile = legalMobile;
	}

	public String getLegalIdImage() {
		return legalIdImage;
	}

	public void setLegalIdImage(String legalIdImage) {
		this.legalIdImage = legalIdImage;
	}

	public String getCheckFlag() {
		return checkFlag;
	}

	public void setCheckFlag(String checkFlag) {
		this.checkFlag = checkFlag;
	}

	public String getPaymoneytime() {
		return paymoneytime;
	}

	public void setPaymoneytime(String paymoneytime) {
		this.paymoneytime = paymoneytime;
	}

	public String getFddRemark() {
		return fddRemark;
	}

	public void setFddRemark(String fddRemark) {
		this.fddRemark = fddRemark;
	}

	public String getLegalHandImage() {
		return legalHandImage;
	}

	public void setLegalHandImage(String legalHandImage) {
		this.legalHandImage = legalHandImage;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getTradeStatus() {
		return tradeStatus;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPayEndTime() {
		return payEndTime;
	}

	public void setPayEndTime(String payEndTime) {
		this.payEndTime = payEndTime;
	}

	public String getSysNo() {
		return sysNo;
	}

	public void setSysNo(String sysNo) {
		this.sysNo = sysNo;
	}

	@Override
	protected Serializable pkVal() {
		return this.rowId;
	}

	@Override
	public String toString() {
		return "LegRegistrationInfoDzht{" + "rowId=" + rowId + ", companyVCode=" + companyVCode + ", companyName="
				+ companyName + ", certificatesNum=" + certificatesNum + ", companyEmail=" + companyEmail
				+ ", companyAddr=" + companyAddr + ", companyTel=" + companyTel + ", bankCard=" + bankCard
				+ ", haierHandlerName=" + haierHandlerName + ", haierHandlerCode=" + haierHandlerCode + ", companyCoa="
				+ companyCoa + ", phoneNum=" + phoneNum + ", sealPhone=" + sealPhone + ", busiCode=" + busiCode
				+ ", busiName=" + busiName + ", name=" + name + ", idCard=" + idCard + ", idCardPic=" + idCardPic
				+ ", personalCoa=" + personalCoa + ", password=" + password + ", tmpPsw=" + tmpPsw + ", caNo=" + caNo
				+ ", sealNo=" + sealNo + ", isInner=" + isInner + ", crtTime=" + crtTime + ", lstUpdTime=" + lstUpdTime
				+ ", bizLicensePic=" + bizLicensePic + ", userId=" + userId + ", approveFlag=" + approveFlag
				+ ", hucUserName=" + hucUserName + ", fromSys=" + fromSys + ", fddApproveFlag=" + fddApproveFlag
				+ ", bankName=" + bankName + ", bankId=" + bankId + ", subbranchName=" + subbranchName
				+ ", subbranchProvince=" + subbranchProvince + ", subbranchCity=" + subbranchCity + ", legalName="
				+ legalName + ", legalId=" + legalId + ", legalMobile=" + legalMobile + ", legalIdImage=" + legalIdImage
				+ ", checkFlag=" + checkFlag + ", paymoneytime=" + paymoneytime + ", fddRemark=" + fddRemark
				+ ", legalHandImage=" + legalHandImage + ", transactionId=" + transactionId + ", tradeStatus="
				+ tradeStatus + ", openId=" + openId + ", amount=" + amount + ", payEndTime=" + payEndTime + ", sysNo="
				+ sysNo + "}";
	}
}
