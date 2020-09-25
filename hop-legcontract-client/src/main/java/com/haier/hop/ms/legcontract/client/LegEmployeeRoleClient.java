package com.haier.hop.ms.legcontract.client;

import com.haier.hop.ms.legcontract.resource.LegEmployeeRoleResource;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "legcommon-v4", path = "/employeeRole")
public interface LegEmployeeRoleClient extends LegEmployeeRoleResource {
}
