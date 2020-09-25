package com.haier.hop.ms.legcontract.resource;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegContractTmp;
import com.haier.hop.ms.legcontract.dto.LegContractDto;

import io.swagger.annotations.ApiOperation;

public interface LegContractResource {

	@RequestMapping(value = "/qiangDan", method = RequestMethod.POST)
	public List<LegContractDto> qiangDan(@RequestParam("procId") String procId);

	@RequestMapping(value = "/waitWork", method = RequestMethod.POST)
	public List<LegContractDto> waitWork(@RequestParam("procId") String procId);

	@ApiOperation(value = "获取合同基本信息", notes = "获取合同基本信息")
	@PostMapping(value = "getContractTmp")
	public List<LegContractTmp> getContractTmp(@RequestBody LegContractTmp legContractTmp);

	@PostMapping(value = "update")
	public boolean update(@RequestBody LegContractTmp legContractTmp);

	@ApiOperation(value = "pageoffice下载文件时更新文件对比attList", notes = "pageoffice下载文件时更新文件对比attList")
	@RequestMapping(value = "/updateAttListCompare", method = RequestMethod.POST)
	public JsonResult<Object> updateAttListCompare(@RequestParam(value = "contractId") String contractId, @RequestParam(value = "fileUrl") String fileUrl);

	@RequestMapping(value = "/updateSignDate", method = RequestMethod.GET)
	public JsonResult<Object> updateSignDate(@RequestParam("rowId") String rowId);

	@RequestMapping(value = "/callBccToContractInfoClient", method = RequestMethod.POST)
	public void callBccToContractInfoClient(@RequestParam(value = "procId") String procId);

}
