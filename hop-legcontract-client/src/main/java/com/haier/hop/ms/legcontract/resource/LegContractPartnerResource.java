package com.haier.hop.ms.legcontract.resource;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegContractPartner;
import com.haier.hop.ms.legcontract.domain.LegContractTmp;

public interface LegContractPartnerResource {

	@RequestMapping(value = "getContractPartner", method = RequestMethod.GET)
	public List<LegContractPartner> getContractPartner(@RequestBody LegContractPartner legContractPartner);

	@RequestMapping(value = "getContractPartnerByCode", method = RequestMethod.GET)
	public JsonResult<List<LegContractPartner>> getContractPartnerByCode(
			@RequestParam(value = "partners") String partners);

	@RequestMapping(value = "getContractTmpByCode", method = RequestMethod.GET)
	public JsonResult<List<LegContractTmp>> getContractTmpByCode(@RequestParam(value = "partners") String partners);
	
	@RequestMapping(value = "isPartnerPass", method = RequestMethod.GET)
	public JsonResult<Boolean> isPartnerPass(@RequestParam("contNo") String contNo);
}
