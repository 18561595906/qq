package com.haier.hop.ms.legcontract.resource;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegRegistrationInfoDzht;

import io.swagger.annotations.ApiOperation;

public interface LegRegistrationInfoDzhtResource {

	/**
	 * 获取CAno
	 * 
	 * @param empNo
	 * @param sealNo
	 * @param sysFrom
	 * @return
	 */
	@RequestMapping(value = "/getCANo", method = RequestMethod.GET)
	public JsonResult<LegRegistrationInfoDzht> getCANo(@RequestParam(value = "empNo") String empNo,
			@RequestParam(value = "sealNo") String sealNo, @RequestParam(value = "sysFrom") String sysFrom);

	@RequestMapping(value = "/deleteAndInsert", method = RequestMethod.POST)
	JsonResult<Object> deleteAndInsert(@RequestBody LegRegistrationInfoDzht entity);

	@RequestMapping(value = "/batchDeleteAndInsert", method = RequestMethod.POST)
	public JsonResult<Object> batchDeleteAndInsert(@RequestBody List<LegRegistrationInfoDzht> list);

	@RequestMapping(value = "/selectList", method = RequestMethod.POST)
	public JsonResult<List<LegRegistrationInfoDzht>> selectList(
			@RequestBody LegRegistrationInfoDzht legRegistrationInfoDzht);

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public JsonResult<Object> update(@RequestBody LegRegistrationInfoDzht entity);

	@ApiOperation(value = "逻辑删除CA信息", notes = "逻辑删除CA信息")
	@RequestMapping(value = "/llDelete", method = RequestMethod.POST)
	public JsonResult<Object> llDelete(@RequestBody List<String> sealNoList);

//	@ApiOperation(value = "企业CA注册接口插入与删除", notes = "企业CA注册接口插入与删除")
//	@RequestMapping(value = "/registerCompanyInsertAndDelete", method = RequestMethod.POST)
//	public JsonResult<Object> registerCompanyInsertAndDelete(@RequestBody List<LegRegistrationInfoDzht> list);
}
