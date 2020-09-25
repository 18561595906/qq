package com.haier.hop.ms.legcontract.resource;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegCountersignTmp;

public interface LegCountersignTmpResource {

	@RequestMapping(value = "/selectList", method = RequestMethod.POST)
	public JsonResult<Object> selectList(@RequestParam(value = "proId") String proId);

	@RequestMapping(value = "/deleteAndInsert", method = RequestMethod.POST)
	public JsonResult<Object> deleteAndInsert(@RequestParam(value = "jsonList") String jsonList);

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public JsonResult<Object> delete(@RequestParam(value = "procId") String procId);

	@RequestMapping(value = "/deleteByProcId", method = RequestMethod.POST)
	public JsonResult<Object> deleteByProcId(String proId);

	@RequestMapping(value = "/selectTmpList", method = RequestMethod.POST)
	public JsonResult<List<LegCountersignTmp>> selectTmpList(@RequestParam(value = "json") String json);

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public JsonResult<Object> insert(@RequestParam(value = "jsonList") String jsonList);

	@RequestMapping(value = "/deleteByProcIdAndTaskKey", method = RequestMethod.POST)
	public JsonResult<Object> deleteByProcIdAndTaskKey(@RequestParam(value = "procId") String procId,
			@RequestParam(value = "taskKey") String taskKey);

	/**
	 * 会签临时删除相应节点数据再插入
	 * 
	 * @author liugan
	 * @param procId
	 * @param taskKey
	 * @param LegCountersignTmp
	 * @return
	 */
	@RequestMapping(value = "/delAndInsert", method = RequestMethod.POST)
	public JsonResult<Object> delAndInsert(@RequestBody LegCountersignTmp tmp);

	@RequestMapping(value = "/getCountersignByProId", method = RequestMethod.GET)
	public JsonResult<List<LegCountersignTmp>> getCountersignByProId(@RequestParam(value = "procId") String procId);

	@RequestMapping(value = "/getCountersignByProIdAndNodeId", method = RequestMethod.GET)
	public JsonResult<List<LegCountersignTmp>> getCountersignByProIdAndNodeId(
			@RequestParam(value = "procId") String procId, @RequestParam(value = "nodeId") String nodeId);
	
	/**
	 * 会签临时表检索返回节点审批人用逗号隔开
	 * 
	 * @author liugan
	 * @param LegCountersignTmp
	 * @return
	 */
	@RequestMapping(value = "/selectSpeakerList", method = RequestMethod.POST)
	public JsonResult<List<LegCountersignTmp>> selectSpeakerList(@RequestParam(value = "json") String json);
}
