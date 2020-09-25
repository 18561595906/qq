package com.haier.hop.ms.legcontract.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegEmailTemplate;

public interface LegEmailTemplateResource {

	@RequestMapping(value = "getEmailTemplateByCode", method = RequestMethod.GET)
	public JsonResult<LegEmailTemplate> getEmailTemplateByCode(
			@RequestParam(value = "code", required = true) String code);

}
