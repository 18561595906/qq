package com.haier.hop.ms.legcontract.resource;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegAttachment;
import com.haier.hop.ms.legcontract.dto.LegStandardContractReplaceDto;
import com.haier.hop.ms.legcontract.dto.LegStandardSearchDto;
import com.haier.hop.ms.legcontract.dto.LegTyAttachmentDto;
import com.haier.hop.ms.page.PageBean;

import io.swagger.annotations.ApiOperation;

public interface AttamentResource {

	@ApiOperation(value = "保存附件信息", notes = "保存附件信息")
	@RequestMapping(value = "saveAttachment", method = RequestMethod.POST)
	public JsonResult<Object> saveAttachment(@RequestBody LegAttachment attaInfo);

	@ApiOperation(value = "批量保存附件信息", notes = "批量保存附件信息")
	@RequestMapping(value = "saveBatchAttachment", method = RequestMethod.POST)
	public JsonResult<Object> saveBatchAttachment(
			@RequestParam(value = "attaInfoList", required = false) String attaInfoList);

	@ApiOperation(value = "获取印章清单", notes = "获取印章清单")
	@RequestMapping(value = "getSealAttachment", method = RequestMethod.GET)
	public JsonResult<Object> getSealAttachment(@RequestParam(value = "attaInfo", required = false) String attaInfo);

	@ApiOperation(value = "获取附件信息", notes = "获取附件信息")
	@RequestMapping(value = "getAttachmentList", method = RequestMethod.GET)
	public JsonResult<List<LegAttachment>> getAttachmentList(
			@RequestParam(value = "relaId", required = false) String relaId,
			@RequestParam(value = "attType", required = false) String attType,
			@RequestParam(value = "specificType", required = false) String specificType,
			@RequestParam(value = "readyType", required = false) String readyType,
			@RequestParam(value = "relaRunk", required = false) String relaRunk);

	@ApiOperation(value = "获取附件信息", notes = "获取附件信息")
	@RequestMapping(value = "getAttachList", method = RequestMethod.POST)
	public List<LegAttachment> getAttachList(@RequestBody LegAttachment attaInfo);

	@ApiOperation(value = "更新附件信息", notes = "更新附件信息")
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public JsonResult<Object> update(@RequestBody LegAttachment attaInfo);

	@ApiOperation(value = "删除附件信息", notes = "删除附件信息")
	@RequestMapping(value = "deleteAttachment", method = RequestMethod.DELETE)
	public JsonResult<Integer> deleteAttachment(@RequestBody LegAttachment atta);

	@ApiOperation(value = "查询通用附件信息", notes = "查询通用附件信息")
	@RequestMapping(value = "selectTyAtt", method = RequestMethod.POST)
	public JsonResult<PageBean<LegTyAttachmentDto>> selectTyAtt(@RequestParam(value = "map") String map,
			@RequestParam(value = "currentPage") Integer currentPage,
			@RequestParam(value = "pageSize") Integer pageSize);

	@ApiOperation(value = "批量删除并保存附件", notes = "批量删除并保存附件")
	@RequestMapping(value = "deleteAndSaveFile", method = RequestMethod.POST)
	public JsonResult<List<LegAttachment>> deleteAndSaveFile(@RequestBody List<LegAttachment> legAttachments);

	@ApiOperation(value = "修改范本类型", notes = "修改范本类型")
	@RequestMapping(value = "saveEditStandradType", method = RequestMethod.POST)
	public JsonResult<Object> saveEditStandradType(@RequestBody LegStandardSearchDto dto);

	@ApiOperation(value = "保存替换范本类型", notes = "保存替换范本类型")
	@RequestMapping(value = "saveReplaceStandard", method = RequestMethod.POST)
	public JsonResult<List<LegStandardSearchDto>> saveReplaceStandard(@RequestBody List<LegStandardSearchDto> dtos);

	@ApiOperation(value = "查看历史&&误操作恢复还原", notes = "查看历史&&误操作恢复还原")
	@RequestMapping(value = "/saveReplaceStandardHistory", method = RequestMethod.POST)
	public JsonResult<Object> saveReplaceStandardHistory(@RequestBody LegStandardContractReplaceDto dto);

	@ApiOperation(value = "根据合同范本路径获取合同范本信息", notes = "根据合同范本路径获取合同范本信息")
	@RequestMapping(value = "/obtainAttachmentData", method = RequestMethod.POST)
	public LegAttachment obtainAttachmentData(@RequestParam(value = "fileUrl") String fileUrl);

	@ApiOperation(value = "根据合同范本tmp的主键id获取附件集合", notes = "根据合同范本tmp的主键id获取附件集合")
	@RequestMapping(value = "/obtainAttachmentDataByTmpRowId", method = RequestMethod.POST)
	public List<LegAttachment> obtainAttachmentDataByTmpRowId(@RequestParam(value = "tmpRowId") String tmpRowId);
}
