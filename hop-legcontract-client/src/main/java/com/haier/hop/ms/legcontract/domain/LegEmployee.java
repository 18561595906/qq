package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 员工
 * </p>
 *
 * @author xuxu
 * @since 2019-06-17
 */
@TableName("leg_employee")
public class LegEmployee extends Model<LegEmployee> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private String rowId;
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
	 * 员工电话
	 */
	@TableField("EMP_TEL")
	private String empTel;
	/**
	 * 员工手机
	 */
	@TableField("EMP_PHONE")
	private String empPhone;
	/**
	 * 员工邮箱
	 */
	@TableField("EMP_EMAIL")
	private String empEmail;
	/**
	 * 身份证号
	 */
	@TableField("EMP_IDNO")
	private String empIdno;
	/**
	 * 直线
	 */
	@TableField("FIRST_LINEID")
	private String firstLineid;
	/**
	 * 直线姓名
	 */
	@TableField("FIRST_LINENAME")
	private String firstLinename;
	/**
	 * 二线
	 */
	@TableField("SECOND_LINEID")
	private String secondLineid;
	/**
	 * 二线姓名
	 */
	@TableField("SECOND_LINENAME")
	private String secondLinename;
	/**
	 * 员工组编码
	 */
	@TableField("EMPGROUP_CODE")
	private String empgroupCode;
	/**
	 * 员工组名称
	 */
	@TableField("EMPGROUP_NAME")
	private String empgroupName;
	/**
	 * 员工子组代码
	 */
	@TableField("EMPSUBGROUP_CODE")
	private String empsubgroupCode;
	/**
	 * 员工子组名称
	 */
	@TableField("EMPSUBGROUP_NAME")
	private String empsubgroupName;
	/**
	 * 员工状态代码
	 */
	@TableField("EMPSTATUS_CODE")
	private String empstatusCode;
	/**
	 * 员工状态名称
	 */
	@TableField("EMPSTATUS_NAME")
	private String empstatusName;
	/**
	 * 岗位编码
	 */
	@TableField("POSITION_CODE")
	private String positionCode;
	/**
	 * 岗位名称
	 */
	@TableField("POSITION_NAME")
	private String positionName;
	/**
	 * 部门编码
	 */
	@TableField("DEPARTMENT_CODE")
	private String departmentCode;
	/**
	 * 部门名称
	 */
	@TableField("DEPARTMENT_NAME")
	private String departmentName;
	/**
	 * 单位代码
	 */
	@TableField("ORG_CODE")
	private String orgCode;
	/**
	 * 单位名称
	 */
	@TableField("ORG_NAME")
	private String orgName;
	/**
	 * 单位BUFU编码
	 */
	@TableField("ORGBUFU_CODE")
	private String orgbufuCode;
	/**
	 * 单位BUFU名称
	 */
	@TableField("ORGBUFU_NAME")
	private String orgbufuName;
	/**
	 * 岗位等级
	 */
	@TableField("BAND_CODE")
	private String bandCode;
	/**
	 * 岗位名称
	 */
	@TableField("BAND_NAME")
	private String bandName;
	/**
	 * 经营体简码
	 */
	@TableField("JBM")
	private String jbm;
	/**
	 * 经营体代码
	 */
	@TableField("JYT_CODE")
	private String jytCode;
	/**
	 * 经营体名称
	 */
	@TableField("JYT_NAME")
	private String jytName;
	/**
	 * 股别代码
	 */
	@TableField("AH_CODE")
	private String ahCode;
	/**
	 * 股别名称
	 */
	@TableField("AH")
	private String ah;
	/**
	 * BUFU编码
	 */
	@TableField("BUFU_CODE")
	private String bufuCode;
	/**
	 * BUFU
	 */
	@TableField("BUFU")
	private String bufu;
	/**
	 * 经营体类别代码
	 */
	@TableField("GWJYTLB_CODE")
	private String gwjytlbCode;
	/**
	 * 经营体类别
	 */
	@TableField("GWJYTLB")
	private String gwjytlb;
	/**
	 * 经营体级别代码
	 */
	@TableField("GWJYTJB_CODE")
	private String gwjytjbCode;
	/**
	 * 经营体级别
	 */
	@TableField("GWJYTJB")
	private String gwjytjb;
	/**
	 * 经营体长
	 */
	@TableField("JYTZBM")
	private String jytzbm;
	/**
	 * 经营体长姓名
	 */
	@TableField("JYTZXM")
	private String jytzxm;
	/**
	 * 经营体HR
	 */
	@TableField("JYTHR")
	private String jythr;
	/**
	 * 经营体HR姓名
	 */
	@TableField("JYTHR_NAME")
	private String jythrName;
	/**
	 * 类型HR
	 */
	@TableField("BULXHR")
	private String bulxhr;
	/**
	 * 类型HR姓名
	 */
	@TableField("BULXHR_NAME")
	private String bulxhrName;
	/**
	 * BUHR
	 */
	@TableField("BUHR")
	private String buhr;
	/**
	 * BUHR姓名
	 */
	@TableField("BUHR_NAME")
	private String buhrName;
	/**
	 * 状态
	 */
	@TableField("BZ1")
	private String bz1;
	/**
	 * 员工状态
	 */
	@TableField("TYPE_FLAG")
	private Integer typeFlag;
	/**
	 * 更新时间
	 */
	@TableField("UPDATE_DATE")
	private Date updateDate;
	/**
	 * 身份证
	 */
	@TableField("IDCARDNO")
	private String idcardno;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

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

	public String getEmpTel() {
		return empTel;
	}

	public void setEmpTel(String empTel) {
		this.empTel = empTel;
	}

	public String getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpIdno() {
		return empIdno;
	}

	public void setEmpIdno(String empIdno) {
		this.empIdno = empIdno;
	}

	public String getFirstLineid() {
		return firstLineid;
	}

	public void setFirstLineid(String firstLineid) {
		this.firstLineid = firstLineid;
	}

	public String getFirstLinename() {
		return firstLinename;
	}

	public void setFirstLinename(String firstLinename) {
		this.firstLinename = firstLinename;
	}

	public String getSecondLineid() {
		return secondLineid;
	}

	public void setSecondLineid(String secondLineid) {
		this.secondLineid = secondLineid;
	}

	public String getSecondLinename() {
		return secondLinename;
	}

	public void setSecondLinename(String secondLinename) {
		this.secondLinename = secondLinename;
	}

	public String getEmpgroupCode() {
		return empgroupCode;
	}

	public void setEmpgroupCode(String empgroupCode) {
		this.empgroupCode = empgroupCode;
	}

	public String getEmpgroupName() {
		return empgroupName;
	}

	public void setEmpgroupName(String empgroupName) {
		this.empgroupName = empgroupName;
	}

	public String getEmpsubgroupCode() {
		return empsubgroupCode;
	}

	public void setEmpsubgroupCode(String empsubgroupCode) {
		this.empsubgroupCode = empsubgroupCode;
	}

	public String getEmpsubgroupName() {
		return empsubgroupName;
	}

	public void setEmpsubgroupName(String empsubgroupName) {
		this.empsubgroupName = empsubgroupName;
	}

	public String getEmpstatusCode() {
		return empstatusCode;
	}

	public void setEmpstatusCode(String empstatusCode) {
		this.empstatusCode = empstatusCode;
	}

	public String getEmpstatusName() {
		return empstatusName;
	}

	public void setEmpstatusName(String empstatusName) {
		this.empstatusName = empstatusName;
	}

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgbufuCode() {
		return orgbufuCode;
	}

	public void setOrgbufuCode(String orgbufuCode) {
		this.orgbufuCode = orgbufuCode;
	}

	public String getOrgbufuName() {
		return orgbufuName;
	}

	public void setOrgbufuName(String orgbufuName) {
		this.orgbufuName = orgbufuName;
	}

	public String getBandCode() {
		return bandCode;
	}

	public void setBandCode(String bandCode) {
		this.bandCode = bandCode;
	}

	public String getBandName() {
		return bandName;
	}

	public void setBandName(String bandName) {
		this.bandName = bandName;
	}

	public String getJbm() {
		return jbm;
	}

	public void setJbm(String jbm) {
		this.jbm = jbm;
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

	public String getAhCode() {
		return ahCode;
	}

	public void setAhCode(String ahCode) {
		this.ahCode = ahCode;
	}

	public String getAh() {
		return ah;
	}

	public void setAh(String ah) {
		this.ah = ah;
	}

	public String getBufuCode() {
		return bufuCode;
	}

	public void setBufuCode(String bufuCode) {
		this.bufuCode = bufuCode;
	}

	public String getBufu() {
		return bufu;
	}

	public void setBufu(String bufu) {
		this.bufu = bufu;
	}

	public String getGwjytlbCode() {
		return gwjytlbCode;
	}

	public void setGwjytlbCode(String gwjytlbCode) {
		this.gwjytlbCode = gwjytlbCode;
	}

	public String getGwjytlb() {
		return gwjytlb;
	}

	public void setGwjytlb(String gwjytlb) {
		this.gwjytlb = gwjytlb;
	}

	public String getGwjytjbCode() {
		return gwjytjbCode;
	}

	public void setGwjytjbCode(String gwjytjbCode) {
		this.gwjytjbCode = gwjytjbCode;
	}

	public String getGwjytjb() {
		return gwjytjb;
	}

	public void setGwjytjb(String gwjytjb) {
		this.gwjytjb = gwjytjb;
	}

	public String getJytzbm() {
		return jytzbm;
	}

	public void setJytzbm(String jytzbm) {
		this.jytzbm = jytzbm;
	}

	public String getJytzxm() {
		return jytzxm;
	}

	public void setJytzxm(String jytzxm) {
		this.jytzxm = jytzxm;
	}

	public String getJythr() {
		return jythr;
	}

	public void setJythr(String jythr) {
		this.jythr = jythr;
	}

	public String getJythrName() {
		return jythrName;
	}

	public void setJythrName(String jythrName) {
		this.jythrName = jythrName;
	}

	public String getBulxhr() {
		return bulxhr;
	}

	public void setBulxhr(String bulxhr) {
		this.bulxhr = bulxhr;
	}

	public String getBulxhrName() {
		return bulxhrName;
	}

	public void setBulxhrName(String bulxhrName) {
		this.bulxhrName = bulxhrName;
	}

	public String getBuhr() {
		return buhr;
	}

	public void setBuhr(String buhr) {
		this.buhr = buhr;
	}

	public String getBuhrName() {
		return buhrName;
	}

	public void setBuhrName(String buhrName) {
		this.buhrName = buhrName;
	}

	public String getBz1() {
		return bz1;
	}

	public void setBz1(String bz1) {
		this.bz1 = bz1;
	}

	public Integer getTypeFlag() {
		return typeFlag;
	}

	public void setTypeFlag(Integer typeFlag) {
		this.typeFlag = typeFlag;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getIdcardno() {
		return idcardno;
	}

	public void setIdcardno(String idcardno) {
		this.idcardno = idcardno;
	}

	@Override
	protected Serializable pkVal() {
		return this.rowId;
	}

	@Override
	public String toString() {
		return "LegEmployee{" + "rowId=" + rowId + ", empSn=" + empSn + ", empName=" + empName + ", empTel=" + empTel
				+ ", empPhone=" + empPhone + ", empEmail=" + empEmail + ", empIdno=" + empIdno + ", firstLineid="
				+ firstLineid + ", firstLinename=" + firstLinename + ", secondLineid=" + secondLineid
				+ ", secondLinename=" + secondLinename + ", empgroupCode=" + empgroupCode + ", empgroupName="
				+ empgroupName + ", empsubgroupCode=" + empsubgroupCode + ", empsubgroupName=" + empsubgroupName
				+ ", empstatusCode=" + empstatusCode + ", empstatusName=" + empstatusName + ", positionCode="
				+ positionCode + ", positionName=" + positionName + ", departmentCode=" + departmentCode
				+ ", departmentName=" + departmentName + ", orgCode=" + orgCode + ", orgName=" + orgName
				+ ", orgbufuCode=" + orgbufuCode + ", orgbufuName=" + orgbufuName + ", bandCode=" + bandCode
				+ ", bandName=" + bandName + ", jbm=" + jbm + ", jytCode=" + jytCode + ", jytName=" + jytName
				+ ", ahCode=" + ahCode + ", ah=" + ah + ", bufuCode=" + bufuCode + ", bufu=" + bufu + ", gwjytlbCode="
				+ gwjytlbCode + ", gwjytlb=" + gwjytlb + ", gwjytjbCode=" + gwjytjbCode + ", gwjytjb=" + gwjytjb
				+ ", jytzbm=" + jytzbm + ", jytzxm=" + jytzxm + ", jythr=" + jythr + ", jythrName=" + jythrName
				+ ", bulxhr=" + bulxhr + ", bulxhrName=" + bulxhrName + ", buhr=" + buhr + ", buhrName=" + buhrName
				+ ", bz1=" + bz1 + ", typeFlag=" + typeFlag + ", updateDate=" + updateDate + ", idcardno=" + idcardno
				+ "}";
	}
}
