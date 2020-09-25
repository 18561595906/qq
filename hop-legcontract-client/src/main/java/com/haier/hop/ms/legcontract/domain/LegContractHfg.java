package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 对接财务公司合同数据表
 * </p>
 *
 * @author shiyingxin
 * @since 2020-04-15
 */
@TableName("leg_contract_hfg")
public class LegContractHfg extends Model<LegContractHfg> {

	private static final long serialVersionUID = 1L;

	/**
	 * 合同分类
	 */
	@TableField("contract_type")
	private String contractType;
	/**
	 * 合同笔数
	 */
	@TableField("contract_num")
	private BigDecimal contractNum;
	/**
	 * 合同金额汇总
	 */
	@TableField("contract_amout")
	private BigDecimal contractAmout;
	/**
	 * 数据日期
	 */
	@TableField("data_time")
	private String dataTime;
	/**
	 * 来源系统
	 */
	@TableField("source_name")
	private String sourceName;
	/**
	 * 合同状态
	 */
	@TableField("contract_status")
	private String contractStatus;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 保留字段1
	 */
	private String reserved1;
	/**
	 * 保留字段2
	 */
	private String reserved2;
	/**
	 * 保留字段3
	 */
	private String reserved3;
	/**
	 * 保留字段4
	 */
	private String reserved4;
	/**
	 * 创建时间
	 */
	@TableField("create_date")
	private Date createDate;
	/**
	 * 修改时间
	 */
	@TableField("update_date")
	private Date updateDate;

	// 创建时间开始
	@TableField(exist = false)
	private Date createDateFrom;

	// 创建时间结束
	@TableField(exist = false)
	private Date createDateTo;

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public BigDecimal getContractNum() {
		return contractNum;
	}

	public void setContractNum(BigDecimal contractNum) {
		this.contractNum = contractNum;
	}

	public BigDecimal getContractAmout() {
		return contractAmout;
	}

	public void setContractAmout(BigDecimal contractAmout) {
		this.contractAmout = contractAmout;
	}

	public String getDataTime() {
		return dataTime;
	}

	public void setDataTime(String dataTime) {
		this.dataTime = dataTime;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getContractStatus() {
		return contractStatus;
	}

	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getReserved1() {
		return reserved1;
	}

	public void setReserved1(String reserved1) {
		this.reserved1 = reserved1;
	}

	public String getReserved2() {
		return reserved2;
	}

	public void setReserved2(String reserved2) {
		this.reserved2 = reserved2;
	}

	public String getReserved3() {
		return reserved3;
	}

	public void setReserved3(String reserved3) {
		this.reserved3 = reserved3;
	}

	public String getReserved4() {
		return reserved4;
	}

	public void setReserved4(String reserved4) {
		this.reserved4 = reserved4;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Date getCreateDateFrom() {
		return createDateFrom;
	}

	public void setCreateDateFrom(Date createDateFrom) {
		this.createDateFrom = createDateFrom;
	}

	public Date getCreateDateTo() {
		return createDateTo;
	}

	public void setCreateDateTo(Date createDateTo) {
		this.createDateTo = createDateTo;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegContractHfg{" + "contractType=" + contractType + ", contractNum=" + contractNum + ", contractAmout="
				+ contractAmout + ", dataTime=" + dataTime + ", sourceName=" + sourceName + ", contractStatus="
				+ contractStatus + ", remark=" + remark + ", reserved1=" + reserved1 + ", reserved2=" + reserved2
				+ ", reserved3=" + reserved3 + ", reserved4=" + reserved4 + ", createDate=" + createDate
				+ ", updateDate=" + updateDate + "}";
	}
}
