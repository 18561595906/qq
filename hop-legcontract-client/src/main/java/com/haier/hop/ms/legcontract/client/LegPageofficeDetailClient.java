package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegPageofficeDetailResource;

@FeignClient(value = "legcommon-v4", path = "/pageDetail")
public interface LegPageofficeDetailClient extends LegPageofficeDetailResource {

}
