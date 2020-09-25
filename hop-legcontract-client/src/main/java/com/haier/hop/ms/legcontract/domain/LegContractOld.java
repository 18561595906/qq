package com.haier.hop.ms.legcontract.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2020-02-14
 */
@TableName("leg_contract_old")
public class LegContractOld extends Model<LegContractOld> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableField("ROW_ID")
    private String rowId;
    /**
     * 项目编码
     */
    @TableField("PROJECT_CODE")
    private String projectCode;
    /**
     * 项目名称
     */
    @TableField("PROJECT_NAME")
    private String projectName;
    /**
     * "付款方式（BCC） X:网上付款; KJT:	快捷通现汇"
     */
    @TableField("BCC_PAY_TYPE")
    private String bccPayType;
    /**
     * 业务单元编码
     */
    @TableField("BIZ_CODE")
    private String bizCode;
    /**
     * 合同编码
     */
    @TableField("CONTRACT_CODE")
    private String contractCode;
    /**
     * 合同名称
     */
    @TableField("CONTRACT_NAME")
    private String contractName;
    /**
     * 合同背景
     */
    @TableField("BACKGROUD")
    private String backgroud;
    /**
     * 合同付款金额
     */
    @TableField("PAY_AMOUNT")
    private BigDecimal payAmount;
    /**
     * 合同付款币种
     */
    @TableField("PAY_CURRENCY")
    private String payCurrency;
    /**
     * 合同付款金额人民币
     */
    @TableField("PAY_CNY")
    private BigDecimal payCny;
    /**
     * 大写金额
     */
    @TableField("UPPER_AMOUNT")
    private String upperAmount;
    /**
     * 合同标的物（非必填）
     */
    @TableField("CORPORE")
    private String corpore;
    /**
     * 合同表单查看链接地址
     */
    @TableField("URL")
    private String url;
    /**
     * 开始时间
     */
    @TableField("BEGIN_DATE")
    private Date beginDate;
    /**
     * 结束时间
     */
    @TableField("END_DATE")
    private Date endDate;
    /**
     * 申请人
     */
    @TableField("APPLIER_ID")
    private String applierId;
    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private Date createTime;
    /**
     * 来源系统
     */
    @TableField("SYS_ID")
    private String sysId;
    /**
     * 流程id
     */
    @TableField("PROC_ID")
    private String procId;
    /**
     * 合同流水号
     */
    @TableField("CONT_NO")
    private String contNo;
    /**
     * 合同状态 1.申请 2.公议 3.签署 4.归档 5.复核 6.完成  8.用印确认 10.归档确认 11.电子盖章
     */
    @TableField("CONT_STATUS")
    private String contStatus;
    /**
     * 收付款类型（1：海尔为收款方 2：海尔为付款方 3：无款项收付 4：甲方为收款方 5：甲方为付款方）
     */
    @TableField("PAY_TYPE")
    private String payType;
    /**
     * 签收时间
     */
    @TableField("SIGN_DATE")
    private Date signDate;
    /**
     * 是否有起止日期（1：有，2：没有）
     */
    @TableField("IS_BEGINTOEND")
    private String isBegintoend;
    /**
     * 合同份数
     */
    @TableField("CONTRACT_NUM")
    private BigDecimal contractNum;
    /**
     * 业务单元名称
     */
    @TableField("BIZ_NAME")
    private String bizName;
    /**
     * 申请人姓名
     */
    @TableField("APPLIER_NAME")
    private String applierName;
    /**
     * 是否重大合同
     */
    @TableField("IS_MAJOR")
    private String isMajor;
    /**
     * 业务事项流水号
     */
    @TableField("PROJECT_APPID")
    private String projectAppid;
    /**
     * 战略承接
     */
    @TableField("STRATEGY")
    private String strategy;
    /**
     * 合同描述
     */
    @TableField("CONTRACT_DES")
    private String contractDes;
    /**
     * 1,完全起草；2，基于标准合同起草；3，使用相对方合同版本
     */
    @TableField("DRAFT_TYPE")
    private String draftType;
    /**
     * add:新设，change：变更，cancel：终止
     */
    @TableField("PRO_TYPE")
    private String proType;
    /**
     * 签约主体
     */
    @TableField("CONTRACT_PARTNER_LIST")
    private String contractPartnerList;
    /**
     * 合同类型 0非标 1标准 2按标准编辑
     */
    @TableField("CONTRACT_TYPE")
    private String contractType;
    /**
     * 甲方签约单位
     */
    @TableField("CONTRACT_PARTNER1")
    private String contractPartner1;
    /**
     * 乙方签约单位
     */
    @TableField("CONTRACT_PARTNER2")
    private String contractPartner2;
    /**
     * 甲/乙签约方单位
     */
    @TableField("PARTNERS_NAME")
    private String partnersName;
    /**
     * 合同编码（生成规则公议时间+流水号）
     */
    @TableField("CONTRACT_NO")
    private String contractNo;
    /**
     * 判断是否不同
     */
    @TableField("IS_COMPARE")
    private BigDecimal isCompare;
    /**
     * 合同别名
     */
    @TableField("CONTRACT_ALIAS")
    private String contractAlias;
    /**
     * 合同经办人电话
     */
    @TableField("CONTRACT_PHONE")
    private String contractPhone;
    /**
     * 合同经办人邮箱
     */
    @TableField("CONTRACT_EMAIL")
    private String contractEmail;
    /**
     * 风险预案
     */
    @TableField("RISK_PLAN")
    private String riskPlan;
    /**
     * 合同有效期（月单位）
     */
    @TableField("EFFECTIVE_DATE")
    private BigDecimal effectiveDate;
    /**
     * 是否变更金额
     */
    @TableField("IS_CHANGE")
    private BigDecimal isChange;
    /**
     * 是否是BCC
     */
    @TableField("IS_BCC")
    private String isBcc;
    /**
     * 项目id
     */
    @TableField("PROJECT_ID")
    private String projectId;
    /**
     * 是否已评价(0：未评价；1：已评价)
     */
    @TableField("IS_ASSESSED")
    private BigDecimal isAssessed;
    /**
     * 律师已审计
     */
    @TableField("IS_LAW_AUDIT")
    private BigDecimal isLawAudit;
    /**
     * 平台律师已审计
     */
    @TableField("IS_PLATFORM_LAW_AUDIT")
    private BigDecimal isPlatformLawAudit;
    /**
     * 律师是否有问题
     */
    @TableField("HAS_ERROR_LAW")
    private BigDecimal hasErrorLaw;
    /**
     * 平台律师是否有问题
     */
    @TableField("HAS_ERROR_PLATFORM")
    private BigDecimal hasErrorPlatform;
    /**
     * 1:新流程线上用印0:线下
     */
    @TableField("SEAL_TYPE")
    private String sealType;
    /**
     * 合同公议处新增RSP链接地址
     */
    @TableField("RSP_URL")
    private String rspUrl;
    /**
     * 1:快速通道合同  0:需要律师抢单
     */
    @TableField("IS_FAST_CHANNEL")
    private String isFastChannel;
    /**
     * 是否是批量合同 0 不是  1是主批量合同 2是拆分后的批量合同
     */
    @TableField("IS_MASSCONTRACT")
    private String isMasscontract;
    /**
     * 拆分后的批量合同关联的主批量合同流程ID
     */
    @TableField("RELA_MASS_PROCID")
    private String relaMassProcid;
    @TableField("LANGUAGE")
    private String language;
    /**
     * 合同类型1、外部 2、内部 3、借款担保
     */
    @TableField("CONTRACT_INSIDE_TYPE")
    private String contractInsideType;
    /**
     * 合同金额上限
     */
    @TableField("CONTRACT_AMOUNT_MAX")
    private String contractAmountMax;
    /**
     * 对方业务人
     */
    @TableField("ADVERSE_USER")
    private String adverseUser;
    /**
     * 合同类型（内部合同）
     */
    @TableField("CONTRACT_COMPANY_TYPE")
    private String contractCompanyType;
    /**
     * 公司产业
     */
    @TableField("COMPANY_INDUSTRY")
    private String companyIndustry;
    /**
     * 交易项目
     */
    @TableField("TRADING_PROJECT")
    private String tradingProject;
    /**
     * MEC合同编码
     */
    @TableField("MEC_CONTRACT_CODE")
    private String mecContractCode;
    /**
     * 合同金额上限总额度
     */
    @TableField("CONTRACT_AMOUNT_ALL_MAX")
    private String contractAmountAllMax;
    /**
     * 不确定时,预计合同交易金额
     */
    @TableField("ESTIMATE_CNY")
    private BigDecimal estimateCny;
    /**
     * 0:不支持自动盖章 1:支持自动盖章
     */
    @TableField("IS_AUTO_SEAL")
    private String isAutoSeal;
    /**
     * 是否已占用额度（0：未占用；1：已占用）
     */
    @TableField("IS_OCCUPIED_AMOUNT")
    private String isOccupiedAmount;
    /**
     * 合同保证金
     */
    @TableField("DEPOSIT")
    private BigDecimal deposit;
    /**
     * 0：待用印合同 1：终止合同 2：暂停合同 3：已用印合同
     */
    @TableField("MASS_SEAL_TYPE")
    private String massSealType;
    /**
     * 案件编号
     */
    @TableField("CASE_NO")
    private String caseNo;
    @TableField("RECEIVE_AMOUNT")
    private BigDecimal receiveAmount;
    @TableField("RECEIVE_CURRENCY")
    private String receiveCurrency;
    /**
     * 工贸编码
     */
    @TableField("GM_CODE")
    private String gmCode;
    /**
     * 工贸名称
     */
    @TableField("GM_NAME")
    private String gmName;
    /**
     * 海模智云传过来的合同类型（1：采购类，2：销售类）
     */
    @TableField("HMZY_TYPE")
    private String hmzyType;
    /**
     * 家居合同项目名称
     */
    @TableField("PM_PROJECTNAME")
    private String pmProjectname;
    @TableField("RECEIVE_CNY")
    private BigDecimal receiveCny;
    /**
     * 1：海尔是付款方 0：海尔是收款方
     */
    @TableField("RECEIVE_PAYER")
    private String receivePayer;
    /**
     * 签约地点
     */
    @TableField("SIGN_PLACE")
    private String signPlace;
    /**
     * 税率
     */
    @TableField("TAX_RATE")
    private String taxRate;
    /**
     * MEChetongbiangengguanlianhao
     */
    @TableField("RELATED_MEC_CODE")
    private String relatedMecCode;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getBccPayType() {
        return bccPayType;
    }

    public void setBccPayType(String bccPayType) {
        this.bccPayType = bccPayType;
    }

    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getBackgroud() {
        return backgroud;
    }

    public void setBackgroud(String backgroud) {
        this.backgroud = backgroud;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public String getPayCurrency() {
        return payCurrency;
    }

    public void setPayCurrency(String payCurrency) {
        this.payCurrency = payCurrency;
    }

    public BigDecimal getPayCny() {
        return payCny;
    }

    public void setPayCny(BigDecimal payCny) {
        this.payCny = payCny;
    }

    public String getUpperAmount() {
        return upperAmount;
    }

    public void setUpperAmount(String upperAmount) {
        this.upperAmount = upperAmount;
    }

    public String getCorpore() {
        return corpore;
    }

    public void setCorpore(String corpore) {
        this.corpore = corpore;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getApplierId() {
        return applierId;
    }

    public void setApplierId(String applierId) {
        this.applierId = applierId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getProcId() {
        return procId;
    }

    public void setProcId(String procId) {
        this.procId = procId;
    }

    public String getContNo() {
        return contNo;
    }

    public void setContNo(String contNo) {
        this.contNo = contNo;
    }

    public String getContStatus() {
        return contStatus;
    }

    public void setContStatus(String contStatus) {
        this.contStatus = contStatus;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public String getIsBegintoend() {
        return isBegintoend;
    }

    public void setIsBegintoend(String isBegintoend) {
        this.isBegintoend = isBegintoend;
    }

    public BigDecimal getContractNum() {
        return contractNum;
    }

    public void setContractNum(BigDecimal contractNum) {
        this.contractNum = contractNum;
    }

    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName;
    }

    public String getApplierName() {
        return applierName;
    }

    public void setApplierName(String applierName) {
        this.applierName = applierName;
    }

    public String getIsMajor() {
        return isMajor;
    }

    public void setIsMajor(String isMajor) {
        this.isMajor = isMajor;
    }

    public String getProjectAppid() {
        return projectAppid;
    }

    public void setProjectAppid(String projectAppid) {
        this.projectAppid = projectAppid;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public String getContractDes() {
        return contractDes;
    }

    public void setContractDes(String contractDes) {
        this.contractDes = contractDes;
    }

    public String getDraftType() {
        return draftType;
    }

    public void setDraftType(String draftType) {
        this.draftType = draftType;
    }

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType;
    }

    public String getContractPartnerList() {
        return contractPartnerList;
    }

    public void setContractPartnerList(String contractPartnerList) {
        this.contractPartnerList = contractPartnerList;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getContractPartner1() {
        return contractPartner1;
    }

    public void setContractPartner1(String contractPartner1) {
        this.contractPartner1 = contractPartner1;
    }

    public String getContractPartner2() {
        return contractPartner2;
    }

    public void setContractPartner2(String contractPartner2) {
        this.contractPartner2 = contractPartner2;
    }

    public String getPartnersName() {
        return partnersName;
    }

    public void setPartnersName(String partnersName) {
        this.partnersName = partnersName;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public BigDecimal getIsCompare() {
        return isCompare;
    }

    public void setIsCompare(BigDecimal isCompare) {
        this.isCompare = isCompare;
    }

    public String getContractAlias() {
        return contractAlias;
    }

    public void setContractAlias(String contractAlias) {
        this.contractAlias = contractAlias;
    }

    public String getContractPhone() {
        return contractPhone;
    }

    public void setContractPhone(String contractPhone) {
        this.contractPhone = contractPhone;
    }

    public String getContractEmail() {
        return contractEmail;
    }

    public void setContractEmail(String contractEmail) {
        this.contractEmail = contractEmail;
    }

    public String getRiskPlan() {
        return riskPlan;
    }

    public void setRiskPlan(String riskPlan) {
        this.riskPlan = riskPlan;
    }

    public BigDecimal getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(BigDecimal effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public BigDecimal getIsChange() {
        return isChange;
    }

    public void setIsChange(BigDecimal isChange) {
        this.isChange = isChange;
    }

    public String getIsBcc() {
        return isBcc;
    }

    public void setIsBcc(String isBcc) {
        this.isBcc = isBcc;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public BigDecimal getIsAssessed() {
        return isAssessed;
    }

    public void setIsAssessed(BigDecimal isAssessed) {
        this.isAssessed = isAssessed;
    }

    public BigDecimal getIsLawAudit() {
        return isLawAudit;
    }

    public void setIsLawAudit(BigDecimal isLawAudit) {
        this.isLawAudit = isLawAudit;
    }

    public BigDecimal getIsPlatformLawAudit() {
        return isPlatformLawAudit;
    }

    public void setIsPlatformLawAudit(BigDecimal isPlatformLawAudit) {
        this.isPlatformLawAudit = isPlatformLawAudit;
    }

    public BigDecimal getHasErrorLaw() {
        return hasErrorLaw;
    }

    public void setHasErrorLaw(BigDecimal hasErrorLaw) {
        this.hasErrorLaw = hasErrorLaw;
    }

    public BigDecimal getHasErrorPlatform() {
        return hasErrorPlatform;
    }

    public void setHasErrorPlatform(BigDecimal hasErrorPlatform) {
        this.hasErrorPlatform = hasErrorPlatform;
    }

    public String getSealType() {
        return sealType;
    }

    public void setSealType(String sealType) {
        this.sealType = sealType;
    }

    public String getRspUrl() {
        return rspUrl;
    }

    public void setRspUrl(String rspUrl) {
        this.rspUrl = rspUrl;
    }

    public String getIsFastChannel() {
        return isFastChannel;
    }

    public void setIsFastChannel(String isFastChannel) {
        this.isFastChannel = isFastChannel;
    }

    public String getIsMasscontract() {
        return isMasscontract;
    }

    public void setIsMasscontract(String isMasscontract) {
        this.isMasscontract = isMasscontract;
    }

    public String getRelaMassProcid() {
        return relaMassProcid;
    }

    public void setRelaMassProcid(String relaMassProcid) {
        this.relaMassProcid = relaMassProcid;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getContractInsideType() {
        return contractInsideType;
    }

    public void setContractInsideType(String contractInsideType) {
        this.contractInsideType = contractInsideType;
    }

    public String getContractAmountMax() {
        return contractAmountMax;
    }

    public void setContractAmountMax(String contractAmountMax) {
        this.contractAmountMax = contractAmountMax;
    }

    public String getAdverseUser() {
        return adverseUser;
    }

    public void setAdverseUser(String adverseUser) {
        this.adverseUser = adverseUser;
    }

    public String getContractCompanyType() {
        return contractCompanyType;
    }

    public void setContractCompanyType(String contractCompanyType) {
        this.contractCompanyType = contractCompanyType;
    }

    public String getCompanyIndustry() {
        return companyIndustry;
    }

    public void setCompanyIndustry(String companyIndustry) {
        this.companyIndustry = companyIndustry;
    }

    public String getTradingProject() {
        return tradingProject;
    }

    public void setTradingProject(String tradingProject) {
        this.tradingProject = tradingProject;
    }

    public String getMecContractCode() {
        return mecContractCode;
    }

    public void setMecContractCode(String mecContractCode) {
        this.mecContractCode = mecContractCode;
    }

    public String getContractAmountAllMax() {
        return contractAmountAllMax;
    }

    public void setContractAmountAllMax(String contractAmountAllMax) {
        this.contractAmountAllMax = contractAmountAllMax;
    }

    public BigDecimal getEstimateCny() {
        return estimateCny;
    }

    public void setEstimateCny(BigDecimal estimateCny) {
        this.estimateCny = estimateCny;
    }

    public String getIsAutoSeal() {
        return isAutoSeal;
    }

    public void setIsAutoSeal(String isAutoSeal) {
        this.isAutoSeal = isAutoSeal;
    }

    public String getIsOccupiedAmount() {
        return isOccupiedAmount;
    }

    public void setIsOccupiedAmount(String isOccupiedAmount) {
        this.isOccupiedAmount = isOccupiedAmount;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public String getMassSealType() {
        return massSealType;
    }

    public void setMassSealType(String massSealType) {
        this.massSealType = massSealType;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public BigDecimal getReceiveAmount() {
        return receiveAmount;
    }

    public void setReceiveAmount(BigDecimal receiveAmount) {
        this.receiveAmount = receiveAmount;
    }

    public String getReceiveCurrency() {
        return receiveCurrency;
    }

    public void setReceiveCurrency(String receiveCurrency) {
        this.receiveCurrency = receiveCurrency;
    }

    public String getGmCode() {
        return gmCode;
    }

    public void setGmCode(String gmCode) {
        this.gmCode = gmCode;
    }

    public String getGmName() {
        return gmName;
    }

    public void setGmName(String gmName) {
        this.gmName = gmName;
    }

    public String getHmzyType() {
        return hmzyType;
    }

    public void setHmzyType(String hmzyType) {
        this.hmzyType = hmzyType;
    }

    public String getPmProjectname() {
        return pmProjectname;
    }

    public void setPmProjectname(String pmProjectname) {
        this.pmProjectname = pmProjectname;
    }

    public BigDecimal getReceiveCny() {
        return receiveCny;
    }

    public void setReceiveCny(BigDecimal receiveCny) {
        this.receiveCny = receiveCny;
    }

    public String getReceivePayer() {
        return receivePayer;
    }

    public void setReceivePayer(String receivePayer) {
        this.receivePayer = receivePayer;
    }

    public String getSignPlace() {
        return signPlace;
    }

    public void setSignPlace(String signPlace) {
        this.signPlace = signPlace;
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public String getRelatedMecCode() {
        return relatedMecCode;
    }

    public void setRelatedMecCode(String relatedMecCode) {
        this.relatedMecCode = relatedMecCode;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegContractOld{" +
        "rowId=" + rowId +
        ", projectCode=" + projectCode +
        ", projectName=" + projectName +
        ", bccPayType=" + bccPayType +
        ", bizCode=" + bizCode +
        ", contractCode=" + contractCode +
        ", contractName=" + contractName +
        ", backgroud=" + backgroud +
        ", payAmount=" + payAmount +
        ", payCurrency=" + payCurrency +
        ", payCny=" + payCny +
        ", upperAmount=" + upperAmount +
        ", corpore=" + corpore +
        ", url=" + url +
        ", beginDate=" + beginDate +
        ", endDate=" + endDate +
        ", applierId=" + applierId +
        ", createTime=" + createTime +
        ", sysId=" + sysId +
        ", procId=" + procId +
        ", contNo=" + contNo +
        ", contStatus=" + contStatus +
        ", payType=" + payType +
        ", signDate=" + signDate +
        ", isBegintoend=" + isBegintoend +
        ", contractNum=" + contractNum +
        ", bizName=" + bizName +
        ", applierName=" + applierName +
        ", isMajor=" + isMajor +
        ", projectAppid=" + projectAppid +
        ", strategy=" + strategy +
        ", contractDes=" + contractDes +
        ", draftType=" + draftType +
        ", proType=" + proType +
        ", contractPartnerList=" + contractPartnerList +
        ", contractType=" + contractType +
        ", contractPartner1=" + contractPartner1 +
        ", contractPartner2=" + contractPartner2 +
        ", partnersName=" + partnersName +
        ", contractNo=" + contractNo +
        ", isCompare=" + isCompare +
        ", contractAlias=" + contractAlias +
        ", contractPhone=" + contractPhone +
        ", contractEmail=" + contractEmail +
        ", riskPlan=" + riskPlan +
        ", effectiveDate=" + effectiveDate +
        ", isChange=" + isChange +
        ", isBcc=" + isBcc +
        ", projectId=" + projectId +
        ", isAssessed=" + isAssessed +
        ", isLawAudit=" + isLawAudit +
        ", isPlatformLawAudit=" + isPlatformLawAudit +
        ", hasErrorLaw=" + hasErrorLaw +
        ", hasErrorPlatform=" + hasErrorPlatform +
        ", sealType=" + sealType +
        ", rspUrl=" + rspUrl +
        ", isFastChannel=" + isFastChannel +
        ", isMasscontract=" + isMasscontract +
        ", relaMassProcid=" + relaMassProcid +
        ", language=" + language +
        ", contractInsideType=" + contractInsideType +
        ", contractAmountMax=" + contractAmountMax +
        ", adverseUser=" + adverseUser +
        ", contractCompanyType=" + contractCompanyType +
        ", companyIndustry=" + companyIndustry +
        ", tradingProject=" + tradingProject +
        ", mecContractCode=" + mecContractCode +
        ", contractAmountAllMax=" + contractAmountAllMax +
        ", estimateCny=" + estimateCny +
        ", isAutoSeal=" + isAutoSeal +
        ", isOccupiedAmount=" + isOccupiedAmount +
        ", deposit=" + deposit +
        ", massSealType=" + massSealType +
        ", caseNo=" + caseNo +
        ", receiveAmount=" + receiveAmount +
        ", receiveCurrency=" + receiveCurrency +
        ", gmCode=" + gmCode +
        ", gmName=" + gmName +
        ", hmzyType=" + hmzyType +
        ", pmProjectname=" + pmProjectname +
        ", receiveCny=" + receiveCny +
        ", receivePayer=" + receivePayer +
        ", signPlace=" + signPlace +
        ", taxRate=" + taxRate +
        ", relatedMecCode=" + relatedMecCode +
        "}";
    }
}
