package com.haier.hop.ms.legcontract.domain;

import java.util.Date;
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
 * @since 2020-08-18
 */
@TableName("leg_base_report_comp")
public class LegBaseReportComp extends Model<LegBaseReportComp> {

    private static final long serialVersionUID = 1L;

    private Integer id;
    @TableField("company_statse")
    private String companyStatse;
    @TableField("company_code")
    private String companyCode;
    @TableField("company_name")
    private String companyName;
    @TableField("company_type")
    private String companyType;
    @TableField("bu_fu")
    private String buFu;
    @TableField("company_equity")
    private String companyEquity;
    @TableField("company_listed")
    private String companyListed;
    @TableField("create_time")
    private Date createTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyStatse() {
        return companyStatse;
    }

    public void setCompanyStatse(String companyStatse) {
        this.companyStatse = companyStatse;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getBuFu() {
        return buFu;
    }

    public void setBuFu(String buFu) {
        this.buFu = buFu;
    }

    public String getCompanyEquity() {
        return companyEquity;
    }

    public void setCompanyEquity(String companyEquity) {
        this.companyEquity = companyEquity;
    }

    public String getCompanyListed() {
        return companyListed;
    }

    public void setCompanyListed(String companyListed) {
        this.companyListed = companyListed;
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
        return "LegBaseReportComp{" +
        "id=" + id +
        ", companyStatse=" + companyStatse +
        ", companyCode=" + companyCode +
        ", companyName=" + companyName +
        ", companyType=" + companyType +
        ", buFu=" + buFu +
        ", companyEquity=" + companyEquity +
        ", companyListed=" + companyListed +
        ", createTime=" + createTime +
        "}";
    }
}
