package com.haier.hop.ms.legcontract.resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegContractExpireNoRemind;

import io.swagger.annotations.ApiOperation;

public interface LegContractExpireNoRemindResource {

	@ApiOperation(value = "查询信息", notes = "查询信息")
	@RequestMapping(value = "/selectList", method = RequestMethod.POST)
	public JsonResult<Object> selectList(@RequestBody LegContractExpireNoRemind entity);

}
