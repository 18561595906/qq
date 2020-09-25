package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegContractExpireNoRemindResource;

@FeignClient(value = "legcontract-v4", path = "/legContractExpireNoRemind")
public interface LegContractExpireNoRemindClient extends LegContractExpireNoRemindResource {

}
