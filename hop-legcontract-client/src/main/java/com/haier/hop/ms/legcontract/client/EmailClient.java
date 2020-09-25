package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.EmailResource;

@FeignClient(value = "legcommon-v4", path = "/email")
public interface EmailClient extends EmailResource {

}
