package com.haier.hop.ms.legcontract.resource;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegContractYjxtWfid;

import io.swagger.annotations.ApiOperation;

public interface LegContracDockingInfoResource {

	@ApiOperation(value = "获取数据-地产-TBS系统", notes = "地产-TBS系统")
	@RequestMapping(value = "/getHETF", method = RequestMethod.POST)
	public JsonResult<Object> getHETF();

	@ApiOperation(value = "获取数据-金融保理", notes = "金融保理")
	@RequestMapping(value = "/getGXHT", method = RequestMethod.POST)
	public JsonResult<Object> getGXHT();

	@ApiOperation(value = "获取数据-融租系统", notes = "融租系统")
	@RequestMapping(value = "/getHTR", method = RequestMethod.POST)
	public JsonResult<Object> getHTR();

	@ApiOperation(value = "获取数据-地产销售系统", notes = "地产销售系统")
	@RequestMapping(value = "/getHETS", method = RequestMethod.POST)
	public JsonResult<Object> getHETS();

	@ApiOperation(value = "获取数据-地产-TBS系统", notes = "地产-TBS系统")
	@RequestMapping(value = "/getHetct", method = RequestMethod.POST)
	public JsonResult<Object> getHetct();
	
	//@ApiOperation(value = "信息查询-印鉴系统-合同类接口定时任务调用", notes = "信息查询-印鉴系统-合同类接口定时任务调用")
	@RequestMapping(value = "/yjxtHtlInterface", method = RequestMethod.POST)
	public void yjxtHtlInterface(
			@RequestParam(value = "in0", required = false) String in0,//传参1：获取日期
			@RequestParam(value = "in1", required = false) String in1,//传参2：固定传3，获取归档数据
			@RequestParam(value = "in2", required = false) int in2) ;//传参3：合同的分类标志  
	
	//@ApiOperation(value = "信息查询-印鉴系统-医疗合同类接口定时任务调用", notes = "信息查询-印鉴系统-医疗合同类接口定时任务调用")
	@RequestMapping(value = "/yjxtYlhtlInterface", method = RequestMethod.POST)
	public void yjxtYlhtlInterface(
			@RequestParam(value = "in0", required = false) String in0,//传参1：获取日期
			@RequestParam(value = "in1", required = false) String in1,//传参2：固定传3，获取归档数据
			@RequestParam(value = "in2", required = false) int in2) ;//传参3：合同的分类标志        
	
	//@ApiOperation(value = "获取印鉴系统接口流程名称", notes = "获取印鉴系统接口流程名称")
	@RequestMapping(value = "/getYjxtWfid", method = RequestMethod.GET)
	public List<LegContractYjxtWfid> getYjxtWfid(@RequestParam(value = "lb1", required = false) String lb1);

	//@ApiOperation(value = "获取数据-资本合同定时任务调用", notes = "获取数据-资本合同定时任务调用")
	@RequestMapping(value = "/getCapital", method = RequestMethod.POST)
	public JsonResult<Object> getCapital(@RequestParam(value = "in0", required = false) String in0,//传参1：获取日期
										 @RequestParam(value = "in1", required = false) String in1,//传参2：固定传3，获取归档数据
										 @RequestParam(value = "in2", required = false) String in2);//传参3：流程id
}
