package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegInterfaceResource;

@FeignClient(value = "legcommon-v4", path = "/legInterfaceRecord")
public interface LegInterfaceClient extends LegInterfaceResource {

}
