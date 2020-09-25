package com.haier.hop.ms.legcontract.resource;

import java.math.BigDecimal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegContractMoneyAmount;
import io.swagger.annotations.ApiOperation;

public interface LegContractMoneyAmountResource {

	/**
	 * @Description: 内部合同占用金额检索
	 * @author: liugan
	 * @date:   2020-1-16
	 * @param:  companyCode 公司编码
	 * @param:  contractTypeId 合同类型
	 * @return 
	 */	
	@ApiOperation(value = "内部合同-占用金额检索", notes = "内部合同占用金额检索")
	@RequestMapping(value = "/getMoneyAmount", method = RequestMethod.POST)
	public JsonResult<LegContractMoneyAmount> getMoneyAmount(@RequestParam(value = "companyCode") String companyCode, @RequestParam(value = "contractTypeId") Integer contractTypeId);

	/**
	 * @Description: 内部合同占用金额更新（A类、F类）
	 * @author: liugan
	 * @date:   2020-1-16
	 * @param:  companyCode 公司编码
	 * @param:  contractTypeId 合同类型
	 * @return 
	 */	
	@ApiOperation(value = "内部合同-占用金额更新（A类、F类）", notes = "内部合同占用金额更新（A类、F类）")
	@RequestMapping(value = "/updateMoneyAmount", method = RequestMethod.POST)
	public JsonResult<Object> updateMoneyAmount(@RequestParam(value = "companyCode") String companyCode, @RequestParam(value = "contractTypeId") Integer contractTypeId, @RequestParam(value = "newContractAmout") BigDecimal newContractAmout);
	
	/**
	 * @Description: 内部合同占用金额更新（B类）
	 * @author: liugan
	 * @date:   2020-1-16
	 * @param:  contractIndustryId 产业编码
	 * @param:  contractTypeId 合同类型
	 * @return 
	 */	
	@ApiOperation(value = "内部合同-占用金额更新（B类）", notes = "内部合同占用金额更新（B类）")
	@RequestMapping(value = "/updateAmountForB", method = RequestMethod.POST)
	public JsonResult<Object> updateAmountForB(@RequestParam(value = "contractIndustryId")  Integer contractIndustryId, @RequestParam(value = "contractTypeId")  Integer contractTypeId, @RequestParam(value = "newContractAmout")  BigDecimal newContractAmout);

}
