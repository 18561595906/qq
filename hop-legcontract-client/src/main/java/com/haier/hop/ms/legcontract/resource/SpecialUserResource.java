package com.haier.hop.ms.legcontract.resource;

import com.haier.hop.ms.common.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface SpecialUserResource {
    @RequestMapping(value = "/checkSpecialUser", method = RequestMethod.GET)
    JsonResult<Boolean> checkSpecialUser(@RequestParam("empSn") String empSn);
}
