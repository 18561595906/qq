package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegContractResource;

@FeignClient(value = "legcontract-v4", path = "/legContract")
public interface LegContractClient extends LegContractResource {

}
