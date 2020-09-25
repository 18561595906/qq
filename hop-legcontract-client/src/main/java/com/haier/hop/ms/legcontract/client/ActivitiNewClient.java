package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.ActivitiNewResource;

/**
 *	工作流微服务
 * @author ltd
 *
 */
//@FeignClient(value = "legactiviti-v4", url = "localhost:8890", path = "/activitiNew")
@FeignClient(value = "legactiviti-v4", path = "/activitiNew")
public interface ActivitiNewClient extends ActivitiNewResource {

}
