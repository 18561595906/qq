package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * </p>
 *
 * @author wangdh
 * @since 2019-08-07
 */
@TableName("act_proc_info")
public class ActProcInfo extends Model<ActProcInfo> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("ID_")
	private String id;
	/**
	 * 流程类型(1：合同服务 2:公司服务 3：印章服务 4：综合服务 5：法律地图 6：我的草稿 7：项目服务)
	 */
	@TableField("PROCESS_TYPE")
	private String processType;
	/**
	 * 申请人SN
	 */
	@TableField("START_USER_ID")
	private String startUserId;
	/**
	 * 申请人
	 */
	@TableField("START_USER")
	private String startUser;

	/**
	 * 申请人所属部门
	 */
	@TableField("DEPARTMENT")
	private String department;

	// 申请时间
	@TableField("CREATE_TIME")
	private String createTime;

	/**
	 * 合同是否为标准
	 */
	@TableField("CONTRACT_TYPE")
	private String contractType;
	/**
	 * 流程ID
	 */
	@TableField("PROC_ID")
	private String procId;

	/**
	 * 业务单元父级
	 */
	@TableField("SOME_UNIT_FU")
	private String someUnitFu;
	/**
	 * 业务单元
	 */
	@TableField("SOME_UNIT")
	private String someUnit;

	/**
	 * 业务单元拼接
	 */
	@TableField("SOME_UNIT_SUM")
	private String someUnitSum;

	/**
	 * 合同编码
	 */
	@TableField("CONTRACT_CODE")
	private String contractCode;
	/**
	 * 前端系统编号
	 */
	@TableField("WEB_CODE")
	private String webCode;
	/**
	 * 甲方签约单位
	 */
	@TableField("FIRST_PARTY")
	private String firstParty;
	/**
	 * 乙方签约单元
	 */
	@TableField("SECOND_PARTY")
	private String secondParty;

	/**
	 * 丙方签约单位
	 */
	@TableField("THIRD_PARTY")
	private String thirdParty;
	/**
	 * 丁方签约单元
	 */
	@TableField("FOUR_PARTY")
	private String fourParty;
	/**
	 * 盖章方式
	 */
	@TableField("SEAL_TYPE")
	private String sealType;
	/**
	 * 名称
	 */
	@TableField("PROCESS_NAME")
	private String processName;
	/**
	 * 名称
	 */
	@TableField("SUB_NAME")
	private String subName;

	public String getId() {
		return id;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProcessType() {
		return processType;
	}

	public void setProcessType(String processType) {
		this.processType = processType;
	}

	public String getStartUser() {
		return startUser;
	}

	public void setStartUser(String startUser) {
		this.startUser = startUser;
	}

	public String getProcId() {
		return procId;
	}

	public String getStartUserId() {
		return startUserId;
	}

	public void setStartUserId(String startUserId) {
		this.startUserId = startUserId;
	}

	public void setProcId(String procId) {
		this.procId = procId;
	}

	public String getSomeUnit() {
		return someUnit;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getSomeUnitFu() {
		return someUnitFu;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public void setSomeUnitFu(String someUnitFu) {
		this.someUnitFu = someUnitFu;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSomeUnit(String someUnit) {
		this.someUnit = someUnit;
	}

	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getWebCode() {
		return webCode;
	}

	public void setWebCode(String webCode) {
		this.webCode = webCode;
	}

	public String getFirstParty() {
		return firstParty;
	}

	public void setFirstParty(String firstParty) {
		this.firstParty = firstParty;
	}

	public String getSecondParty() {
		return secondParty;
	}

	public void setSecondParty(String secondParty) {
		this.secondParty = secondParty;
	}

	public String getSealType() {
		return sealType;
	}

	public void setSealType(String sealType) {
		this.sealType = sealType;
	}

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public String getSomeUnitSum() {
		return someUnitSum;
	}

	public void setSomeUnitSum(String someUnitSum) {
		this.someUnitSum = someUnitSum;
	}

	public String getThirdParty() {
		return thirdParty;
	}

	public void setThirdParty(String thirdParty) {
		this.thirdParty = thirdParty;
	}

	public String getFourParty() {
		return fourParty;
	}

	public void setFourParty(String fourParty) {
		this.fourParty = fourParty;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "ActProcInfo{" + "id=" + id + ", processType=" + processType + ", startUser=" + startUser + ", procId="
		        + procId + ", someUnit=" + someUnit + ", contractCode=" + contractCode + ", webCode=" + webCode
		        + ", firstParty=" + firstParty + ", secondParty=" + secondParty + ", sealType=" + sealType
		        + ", processName=" + processName + "}";
	}
}
