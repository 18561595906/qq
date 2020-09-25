package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegAttachmentCheckResource;

@FeignClient(value = "legcommon-v4", path = "/attCheck")
public interface LegAttachmentCheckClient extends LegAttachmentCheckResource {

}
