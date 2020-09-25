package com.haier.hop.ms.legcontract.resource;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegContractNode;

public interface LegContractNodeResource {

	@RequestMapping(value = "/getActivitiDesc", method = RequestMethod.GET)
	public JsonResult<Object> getActivitiDesc(@RequestParam(value = "rowId") String rowId);

	@RequestMapping(value = "/getNodeList", method = RequestMethod.POST)
	public JsonResult<List<LegContractNode>> getNodeList(@RequestBody LegContractNode legContractNode);
}
