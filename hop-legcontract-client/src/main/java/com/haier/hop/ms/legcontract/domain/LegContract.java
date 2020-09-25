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
 * @since 2020-04-12
 */
@TableName("leg_contract")
public class LegContract extends Model<LegContract> {

    private static final long serialVersionUID = 1L;

    @TableField("row_id")
    private BigDecimal rowId;
    @TableField("project_code")
    private String projectCode;
    @TableField("project_name")
    private String projectName;
    @TableField("biz_code")
    private String bizCode;
    @TableField("contract_code")
    private String contractCode;
    @TableField("contract_name")
    private String contractName;
    private String backgroud;
    @TableField("receive_amount")
    private BigDecimal receiveAmount;
    @TableField("receive_currency")
    private String receiveCurrency;
    @TableField("receive_cny")
    private BigDecimal receiveCny;
    @TableField("pay_amount")
    private BigDecimal payAmount;
    @TableField("pay_currency")
    private String payCurrency;
    @TableField("upper_amount")
    private String upperAmount;
    private String corpore;
    private String url;
    @TableField("begin_date")
    private Date beginDate;
    @TableField("end_date")
    private Date endDate;
    @TableField("applier_id")
    private String applierId;
    @TableField("create_time")
    private Date createTime;
    @TableField("sys_id")
    private String sysId;
    @TableField("proc_id")
    private String procId;
    @TableField("cont_no")
    private String contNo;
    @TableField("cont_status")
    private String contStatus;
    @TableField("pay_type")
    private String payType;
    @TableField("sign_date")
    private Date signDate;
    @TableField("is_begintoend")
    private BigDecimal isBegintoend;
    @TableField("contract_num")
    private BigDecimal contractNum;
    @TableField("biz_name")
    private String bizName;
    @TableField("applier_name")
    private String applierName;
    @TableField("is_major")
    private BigDecimal isMajor;
    @TableField("project_appid")
    private String projectAppid;
    private String strategy;
    @TableField("contract_des")
    private String contractDes;
    @TableField("pay_cny")
    private BigDecimal payCny;
    @TableField("draft_type")
    private String draftType;
    @TableField("pro_type")
    private String proType;
    @TableField("contract_partner_list")
    private String contractPartnerList;
    @TableField("contract_type")
    private String contractType;
    @TableField("contract_partner1")
    private String contractPartner1;
    @TableField("contract_partner2")
    private String contractPartner2;
    @TableField("partners_name")
    private String partnersName;
    @TableField("contract_no")
    private String contractNo;
    @TableField("is_compare")
    private BigDecimal isCompare;
    @TableField("contract_alias")
    private String contractAlias;
    @TableField("contract_phone")
    private String contractPhone;
    @TableField("contract_email")
    private String contractEmail;
    @TableField("risk_plan")
    private String riskPlan;
    @TableField("effective_date")
    private BigDecimal effectiveDate;
    @TableField("is_change")
    private BigDecimal isChange;
    @TableField("is_bcc")
    private String isBcc;
    @TableField("project_id")
    private BigDecimal projectId;
    @TableField("is_assessed")
    private BigDecimal isAssessed;
    @TableField("is_law_audit")
    private BigDecimal isLawAudit;
    @TableField("is_platform_law_audit")
    private BigDecimal isPlatformLawAudit;
    @TableField("has_error_law")
    private BigDecimal hasErrorLaw;
    @TableField("has_error_platform")
    private BigDecimal hasErrorPlatform;
    @TableField("seal_type")
    private String sealType;
    @TableField("rsp_url")
    private String rspUrl;
    @TableField("is_fast_channel")
    private String isFastChannel;
    @TableField("is_masscontract")
    private String isMasscontract;
    @TableField("rela_mass_procid")
    private String relaMassProcid;
    private BigDecimal language;
    @TableField("contract_inside_type")
    private String contractInsideType;
    @TableField("contract_amount_max")
    private String contractAmountMax;
    @TableField("adverse_user")
    private String adverseUser;
    @TableField("contract_company_type")
    private String contractCompanyType;
    @TableField("company_industry")
    private String companyIndustry;
    @TableField("receive_payer")
    private String receivePayer;
    @TableField("trading_project")
    private String tradingProject;
    @TableField("mec_contract_code")
    private String mecContractCode;
    @TableField("contract_amount_all_max")
    private String contractAmountAllMax;
    @TableField("estimate_cny")
    private BigDecimal estimateCny;
    @TableField("is_auto_seal")
    private String isAutoSeal;
    @TableField("is_occupied_amount")
    private String isOccupiedAmount;
    private BigDecimal deposit;
    @TableField("mass_seal_type")
    private String massSealType;
    @TableField("related_mec_code")
    private String relatedMecCode;
    @TableField("case_no")
    private String caseNo;
    @TableField("hmzy_type")
    private String hmzyType;
    @TableField("pm_projectname")
    private String pmProjectname;
    @TableField("sign_place")
    private String signPlace;
    @TableField("bcc_pay_type")
    private String bccPayType;
    @TableField("gm_code")
    private String gmCode;
    @TableField("gm_name")
    private String gmName;
    @TableField("tax_rate")
    private String taxRate;
    @TableField("adverse_role_name")
    private String adverseRoleName;


    public BigDecimal getRowId() {
        return rowId;
    }

    public void setRowId(BigDecimal rowId) {
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

    public BigDecimal getReceiveCny() {
        return receiveCny;
    }

    public void setReceiveCny(BigDecimal receiveCny) {
        this.receiveCny = receiveCny;
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

    public BigDecimal getIsBegintoend() {
        return isBegintoend;
    }

    public void setIsBegintoend(BigDecimal isBegintoend) {
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

    public BigDecimal getIsMajor() {
        return isMajor;
    }

    public void setIsMajor(BigDecimal isMajor) {
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

    public BigDecimal getPayCny() {
        return payCny;
    }

    public void setPayCny(BigDecimal payCny) {
        this.payCny = payCny;
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

    public BigDecimal getProjectId() {
        return projectId;
    }

    public void setProjectId(BigDecimal projectId) {
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

    public BigDecimal getLanguage() {
        return language;
    }

    public void setLanguage(BigDecimal language) {
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

    public String getReceivePayer() {
        return receivePayer;
    }

    public void setReceivePayer(String receivePayer) {
        this.receivePayer = receivePayer;
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

    public String getRelatedMecCode() {
        return relatedMecCode;
    }

    public void setRelatedMecCode(String relatedMecCode) {
        this.relatedMecCode = relatedMecCode;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
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

    public String getSignPlace() {
        return signPlace;
    }

    public void setSignPlace(String signPlace) {
        this.signPlace = signPlace;
    }

    public String getBccPayType() {
        return bccPayType;
    }

    public void setBccPayType(String bccPayType) {
        this.bccPayType = bccPayType;
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

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public String getAdverseRoleName() {
        return adverseRoleName;
    }

    public void setAdverseRoleName(String adverseRoleName) {
        this.adverseRoleName = adverseRoleName;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegContract{" +
        "rowId=" + rowId +
        ", projectCode=" + projectCode +
        ", projectName=" + projectName +
        ", bizCode=" + bizCode +
        ", contractCode=" + contractCode +
        ", contractName=" + contractName +
        ", backgroud=" + backgroud +
        ", receiveAmount=" + receiveAmount +
        ", receiveCurrency=" + receiveCurrency +
        ", receiveCny=" + receiveCny +
        ", payAmount=" + payAmount +
        ", payCurrency=" + payCurrency +
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
        ", payCny=" + payCny +
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
        ", receivePayer=" + receivePayer +
        ", tradingProject=" + tradingProject +
        ", mecContractCode=" + mecContractCode +
        ", contractAmountAllMax=" + contractAmountAllMax +
        ", estimateCny=" + estimateCny +
        ", isAutoSeal=" + isAutoSeal +
        ", isOccupiedAmount=" + isOccupiedAmount +
        ", deposit=" + deposit +
        ", massSealType=" + massSealType +
        ", relatedMecCode=" + relatedMecCode +
        ", caseNo=" + caseNo +
        ", hmzyType=" + hmzyType +
        ", pmProjectname=" + pmProjectname +
        ", signPlace=" + signPlace +
        ", bccPayType=" + bccPayType +
        ", gmCode=" + gmCode +
        ", gmName=" + gmName +
        ", taxRate=" + taxRate +
        ", adverseRoleName=" + adverseRoleName +
        "}";
    }
}
