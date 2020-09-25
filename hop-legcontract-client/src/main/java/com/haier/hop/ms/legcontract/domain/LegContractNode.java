package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 标准节点表
 * </p>
 *
 * @author xuxu
 * @since 2019-06-17
 */
@TableName("leg_contract_node")
public class LegContractNode extends Model<LegContractNode> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 节点类别编码：A：自主申报；B：业务主人；C：全流程并联公议
	 */
	@TableField("NODE_TYPE_SN")
	private String nodeTypeSn;
	/**
	 * 节点类别名称
	 */
	@TableField("NODE_TYPE_NAME")
	private String nodeTypeName;
	/**
	 * 控制节点编码
	 */
	@TableField("NODE_SN")
	private String nodeSn;
	/**
	 * 控制节点名称
	 */
	@TableField("NODE_NAME")
	private String nodeName;
	/**
	 * 控制节点描述
	 */
	@TableField("NODE_DESC")
	private String nodeDesc;
	/**
	 * 创建时间
	 */
	@TableField("CREATE_DATE")
	private Date createDate;
	/**
	 * 创建人
	 */
	@TableField("CREATE_BY")
	private String createBy;
	/**
	 * 最后修改时间
	 */
	@TableField("UPDATE_DATE")
	private Date updateDate;
	/**
	 * 最后修改人
	 */
	@TableField("UPDATE_BY")
	private String updateBy;
	/**
	 * 1:有效 0:无效
	 */
	@TableField("DELETE_FLAG")
	private String deleteFlag;
	/**
	 * 控制节点描述(内部流程图)
	 */
	@TableField("NODE_DESC_INSIDE")
	private String nodeDescInside;

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

	public String getNodeSn() {
		return nodeSn;
	}

	public void setNodeSn(String nodeSn) {
		this.nodeSn = nodeSn;
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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getNodeDescInside() {
		return nodeDescInside;
	}

	public void setNodeDescInside(String nodeDescInside) {
		this.nodeDescInside = nodeDescInside;
	}

	@Override
	protected Serializable pkVal() {
		return this.rowId;
	}

	@Override
	public String toString() {
		return "LegContractNode{" + "rowId=" + rowId + ", nodeTypeSn=" + nodeTypeSn + ", nodeTypeName=" + nodeTypeName
				+ ", nodeSn=" + nodeSn + ", nodeName=" + nodeName + ", nodeDesc=" + nodeDesc + ", createDate="
				+ createDate + ", createBy=" + createBy + ", updateDate=" + updateDate + ", updateBy=" + updateBy
				+ ", deleteFlag=" + deleteFlag + ", nodeDescInside=" + nodeDescInside + "}";
	}
}
