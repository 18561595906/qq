package com.haier.hop.ms.legcontract.domain;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 对端系统报文日志
 * </p>
 *
 * @author wdh
 * @since 2019-11-07
 */
@TableName("leg_peer_system_log")
public class LegPeerSystemLog extends Model<LegPeerSystemLog> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ROW_ID")
    private String rowId;
    /**
     * 业务类型：contact、company、seal、synthesize
     */
    @TableField("buss_type")
    private String bussType;
    /**
     * 应用类
     */
    @TableField("apply_class")
    private String applyClass;
    /**
     * 系统来源
     */
    @TableField("SYS_ID")
    private String sysId;
    /**
     * 关联ID
     */
    @TableField("rela_id")
    private String relaId;
    /**
     * 报文内容
     */
    private byte[] content;
    /**
     * 创建时间
     */
    @TableField("CREATED_DATE")
    private Date createdDate;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getBussType() {
        return bussType;
    }

    public void setBussType(String bussType) {
        this.bussType = bussType;
    }

    public String getApplyClass() {
        return applyClass;
    }

    public void setApplyClass(String applyClass) {
        this.applyClass = applyClass;
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getRelaId() {
        return relaId;
    }

    public void setRelaId(String relaId) {
        this.relaId = relaId;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegPeerSystemLog{" +
        "rowId=" + rowId +
        ", bussType=" + bussType +
        ", applyClass=" + applyClass +
        ", sysId=" + sysId +
        ", relaId=" + relaId +
        ", content=" + content +
        ", createdDate=" + createdDate +
        "}";
    }
}
