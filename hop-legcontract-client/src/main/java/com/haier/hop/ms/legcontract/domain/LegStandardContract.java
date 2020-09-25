package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 标准合同正式表
 * </p>
 *
 * @author xuxu
 * @since 2019-07-29
 */
@TableName("leg_standard_contract")
public class LegStandardContract extends Model<LegStandardContract> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 申请人
	 */
	@TableField("EMP_SN")
	private String empSn;
	/**
	 * 一级合同
	 */
	@TableField("CONTRACT_TYPE")
	private String contractType;
	/**
	 * 二级合同名称
	 */
	@TableField("CONTRACT_TYPE_NAME")
	private String contractTypeName;
	/**
	 * 业务单元
	 */
	@TableField("BUSINESS_UNIT")
	private String businessUnit;
	/**
	 * 业务单元名称
	 */
	@TableField("BUSINESS_UNIT_NAME")
	private String businessUnitName;
	/**
	 * 流程编号
	 */
	@TableField("PROC_ID")
	private String procId;
	/**
	 * 范本编码
	 */
	@TableField("CONTRACT_SN")
	private String contractSn;
	/**
	 * 合同需求描述
	 */
	@TableField("CONTRACT_DESC")
	private String contractDesc;
	/**
	 * 合同名称
	 */
	@TableField("CONTRACT_NAME")
	private String contractName;
	/**
	 * 合同状态
	 */
	@TableField("CONTRACT_STATE")
	private Integer contractState;
	/**
	 * 版本
	 */
	@TableField("VERSION")
	private String version;
	/**
	 * 修改人编号
	 */
	@TableField("UPDATE_BYNO")
	private String updateByno;
	/**
	 * 修改人姓名
	 */
	@TableField("UPDATE_BY")
	private String updateBy;
	/**
	 * 修改日期
	 */
	@TableField("UPDATE_DATE")
	private Date updateDate;
	/**
	 * 创建人编号
	 */
	@TableField("CREATE_BYNO")
	private String createByno;
	/**
	 * 创建人姓名
	 */
	@TableField("CREATE_BY")
	private String createBy;
	/**
	 * 创建日期
	 */
	@TableField("CREATE_DATE")
	private Date createDate;
	/**
	 * 需求类型
	 */
	@TableField("REQUIRE_TYPE")
	private String requireType;
	/**
	 * 0：标准 1:非标准
	 */
	@TableField("FLAG")
	private String flag;
	/**
	 * 签约主体数量
	 */
	@TableField("SIGN_COUNT")
	private Integer signCount;
	/**
	 * 通用标记 0：通用 1：不通用 2：在线编辑通用
	 */
	@TableField("COMMON_FLAG")
	private String commonFlag;
	/**
	 * 通用范围
	 */
	@TableField("COMMON_SCOPE")
	private String commonScope;
	/**
	 * 判断是否不同
	 */
	@TableField("IS_COMPARE")
	private BigDecimal isCompare;
	/**
	 * 1:原有合同类别 2:新增合同类别
	 */
	@TableField("CHANGE_CONTRACT_TYPE")
	private String changeContractType;
	/**
	 * 1:业务单元明细 2:业务单元目录
	 */
	@TableField("BUSINESS_UNIT_TYPE")
	private String businessUnitType;
	/**
	 * 平台长名称
	 */
	@TableField("LDGY_APPROVAL_NAME")
	private String ldgyApprovalName;
	/**
	 * 范本维护平台长
	 */
	@TableField("LDGY_APPROVAL")
	private String ldgyApproval;
	/**
	 * 快速通道 0：是 1:不是
	 */
	@TableField("IS_FAST_CHANNEL_TYPE")
	private String isFastChannelType;
	/**
	 * 一级合同名称
	 */
	@TableField("CONTRACT_TYPE1")
	private String contractType1;
	/**
	 * 二级合同名称
	 */
	@TableField("CONTRACT_TYPE2")
	private String contractType2;
	/**
	 * 0:以原合同节点规则为准 1:以新合同节点规则为准
	 */
	@TableField("RULE_TYPE")
	private String ruleType;

	/**
	 * 是否已更新附件（数据迁移用）0:是 1:否
	 */
	@TableField("IS_UPDATE")
	private String isUpdate;

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

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getContractTypeName() {
		return contractTypeName;
	}

	public void setContractTypeName(String contractTypeName) {
		this.contractTypeName = contractTypeName;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getBusinessUnitName() {
		return businessUnitName;
	}

	public void setBusinessUnitName(String businessUnitName) {
		this.businessUnitName = businessUnitName;
	}

	public String getProcId() {
		return procId;
	}

	public void setProcId(String procId) {
		this.procId = procId;
	}

	public String getContractSn() {
		return contractSn;
	}

	public void setContractSn(String contractSn) {
		this.contractSn = contractSn;
	}

	public String getContractDesc() {
		return contractDesc;
	}

	public void setContractDesc(String contractDesc) {
		this.contractDesc = contractDesc;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public Integer getContractState() {
		return contractState;
	}

	public void setContractState(Integer contractState) {
		this.contractState = contractState;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getUpdateByno() {
		return updateByno;
	}

	public void setUpdateByno(String updateByno) {
		this.updateByno = updateByno;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getCreateByno() {
		return createByno;
	}

	public void setCreateByno(String createByno) {
		this.createByno = createByno;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getRequireType() {
		return requireType;
	}

	public void setRequireType(String requireType) {
		this.requireType = requireType;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Integer getSignCount() {
		return signCount;
	}

	public void setSignCount(Integer signCount) {
		this.signCount = signCount;
	}

	public String getCommonFlag() {
		return commonFlag;
	}

	public void setCommonFlag(String commonFlag) {
		this.commonFlag = commonFlag;
	}

	public String getCommonScope() {
		return commonScope;
	}

	public void setCommonScope(String commonScope) {
		this.commonScope = commonScope;
	}

	public BigDecimal getIsCompare() {
		return isCompare;
	}

	public void setIsCompare(BigDecimal isCompare) {
		this.isCompare = isCompare;
	}

	public String getChangeContractType() {
		return changeContractType;
	}

	public void setChangeContractType(String changeContractType) {
		this.changeContractType = changeContractType;
	}

	public String getBusinessUnitType() {
		return businessUnitType;
	}

	public void setBusinessUnitType(String businessUnitType) {
		this.businessUnitType = businessUnitType;
	}

	public String getLdgyApprovalName() {
		return ldgyApprovalName;
	}

	public void setLdgyApprovalName(String ldgyApprovalName) {
		this.ldgyApprovalName = ldgyApprovalName;
	}

	public String getLdgyApproval() {
		return ldgyApproval;
	}

	public void setLdgyApproval(String ldgyApproval) {
		this.ldgyApproval = ldgyApproval;
	}

	public String getIsFastChannelType() {
		return isFastChannelType;
	}

	public void setIsFastChannelType(String isFastChannelType) {
		this.isFastChannelType = isFastChannelType;
	}

	public String getContractType1() {
		return contractType1;
	}

	public void setContractType1(String contractType1) {
		this.contractType1 = contractType1;
	}

	public String getContractType2() {
		return contractType2;
	}

	public void setContractType2(String contractType2) {
		this.contractType2 = contractType2;
	}

	public String getRuleType() {
		return ruleType;
	}

	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

	public String getIsUpdate() {
		return isUpdate;
	}

	public void setIsUpdate(String isUpdate) {
		this.isUpdate = isUpdate;
	}

	@Override
	protected Serializable pkVal() {
		return this.rowId;
	}

	@Override
	public String toString() {
		return "LegStandardContract{" + "rowId=" + rowId + ", empSn=" + empSn + ", contractType=" + contractType
				+ ", contractTypeName=" + contractTypeName + ", businessUnit=" + businessUnit + ", businessUnitName="
				+ businessUnitName + ", procId=" + procId + ", contractSn=" + contractSn + ", contractDesc="
				+ contractDesc + ", contractName=" + contractName + ", contractState=" + contractState + ", version="
				+ version + ", updateByno=" + updateByno + ", updateBy=" + updateBy + ", updateDate=" + updateDate
				+ ", createByno=" + createByno + ", createBy=" + createBy + ", createDate=" + createDate
				+ ", requireType=" + requireType + ", flag=" + flag + ", signCount=" + signCount + ", commonFlag="
				+ commonFlag + ", commonScope=" + commonScope + ", isCompare=" + isCompare + ", changeContractType="
				+ changeContractType + ", businessUnitType=" + businessUnitType + ", ldgyApprovalName="
				+ ldgyApprovalName + ", ldgyApproval=" + ldgyApproval + ", isFastChannelType=" + isFastChannelType
				+ ", contractType1=" + contractType1 + ", contractType2=" + contractType2 + ", ruleType=" + ruleType
				+ "}";
	}
}
