package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 平台长授权查询员工级别表
 * </p>
 *
 * @author shiyingxin
 * @since 2019-09-20
 */
@TableName("leg_contract_delegate_bandcode")
public class LegContractDelegateBandcode extends Model<LegContractDelegateBandcode> {

	private static final long serialVersionUID = 1L;

	/**
	 * 开始查询的级别
	 */
	@TableField("START_BAND_CODE")
	private String startBandCode;
	/**
	 * 结束查询的级别
	 */
	@TableField("END_BAND_CODE")
	private String endBandCode;

	public String getStartBandCode() {
		return startBandCode;
	}

	public void setStartBandCode(String startBandCode) {
		this.startBandCode = startBandCode;
	}

	public String getEndBandCode() {
		return endBandCode;
	}

	public void setEndBandCode(String endBandCode) {
		this.endBandCode = endBandCode;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegContractDelegateBandcode{" + "startBandCode=" + startBandCode + ", endBandCode=" + endBandCode + "}";
	}
}
