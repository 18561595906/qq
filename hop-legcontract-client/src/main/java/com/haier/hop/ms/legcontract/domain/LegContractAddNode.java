package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.annotations.TableId;
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
 * @since 2019-09-05
 */
@TableName("leg_contract_add_node")
public class LegContractAddNode extends Model<LegContractAddNode> {

    private static final long serialVersionUID = 1L;

    @TableId("ROW_ID")
    private String rowId;
    /**
     * 节点id
     */
    @TableField("NODE_ID")
    private String nodeId;
    /**
     * 节点名称
     */
    @TableField("NODE_NAME")
    private String nodeName;
    /**
     * 节点描述
     */
    @TableField("NODE_DESC")
    private String nodeDesc;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getNodeDesc() {
        return nodeDesc;
    }

    public void setNodeDesc(String nodeDesc) {
        this.nodeDesc = nodeDesc;
    }

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegContractAddNode{" +
        "rowId=" + rowId +
        ", nodeId=" + nodeId +
        ", nodeName=" + nodeName +
        ", nodeDesc=" + nodeDesc +
        "}";
    }
}
