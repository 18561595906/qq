package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author wushilei
 * @since 2020-05-27
 */
@TableName("leg_crm_regis_form")
public class LegCrmRegisForm extends Model<LegCrmRegisForm> {

    private static final long serialVersionUID = 1L;

    @TableField("row_id")
    private String rowId;
    /**
     * 合同流水号
     */
    @TableField("cont_no")
    private String contNo;
    /**
     * 成本——预估——供应商
     */
    @TableField("predict_su")
    private String predictSu;
    /**
     * 成本——结论——供应商
     */
    @TableField("conclu_su")
    private String concluSu;
    /**
     * 是否是背靠背业务——供应商
     */
    @TableField("is_btb_su")
    private String isBtbSu;
    /**
     * 客户评级——客户
     */
    @TableField("cust_cu")
    private String custCu;
    /**
     * 经营贡献率——要求——客户
     */
    @TableField("require_cu")
    private String requireCu;
    /**
     * 经营贡献率——预估——客户
     */
    @TableField("predict_cu")
    private String predictCu;
    /**
     * 经营贡献率——结论——客户
     */
    @TableField("conclu_cu")
    private String concluCu;
    /**
     * 毛利率——客户
     */
    @TableField("gps_cu")
    private String gpsCu;
    /**
     * 是否是背靠背业务——客户
     */
    @TableField("is_btb_cu")
    private String isBtbCu;
    /**
     * 合同类别（C:客户合同；S:供应商合同）
     */
    @TableField("cu_or_su")
    private String cuOrSu;
    /**
     * 开始时间
     */
    @TableField("receive_time")
    private Date receiveTime;
    /**
     * 付款方式
     */
    @TableField("pay_type")
    private String payType;
    /**
     * 毛利率结论
     */
    @TableField("gps_conclu_cu")
    private String gpsConcluCu;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getContNo() {
        return contNo;
    }

    public void setContNo(String contNo) {
        this.contNo = contNo;
    }

    public String getPredictSu() {
        return predictSu;
    }

    public void setPredictSu(String predictSu) {
        this.predictSu = predictSu;
    }

    public String getConcluSu() {
        return concluSu;
    }

    public void setConcluSu(String concluSu) {
        this.concluSu = concluSu;
    }

    public String getIsBtbSu() {
        return isBtbSu;
    }

    public void setIsBtbSu(String isBtbSu) {
        this.isBtbSu = isBtbSu;
    }

    public String getCustCu() {
        return custCu;
    }

    public void setCustCu(String custCu) {
        this.custCu = custCu;
    }

    public String getRequireCu() {
        return requireCu;
    }

    public void setRequireCu(String requireCu) {
        this.requireCu = requireCu;
    }

    public String getPredictCu() {
        return predictCu;
    }

    public void setPredictCu(String predictCu) {
        this.predictCu = predictCu;
    }

    public String getConcluCu() {
        return concluCu;
    }

    public void setConcluCu(String concluCu) {
        this.concluCu = concluCu;
    }

    public String getGpsCu() {
        return gpsCu;
    }

    public void setGpsCu(String gpsCu) {
        this.gpsCu = gpsCu;
    }

    public String getIsBtbCu() {
        return isBtbCu;
    }

    public void setIsBtbCu(String isBtbCu) {
        this.isBtbCu = isBtbCu;
    }

    public String getCuOrSu() {
        return cuOrSu;
    }

    public void setCuOrSu(String cuOrSu) {
        this.cuOrSu = cuOrSu;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getGpsConcluCu() {
        return gpsConcluCu;
    }

    public void setGpsConcluCu(String gpsConcluCu) {
        this.gpsConcluCu = gpsConcluCu;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegCrmRegisForm{" +
        "rowId=" + rowId +
        ", contNo=" + contNo +
        ", predictSu=" + predictSu +
        ", concluSu=" + concluSu +
        ", isBtbSu=" + isBtbSu +
        ", custCu=" + custCu +
        ", requireCu=" + requireCu +
        ", predictCu=" + predictCu +
        ", concluCu=" + concluCu +
        ", gpsCu=" + gpsCu +
        ", isBtbCu=" + isBtbCu +
        ", cuOrSu=" + cuOrSu +
        ", receiveTime=" + receiveTime +
        "}";
    }
}
