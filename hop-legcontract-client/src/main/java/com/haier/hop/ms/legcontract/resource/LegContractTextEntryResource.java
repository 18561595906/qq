package com.haier.hop.ms.legcontract.resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegContractTextEntry;

import io.swagger.annotations.ApiOperation;

public interface LegContractTextEntryResource {
	
	@ApiOperation(value = "判断是否需要里程碑信息", notes = "判断是否需要里程碑信息")
	@PostMapping(value = "/getList")
	public JsonResult<Object> getList(@RequestBody LegContractTextEntry contractEntry);

}
