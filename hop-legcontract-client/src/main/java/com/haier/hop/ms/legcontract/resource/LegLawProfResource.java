package com.haier.hop.ms.legcontract.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;

public interface LegLawProfResource {

	@RequestMapping(value = "/getUnilFileLawNo", method = RequestMethod.POST)
	public JsonResult<Object> getUnilFileLawNo(@RequestParam(value = "profSer1") String profSer1, @RequestParam(value = "profSer2") String profSer2);
}
