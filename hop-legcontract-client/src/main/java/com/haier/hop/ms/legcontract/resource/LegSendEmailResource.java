package com.haier.hop.ms.legcontract.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;

import io.swagger.annotations.ApiOperation;

public interface LegSendEmailResource {

	@ApiOperation(value = "公议人全部通过给平台长邮件", notes = "公议人全部通过给平台长邮件")
	@RequestMapping(value = "/gyToPtzMail", method = RequestMethod.GET)
	public void gyToPtzMail(@RequestParam String applierId, @RequestParam String contractInsideType,
			@RequestParam String assigneeId, @RequestParam String contractName, @RequestParam String projectName);

	@ApiOperation(value = "删除/撤回流程给申报人和公议人发邮件", notes = "删除/撤回流程给申报人和公议人发邮件")
	@RequestMapping(value = "/delToApplierAndAssigneeMail", method = RequestMethod.GET)
	public void delToApplierAndAssigneeMail(@RequestParam String applierId, @RequestParam String procId,
			@RequestParam String contractName, @RequestParam String reson);

	@ApiOperation(value = "律师抢单时给申报人发送邮件", notes = "律师抢单时给申报人发送邮件")
	@RequestMapping(value = "/qiangdanMail", method = RequestMethod.GET)
	public void qiangdanMail(@RequestParam String applierId, @RequestParam String lawyerName);

//	@ApiOperation(value = "24小时公议退回给申报人和公议人发邮件", notes = "24小时公议退回给申报人和公议人发邮件")
//	@RequestMapping(value = "/to24ApplierAndAssigneeMail", method = RequestMethod.GET)
//	public void to24ApplierAndAssigneeMail(@RequestParam String applierId, @RequestParam String procId,
//			@RequestParam String contractName);

	@ApiOperation(value = "转发/授权给申报人和被授权/转发人邮件", notes = "转发/授权给申报人和被授权/转发人邮件")
	@RequestMapping(value = "/zfToApplierAndAssigneeMail", method = RequestMethod.GET)
	public void zfToApplierAndAssigneeMail(@RequestParam String procId, @RequestParam String assigneeId,
			@RequestParam String newAssigneeId, @RequestParam String taskName);
	
	@RequestMapping(value = "/sendhphzDebtEmail", method = RequestMethod.POST)
	public JsonResult<Object> sendhphzDebtEmail(@RequestParam String comanyCode, @RequestParam String companyName, 
			@RequestParam String date, @RequestParam String amount, @RequestParam String signUrl);
	
	@RequestMapping(value = "/sendhphzDebtEmailAgain", method = RequestMethod.GET)
	public JsonResult<Object> sendhphzDebtEmailAgain();

}
