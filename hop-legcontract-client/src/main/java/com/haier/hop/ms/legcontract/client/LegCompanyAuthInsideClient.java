package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegCompanyAuthInsideResource;

@FeignClient(value = "legcompany-v4", path = "legCompanyAuthInside")
public interface LegCompanyAuthInsideClient extends LegCompanyAuthInsideResource {

}
