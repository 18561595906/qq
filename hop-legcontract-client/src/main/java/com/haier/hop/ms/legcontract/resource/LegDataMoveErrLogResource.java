package com.haier.hop.ms.legcontract.resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegDataMoveErrLog;

public interface LegDataMoveErrLogResource {

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public JsonResult<Object> insert(@RequestBody LegDataMoveErrLog entity);

}
