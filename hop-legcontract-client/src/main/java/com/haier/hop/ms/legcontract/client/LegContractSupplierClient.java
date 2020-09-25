package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegContractSupplierResource;

@FeignClient(value = "legcontract-v4", path = "/legContractSupplier")
public interface LegContractSupplierClient extends LegContractSupplierResource {

}
