package com.haier.hop.ms.legcontract.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.haier.hop.ms.common.JsonResult;

import io.swagger.annotations.ApiOperation;

public interface LegLcmsinfoResource {

	@ApiOperation(value = "从案件系统抓取案件编号入库", notes = "从案件系统抓取案件编号入库")
	@RequestMapping(value = "/getAndInsert", method = RequestMethod.POST)
	public JsonResult<Object> getAndInsert();
}
