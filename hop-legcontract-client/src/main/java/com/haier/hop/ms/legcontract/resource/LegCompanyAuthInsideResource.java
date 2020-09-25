package com.haier.hop.ms.legcontract.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegCompanyAuthInside;
import io.swagger.annotations.ApiOperation;

public interface LegCompanyAuthInsideResource {

	/**
	 * @Description: 获取公司类型
	 * @author: liugan
	 * @date:   2020-1-14
	 * @param: COMPANY_CODE (签约方code)
	 * @return companyType 公司类型
	 */	
	@ApiOperation(value = "通过公司code获取公司类型", notes = "通过公司code获取公司类型")
	@RequestMapping(value = "/getgetCompanyTypeByCode", method = RequestMethod.GET)
	public JsonResult<LegCompanyAuthInside> getCompanyTypeByCode(@RequestParam(value = "companyCode") String companyCode);

}
