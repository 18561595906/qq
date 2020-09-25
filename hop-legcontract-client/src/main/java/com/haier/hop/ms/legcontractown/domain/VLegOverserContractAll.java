package com.haier.hop.ms.legcontractown.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * VIEW
 * </p>
 *
 * @author xuejinxin
 * @since 2020-06-18
 */
@TableName("v_leg_overser_contract_all")
public class VLegOverserContractAll extends Model<VLegOverserContractAll> {

    private static final long serialVersionUID = 1L;

    @TableField("ROW_ID")
    private String rowId;
    @TableField("CONT_ID")
    private String contId;
    @TableField("CONT_NO")
    private String contNo;
    @TableField("APPLIER_ID")
    private String applierId;
    @TableField("OPERATERS")
    private String operaters;
    @TableField("CUST_INFO")
    private String custInfo;
    @TableField("CUST_NO")
    private String custNo;
    @TableField("COUNTRY")
    private String country;
    @TableField("CUST_XW")
    private String custXw;
    @TableField("MARKET_XW")
    private String marketXw;
    @TableField("CUST_CATEGORY")
    private String custCategory;
    @TableField("REG_FUND")
    private String regFund;
    @TableField("SALE_LAST_YEAR")
    private String saleLastYear;
    @TableField("SALE_THIS_YEAR")
    private String saleThisYear;
    @TableField("RANKING")
    private String ranking;
    @TableField("PUR_AMOUNT_2017")
    private String purAmount2017;
    @TableField("OVERDUE")
    private String overdue;
    @TableField("OVERDUE_RATE")
    private String overdueRate;
    @TableField("OVERDUE_COUNT")
    private String overdueCount;
    @TableField("LAWSUIT")
    private String lawsuit;
    @TableField("MARKET_BUDGET")
    private String marketBudget;
    @TableField("UNCERTAIN")
    private String uncertain;
    @TableField("BUSINESS_MODEL")
    private String businessModel;
    @TableField("AVOID_SCHEMEA")
    private String avoidSchemea;
    @TableField("CON_FUND")
    private String conFund;
    @TableField("CON_PRODUCT")
    private String conProduct;
    @TableField("CON_FUND_AVERAGE")
    private String conFundAverage;
    @TableField("CON_PRODUCT_AVERAGE")
    private String conProductAverage;
    @TableField("PAY_TYPE_LIST")
    private String payTypeList;
    @TableField("AVOID_SCHEMEB")
    private String avoidSchemeb;
    @TableField("STANDARD_CONTRACT")
    private String standardContract;
    @TableField("DEAL_TYPE")
    private String dealType;
    @TableField("CURRENCY")
    private String currency;
    @TableField("FINANC_TERMS")
    private String financTerms;
    @TableField("SIGNER")
    private String signer;
    @TableField("CLAUSE_START_DATE")
    private Date clauseStartDate;
    @TableField("CLAUSE_END_DATE")
    private Date clauseEndDate;
    @TableField("FOREVER")
    private String forever;
    @TableField("AFTER_SALES")
    private String afterSales;
    @TableField("SALE_QUANTITY")
    private String saleQuantity;
    @TableField("SALE_RANKING")
    private String saleRanking;
    @TableField("FAMOUS_BRAND")
    private String famousBrand;
    @TableField("CN_COMPANY")
    private String cnCompany;
    @TableField("OTHER_PRODUCT")
    private String otherProduct;
    @TableField("COMPANY")
    private String company;
    @TableField("PRODUCT")
    private String product;
    @TableField("BRAND")
    private String brand;
    @TableField("SEAL")
    private String seal;
    @TableField("SEAL_NAME")
    private String sealName;
    @TableField("PROC_ID")
    private String procId;
    @TableField("PRO_TYPE")
    private BigDecimal proType;
    @TableField("PUR_AMOUNT_2016")
    private String purAmount2016;
    @TableField("PUR_AMOUNT_2015")
    private String purAmount2015;
    @TableField("PAY_CODE1")
    private String payCode1;
    @TableField("PAY_OTHER")
    private String payOther;
    @TableField("ISSUE_BANK")
    private String issueBank;
    @TableField("SALE_AREA")
    private String saleArea;
    @TableField("REPLACE_AMOUNT")
    private String replaceAmount;
    @TableField("REASON")
    private String reason;
    @TableField("IS_FAILURE_RATE")
    private String isFailureRate;
    @TableField("FROM_COUNTRY")
    private String fromCountry;
    @TableField("TO_COUNTRY")
    private String toCountry;
    @TableField("CTEATE_TIME")
    private Date cteateTime;
    @TableField("CONT_STATUS")
    private BigDecimal contStatus;
    @TableField("UPDATE_TIME")
    private Date updateTime;
    @TableField("PAY_CODE2")
    private String payCode2;
    @TableField("PAY_CODE3")
    private String payCode3;
    @TableField("PAY_CODE4")
    private String payCode4;
    @TableField("AMEND_CLAUSE")
    private String amendClause;
    @TableField("CUST_OTHERS")
    private String custOthers;
    @TableField("CON_PRICE")
    private String conPrice;
    @TableField("CON_PRICE_AVERAGE")
    private String conPriceAverage;
    @TableField("CONTRACT_TYPE")
    private BigDecimal contractType;
    @TableField("CONTRACT_LANGUAGE")
    private BigDecimal contractLanguage;
    @TableField("CUST_XW_CODE")
    private String custXwCode;
    @TableField("MARKET_XW_CODE")
    private String marketXwCode;
    @TableField("CONTRACT_SUM")
    private String contractSum;
    @TableField("CONTRACT_CONTEXT")
    private String contractContext;
    @TableField("CHANGE_XUYUE")
    private String changeXuyue;
    @TableField("CHANGE_QITA")
    private String changeQita;
    @TableField("CHANGE_CONTENT")
    private String changeContent;
    @TableField("OLD_CONTRACT_PROCID")
    private String oldContractProcid;
    @TableField("OLD_CONTRACT_ID")
    private String oldContractId;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getContId() {
        return contId;
    }

    public void setContId(String contId) {
        this.contId = contId;
    }

    public String getContNo() {
        return contNo;
    }

    public void setContNo(String contNo) {
        this.contNo = contNo;
    }

    public String getApplierId() {
        return applierId;
    }

    public void setApplierId(String applierId) {
        this.applierId = applierId;
    }

    public String getOperaters() {
        return operaters;
    }

    public void setOperaters(String operaters) {
        this.operaters = operaters;
    }

    public String getCustInfo() {
        return custInfo;
    }

    public void setCustInfo(String custInfo) {
        this.custInfo = custInfo;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCustXw() {
        return custXw;
    }

    public void setCustXw(String custXw) {
        this.custXw = custXw;
    }

    public String getMarketXw() {
        return marketXw;
    }

    public void setMarketXw(String marketXw) {
        this.marketXw = marketXw;
    }

    public String getCustCategory() {
        return custCategory;
    }

    public void setCustCategory(String custCategory) {
        this.custCategory = custCategory;
    }

    public String getRegFund() {
        return regFund;
    }

    public void setRegFund(String regFund) {
        this.regFund = regFund;
    }

    public String getSaleLastYear() {
        return saleLastYear;
    }

    public void setSaleLastYear(String saleLastYear) {
        this.saleLastYear = saleLastYear;
    }

    public String getSaleThisYear() {
        return saleThisYear;
    }

    public void setSaleThisYear(String saleThisYear) {
        this.saleThisYear = saleThisYear;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public String getPurAmount2017() {
        return purAmount2017;
    }

    public void setPurAmount2017(String purAmount2017) {
        this.purAmount2017 = purAmount2017;
    }

    public String getOverdue() {
        return overdue;
    }

    public void setOverdue(String overdue) {
        this.overdue = overdue;
    }

    public String getOverdueRate() {
        return overdueRate;
    }

    public void setOverdueRate(String overdueRate) {
        this.overdueRate = overdueRate;
    }

    public String getOverdueCount() {
        return overdueCount;
    }

    public void setOverdueCount(String overdueCount) {
        this.overdueCount = overdueCount;
    }

    public String getLawsuit() {
        return lawsuit;
    }

    public void setLawsuit(String lawsuit) {
        this.lawsuit = lawsuit;
    }

    public String getMarketBudget() {
        return marketBudget;
    }

    public void setMarketBudget(String marketBudget) {
        this.marketBudget = marketBudget;
    }

    public String getUncertain() {
        return uncertain;
    }

    public void setUncertain(String uncertain) {
        this.uncertain = uncertain;
    }

    public String getBusinessModel() {
        return businessModel;
    }

    public void setBusinessModel(String businessModel) {
        this.businessModel = businessModel;
    }

    public String getAvoidSchemea() {
        return avoidSchemea;
    }

    public void setAvoidSchemea(String avoidSchemea) {
        this.avoidSchemea = avoidSchemea;
    }

    public String getConFund() {
        return conFund;
    }

    public void setConFund(String conFund) {
        this.conFund = conFund;
    }

    public String getConProduct() {
        return conProduct;
    }

    public void setConProduct(String conProduct) {
        this.conProduct = conProduct;
    }

    public String getConFundAverage() {
        return conFundAverage;
    }

    public void setConFundAverage(String conFundAverage) {
        this.conFundAverage = conFundAverage;
    }

    public String getConProductAverage() {
        return conProductAverage;
    }

    public void setConProductAverage(String conProductAverage) {
        this.conProductAverage = conProductAverage;
    }

    public String getPayTypeList() {
        return payTypeList;
    }

    public void setPayTypeList(String payTypeList) {
        this.payTypeList = payTypeList;
    }

    public String getAvoidSchemeb() {
        return avoidSchemeb;
    }

    public void setAvoidSchemeb(String avoidSchemeb) {
        this.avoidSchemeb = avoidSchemeb;
    }

    public String getStandardContract() {
        return standardContract;
    }

    public void setStandardContract(String standardContract) {
        this.standardContract = standardContract;
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getFinancTerms() {
        return financTerms;
    }

    public void setFinancTerms(String financTerms) {
        this.financTerms = financTerms;
    }

    public String getSigner() {
        return signer;
    }

    public void setSigner(String signer) {
        this.signer = signer;
    }

    public Date getClauseStartDate() {
        return clauseStartDate;
    }

    public void setClauseStartDate(Date clauseStartDate) {
        this.clauseStartDate = clauseStartDate;
    }

    public Date getClauseEndDate() {
        return clauseEndDate;
    }

    public void setClauseEndDate(Date clauseEndDate) {
        this.clauseEndDate = clauseEndDate;
    }

    public String getForever() {
        return forever;
    }

    public void setForever(String forever) {
        this.forever = forever;
    }

    public String getAfterSales() {
        return afterSales;
    }

    public void setAfterSales(String afterSales) {
        this.afterSales = afterSales;
    }

    public String getSaleQuantity() {
        return saleQuantity;
    }

    public void setSaleQuantity(String saleQuantity) {
        this.saleQuantity = saleQuantity;
    }

    public String getSaleRanking() {
        return saleRanking;
    }

    public void setSaleRanking(String saleRanking) {
        this.saleRanking = saleRanking;
    }

    public String getFamousBrand() {
        return famousBrand;
    }

    public void setFamousBrand(String famousBrand) {
        this.famousBrand = famousBrand;
    }

    public String getCnCompany() {
        return cnCompany;
    }

    public void setCnCompany(String cnCompany) {
        this.cnCompany = cnCompany;
    }

    public String getOtherProduct() {
        return otherProduct;
    }

    public void setOtherProduct(String otherProduct) {
        this.otherProduct = otherProduct;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeal() {
        return seal;
    }

    public void setSeal(String seal) {
        this.seal = seal;
    }

    public String getSealName() {
        return sealName;
    }

    public void setSealName(String sealName) {
        this.sealName = sealName;
    }

    public String getProcId() {
        return procId;
    }

    public void setProcId(String procId) {
        this.procId = procId;
    }

    public BigDecimal getProType() {
        return proType;
    }

    public void setProType(BigDecimal proType) {
        this.proType = proType;
    }

    public String getPurAmount2016() {
        return purAmount2016;
    }

    public void setPurAmount2016(String purAmount2016) {
        this.purAmount2016 = purAmount2016;
    }

    public String getPurAmount2015() {
        return purAmount2015;
    }

    public void setPurAmount2015(String purAmount2015) {
        this.purAmount2015 = purAmount2015;
    }

    public String getPayCode1() {
        return payCode1;
    }

    public void setPayCode1(String payCode1) {
        this.payCode1 = payCode1;
    }

    public String getPayOther() {
        return payOther;
    }

    public void setPayOther(String payOther) {
        this.payOther = payOther;
    }

    public String getIssueBank() {
        return issueBank;
    }

    public void setIssueBank(String issueBank) {
        this.issueBank = issueBank;
    }

    public String getSaleArea() {
        return saleArea;
    }

    public void setSaleArea(String saleArea) {
        this.saleArea = saleArea;
    }

    public String getReplaceAmount() {
        return replaceAmount;
    }

    public void setReplaceAmount(String replaceAmount) {
        this.replaceAmount = replaceAmount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getIsFailureRate() {
        return isFailureRate;
    }

    public void setIsFailureRate(String isFailureRate) {
        this.isFailureRate = isFailureRate;
    }

    public String getFromCountry() {
        return fromCountry;
    }

    public void setFromCountry(String fromCountry) {
        this.fromCountry = fromCountry;
    }

    public String getToCountry() {
        return toCountry;
    }

    public void setToCountry(String toCountry) {
        this.toCountry = toCountry;
    }

    public Date getCteateTime() {
        return cteateTime;
    }

    public void setCteateTime(Date cteateTime) {
        this.cteateTime = cteateTime;
    }

    public BigDecimal getContStatus() {
        return contStatus;
    }

    public void setContStatus(BigDecimal contStatus) {
        this.contStatus = contStatus;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getPayCode2() {
        return payCode2;
    }

    public void setPayCode2(String payCode2) {
        this.payCode2 = payCode2;
    }

    public String getPayCode3() {
        return payCode3;
    }

    public void setPayCode3(String payCode3) {
        this.payCode3 = payCode3;
    }

    public String getPayCode4() {
        return payCode4;
    }

    public void setPayCode4(String payCode4) {
        this.payCode4 = payCode4;
    }

    public String getAmendClause() {
        return amendClause;
    }

    public void setAmendClause(String amendClause) {
        this.amendClause = amendClause;
    }

    public String getCustOthers() {
        return custOthers;
    }

    public void setCustOthers(String custOthers) {
        this.custOthers = custOthers;
    }

    public String getConPrice() {
        return conPrice;
    }

    public void setConPrice(String conPrice) {
        this.conPrice = conPrice;
    }

    public String getConPriceAverage() {
        return conPriceAverage;
    }

    public void setConPriceAverage(String conPriceAverage) {
        this.conPriceAverage = conPriceAverage;
    }

    public BigDecimal getContractType() {
        return contractType;
    }

    public void setContractType(BigDecimal contractType) {
        this.contractType = contractType;
    }

    public BigDecimal getContractLanguage() {
        return contractLanguage;
    }

    public void setContractLanguage(BigDecimal contractLanguage) {
        this.contractLanguage = contractLanguage;
    }

    public String getCustXwCode() {
        return custXwCode;
    }

    public void setCustXwCode(String custXwCode) {
        this.custXwCode = custXwCode;
    }

    public String getMarketXwCode() {
        return marketXwCode;
    }

    public void setMarketXwCode(String marketXwCode) {
        this.marketXwCode = marketXwCode;
    }

    public String getContractSum() {
        return contractSum;
    }

    public void setContractSum(String contractSum) {
        this.contractSum = contractSum;
    }

    public String getContractContext() {
        return contractContext;
    }

    public void setContractContext(String contractContext) {
        this.contractContext = contractContext;
    }

    public String getChangeXuyue() {
        return changeXuyue;
    }

    public void setChangeXuyue(String changeXuyue) {
        this.changeXuyue = changeXuyue;
    }

    public String getChangeQita() {
        return changeQita;
    }

    public void setChangeQita(String changeQita) {
        this.changeQita = changeQita;
    }

    public String getChangeContent() {
        return changeContent;
    }

    public void setChangeContent(String changeContent) {
        this.changeContent = changeContent;
    }

    public String getOldContractProcid() {
        return oldContractProcid;
    }

    public void setOldContractProcid(String oldContractProcid) {
        this.oldContractProcid = oldContractProcid;
    }

    public String getOldContractId() {
        return oldContractId;
    }

    public void setOldContractId(String oldContractId) {
        this.oldContractId = oldContractId;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "VLegOverserContractAll{" +
        "rowId=" + rowId +
        ", contId=" + contId +
        ", contNo=" + contNo +
        ", applierId=" + applierId +
        ", operaters=" + operaters +
        ", custInfo=" + custInfo +
        ", custNo=" + custNo +
        ", country=" + country +
        ", custXw=" + custXw +
        ", marketXw=" + marketXw +
        ", custCategory=" + custCategory +
        ", regFund=" + regFund +
        ", saleLastYear=" + saleLastYear +
        ", saleThisYear=" + saleThisYear +
        ", ranking=" + ranking +
        ", purAmount2017=" + purAmount2017 +
        ", overdue=" + overdue +
        ", overdueRate=" + overdueRate +
        ", overdueCount=" + overdueCount +
        ", lawsuit=" + lawsuit +
        ", marketBudget=" + marketBudget +
        ", uncertain=" + uncertain +
        ", businessModel=" + businessModel +
        ", avoidSchemea=" + avoidSchemea +
        ", conFund=" + conFund +
        ", conProduct=" + conProduct +
        ", conFundAverage=" + conFundAverage +
        ", conProductAverage=" + conProductAverage +
        ", payTypeList=" + payTypeList +
        ", avoidSchemeb=" + avoidSchemeb +
        ", standardContract=" + standardContract +
        ", dealType=" + dealType +
        ", currency=" + currency +
        ", financTerms=" + financTerms +
        ", signer=" + signer +
        ", clauseStartDate=" + clauseStartDate +
        ", clauseEndDate=" + clauseEndDate +
        ", forever=" + forever +
        ", afterSales=" + afterSales +
        ", saleQuantity=" + saleQuantity +
        ", saleRanking=" + saleRanking +
        ", famousBrand=" + famousBrand +
        ", cnCompany=" + cnCompany +
        ", otherProduct=" + otherProduct +
        ", company=" + company +
        ", product=" + product +
        ", brand=" + brand +
        ", seal=" + seal +
        ", sealName=" + sealName +
        ", procId=" + procId +
        ", proType=" + proType +
        ", purAmount2016=" + purAmount2016 +
        ", purAmount2015=" + purAmount2015 +
        ", payCode1=" + payCode1 +
        ", payOther=" + payOther +
        ", issueBank=" + issueBank +
        ", saleArea=" + saleArea +
        ", replaceAmount=" + replaceAmount +
        ", reason=" + reason +
        ", isFailureRate=" + isFailureRate +
        ", fromCountry=" + fromCountry +
        ", toCountry=" + toCountry +
        ", cteateTime=" + cteateTime +
        ", contStatus=" + contStatus +
        ", updateTime=" + updateTime +
        ", payCode2=" + payCode2 +
        ", payCode3=" + payCode3 +
        ", payCode4=" + payCode4 +
        ", amendClause=" + amendClause +
        ", custOthers=" + custOthers +
        ", conPrice=" + conPrice +
        ", conPriceAverage=" + conPriceAverage +
        ", contractType=" + contractType +
        ", contractLanguage=" + contractLanguage +
        ", custXwCode=" + custXwCode +
        ", marketXwCode=" + marketXwCode +
        ", contractSum=" + contractSum +
        ", contractContext=" + contractContext +
        ", changeXuyue=" + changeXuyue +
        ", changeQita=" + changeQita +
        ", changeContent=" + changeContent +
        ", oldContractProcid=" + oldContractProcid +
        ", oldContractId=" + oldContractId +
        "}";
    }
}
