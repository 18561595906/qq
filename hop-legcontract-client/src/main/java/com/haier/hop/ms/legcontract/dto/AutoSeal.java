package com.haier.hop.ms.legcontract.dto;

/**
 * <p>
 * 自动盖章参数
 * </p>
 *
 * @author lyy
 * @since 2020-06-05
 */
public class AutoSeal {
	private String transactionId;//交易号
	private String contractId;   //合同编号
	private String customerId;	 //客户编号
	private String employeeId;	 //员工编号
	private String clientRole;	 //客户角色
	private String docTitle;     //文档标题
	private String signK_keyword;//定位关键字
	private String notifyUrl;    //签署结果异步通知URL
	
	
	private String companyCode;//公司编码
	private String sealCode;//印章编码
	private String procId;//流程号
	/**
	 * @return the transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}
	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	/**
	 * @return the contractId
	 */
	public String getContractId() {
		return contractId;
	}
	/**
	 * @param contractId the contractId to set
	 */
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}
	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the employeeId
	 */
	public String getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the clientRole
	 */
	public String getClientRole() {
		return clientRole;
	}
	/**
	 * @param clientRole the clientRole to set
	 */
	public void setClientRole(String clientRole) {
		this.clientRole = clientRole;
	}
	/**
	 * @return the docTitle
	 */
	public String getDocTitle() {
		return docTitle;
	}
	/**
	 * @param docTitle the docTitle to set
	 */
	public void setDocTitle(String docTitle) {
		this.docTitle = docTitle;
	}
	/**
	 * @return the signK_keyword
	 */
	public String getSignK_keyword() {
		return signK_keyword;
	}
	/**
	 * @param signK_keyword the signK_keyword to set
	 */
	public void setSignK_keyword(String signK_keyword) {
		this.signK_keyword = signK_keyword;
	}
	/**
	 * @return the notifyUrl
	 */
	public String getNotifyUrl() {
		return notifyUrl;
	}
	/**
	 * @param notifyUrl the notifyUrl to set
	 */
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
	/**
	 * @return the companyCode
	 */
	public String getCompanyCode() {
		return companyCode;
	}
	/**
	 * @param companyCode the companyCode to set
	 */
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	/**
	 * @return the sealCode
	 */
	public String getSealCode() {
		return sealCode;
	}
	/**
	 * @param sealCode the sealCode to set
	 */
	public void setSealCode(String sealCode) {
		this.sealCode = sealCode;
	}
	/**
	 * @return the procId
	 */
	public String getProcId() {
		return procId;
	}
	/**
	 * @param procId the procId to set
	 */
	public void setProcId(String procId) {
		this.procId = procId;
	}
	
}
