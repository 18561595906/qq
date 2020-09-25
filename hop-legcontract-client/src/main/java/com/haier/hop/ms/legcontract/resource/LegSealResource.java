package com.haier.hop.ms.legcontract.resource;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.constant.IConstInfo;
import com.haier.hop.ms.legcontract.domain.LegSeal;
import com.haier.hop.ms.legcontract.dto.LegSealSelectDto;
import com.haier.hop.ms.page.PageBean;

import io.swagger.annotations.ApiOperation;

public interface LegSealResource {

	/**
	 * 查询印章信息
	 * 
	 * @author xuejinxin
	 * @param json
	 * @return
	 */
	@RequestMapping(value = "/selectList", method = RequestMethod.POST)
	public JsonResult<List<LegSeal>> selectList(@RequestBody LegSeal legseal);

	/**
	 * 查询电子印章信息
	 * 
	 * @author xuejinxin
	 * @param compaNo
	 * @return
	 */
	@RequestMapping(value = "/getEligibleSealInfo", method = RequestMethod.POST)
	public JsonResult<List<LegSeal>> getEligibleSealInfo(@RequestParam(value = "compaNo") String compaNo);

	/**
	 * 查询印章信息
	 * 
	 * @author shiyingxin
	 * @param compaNo
	 * @return
	 */
	@ApiOperation(value = "分页查询印章信息", notes = "分页查询印章信息")
	@RequestMapping(value = "/selectSealList", method = RequestMethod.POST)
	JsonResult<PageBean<LegSealSelectDto>> selectSealList(@RequestParam(value = "selectDto") String selectDto,
			@RequestParam(value = "currentPage", required = false, defaultValue = IConstInfo.DEFAULT_CURRENT_PAGE) Integer currentPage,
			@RequestParam(value = "pageSize", required = false, defaultValue = IConstInfo.DEFAULT_PAGESIZE) Integer pageSize);
	
	/**
	 * 查询电子印章信息（借款担保无效的公章）
	 * 根据公司名称获取
	 * @author lyy
	 * @param comp
	 * @return
	 */
	@RequestMapping(value = "/getJkdbwxEligibleSealInfo", method = RequestMethod.POST)
	public JsonResult<List<LegSeal>> getJkdbwxEligibleSealInfo(@RequestParam(value = "comp") String comp);
	/**
	 * 查询电子印章信息（担保无效的公章）
	 * 根据公司名称获取
	 * @author lyy
	 * @param comp
	 * @return
	 */
	@RequestMapping(value = "/getDbwxEligibleSealInfo", method = RequestMethod.POST)
	public JsonResult<List<LegSeal>> getDbwxEligibleSealInfo(@RequestParam(value = "comp") String comp);
}
