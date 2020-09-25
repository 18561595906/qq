package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 邮件模板表
 * </p>
 *
 * @author lixianhua
 * @since 2019-08-01
 */
@TableName("leg_email_template")
public class LegEmailTemplate extends Model<LegEmailTemplate> {

	private static final long serialVersionUID = 1L;

	/**
	 * 模板主键
	 */
	@TableId("row_id")
	private String rowId;
	/**
	 * 邮件名称
	 */
	@TableField("email_name")
	private String emailName;
	/**
	 * 邮件主题
	 */
	@TableField("email_subject")
	private String emailSubject;
	/**
	 * 邮件内容
	 */
	@TableField("email_content")
	private String emailContent;
	/**
	 * 邮件编码（唯一）
	 */
	@TableField("email_code")
	private String emailCode;
	/**
	 * 删除标识（0：未删除1：已删除）
	 */
	@TableField("del_flag")
	private Integer delFlag;
	/**
	 * 创建人
	 */
	@TableField("create_user")
	private String createUser;
	/**
	 * 创建时间
	 */
	@TableField("create_time")
	private String createTime;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getEmailName() {
		return emailName;
	}

	public void setEmailName(String emailName) {
		this.emailName = emailName;
	}

	public String getEmailSubject() {
		return emailSubject;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	public String getEmailContent() {
		return emailContent;
	}

	public void setEmailContent(String emailContent) {
		this.emailContent = emailContent;
	}

	public String getEmailCode() {
		return emailCode;
	}

	public void setEmailCode(String emailCode) {
		this.emailCode = emailCode;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	@Override
	protected Serializable pkVal() {
		return this.rowId;
	}

	@Override
	public String toString() {
		return "LegEmailTemplate{" + "rowId=" + rowId + ", emailName=" + emailName + ", emailSubject=" + emailSubject
				+ ", emailContent=" + emailContent + ", emailCode=" + emailCode + ", delFlag=" + delFlag
				+ ", createUser=" + createUser + ", createTime=" + createTime + "}";
	}
}
