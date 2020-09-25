package com.haier.hop.ms.legcontract.resource;

import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegAttachment;
import com.haier.hop.ms.legcontract.domain.LegContractGeneralFileSeal;
import io.swagger.annotations.ApiOperation;

public interface FileCreateResource {

	@ApiOperation(value = "生成授权函文件", notes = "生成授权函文件")
	@RequestMapping(value = "createShqhFile", method = RequestMethod.POST)
	public JsonResult<List<LegAttachment>> createShqhFile(@RequestBody LegContractGeneralFileSeal contractSeal);

}
