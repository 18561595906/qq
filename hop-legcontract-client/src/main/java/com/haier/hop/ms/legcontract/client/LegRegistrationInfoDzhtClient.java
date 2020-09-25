package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegRegistrationInfoDzhtResource;

/**
 * 电子ca信息
 * 
 * @author shiyingxin
 * @version haier 1.0
 * @since haier 1.0 2019/10/11
 * @see 16:28:07
 */
@FeignClient(value = "legcontract-v4", path = "/electronicSealCommon")
public interface LegRegistrationInfoDzhtClient extends LegRegistrationInfoDzhtResource {

}
