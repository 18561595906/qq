package com.haier.hop.ms.legcontract.resource;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.dto.FileCompareDto;

import io.swagger.annotations.ApiOperation;

public interface FileCompareResource {
	@RequestMapping(value = "/fileCompare", method = RequestMethod.POST)
	JsonResult<Map> fileCompare(@RequestBody FileCompareDto fileCompareDto);

	@ApiOperation(value = "文件比对", notes = "文本比对")
	@RequestMapping(value = "/fileCompareDoc", method = RequestMethod.POST)
	JsonResult<Map> fileCompareDoc(@RequestBody FileCompareDto fileCompareDto);


	@ApiOperation(value = "一键处理", notes = "一键处理")
	@RequestMapping(value = "/doFile", method = RequestMethod.POST)
	JsonResult<Integer> doFile(@RequestBody FileCompareDto fileCompareDto);

	@ApiOperation(value = "获取未处理文件数", notes = "获取未处理文件数")
	@RequestMapping(value = "/waitFile", method = RequestMethod.POST)
	JsonResult<Integer> waitFile(@RequestBody FileCompareDto fileCompareDto);

	@ApiOperation(value = "一键处理模板上传", notes = "一键处理模板上传")
	@RequestMapping(value = "/docUpload", method = RequestMethod.POST)
	List<JSONObject> docUpload(@RequestBody FileCompareDto fileCompareDto);

	@RequestMapping(value = "/fileMerge", method = RequestMethod.POST)
	JsonResult<String> fileMerge(@RequestBody FileCompareDto fileCompareDto) throws Exception;

	@RequestMapping(value = "/ocrupload", method = RequestMethod.POST)
	JsonResult<String> ocrupload(@RequestBody FileCompareDto fileCompareDto) throws IOException;

	@RequestMapping(value = "/fileCompareocr", method = RequestMethod.POST)
	JsonResult<Map> fileCompareocr(@RequestBody FileCompareDto fileCompareDto) throws Exception;
	
	 @ApiOperation(value = "获取pdf页数", notes = "获取pdf页数")
	 @RequestMapping(value = "/getPage", method = RequestMethod.GET)
	 Integer getPage(@RequestParam("url") String url);
}
