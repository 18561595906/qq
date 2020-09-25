package com.haier.hop.ms.legcontract.resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegProcDraft;

public interface LegDraftResource {
	@RequestMapping(value = "/selectDarft", method = RequestMethod.GET)
	public JsonResult<LegProcDraft> selectDarft(@RequestParam(value = "relateid") String relateid);

	@RequestMapping(value = "/insertDarft", method = RequestMethod.POST)
	public JsonResult<Object> insertRecord(@RequestBody LegProcDraft draft);

	@RequestMapping(value = "/updateDarft", method = RequestMethod.PUT)
	public JsonResult<String> updateRecord(@RequestBody LegProcDraft draft);

	@RequestMapping(value = "/deleteDarft", method = RequestMethod.DELETE)
	public JsonResult<String> deleteDarft(@RequestBody LegProcDraft draft);

	@RequestMapping(value = "/deleteById", method = RequestMethod.DELETE)
	public JsonResult<Integer> deleteById(@RequestParam(value = "rowId") String rowId);

	@RequestMapping(value = "/getRecordById", method = RequestMethod.GET)
	public JsonResult<LegProcDraft> getRecordById(@RequestParam(value = "rowId") String rowId);

	@RequestMapping(value = "/getProcDraftByrelate", method = RequestMethod.GET)
	public JsonResult<LegProcDraft> getProcDraftByrelate(@RequestParam(value = "relateid") String relateid,
			@RequestParam(value = "relateTable") String relateTable, @RequestParam(value = "status") Integer status);

	@RequestMapping(value = "/getProcDraftByrelate", method = RequestMethod.PUT)
	public JsonResult<Object> updateDraftStatus(@RequestParam(value = "relateid") String relateid,
			@RequestParam(value = "relateTable") String relateTable, @RequestParam(value = "status") Integer status);

}
