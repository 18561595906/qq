package com.haier.hop.ms.legcontract.dto;

import java.util.List;

import com.haier.hop.ms.legcontract.domain.LegContractFileCompareHis;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-25
 */
public class LegCompareAttDto {

	/**
	 * 标准模板
	 */
	private List<LegContractFileCompareHis> standAttInfo;

	/**
	 * 历史文件
	 */
	private List<LegContractFileCompareHis> historyAttList;

	public List<LegContractFileCompareHis> getStandAttInfo() {
		return standAttInfo;
	}

	public void setStandAttInfo(List<LegContractFileCompareHis> standAttInfo) {
		this.standAttInfo = standAttInfo;
	}

	public List<LegContractFileCompareHis> getHistoryAttList() {
		return historyAttList;
	}

	public void setHistoryAttList(List<LegContractFileCompareHis> historyAttList) {
		this.historyAttList = historyAttList;
	}

}
