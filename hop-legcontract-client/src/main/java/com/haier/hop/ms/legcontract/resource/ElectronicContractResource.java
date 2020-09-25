package com.haier.hop.ms.legcontract.resource;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegRegistrationInfoDzht;
import com.haier.hop.ms.legcontract.dto.AutoSeal;
import com.haier.hop.ms.legcontract.dto.LegElectronicContractParamDto;

import io.swagger.annotations.ApiOperation;

public interface ElectronicContractResource {

	@ApiOperation(value = "给法大大上传文件", notes = "给法大大上传文件")
	@RequestMapping(value = "/uploadToFDD", method = RequestMethod.POST)
	public JsonResult<Object> uploadToFDD(@RequestParam(value = "contractId") String contractId,
			@RequestParam(value = "contractNo") String contractNo,
			@RequestParam(value = "attListStr") String attListStr);

	@RequestMapping(value = "/openFddDzqz", method = RequestMethod.POST)
	public JsonResult<Object> openFddDzqz(@RequestBody LegElectronicContractParamDto dto);

	@ApiOperation(value = "企业CA注册接口", notes = "企业CA注册接口")
	@RequestMapping(value = "/registerCompanyCA", method = RequestMethod.POST)
	public JsonResult<Object> registerCompanyCA(@RequestBody LegRegistrationInfoDzht entity);

	@ApiOperation(value = "个人CA注册接口", notes = "个人CA注册接口")
	@RequestMapping(value = "/registerPersonCA", method = RequestMethod.POST)
	public JsonResult<Object> registerPersonCA(@RequestBody LegRegistrationInfoDzht entity);

	@ApiOperation(value = "修改CA信息", notes = "修改CA信息")
	@RequestMapping(value = "/editCAInfo", method = RequestMethod.POST)
	public JsonResult<Object> editCAInfo(@RequestBody LegRegistrationInfoDzht entity);

	/**
	 * 电签待办上传法大大文件
	 * 
	 * @param pdfId
	 * @param pdfName
	 * @param contractNo
	 * @param fileStr
	 * @param userId
	 * @param userName
	 * @return
	 * @throws IOException
	 */
	@ApiOperation(value = "电签待办上传法大大文件", notes = "电签待办上传法大大文件")
	@RequestMapping(value = "/dqUploadToFdd", method = RequestMethod.POST)
	JsonResult<Object> dqUploadToFdd(@RequestParam(value = "pdfId") String pdfId,
			@RequestParam(value = "pdfName") String pdfName, @RequestParam(value = "contractNo") String contractNo,
			@RequestParam(value = "fileStr") String fileStr, @RequestParam(value = "userId") String userId,
			@RequestParam(value = "userName") String userName);
	/**
	 * 调用法大大接口实现自动盖章
	 * @param autoSeal
	 * @return
	 */
	@ApiOperation(value = "调用法大大接口实现自动盖章", notes = "调用法大大接口实现自动盖章")
	@RequestMapping(value = "/autoSealToFdd", method = RequestMethod.POST)
	public JsonResult<Object> autoSealToFdd(@RequestBody AutoSeal autoSeal);
}
