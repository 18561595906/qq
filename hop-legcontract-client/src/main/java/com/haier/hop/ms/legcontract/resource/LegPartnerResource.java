package com.haier.hop.ms.legcontract.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.constant.IConstInfo;
import com.haier.hop.ms.legcontract.domain.LegCompany;
import com.haier.hop.ms.legcontract.dto.LegPartnerDto;
import com.haier.hop.ms.page.PageBean;

public interface LegPartnerResource {

	@RequestMapping(value = "/getCompanyInfo", method = RequestMethod.GET)
	public JsonResult<PageBean<LegPartnerDto>> getCompanyInfo(
			@RequestParam(required = false, value = "companyCode") String companyCode,
			@RequestParam(required = false, value = "companyName") String companyName,
			@RequestParam(value = "currentPage", required = false, defaultValue = IConstInfo.DEFAULT_CURRENT_PAGE) Integer currentPage,
			@RequestParam(value = "pageSize", required = false, defaultValue = IConstInfo.DEFAULT_PAGESIZE) Integer pageSize);

	@RequestMapping(value = "/selectAccountCompany", method = RequestMethod.GET)
	public JsonResult<PageBean<LegCompany>> selectAccountCompany(
			@RequestParam(required = false, value = "companyCode") String companyCode,
			@RequestParam(required = false, value = "companyName") String companyName,
			@RequestParam(value = "currentPage", required = false, defaultValue = IConstInfo.DEFAULT_CURRENT_PAGE) Integer currentPage,
			@RequestParam(value = "pageSize", required = false, defaultValue = IConstInfo.DEFAULT_PAGESIZE) Integer pageSize);

}
