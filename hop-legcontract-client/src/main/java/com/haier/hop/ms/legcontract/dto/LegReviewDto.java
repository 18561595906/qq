package com.haier.hop.ms.legcontract.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.haier.hop.ms.legcontract.domain.LegAttachment;
import com.haier.hop.ms.legcontract.domain.LegReviewHtglxt;

public class LegReviewDto {

    /**
     * 主键
     */
    @TableId("ROW_ID")
    private String rowId;
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

    private List<LegAttachment> atts;

    public List<LegAttachment> getAtts() {
        return atts;
    }

    public void setAtts(List<LegAttachment> atts) {
        this.atts = atts;
    }

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
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


    // 公议事项
    private String node_desc;

    // 责任位
    private String node_name;

    private List<LegReviewHtglxt> LegReviewList;

    public String getNode_desc() {
        return node_desc;
    }

    public void setNode_desc(String node_desc) {
        this.node_desc = node_desc;
    }

    public String getNode_name() {
        return node_name;
    }

    public void setNode_name(String node_name) {
        this.node_name = node_name;
    }

    public List<LegReviewHtglxt> getLegReviewList() {
        return LegReviewList;
    }

    public void setLegReviewList(List<LegReviewHtglxt> legReviewList) {
        LegReviewList = legReviewList;
    }
}
