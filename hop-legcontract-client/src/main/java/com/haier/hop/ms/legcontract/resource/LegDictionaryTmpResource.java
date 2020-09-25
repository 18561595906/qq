package com.haier.hop.ms.legcontract.resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegDictionaryTmp;

public interface LegDictionaryTmpResource {

	@RequestMapping(value = "/insertTmp", method = RequestMethod.POST)
	public JsonResult<Object> insertTmp(
			@RequestParam(value = "legDictionaryTmp", required = false) String legDictionaryTmp);

	@RequestMapping(value = "/selectTmp", method = RequestMethod.POST)
	public String selectTmp(@RequestParam(value = "contractType") String contractType);

	@RequestMapping(value = "/deleteTmp", method = RequestMethod.POST)
	public JsonResult<String> deleteTmp(@RequestParam(value = "contractType") String contractType);

	@RequestMapping(value = "/getLegDictionaryTmp", method = RequestMethod.POST)
	public JsonResult<LegDictionaryTmp> getLegDictionaryTmp(@RequestBody LegDictionaryTmp legDictionaryTmp);

	@RequestMapping(value = "/updateLegDictionaryTmp", method = RequestMethod.POST)
	public JsonResult<String> updateLegDictionaryTmp(@RequestBody LegDictionaryTmp legDictionaryTmp);

	@RequestMapping(value = "/tmpToFormal", method = RequestMethod.POST)
	public JsonResult<String> tmpToFormal(@RequestBody LegDictionaryTmp legDictionaryTmp);
}
