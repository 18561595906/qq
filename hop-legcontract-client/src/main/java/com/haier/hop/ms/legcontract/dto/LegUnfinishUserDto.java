package com.haier.hop.ms.legcontract.dto;

/**
 * <p>
 * 	直接采购未完成审核信息
 * </p>
 *
 * @author liugan
 * @since 2020-04-08
 */
public class LegUnfinishUserDto {

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

	public String getNode() {
		return node;
	}

	public void setNode(String node) {
		this.node = node;
	}
}
