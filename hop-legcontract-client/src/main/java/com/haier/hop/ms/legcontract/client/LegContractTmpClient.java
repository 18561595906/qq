package com.haier.hop.ms.legcontract.client;

import com.haier.hop.ms.legcontract.resource.LegContractTmpResource;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "legcommon-v4", path = "/legContract")
public interface LegContractTmpClient extends LegContractTmpResource {
}
