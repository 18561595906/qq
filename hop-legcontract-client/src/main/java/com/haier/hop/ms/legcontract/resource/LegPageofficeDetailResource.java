package com.haier.hop.ms.legcontract.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegPageofficeDetail;

import io.swagger.annotations.ApiOperation;

public interface LegPageofficeDetailResource {

	@ApiOperation(value = "根据条件获取pageOfficeDetail信息", notes = "根据条件获取pageOfficeDetail信息")
	@PostMapping(value = "getPageDetailList")
	public List<LegPageofficeDetail> getPageDetailList(@RequestBody LegPageofficeDetail pageDetail);

	@ApiOperation(value = "查询pageOfficeDetail信息", notes = "查询pageOfficeDetail信息")
	@PostMapping(value = "selectList")
	public List<LegPageofficeDetail> selectList(@RequestBody LegPageofficeDetail pageDetail);

	@ApiOperation(value = "保存信息", notes = "保存信息")
	@PostMapping(value = "insert")
	public JsonResult<Object> insert(@RequestBody LegPageofficeDetail pageDetail);

	@ApiOperation(value = "删除信息", notes = "删除信息")
	@PostMapping(value = "delete")
	public JsonResult<Object> delete(@RequestBody LegPageofficeDetail pageDetail);

	@ApiOperation(value = "更新信息", notes = "更新信息")
	@PostMapping(value = "update")
	public JsonResult<Object> update(@RequestBody LegPageofficeDetail pageDetail);

	@ApiOperation(value = "获取快速通道字段信息", notes = "获取快速通道字段信息")
	@GetMapping(value = "getPageFast")
	public LegPageofficeDetail getPageFast(@RequestParam(value = "attId") String attId, @RequestParam(value = "coId") String coId);

	@ApiOperation(value = "删除信息", notes = "删除信息")
	@RequestMapping(value = "deleteAllForContractId", method = RequestMethod.GET)
	public JsonResult<Object> deleteAllForContractId(@RequestParam(value = "contractId") String contractId);

}
