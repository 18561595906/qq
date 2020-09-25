package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2020-07-31
 */
@TableName("leg_contract_market")
public class LegContractMarket extends Model<LegContractMarket> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 合同编号
     */
    @TableField("contract_no")
    private String contractNo;
    /**
     * 合同名称
     */
    @TableField("contract_name")
    private String contractName;
    /**
     * 签约双方
     */
    @TableField("contract_parties")
    private String contractParties;
    /**
     * 合同金额
     */
    @TableField("contract_amount")
    private Double contractAmount;
    /**
     * 签约时间
     */
    @TableField("sign_date")
    private String signDate;
    /**
     * 生效方式
     */
    @TableField("effective_type")
    private String effectiveType;
    /**
     * 附件名称
     */
    @TableField("file_name")
    private String fileName;
    /**
     * 附件路径
     */
    @TableField("file_path")
    private String filePath;
    /**
     * 时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 附件
     */
    @TableField(exist = false)
    private MultipartFile file;
    // 签约时间开始
    @TableField(exist = false)
    private String createDateFrom;
    // 签约时间结束
    @TableField(exist = false)
    private String createDateTo;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getContractParties() {
        return contractParties;
    }

    public void setContractParties(String contractParties) {
        this.contractParties = contractParties;
    }

    public Double getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(Double contractAmount) {
        this.contractAmount = contractAmount;
    }

    public String getSignDate() {
        return signDate;
    }

    public void setSignDate(String signDate) {
        this.signDate = signDate;
    }

    public String getEffectiveType() {
        return effectiveType;
    }

    public void setEffectiveType(String effectiveType) {
        this.effectiveType = effectiveType;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "LegContractMarket{" +
        "id=" + id +
        ", contractNo=" + contractNo +
        ", contractName=" + contractName +
        ", contractParties=" + contractParties +
        ", contractAmount=" + contractAmount +
        ", signDate=" + signDate +
        ", effectiveType=" + effectiveType +
        ", fileName=" + fileName +
        ", filePath=" + filePath +
        ", createTime=" + createTime +
        "}";
    }
}
