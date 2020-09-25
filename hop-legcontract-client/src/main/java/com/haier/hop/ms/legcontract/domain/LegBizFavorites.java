package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author wushilei
 * @since 2020-05-07
 */
@TableName("leg_biz_favorites")
public class LegBizFavorites extends Model<LegBizFavorites> {

    private static final long serialVersionUID = 1L;

    @TableId("ROW_ID")
    private String rowId;
    /**
     * 收藏的业务单元名称
     */
    @TableField("BIZ_NAME")
    private String bizName;
    /**
     * 收藏的业务单元编码
     */
    @TableField("BIZ_CODE")
    private String bizCode;
    /**
     * 创建人
     */
    @TableField("CREATED_BY")
    private String createdBy;
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

    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName;
    }

    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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
        return "LegBizFavorites{" +
        "rowId=" + rowId +
        ", bizName=" + bizName +
        ", bizCode=" + bizCode +
        ", createdBy=" + createdBy +
        ", createdDate=" + createdDate +
        "}";
    }
}
