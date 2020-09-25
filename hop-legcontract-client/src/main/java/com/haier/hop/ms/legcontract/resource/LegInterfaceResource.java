package com.haier.hop.ms.legcontract.resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegInterfaceRecord;

import io.swagger.annotations.ApiOperation;

public interface LegInterfaceResource {

	@ApiOperation(value = "添加接口调用记录", notes = "添加接口调用记录")
	@RequestMapping(value = "insertInterface", method = RequestMethod.POST)
	public JsonResult<String> insertInterface(@RequestBody LegInterfaceRecord record);

}
