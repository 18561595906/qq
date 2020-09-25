package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegEmailTemplateResource;

@FeignClient(value = "legcommon-v4", path = "/legEmailTemplate")
public interface LegEmailTemplateClient extends LegEmailTemplateResource {

}
