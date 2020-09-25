package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;
import com.haier.hop.ms.legcontract.resource.LegCompanyApproverScopeResource;

@FeignClient(value = "legcompany-v4", path = "/legcomapproverscope")
public interface LegCompanyApproverScopeClient extends LegCompanyApproverScopeResource {

}
