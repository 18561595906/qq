package com.haier.hop.ms.legcontract.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegContractReturn;

import io.swagger.annotations.ApiOperation;

public interface LegContractReturnResource {

	/**
	 * @Description: 	检索需要定时执行的直接采购文件回传信息
	 * @author: liugan
	 * @date:   2019-12-25
	 * @param:  
	 * @return: 
	 */
	@GetMapping(value = "/getFileReturn")
	public JsonResult<List<LegContractReturn>> getFileReturn();
	
	/**
	 * @Description: 	直接采购文件回传执行成功后，更新表标志位
	 * @author: liugan
	 * @date:   2019-12-25
	 * @param:  
	 * @return: 
	 */	
	@ApiOperation(value = "文件回传执行成功后更新表操作",notes = "文件回传执行成功后更新表操作")
	@PostMapping(value = "/updateFileReturnInfo")
	public JsonResult<Object> updateFileReturnInfo(@RequestBody List<LegContractReturn> list);
	
	/**
	 * @Description: 附件定时回传
	 * @author: liugan
	 * @date:   2020-6-15
	 * @param:  attachList 文件
	 * @return: 
	 */
	@ApiOperation(value = "直接采购定时回传",notes = "直接采购定时回传")
	@PostMapping(value = "/timingReturn")
	public JsonResult<Object> timingReturn(@RequestBody List<LegContractReturn> list);
}
