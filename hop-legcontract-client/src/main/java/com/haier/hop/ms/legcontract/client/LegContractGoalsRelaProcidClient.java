package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegContractGoalsRelaProcidResource;

//@FeignClient(value = "legcontract-v4", path = "/legContractGoalsRelaProcid")
@FeignClient(value = "legcont-v4", path = "/contractGoals")
public interface LegContractGoalsRelaProcidClient extends LegContractGoalsRelaProcidResource {

}
