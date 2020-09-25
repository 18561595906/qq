package com.haier.hop.ms.legcontract.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;

public interface LegLawUnitserviceResource {

	@RequestMapping(value = "/getLawNo", method = RequestMethod.GET)
	public JsonResult<Object> getLawNo(@RequestParam(value = "compId") String compId);

	@RequestMapping(value = "/getLawNoByLawType", method = RequestMethod.GET)
	public JsonResult<Object> getLawNoByLawType(@RequestParam(value = "compId") String compId,
			@RequestParam(value = "lawType") String lawType);

	@RequestMapping(value = "/getAllLawNo", method = RequestMethod.GET)
	public JsonResult<String> getAllLawNo();

}
