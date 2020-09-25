package com.haier.hop.ms.legcontract.dto;

import java.math.BigDecimal;
import java.util.List;

import com.haier.hop.ms.legcontract.domain.LegContractApproveType;
import com.haier.hop.ms.legcontract.domain.LegContractPartner;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-17
 */
public class LegApproverSelectDto {

	// 系统来源
	private String sysId;
	// 业务单元
	private String bizCode;
	// 合同编号
	private String contractCode;
	// 节点id
	private String nodeId;
	// 签约方
	private List<LegContractPartner> contractPartnerInfoList;
	// 确定不确定金额
	private String payType;
	// 付款金额
	private BigDecimal payAmount;
	// 合同类型
	private String contractInsideType;
	// 当前登陆用户
	private String userNo;
	// 查询条件：员工编号
	private String empSn;
	// 查询条件：员工名称
	private String empName;
	// 公议人族群
	private String ruleString;
	// 公议人最小职级
	private String beginBand;
	private String businessUserNo;
	// 节点公议人：族群集合
	private List<LegContractApproveType> approveTypeList;
	// 屏蔽公议人
	private List<String> shieldUsers;
	// 历史公议人员
	private String exAssignees;

	private Integer currentPage;
	private Integer pageSize;

	public String getSysId() {
		return sysId;
	}

	public void setSysId(String sysId) {
		this.sysId = sysId;
	}

	public String getBizCode() {
		return bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public List<LegContractPartner> getContractPartnerInfoList() {
		return contractPartnerInfoList;
	}

	public void setContractPartnerInfoList(List<LegContractPartner> contractPartnerInfoList) {
		this.contractPartnerInfoList = contractPartnerInfoList;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public BigDecimal getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(BigDecimal payAmount) {
		this.payAmount = payAmount;
	}

	public String getContractInsideType() {
		return contractInsideType;
	}

	public void setContractInsideType(String contractInsideType) {
		this.contractInsideType = contractInsideType;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
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

	public String getRuleString() {
		return ruleString;
	}

	public void setRuleString(String ruleString) {
		this.ruleString = ruleString;
	}

	public String getBeginBand() {
		return beginBand;
	}

	public void setBeginBand(String beginBand) {
		this.beginBand = beginBand;
	}

	public String getBusinessUserNo() {
		return businessUserNo;
	}

	public void setBusinessUserNo(String businessUserNo) {
		this.businessUserNo = businessUserNo;
	}

	public List<LegContractApproveType> getApproveTypeList() {
		return approveTypeList;
	}

	public void setApproveTypeList(List<LegContractApproveType> approveTypeList) {
		this.approveTypeList = approveTypeList;
	}

	public List<String> getShieldUsers() {
		return shieldUsers;
	}

	public void setShieldUsers(List<String> shieldUsers) {
		this.shieldUsers = shieldUsers;
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

	public String getExAssignees() {
		return exAssignees;
	}

	public void setExAssignees(String exAssignees) {
		this.exAssignees = exAssignees;
	}

}
