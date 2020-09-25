package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2020-03-04
 */
@TableName("leg_rrs_contract")
public class LegRrsContract extends Model<LegRrsContract> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("id")
	private String id;
	/**
	 * 合同编号
	 */
	@TableField("contract_no")
	private String contractNo;
	/**
	 * 用户标识
	 */
	@TableField("member_id")
	private String memberId;
	/**
	 * 合同类型（0 免费 1 买断 91 企业代理 92 政府代理）
	 */
	@TableField("contract_type")
	private String contractType;
	/**
	 * 合同签订者类型（1个人 2企业 3政府）
	 */
	@TableField("user_type")
	private String userType;
	/**
	 * 合同关联的对象id， 售水机的合同关联到water_dispenser的id 运营商的合同关联到_agent的id
	 */
	@TableField("relate_id")
	private String relateId;
	/**
	 * 签章后的合同在文件服务器的id
	 */
	private String signed;
	/**
	 * pdf合同影像路径
	 */
	private String url;
	/**
	 * 签章后的合同在文件服务器的名称
	 */
	@TableField("signed_name")
	private String signedName;
	/**
	 * 合同签订的时间
	 */
	@TableField("signed_at")
	private Date signedAt;
	/**
	 * 创建时间
	 */
	@TableField("created_at")
	private Date createdAt;
	/**
	 * 生成合同的因子
	 */
	private String eid;
	/**
	 * 更新时间
	 */
	@TableField("updated_at")
	private Date updatedAt;
	/**
	 * 渲染合同的参数
	 */
	@TableField("rendered_params")
	private String renderedParams;
	/**
	 * 签约方乙方
	 */
	@TableField("signed_yi")
	private String signedYi;
	/**
	 * 签约方甲方
	 */
	@TableField("signed_jia")
	private String signedJia;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getRelateId() {
		return relateId;
	}

	public void setRelateId(String relateId) {
		this.relateId = relateId;
	}

	public String getSigned() {
		return signed;
	}

	public void setSigned(String signed) {
		this.signed = signed;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSignedName() {
		return signedName;
	}

	public void setSignedName(String signedName) {
		this.signedName = signedName;
	}

	public Date getSignedAt() {
		return signedAt;
	}

	public void setSignedAt(Date signedAt) {
		this.signedAt = signedAt;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getRenderedParams() {
		return renderedParams;
	}

	public void setRenderedParams(String renderedParams) {
		this.renderedParams = renderedParams;
	}

	public String getSignedYi() {
		return signedYi;
	}

	public void setSignedYi(String signedYi) {
		this.signedYi = signedYi;
	}

	public String getSignedJia() {
		return signedJia;
	}

	public void setSignedJia(String signedJia) {
		this.signedJia = signedJia;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegRrsContract{" + "id=" + id + ", contractNo=" + contractNo + ", memberId=" + memberId
				+ ", contractType=" + contractType + ", userType=" + userType + ", relateId=" + relateId + ", signed="
				+ signed + ", url=" + url + ", signedName=" + signedName + ", signedAt=" + signedAt + ", createdAt="
				+ createdAt + ", eid=" + eid + ", updatedAt=" + updatedAt + ", renderedParams=" + renderedParams
				+ ", signedYi=" + signedYi + ", signedJia=" + signedJia + "}";
	}
}
