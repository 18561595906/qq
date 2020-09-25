package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegContractNodeResource;

@FeignClient(value = "legcommon-v4", path = "/legContractNode")
public interface LegContractNodeClient extends LegContractNodeResource {

}
