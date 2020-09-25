package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 对接印鉴系统合同数据表
 * (印鉴系统  合同类接口)
 * </p>
 *
 * @author ly
 * @since 2020-04-17
 */
@TableName("leg_contract_yjxt_htl")
public class LegContractYjxt extends Model<LegContractYjxt> {
	private static final long serialVersionUID = 1L;
	//申请开始日期
	@TableField(exist = false)
	private String sqrqStart;
	//申请结束日期
	@TableField(exist = false)
	private String sqrqEnd;
	//合同开始日期
	@TableField(exist = false)
	private String htksrqStart;
	//合同结束日期
	@TableField(exist = false)
	private String htjsrqEnd;
	
	//取不同类别的合同标志
	@TableField(exist = false)
	private  String wfid;
	/**
	 * 插入数据时间日期
	 */
	@TableField("insert_date")
	private String insertDate;
	/**
	 * 标题
	 */
	@TableField("requestname")
	private String requestname;
	/**
	 * 流程id
	 */
	@TableField("requestid")
	private String requestid;
	/**
	 * 编号
	 */
	@TableField("bh")
	private String bh;
	/**
	 * 经办人
	 */
	@TableField("jbr")
	private String jbr;
	/**
	 * 申请日期
	 */
	@TableField("sqrq")
	private Date sqrq;
	/**
	 * 小微/平台
	 */
	@TableField("xwpt")
	private String xwpt;
	/**
	 * 公司
	 */
	@TableField("gs")
	private String gs;
	/**
	 * 文件表述
	 */
	@TableField("wjbs")
	private String wjbs;
	/**
	 * 签约方
	 */
	@TableField("qyf")
	private String qyf;	
	/**
	 * 签约对方
	 */
	@TableField("qydf")
	private String qydf;
	/**
	 * 合同金额
	 */
	@TableField("htfkje")
	private String htfkje;
	/**
	 * 合同金额类型
	 */
	@TableField("htjelx")
	private String htjelx;
	
	/**
	 * 合同签订日期
	 */
	@TableField("htqdrq")
	private String htqdrq;
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
	 *上传各方用印合同
	 */
	@TableField("scgzwj")
	private String scgzwj;
	/**
	 * 平台主
	 */
	@TableField("ptz")
	private String ptz;
	/**
	 * 财务公议
	 */
	@TableField("cwgy")
	private String cwgy;
	/**
	 * 战略公议
	 */
	@TableField("zlgy")
	private String zlgy;
	/**
	 * 人力公议
	 */
	@TableField("rlgy")
	private String rlgy;
	/**
	 * 法务公议
	 */
	@TableField("fwgy")
	private String fwgy;
	/**
	 * 领域主
	 */
	@TableField("lyz")
	private String lyz;
	
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
	 * 调用参数1
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
	 * @param in2 the in2 to set
	 */
	public void setIn2(int in2) {
		this.in2 = in2;
	}


	/**
	 * @return the requestname
	 */
	public String getRequestname() {
		return requestname;
	}


	/**
	 * @param requestname the requestname to set
	 */
	public void setRequestname(String requestname) {
		this.requestname = requestname;
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
	 * @return the bh
	 */
	public String getBh() {
		return bh;
	}


	/**
	 * @param bh the bh to set
	 */
	public void setBh(String bh) {
		this.bh = bh;
	}


	/**
	 * @return the jbr
	 */
	public String getJbr() {
		return jbr;
	}


	/**
	 * @param jbr the jbr to set
	 */
	public void setJbr(String jbr) {
		this.jbr = jbr;
	}


	/**
	 * @return the sqrq
	 */
	public Date getSqrq() {
		return sqrq;
	}


	/**
	 * @param sqrq the sqrq to set
	 */
	public void setSqrq(Date sqrq) {
		this.sqrq = sqrq;
	}


	/**
	 * @return the xwpt
	 */
	public String getXwpt() {
		return xwpt;
	}


	/**
	 * @param xwpt the xwpt to set
	 */
	public void setXwpt(String xwpt) {
		this.xwpt = xwpt;
	}


	/**
	 * @return the gs
	 */
	public String getGs() {
		return gs;
	}


	/**
	 * @param gs the gs to set
	 */
	public void setGs(String gs) {
		this.gs = gs;
	}


	/**
	 * @return the wjbs
	 */
	public String getWjbs() {
		return wjbs;
	}


	/**
	 * @param wjbs the wjbs to set
	 */
	public void setWjbs(String wjbs) {
		this.wjbs = wjbs;
	}


	/**
	 * @return the qyf
	 */
	public String getQyf() {
		return qyf;
	}


	/**
	 * @param qyf the qyf to set
	 */
	public void setQyf(String qyf) {
		this.qyf = qyf;
	}


	/**
	 * @return the qydf
	 */
	public String getQydf() {
		return qydf;
	}


	/**
	 * @param qydf the qydf to set
	 */
	public void setQydf(String qydf) {
		this.qydf = qydf;
	}


	/**
	 * @return the htfkje
	 */
	public String getHtfkje() {
		return htfkje;
	}


	/**
	 * @param htfkje the htfkje to set
	 */
	public void setHtfkje(String htfkje) {
		this.htfkje = htfkje;
	}


	/**
	 * @return the htjelx
	 */
	public String getHtjelx() {
		return htjelx;
	}


	/**
	 * @param htjelx the htjelx to set
	 */
	public void setHtjelx(String htjelx) {
		this.htjelx = htjelx;
	}


	/**
	 * @return the htqdrq
	 */
	public String getHtqdrq() {
		return htqdrq;
	}


	/**
	 * @param htqdrq the htqdrq to set
	 */
	public void setHtqdrq(String htqdrq) {
		this.htqdrq = htqdrq;
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
	 * @return the ptz
	 */
	public String getPtz() {
		return ptz;
	}


	/**
	 * @param ptz the ptz to set
	 */
	public void setPtz(String ptz) {
		this.ptz = ptz;
	}


	/**
	 * @return the cwgy
	 */
	public String getCwgy() {
		return cwgy;
	}


	/**
	 * @param cwgy the cwgy to set
	 */
	public void setCwgy(String cwgy) {
		this.cwgy = cwgy;
	}


	/**
	 * @return the zlgy
	 */
	public String getZlgy() {
		return zlgy;
	}


	/**
	 * @param zlgy the zlgy to set
	 */
	public void setZlgy(String zlgy) {
		this.zlgy = zlgy;
	}


	/**
	 * @return the rlgy
	 */
	public String getRlgy() {
		return rlgy;
	}


	/**
	 * @param rlgy the rlgy to set
	 */
	public void setRlgy(String rlgy) {
		this.rlgy = rlgy;
	}


	/**
	 * @return the fwgy
	 */
	public String getFwgy() {
		return fwgy;
	}


	/**
	 * @param fwgy the fwgy to set
	 */
	public void setFwgy(String fwgy) {
		this.fwgy = fwgy;
	}


	/**
	 * @return the lyz
	 */
	public String getLyz() {
		return lyz;
	}


	/**
	 * @param lyz the lyz to set
	 */
	public void setLyz(String lyz) {
		this.lyz = lyz;
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
	 * @return the sqrqStart
	 */
	public String getSqrqStart() {
		return sqrqStart;
	}


	/**
	 * @param sqrqStart the sqrqStart to set
	 */
	public void setSqrqStart(String sqrqStart) {
		this.sqrqStart = sqrqStart;
	}


	/**
	 * @return the sqrqEnd
	 */
	public String getSqrqEnd() {
		return sqrqEnd;
	}


	/**
	 * @param sqrqEnd the sqrqEnd to set
	 */
	public void setSqrqEnd(String sqrqEnd) {
		this.sqrqEnd = sqrqEnd;
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
	 * @param wfid the wfid to set
	 */
	public void setWfid(String wfid) {
		this.wfid = wfid;
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
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "LegContractYjxt{" + "requestid=" + requestid + ", requestname=" + requestname + ", bh="+ bh  + ", wfid="+ wfid+ ", in0="+ in0+ ", in1="+ in1+ ", in2="+ in2
				+ ", jbr=" + jbr + ", sqrq=" + sqrq + ", xwpt="+ xwpt + ", gs=" + gs + ", wjbs=" + wjbs + ", qyf="+ qyf
				+ ", qydf=" + qydf + ", htfkje=" + htfkje+ ", htjelx=" + htjelx + ", htqdrq=" + htqdrq + ", htksrq=" + htksrq
				+ ", htjsrq=" + htjsrq + ", scgzwj=" + scgzwj + ", ptz=" + ptz  + ", cwgy=" + cwgy +", zlgy="+ zlgy + ", rlgy=" + rlgy
				+ ", fwgy=" + fwgy + ", lyz=" + lyz + ", byzd1="+ byzd1 + ", byzd2=" + byzd2 + ", byzd3=" + byzd3 + ", byzd4="+ byzd4
				+ ", byzd5=" + byzd5+ ", insertDate="+ insertDate +"}";
	}
}
