package com.haier.hop.ms.legcontractown.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.haier.hop.ms.legcontract.domain.LegAttachment;

/**
 * <p>
 * </p>
 *
 * @author xuejinxin
 * @since 2020-04-16
 */
@TableName("leg_overseas_brand")
public class LegOverseasBrand extends Model<LegOverseasBrand> {

	private static final long serialVersionUID = 1L;
	/**
	 * 当前是否选中
	 */
	@TableField(exist = false)
	private Boolean check;
	/**
	 * 商标(展示用)
	 */
	@TableField(exist = false)
	private String brandDisplay;
	@TableField(exist = false)
	private List<String> countryList;// 客户国家多选list
	@TableField(exist = false)
	private List<String> dateList;// 时间list
	@TableField(exist = false)
	private List<LegAttachment> attachments;// 附件list
	/**
	 * 商标
	 */
	@TableField("BRAND")
	private String brand;
	/**
	 * 有效开始日期
	 */
	@TableField("START_DATE")
	private Date startDate;
	/**
	 * 有效结束日期
	 */
	@TableField("END_DATE")
	private Date endDate;
	/**
	 * 国家
	 */
	@TableField("COUNTRY")
	private String country;
	/**
	 * 许可证
	 */
	@TableField("LICENCE")
	private String licence;
	/**
	 * 合同ID
	 */
	@TableField("CONTRACT_ID")
	private String contractId;
	/**
	 * 创建时间
	 */
	@TableField("CTEATE_TIME")
	private Date cteateTime;
	/**
	 * 文件url
	 */
	@TableField("FILEURL")
	private String fileurl;

	public String getBrandDisplay() {
		return brandDisplay;
	}

	public void setBrandDisplay(String brandDisplay) {
		this.brandDisplay = brandDisplay;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Date getStartDate() {
		return startDate;
	}

	public List<LegAttachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<LegAttachment> attachments) {
		this.attachments = attachments;
	}

	public List<String> getDateList() {
		return dateList;
	}

	public void setDateList(List<String> dateList) {
		this.dateList = dateList;
	}

	public List<String> getCountryList() {
		return countryList;
	}

	public void setCountryList(List<String> countryList) {
		this.countryList = countryList;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLicence() {
		return licence;
	}

	public void setLicence(String licence) {
		this.licence = licence;
	}

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public Date getCteateTime() {
		return cteateTime;
	}

	public Boolean getCheck() {
		return check;
	}

	public void setCheck(Boolean check) {
		this.check = check;
	}

	public void setCteateTime(Date cteateTime) {
		this.cteateTime = cteateTime;
	}

	public String getFileurl() {
		return fileurl;
	}

	public void setFileurl(String fileurl) {
		this.fileurl = fileurl;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegOverseasBrand{" + "brand=" + brand + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", country=" + country + ", licence=" + licence + ", contractId=" + contractId + ", cteateTime="
				+ cteateTime + ", fileurl=" + fileurl + "}";
	}
}
