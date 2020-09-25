package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegContractInsideResource;

@FeignClient(value = "legactiviti-v4", path = "/legCompanyAuthInside")
public interface LegContractInsideClient extends LegContractInsideResource {

}
