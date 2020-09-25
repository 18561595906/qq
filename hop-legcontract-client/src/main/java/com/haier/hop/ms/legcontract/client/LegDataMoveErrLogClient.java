package com.haier.hop.ms.legcontract.client;

import org.springframework.cloud.openfeign.FeignClient;

import com.haier.hop.ms.legcontract.resource.LegDataMoveErrLogResource;

/**
 * 数据迁移错误信息
 * 
 * @author shiyingxin
 *
 */
@FeignClient(value = "legcontract-v4", path = "/legDataMoveErrLog")
public interface LegDataMoveErrLogClient extends LegDataMoveErrLogResource {
}
