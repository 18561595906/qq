package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegCompanyResource;

@FeignClient(value = "legcompany-v4", path = "/company")
public interface LegCompanyClient extends LegCompanyResource {

}
