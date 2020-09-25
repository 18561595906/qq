package com.haier.hop.ms.legcontract.dto;

import java.util.List;
import java.util.Map;

import com.haier.hop.ms.legcontract.domain.*;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-17
 */
public class LegContractTmpDto {

	/**
	 * 合同信息
	 */
	private LegContractTmp contractTmpInfo;

	/**
	 * 币种中文
	 */
	private String currencyZh;

	/**
	 * 用户信息
	 */
	private LegUserDto userDto;

	/**
	 * 签约方id
	 */
	private String compaNo;

	/**
	 * 签约方信息
	 */
	private List<LegContractPartner> contractPartnerInfoList;

	/**
	 * 印章信息
	 */
	private List<LegSeal> sealInfo;

//	/**
//	 * 付款方式信息
//	 */
//	private List<LegContractPayType> payTypeInfo;

	/**
	 * 付款方式
	 */
	private String[] payTypes;

	/**
	 * 付款方式说明
	 */
	private String payTypeMes;

	/**
	 * 里程碑信息
	 */
	private List<LegContractGoalsRelaProcid> goalsRelaProcidInfo;

	/**
	 * 节点信息
	 */
	private List<LegNodeDto> nodeInfo;

	/**
	 * 已选择的公议人模块信息
	 */
	private List<LegNodeDto> selectedNodeInfo;

	/**
	 * 节点信息
	 */
	private LegNodeDto ptzNodeInfo;

	/**
	 * 合同附件信息（主合同，专用合同，通用附件）
	 */
	private List<LegAttachment> attachmentInfo;

	/**
	 * 用印后文件
	 */
	private List<LegAttachment> sealFile;

	/**
	 * 辅助附件信息
	 */
	private List<LegAttachment> fzAttachmentInfo;

	/**
	 * 电子附件信息 TODO
	 */
	private List<LegAttachment> dzAttachmentInfo;

	/**
	 * 印章使用信息
	 */
	private List<LegSealUseInfoDto> sealUseInfo;

	/**
	 * 电子用印信息
	 */
	private List<LegElectronisSealDto> electronisSealDto;

	/**
	 * 关联付款公司
	 */
	private List<LegAccountCompanyDto> accountCompanyList;

	/**
	 * 用印申请：合作方
	 */
	private List<LegAccountCompanyDto> accountPartnerList;

	/**
	 * 归档信息
	 */
	private LegContractArchivesDto archivesDto;

	/**
	 * 用印明细信息
	 */
	private List<LegSealDetail> sealDetailInfo;

	/**
	 * 快速通道节点
	 */
	private List<String> fastNodeList;

	/**
	 * 权力
	 */
	private List<String> qlList;

	/**
	 * 风险
	 */
	private List<String> fxList;

	/**
	 *	风险预案 
	 */
	private String riskPlan;
	
	/**
	 * 拆分的批量合同信息
	 */
	private List<LegBatchContractDto> batchContractList;

	/**
	 * 用印申请时是否显示关联付款公司
	 */
	private boolean showAccountCompany = false;

	/**
	 * 用印初审人信息
	 */
	private List<LegYyReviewUserDto> yyReviewUserList;

	/**
	 * 附件模板id
	 */
	private String standAtts;

	/**
	 * 用印方式是否只能选择固定
	 */
	private boolean gdSeal;

	/* 内部合同使用 start */
	/**
	 * 签约方所有公司类型
	 */
	private String containCompanyType;
	
	/**
	 * 合同名称是否属于借款担保大类 0是，1不是
	 */
	private String isLoanGuarantee;
	
	/**
	 * 是否关联交易 1，关联交易；2，非关联交易
	 */
	private String isRelatedTran;

	/**
	 * 关联交易额度占用使用list
	 */
	private List<ContractAmountDto> contractAmountList;

	/**
	 * 额度是否足够判断标志位
	 */
	private String isEnough;

	/**
	 * 内部合同 合同类型、金额信息
	 */
	private List<LegTypeAmountDto> legTypeAmountInfoList;

	/**
	 * 关联交易占用金额信息是否显示
	 */
	private boolean relatedTranseIsShow;

	/**
	 * 关联交易AA情况
	 */
	public String doubleA;

	/**
	 * 是否跳过三自平台财务标志 1，跳过
	 */
	public String isJumpOver;

	/**
	 * 关联交易节点使用字段：合同类型
	 */
	private String contractType;

	/**
	 * 关联交易节点使用字段：剩余额度/总额度
	 */
	private String showAcount;

	/**
	 * 关联交易节点使用字段：交易项目
	 */
	private String transeType;

	/**
	 * 关联交易节点使用字段：对方业务人
	 */
	private String adverseUser;

	/**
	 * 是否为内部合同 ：
	 */
	private boolean isInternal;

	/**
	 * 无财务风控平台和业务主人节点提示 ：1，需要提示
	 */
	private String nodeNullShow;

	/**
	 * 内部合同用下面节点信息
	 */
	private List<LegNodeDto> botNodeInfo;

	/**
	 * 合同类型是内部承兑业务专用，且公司是1430， 则跳过对方业务主人、对方财务风控平台、对方小微主、1430印鉴管理员用印确认， 并且只能选择线下用印的
	 * flg 1：跳过
	 */
	private String flgForJump;

	/**
	 * 下方公议节点使用list
	 */
	// 三自平台财务初审
	private List<LegNodeDto> sanZiFirstList;
	// 三自平台财务复审
	private List<LegNodeDto> sanZiSecondList;
	// 证券部初审
	private List<LegNodeDto> zhengQuanFirstList;
	// 证券部复审
	private List<LegNodeDto> zhengQuanSecondList;
	// 我方平台主
	private List<LegNodeDto> pingtaizhuOur;
	// 对方平台主
	private List<LegNodeDto> pingtaizhuYou;
	// 对方业务人员
	private List<LegNodeDto> duiFangYeWuList;

	/**
	 * taskId 用于判断是否为驳回提交
	 */
	private String taskId;
	/* 内部合同使用 end */

	/* 借款担保合同使用 start */
	/**
	 * 三自平台长审核选取人信息
	 */
	private LegContractAuthUser loanSanZiSel;

	/**
	 * 共享财务审核选取人信息
	 */
	private LegContractAuthUser loanSharedFinance;

	/**
	 * 共享法务初审选取人信息
	 */
	private LegContractAuthUser loanLegalFir;

	/**
	 * 共享法务复审选取人信息
	 */
	private LegContractAuthUser loanLegalSec;

	/**
	 * GBTP或HGBOS合同地址
	 */
	private String GBTPorHGBOSurl;

	/* 借款担保合同使用 end */

	/**
	 * 非标准附件模板id
	 */
	private LegAttachment standAttachment;

	/**
	 * 签约方黑名单消息
	 */
	private List<Map<String, Object>> blackList;

	/**
	 * crm备案信息
	 */
	private LegCrmRegisForm crm;

	////////////////////////// 合同变更//////////////////
	// 原合同编号
	private String oldContractNo;
	// 原合同名称
	private String oldContractName;
	// 批量合同未处理文件数
	private int waitFile;

	public List<LegAttachment> getSealFile() {
		return sealFile;
	}

	public void setSealFile(List<LegAttachment> sealFile) {
		this.sealFile = sealFile;
	}

	public LegCrmRegisForm getCrm() {
		return crm;
	}

	public void setCrm(LegCrmRegisForm crm) {
		this.crm = crm;
	}

	public LegContractBCCExtraInfo getBccExtra() {
		return bccExtra;
	}

	public void setBccExtra(LegContractBCCExtraInfo bccExtra) {
		this.bccExtra = bccExtra;
	}

	//BCC合同交互额外信息
	private LegContractBCCExtraInfo bccExtra;

	public String getRiskPlan() {
		return riskPlan;
	}

	public void setRiskPlan(String riskPlan) {
		this.riskPlan = riskPlan;
	}

	public String getIsLoanGuarantee() {
		return isLoanGuarantee;
	}

	public void setIsLoanGuarantee(String isLoanGuarantee) {
		this.isLoanGuarantee = isLoanGuarantee;
	}

	public String getContainCompanyType() {
		return containCompanyType;
	}

	public void setContainCompanyType(String containCompanyType) {
		this.containCompanyType = containCompanyType;
	}

	public LegContractAuthUser getLoanSharedFinance() {
		return loanSharedFinance;
	}

	public String getGBTPorHGBOSurl() {
		return GBTPorHGBOSurl;
	}

	public void setGBTPorHGBOSurl(String gBTPorHGBOSurl) {
		GBTPorHGBOSurl = gBTPorHGBOSurl;
	}

	public List<Map<String, Object>> getBlackList() {
		return blackList;
	}

	public void setBlackList(List<Map<String, Object>> blackList) {
		this.blackList = blackList;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getAdverseUser() {
		return adverseUser;
	}

	public void setAdverseUser(String adverseUser) {
		this.adverseUser = adverseUser;
	}

	public LegAttachment getStandAttachment() {
		return standAttachment;
	}

	public void setStandAttachment(LegAttachment standAttachment) {
		this.standAttachment = standAttachment;
	}

	public String getIsEnough() {
		return isEnough;
	}

	public void setIsEnough(String isEnough) {
		this.isEnough = isEnough;
	}

	public void setLoanSharedFinance(LegContractAuthUser loanSharedFinance) {
		this.loanSharedFinance = loanSharedFinance;
	}

	public LegContractAuthUser getLoanLegalFir() {
		return loanLegalFir;
	}

	public void setLoanLegalFir(LegContractAuthUser loanLegalFir) {
		this.loanLegalFir = loanLegalFir;
	}

	public LegContractAuthUser getLoanLegalSec() {
		return loanLegalSec;
	}

	public void setLoanLegalSec(LegContractAuthUser loanLegalSec) {
		this.loanLegalSec = loanLegalSec;
	}

	public LegContractAuthUser getLoanSanZiSel() {
		return loanSanZiSel;
	}

	public void setLoanSanZiSel(LegContractAuthUser loanSanZiSel) {
		this.loanSanZiSel = loanSanZiSel;
	}

	public String getFlgForJump() {
		return flgForJump;
	}

	public void setFlgForJump(String flgForJump) {
		this.flgForJump = flgForJump;
	}

	public List<LegNodeDto> getDuiFangYeWuList() {
		return duiFangYeWuList;
	}

	public void setDuiFangYeWuList(List<LegNodeDto> duiFangYeWuList) {
		this.duiFangYeWuList = duiFangYeWuList;
	}

	public List<LegNodeDto> getPingtaizhuOur() {
		return pingtaizhuOur;
	}

	public void setPingtaizhuOur(List<LegNodeDto> pingtaizhuOur) {
		this.pingtaizhuOur = pingtaizhuOur;
	}

	public List<LegNodeDto> getPingtaizhuYou() {
		return pingtaizhuYou;
	}

	public void setPingtaizhuYou(List<LegNodeDto> pingtaizhuYou) {
		this.pingtaizhuYou = pingtaizhuYou;
	}

	public List<LegNodeDto> getZhengQuanFirstList() {
		return zhengQuanFirstList;
	}

	public void setZhengQuanFirstList(List<LegNodeDto> zhengQuanFirstList) {
		this.zhengQuanFirstList = zhengQuanFirstList;
	}

	public List<LegNodeDto> getZhengQuanSecondList() {
		return zhengQuanSecondList;
	}

	public void setZhengQuanSecondList(List<LegNodeDto> zhengQuanSecondList) {
		this.zhengQuanSecondList = zhengQuanSecondList;
	}

	public List<LegNodeDto> getSanZiFirstList() {
		return sanZiFirstList;
	}

	public void setSanZiFirstList(List<LegNodeDto> sanZiFirstList) {
		this.sanZiFirstList = sanZiFirstList;
	}

	public List<LegNodeDto> getSanZiSecondList() {
		return sanZiSecondList;
	}

	public void setSanZiSecondList(List<LegNodeDto> sanZiSecondList) {
		this.sanZiSecondList = sanZiSecondList;
	}

	public String getNodeNullShow() {
		return nodeNullShow;
	}

	public void setNodeNullShow(String nodeNullShow) {
		this.nodeNullShow = nodeNullShow;
	}

	public void setInternal(boolean isInternal) {
		this.isInternal = isInternal;
	}

	public boolean isInternal() {
		return isInternal;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getShowAcount() {
		return showAcount;
	}

	public void setShowAcount(String showAcount) {
		this.showAcount = showAcount;
	}

	public String getTranseType() {
		return transeType;
	}

	public void setTranseType(String transeType) {
		this.transeType = transeType;
	}

	public List<LegNodeDto> getBotNodeInfo() {
		return botNodeInfo;
	}

	public void setBotNodeInfo(List<LegNodeDto> botNodeInfo) {
		this.botNodeInfo = botNodeInfo;
	}

	public String getIsJumpOver() {
		return isJumpOver;
	}

	public void setIsJumpOver(String isJumpOver) {
		this.isJumpOver = isJumpOver;
	}

	public String getDoubleA() {
		return doubleA;
	}

	public void setDoubleA(String doubleA) {
		this.doubleA = doubleA;
	}

	public boolean isRelatedTranseIsShow() {
		return relatedTranseIsShow;
	}

	public void setRelatedTranseIsShow(boolean relatedTranseIsShow) {
		this.relatedTranseIsShow = relatedTranseIsShow;
	}

	public String getIsRelatedTran() {
		return isRelatedTran;
	}

	public void setIsRelatedTran(String isRelatedTran) {
		this.isRelatedTran = isRelatedTran;
	}

	public List<ContractAmountDto> getContractAmountList() {
		return contractAmountList;
	}

	public void setContractAmountList(List<ContractAmountDto> contractAmountList) {
		this.contractAmountList = contractAmountList;
	}

	public List<LegTypeAmountDto> getLegTypeAmountInfoList() {
		return legTypeAmountInfoList;
	}

	public void setLegTypeAmountInfoList(List<LegTypeAmountDto> legTypeAmountInfoList) {
		this.legTypeAmountInfoList = legTypeAmountInfoList;
	}

	public LegContractTmp getContractTmpInfo() {
		return contractTmpInfo;
	}

	public void setContractTmpInfo(LegContractTmp contractTmpInfo) {
		this.contractTmpInfo = contractTmpInfo;
	}

	public LegUserDto getUserDto() {
		return userDto;
	}

	public void setUserDto(LegUserDto userDto) {
		this.userDto = userDto;
	}

	public String getCompaNo() {
		return compaNo;
	}

	public void setCompaNo(String compaNo) {
		this.compaNo = compaNo;
	}

	public List<LegContractPartner> getContractPartnerInfoList() {
		return contractPartnerInfoList;
	}

	public void setContractPartnerInfoList(List<LegContractPartner> contractPartnerInfoList) {
		this.contractPartnerInfoList = contractPartnerInfoList;
	}

	public List<LegSeal> getSealInfo() {
		return sealInfo;
	}

	public void setSealInfo(List<LegSeal> sealInfo) {
		this.sealInfo = sealInfo;
	}

//	public List<LegContractPayType> getPayTypeInfo() {
//		return payTypeInfo;
//	}
//
//	public void setPayTypeInfo(List<LegContractPayType> payTypeInfo) {
//		this.payTypeInfo = payTypeInfo;
//	}

	public List<LegContractGoalsRelaProcid> getGoalsRelaProcidInfo() {
		return goalsRelaProcidInfo;
	}

	public String[] getPayTypes() {
		return payTypes;
	}

	public void setPayTypes(String[] payTypes) {
		this.payTypes = payTypes;
	}

	public String getPayTypeMes() {
		return payTypeMes;
	}

	public void setPayTypeMes(String payTypeMes) {
		this.payTypeMes = payTypeMes;
	}

	public void setGoalsRelaProcidInfo(List<LegContractGoalsRelaProcid> goalsRelaProcidInfo) {
		this.goalsRelaProcidInfo = goalsRelaProcidInfo;
	}

	public List<LegNodeDto> getNodeInfo() {
		return nodeInfo;
	}

	public void setNodeInfo(List<LegNodeDto> nodeInfo) {
		this.nodeInfo = nodeInfo;
	}

	public List<LegAttachment> getAttachmentInfo() {
		return attachmentInfo;
	}

	public void setAttachmentInfo(List<LegAttachment> attachmentInfo) {
		this.attachmentInfo = attachmentInfo;
	}

	public List<LegAttachment> getFzAttachmentInfo() {
		return fzAttachmentInfo;
	}

	public void setFzAttachmentInfo(List<LegAttachment> fzAttachmentInfo) {
		this.fzAttachmentInfo = fzAttachmentInfo;
	}

	public List<LegAttachment> getDzAttachmentInfo() {
		return dzAttachmentInfo;
	}

	public void setDzAttachmentInfo(List<LegAttachment> dzAttachmentInfo) {
		this.dzAttachmentInfo = dzAttachmentInfo;
	}

	public List<LegSealUseInfoDto> getSealUseInfo() {
		return sealUseInfo;
	}

	public void setSealUseInfo(List<LegSealUseInfoDto> sealUseInfo) {
		this.sealUseInfo = sealUseInfo;
	}

	public LegContractArchivesDto getArchivesDto() {
		return archivesDto;
	}

	public void setArchivesDto(LegContractArchivesDto archivesDto) {
		this.archivesDto = archivesDto;
	}

	public List<LegSealDetail> getSealDetailInfo() {
		return sealDetailInfo;
	}

	public void setSealDetailInfo(List<LegSealDetail> sealDetailInfo) {
		this.sealDetailInfo = sealDetailInfo;
	}

	public List<String> getFastNodeList() {
		return fastNodeList;
	}

	public void setFastNodeList(List<String> fastNodeList) {
		this.fastNodeList = fastNodeList;
	}

	public List<String> getQlList() {
		return qlList;
	}

	public void setQlList(List<String> qlList) {
		this.qlList = qlList;
	}

	public List<String> getFxList() {
		return fxList;
	}

	public void setFxList(List<String> fxList) {
		this.fxList = fxList;
	}

	public List<LegAccountCompanyDto> getAccountCompanyList() {
		return accountCompanyList;
	}

	public void setAccountCompanyList(List<LegAccountCompanyDto> accountCompanyList) {
		this.accountCompanyList = accountCompanyList;
	}

	public boolean isShowAccountCompany() {
		return showAccountCompany;
	}

	public void setShowAccountCompany(boolean showAccountCompany) {
		this.showAccountCompany = showAccountCompany;
	}

	public List<LegBatchContractDto> getBatchContractList() {
		return batchContractList;
	}

	public void setBatchContractList(List<LegBatchContractDto> batchContractList) {
		this.batchContractList = batchContractList;
	}

	public List<LegYyReviewUserDto> getYyReviewUserList() {
		return yyReviewUserList;
	}

	public void setYyReviewUserList(List<LegYyReviewUserDto> yyReviewUserList) {
		this.yyReviewUserList = yyReviewUserList;
	}

	public String getStandAtts() {
		return standAtts;
	}

	public void setStandAtts(String standAtts) {
		this.standAtts = standAtts;
	}

	public List<LegAccountCompanyDto> getAccountPartnerList() {
		return accountPartnerList;
	}

	public void setAccountPartnerList(List<LegAccountCompanyDto> accountPartnerList) {
		this.accountPartnerList = accountPartnerList;
	}

	public List<LegElectronisSealDto> getElectronisSealDto() {
		return electronisSealDto;
	}

	public void setElectronisSealDto(List<LegElectronisSealDto> electronisSealDto) {
		this.electronisSealDto = electronisSealDto;
	}

	public LegNodeDto getPtzNodeInfo() {
		return ptzNodeInfo;
	}

	public void setPtzNodeInfo(LegNodeDto ptzNodeInfo) {
		this.ptzNodeInfo = ptzNodeInfo;
	}

	public boolean isGdSeal() {
		return gdSeal;
	}

	public void setGdSeal(boolean gdSeal) {
		this.gdSeal = gdSeal;
	}

	public List<LegNodeDto> getSelectedNodeInfo() {
		return selectedNodeInfo;
	}

	public void setSelectedNodeInfo(List<LegNodeDto> selectedNodeInfo) {
		this.selectedNodeInfo = selectedNodeInfo;
	}

	public String getCurrencyZh() {
		return currencyZh;
	}

	public void setCurrencyZh(String currencyZh) {
		this.currencyZh = currencyZh;
	}

	public String getOldContractNo() {
		return oldContractNo;
	}

	public void setOldContractNo(String oldContractNo) {
		this.oldContractNo = oldContractNo;
	}

	public String getOldContractName() {
		return oldContractName;
	}

	public void setOldContractName(String oldContractName) {
		this.oldContractName = oldContractName;
	}

	public int getWaitFile() {
		return waitFile;
	}

	public void setWaitFile(int waitFile) {
		this.waitFile = waitFile;
	}
}
