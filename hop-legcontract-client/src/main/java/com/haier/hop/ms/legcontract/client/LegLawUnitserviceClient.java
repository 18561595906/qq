package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegLawUnitserviceResource;

@FeignClient(value = "legcommon-v4", path = "/legLawUnitservice")
public interface LegLawUnitserviceClient extends LegLawUnitserviceResource {

}
