package com.haier.hop.ms.legcontract.resource;

import java.util.Map;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.legcontract.domain.LegContractTmp;

import io.swagger.annotations.ApiOperation;

public interface LegDirectPurchaseResource {

	
	/**
	 * @Description: 直接采购检平台长授权回传
	 * @author: liugan
	 * @date:   2020-7-9
	 * @return: 
	 */
	@RequestMapping(value = "/ptzDoForward", method = RequestMethod.GET)
	public void ptzDoForward(@RequestParam String oldEmpSn, @RequestParam String oldEmpName
			, @RequestParam  String newEmpSn, @RequestParam String newEmpName, @RequestParam String procId);

	/**
	 * @Description: 直接采购定时任务回传用（走归档复核、自动归档）
	 * @author: liugan
	 * @date:   2020-7-15
	 * @return: 
	 */
	@RequestMapping(value = "/taskDoReturn", method = RequestMethod.POST)
	public void taskDoReturn(@RequestBody Map<String, Object> map);
	
	/**
	 * @Description: 直接采购回传附件(归档复核后)
	 * @author: liugan
	 * @date:   2020-7-24
	 * @return: 
	 */
	@RequestMapping(value = "/annexDoReturn", method = RequestMethod.POST)
	public void annexDoReturn(@RequestBody LegContractTmp tmp);
}
