package com.haier.hop.ms.legcontract.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.legcontract.domain.LegContractTagpage;

import io.swagger.annotations.ApiOperation;

public interface LegContractTagpageResource {


	@ApiOperation(value = "合同pageoffice下拉信息", notes = "合同pageoffice下拉信息")
	@GetMapping(value = "getTagPageByCondition")
	public List<LegContractTagpage> getTagPageByCondition(@RequestParam(value = "name") String name,
			@RequestParam(value = "procId") String procId,@RequestParam(value = "modelId") String modelId);
}
