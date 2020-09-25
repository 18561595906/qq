package com.haier.hop.ms.legcontract.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wangdh
 * @since 2019-07-30
 */
@TableName("leg_review_htglxt")
public class LegReviewHtglxt extends Model<LegReviewHtglxt> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ROW_ID")
    private BigDecimal rowId;
    /**
     * 审核人编码
     */
    @TableField("REVIEW_SN")
    private String reviewSn;
    /**
     * 审核人
     */
    @TableField("REVIEW_USER")
    private String reviewUser;
    /**
     * 审核结果
     */
    @TableField("REVIEW_RESULT")
    private String reviewResult;
    /**
     * 审核时间
     */
    @TableField("REVIEW_DATE")
    private Date reviewDate;
    /**
     * 审批意见
     */
    @TableField("REVIEW_DESC")
    private String reviewDesc;
    /**
     * 流程实例ID
     */
    @TableField("PRO_ID")
    private String proId;
    /**
     * 节点名称
     */
    @TableField("NODE_NAME")
    private String nodeName;
    /**
     * 版本号
     */
    @TableField("VERSION_NO")
    private BigDecimal versionNo;
    /**
     * 是否删除
     */
    @TableField("IS_DELETE")
    private BigDecimal isDelete;
    /**
     * 审批轮数
     */
    @TableField("REVIEW_NUMBER")
    private BigDecimal reviewNumber;
    /**
     * 节点ID
     */
    @TableField("NODE_ID")
    private String nodeId;
    /**
     * 节点描述
     */
    @TableField("NODE_DESC")
    private String nodeDesc;
    @TableField("ACCOUNT_PERIOD")
    private String accountPeriod;
    @TableField("RISK_MORTGAGE")
    private String riskMortgage;


    public BigDecimal getRowId() {
        return rowId;
    }

    public void setRowId(BigDecimal rowId) {
        this.rowId = rowId;
    }

    public String getReviewSn() {
        return reviewSn;
    }

    public void setReviewSn(String reviewSn) {
        this.reviewSn = reviewSn;
    }

    public String getReviewUser() {
        return reviewUser;
    }

    public void setReviewUser(String reviewUser) {
        this.reviewUser = reviewUser;
    }

    public String getReviewResult() {
        return reviewResult;
    }

    public void setReviewResult(String reviewResult) {
        this.reviewResult = reviewResult;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getReviewDesc() {
        return reviewDesc;
    }

    public void setReviewDesc(String reviewDesc) {
        this.reviewDesc = reviewDesc;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public BigDecimal getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(BigDecimal versionNo) {
        this.versionNo = versionNo;
    }

    public BigDecimal getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(BigDecimal isDelete) {
        this.isDelete = isDelete;
    }

    public BigDecimal getReviewNumber() {
        return reviewNumber;
    }

    public void setReviewNumber(BigDecimal reviewNumber) {
        this.reviewNumber = reviewNumber;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeDesc() {
        return nodeDesc;
    }

    public void setNodeDesc(String nodeDesc) {
        this.nodeDesc = nodeDesc;
    }

    public String getAccountPeriod() {
        return accountPeriod;
    }

    public void setAccountPeriod(String accountPeriod) {
        this.accountPeriod = accountPeriod;
    }

    public String getRiskMortgage() {
        return riskMortgage;
    }

    public void setRiskMortgage(String riskMortgage) {
        this.riskMortgage = riskMortgage;
    }

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegReviewHtglxt{" +
        "rowId=" + rowId +
        ", reviewSn=" + reviewSn +
        ", reviewUser=" + reviewUser +
        ", reviewResult=" + reviewResult +
        ", reviewDate=" + reviewDate +
        ", reviewDesc=" + reviewDesc +
        ", proId=" + proId +
        ", nodeName=" + nodeName +
        ", versionNo=" + versionNo +
        ", isDelete=" + isDelete +
        ", reviewNumber=" + reviewNumber +
        ", nodeId=" + nodeId +
        ", nodeDesc=" + nodeDesc +
        ", accountPeriod=" + accountPeriod +
        ", riskMortgage=" + riskMortgage +
        "}";
    }
}
