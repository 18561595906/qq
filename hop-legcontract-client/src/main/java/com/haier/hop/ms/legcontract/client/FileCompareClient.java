package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.FileCompareResource;

@FeignClient(value = "filecompare-v4", path = "/internal/compare")
public interface FileCompareClient extends FileCompareResource {
}
