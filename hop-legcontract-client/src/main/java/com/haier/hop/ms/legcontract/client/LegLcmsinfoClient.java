package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegLcmsinfoResource;

@FeignClient(value = "legcontract-v4", path = "/legLcmsinfo")
public interface LegLcmsinfoClient extends LegLcmsinfoResource {

}
