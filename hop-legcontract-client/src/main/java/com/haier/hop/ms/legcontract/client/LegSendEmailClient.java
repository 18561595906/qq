package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegSendEmailResource;

@FeignClient(value = "legcontract-v4", path = "/legSendEmail")
public interface LegSendEmailClient extends LegSendEmailResource {

}
