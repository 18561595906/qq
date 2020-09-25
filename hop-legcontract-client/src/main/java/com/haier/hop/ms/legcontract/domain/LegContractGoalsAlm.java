package com.haier.hop.ms.legcontract.domain;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * ALM里程碑信息表
 * </p>
 *
 * @author xuxu
 * @since 2019-06-24
 */
@TableName("leg_contract_goals_alm")
public class LegContractGoalsAlm extends Model<LegContractGoalsAlm> {

    private static final long serialVersionUID = 1L;

    /**
     * 里程碑ID
     */
    @TableField("ID")
    private String id;
    /**
     * 里程碑名称
     */
    @TableField("LCHB")
    private String lchb;
    /**
     * 里程碑描述
     */
    @TableField("LCHBDES")
    private String lchbdes;
    /**
     * 里程碑开始时间
     */
    @TableField("LCHBKSRQ")
    private String lchbksrq;
    /**
     * 乙方交付时间
     */
    @TableField("LCHBYFJHJFRQ")
    private String lchbyfjhjfrq;
    /**
     * 甲方验收时间（里程碑结束时间）
     */
    @TableField("LCHBJSRQ")
    private String lchbjsrq;
    /**
     * 是否付款 NUMBER, 1：是，0：否
     */
    @TableField("PAYSTATUS")
    private String paystatus;
    /**
     * 付款金额 
     */
    @TableField("FKJE")
    private BigDecimal fkje;
    /**
     * 付款截止时间
     */
    @TableField("FKRQ")
    private String fkrq;
    /**
     * 乙方实际交付时间(里程碑付款完成时)
     */
    @TableField("LCHBYFSJJFRQ")
    private String lchbyfsjjfrq;
    /**
     * 甲方实际验收时间(里程碑付款完成时)
     */
    @TableField("ACTUALFINISHTIME")
    private String actualfinishtime;
    /**
     * 实际付款时间（MPC支付时间）(里程碑付款完成时)
     */
    @TableField("PAYTIME")
    private String paytime;
    /**
     * 实际付款金额(里程碑付款完成时)
     */
    @TableField("PAYREALJINE")
    private BigDecimal payrealjine;
    /**
     * 里程碑调整开始时间(如果中间有合同变更)
     */
    @TableField("TZHKSHTIME")
    private String tzhkshtime;
    /**
     * 乙方调整交付时间(如果中间有合同变更)
     */
    @TableField("YFTZHJFRQ")
    private String yftzhjfrq;
    /**
     * 付款调整截止时间(如果中间有合同变更)
     */
    @TableField("FKTZHJZHRQ")
    private String fktzhjzhrq;
    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private String createTime;
    /**
     * 甲方调整验收时间（里程碑结束时间）
     */
    @TableField("TZHJSHTIME")
    private String tzhjshtime;
    /**
     * 合同ID，关联合同表用
     */
    @TableField("CONTRACT_ID")
    private String contractId;
    /**
     * 申请类型
     */
    @TableField("REQUEST_TYPE")
    private String requestType;
    /**
     * 最后修改时间
     */
    @TableField("MODIFICATION_DATE")
    private String modificationDate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLchb() {
        return lchb;
    }

    public void setLchb(String lchb) {
        this.lchb = lchb;
    }

    public String getLchbdes() {
        return lchbdes;
    }

    public void setLchbdes(String lchbdes) {
        this.lchbdes = lchbdes;
    }

    public String getLchbksrq() {
        return lchbksrq;
    }

    public void setLchbksrq(String lchbksrq) {
        this.lchbksrq = lchbksrq;
    }

    public String getLchbyfjhjfrq() {
        return lchbyfjhjfrq;
    }

    public void setLchbyfjhjfrq(String lchbyfjhjfrq) {
        this.lchbyfjhjfrq = lchbyfjhjfrq;
    }

    public String getLchbjsrq() {
        return lchbjsrq;
    }

    public void setLchbjsrq(String lchbjsrq) {
        this.lchbjsrq = lchbjsrq;
    }

    public String getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(String paystatus) {
        this.paystatus = paystatus;
    }

    public BigDecimal getFkje() {
        return fkje;
    }

    public void setFkje(BigDecimal fkje) {
        this.fkje = fkje;
    }

    public String getFkrq() {
        return fkrq;
    }

    public void setFkrq(String fkrq) {
        this.fkrq = fkrq;
    }

    public String getLchbyfsjjfrq() {
        return lchbyfsjjfrq;
    }

    public void setLchbyfsjjfrq(String lchbyfsjjfrq) {
        this.lchbyfsjjfrq = lchbyfsjjfrq;
    }

    public String getActualfinishtime() {
        return actualfinishtime;
    }

    public void setActualfinishtime(String actualfinishtime) {
        this.actualfinishtime = actualfinishtime;
    }

    public String getPaytime() {
        return paytime;
    }

    public void setPaytime(String paytime) {
        this.paytime = paytime;
    }

    public BigDecimal getPayrealjine() {
        return payrealjine;
    }

    public void setPayrealjine(BigDecimal payrealjine) {
        this.payrealjine = payrealjine;
    }

    public String getTzhkshtime() {
        return tzhkshtime;
    }

    public void setTzhkshtime(String tzhkshtime) {
        this.tzhkshtime = tzhkshtime;
    }

    public String getYftzhjfrq() {
        return yftzhjfrq;
    }

    public void setYftzhjfrq(String yftzhjfrq) {
        this.yftzhjfrq = yftzhjfrq;
    }

    public String getFktzhjzhrq() {
        return fktzhjzhrq;
    }

    public void setFktzhjzhrq(String fktzhjzhrq) {
        this.fktzhjzhrq = fktzhjzhrq;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getTzhjshtime() {
        return tzhjshtime;
    }

    public void setTzhjshtime(String tzhjshtime) {
        this.tzhjshtime = tzhjshtime;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(String modificationDate) {
        this.modificationDate = modificationDate;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegContractGoalsAlm{" +
        "id=" + id +
        ", lchb=" + lchb +
        ", lchbdes=" + lchbdes +
        ", lchbksrq=" + lchbksrq +
        ", lchbyfjhjfrq=" + lchbyfjhjfrq +
        ", lchbjsrq=" + lchbjsrq +
        ", paystatus=" + paystatus +
        ", fkje=" + fkje +
        ", fkrq=" + fkrq +
        ", lchbyfsjjfrq=" + lchbyfsjjfrq +
        ", actualfinishtime=" + actualfinishtime +
        ", paytime=" + paytime +
        ", payrealjine=" + payrealjine +
        ", tzhkshtime=" + tzhkshtime +
        ", yftzhjfrq=" + yftzhjfrq +
        ", fktzhjzhrq=" + fktzhjzhrq +
        ", createTime=" + createTime +
        ", tzhjshtime=" + tzhjshtime +
        ", contractId=" + contractId +
        ", requestType=" + requestType +
        ", modificationDate=" + modificationDate +
        "}";
    }
}
