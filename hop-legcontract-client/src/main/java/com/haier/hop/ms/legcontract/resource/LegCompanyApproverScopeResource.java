package com.haier.hop.ms.legcontract.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.constant.IConstInfo;
import com.haier.hop.ms.legcontract.domain.LegCompanyApproverScope;
import com.haier.hop.ms.page.PageBean;

import io.swagger.annotations.ApiOperation;

public interface LegCompanyApproverScopeResource {

	/**
	 * @Description: 获取公议节点选择审批人
	 * @author: liugan
	 * @date:   2019-12-03
	 * @param nodeId
	 * @param empSn
	 * @param empName
	 * @param currentPage
	 * @param pageSize
	 * @return  公议节点选择审批人
	 */	
	@ApiOperation(value = "分页查询", notes = "分页查询")
	@RequestMapping(value = "/pageList", method = RequestMethod.GET)
	public JsonResult<PageBean<LegCompanyApproverScope>> getPageList(@RequestParam(value = "nodeId") String nodeId,
			@RequestParam(value = "empSn", required = false) String empSn,
			@RequestParam(value = "empName", required = false) String empName,
			@RequestParam(value = "currentPage", required = false, defaultValue = IConstInfo.DEFAULT_CURRENT_PAGE) Integer currentPage,
			@RequestParam(value = "pageSize", required = false, defaultValue = IConstInfo.DEFAULT_PAGESIZE) Integer pageSize);

}
