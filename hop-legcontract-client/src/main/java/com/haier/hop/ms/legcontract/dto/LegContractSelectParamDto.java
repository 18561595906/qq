package com.haier.hop.ms.legcontract.dto;

import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-12-16
 */
public class LegContractSelectParamDto {

	private Integer currentPage;
	private Integer pageSize;

	private Integer sizeFrist;
	private Integer sizeLast;

	private String userId;

	private List<String> procIds;

	// 合同所属项目名称
	private String projectName;
	// 合同名称
	private String contractName;
	// 合同流水号
	private String contNo;
	// 合同编号
	private String contractNo;
	// 合同编码
	private String contractCode;
	// 合同状态
	private String contStatus;
	// 申请时间开始
	private String createTimeFrom;
	// 申请时间结束
	private String createTimeTo;
	// 业务单元
	private String bizName;
	// 合同分类
	private String contractAlias;
	// 原合同编号
	private String relatedMecCode;
	// 经办人工号
	private String assigneeSn;
	// 经办人姓名
	private String assigneeName;
	// 审核律师
	private String lawyerName;
	// 审核时长
	private String reviewTime;
	// 我方单位名称
	private String wfPartnerName;
	// 对方签约单位
	private String dfPartnerName;
	// 用印类型
	private String sealType;
	// 前端系统编号
	private String beforecontractNo;
	// 合同类型(标准非标)
	private String contractType;
	// 业务单元
	private String[] bizCodeId;
	// 合同名称
	private String[] contractCodeId;
	// 合同类型0 不限 1 外部合同 2 内部合同
	private String contractInsideType;
	// 公司编码
	private List<String> companyCode;
	// 合同编码
	private List<String> contractCodeQX;

	public String[] getBizCodeId() {
		return bizCodeId;
	}

	public void setBizCodeId(String[] bizCodeId) {
		this.bizCodeId = bizCodeId;
	}

	public String[] getContractCodeId() {
		return contractCodeId;
	}

	public void setContractCodeId(String[] contractCodeId) {
		this.contractCodeId = contractCodeId;
	}

	public String getContractInsideType() {
		return contractInsideType;
	}

	public void setContractInsideType(String contractInsideType) {
		this.contractInsideType = contractInsideType;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<String> getProcIds() {
		return procIds;
	}

	public void setProcIds(List<String> procIds) {
		this.procIds = procIds;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getContNo() {
		return contNo;
	}

	public void setContNo(String contNo) {
		this.contNo = contNo;
	}

	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getContStatus() {
		return contStatus;
	}

	public void setContStatus(String contStatus) {
		this.contStatus = contStatus;
	}

	public String getCreateTimeFrom() {
		return createTimeFrom;
	}

	public void setCreateTimeFrom(String createTimeFrom) {
		this.createTimeFrom = createTimeFrom;
	}

	public String getCreateTimeTo() {
		return createTimeTo;
	}

	public void setCreateTimeTo(String createTimeTo) {
		this.createTimeTo = createTimeTo;
	}

	public String getBizName() {
		return bizName;
	}

	public void setBizName(String bizName) {
		this.bizName = bizName;
	}

	public String getContractAlias() {
		return contractAlias;
	}

	public void setContractAlias(String contractAlias) {
		this.contractAlias = contractAlias;
	}

	public String getRelatedMecCode() {
		return relatedMecCode;
	}

	public void setRelatedMecCode(String relatedMecCode) {
		this.relatedMecCode = relatedMecCode;
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

	public String getLawyerName() {
		return lawyerName;
	}

	public void setLawyerName(String lawyerName) {
		this.lawyerName = lawyerName;
	}

	public String getReviewTime() {
		return reviewTime;
	}

	public void setReviewTime(String reviewTime) {
		this.reviewTime = reviewTime;
	}

	public String getWfPartnerName() {
		return wfPartnerName;
	}

	public void setWfPartnerName(String wfPartnerName) {
		this.wfPartnerName = wfPartnerName;
	}

	public String getDfPartnerName() {
		return dfPartnerName;
	}

	public void setDfPartnerName(String dfPartnerName) {
		this.dfPartnerName = dfPartnerName;
	}

	public String getSealType() {
		return sealType;
	}

	public void setSealType(String sealType) {
		this.sealType = sealType;
	}

	public String getBeforecontractNo() {
		return beforecontractNo;
	}

	public void setBeforecontractNo(String beforecontractNo) {
		this.beforecontractNo = beforecontractNo;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public Integer getSizeFrist() {
		return sizeFrist;
	}

	public void setSizeFrist(Integer sizeFrist) {
		this.sizeFrist = sizeFrist;
	}

	public Integer getSizeLast() {
		return sizeLast;
	}

	public void setSizeLast(Integer sizeLast) {
		this.sizeLast = sizeLast;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public List<String> getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(List<String> companyCode) {
		this.companyCode = companyCode;
	}

	public List<String> getContractCodeQX() {
		return contractCodeQX;
	}

	public void setContractCodeQX(List<String> contractCodeQX) {
		this.contractCodeQX = contractCodeQX;
	}

}
