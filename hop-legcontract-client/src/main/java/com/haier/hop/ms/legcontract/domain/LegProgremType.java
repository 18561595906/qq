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
 * @since 2019-09-18
 */
@TableName("leg_progrem_type")
public class LegProgremType extends Model<LegProgremType> {

    private static final long serialVersionUID = 1L;

    @TableField("PROC_ID")
    private String procId;
    @TableField("NODE_NAME")
    private String nodeName;
    @TableField("PRO_TYPE")
    private String proType;
    @TableField("USER_ID")
    private String userId;
    @TableField("CREATE_TIME")
    private Date createTime;


    public String getProcId() {
        return procId;
    }

    public void setProcId(String procId) {
        this.procId = procId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getProType() {
        return proType;
    }

    public void setProType(String proType) {
        this.proType = proType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegProgremType{" +
        "procId=" + procId +
        ", nodeName=" + nodeName +
        ", proType=" + proType +
        ", userId=" + userId +
        ", createTime=" + createTime +
        "}";
    }
}
