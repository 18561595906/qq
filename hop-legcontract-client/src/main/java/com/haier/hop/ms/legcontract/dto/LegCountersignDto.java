package com.haier.hop.ms.legcontract.dto;

import java.util.List;

import com.baomidou.mybatisplus.annotations.TableName;
import com.haier.hop.ms.legcontract.domain.LegAttachment;
import com.haier.hop.ms.legcontract.domain.LegEmployeeAccredit;
import com.haier.hop.ms.legcontract.domain.LegStandardCountersignTmp;

/**
 * <p>
 * 会签表
 * </p>
 *
 * @author xuejinxin
 * @since 2019-06-10
 */
@TableName("leg_countersign")
public class LegCountersignDto extends LegStandardCountersignTmp {

	/**
	 * 任务ID
	 */
	private String taskId;

	/**
	 * 节点名称
	 */
	private String nodeName;

	/**
	 * 公议人名称
	 */
	private String assigneeName;

	/**
	 * 部门
	 */
	private String depment;

	/**
	 * 电话
	 */
	private String tel;

	/**
	 * 邮箱
	 */
	private String email;

	////////////// 不知道哪里用的//////////////////
	/**
	 * 此处为属性说明
	 */
	private static final long serialVersionUID = 5460708830841827977L;
	private List<LegEmployeeAccredit> employees;
	private List<LegAttachment> legAttachments;
	private String reviewDesc;
	
	//////////////// 不知道哪里用的///////////////

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getAssigneeName() {
		return assigneeName;
	}

	public void setAssigneeName(String assigneeName) {
		this.assigneeName = assigneeName;
	}

	public String getDepment() {
		return depment;
	}

	public void setDepment(String depment) {
		this.depment = depment;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getReviewDesc() {
		return reviewDesc;
	}

	public void setReviewDesc(String reviewDesc) {
		this.reviewDesc = reviewDesc;
	}

	public List<LegAttachment> getLegAttachments() {
		return legAttachments;
	}

	public void setLegAttachments(List<LegAttachment> legAttachments) {
		this.legAttachments = legAttachments;
	}

	public List<LegEmployeeAccredit> getEmployees() {
		return employees;
	}

	public void setEmployees(List<LegEmployeeAccredit> employees) {
		this.employees = employees;
	}

}
