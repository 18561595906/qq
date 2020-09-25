package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 该表后的印章管理--暂存临时表
 * </p>
 *
 * @author xuejinxin
 * @since 2019-09-29
 */
@TableName("leg_seal_tmp")
public class LegSealTmp extends Model<LegSealTmp> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 申请表ID
	 */
	@TableField("APPLY_ID")
	private String applyId;
	/**
	 * 印章归属公司编号
	 */
	@TableField("SEAL_COMPANO")
	private String sealCompano;
	/**
	 * 印章归属公司
	 */
	@TableField("SEAL_COMP")
	private String sealComp;
	/**
	 * 印章编号
	 */
	@TableField("SEAL_NO")
	private String sealNo;
	/**
	 * 申请刻章类型ID
	 */
	@TableField("SEAL_TYPE_ID")
	private Integer sealTypeId;
	/**
	 * 刻制材料
	 */
	@TableField("MAKE_MATE")
	private String makeMate;
	/**
	 * 印章名称
	 */
	@TableField("SEAL_NAME")
	private String sealName;
	/**
	 * 担保限制
	 */
	@TableField("RESTR_LIMIT")
	private String restrLimit;
	/**
	 * 签约限制
	 */
	@TableField("SIGNED_LIMIT")
	private String signedLimit;
	/**
	 * 结算状态
	 */
	@TableField("SETTL_FLAG")
	private BigDecimal settlFlag;
	/**
	 * 印模
	 */
	@TableField("MOULD")
	private String mould;
	/**
	 * 申请人
	 */
	@TableField("APPLY_USER")
	private String applyUser;
	/**
	 * 申请人编号
	 */
	@TableField("APPLY_USERNO")
	private String applyUserno;
	/**
	 * 申请人电话
	 */
	@TableField("APPLY_TEL")
	private String applyTel;
	/**
	 * 申请人邮箱
	 */
	@TableField("APPLY_EMAIL")
	private String applyEmail;
	/**
	 * 领取人
	 */
	@TableField("RECEIVE_USER")
	private String receiveUser;
	/**
	 * 领取人编号
	 */
	@TableField("RECEIVE_USERNO")
	private String receiveUserno;
	/**
	 * 领取人电话
	 */
	@TableField("RECEIVE_TEL")
	private String receiveTel;
	/**
	 * 领取人邮箱
	 */
	@TableField("RECEIVE_EMAIL")
	private String receiveEmail;
	/**
	 * 管理人
	 */
	@TableField("MANAGE_USER")
	private String manageUser;
	/**
	 * 管理人编号
	 */
	@TableField("MANAGE_USERNO")
	private String manageUserno;
	/**
	 * 管理人电话
	 */
	@TableField("MANAGE_TEL")
	private String manageTel;
	/**
	 * 管理人邮箱
	 */
	@TableField("MANAGE_EMAIL")
	private String manageEmail;
	/**
	 * 管理员类型（0：内部1：外部）
	 */
	@TableField("MANAGE_TYPE")
	private Integer manageType;
	/**
	 * 法务交接人
	 */
	@TableField("HAND_USER")
	private String handUser;
	/**
	 * 交接人编号
	 */
	@TableField("HAND_USERNO")
	private String handUserno;
	/**
	 * 交接人电话
	 */
	@TableField("HAND_TEL")
	private String handTel;
	/**
	 * 交接人邮箱
	 */
	@TableField("HAND_EMAIL")
	private String handEmail;
	/**
	 * 印章状态: 00: 撤销中 99：已撤销;变更的销毁中：25
	 */
	@TableField("SEAL_FLAG")
	private BigDecimal sealFlag;
	/**
	 * 交接状态 1:法务交接;2:领取人交接;3:管理人交接;
	 */
	@TableField("HAND_FLAG")
	private BigDecimal handFlag;
	/**
	 * 申请时间
	 */
	@TableField("APPLY_DATE")
	private Date applyDate;
	/**
	 * 交接时间
	 */
	@TableField("EFFECT_DATE")
	private Date effectDate;
	/**
	 * 管理时间
	 */
	@TableField("MANAGE_DATE")
	private Date manageDate;
	/**
	 * 结算时间
	 */
	@TableField("SETTL_DATE")
	private Date settlDate;
	/**
	 * 停用时间
	 */
	@TableField("DISABLE_DATE")
	private Date disableDate;
	/**
	 * 存档时间
	 */
	@TableField("FILE_DATE")
	private Date fileDate;
	/**
	 * 销毁时间
	 */
	@TableField("DESTORY_DATE")
	private Date destoryDate;
	/**
	 * 印章类型描述
	 */
	@TableField("SEAL_TYPE")
	private String sealType;
	/**
	 * 印章保管地
	 */
	@TableField("SEAL_SAFE")
	private String sealSafe;
	/**
	 * 历史或者正式公司ID
	 */
	@TableField("SEAL_COMPAID")
	private String sealCompaid;
	/**
	 * 印章英文名
	 */
	@TableField("SEAL_NAME_ENG")
	private String sealNameEng;
	/**
	 * 印章失效时间
	 */
	@TableField("SEAL_TIME_OUT")
	private String sealTimeOut;
	/**
	 * 过期印章是否发送过邮件
	 */
	@TableField("SEAL_STATUS")
	private String sealStatus;
	/**
	 * 纳税人识别号
	 */
	@TableField("TAX_NO")
	private String taxNo;
	/**
	 * 业务板块
	 */
	@TableField("COMPANY_TYPE")
	private String companyType;
	/**
	 * 模块
	 */
	@TableField("BU_FU")
	private String buFu;
	/**
	 * 发票专用章纳税人识别号
	 */
	@TableField("FPTAX_NO")
	private String fptaxNo;
	/**
	 * 法人名称
	 */
	@TableField("LEGAL_PERSON")
	private String legalPerson;
	/**
	 * 印章英文名称
	 */
	@TableField("SEAL_NAME_EN")
	private String sealNameEn;
	/**
	 * 发票地址
	 */
	@TableField("FP_ADDRESS")
	private String fpAddress;
	/**
	 * 发票电话
	 */
	@TableField("FP_PHONE")
	private String fpPhone;
	/**
	 * 开户行
	 */
	@TableField("FP_BANK")
	private String fpBank;
	/**
	 * 账号
	 */
	@TableField("FP_NUMBER")
	private String fpNumber;
	/**
	 * 印章价格
	 */
	@TableField("SEAL_PRICE")
	private BigDecimal sealPrice;
	/**
	 * 是否加急 0：不加急，1：加急
	 */
	@TableField("URGENT_STATUS")
	private BigDecimal urgentStatus;
	/**
	 * 刻制方式 0：法务刻制 ，1：公安刻制
	 */
	@TableField("ENGRAVED_TYPE")
	private BigDecimal engravedType;
	/**
	 * 流程ID--公司印章融合专用
	 */
	@TableField("PROCESS_ID")
	private String processId;
	/**
	 * 流程ID--公司注销
	 */
	@TableField("PROC_ID_COMP_CANCLE")
	private String procIdCompCancle;
	/**
	 * 流程ID--印章逆向流程
	 */
	@TableField("PROCESS_ID_BACK")
	private String processIdBack;
	@TableField("PROC_ID_DESTROY")
	private String procIdDestroy;
	/**
	 * 对接公安申请编号
	 */
	@TableField("APPLY_NUMBER")
	private String applyNumber;
	/**
	 * 印章生效时间
	 */
	@TableField("SEAL_TIME_IN")
	private String sealTimeIn;
	/**
	 * 负责人电话
	 */
	@TableField("RESPONSIBLE_TEL")
	private String responsibleTel;
	/**
	 * 负责人邮箱
	 */
	@TableField("RESPONSIBLE_EMAIL")
	private String responsibleEmail;
	/**
	 * 负责人编号
	 */
	@TableField("RESPONSIBLE_USERNO")
	private String responsibleUserno;
	/**
	 * 负责人
	 */
	@TableField("RESPONSIBLE_USER")
	private String responsibleUser;
	/**
	 * 刻章状态
	 */
	@TableField("MAKE_STATUS")
	private String makeStatus;
	/**
	 * 领取人身份证号
	 */
	@TableField("RECEIVE_USERIDNO")
	private String receiveUseridno;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getApplyId() {
		return applyId;
	}

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getSealCompano() {
		return sealCompano;
	}

	public void setSealCompano(String sealCompano) {
		this.sealCompano = sealCompano;
	}

	public String getSealComp() {
		return sealComp;
	}

	public void setSealComp(String sealComp) {
		this.sealComp = sealComp;
	}

	public String getSealNo() {
		return sealNo;
	}

	public void setSealNo(String sealNo) {
		this.sealNo = sealNo;
	}

	public Integer getSealTypeId() {
		return sealTypeId;
	}

	public void setSealTypeId(Integer sealTypeId) {
		this.sealTypeId = sealTypeId;
	}

	public String getMakeMate() {
		return makeMate;
	}

	public void setMakeMate(String makeMate) {
		this.makeMate = makeMate;
	}

	public String getSealName() {
		return sealName;
	}

	public void setSealName(String sealName) {
		this.sealName = sealName;
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

	public BigDecimal getSettlFlag() {
		return settlFlag;
	}

	public void setSettlFlag(BigDecimal settlFlag) {
		this.settlFlag = settlFlag;
	}

	public String getMould() {
		return mould;
	}

	public void setMould(String mould) {
		this.mould = mould;
	}

	public String getApplyUser() {
		return applyUser;
	}

	public void setApplyUser(String applyUser) {
		this.applyUser = applyUser;
	}

	public String getApplyUserno() {
		return applyUserno;
	}

	public void setApplyUserno(String applyUserno) {
		this.applyUserno = applyUserno;
	}

	public String getApplyTel() {
		return applyTel;
	}

	public void setApplyTel(String applyTel) {
		this.applyTel = applyTel;
	}

	public String getApplyEmail() {
		return applyEmail;
	}

	public void setApplyEmail(String applyEmail) {
		this.applyEmail = applyEmail;
	}

	public String getReceiveUser() {
		return receiveUser;
	}

	public void setReceiveUser(String receiveUser) {
		this.receiveUser = receiveUser;
	}

	public String getReceiveUserno() {
		return receiveUserno;
	}

	public void setReceiveUserno(String receiveUserno) {
		this.receiveUserno = receiveUserno;
	}

	public String getReceiveTel() {
		return receiveTel;
	}

	public void setReceiveTel(String receiveTel) {
		this.receiveTel = receiveTel;
	}

	public String getReceiveEmail() {
		return receiveEmail;
	}

	public void setReceiveEmail(String receiveEmail) {
		this.receiveEmail = receiveEmail;
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

	public String getManageTel() {
		return manageTel;
	}

	public void setManageTel(String manageTel) {
		this.manageTel = manageTel;
	}

	public String getManageEmail() {
		return manageEmail;
	}

	public void setManageEmail(String manageEmail) {
		this.manageEmail = manageEmail;
	}

	public Integer getManageType() {
		return manageType;
	}

	public void setManageType(Integer manageType) {
		this.manageType = manageType;
	}

	public String getHandUser() {
		return handUser;
	}

	public void setHandUser(String handUser) {
		this.handUser = handUser;
	}

	public String getHandUserno() {
		return handUserno;
	}

	public void setHandUserno(String handUserno) {
		this.handUserno = handUserno;
	}

	public String getHandTel() {
		return handTel;
	}

	public void setHandTel(String handTel) {
		this.handTel = handTel;
	}

	public String getHandEmail() {
		return handEmail;
	}

	public void setHandEmail(String handEmail) {
		this.handEmail = handEmail;
	}

	public BigDecimal getSealFlag() {
		return sealFlag;
	}

	public void setSealFlag(BigDecimal sealFlag) {
		this.sealFlag = sealFlag;
	}

	public BigDecimal getHandFlag() {
		return handFlag;
	}

	public void setHandFlag(BigDecimal handFlag) {
		this.handFlag = handFlag;
	}

	public Date getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public Date getEffectDate() {
		return effectDate;
	}

	public void setEffectDate(Date effectDate) {
		this.effectDate = effectDate;
	}

	public Date getManageDate() {
		return manageDate;
	}

	public void setManageDate(Date manageDate) {
		this.manageDate = manageDate;
	}

	public Date getSettlDate() {
		return settlDate;
	}

	public void setSettlDate(Date settlDate) {
		this.settlDate = settlDate;
	}

	public Date getDisableDate() {
		return disableDate;
	}

	public void setDisableDate(Date disableDate) {
		this.disableDate = disableDate;
	}

	public Date getFileDate() {
		return fileDate;
	}

	public void setFileDate(Date fileDate) {
		this.fileDate = fileDate;
	}

	public Date getDestoryDate() {
		return destoryDate;
	}

	public void setDestoryDate(Date destoryDate) {
		this.destoryDate = destoryDate;
	}

	public String getSealType() {
		return sealType;
	}

	public void setSealType(String sealType) {
		this.sealType = sealType;
	}

	public String getSealSafe() {
		return sealSafe;
	}

	public void setSealSafe(String sealSafe) {
		this.sealSafe = sealSafe;
	}

	public String getSealCompaid() {
		return sealCompaid;
	}

	public void setSealCompaid(String sealCompaid) {
		this.sealCompaid = sealCompaid;
	}

	public String getSealNameEng() {
		return sealNameEng;
	}

	public void setSealNameEng(String sealNameEng) {
		this.sealNameEng = sealNameEng;
	}

	public String getSealTimeOut() {
		return sealTimeOut;
	}

	public void setSealTimeOut(String sealTimeOut) {
		this.sealTimeOut = sealTimeOut;
	}

	public String getSealStatus() {
		return sealStatus;
	}

	public void setSealStatus(String sealStatus) {
		this.sealStatus = sealStatus;
	}

	public String getTaxNo() {
		return taxNo;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getBuFu() {
		return buFu;
	}

	public void setBuFu(String buFu) {
		this.buFu = buFu;
	}

	public String getFptaxNo() {
		return fptaxNo;
	}

	public void setFptaxNo(String fptaxNo) {
		this.fptaxNo = fptaxNo;
	}

	public String getLegalPerson() {
		return legalPerson;
	}

	public void setLegalPerson(String legalPerson) {
		this.legalPerson = legalPerson;
	}

	public String getSealNameEn() {
		return sealNameEn;
	}

	public void setSealNameEn(String sealNameEn) {
		this.sealNameEn = sealNameEn;
	}

	public String getFpAddress() {
		return fpAddress;
	}

	public void setFpAddress(String fpAddress) {
		this.fpAddress = fpAddress;
	}

	public String getFpPhone() {
		return fpPhone;
	}

	public void setFpPhone(String fpPhone) {
		this.fpPhone = fpPhone;
	}

	public String getFpBank() {
		return fpBank;
	}

	public void setFpBank(String fpBank) {
		this.fpBank = fpBank;
	}

	public String getFpNumber() {
		return fpNumber;
	}

	public void setFpNumber(String fpNumber) {
		this.fpNumber = fpNumber;
	}

	public BigDecimal getSealPrice() {
		return sealPrice;
	}

	public void setSealPrice(BigDecimal sealPrice) {
		this.sealPrice = sealPrice;
	}

	public BigDecimal getUrgentStatus() {
		return urgentStatus;
	}

	public void setUrgentStatus(BigDecimal urgentStatus) {
		this.urgentStatus = urgentStatus;
	}

	public BigDecimal getEngravedType() {
		return engravedType;
	}

	public void setEngravedType(BigDecimal engravedType) {
		this.engravedType = engravedType;
	}

	public String getProcessId() {
		return processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public String getProcIdCompCancle() {
		return procIdCompCancle;
	}

	public void setProcIdCompCancle(String procIdCompCancle) {
		this.procIdCompCancle = procIdCompCancle;
	}

	public String getProcessIdBack() {
		return processIdBack;
	}

	public void setProcessIdBack(String processIdBack) {
		this.processIdBack = processIdBack;
	}

	public String getProcIdDestroy() {
		return procIdDestroy;
	}

	public void setProcIdDestroy(String procIdDestroy) {
		this.procIdDestroy = procIdDestroy;
	}

	public String getApplyNumber() {
		return applyNumber;
	}

	public void setApplyNumber(String applyNumber) {
		this.applyNumber = applyNumber;
	}

	public String getSealTimeIn() {
		return sealTimeIn;
	}

	public void setSealTimeIn(String sealTimeIn) {
		this.sealTimeIn = sealTimeIn;
	}

	public String getResponsibleTel() {
		return responsibleTel;
	}

	public void setResponsibleTel(String responsibleTel) {
		this.responsibleTel = responsibleTel;
	}

	public String getResponsibleEmail() {
		return responsibleEmail;
	}

	public void setResponsibleEmail(String responsibleEmail) {
		this.responsibleEmail = responsibleEmail;
	}

	public String getResponsibleUserno() {
		return responsibleUserno;
	}

	public void setResponsibleUserno(String responsibleUserno) {
		this.responsibleUserno = responsibleUserno;
	}

	public String getResponsibleUser() {
		return responsibleUser;
	}

	public void setResponsibleUser(String responsibleUser) {
		this.responsibleUser = responsibleUser;
	}

	public String getMakeStatus() {
		return makeStatus;
	}

	public void setMakeStatus(String makeStatus) {
		this.makeStatus = makeStatus;
	}

	public String getReceiveUseridno() {
		return receiveUseridno;
	}

	public void setReceiveUseridno(String receiveUseridno) {
		this.receiveUseridno = receiveUseridno;
	}

	@Override
	protected Serializable pkVal() {
		return this.rowId;
	}

	@Override
	public String toString() {
		return "LegSealTmp{" + "rowId=" + rowId + ", applyId=" + applyId + ", sealCompano=" + sealCompano
				+ ", sealComp=" + sealComp + ", sealNo=" + sealNo + ", sealTypeId=" + sealTypeId + ", makeMate="
				+ makeMate + ", sealName=" + sealName + ", restrLimit=" + restrLimit + ", signedLimit=" + signedLimit
				+ ", settlFlag=" + settlFlag + ", mould=" + mould + ", applyUser=" + applyUser + ", applyUserno="
				+ applyUserno + ", applyTel=" + applyTel + ", applyEmail=" + applyEmail + ", receiveUser=" + receiveUser
				+ ", receiveUserno=" + receiveUserno + ", receiveTel=" + receiveTel + ", receiveEmail=" + receiveEmail
				+ ", manageUser=" + manageUser + ", manageUserno=" + manageUserno + ", manageTel=" + manageTel
				+ ", manageEmail=" + manageEmail + ", manageType=" + manageType + ", handUser=" + handUser
				+ ", handUserno=" + handUserno + ", handTel=" + handTel + ", handEmail=" + handEmail + ", sealFlag="
				+ sealFlag + ", handFlag=" + handFlag + ", applyDate=" + applyDate + ", effectDate=" + effectDate
				+ ", manageDate=" + manageDate + ", settlDate=" + settlDate + ", disableDate=" + disableDate
				+ ", fileDate=" + fileDate + ", destoryDate=" + destoryDate + ", sealType=" + sealType + ", sealSafe="
				+ sealSafe + ", sealCompaid=" + sealCompaid + ", sealNameEng=" + sealNameEng + ", sealTimeOut="
				+ sealTimeOut + ", sealStatus=" + sealStatus + ", taxNo=" + taxNo + ", companyType=" + companyType
				+ ", buFu=" + buFu + ", fptaxNo=" + fptaxNo + ", legalPerson=" + legalPerson + ", sealNameEn="
				+ sealNameEn + ", fpAddress=" + fpAddress + ", fpPhone=" + fpPhone + ", fpBank=" + fpBank
				+ ", fpNumber=" + fpNumber + ", sealPrice=" + sealPrice + ", urgentStatus=" + urgentStatus
				+ ", engravedType=" + engravedType + ", processId=" + processId + ", procIdCompCancle="
				+ procIdCompCancle + ", processIdBack=" + processIdBack + ", procIdDestroy=" + procIdDestroy
				+ ", applyNumber=" + applyNumber + ", sealTimeIn=" + sealTimeIn + ", responsibleTel=" + responsibleTel
				+ ", responsibleEmail=" + responsibleEmail + ", responsibleUserno=" + responsibleUserno
				+ ", responsibleUser=" + responsibleUser + ", makeStatus=" + makeStatus + ", receiveUseridno="
				+ receiveUseridno + "}";
	}
}
