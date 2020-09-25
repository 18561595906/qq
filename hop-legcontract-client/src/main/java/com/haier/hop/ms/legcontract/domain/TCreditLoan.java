package com.haier.hop.ms.legcontract.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 互联网金融合同信息对接：贷款申请表
 * </p>
 *
 * @author shiyingxin
 * @since 2020-04-08
 */
@TableName("t_credit_loan")
public class TCreditLoan extends Model<TCreditLoan> {

    private static final long serialVersionUID = 1L;

    /**
     * 经销商账户分类编码
     */
    @TableField("dealer_account_code")
    private String dealerAccountCode;
    /**
     * 经销商账户分类名称
     */
    @TableField("dealer_account_name")
    private String dealerAccountName;
    /**
     * 海融易登录号
     */
    @TableField("hry_login")
    private String hryLogin;
    /**
     * 实际借款人名称
     */
    @TableField("actual_customer_name")
    private String actualCustomerName;
    /**
     * 核心企业编号
     */
    @TableField("core_company_code")
    private String coreCompanyCode;
    /**
     * 核心企业名称
     */
    @TableField("core_company_name")
    private String coreCompanyName;
    /**
     * 客户ID
     */
    @TableField("customer_id")
    private String customerId;
    /**
     * 客户名称
     */
    @TableField("customer_name")
    private String customerName;
    /**
     * 申请贷款金额
     */
    @TableField("loan_amount")
    private BigDecimal loanAmount;
    /**
     * 申请贷款期限
     */
    @TableField("due_time")
    private String dueTime;
    /**
     * 保证金金额
     */
    @TableField("margin_amount")
    private BigDecimal marginAmount;
    /**
     * 贷款利率
     */
    @TableField("interest_rate")
    private BigDecimal interestRate;
    /**
     * 还款方式
     */
    @TableField("repayment_type")
    private String repaymentType;
    /**
     * 备注
     */
    @TableField("loan_comment")
    private String loanComment;
    /**
     * 融资渠道
     */
    private String channel;
    /**
     * 审批人
     */
    private String reviewer;
    /**
     * 贷款成交金额
     */
    @TableField("loan_effective_amount")
    private BigDecimal loanEffectiveAmount;
    /**
     * p2p总金额
     */
    @TableField("p2p_total_amount")
    private BigDecimal p2pTotalAmount;
    /**
     * 合作公司代码
     */
    @TableField("co_company_code")
    private String coCompanyCode;
    /**
     * 实际放款金额
     */
    @TableField("real_amount")
    private BigDecimal realAmount;
    /**
     * 服务费
     */
    @TableField("fee_amount")
    private String feeAmount;
    /**
     * 同步时间
     */
    @TableField("sync_time")
    private Date syncTime;


    public String getDealerAccountCode() {
        return dealerAccountCode;
    }

    public void setDealerAccountCode(String dealerAccountCode) {
        this.dealerAccountCode = dealerAccountCode;
    }

    public String getDealerAccountName() {
        return dealerAccountName;
    }

    public void setDealerAccountName(String dealerAccountName) {
        this.dealerAccountName = dealerAccountName;
    }

    public String getHryLogin() {
        return hryLogin;
    }

    public void setHryLogin(String hryLogin) {
        this.hryLogin = hryLogin;
    }

    public String getActualCustomerName() {
        return actualCustomerName;
    }

    public void setActualCustomerName(String actualCustomerName) {
        this.actualCustomerName = actualCustomerName;
    }

    public String getCoreCompanyCode() {
        return coreCompanyCode;
    }

    public void setCoreCompanyCode(String coreCompanyCode) {
        this.coreCompanyCode = coreCompanyCode;
    }

    public String getCoreCompanyName() {
        return coreCompanyName;
    }

    public void setCoreCompanyName(String coreCompanyName) {
        this.coreCompanyName = coreCompanyName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getDueTime() {
        return dueTime;
    }

    public void setDueTime(String dueTime) {
        this.dueTime = dueTime;
    }

    public BigDecimal getMarginAmount() {
        return marginAmount;
    }

    public void setMarginAmount(BigDecimal marginAmount) {
        this.marginAmount = marginAmount;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public String getRepaymentType() {
        return repaymentType;
    }

    public void setRepaymentType(String repaymentType) {
        this.repaymentType = repaymentType;
    }

    public String getLoanComment() {
        return loanComment;
    }

    public void setLoanComment(String loanComment) {
        this.loanComment = loanComment;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public BigDecimal getLoanEffectiveAmount() {
        return loanEffectiveAmount;
    }

    public void setLoanEffectiveAmount(BigDecimal loanEffectiveAmount) {
        this.loanEffectiveAmount = loanEffectiveAmount;
    }

    public BigDecimal getP2pTotalAmount() {
        return p2pTotalAmount;
    }

    public void setP2pTotalAmount(BigDecimal p2pTotalAmount) {
        this.p2pTotalAmount = p2pTotalAmount;
    }

    public String getCoCompanyCode() {
        return coCompanyCode;
    }

    public void setCoCompanyCode(String coCompanyCode) {
        this.coCompanyCode = coCompanyCode;
    }

    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    public String getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    public Date getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Date syncTime) {
        this.syncTime = syncTime;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "TCreditLoan{" +
        "dealerAccountCode=" + dealerAccountCode +
        ", dealerAccountName=" + dealerAccountName +
        ", hryLogin=" + hryLogin +
        ", actualCustomerName=" + actualCustomerName +
        ", coreCompanyCode=" + coreCompanyCode +
        ", coreCompanyName=" + coreCompanyName +
        ", customerId=" + customerId +
        ", customerName=" + customerName +
        ", loanAmount=" + loanAmount +
        ", dueTime=" + dueTime +
        ", marginAmount=" + marginAmount +
        ", interestRate=" + interestRate +
        ", repaymentType=" + repaymentType +
        ", loanComment=" + loanComment +
        ", channel=" + channel +
        ", reviewer=" + reviewer +
        ", loanEffectiveAmount=" + loanEffectiveAmount +
        ", p2pTotalAmount=" + p2pTotalAmount +
        ", coCompanyCode=" + coCompanyCode +
        ", realAmount=" + realAmount +
        ", feeAmount=" + feeAmount +
        ", syncTime=" + syncTime +
        "}";
    }
}
