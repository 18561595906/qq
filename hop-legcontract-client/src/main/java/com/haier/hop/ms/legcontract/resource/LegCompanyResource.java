package com.haier.hop.ms.legcontract.resource;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegCompany;
import io.swagger.annotations.ApiOperation;

public interface LegCompanyResource {

	/**
	 * @Description: 根据签约方code获取不重复的业务单元
	 * @author: liugan
	 * @date:   2019-12-04
	 * @param: 
	 * @return  根据签约方code获取不重复的业务单元
	 */
	@ApiOperation(value = "根据签约方code获取不重复的业务单元", notes = "根据签约方code获取不重复的业务单元")
	@RequestMapping(value = "/getLeCompanyByCodes", method = RequestMethod.POST)
	public JsonResult<List<LegCompany>> getLeCompanyByCodes (@RequestBody List<String> compCodeList);

}
