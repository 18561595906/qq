package com.haier.hop.ms.legcontract.resource;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegContractArchives;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface LegContractGuiDangResource {
    @RequestMapping(value = "/insertArvhive", method = RequestMethod.POST)
    public JsonResult insertArvhive(@RequestBody LegContractArchives archives);
}
