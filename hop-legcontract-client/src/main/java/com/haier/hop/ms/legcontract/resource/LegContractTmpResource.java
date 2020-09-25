package com.haier.hop.ms.legcontract.resource;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegContract;
import com.haier.hop.ms.legcontract.domain.LegContractTmp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface LegContractTmpResource {
    @RequestMapping(value = "/getContractByProId", method = RequestMethod.GET)
    public LegContractTmp getContractByProId(@RequestParam String proId);

    @RequestMapping(value = "/getContract", method = RequestMethod.POST)
    public JsonResult<LegContract> getContract(@RequestParam String proId);
}
