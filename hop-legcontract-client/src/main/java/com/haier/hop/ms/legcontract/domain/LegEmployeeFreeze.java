package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 未归档超时用户冻结表
 * </p>
 *
 * @author shiyingxin
 * @since 2019-11-26
 */
@TableName("leg_employee_freeze")
public class LegEmployeeFreeze extends Model<LegEmployeeFreeze> {

	private static final long serialVersionUID = 1L;

	@TableField("ROW_ID")
	private String rowId;
	/**
	 * 用户账号
	 */
	@TableField("USER_NO")
	private String userNo;
	/**
	 * 用户姓名
	 */
	@TableField("USER_NAME")
	private String userName;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	protected Serializable pkVal() {
		return this.rowId;
	}

	@Override
	public String toString() {
		return "LegEmployeeFreeze{" + "rowId=" + rowId + ", userNo=" + userNo + ", userName=" + userName + "}";
	}
}
