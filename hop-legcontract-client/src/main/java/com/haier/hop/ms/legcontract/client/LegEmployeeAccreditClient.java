package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegEmployeeAccreditResource;

//@FeignClient(value = "legcommon-v4", path = "/legEmployeeAccredit", url = "localhost:8895")
@FeignClient(value = "legcommon-v4", path = "/legEmployeeAccredit")
public interface LegEmployeeAccreditClient extends LegEmployeeAccreditResource {

}
