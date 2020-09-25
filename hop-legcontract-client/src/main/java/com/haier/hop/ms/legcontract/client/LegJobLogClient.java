package com.haier.hop.ms.legcontract.client;

import com.haier.hop.ms.legcontract.resource.LegJobLogResource;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "legcommon-v4", path = "/legJobLog")
public interface LegJobLogClient extends LegJobLogResource {

}
