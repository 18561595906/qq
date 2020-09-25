package com.haier.hop.ms.legcontract.resource;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegJobLog;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface LegJobLogResource {

	@RequestMapping(value = "saveLogList", method = RequestMethod.POST)
	public JsonResult<String> saveLogList(@RequestBody List<LegJobLog> legJobLogs);
}
