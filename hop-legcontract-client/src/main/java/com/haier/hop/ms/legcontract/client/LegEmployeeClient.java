package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegEmployeeResource;

@FeignClient(value = "legcommon-v4", path = "/legEmployee")
public interface LegEmployeeClient extends LegEmployeeResource {

}
