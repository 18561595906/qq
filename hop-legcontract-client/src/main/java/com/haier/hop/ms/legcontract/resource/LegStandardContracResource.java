package com.haier.hop.ms.legcontract.resource;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegStandardContract;
import com.haier.hop.ms.legcontract.domain.LegStandardPublicContract;

import io.swagger.annotations.ApiOperation;

public interface LegStandardContracResource {

	@ApiOperation(value = "根据id获取范本名称", notes = "根据id获取范本名称")
	@RequestMapping(value = "/selectContractNameById", method = RequestMethod.GET)
	public JsonResult<String> selectContractNameById(@RequestParam("rowId") String rowId);

	@ApiOperation(value = "查询范本", notes = "查询范本")
	@RequestMapping(value = "/selectList", method = RequestMethod.POST)
	public JsonResult<List<LegStandardContract>> selectList(@RequestBody LegStandardContract entity);

	@ApiOperation(value = "保存范本", notes = "保存范本")
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	JsonResult<String> insert(@RequestBody LegStandardContract entity);

	@ApiOperation(value = "删除范本", notes = "删除范本")
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	JsonResult<Object> delete(@RequestParam(value = "rowId") String rowId);

	@ApiOperation(value = "保存公用合同关系表", notes = "保存公用合同关系表")
	@RequestMapping(value = "/insertPublic", method = RequestMethod.POST)
	JsonResult<Object> insertPublic(LegStandardPublicContract entity);

	@ApiOperation(value = "删除公用合同关系表", notes = "删除公用合同关系表")
	@RequestMapping(value = "/deletePublicByContId", method = RequestMethod.POST)
	JsonResult<Object> deletePublicByContId(String contId);

	@ApiOperation(value = "更新范本", notes = "更新范本")
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	JsonResult<String> update(LegStandardContract entity);

}
