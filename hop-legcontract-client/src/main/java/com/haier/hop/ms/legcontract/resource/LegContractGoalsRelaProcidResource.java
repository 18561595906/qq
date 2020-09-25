package com.haier.hop.ms.legcontract.resource;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.haier.hop.ms.legcontract.domain.LegContractGoalsRelaProcid;

import io.swagger.annotations.ApiOperation;

public interface LegContractGoalsRelaProcidResource {

	
	@ApiOperation(value = "获取合同里程牌信息", notes = "获取合同里程牌信息")
	@PostMapping(value = "getContractGoals")
	public List<LegContractGoalsRelaProcid> getContractGoals(@RequestBody LegContractGoalsRelaProcid legContractGoals);
}
