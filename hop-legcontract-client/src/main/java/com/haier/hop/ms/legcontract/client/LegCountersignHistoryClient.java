package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegCountersignHistoryResource;

/**
 * 此处为类说明
 * 
 * @author shiyingxin
 * @version haier 1.0
 * @since haier 1.0 2019/06/26
 * @see 14:31:53
 */
@FeignClient(value = "legactiviti-v4", path = "/legCountersignHistory")
//@FeignClient(value = "legactiviti-v4", path = "/legCountersignHistory", url = "localhost:8890")
public interface LegCountersignHistoryClient extends LegCountersignHistoryResource {

}
