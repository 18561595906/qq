package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;
import com.haier.hop.ms.legcontract.resource.LegContractMoneyAmountResource;

/**
 * 内部合同占用金额使用
 * 
 * @author liugan
 * @version haier 1.0
 * @since haier 1.0 2020/01/17
 * @see 16:28:07
 */
@FeignClient(value = "legcontractold-v4", path = "/legcontractold")
public interface LegContractMoneyAmountClient extends LegContractMoneyAmountResource {

}
