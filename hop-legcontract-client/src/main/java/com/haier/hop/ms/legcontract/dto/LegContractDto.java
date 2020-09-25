package com.haier.hop.ms.legcontract.dto;

/**
 * <p>
 * entity
 * </p>
 *
 * @author xuejinxin
 * @since 2019-06-12
 */
public class LegContractDto {
	// leg_contract_tmp 表中的type
	private String contractTypeC;
	// leg_contract_tmp表中的typeName
	private String contractTypeNameC;
	// leg_standard_contract_tmp中的
	private String contractTypeS;
	// leg_standard_contract_tmp中的
	private String contractTypeNameS;
	// leg_standard_contract_tmp的
	private String businessUnit;
	// leg_contract_tmp 表中的
	private String bizCode;
	// leg_employee_accredit中的业务名称
	private String jytName;
	// leg_employee_accredit中的人员名称
	private String empName;
	private String createTime;
	// 流程实例ID
	private String processInstanceId;

	private String typeOrder;
	private String procType;
	private String taskey;
	private String taskId;
	private String procName;
	private String someType;
	private String someName;
	private String someUnit;
	private String startUser;
	private String assignee;

	private String webCode;

	/**
	 * 合同编码（生成规则公议时间+流水号）
	 */
	private String contractCode;

	/**
	 * 甲方签约单位
	 */
	private String firstParty;

	/**
	 * 乙方签约单位
	 */
	private String secondParty;

	/**
	 * 1:新流程线上用印
	 */
	private String sealType;

	public String getTypeOrder() {
		return typeOrder;
	}

	public void setTypeOrder(String typeOrder) {
		this.typeOrder = typeOrder;
	}

	public String getProcType() {
		return procType;
	}

	public void setProcType(String procType) {
		this.procType = procType;
	}

	public String getTaskey() {
		return taskey;
	}

	public void setTaskey(String taskey) {
		this.taskey = taskey;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getProcName() {
		return procName;
	}

	public void setProcName(String procName) {
		this.procName = procName;
	}

	public String getSomeType() {
		return someType;
	}

	public void setSomeType(String someType) {
		this.someType = someType;
	}

	public String getSomeName() {
		return someName;
	}

	public void setSomeName(String someName) {
		this.someName = someName;
	}

	public String getSomeUnit() {
		return someUnit;
	}

	public void setSomeUnit(String someUnit) {
		this.someUnit = someUnit;
	}

	public String getStartUser() {
		return startUser;
	}

	public void setStartUser(String startUser) {
		this.startUser = startUser;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public String getWebCode() {
		return webCode;
	}

	public void setWebCode(String webCode) {
		this.webCode = webCode;
	}

	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
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

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getContractTypeC() {
		return contractTypeC;
	}

	public void setContractTypeC(String contractTypeC) {
		this.contractTypeC = contractTypeC;
	}

	public String getContractTypeNameC() {
		return contractTypeNameC;
	}

	public void setContractTypeNameC(String contractTypeNameC) {
		this.contractTypeNameC = contractTypeNameC;
	}

	public String getContractTypeS() {
		return contractTypeS;
	}

	public void setContractTypeS(String contractTypeS) {
		this.contractTypeS = contractTypeS;
	}

	public String getContractTypeNameS() {
		return contractTypeNameS;
	}

	public void setContractTypeNameS(String contractTypeNameS) {
		this.contractTypeNameS = contractTypeNameS;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getBizCode() {
		return bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getJytName() {
		return jytName;
	}

	public void setJytName(String jytName) {
		this.jytName = jytName;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

}
