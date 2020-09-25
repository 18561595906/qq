package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegLawProfResource;

@FeignClient(value = "legLawProf-v4", path = "/legLawProf")
public interface LegLawProfClient extends LegLawProfResource {

}
