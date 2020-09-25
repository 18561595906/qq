package com.haier.hop.ms.legcontract.resource;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.constant.IConstInfo;
import com.haier.hop.ms.legcontract.domain.LegEmployeeAccredit;
import com.haier.hop.ms.legcontract.dto.LegApproverSelectDto;
import com.haier.hop.ms.page.PageBean;

import io.swagger.annotations.ApiOperation;

public interface LegEmployeeAccreditResource {

	@RequestMapping(value = "/getLegEmployeeAccredit", method = RequestMethod.POST)
	public JsonResult<LegEmployeeAccredit> getLegEmployeeAccredit(@RequestParam(value = "assignee") String assignee);

	@ApiOperation(value = "根据条件获取员工记录", notes = "根据条件获取员工记录")
	@RequestMapping(value = "/getRecordList", method = RequestMethod.GET)
	public JsonResult<Object> getRecordList(@RequestParam(value = "employeeStr", required = false) String employeeStr);

	@PostMapping(value = "/getUserByCategory")
	public List<LegEmployeeAccredit> getUserByCategory(@RequestBody LegApproverSelectDto selectDto);

	@PostMapping(value = "/getCategoryApproves")
	public JsonResult<PageBean<LegEmployeeAccredit>> getCategoryApproves(@RequestBody LegApproverSelectDto selectDto);

	@PostMapping(value = "/getUserByBand")
	public List<LegEmployeeAccredit> getUserByBand(@RequestBody LegApproverSelectDto selectDto);

	@RequestMapping(value = "/selectUserByDepartment", method = RequestMethod.GET)
	public JsonResult<Object> selectUserByDepartment(@RequestParam(value = "userNo") String userNo);

	@ApiOperation(value = "获取员工电子签名", notes = "获取员工电子签名")
	@RequestMapping(value = "/getUserPhoto", method = RequestMethod.GET)
	public JsonResult<String> getUserPhoto(@RequestParam(value = "userNo") String userNo);

	@ApiOperation(value = "获取6-12级所以员工信息", notes = "获取6-12级所以员工信息")
	@RequestMapping(value = "/getEmployeeBandList", method = RequestMethod.GET)
	public JsonResult<PageBean<LegEmployeeAccredit>> getEmployeeBandList(
			@RequestParam(value = "empSn", required = false) String empSn,
			@RequestParam(value = "empName", required = false) String empName,
			@RequestParam(value = "currentPage", required = false, defaultValue = IConstInfo.DEFAULT_CURRENT_PAGE) Integer currentPage,
			@RequestParam(value = "pageSize", required = false, defaultValue = IConstInfo.DEFAULT_PAGESIZE) Integer pageSize);

	@ApiOperation(value = "获取所有员工信息", notes = "获取所有员工信息")
	@RequestMapping(value = "/selectAssigneeList", method = RequestMethod.GET)
	public JsonResult<PageBean<LegEmployeeAccredit>> selectAssigneeList(
			@RequestParam(value = "empSn", required = false) String empSn,
			@RequestParam(value = "empName", required = false) String empName,
			@RequestParam(value = "currentPage", required = false, defaultValue = IConstInfo.DEFAULT_CURRENT_PAGE) Integer currentPage,
			@RequestParam(value = "pageSize", required = false, defaultValue = IConstInfo.DEFAULT_PAGESIZE) Integer pageSize);

	@ApiOperation(value = "根据编号获取唯一员工信息", notes = "根据编号获取唯一员工信息")
	@RequestMapping(value = "/getSingleEmployee", method = RequestMethod.GET)
	public JsonResult<LegEmployeeAccredit> getSingleEmployee(@RequestParam(value = "empSn") String empSn);

	@PostMapping(value = "/getCategoryApprovesByHistory")
	public JsonResult<List<LegEmployeeAccredit>> getCategoryApprovesByHistory(@RequestBody LegApproverSelectDto selectDto);
}
