package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.ElectronicContractResource;

//@FeignClient(value = "legElectronicContract-v4", path = "/electronicContract", url = "localhost:8891")
@FeignClient(value = "legElectronicContract-v4", path = "/electronicContract")
public interface ElectronicContractClient extends ElectronicContractResource {

}
