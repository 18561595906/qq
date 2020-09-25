package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.FileResource;

@FeignClient(value = "legfile-v4", path = "/fileManager")
public interface FileClient extends FileResource {

}
