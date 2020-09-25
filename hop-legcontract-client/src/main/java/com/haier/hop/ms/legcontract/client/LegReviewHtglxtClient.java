package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegReviewHtglxtResource;

/**
 * 工作流微服务
 * 
 * @author wangdh
 * @version haier 1.0
 * @since haier 1.0 2019/07/30
 * @see 16:28:07
 */
@FeignClient(value = "legactiviti-v4", path = "/legReviewHtglxt")
public interface LegReviewHtglxtClient extends LegReviewHtglxtResource {

}
