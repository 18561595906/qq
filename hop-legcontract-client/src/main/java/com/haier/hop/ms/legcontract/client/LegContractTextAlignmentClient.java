package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegContractTextAlignmentResource;

@FeignClient(value = "legcontract-v4", path = "/legContractTextAlignment")
public interface LegContractTextAlignmentClient extends LegContractTextAlignmentResource {

}
