package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
  *   对接印鉴系统 -接口流程名称维护表
 * </p>
 *
 * @author lyy
 * @since 2020-07-02
 */
@TableName("leg_contract_yjxt_wfid")
public class LegContractYjxtWfid extends Model<LegContractYjxtWfid> {
	private static final long serialVersionUID = 1L;
	/**
	 * 类别1级
	 */
	@TableField("lb1")
	private String lb1;
	/**
	 * 类别2级
	 */
	@TableField("lb2")
	private String lb2;
	/**
	 * 流程名称
	 */
	@TableField("lcmc")
	private String lcmc;
	/**
	 * wfid
	 */
	@TableField("wfid")
	private int wfid;
	
    
	
	/**
	 * @return the lb1
	 */
	public String getLb1() {
		return lb1;
	}
	/**
	 * @param lb1 the lb1 to set
	 */
	public void setLb1(String lb1) {
		this.lb1 = lb1;
	}
	/**
	 * @return the lb2
	 */
	public String getLb2() {
		return lb2;
	}
	/**
	 * @param lb2 the lb2 to set
	 */
	public void setLb2(String lb2) {
		this.lb2 = lb2;
	}
	/**
	 * @return the lcmc
	 */
	public String getLcmc() {
		return lcmc;
	}
	/**
	 * @param lcmc the lcmc to set
	 */
	public void setLcmc(String lcmc) {
		this.lcmc = lcmc;
	}
	
	@Override
	protected Serializable pkVal() {
		return null;
	}
	
	/**
	 * @return the wfid
	 */
	public int getWfid() {
		return wfid;
	}
	/**
	 * @param wfid the wfid to set
	 */
	public void setWfid(int wfid) {
		this.wfid = wfid;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "LegContractYjxt{lb1=" + lb1 + ", lb2=" + lb2 + ", lcmc="+ lcmc  + ", wfid="+ wfid+"}";
	}
}
