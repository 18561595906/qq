package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegContractGoalsAlmResource;

/**
 * Alm里程牌
 * 
 * @author wangdh
 * @version haier 1.0
 * @since haier 1.0 2019/07/30
 * @see 16:28:07
 */
//@FeignClient(value = "legcontract-v4", path = "/legGoalsAlm")
@FeignClient(value = "legcont-v4", path = "/legGoalsAlm")
public interface LegContractGoalsAlmClient extends LegContractGoalsAlmResource {

}
