package com.haier.hop.ms.legcontractown.dto;

import com.baomidou.mybatisplus.annotations.TableName;
import com.haier.hop.ms.legcontractown.domain.LegOverseasCustomer;

/**
 * <p>
 * 海外客户信息表
 * </p>
 *
 * @author xuejinxin
 * @since 2020-04-16
 */
@TableName("leg_overseas_customer")
public class OverseasCustomerDto extends LegOverseasCustomer {
	/**
	 * 此处为属性说明
	 */
	private static final long serialVersionUID = 1L;
	// 当前页数
	private int currentPage;
	// 每页数据条数
	private int pageSize;
	// 当前页第一条
	private int sizeFrist;
	// 当前页最后一条
	private int sizeLast;
	/**
	 * 采购额2017
	 */
	private String purAmount2017;
	/**
	 * 采购额2016
	 */
	private String purAmount2016;
	/**
	 * 采购额2015
	 */
	private String purAmount2015;

	/**
	 * 应收总额
	 */
	private String iar;
	/**
	 * 逾期总额
	 */
	private String idue;
	/**
	 * 3年内逾期次数
	 */
	private String iduecount;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getSizeFrist() {
		return sizeFrist;
	}

	public void setSizeFrist(int sizeFrist) {
		this.sizeFrist = sizeFrist;
	}

	public int getSizeLast() {
		return sizeLast;
	}

	public void setSizeLast(int sizeLast) {
		this.sizeLast = sizeLast;
	}

	public String getPurAmount2017() {
		return purAmount2017;
	}

	public void setPurAmount2017(String purAmount2017) {
		this.purAmount2017 = purAmount2017;
	}

	public String getPurAmount2016() {
		return purAmount2016;
	}

	public void setPurAmount2016(String purAmount2016) {
		this.purAmount2016 = purAmount2016;
	}

	public String getPurAmount2015() {
		return purAmount2015;
	}

	public void setPurAmount2015(String purAmount2015) {
		this.purAmount2015 = purAmount2015;
	}

	public String getIar() {
		return iar;
	}

	public void setIar(String iar) {
		this.iar = iar;
	}

	public String getIdue() {
		return idue;
	}

	public void setIdue(String idue) {
		this.idue = idue;
	}

	public String getIduecount() {
		return iduecount;
	}

	public void setIduecount(String iduecount) {
		this.iduecount = iduecount;
	}

}
