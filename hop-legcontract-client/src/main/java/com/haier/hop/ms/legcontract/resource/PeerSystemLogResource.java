package com.haier.hop.ms.legcontract.resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegPeerSystemLog;

import io.swagger.annotations.ApiOperation;

public interface PeerSystemLogResource {

	/**
	 * 保存报文日志到数据库
	 * 
	 * @author wangdh
	 * @param attaInfo
	 * @return
	 */
	@ApiOperation(value = "保存报文日志到数据库", notes = "保存报文日志到数据库")
	@PostMapping(value = "savePeerSystemLog")
	public JsonResult<Object> savePeerSystemLog(@RequestBody LegPeerSystemLog legPeerSystemLog);


}