package com.haier.hop.ms.legcontract.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.haier.hop.ms.common.JsonResult;
import com.haier.hop.ms.legcontract.domain.LegAttachment;
import com.haier.hop.ms.legcontract.dto.FileResponseData;

import io.swagger.annotations.ApiOperation;

public interface FileResource {

	@ApiOperation(value = "上传文件通用", notes = "上传文件通用")
	@RequestMapping(value = "/upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public FileResponseData uploadFileSample(MultipartFile file);

	@ApiOperation(value = "上传文件", notes = "上传文件")
	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public JsonResult<Object> uploadCommonFile(MultipartFile file);

	@ApiOperation(value = "上传文件后台用", notes = "上传文件后台用")
	@RequestMapping(value = "/uploadFileHt", method = RequestMethod.POST)
	public JsonResult<LegAttachment> uploadFileHt(@RequestParam("encodeByte") String encodeByte,
			@RequestParam("fileName") String fileName);
	
	/**
	 * 	上传文件后台用-长链接
	 * 
	 * @author liugan
	 * @param file
	 * @return
	 */
	@ApiOperation(value = "上传文件后台用-长链接", notes = "上传文件后台用-长链接")
	@RequestMapping(value = "/uploadFileLong", method = RequestMethod.POST)
	public JsonResult<LegAttachment> uploadFileLong(@RequestBody String encodeByte,
			@RequestParam("fileName") String fileName);

	/**
	 * 批量上传附件（通用），目前应用于对端系统向leg传递合同附件
	 * 
	 * @author wangdh
	 * @param file
	 * @return
	 */
	@ApiOperation(value = "批量上传文件", notes = "批量上传文件")
	@PostMapping(value = "/batchUploadFile")
	public List<LegAttachment> batchUploadFile(@RequestPart(value = "files") MultipartFile[] multiFiles,
			@RequestParam("contractId") String contractId);

	@ApiOperation(value = "下载文件", notes = "下载文件")
	@RequestMapping(value = "/download", method = RequestMethod.POST)
	public void download(@RequestParam(value = "filePath", required = true) String filePath,
			HttpServletResponse response);

	@ApiOperation(value = "下载文件通用", notes = "下载文件通用")
	@RequestMapping(value = "/downloadFile", method = RequestMethod.POST)
	public void downloadFile(@RequestParam(value = "filePath", required = true) String filePath,
			HttpServletResponse response);

	@ApiOperation(value = "删除文件", notes = "删除文件")
	@RequestMapping(value = "/deleteFile", method = RequestMethod.DELETE)
	public JsonResult<Object> deleteFile(@RequestParam(value = "filePath", required = true) String filePath);

	@ApiOperation(value = "删除文件和数据库数据", notes = "删除文件和数据库数据")
	@RequestMapping(value = "/deleteFileAndData", method = RequestMethod.DELETE)
	public JsonResult<Object> deleteFileAndData(@RequestParam(value = "rowId", required = false) String rowId,
			@RequestParam(value = "filePath", required = true) String filePath);

	@ApiOperation(value = "获取文件信息", notes = "获取文件信息")
	@RequestMapping(value = "/getSampleInfo", method = RequestMethod.POST)
	public FileResponseData getSampleInfo(String fileUrl);

	@RequestMapping("/getToken")
	@ApiOperation(value = "根据路径获取token", notes = "根据路径获取token")
	public FileResponseData getToken(@RequestParam(value = "filePath", required = true) String filePath);

	@ApiOperation(value = "微服务之间传输文件", notes = "微服务之间传输文件")
	@RequestMapping(value = "/transferFile", method = RequestMethod.GET)
	public String transferFile(@RequestParam(value = "filePath", required = true) String filePath);

}
