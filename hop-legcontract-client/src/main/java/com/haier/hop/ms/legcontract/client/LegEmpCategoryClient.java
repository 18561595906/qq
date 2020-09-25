package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegEmpCategoryResource;

@FeignClient(value = "legcommon-v4", path = "/legEmpCategory")
public interface LegEmpCategoryClient extends LegEmpCategoryResource {

}
