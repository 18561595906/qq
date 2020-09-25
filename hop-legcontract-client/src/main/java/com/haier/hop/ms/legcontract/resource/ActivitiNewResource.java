package com.haier.hop.ms.legcontract.resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.dto.ActivitiNewDto;
import com.haier.hop.ms.legcontract.dto.CountersignDto;

public interface ActivitiNewResource {

	/**
	 * @Title: flowStart
	 * @Description: TODO(开始流程)
	 * @param entity
	 * @return
	 * @author ltd
	 * @date 2020-04-27 04:38:42
	 */
	@RequestMapping(value = "/flowStart", method = RequestMethod.POST)
	public JsonResult<CountersignDto> flowStart(@RequestBody ActivitiNewDto entity);
	/**
	 * 办理单人任务
	 *
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/completeTask", method = RequestMethod.POST)
	public JsonResult<CountersignDto> completeTask(@RequestBody ActivitiNewDto entity);

	/**
	 * @Title: completeTaskSignOne
	 * @Description: TODO(办理多人任务(一人驳回直接驳回))
	 * @param entity
	 * @return
	 * @author ltd
	 * @date 2020-05-07 03:12:05
	 */
	@RequestMapping(value = "/completeTaskSignOne", method = RequestMethod.POST)
	public JsonResult<CountersignDto> completeTaskSignOne(@RequestBody ActivitiNewDto entity);
	@RequestMapping(value = "/completeTaskSignOneAllNode", method = RequestMethod.POST)
	JsonResult<CountersignDto> completeTaskSignOneAllNode(@RequestBody ActivitiNewDto entity);
	@RequestMapping(value = "/completeTaskSignOneNew", method = RequestMethod.POST)
	public JsonResult<CountersignDto> completeTaskSignOneNew(@RequestBody ActivitiNewDto entity);
}
