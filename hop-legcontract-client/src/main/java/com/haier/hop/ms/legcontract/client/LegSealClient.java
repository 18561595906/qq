package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegSealResource;

/**
 * 工作流微服务
 * 
 * @author xuejinxin
 * @version haier 1.0
 * @since haier 1.0 2019/06/17
 * @see 16:28:07
 */
@FeignClient(value = "legseal-v4", path = "/legSeal")
public interface LegSealClient extends LegSealResource {

}
