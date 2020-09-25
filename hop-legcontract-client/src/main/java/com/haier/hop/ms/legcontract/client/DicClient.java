package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.DicResource;

@FeignClient(value = "legcommon-v4", path = "/dic")
public interface DicClient extends DicResource {

}
