package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 印章使用表
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-19
 */
@TableName("leg_seal_use")
public class LegSealUse extends Model<LegSealUse> {

	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 流程实例ID
	 */
	@TableField("PRO_ID")
	private String proId;
	/**
	 * 申请单编号
	 */
	@TableField("APPLY_NO")
	private String applyNo;
	/**
	 * 申请时间
	 */
	@TableField("APPLY_DATE")
	private Date applyDate;
	/**
	 * 申请部门
	 */
	@TableField("APPLY_DEMP")
	private String applyDemp;
	/**
	 * 用章申请人
	 */
	@TableField("APPLY_USER")
	private String applyUser;
	/**
	 * 申请人编号
	 */
	@TableField("APPLY_USERNO")
	private String applyUserno;
	/**
	 * 文件份数
	 */
	@TableField("FILE_COUNT")
	private BigDecimal fileCount;
	/**
	 * 用印名称
	 */
	@TableField("SEAL_NAME")
	private String sealName;
	/**
	 * 印章管理员
	 */
	@TableField("SEAL_ADMIN")
	private String sealAdmin;
	/**
	 * 拟报送机关
	 */
	@TableField("SUBMIT_ORGAN")
	private String submitOrgan;
	/**
	 * 简要内容说明
	 */
	@TableField("CONTENTS")
	private String contents;
	/**
	 * 用印时间
	 */
	@TableField("SEALUSE_DATE")
	private Date sealuseDate;
	/**
	 * 印章管理员编号
	 */
	@TableField("SEAL_ADMINNO")
	private String sealAdminno;
	/**
	 * 每份文件的页数
	 */
	@TableField("FILE_PAGE")
	private BigDecimal filePage;
	/**
	 * 用印文件资料名称
	 */
	@TableField("ATT_NAME")
	private String attName;
	/**
	 * 印章所属公司编号
	 */
	@TableField("SEAL_COMNO")
	private String sealComno;
	/**
	 * 印章所属公司
	 */
	@TableField("SEAL_COM")
	private String sealCom;
	/**
	 * 印章使用编码
	 */
	@TableField("SEAL_USERNO")
	private String sealUserno;
	/**
	 * 自主用印关联id
	 */
	@TableField("RELA_ID")
	private String relaId;
	/**
	 * 印章编码
	 */
	@TableField("SEAL_NO")
	private String sealNo;
	/**
	 * 用印顺序
	 */
	@TableField("SEAL_ORDER")
	private String sealOrder;
	@TableField("SEAL_RESTR_LIMIT")
	private String sealRestrLimit;


	/**
	 * 是否有印章的用印
	 */
	@TableField(exist = false)
	private String hasSeal;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getProId() {
		return proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}

	public String getApplyNo() {
		return applyNo;
	}

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public Date getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public String getApplyDemp() {
		return applyDemp;
	}

	public void setApplyDemp(String applyDemp) {
		this.applyDemp = applyDemp;
	}

	public String getApplyUser() {
		return applyUser;
	}

	public void setApplyUser(String applyUser) {
		this.applyUser = applyUser;
	}

	public String getApplyUserno() {
		return applyUserno;
	}

	public void setApplyUserno(String applyUserno) {
		this.applyUserno = applyUserno;
	}

	public BigDecimal getFileCount() {
		return fileCount;
	}

	public void setFileCount(BigDecimal fileCount) {
		this.fileCount = fileCount;
	}

	public String getSealName() {
		return sealName;
	}

	public void setSealName(String sealName) {
		this.sealName = sealName;
	}

	public String getSealAdmin() {
		return sealAdmin;
	}

	public void setSealAdmin(String sealAdmin) {
		this.sealAdmin = sealAdmin;
	}

	public String getSubmitOrgan() {
		return submitOrgan;
	}

	public void setSubmitOrgan(String submitOrgan) {
		this.submitOrgan = submitOrgan;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Date getSealuseDate() {
		return sealuseDate;
	}

	public void setSealuseDate(Date sealuseDate) {
		this.sealuseDate = sealuseDate;
	}

	public String getSealAdminno() {
		return sealAdminno;
	}

	public void setSealAdminno(String sealAdminno) {
		this.sealAdminno = sealAdminno;
	}

	public BigDecimal getFilePage() {
		return filePage;
	}

	public void setFilePage(BigDecimal filePage) {
		this.filePage = filePage;
	}

	public String getAttName() {
		return attName;
	}

	public void setAttName(String attName) {
		this.attName = attName;
	}

	public String getSealComno() {
		return sealComno;
	}

	public void setSealComno(String sealComno) {
		this.sealComno = sealComno;
	}

	public String getSealCom() {
		return sealCom;
	}

	public void setSealCom(String sealCom) {
		this.sealCom = sealCom;
	}

	public String getSealUserno() {
		return sealUserno;
	}

	public void setSealUserno(String sealUserno) {
		this.sealUserno = sealUserno;
	}

	public String getRelaId() {
		return relaId;
	}

	public void setRelaId(String relaId) {
		this.relaId = relaId;
	}

	public String getSealNo() {
		return sealNo;
	}

	public void setSealNo(String sealNo) {
		this.sealNo = sealNo;
	}

	public String getSealOrder() {
		return sealOrder;
	}

	public void setSealOrder(String sealOrder) {
		this.sealOrder = sealOrder;
	}

	public String getSealRestrLimit() {
		return sealRestrLimit;
	}

	public void setSealRestrLimit(String sealRestrLimit) {
		this.sealRestrLimit = sealRestrLimit;
	}

	public String getHasSeal() {
		return hasSeal;
	}

	public void setHasSeal(String hasSeal) {
		this.hasSeal = hasSeal;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegSealUse{" + "rowId=" + rowId + ", proId=" + proId + ", applyNo=" + applyNo + ", applyDate="
				+ applyDate + ", applyDemp=" + applyDemp + ", applyUser=" + applyUser + ", applyUserno=" + applyUserno
				+ ", fileCount=" + fileCount + ", sealName=" + sealName + ", sealAdmin=" + sealAdmin + ", submitOrgan="
				+ submitOrgan + ", contents=" + contents + ", sealuseDate=" + sealuseDate + ", sealAdminno="
				+ sealAdminno + ", filePage=" + filePage + ", attName=" + attName + ", sealComno=" + sealComno
				+ ", sealCom=" + sealCom + ", sealUserno=" + sealUserno + ", relaId=" + relaId + ", sealNo=" + sealNo
				+ ", sealOrder=" + sealOrder + ", sealRestrLimit=" + sealRestrLimit + "}";
	}
}
