package com.haier.hop.ms.legcontract.resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegReviewHtglxt;

public interface LegReviewHtglxtResource {

	@RequestMapping(value = "/getList", method = RequestMethod.POST)
	public JsonResult<Object> getList(@RequestParam(value = "procId") String procId);
	
	/**
	 *	直接采购合同流程轨迹检索
	 * 
	 * @author liugan
	 * @param reviewInfo
	 * @return
	 */
	@RequestMapping(value = "/getListByEnt", method = RequestMethod.POST)
	public JsonResult<Object> getListByEnt(@RequestBody LegReviewHtglxt ent);
	
	/**
	 * 保存审批流程信息
	 * 
	 * @author liugan
	 * @param reviewInfo
	 * @return
	 */
	@RequestMapping(value = "/saveLegReviewHtglxt", method = RequestMethod.POST)
	public JsonResult<Object> saveLegReviewHtglxt(@RequestBody LegReviewHtglxt reviewInfo);

	/**
	 * 流程轨迹更新流程号
	 * 
	 * @author liugan
	 * @param procId
	 * @return
	 */
	@RequestMapping(value = "/updateProcId", method = RequestMethod.POST)
	public boolean updateProcId(@RequestParam(value = "procId") String procId, @RequestParam(value = "newProcId") String newProcId);
}
