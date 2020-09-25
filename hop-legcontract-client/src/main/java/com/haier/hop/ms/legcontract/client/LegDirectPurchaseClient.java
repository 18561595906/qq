package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;
import com.haier.hop.ms.legcontract.resource.LegDirectPurchaseResource;

@FeignClient(value = "legcontract-v4", path = "/legDirectPurchase")
public interface LegDirectPurchaseClient extends LegDirectPurchaseResource {

}
