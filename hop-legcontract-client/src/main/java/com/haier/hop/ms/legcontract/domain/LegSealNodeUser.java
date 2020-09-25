package com.haier.hop.ms.legcontract.domain;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 一般用印审批节点表
 * </p>
 *
 * @author wushilei
 * @since 2019-12-18
 */
@TableName("leg_seal_node_user")
public class LegSealNodeUser extends Model<LegSealNodeUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ROW_ID")
    private String rowId;
    /**
     * 节点编号
     */
    @TableField("NODE_TYPE_SN")
    private String nodeTypeSn;
    /**
     * 节点名称
     */
    @TableField("NODE_TYPE_NAME")
    private String nodeTypeName;
    /**
     * 用户工号
     */
    @TableField("NODE_USER_SN")
    private String nodeUserSn;
    /**
     * 用户名称
     */
    @TableField("NODE_USER_NAME")
    private String nodeUserName;
    /**
     * 关联id
     */
    @TableField("REAL_ID")
    private String realId;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getNodeTypeSn() {
        return nodeTypeSn;
    }

    public void setNodeTypeSn(String nodeTypeSn) {
        this.nodeTypeSn = nodeTypeSn;
    }

    public String getNodeTypeName() {
        return nodeTypeName;
    }

    public void setNodeTypeName(String nodeTypeName) {
        this.nodeTypeName = nodeTypeName;
    }

    public String getNodeUserSn() {
        return nodeUserSn;
    }

    public void setNodeUserSn(String nodeUserSn) {
        this.nodeUserSn = nodeUserSn;
    }

    public String getNodeUserName() {
        return nodeUserName;
    }

    public void setNodeUserName(String nodeUserName) {
        this.nodeUserName = nodeUserName;
    }

    public String getRealId() {
        return realId;
    }

    public void setRealId(String realId) {
        this.realId = realId;
    }

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegSealNodeUser{" +
        "rowId=" + rowId +
        ", nodeTypeSn=" + nodeTypeSn +
        ", nodeTypeName=" + nodeTypeName +
        ", nodeUserSn=" + nodeUserSn +
        ", nodeUserName=" + nodeUserName +
        ", realId=" + realId +
        "}";
    }
}
