package com.haier.hop.ms.legcontractown.domain;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * </p>
 *
 * @author xuejinxin
 * @since 2020-05-22
 */
@TableName("leg_overseas_contract_seal")
public class LegOverseasContractSeal extends Model<LegOverseasContractSeal> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableField("ROW_ID")
	private String rowId;
	/**
	 * 合同ID
	 */
	@TableField("CONTRACT_ID")
	private String contractId;
	/**
	 * 用印文件名称
	 */
	@TableField("SEAL_NAME")
	private String sealName;
	/**
	 * 单份文件页数
	 */
	@TableField("ONE_FILE_NUM")
	private Integer oneFileNum;
	/**
	 * 份数
	 */
	@TableField("NUM")
	private Integer num;
	/**
	 * 用印个数
	 */
	@TableField("SEAL_NUM")
	private Integer sealNum;

	/**
	 * 样式
	 */
	@TableField(exist = false)
	private String delICO;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getDelICO() {
		return delICO;
	}

	public void setDelICO(String delICO) {
		this.delICO = delICO;
	}

	public String getSealName() {
		return sealName;
	}

	public void setSealName(String sealName) {
		this.sealName = sealName;
	}

	public Integer getOneFileNum() {
		return oneFileNum;
	}

	public void setOneFileNum(Integer oneFileNum) {
		this.oneFileNum = oneFileNum;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Integer getSealNum() {
		return sealNum;
	}

	public void setSealNum(Integer sealNum) {
		this.sealNum = sealNum;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegOverseasContractSeal{" + "rowId=" + rowId + ", contractId=" + contractId + ", sealName=" + sealName
				+ ", oneFileNum=" + oneFileNum + ", num=" + num + ", sealNum=" + sealNum + "}";
	}
}
