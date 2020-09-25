package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 角色表
 * </p>
 *
 * @author wdh
 * @since 2020-04-04
 */
@TableName("leg_role_name")
public class LegRoleName extends Model<LegRoleName> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 角色编码
	 */
	@TableField("ROLE_SN")
	private String roleSn;
	/**
	 * 角色名称
	 */
	@TableField("ROLE_NAME")
	private String roleName;
	/**
	 * 角色描述
	 */
	@TableField("ROLE_DESC")
	private String roleDesc;
	// check框口是否选中
	@TableField(exist = false)
	private Boolean checkFlg;

	public Boolean getCheckFlg() {
		return checkFlg;
	}

	public void setCheckFlg(Boolean checkFlg) {
		this.checkFlg = checkFlg;
	}

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getRoleSn() {
		return roleSn;
	}

	public void setRoleSn(String roleSn) {
		this.roleSn = roleSn;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	@Override
	protected Serializable pkVal() {
		return this.rowId;
	}

	@Override
	public String toString() {
		return "LegRoleName{" + "rowId=" + rowId + ", roleSn=" + roleSn + ", roleName=" + roleName + ", roleDesc="
				+ roleDesc + "}";
	}
}
