package com.haier.hop.ms.legcontract.resource;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.legcontract.domain.LegAttachmentCheck;

import io.swagger.annotations.ApiOperation;

public interface LegAttachmentCheckResource {

	@ApiOperation(value = "保存pageoffice校验信息", notes = "保存pageoffice校验信息")
	@PutMapping(value = "insert")
	public Boolean insert(@RequestBody LegAttachmentCheck attaCheck);

	@ApiOperation(value = "删除pageoffice校验信息", notes = "删除pageoffice校验信息")
	@DeleteMapping(value = "delete")
	public Boolean delete(@RequestBody LegAttachmentCheck attaCheck);

	@ApiOperation(value = "查询pageoffice校验信息", notes = "查询pageoffice校验信息")
	@DeleteMapping(value = "select")
	public List<LegAttachmentCheck> select(@RequestParam(value = "contractId") String contractId);

}
