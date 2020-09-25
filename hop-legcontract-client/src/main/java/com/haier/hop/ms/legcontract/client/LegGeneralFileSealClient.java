package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegGeneralFileSealResource;

@FeignClient(value = "legcontract-v4", path = "/legGeneralFileSeal")
public interface LegGeneralFileSealClient extends LegGeneralFileSealResource {

}
