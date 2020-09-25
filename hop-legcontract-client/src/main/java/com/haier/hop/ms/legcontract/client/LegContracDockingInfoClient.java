package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegContracDockingInfoResource;

@FeignClient(value = "legcontract-v4", path = "/legContracDockingGetData")
public interface LegContracDockingInfoClient extends LegContracDockingInfoResource {

}
