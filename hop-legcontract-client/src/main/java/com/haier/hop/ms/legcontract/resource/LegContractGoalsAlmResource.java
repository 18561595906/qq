package com.haier.hop.ms.legcontract.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;

public interface LegContractGoalsAlmResource {

	@RequestMapping(value = "/getList", method = RequestMethod.GET)
	public JsonResult<Object> getList(@RequestParam(value = "contNo")  String contNo);

}
