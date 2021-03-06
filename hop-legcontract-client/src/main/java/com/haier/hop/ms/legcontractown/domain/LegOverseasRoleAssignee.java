package com.haier.hop.ms.legcontractown.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.haier.hop.ms.legcontractown.dto.ContractPriceDto;

/**
 * <p>
 * 海外合同权限配置表
 * </p>
 *
 * @author xuejinxin
 * @since 2020-04-16
 */
@TableName("leg_overseas_role_assignee")
public class LegOverseasRoleAssignee extends Model<LegOverseasRoleAssignee> {

	private static final long serialVersionUID = 1L;
	// 当前页数
	@TableField(exist = false)
	private int currentPage;
	// 每页数据条数
	@TableField(exist = false)
	private int pageSize;
	@TableField(exist = false)
	private List<ContractPriceDto> products;
	@TableField(exist = false)
	private List<String> signerList;
	/**
	 * ID
	 */
	@TableField("ROW_ID")
	private String rowId;
	/**
	 * 角色编码
	 */
	@TableField("NODE_CODE")
	private String nodeCode;
	/**
	 * 角色名称
	 */
	@TableField("NODE_NAME")
	private String nodeName;
	/**
	 * 大区编码
	 */
	@TableField("REGION_CODE")
	private String regionCode;
	/**
	 * 大区名称
	 */
	@TableField("REGION_NAME")
	private String regionName;
	/**
	 * 小微编码
	 */
	@TableField("JYT_CODE")
	private String jytCode;
	/**
	 * 小微名称
	 */
	@TableField("JYT_NAME")
	private String jytName;
	/**
	 * 审批人工号
	 */
	@TableField("ASSIGNEE_SN")
	private String assigneeSn;
	/**
	 * 审批人姓名
	 */
	@TableField("ASSIGNEE_NAME")
	private String assigneeName;
	/**
	 * 创建时间
	 */
	@TableField("CREATE_TIME")
	private Date createTime;
	/**
	 * 是否为有效审批人 1：有效审批人 2：无效审批人
	 */
	@TableField("DELETE_FLAG")
	private String deleteFlag;
	/**
	 * 修改时间
	 */
	@TableField("UPDATE_TIME")
	private Date updateTime;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getNodeCode() {
		return nodeCode;
	}

	public void setNodeCode(String nodeCode) {
		this.nodeCode = nodeCode;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getSignerList() {
		return signerList;
	}

	public void setSignerList(List<String> signerList) {
		this.signerList = signerList;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public List<ContractPriceDto> getProducts() {
		return products;
	}

	public void setProducts(List<ContractPriceDto> products) {
		this.products = products;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getJytCode() {
		return jytCode;
	}

	public void setJytCode(String jytCode) {
		this.jytCode = jytCode;
	}

	public String getJytName() {
		return jytName;
	}

	public void setJytName(String jytName) {
		this.jytName = jytName;
	}

	public String getAssigneeSn() {
		return assigneeSn;
	}

	public void setAssigneeSn(String assigneeSn) {
		this.assigneeSn = assigneeSn;
	}

	public String getAssigneeName() {
		return assigneeName;
	}

	public void setAssigneeName(String assigneeName) {
		this.assigneeName = assigneeName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegOverseasRoleAssignee{" + "rowId=" + rowId + ", nodeCode=" + nodeCode + ", nodeName=" + nodeName
				+ ", regionCode=" + regionCode + ", regionName=" + regionName + ", jytCode=" + jytCode + ", jytName="
				+ jytName + ", assigneeSn=" + assigneeSn + ", assigneeName=" + assigneeName + ", createTime="
				+ createTime + ", deleteFlag=" + deleteFlag + ", updateTime=" + updateTime + "}";
	}
}
