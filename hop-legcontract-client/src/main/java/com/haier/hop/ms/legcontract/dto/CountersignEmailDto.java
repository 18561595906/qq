package com.haier.hop.ms.legcontract.dto;


/**
 * <p>
 * 会签表
 * </p>
 *
 * @author ly
 * @since 2020-06-08
 */
public class CountersignEmailDto {
	/**
	 * 节点名称
	 */
	private String nodeName;

	/**
	 * 下级节点审核人姓名
	 */
	private String assigneeName;

	/**
	 * 任务id
	 */
	private String taskId;

	/**
	 * 部门名称
	 */
	private String depment;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 电话
	 */
	private String tel;
	/**
	 * @return the nodeName
	 */
	public String getNodeName() {
		return nodeName;
	}
	/**
	 * @param nodeName the nodeName to set
	 */
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	/**
	 * @return the assigneeName
	 */
	public String getAssigneeName() {
		return assigneeName;
	}
	/**
	 * @param assigneeName the assigneeName to set
	 */
	public void setAssigneeName(String assigneeName) {
		this.assigneeName = assigneeName;
	}
	/**
	 * @return the taskId
	 */
	public String getTaskId() {
		return taskId;
	}
	/**
	 * @param taskId the taskId to set
	 */
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	/**
	 * @return the depment
	 */
	public String getDepment() {
		return depment;
	}
	/**
	 * @param depment the depment to set
	 */
	public void setDepment(String depment) {
		this.depment = depment;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	

}
