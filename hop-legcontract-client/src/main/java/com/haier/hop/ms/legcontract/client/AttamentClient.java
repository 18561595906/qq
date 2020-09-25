package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.AttamentResource;

@FeignClient(value = "legcommon-v4", path = "/atta")
public interface AttamentClient extends AttamentResource {

}
