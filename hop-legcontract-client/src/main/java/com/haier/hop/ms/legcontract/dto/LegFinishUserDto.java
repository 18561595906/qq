package com.haier.hop.ms.legcontract.dto;

/**
 * <p>
 * 	直接采购完成审核信息
 * </p>
 *
 * @author liugan
 * @since 2020-04-08
 */
public class LegFinishUserDto {

	/**
	 * id
	 */
	private String user_id;

	/**
	 * 	审批人工号
	 */
	private String user_num;

	/**
	 * 	审批人姓名
	 */
	private String user_name;
	
	/**
	 * 	审批状态
	 */
	private String check_status;
	
	/**
	 * 	审批意见
	 */
	private String check_opinion;
	
	/**
	 * 	节点名称
	 */
	private String node;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_num() {
		return user_num;
	}

	public void setUser_num(String user_num) {
		this.user_num = user_num;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getCheck_status() {
		return check_status;
	}

	public void setCheck_status(String check_status) {
		this.check_status = check_status;
	}

	public String getCheck_opinion() {
		return check_opinion;
	}

	public void setCheck_opinion(String check_opinion) {
		this.check_opinion = check_opinion;
	}

	public String getNode() {
		return node;
	}

	public void setNode(String node) {
		this.node = node;
	}
}
