package com.haier.hop.ms.legcontract.resource;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegContractTextAlignment;

public interface LegContractTextAlignmentResource {

	@RequestMapping(value = "/getWaitHandle", method = RequestMethod.GET)
	public JsonResult<List<LegContractTextAlignment>> getWaitHandle();

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public boolean update(@RequestParam(value = "entity", required = true) String entity);

}
