package com.haier.hop.ms.legcontractown.dto;

import com.baomidou.mybatisplus.annotations.TableField;

/**
 * <p>
 * 员工
 * </p>
 *
 * @author xuxu
 * @since 2019-05-30
 */
public class LegEmployeeDto {

	/**
	 * 员工号码
	 */
	@TableField("EMP_SN")
	private String empSn;

	/**
	 * 员工名称
	 */
	@TableField("EMP_NAME")
	private String empName;

	/**
	 * 员工邮箱
	 */
	@TableField("EMP_EMAIL")
	private String empEmail;

	public String getEmpSn() {
		return empSn;
	}

	public void setEmpSn(String empSn) {
		this.empSn = empSn;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

}
