package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegCountersignResource;

/**
 * 此处为类说明
 * 
 * @author xuejinxin
 * @version haier 1.0
 * @since haier 1.0 2019/06/26
 * @see 14:31:53
 */
//@FeignClient(value = "legactiviti-v4", path = "/legcountersign", url = "localhost:8890")
@FeignClient(value = "legactiviti-v4", path = "/legcountersign")
public interface LegCountersignClient extends LegCountersignResource {

}
