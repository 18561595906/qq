package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegDraftResource;

@FeignClient(value = "legcommon-v4", path = "/legProcDraft")
public interface DraftClient extends LegDraftResource {

}
