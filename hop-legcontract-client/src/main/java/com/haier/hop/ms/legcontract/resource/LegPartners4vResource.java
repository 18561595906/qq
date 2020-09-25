package com.haier.hop.ms.legcontract.resource;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.haier.hop.ms.legcontract.domain.LegPartners4v;

public interface LegPartners4vResource {

	
	@PostMapping(value = "/getContPartners4v")
	public List<LegPartners4v> getContPartners4v(@RequestBody LegPartners4v legPartners4v);
	

}
