package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegContractPartnerResource;

//@FeignClient(value = "legcontract-v4", path = "/legContractPartner", url = "localhost:8894")
@FeignClient(value = "legcontract-v4", path = "/legContractPartner")
public interface LegContractPartnerClient extends LegContractPartnerResource {

}
