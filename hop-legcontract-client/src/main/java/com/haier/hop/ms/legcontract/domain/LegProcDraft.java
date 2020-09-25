package com.haier.hop.ms.legcontract.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 草稿
 * </p>
 *
 * @author xuejinxin
 * @since 2019-09-23
 */
@TableName("leg_proc_draft")
public class LegProcDraft extends Model<LegProcDraft> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableField("ROW_ID")
    private String rowId;
    /**
     * 草稿类型0：公司服务1：印章服务2：案件管理3：用印申请4：综合服务5：项目服务
     */
    @TableField("TYPE")
    private String type;
    /**
     * 申请人
     */
    @TableField("PROPOSER")
    private String proposer;
    /**
     * 申请人名称
     */
    @TableField("PROPOSER_NAME")
    private String proposerName;
    /**
     * 申请时间
     */
    @TableField("APPLICATION_TIME")
    private Date applicationTime;
    /**
     * 业务单元拼接名称
     */
    @TableField("SOME_UNIT")
    private String someUnit;
    /**
     * 链接地址
     */
    @TableField("HREF")
    private String href;
    /**
     * 草稿描述
     */
    @TableField("DESCRPTION")
    private String descrption;
    /**
     * 状态【1：有效；2：删除】
     */
    @TableField("STATUS")
    private BigDecimal status;
    /**
     * 关联表的主键（rowId）
     */
    @TableField("RELATEID")
    private String relateid;
    /**
     * 关联表表名
     */
    @TableField("RELATE_TABLE")
    private String relateTable;
    /**
     * 草稿名称
     */
    @TableField("SOME_NAME")
    private String someName;
    /**
     * 流程名称0：公司新设1：公司变更2：公司注销3：单方文件4：印章使用5：印章刻制6：案件新增7：法律报告文件8：用印申请9：项目支持10：项目支持管理
     */
    @TableField("PROC_NAME")
    private String procName;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProposer() {
        return proposer;
    }

    public void setProposer(String proposer) {
        this.proposer = proposer;
    }

    public String getProposerName() {
        return proposerName;
    }

    public void setProposerName(String proposerName) {
        this.proposerName = proposerName;
    }

    public Date getApplicationTime() {
        return applicationTime;
    }

    public void setApplicationTime(Date applicationTime) {
        this.applicationTime = applicationTime;
    }

    public String getSomeUnit() {
        return someUnit;
    }

    public void setSomeUnit(String someUnit) {
        this.someUnit = someUnit;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public String getRelateid() {
        return relateid;
    }

    public void setRelateid(String relateid) {
        this.relateid = relateid;
    }

    public String getRelateTable() {
        return relateTable;
    }

    public void setRelateTable(String relateTable) {
        this.relateTable = relateTable;
    }

    public String getSomeName() {
        return someName;
    }

    public void setSomeName(String someName) {
        this.someName = someName;
    }

    public String getProcName() {
        return procName;
    }

    public void setProcName(String procName) {
        this.procName = procName;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegProcDraft{" +
        "rowId=" + rowId +
        ", type=" + type +
        ", proposer=" + proposer +
        ", proposerName=" + proposerName +
        ", applicationTime=" + applicationTime +
        ", someUnit=" + someUnit +
        ", href=" + href +
        ", descrption=" + descrption +
        ", status=" + status +
        ", relateid=" + relateid +
        ", relateTable=" + relateTable +
        ", someName=" + someName +
        ", procName=" + procName +
        "}";
    }
}
