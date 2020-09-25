package com.haier.hop.ms.legcontract.resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.dto.LegEmpCategory;

import io.swagger.annotations.ApiOperation;

public interface LegEmpCategoryResource {

	@ApiOperation(value = "获取族群id", notes = "获取族群id")
	@RequestMapping(value = "/selectZuQun", method = RequestMethod.POST)
	public JsonResult<String> selectZuQun(@RequestBody LegEmpCategory legEmpCategory);

	@ApiOperation(value = "根据族群id获取族群名称", notes = "根据族群id获取族群名称")
	@RequestMapping(value = "/selectCategoryNameById", method = RequestMethod.POST)
	public JsonResult<String> selectCategoryNameById(@RequestParam(value = "categoryId") String categoryId);
}
