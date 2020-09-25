package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 不确定金额配置平台长
 * </p>
 *
 * @author shiyingxin
 * @since 2019-07-22
 */
@TableName("leg_contract_unce_amount_ptz")
public class LegContractUnceAmountPtz extends Model<LegContractUnceAmountPtz> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private Integer rowId;
	/**
	 * 业务单元编码
	 */
	@TableField("BIZ_CODE")
	private String bizCode;
	/**
	 * 业务单元类型
	 */
	@TableField("BIZ_NAME")
	private String bizName;
	/**
	 * 合同类型
	 */
	@TableField("CONT_TYPE")
	private String contType;
	/**
	 * 合同类型名称
	 */
	@TableField("CONT_NAME")
	private String contName;
	/**
	 * 合作方编码
	 */
	@TableField("PARTNERS_NO")
	private String partnersNo;
	/**
	 * 合作方名称
	 */
	@TableField("PARTNERS_NAME")
	private String partnersName;
	/**
	 * 平台长工号
	 */
	@TableField("PTZ_EMP_SN")
	private String ptzEmpSn;
	/**
	 * 平台长名称
	 */
	@TableField("PTZ_EMP_NAME")
	private String ptzEmpName;
	/**
	 * 是否有效
	 */
	@TableField("DELFLAG")
	private Integer delflag;

	public Integer getRowId() {
		return rowId;
	}

	public void setRowId(Integer rowId) {
		this.rowId = rowId;
	}

	public String getBizCode() {
		return bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizName() {
		return bizName;
	}

	public void setBizName(String bizName) {
		this.bizName = bizName;
	}

	public String getContType() {
		return contType;
	}

	public void setContType(String contType) {
		this.contType = contType;
	}

	public String getContName() {
		return contName;
	}

	public void setContName(String contName) {
		this.contName = contName;
	}

	public String getPartnersNo() {
		return partnersNo;
	}

	public void setPartnersNo(String partnersNo) {
		this.partnersNo = partnersNo;
	}

	public String getPartnersName() {
		return partnersName;
	}

	public void setPartnersName(String partnersName) {
		this.partnersName = partnersName;
	}

	public String getPtzEmpSn() {
		return ptzEmpSn;
	}

	public void setPtzEmpSn(String ptzEmpSn) {
		this.ptzEmpSn = ptzEmpSn;
	}

	public String getPtzEmpName() {
		return ptzEmpName;
	}

	public void setPtzEmpName(String ptzEmpName) {
		this.ptzEmpName = ptzEmpName;
	}

	public Integer getDelflag() {
		return delflag;
	}

	public void setDelflag(Integer delflag) {
		this.delflag = delflag;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegContractUnceAmountPtz{" + "rowId=" + rowId + ", bizCode=" + bizCode + ", bizName=" + bizName
				+ ", contType=" + contType + ", contName=" + contName + ", partnersNo=" + partnersNo + ", partnersName="
				+ partnersName + ", ptzEmpSn=" + ptzEmpSn + ", ptzEmpName=" + ptzEmpName + ", delflag=" + delflag + "}";
	}
}
