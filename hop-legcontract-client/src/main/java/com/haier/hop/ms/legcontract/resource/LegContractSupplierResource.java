package com.haier.hop.ms.legcontract.resource;

import java.util.List;

import com.baomidou.mybatisplus.plugins.Page;
import com.haier.hop.ms.legcontract.domain.LegContractTmp;
import com.haier.hop.ms.legcontract.domain.SupplierSelectDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.dto.LegContractSupplierDto;
import com.haier.hop.ms.legcontract.dto.LegContractSupplierToDoListDto;
import com.haier.hop.ms.legcontract.dto.LegElectronicContractParamDto;

import io.swagger.annotations.ApiOperation;

public interface LegContractSupplierResource {

	/**
	 * 查询待办
	 * 
	 * @param userId       用户账号
	 * @return
	 */
	@ApiOperation(value = "查询待办", notes = "查询待办")
	@RequestMapping(value = "/selectToDoList", method = RequestMethod.GET)
	public JsonResult<List<LegContractSupplierToDoListDto>> selectToDoList(
			@RequestParam(value = "userId") String userId);

	@ApiOperation(value = "查询待办", notes = "查询待办")
	@RequestMapping(value = "/selectToDoPage", method = RequestMethod.POST)
	Page<LegContractTmp> selectToDoPage(@RequestBody SupplierSelectDto selectDto, @RequestParam String userId);

	/**
	 * 
	 * @param procId 流程id
	 * @param userId 用户账号
	 * @return
	 */
	@ApiOperation(value = "画面初始化", notes = "画面初始化")
	@RequestMapping(value = "/init", method = RequestMethod.GET)
	public JsonResult<LegContractSupplierDto> init(@RequestParam(value = "procId") String procId,
			@RequestParam(value = "userId") String userId);

	@ApiOperation(value = "电子用印-盖章", notes = "盖章")
	@RequestMapping(value = "/stamp", method = RequestMethod.POST)
	public JsonResult<Object> stamp(@RequestBody LegElectronicContractParamDto dto);

	/**
	 * @param procId     流程id
	 * @param taskId     任务id
	 * @param reasonDesc 原因详细
	 * @param userId     用户账号
	 * @param userName   用户名称
	 */
	@ApiOperation(value = "电子用印-退回", notes = "退回")
	@RequestMapping(value = "/overrule", method = RequestMethod.POST)
	public JsonResult<Object> overrule(@RequestParam("procId") String procId, @RequestParam("taskId") String taskId,
			@RequestParam("reasonDesc") String reasonDesc, @RequestParam("userId") String userId,
			@RequestParam("userName") String userName);

	/**
	 * @param procId   流程id
	 * @param taskId   任务id
	 * @param userId   用户账号
	 * @param userName 用户名称
	 */
	@ApiOperation(value = "电子用印-提交", notes = "提交")
	@RequestMapping(value = "/electronicSubmit", method = RequestMethod.POST)
	public JsonResult<Object> electronicSubmit(@RequestParam(value = "procId") String procId,
			@RequestParam(value = "taskId") String taskId, @RequestParam(value = "userId") String userId,
			@RequestParam(value = "userName") String userName);

	@ApiOperation(value = "查询已完成合同", notes = "查询已完成合同")
	@RequestMapping(value = "/selectCompletedContract", method = RequestMethod.GET)
	public JsonResult<Object> selectCompletedContract(@RequestParam(value = "compVcode") String compVcode);

	@ApiOperation(value = "查询已完成合同", notes = "查询已完成合同")
	@RequestMapping(value = "/selectCompletedContractPage", method = RequestMethod.POST)
	Page<LegContractTmp> selectCompletedContractPage(@RequestBody SupplierSelectDto selectDto);
}
