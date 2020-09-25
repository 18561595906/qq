package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
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
@TableName("leg_contract_yjxt_ylhtl_detail")
public class LegContractYjxtYlhtlDetail extends Model<LegContractYjxtYlhtlDetail> {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 流程id
	 */
	@TableField("requestid")
	private String requestid;
	/**
	 * 附件名称
	 */
	@TableField("scgfyyht")
	private String scgfyyht;
	
	/**
	 * 调用参数1(日期yyyy-mm-dd)
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

	@Override
	protected Serializable pkVal() {
		return null;
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
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "LegContractYjxt{" + "requestid=" + requestid + ", scgfyyht=" + scgfyyht
				+ ", in0=" + in0 + ", in1=" + in1 + ", in2=" + in2 +"}";
	}
}
