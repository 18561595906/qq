package com.haier.hop.ms.legcontract.resource;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegEmployeeRole;
import com.haier.hop.ms.legcontract.domain.LegRoleName;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface LegEmployeeRoleResource {
    @RequestMapping(value = "/getLegEmpRoleList", method = RequestMethod.GET)
    public JsonResult<LegRoleName> getLegEmpRoleList(@RequestParam("empSn") String empSn);

    @RequestMapping(value = "/getEmpRoleList", method = RequestMethod.GET)
    public JsonResult<List<LegEmployeeRole>> getEmpRoleList(@RequestParam("empSn") String empSn);

    @RequestMapping(value = "/getRoleByName", method = RequestMethod.GET)
    public JsonResult<LegRoleName> getRoleByName(@RequestParam("roleName") String roleName);

    @RequestMapping(value = "/setLegEmpRoleList", method = RequestMethod.POST)
    public JsonResult<Object> setLegEmpRoleList(@RequestParam("empSn") String empSn, @RequestParam("empName") String empName,
                                                @RequestBody List<LegRoleName> roleNames);
}
