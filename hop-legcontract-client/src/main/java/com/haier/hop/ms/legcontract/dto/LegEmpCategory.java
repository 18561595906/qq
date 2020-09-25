package com.haier.hop.ms.legcontract.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author xuxu
 * @since 2019-06-17
 */
public class LegEmpCategory {

	private BigDecimal rowId;
	private String empSn;
	private String topCategoryCode;
	private String topCategoryName;
	private String secondCategoryCode;
	private String secondCategoryName;
	private String thirdCategoryCode;
	private String thirdCategoryName;
	private BigDecimal syncFlag;
	private Date createDate;
	private Date syncDate;

	public BigDecimal getRowId() {
		return rowId;
	}

	public void setRowId(BigDecimal rowId) {
		this.rowId = rowId;
	}

	public String getEmpSn() {
		return empSn;
	}

	public void setEmpSn(String empSn) {
		this.empSn = empSn;
	}

	public String getTopCategoryCode() {
		return topCategoryCode;
	}

	public void setTopCategoryCode(String topCategoryCode) {
		this.topCategoryCode = topCategoryCode;
	}

	public String getTopCategoryName() {
		return topCategoryName;
	}

	public void setTopCategoryName(String topCategoryName) {
		this.topCategoryName = topCategoryName;
	}

	public String getSecondCategoryCode() {
		return secondCategoryCode;
	}

	public void setSecondCategoryCode(String secondCategoryCode) {
		this.secondCategoryCode = secondCategoryCode;
	}

	public String getSecondCategoryName() {
		return secondCategoryName;
	}

	public void setSecondCategoryName(String secondCategoryName) {
		this.secondCategoryName = secondCategoryName;
	}

	public String getThirdCategoryCode() {
		return thirdCategoryCode;
	}

	public void setThirdCategoryCode(String thirdCategoryCode) {
		this.thirdCategoryCode = thirdCategoryCode;
	}

	public String getThirdCategoryName() {
		return thirdCategoryName;
	}

	public void setThirdCategoryName(String thirdCategoryName) {
		this.thirdCategoryName = thirdCategoryName;
	}

	public BigDecimal getSyncFlag() {
		return syncFlag;
	}

	public void setSyncFlag(BigDecimal syncFlag) {
		this.syncFlag = syncFlag;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getSyncDate() {
		return syncDate;
	}

	public void setSyncDate(Date syncDate) {
		this.syncDate = syncDate;
	}

	@Override
	public String toString() {
		return "LegEmpCategory{" + "rowId=" + rowId + ", empSn=" + empSn + ", topCategoryCode=" + topCategoryCode
				+ ", topCategoryName=" + topCategoryName + ", secondCategoryCode=" + secondCategoryCode
				+ ", secondCategoryName=" + secondCategoryName + ", thirdCategoryCode=" + thirdCategoryCode
				+ ", thirdCategoryName=" + thirdCategoryName + ", syncFlag=" + syncFlag + ", createDate=" + createDate
				+ ", syncDate=" + syncDate + "}";
	}
}
