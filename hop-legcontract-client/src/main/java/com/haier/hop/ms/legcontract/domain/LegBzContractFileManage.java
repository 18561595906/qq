package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 标准合同自由选择管理表（用于标准合同 对合同的附件操作）
 * </p>
 *
 * @author lyy
 * @since 2020-07-15
 */
@TableName("LEG_BZ_CONTRACT_FILE_MANAGE")
public class LegBzContractFileManage extends Model<LegBzContractFileManage> {

	private static final long serialVersionUID = 1L;
	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 业务单元编码
	 */
	@TableId("BIZ_CODE")
	private String bizCode;
	/**
	 * 业务单元名称
	 */
	@TableField("BIZ_NAME")
	private String bizName;
	/**
	 * 合同类型编码
	 */
	@TableField("CONTRACT_CODE")
	private String contractCode;
	/**
	 * 合同类型名称
	 */
	@TableField("CONTRACT_NAME")
	private String contractName;
	
	/**
	 * 备用字段1
	 */
	@TableField("BY1")
	private String by1;
	/**
	 * 备用字段2
	 */
	@TableField("BY2")
	private String by2;
	/**
	 * 创建时间
	 */
	@TableField("CREATE_DATE")
	private String createDate;
	/**
	 * 创建人
	 */
	@TableField("CREATE_BY")
	private String createBy;
	/**
	 * 更新时间
	 */
	@TableField("UPDATE_DATE")
	private String updateDate;
	/**
	 * 更新人
	 */
	@TableField("UPDATE_BY")
	private String updateBy;
	/**
	 * 有效标志(T有效F无效)
	 */
	@TableField("IS_DELETE")
	private String isDelete;
	
	@TableField(exist = false)
	private int currentPage;
	@TableField(exist = false)
	private int pageSize;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	@Override
	protected Serializable pkVal() {
		return this.rowId;
	}

	/**
	 * @return the bizCode
	 */
	public String getBizCode() {
		return bizCode;
	}

	/**
	 * @param bizCode the bizCode to set
	 */
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	/**
	 * @return the bizName
	 */
	public String getBizName() {
		return bizName;
	}

	/**
	 * @param bizName the bizName to set
	 */
	public void setBizName(String bizName) {
		this.bizName = bizName;
	}

	/**
	 * @return the contractCode
	 */
	public String getContractCode() {
		return contractCode;
	}

	/**
	 * @param contractCode the contractCode to set
	 */
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	/**
	 * @return the contractName
	 */
	public String getContractName() {
		return contractName;
	}

	/**
	 * @param contractName the contractName to set
	 */
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	/**
	 * @return the by1
	 */
	public String getBy1() {
		return by1;
	}

	/**
	 * @param by1 the by1 to set
	 */
	public void setBy1(String by1) {
		this.by1 = by1;
	}

	/**
	 * @return the by2
	 */
	public String getBy2() {
		return by2;
	}

	/**
	 * @param by2 the by2 to set
	 */
	public void setBy2(String by2) {
		this.by2 = by2;
	}

	/**
	 * @return the createDate
	 */
	public String getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return the createBy
	 */
	public String getCreateBy() {
		return createBy;
	}

	/**
	 * @param createBy the createBy to set
	 */
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	/**
	 * @return the updateDate
	 */
	public String getUpdateDate() {
		return updateDate;
	}

	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * @return the updateBy
	 */
	public String getUpdateBy() {
		return updateBy;
	}

	/**
	 * @param updateBy the updateBy to set
	 */
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	/**
	 * @return the isDelete
	 */
	public String getIsDelete() {
		return isDelete;
	}

	/**
	 * @param isDelete the isDelete to set
	 */
	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the currentPage
	 */
	public int getCurrentPage() {
		return currentPage;
	}

	/**
	 * @param currentPage the currentPage to set
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public String toString() {
		return "LegRoleName{" + "rowId=" + rowId + ", bizCode=" + bizCode + ", bizName=" + bizName + ", contractCode="+ contractCode
				+ "contractName=" + contractName + ", by1=" + by1 + ", by2=" + by2 + ", createDate="+ createDate+ "createBy=" + createBy
				+ "updateDate=" + updateDate + ", updateBy=" + updateBy  + ", isDelete="+ isDelete
				+ "}";
	}
}
