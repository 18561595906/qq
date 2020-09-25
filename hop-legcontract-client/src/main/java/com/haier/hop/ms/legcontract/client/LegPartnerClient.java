package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegPartnerResource;

@FeignClient(value = "legcompany-v4", path = "/partner")
public interface LegPartnerClient extends LegPartnerResource {

}
