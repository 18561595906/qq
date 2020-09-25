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
 * @author wdh
 * @since 2019-07-24
 */
@TableName("leg_pageoffice_detail")
public class LegPageofficeDetail extends Model<LegPageofficeDetail> {

    private static final long serialVersionUID = 1L;

    @TableField("row_id")
    private String rowId;
    /**
     * 关联表rowId
     */
    @TableField("rela_id")
    private String relaId;
    /**
     * 附件rowId
     */
    @TableField("att_id")
    private String attId;
    /**
     * 创建时间
     */
    @TableField("create_date")
    private Date createDate;
    /**
     * 0：打开  1：已关闭
     */
    @TableField("is_valid")
    private String isValid;
    /**
     * 更新时间
     */
    @TableField("update_date")
    private Date updateDate;
    /**
     * 原附件rowId
     */
    @TableField("old_att_id")
    private String oldAttId;
    /**
     * 快速通道书签标识
     */
    @TableField("channel_fast")
    private String channelFast;
    /**
     * 符合快速通道的书签数量
     */
    private String size;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getRelaId() {
        return relaId;
    }

    public void setRelaId(String relaId) {
        this.relaId = relaId;
    }

    public String getAttId() {
        return attId;
    }

    public void setAttId(String attId) {
        this.attId = attId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getOldAttId() {
        return oldAttId;
    }

    public void setOldAttId(String oldAttId) {
        this.oldAttId = oldAttId;
    }

    public String getChannelFast() {
        return channelFast;
    }

    public void setChannelFast(String channelFast) {
        this.channelFast = channelFast;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegPageofficeDetail{" +
        "rowId=" + rowId +
        ", relaId=" + relaId +
        ", attId=" + attId +
        ", createDate=" + createDate +
        ", isValid=" + isValid +
        ", updateDate=" + updateDate +
        ", oldAttId=" + oldAttId +
        ", channelFast=" + channelFast +
        ", size=" + size +
        "}";
    }
}
