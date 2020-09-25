package com.haier.hop.ms.legcontract.resource;

import java.util.List;
import java.util.Map;

import com.haier.hop.ms.legcontract.dto.LegReviewDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegCountersign;
import com.haier.hop.ms.legcontract.domain.LegCountersignHistory;

public interface LegCountersignResource {

	@RequestMapping(value = "/selectList", method = RequestMethod.POST)
	public JsonResult<List<LegCountersign>> selectList(@RequestParam(value = "proId") String proId);

	@RequestMapping(value = "/getLegcountersignInfo", method = RequestMethod.POST)
	public String getLegcountersignInfo(@RequestParam(value = "proId") String proId,
			@RequestParam(value = "taskKey") String taskKey);

	@RequestMapping(value = "/getWait", method = RequestMethod.POST)
	List<LegReviewDto> getWait(@RequestParam(value = "proId") String proId, @RequestBody Map<String, String> valmap);

	@RequestMapping(value = "/selectArrList", method = RequestMethod.POST)
	public JsonResult<List<LegCountersign>> selectArrList(@RequestParam(value = "json") String json);

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public JsonResult<Object> insert(@RequestParam(value = "jsonList") String jsonList);

	@RequestMapping(value = "/insertForBody", method = RequestMethod.POST)
	public JsonResult<Object> insertForBody(@RequestBody List<LegCountersign> legCountersigns);

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public JsonResult<Object> update(@RequestParam(value = "json") String json);

	@RequestMapping(value = "/deleteAndInsert", method = RequestMethod.POST)
	public JsonResult<Object> deleteAndInsert(@RequestParam(value = "jsonList") String jsonList);

	@RequestMapping(value = "/selectUntreatedContract", method = RequestMethod.GET)
	public JsonResult<List<LegCountersign>> selectUntreatedContract(
			@RequestParam(value = "taskKey", required = false) String taskKey,
			@RequestParam(value = "day", required = false) Integer day);

	@RequestMapping(value = "/selectUnfiledContract", method = RequestMethod.GET)
	public JsonResult<List<LegCountersign>> selectUnfiledContract(@RequestParam(value = "taskKey") String taskKey,
			@RequestParam(value = "month", required = false) Integer month, @RequestParam(value = "userId", required = false) String userId);

	@RequestMapping(value = "/selectCommonNode", method = RequestMethod.GET)
	public JsonResult<List<LegCountersign>> selectCommonNode(@RequestParam(value = "json") String json);

	@RequestMapping(value = "/selectInvolvedList", method = RequestMethod.POST)
	JsonResult<List<LegCountersign>> selectInvolvedList(@RequestBody LegCountersign entity);

	@RequestMapping(value = "/selectUntreatedContractByMinute", method = RequestMethod.GET)
	JsonResult<List<LegCountersign>> selectUntreatedContractByMinute(
			@RequestParam(value = "taskKey", required = false) String taskKey,
			@RequestParam(value = "minute", required = false) Integer minute);
	
	/**
	 * 检索获取历史会签中当前申报未审批和驳回的公议人信息
	 * 
	 * @author liugan
	 * @param  proId 
	 * @param  taskKey
	 * @return
	 * @see com.haier.hop.ms.countersign.resource.LegCountersignResource#insert(java.util.List)
	 */
	@RequestMapping(value = "/selectLegCountersignHistoryList", method = RequestMethod.GET)
	public List<LegCountersignHistory> selectLegCountersignHistoryList(
			@RequestParam(value = "proId", required = false) String proId
			, @RequestParam(value = "taskKey", required = false) String taskKey);
}
