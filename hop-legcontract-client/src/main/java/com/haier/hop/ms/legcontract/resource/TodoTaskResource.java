package com.haier.hop.ms.legcontract.resource;

import java.util.List;

import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.ActRuTask;
import com.haier.hop.ms.legcontract.dto.LegActivitiDto;

public interface TodoTaskResource {
	/**
	 * 查询当前流程的任务ID
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/getTaskId", method = RequestMethod.GET)
	public JsonResult<String> getTaskId(@RequestParam(value = "procId") String procId);

	@RequestMapping(value = "/getTaskID", method = RequestMethod.POST)
	public List<String> getTaskID(@RequestParam(value = "processInstanceId") String processInstanceId,
								  @RequestParam(value = "user") String user);

	/**
	 * 查询当前流程的任务list
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/getTaskList", method = RequestMethod.GET)
	public JsonResult<List<Task>> getTaskList(@RequestBody LegActivitiDto entity);

	/**
	 * 更新任务状态（传值流程实例id-processInstanceId，任务Key-taskKey，状态字段-states或者任务id-taskId，状态字段-states）
	 * 
	 * @author xuejinxin
	 * @param entity（states：0：挂起，删除 1:正常）
	 * @return
	 */
	@RequestMapping(value = "/updateTaskStates", method = RequestMethod.POST)
	public JsonResult<String> updateTaskStates(@RequestBody LegActivitiDto entity);

	@RequestMapping(value = "/checkpro", method = RequestMethod.POST)
	public JsonResult<Boolean> checkpro(@RequestParam("proId") String proId, @RequestParam("taskKey") String taskKey);

	/**
	 * 获取任务列表
	 * 
	 * @author xuejinxin
	 * @param proId
	 * @param taskKey
	 * @return
	 */
	@RequestMapping(value = "/getTaskInfo", method = RequestMethod.GET)
	public JsonResult<List<ActRuTask>> getTaskInfo(@RequestParam("proId") String proId,
			@RequestParam("assignee") String assignee);
	
	@RequestMapping(value = "/getTasks", method = RequestMethod.GET)
	public JsonResult<List<ActRuTask>> getTasks(@RequestParam("procId") String procId, @RequestParam("assignee") String assignee, 
			@RequestParam("state") String state, @RequestParam("taskId") String taskId, @RequestParam("taskKey") String taskKey);

	/**
	 * 获取变量值
	 * 
	 * @author xuejinxin
	 * @param proId
	 * @param taskKey
	 * @return
	 */
	@RequestMapping(value = "/getRuVariableInfo", method = RequestMethod.GET)
	public JsonResult<String> getRuVariableInfo(@RequestParam("proId") String proId, @RequestParam("name") String name);

}
