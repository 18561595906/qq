package com.haier.hop.ms.legcontractown.resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.dto.CountersignDto;
import com.haier.hop.ms.legcontractown.dto.ActivitiNewDto;

public interface ActivitiNewResource {

	/**
	 * 开始流程示例
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/flowStart", method = RequestMethod.POST)
	public JsonResult<CountersignDto> flowStart(@RequestBody ActivitiNewDto entity);

	/**
	 * 开始流程示例（第一个节点不自动通过）
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/flowStartOne", method = RequestMethod.POST)
	public JsonResult<CountersignDto> flowStartOne(@RequestBody ActivitiNewDto entity);

	/**
	 * 办理单人任务
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/completeTask", method = RequestMethod.POST)
	public JsonResult<CountersignDto> completeTask(@RequestBody ActivitiNewDto entity);

	/**
	 * 办理多人任务
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/completeTaskSign", method = RequestMethod.POST)
	public JsonResult<CountersignDto> completeTaskSign(@RequestBody ActivitiNewDto entity);

	/**
	 * 办理多人任务(一人驳回直接驳回)
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/completeTaskSignOne", method = RequestMethod.POST)
	public JsonResult<CountersignDto> completeTaskSignOne(@RequestBody ActivitiNewDto entity);

	/**
	 * 删除流程（逻辑删除）
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/updataProcess", method = RequestMethod.GET)
	public JsonResult<CountersignDto> updataProcess(@RequestParam(value = "proId") String proId);

}
