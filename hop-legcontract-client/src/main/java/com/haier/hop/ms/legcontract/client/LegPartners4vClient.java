package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegPartners4vResource;

@FeignClient(value = "legcompany-v4", path = "/partners4v")
public interface LegPartners4vClient extends LegPartners4vResource {

}
