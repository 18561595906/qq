package com.haier.hop.ms.legcontract.resource;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegDictionary;

import io.swagger.annotations.ApiOperation;

public interface DicResource {

	@RequestMapping(value = "/getList", method = RequestMethod.GET)
	public JsonResult<Object> getDemoPageList(@RequestParam(value = "dirStr", required = true) String dirStr);

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public JsonResult<Object> insert(@RequestParam(value = "json", required = true) String json);

	@RequestMapping(value = "/getParentList", method = RequestMethod.POST)
	public JsonResult<String> getParentList(@RequestParam(value = "sonCode", required = true) String sonCode);

	@RequestMapping(value = "/getSonList", method = RequestMethod.POST)
	public JsonResult<String> getSonList(@RequestParam(value = "rootCode", required = true) String rootCode,
			@RequestParam(value = "sonCode", required = true) String sonCode);

	@RequestMapping(value = "/getSingleRecord", method = RequestMethod.POST)
	public JsonResult<LegDictionary> getSingleRecord(@RequestParam(value = "parentCode", required = true) String parentCode,
			@RequestParam(value = "childCode", required = true) String childCode);

	@ApiOperation(value = "根据dicCode获取字典信息List", notes = "根据dicCode获取字典信息List")
	@RequestMapping(value = "/getListByCode", method = RequestMethod.POST)
	JsonResult<List<LegDictionary>> getListByCode(@RequestParam(value = "code", required = true) String code);

	@ApiOperation(value = "根据dicCode获取字典信息", notes = "根据dicCode获取字典信息")
	@RequestMapping(value = "/getByCode", method = RequestMethod.POST)
	JsonResult<LegDictionary> getByCode(@RequestParam(value = "code", required = true) String code);

	@ApiOperation(value = "根据childCode和pid获取字典信息", notes = "根据childCode和pid获取字典信息")
	@RequestMapping(value = "/getByCodeAndPid", method = RequestMethod.POST)
	public JsonResult<Object> getByCodeAndPid(@RequestParam(value = "pid", required = true) String pid,
			@RequestParam(value = "childCode", required = true) String childCode);

	@RequestMapping(value = "/getRecordById", method = RequestMethod.GET)
	public JsonResult<LegDictionary> getRecordById(@RequestParam(value = "rowId", required = true) String rowId);

	@RequestMapping(value = "/getUnilFileDic", method = RequestMethod.GET)
	public JsonResult<Object> getUnilFileDic();

	@RequestMapping(value = "/getBusinUnit", method = RequestMethod.GET)
	public JsonResult<Object> getBusinUnit(@RequestParam(value = "dicCode") String dicCode);

	@RequestMapping(value = "/getBusinUnitCell", method = RequestMethod.GET)
	public JsonResult<Object> getBusinUnitCell(@RequestParam(value = "dicCode") String dicCode);

	@RequestMapping(value = "/findXw", method = RequestMethod.POST)
	public JsonResult<Object> findXw(@RequestParam(value = "businModule") String businModule, @RequestParam(value = "businUnit") String businUnit);

	@ApiOperation(value = "根据父级code获取子列表", notes = "根据父级code获取子列表")
	@RequestMapping(value = "/getChildListByParentCode", method = RequestMethod.GET)
	public JsonResult<List<LegDictionary>> getChildListByParentCode(@RequestParam(value = "dicCode") String dicCode,
			@RequestParam(value = "sysId") String sysId);

	@ApiOperation(value = "获取业务板块名称（公司）", notes = "获取业务板块名称（公司）")
	@RequestMapping(value = "/getCompanyPlate", method = RequestMethod.GET)
	public JsonResult<String> getCompanyPlate(@RequestParam(value = "parentCode", required = true) String parentCode,
			@RequestParam(value = "childCode", required = true) String childCode,
			@RequestParam(value = "symbol", required = true) String symbol);

	@ApiOperation(value = "根据字典code获取字典集合", notes = "根据字典code获取字典集合")
	@RequestMapping(value = "/getRecordByCode", method = RequestMethod.GET)
	public JsonResult<Object> getRecordByCode(@RequestParam(value = "dicCodes", required = false) String dicCodes);

	@RequestMapping(value = "/getNamesByParentRowId", method = RequestMethod.GET)
	public JsonResult<Object> getNamesByParentRowId(
			@RequestParam(value = "parentRowIds", required = false) String parentRowIds,
			@RequestParam(value = "parentIds", required = false) String parentIds,
			@RequestParam(value = "parentCode", required = false) String parentCode);

	@ApiOperation(value = "根据子级code获取层级名称", notes = "根据子级code获取层级名称")
	@RequestMapping(value = "/getNamesByChildCode", method = RequestMethod.GET)
	public JsonResult<Object> getNamesByChildCode(@RequestParam(value = "childCode", required = false) String childCode,
			@RequestParam(value = "symbol", required = false) String symbol);

	@RequestMapping(value = "/findAllByDicValue", method = RequestMethod.POST)
	public JsonResult<List<LegDictionary>> findAllByDicValue(@RequestParam(value = "dicValue") String dicValue);

	@ApiOperation(value = "根据parentId获取子列表（simple）", notes = "根据parentId获取子列表(simple）")
	@RequestMapping(value = "/getSimpleChildListByParentId", method = RequestMethod.GET)
	public JsonResult<List<LegDictionary>> getSimpleChildListByParentId(
			@RequestParam(value = "parentId", required = true) String parentId);

	/**
	 * 根据diccode查询合同类型
	 * 查询交易类型
	 * 
	 * @author liugan
	 * @param LegDictionary (dicCode/dicType)
	 * @return 合同类型/交易类型
	 */
	@ApiOperation(value = "获取合同类型或交易类型", notes = "获取合同类型或交易类型")
	@RequestMapping(value = "/getContractOrTranseType", method = RequestMethod.POST)
	public JsonResult<List<LegDictionary>> getContractOrTranseType(@RequestBody LegDictionary condition);
	/**
     * 字典表字段更新
     * @param json
     * @return
     */
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public void update(@RequestParam(value = "json", required = true) String json);

	@ApiOperation(value = "获取合同类型的数量", notes = "获取合同类型的数量")
	@RequestMapping(value = "/obtainContractTypeData", method = RequestMethod.POST)
	public JsonResult<List<Map<String,Object>>> obtainContractTypeData(@RequestParam(value = "dicCode", required = true) String dicCode);

	@ApiOperation(value = "获取范本尚未模块化的数量", notes = "获取范本尚未模块化的数量")
	@RequestMapping(value = "/obtainNoContractTypeData", method = RequestMethod.POST)
	public JsonResult<List<Map<String,Object>>>  obtainNoContractTypeData(@RequestParam(value = "dicCode", required = true) String dicCode);

	@ApiOperation(value = "获取待共创范本信息", notes = "获取待共创范本信息")
	@RequestMapping(value = "/obtainCommonContractTypeData", method = RequestMethod.POST)
	public JsonResult<List<Map<String,Object>>>  obtainCommonContractTypeData(@RequestParam(value = "dicCode", required = true) String dicCode);

	@ApiOperation(value = "获取当前合同下的业务单元数量", notes = "获取当前合同下的业务单元数量")
	@RequestMapping(value = "/obtainContractTypeUntiData", method = RequestMethod.POST)
	public JsonResult<Integer> obtainContractTypeUntiData(@RequestParam(value = "unit", required = true) String unit);

}
