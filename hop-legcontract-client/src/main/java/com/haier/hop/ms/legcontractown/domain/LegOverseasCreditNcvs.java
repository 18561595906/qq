package com.haier.hop.ms.legcontractown.domain;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * credit360应收逾期客户层级信息
 * </p>
 *
 * @author xuejinxin
 * @since 2020-04-16
 */
@TableName("leg_overseas_credit_ncvs")
public class LegOverseasCreditNcvs extends Model<LegOverseasCreditNcvs> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId("ID")
    private String id;
    /**
     * 公司编码
     */
    @TableField("CDEP_CODE")
    private String cdepCode;
    /**
     * 公司名称
     */
    @TableField("CDEP_NAME")
    private String cdepName;
    /**
     * 客户编码
     */
    @TableField("CCUS_CODE")
    private String ccusCode;
    /**
     * 客户名称
     */
    @TableField("CCUS_NAME")
    private String ccusName;
    /**
     * 应收总额
     */
    @TableField("IAR")
    private String iar;
    /**
     * 逾期总额
     */
    @TableField("IDUE")
    private String idue;
    /**
     * 3年内逾期次数
     */
    @TableField("IDUECOUNT")
    private String iduecount;
    /**
     * 日期
     */
    @TableField("DDATE")
    private Date ddate;
    /**
     * 是否有效 0有效，1删除
     */
    @TableField("FLAG")
    private String flag;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCdepCode() {
        return cdepCode;
    }

    public void setCdepCode(String cdepCode) {
        this.cdepCode = cdepCode;
    }

    public String getCdepName() {
        return cdepName;
    }

    public void setCdepName(String cdepName) {
        this.cdepName = cdepName;
    }

    public String getCcusCode() {
        return ccusCode;
    }

    public void setCcusCode(String ccusCode) {
        this.ccusCode = ccusCode;
    }

    public String getCcusName() {
        return ccusName;
    }

    public void setCcusName(String ccusName) {
        this.ccusName = ccusName;
    }

    public String getIar() {
        return iar;
    }

    public void setIar(String iar) {
        this.iar = iar;
    }

    public String getIdue() {
        return idue;
    }

    public void setIdue(String idue) {
        this.idue = idue;
    }

    public String getIduecount() {
        return iduecount;
    }

    public void setIduecount(String iduecount) {
        this.iduecount = iduecount;
    }

    public Date getDdate() {
        return ddate;
    }

    public void setDdate(Date ddate) {
        this.ddate = ddate;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "LegOverseasCreditNcvs{" +
        "id=" + id +
        ", cdepCode=" + cdepCode +
        ", cdepName=" + cdepName +
        ", ccusCode=" + ccusCode +
        ", ccusName=" + ccusName +
        ", iar=" + iar +
        ", idue=" + idue +
        ", iduecount=" + iduecount +
        ", ddate=" + ddate +
        ", flag=" + flag +
        "}";
    }
}
