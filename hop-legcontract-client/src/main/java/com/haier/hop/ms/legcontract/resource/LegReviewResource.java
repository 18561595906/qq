package com.haier.hop.ms.legcontract.resource;

import java.util.List;

import com.haier.hop.ms.legcontract.dto.LegReviewDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegReview;

public interface LegReviewResource {

	@RequestMapping(value = "/getList", method = RequestMethod.POST)
	public JsonResult<List<LegReviewDto>> getList(@RequestParam(value = "procId") String procId);

	@RequestMapping(value = "/getInfo", method = RequestMethod.POST)
	public JsonResult<List<LegReview>> getInfo(@RequestParam(value = "json") String json);

	@RequestMapping(value = "/getListByProDefId", method = RequestMethod.POST)
	JsonResult<List<LegReviewDto>> getListByProDefId(@RequestParam(value = "startTime", required = false) Long startTime,
													 @RequestParam(value = "end_Time", required = false) Long end_Time,
													 @RequestParam(value = "num", required = false) Integer num,
													 @RequestParam("proDefId") String proDefId);

	/**
	 * 保存审批流程信息
	 * 
	 * @author liugan
	 * @param reviewInfo
	 * @return
	 */
	@RequestMapping(value = "/saveLegReview", method = RequestMethod.POST)
	public JsonResult<Object> saveLegReview(@RequestBody LegReview reviewInfo);

	@RequestMapping(value = "/selectMaxDateInfoByProcId", method = RequestMethod.GET)
	public JsonResult<LegReview> selectMaxDateInfoByProcId(@RequestParam(value = "procId") String procId,
			@RequestParam(required = false, value = "reviewResult") String reviewResult);

	@RequestMapping(value = "/getCheckApplyerInfo", method = RequestMethod.POST)
	public JsonResult<List<LegReview>> getCheckApplyerInfo(@RequestParam(value = "procId") String procId);
	
	/**
	 * 流程轨迹更新流程号
	 * 
	 * @author liugan
	 * @param procId
	 * @return
	 */
	@RequestMapping(value = "/updateProcId", method = RequestMethod.POST)
	public boolean updateProcId(@RequestParam(value = "procId") String procId, @RequestParam(value = "newProcId") String newProcId);
}
