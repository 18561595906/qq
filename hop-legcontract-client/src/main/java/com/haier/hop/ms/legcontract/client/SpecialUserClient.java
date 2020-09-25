package com.haier.hop.ms.legcontract.client;

import com.haier.hop.ms.legcontract.resource.SpecialUserResource;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "legseal-v4", path = "/legSpecialUser")
public interface SpecialUserClient extends SpecialUserResource {

}
