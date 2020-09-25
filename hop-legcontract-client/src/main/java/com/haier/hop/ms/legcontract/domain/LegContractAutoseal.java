package com.haier.hop.ms.legcontract.domain;

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
 * @since 2019-07-10
 */
@TableName("leg_contract_autoseal")
public class LegContractAutoseal extends Model<LegContractAutoseal> {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;
    @TableField("BIZ_CODE")
    private String bizCode;
    @TableField("BIZ_NAME")
    private String bizName;
    @TableField("CONTRACT_CODE")
    private String contractCode;
    @TableField("CONTRACT_NAME")
    private String contractName;
    @TableField("PARTNERS_NO")
    private String partnersNo;
    @TableField("PARTNERS_NAME")
    private String partnersName;
    @TableField("CREATE_TIME")
    private Date createTime;
    @TableField("CREATE_BY")
    private String createBy;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName;
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

    public String getPartnersNo() {
        return partnersNo;
    }

    public void setPartnersNo(String partnersNo) {
        this.partnersNo = partnersNo;
    }

    public String getPartnersName() {
        return partnersName;
    }

    public void setPartnersName(String partnersName) {
        this.partnersName = partnersName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "LegContractAutoseal{" +
        "id=" + id +
        ", bizCode=" + bizCode +
        ", bizName=" + bizName +
        ", contractCode=" + contractCode +
        ", contractName=" + contractName +
        ", partnersNo=" + partnersNo +
        ", partnersName=" + partnersName +
        ", createTime=" + createTime +
        ", createBy=" + createBy +
        "}";
    }
}
