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
 * @since 2020-08-05
 */
@TableName("leg_contract_hps")
public class LegContractHps extends Model<LegContractHps> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("contract_no")
    private String contractNo;
    /**
     * 合同名称
     */
    @TableField("contract_name")
    private String contractName;
    /**
     * 合同模板编号
     */
    @TableField("contract_tem_no")
    private String contractTemNo;
    /**
     * 合同类型
     */
    @TableField("contract_type")
    private String contractType;
    /**
     * 甲方
     */
    @TableField("party_a")
    private String partyA;
    /**
     * 乙方
     */
    @TableField("party_b")
    private String partyB;
    /**
     * 合同金额
     */
    @TableField("contract_amount")
    private Double contractAmount;
    /**
     * 合同生效时间
     */
    @TableField("effective_date")
    private String effectiveDate;
    /**
     * 合同签署方式 1：电子签章 2：线下
     */
    @TableField("sign_type")
    private String signType;
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
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    // 生效时间开始
    @TableField(exist = false)
    private String effectiveDateFrom;
    // 生效时间结束
    @TableField(exist = false)
    private String effectiveDateTo;

    public String getEffectiveDateFrom() {
        return effectiveDateFrom;
    }

    public void setEffectiveDateFrom(String effectiveDateFrom) {
        this.effectiveDateFrom = effectiveDateFrom;
    }

    public String getEffectiveDateTo() {
        return effectiveDateTo;
    }

    public void setEffectiveDateTo(String effectiveDateTo) {
        this.effectiveDateTo = effectiveDateTo;
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

    public String getContractTemNo() {
        return contractTemNo;
    }

    public void setContractTemNo(String contractTemNo) {
        this.contractTemNo = contractTemNo;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getPartyA() {
        return partyA;
    }

    public void setPartyA(String partyA) {
        this.partyA = partyA;
    }

    public String getPartyB() {
        return partyB;
    }

    public void setPartyB(String partyB) {
        this.partyB = partyB;
    }

    public Double getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(Double contractAmount) {
        this.contractAmount = contractAmount;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "LegContractHps{" +
        "id=" + id +
        ", contractNo=" + contractNo +
        ", contractName=" + contractName +
        ", contractTemNo=" + contractTemNo +
        ", contractType=" + contractType +
        ", partyA=" + partyA +
        ", partyB=" + partyB +
        ", contractAmount=" + contractAmount +
        ", effectiveDate=" + effectiveDate +
        ", signType=" + signType +
        ", fileName=" + fileName +
        ", filePath=" + filePath +
        ", createTime=" + createTime +
        "}";
    }
}
