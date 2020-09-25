package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
  *   对接印鉴系统 -医疗合同类数据表
 * (印鉴系统-医疗合同类接口)
 * </p>
 *
 * @author ly
 * @since 2020-07-02
 */
@TableName("leg_contract_yjxt_ylhtl")
public class LegContractYjxtYlhtl extends Model<LegContractYjxtYlhtl> {
	private static final long serialVersionUID = 1L;
	//合同开始日期
	@TableField(exist = false)
	private String htksrqStart;
	//合同结束日期
	@TableField(exist = false)
	private String htjsrqEnd;
	//合同发起开始日期
	@TableField(exist = false)
	private String sxqStart;
	//合同发起结束日期
	@TableField(exist = false)
	private String sxqEnd;
	//取不同类别的合同标志
	@TableField(exist = false)
	private  String wfid;
	//附件
	@TableField(exist = false)
	private  String scgzwj;
	/**
	 * 插入数据时间日期
	 */
	@TableField("insert_date")
	private String insertDate;
	//附件名称
	@TableField(exist = false)
	private String scgfyyht;
	/**
	 * 合同名称
	 */
	@TableField("htmc")
	private String htmc;
	/**
	 * 类型
	 */
	@TableField("lx")
	private String lx;
	/**
	 *合同发起日期
	 */
	@TableField("sxq")
	private Date sxq;
	/**
	 * 流程id
	 */
	@TableField("requestid")
	private String requestid;
	/**
	 * 合同发起人
	 */
	@TableField("htfqr")
	private String htfqr;
	/**
	 * 发起人部门
	 */
	@TableField("fqrbm")
	private String fqrbm;
	/**
	 * 邮箱
	 */
	@TableField("yx")
	private String yx;
	/**
	 * 我方单位名称
	 */
	@TableField("wfdwmc")
	private String wfdwmc;
	/**
	 * 签约供应商名称
	 */
	@TableField("qygysmc")
	private String qygysmc;	
	/**
	 * 合同开始日期
	 */
	@TableField("htksrq")
	private Date htksrq;
	/**
	 * 合同结束日期
	 */
	@TableField("htjsrq")
	private Date htjsrq;
	/**
	 * 备用字段1
	 */
	@TableField("byzd1")
	private String byzd1;
	/**
	 * 备用字段2
	 */
	@TableField("byzd2")
	private String byzd2;
	/**
	 * 备用字段3
	 */
	@TableField("byzd3")
	private String byzd3;
	/**
	 * 备用字段4
	 */
	@TableField("byzd4")
	private String byzd4;
	/**
	 * 备用字段5
	 */
	@TableField("byzd5")
	private String byzd5;
	/**
	 * 调用参数1(日期 yyyy-mm-dd)
	 */
	@TableField("in0")
	private String in0;
	/**
	 * 调用参数2(LEG固定传3，获取归档的数据，流程状态 ： 创建1；提交/批准2；归档3)
	 */
	@TableField("in1")
	private String in1;
	/**
	 * 调用参数3
	 */
	@TableField("in2")
	private int in2;

	@Override
	protected Serializable pkVal() {
		return null;
	}
    

	/**
	 * @return the htmc
	 */
	public String getHtmc() {
		return htmc;
	}


	/**
	 * @return the scgzwj
	 */
	public String getScgzwj() {
		return scgzwj;
	}


	/**
	 * @param scgzwj the scgzwj to set
	 */
	public void setScgzwj(String scgzwj) {
		this.scgzwj = scgzwj;
	}


	/**
	 * @param htmc the htmc to set
	 */
	public void setHtmc(String htmc) {
		this.htmc = htmc;
	}


	/**
	 * @return the lx
	 */
	public String getLx() {
		return lx;
	}


	/**
	 * @param lx the lx to set
	 */
	public void setLx(String lx) {
		this.lx = lx;
	}


	/**
	 * @return the sxq
	 */
	public Date getSxq() {
		return sxq;
	}


	/**
	 * @param sxq the sxq to set
	 */
	public void setSxq(Date sxq) {
		this.sxq = sxq;
	}


	/**
	 * @return the requestid
	 */
	public String getRequestid() {
		return requestid;
	}


	/**
	 * @param requestid the requestid to set
	 */
	public void setRequestid(String requestid) {
		this.requestid = requestid;
	}


	/**
	 * @return the htfqr
	 */
	public String getHtfqr() {
		return htfqr;
	}


	/**
	 * @param htfqr the htfqr to set
	 */
	public void setHtfqr(String htfqr) {
		this.htfqr = htfqr;
	}


	/**
	 * @return the fqrbm
	 */
	public String getFqrbm() {
		return fqrbm;
	}


	/**
	 * @param fqrbm the fqrbm to set
	 */
	public void setFqrbm(String fqrbm) {
		this.fqrbm = fqrbm;
	}


	/**
	 * @return the yx
	 */
	public String getYx() {
		return yx;
	}


	/**
	 * @param yx the yx to set
	 */
	public void setYx(String yx) {
		this.yx = yx;
	}


	/**
	 * @return the wfdwmc
	 */
	public String getWfdwmc() {
		return wfdwmc;
	}


	/**
	 * @param wfdwmc the wfdwmc to set
	 */
	public void setWfdwmc(String wfdwmc) {
		this.wfdwmc = wfdwmc;
	}


	/**
	 * @return the qygysmc
	 */
	public String getQygysmc() {
		return qygysmc;
	}


	/**
	 * @param qygysmc the qygysmc to set
	 */
	public void setQygysmc(String qygysmc) {
		this.qygysmc = qygysmc;
	}

	/**
	 * @return the htksrq
	 */
	public Date getHtksrq() {
		return htksrq;
	}


	/**
	 * @param htksrq the htksrq to set
	 */
	public void setHtksrq(Date htksrq) {
		this.htksrq = htksrq;
	}


	/**
	 * @return the htjsrq
	 */
	public Date getHtjsrq() {
		return htjsrq;
	}


	/**
	 * @param htjsrq the htjsrq to set
	 */
	public void setHtjsrq(Date htjsrq) {
		this.htjsrq = htjsrq;
	}


	/**
	 * @return the in0
	 */
	public String getIn0() {
		return in0;
	}

	/**
	 * @param in0 the in0 to set
	 */
	public void setIn0(String in0) {
		this.in0 = in0;
	}

	/**
	 * @return the in2
	 */
	public int getIn2() {
		return in2;
	}


	/**
	 * @return the scgfyyht
	 */
	public String getScgfyyht() {
		return scgfyyht;
	}


	/**
	 * @param scgfyyht the scgfyyht to set
	 */
	public void setScgfyyht(String scgfyyht) {
		this.scgfyyht = scgfyyht;
	}


	/**
	 * @param in2 the in2 to set
	 */
	public void setIn2(int in2) {
		this.in2 = in2;
	}

	/**
	 * @return the byzd1
	 */
	public String getByzd1() {
		return byzd1;
	}

	/**
	 * @param byzd1 the byzd1 to set
	 */
	public void setByzd1(String byzd1) {
		this.byzd1 = byzd1;
	}

	/**
	 * @return the byzd2
	 */
	public String getByzd2() {
		return byzd2;
	}


	/**
	 * @param byzd2 the byzd2 to set
	 */
	public void setByzd2(String byzd2) {
		this.byzd2 = byzd2;
	}


	/**
	 * @return the byzd3
	 */
	public String getByzd3() {
		return byzd3;
	}


	/**
	 * @param byzd3 the byzd3 to set
	 */
	public void setByzd3(String byzd3) {
		this.byzd3 = byzd3;
	}


	/**
	 * @return the byzd4
	 */
	public String getByzd4() {
		return byzd4;
	}


	/**
	 * @param byzd4 the byzd4 to set
	 */
	public void setByzd4(String byzd4) {
		this.byzd4 = byzd4;
	}


	/**
	 * @return the byzd5
	 */
	public String getByzd5() {
		return byzd5;
	}


	/**
	 * @param byzd5 the byzd5 to set
	 */
	public void setByzd5(String byzd5) {
		this.byzd5 = byzd5;
	}

	
	/**
	 * @return the htksrqStart
	 */
	public String getHtksrqStart() {
		return htksrqStart;
	}


	/**
	 * @param htksrqStart the htksrqStart to set
	 */
	public void setHtksrqStart(String htksrqStart) {
		this.htksrqStart = htksrqStart;
	}


	/**
	 * @return the htjsrqEnd
	 */
	public String getHtjsrqEnd() {
		return htjsrqEnd;
	}


	/**
	 * @param htjsrqEnd the htjsrqEnd to set
	 */
	public void setHtjsrqEnd(String htjsrqEnd) {
		this.htjsrqEnd = htjsrqEnd;
	}


	/**
	 * @return the wfid
	 */
	public String getWfid() {
		return wfid;
	}

	/**
	 * @return the in1
	 */
	public String getIn1() {
		return in1;
	}

	/**
	 * @param in1 the in1 to set
	 */
	public void setIn1(String in1) {
		this.in1 = in1;
	}

	/**
	 * @param wfid the wfid to set
	 */
	public void setWfid(String wfid) {
		this.wfid = wfid;
	}
	
	/**
	 * @return the insertDate
	 */
	public String getInsertDate() {
		return insertDate;
	}


	/**
	 * @param insertDate the insertDate to set
	 */
	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}


	/**
	 * @return the sxqStart
	 */
	public String getSxqStart() {
		return sxqStart;
	}


	/**
	 * @param sxqStart the sxqStart to set
	 */
	public void setSxqStart(String sxqStart) {
		this.sxqStart = sxqStart;
	}


	/**
	 * @return the sxqEnd
	 */
	public String getSxqEnd() {
		return sxqEnd;
	}


	/**
	 * @param sxqEnd the sxqEnd to set
	 */
	public void setSxqEnd(String sxqEnd) {
		this.sxqEnd = sxqEnd;
	}


	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "LegContractYjxt{" + "requestid=" + requestid + ", htmc=" + htmc + ", lx="+ lx  + ", sxq="+ sxq
				+ ", htfqr=" + htfqr + ", fqrbm=" + fqrbm + ", yx="+ yx + ", wfdwmc=" + wfdwmc + ", qygysmc=" + qygysmc + ", htksrq="+ htksrq
				+ ", htjsrq=" + htjsrq + ", byzd1="+ byzd1 + ", byzd2=" + byzd2 + ", byzd3=" + byzd3 + ", byzd4="+ byzd4+ ", insertDate="+ insertDate
				+ ", byzd5=" + byzd5 + ", in0="+ in0+ ", in1="+ in1+ ", in2="+ in2+"}";
	}
}
