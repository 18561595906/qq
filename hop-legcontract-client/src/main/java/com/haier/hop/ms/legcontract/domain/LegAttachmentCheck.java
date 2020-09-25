package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 附件保存校验
 * </p>
 *
 * @author wdh
 * @since 2019-07-31
 */
@TableName("leg_attachment_check")
public class LegAttachmentCheck extends Model<LegAttachmentCheck> {

	private static final long serialVersionUID = 1L;

	/**
	 * 附件id
	 */
	@TableField("ATTACHMENT_ID")
	private String attachmentId;
	@TableField("REASON")
	private String reason;
	@TableField("CONTRACT_ID")
	private String contractId;
	@TableField("ATTACHMENT_NAME")
	private String attachmentName;

	public String getAttachmentId() {
		return attachmentId;
	}

	public void setAttachmentId(String attachmentId) {
		this.attachmentId = attachmentId;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getAttachmentName() {
		return attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegAttachmentCheck{" + "attachmentId=" + attachmentId + ", reason=" + reason + ", contractId="
				+ contractId + ", attachmentName=" + attachmentName + "}";
	}
}
