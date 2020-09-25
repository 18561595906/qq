package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.FileCreateResource;


@FeignClient(value = "legfile-v4", path = "/fileCreate")
public interface FileCreateClient extends FileCreateResource {

}
