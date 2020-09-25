package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegContractReturnResource;

@FeignClient(value = "legcontract-v4", path = "/legContractReturn")
public interface LegContractReturnClient extends LegContractReturnResource {

}
