package com.haier.hop.ms.legcontract.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.constant.IConstInfo;
import com.haier.hop.ms.legcontract.domain.LegEmployee;

import io.swagger.annotations.ApiOperation;

public interface LegEmployeeResource {

	@RequestMapping(value = "/findFirstPerson", method = RequestMethod.POST)
	public JsonResult<Object> findFirstPerson(@RequestParam(value = "empSn") String empSn);

	/**
	 * 所有范围内的人员检索
	 * 
	 * @author xuejinxin
	 * @param empSn
	 * @return
	 */
	@RequestMapping(value = "/getAllPersonName", method = RequestMethod.POST)
	public JsonResult<Object> getAllPersonName(@RequestParam(value = "empSn") String empSn);

	/**
	 * 查询平台长
	 * 
	 * @author xuxu
	 * @param empSn
	 * @param empName
	 * @param jytName
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value = "/getAll", method = RequestMethod.POST)
	public JsonResult<Object> getAll(@RequestParam(value = "empSn") String empSn, @RequestParam(value = "empName") String empName,
			@RequestParam(value = "jytName") String jytName,
			@RequestParam(value = "currentPage", required = false, defaultValue = IConstInfo.DEFAULT_CURRENT_PAGE) Integer currentPage,
			@RequestParam(value = "pageSize", required = false, defaultValue = IConstInfo.DEFAULT_PAGESIZE) Integer pageSize);

	/**
	 * 获取可抢单律师-通用（compId-业务单元编码，lawType-1：主管律师，2：可抢单律师）
	 * 
	 * @author xuxu
	 * @param compId
	 * @param lawType
	 * @return
	 */
	@RequestMapping(value = "/getContractLaws", method = RequestMethod.POST)
	public JsonResult<Object> getContractLaws(@RequestParam(value = "compId") String compId, @RequestParam(value = "lawType") String lawType);

	/**
	 * 获取可抢单律师-通用（compId-业务单元编码，lawType-1：主管律师，2：可抢单律师）
	 * 
	 * @author xuxu
	 * @param compId
	 * @param lawType
	 * @return
	 */
	@RequestMapping(value = "/getContractLawsNew", method = RequestMethod.POST)
	public JsonResult<String> getContractLawsNew(@RequestParam(value = "compId") String compId, @RequestParam(value = "lawType") String lawType);

	/**
	 * 此处为方法说明
	 * 
	 * @author xuejinxin
	 * @param employeeStr
	 * @return
	 */
	@ApiOperation(value = "根据条件获取员工记录", notes = "根据条件获取员工记录")
	@RequestMapping(value = "/getRecordList", method = RequestMethod.GET)
	public JsonResult<Object> getRecordList(@RequestParam(value = "employeeStr", required = false) String employeeStr);

	/**
	 * 此处为方法说明
	 * 
	 * @author xuejinxin
	 * @param empSn
	 * @return
	 */
	@RequestMapping(value = "/getEmpIdNo", method = RequestMethod.GET)
	public JsonResult<Object> getEmpIdNo(@RequestParam(value = "empSn", required = false) String empSn);

	/**
	 * 此处为方法说明
	 * 
	 * @author xuejinxin
	 * @param currentPage
	 * @param pageSize
	 * @param empSn
	 * @param empName
	 * @return
	 */
	@RequestMapping(value = "/selectEmployeeList", method = RequestMethod.GET)
	public JsonResult<Object> selectEmployeeList(
			@RequestParam(value = "currentPage", required = false, defaultValue = IConstInfo.DEFAULT_CURRENT_PAGE) Integer currentPage,
			@RequestParam(value = "pageSize", required = false, defaultValue = IConstInfo.DEFAULT_PAGESIZE) Integer pageSize,
			@RequestParam(value = "empSn", required = false) String empSn,
			@RequestParam(value = "empName", required = false) String empName);
	
	/**
	 * 
	 * 根据员工编号获取员工信息
	 * 
	 * @author liugan
	 * @param empSn
	 * @return
	 */
	@ApiOperation(value = "根据编号获取员工", notes = "根据编号获取员工")
	@RequestMapping(value = "/getEmpBySn", method = RequestMethod.GET)
	public JsonResult<LegEmployee> getEmpBySn(String empSn);
}
