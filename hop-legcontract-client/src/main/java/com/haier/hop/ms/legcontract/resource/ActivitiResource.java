package com.haier.hop.ms.legcontract.resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.dto.BaseEntity;
import com.haier.hop.ms.legcontract.dto.CountersignDto;
import com.haier.hop.ms.legcontract.dto.LegActivitiDto;

public interface ActivitiResource {

	/**
	 * 创建模型
	 * 
	 * @author xuejinxin
	 * @param baseEntity
	 * @return
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public JsonResult<Object> create(@RequestBody BaseEntity baseEntity);

	/**
	 * 导入流程
	 * 
	 * @author xuejinxin
	 * @param baseEntity
	 * @return
	 */
	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public JsonResult<Object> deployUploadedFile(@RequestParam(value = "uploadfile") MultipartFile uploadfile);

	/**
	 * 获取所有模型
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/getModelList", method = RequestMethod.GET)
	public JsonResult<Object> getModelList();

	/**
	 * 删除模型
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/deleteModel", method = RequestMethod.POST)
	public JsonResult<Object> deleteModel(@RequestParam(value = "id") String id);

	/**
	 * 部署模型
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/deployment", method = RequestMethod.POST)
	public Object deployment(@RequestBody BaseEntity baseEntity) throws Exception;

	/**
	 * 获取所有的流程定义
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/getProcessDefinition", method = RequestMethod.POST)
	public JsonResult<Object> getProcessDefinition(@RequestBody BaseEntity baseEntity);

	/**
	 * 开始流程示例
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/flowStart", method = RequestMethod.POST)
	public JsonResult<CountersignDto> flowStart(@RequestParam(value = "json") String json);

	/**
	 * 开始流程示例范本
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/flowStartForModel", method = RequestMethod.POST)
	public JsonResult<CountersignDto> flowStartForModel(@RequestParam(value = "json") String json);

	/**
	 * 开始流程示例印章
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/flowStartForSeal", method = RequestMethod.POST)
	public JsonResult<Object> flowStartForSeal(@RequestParam(value = "json") String json);

	/**
	 * 开始流程示例公司
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/flowStartForCompany", method = RequestMethod.POST)
	public JsonResult<Object> flowStartForCompany(@RequestParam(value = "json") String json);

	/**
	 * 删除流程示例
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/deleteProcess", method = RequestMethod.POST)
	public JsonResult<String> deleteProcess(@RequestParam(value = "procId") String procId);

	/**
	 * 抢单
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/claim", method = RequestMethod.POST)
	public JsonResult<Object> claim(@RequestParam(value = "json") String json);

	/**
	 * 退回组任务
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/returnGroup", method = RequestMethod.POST)
	public JsonResult<Object> returnGroup(@RequestParam(value = "json") String json);

	/**
	 * 获取当前节点待办人
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/getNextUser", method = RequestMethod.POST)
	public String getNextUser(@RequestParam(value = "procId") String procId, @RequestParam(value = "key") String key);

	/**
	 * 完成任务
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/completeTask", method = RequestMethod.POST)
	public JsonResult<CountersignDto> completeTask(@RequestParam(value = "json") String json);

	/**
	 * 同意或驳回会签任务(当前节点公议)
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/completeTaskForSign", method = RequestMethod.POST)
	public JsonResult<CountersignDto> completeTaskForSign(@RequestParam(value = "json") String json);

	/**
	 * 同意或驳回会签任务(公议节点但不知道下一节点会签)
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/completeTaskForSignNoNext", method = RequestMethod.POST)
	public JsonResult<CountersignDto> completeTaskForSignNoNext(@RequestBody LegActivitiDto entity);

	/**
	 * 完成会签任务（一个同意全部同意）
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/completeSignOne", method = RequestMethod.POST)
	public JsonResult<CountersignDto> completeSignOne(@RequestBody LegActivitiDto entity);

	/**
	 * 完成会签任务（一个驳回全驳回）
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/completeTaskForSignForOne", method = RequestMethod.POST)
	public JsonResult<Object> completeTaskForSignForOne(@RequestParam(value = "json") String json);

	/**
	 * 驳回非并联公议节点用
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/backProcessCommon", method = RequestMethod.POST)
	public JsonResult<CountersignDto> backProcessCommon(@RequestBody LegActivitiDto entity) throws Exception;

	/**
	 * 驳回后重新提交合同公议用
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/backProcessSubmitForModel", method = RequestMethod.POST)
	public JsonResult<Object> backProcessSubmitForModel(@RequestParam(value = "json") String json) throws Exception;

	/**
	 * 单方文件-查询项目
	 * 
	 * @author xuxu
	 * @return
	 */
	@RequestMapping(value = "/getFilePro", method = RequestMethod.POST)
	public JsonResult<Object> getFilePro(String procId);

	/**
	 * 撤回
	 * 
	 * @author xuejinxin
	 * @return
	 */
	@RequestMapping(value = "/withdraw", method = RequestMethod.POST)
	public JsonResult<Object> withdraw(@RequestBody LegActivitiDto entity);
	
	/**
	 * 借款担保驳回使用
	 * 
	 * @author liugan
	 * @return
	 */
	@RequestMapping(value = "/withdrawForloadG", method = RequestMethod.POST)
	public JsonResult<Object> withdrawForloadG(@RequestBody LegActivitiDto entity);

	/**
	 * 获取流程变量
	 *
	 */
	@RequestMapping(value = "/getProcessVariables", method = RequestMethod.GET)
	public JsonResult<Object> getProcessVariables(@RequestParam(value = "procId")String procId,@RequestParam(value = "varName")String varName);
	
	/**
	 * 根据流程号和节点ID获取历史选择人员
	 * @Title: getHistoryAssignees
	 * @Description: TODO(描述)
	 * @param nodeId
	 * @param prodStr
	 * @return
	 * @author author
	 * @date 2020-07-14 03:32:54
	 */
	@RequestMapping(value = "/getHistoryAssignees", method = RequestMethod.GET)
	public JsonResult<String> getHistoryAssignees(@RequestParam(value = "nodeId") String nodeId, @RequestParam(value = "prodStr") String prodStr);

	@RequestMapping(value = "/obtainDefinedId", method = RequestMethod.POST)
	public JsonResult<Object> obtainDefinedId(@RequestParam(value = "procId")String procId);
}
