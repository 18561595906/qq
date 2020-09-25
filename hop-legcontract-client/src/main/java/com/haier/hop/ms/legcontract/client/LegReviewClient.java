package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegReviewResource;

/**
 * 工作流微服务
 * 
 * @author xuejinxin
 * @version haier 1.0
 * @since haier 1.0 2019/06/17
 * @see 16:28:07
 */
@FeignClient(value = "legactiviti-v4", path = "/legReview")
//@FeignClient(value = "legactiviti-v4", path = "/legReview", url = "localhost:8890")
public interface LegReviewClient extends LegReviewResource {

}
