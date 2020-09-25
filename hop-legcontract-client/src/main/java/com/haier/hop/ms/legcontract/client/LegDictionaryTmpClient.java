package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegDictionaryTmpResource;

@FeignClient(value = "legcommon-v4", path = "/legDictionaryTmp")
public interface LegDictionaryTmpClient extends LegDictionaryTmpResource {

}
