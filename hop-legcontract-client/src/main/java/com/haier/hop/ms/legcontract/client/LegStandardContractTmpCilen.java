package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegStandardContracTmpResource;

@FeignClient(value = "legcontract-v4", path = "/legStandardContractTmp")
public interface LegStandardContractTmpCilen extends LegStandardContracTmpResource {

}
