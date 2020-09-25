package com.haier.hop.ms.legcontract.resource;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegCountersignHistory;

import io.swagger.annotations.ApiOperation;

public interface LegCountersignHistoryResource {

	@RequestMapping(value = "/selectBusnessNo", method = RequestMethod.GET)
	public JsonResult<List<LegCountersignHistory>> selectBusnessNo(@RequestParam(value = "procId") String procId,
			@RequestParam(value = "taskKey") String taskKey);
	
	@RequestMapping(value = "/selectCommonNode", method = RequestMethod.GET)
	public JsonResult<List<LegCountersignHistory>> selectCommonNode(@RequestParam(value = "json") String json);
	
	@RequestMapping(value = "/getbackContractNum", method = RequestMethod.GET)
	public JsonResult<Integer> getbackContractNum(@RequestParam(value = "procId") String procId, @RequestParam(value = "nodeId") String nodeId,
			@RequestParam(value = "nodeAssignee") String nodeAssignee);
	
	@RequestMapping(value = "/getbackNodeName", method = RequestMethod.GET)
	public JsonResult<String> getbackNodeName(@RequestParam(value = "procId") String procId, @RequestParam(value = "assignee") String assigneee);
	
}
