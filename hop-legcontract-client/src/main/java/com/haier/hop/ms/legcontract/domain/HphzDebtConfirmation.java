package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * 好品海智对账信息表
 * @author ltd
 *
 */
@TableName("HPHZ_DEBT_CONFIRMATION")
public class HphzDebtConfirmation extends Model<HphzDebtConfirmation>{
	
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 账期客户V码（账期客户88码）
	 */
	@TableField("ORDER_CUSTOMER_CODE")
	private String orderCustomerCode;
	/**
	 * 账期客户名称
	 */
	@TableField("ORDER_CUSTOMER_NAME")
	private String orderCustomerName;
	/**
	 * 企业CA证书编号
	 */
	@TableField("CA_NO")
	private String caNo;
	/**
	 * 欠款金额
	 */
	@TableField("AMOUNT")
	private BigDecimal amount;
	/**
	 * 对账时间
	 */
	@TableField("CREATE_DATE")
	private Date createDate;
	/**
	 * 是否已对账（0：未通知     1：已对账    2：已通知未对账）
	 */
	@TableField("IS_SIGNED")
	private String isSigned;
	/**
	 * 用印链接
	 */
	@TableField("SIGN_URL")
	private String signUrl;
	/**
	 * 用印后的下载链接
	 */
	@TableField("DOWN_URL")
	private String downUrl;
	/**
	 * 用印后在线查看链接
	 */
	@TableField("VIEW_URL")
	private String viewUrl;
	
	// 生成的PDF地址
	private String fileUrl;
	
	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getOrderCustomerCode() {
		return orderCustomerCode;
	}

	public void setOrderCustomerCode(String orderCustomerCode) {
		this.orderCustomerCode = orderCustomerCode;
	}

	public String getOrderCustomerName() {
		return orderCustomerName;
	}

	public void setOrderCustomerName(String orderCustomerName) {
		this.orderCustomerName = orderCustomerName;
	}

	public String getCaNo() {
		return caNo;
	}

	public void setCaNo(String caNo) {
		this.caNo = caNo;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getIsSigned() {
		return isSigned;
	}

	public void setIsSigned(String isSigned) {
		this.isSigned = isSigned;
	}

	public String getSignUrl() {
		return signUrl;
	}

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}

	public String getDownUrl() {
		return downUrl;
	}

	public void setDownUrl(String downUrl) {
		this.downUrl = downUrl;
	}

	public String getViewUrl() {
		return viewUrl;
	}

	public void setViewUrl(String viewUrl) {
		this.viewUrl = viewUrl;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}
	
	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	@Override
	public String toString() {
		return "HphzDebtConfirmation [rowId=" + rowId + ", orderCustomerCode=" + orderCustomerCode
				+ ", orderCustomerName=" + orderCustomerName + ", caNo=" + caNo + ", amount=" + amount + ", createDate="
				+ createDate + ", isSigned=" + isSigned + ", signUrl=" + signUrl + ", downUrl=" + downUrl + ", viewUrl="
				+ viewUrl + "]";
	}
	
}
