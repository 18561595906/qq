package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 合作方
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-20
 */
@TableName("leg_contract_partner")
public class LegContractPartner extends Model<LegContractPartner> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 关联ID
	 */
	@TableField("RELA_ID")
	private String relaId;
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
	 * 合作方联系人
	 */
	@TableField("PARTNERS_PERSON")
	private String partnersPerson;
	/**
	 * 合作方联系方式
	 */
	@TableField("PARNERS_INFOMATION")
	private String parnersInfomation;
	/**
	 * 是否删除 1不删除 2删除
	 */
	@TableField("IS_DELETE")
	private Integer isDelete;
	/**
	 * 签约人
	 */
	@TableField("CONTRACTOR")
	private String contractor;
	/**
	 * 自主申报：1，合同公议：2
	 */
	@TableField("TYPE")
	private Integer type;
	/**
	 * 签约方，1：甲方，2：乙方，3：丙方
	 */
	@TableField("PARTY_TYPE")
	private String partyType;

	/**
	 * 签约方顺序
	 */
	@TableField("PARTNERS_ORDER")
	private Integer partnersOrder;

	// 甲方乙方
	@TableField(exist = false)
	private String partyTypeName;

	// 非表字段：公司类型
	@TableField(exist = false)
	private String companyType;

	// 非表字段：签约方是否为内部 1,是
	@TableField(exist = false)
	private String partnerIsInternal;

	// 不在中标公司内
	@TableField(exist = false)
	private String notInBidComp;

	public String getPartnerIsInternal() {
		return partnerIsInternal;
	}

	public void setPartnerIsInternal(String partnerIsInternal) {
		this.partnerIsInternal = partnerIsInternal;
	}

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getRelaId() {
		return relaId;
	}

	public void setRelaId(String relaId) {
		this.relaId = relaId;
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

	public String getPartnersPerson() {
		return partnersPerson;
	}

	public void setPartnersPerson(String partnersPerson) {
		this.partnersPerson = partnersPerson;
	}

	public String getParnersInfomation() {
		return parnersInfomation;
	}

	public void setParnersInfomation(String parnersInfomation) {
		this.parnersInfomation = parnersInfomation;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getContractor() {
		return contractor;
	}

	public void setContractor(String contractor) {
		this.contractor = contractor;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getPartyType() {
		return partyType;
	}

	public void setPartyType(String partyType) {
		this.partyType = partyType;
	}

	public Integer getPartnersOrder() {
		return partnersOrder;
	}

	public void setPartnersOrder(Integer partnersOrder) {
		this.partnersOrder = partnersOrder;
	}

	public String getNotInBidComp() {
		return notInBidComp;
	}

	public void setNotInBidComp(String notInBidComp) {
		this.notInBidComp = notInBidComp;
	}

	@Override
	protected Serializable pkVal() {
		return this.rowId;
	}

	@Override
	public String toString() {
		return "LegContractPartner{" + "rowId=" + rowId + ", relaId=" + relaId + ", partnersNo=" + partnersNo
				+ ", partnersName=" + partnersName + ", partnersPerson=" + partnersPerson + ", parnersInfomation="
				+ parnersInfomation + ", isDelete=" + isDelete + ", contractor=" + contractor + ", type=" + type
				+ ", partyType=" + partyType + "}";
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getPartyTypeName() {
		return partyTypeName;
	}

	public void setPartyTypeName(String partyTypeName) {
		this.partyTypeName = partyTypeName;
	}

}
