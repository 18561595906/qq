package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.PeerSystemLogResource;

@FeignClient(value = "legcommon-v4", path = "/legPeerSystemLog")
public interface PeerSystemLogClient extends PeerSystemLogResource {

}
