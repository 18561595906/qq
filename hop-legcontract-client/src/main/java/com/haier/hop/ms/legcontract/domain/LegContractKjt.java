package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.enums.IdType;
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
 * @author shiyingxin
 * @since 2020-07-10
 */
@TableName("leg_contract_kjt")
public class LegContractKjt extends Model<LegContractKjt> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 合同编号
     */
    @TableField("contract_num")
    private String contractNum;
    /**
     * 合同名称
     */
    @TableField("contract_name")
    private String contractName;
    /**
     * 商户名称
     */
    @TableField("business_name")
    private String businessName;
    /**
     * 审批文本
     */
    @TableField("approval_content")
    private String approvalContent;
    /**
     * 签约文本
     */
    @TableField("signing_content")
    private String signingContent;
    /**
     * 签约时间
     */
    @TableField("signing_time")
    private String signingTime;
    /**
     * 合同创建时间
     */
    @TableField("create_time")
    private String createTime;
    @TableField("file_name")
    private String fileName;
    @TableField("file_path")
    private String filePath;
    @TableField("create_date")
    private Date createDate;
    // 创建时间开始
    @TableField(exist = false)
    private String createDateFrom;

    // 创建时间结束
    @TableField(exist = false)
    private String createDateTo;

    // 时间开始
    @TableField(exist = false)
    private String createDateFrom1;

    // 时间结束
    @TableField(exist = false)
    private String createDateTo1;

    public String getCreateDateFrom() {
        return createDateFrom;
    }

    public void setCreateDateFrom(String createDateFrom) {
        this.createDateFrom = createDateFrom;
    }

    public String getCreateDateTo() {
        return createDateTo;
    }

    public void setCreateDateTo(String createDateTo) {
        this.createDateTo = createDateTo;
    }

    public String getCreateDateFrom1() {
        return createDateFrom1;
    }

    public void setCreateDateFrom1(String createDateFrom1) {
        this.createDateFrom1 = createDateFrom1;
    }

    public String getCreateDateTo1() {
        return createDateTo1;
    }

    public void setCreateDateTo1(String createDateTo1) {
        this.createDateTo1 = createDateTo1;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContractNum() {
        return contractNum;
    }

    public void setContractNum(String contractNum) {
        this.contractNum = contractNum;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getApprovalContent() {
        return approvalContent;
    }

    public void setApprovalContent(String approvalContent) {
        this.approvalContent = approvalContent;
    }

    public String getSigningContent() {
        return signingContent;
    }

    public void setSigningContent(String signingContent) {
        this.signingContent = signingContent;
    }

    public String getSigningTime() {
        return signingTime;
    }

    public void setSigningTime(String signingTime) {
        this.signingTime = signingTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "LegContractKjt{" +
        "id=" + id +
        ", contractNum=" + contractNum +
        ", contractName=" + contractName +
        ", businessName=" + businessName +
        ", approvalContent=" + approvalContent +
        ", signingContent=" + signingContent +
        ", signingTime=" + signingTime +
        ", createTime=" + createTime +
        ", fileName=" + fileName +
        ", filePath=" + filePath +
        ", createDate=" + createDate +
        "}";
    }
}
