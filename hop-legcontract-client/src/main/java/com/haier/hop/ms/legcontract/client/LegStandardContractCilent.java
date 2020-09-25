package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegStandardContracResource;

@FeignClient(value = "legcontract-v4", path = "/legStandardContract")
public interface LegStandardContractCilent extends LegStandardContracResource {

}
