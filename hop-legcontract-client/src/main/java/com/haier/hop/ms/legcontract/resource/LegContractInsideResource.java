package com.haier.hop.ms.legcontract.resource;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegContractAuthUser;

public interface LegContractInsideResource {

	@RequestMapping(value = "getAuthUserList", method = RequestMethod.GET)
	JsonResult<List<LegContractAuthUser>> getAuthUserList(@RequestParam(value = "userStr") String userStr);
}
