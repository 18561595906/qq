package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 附件
 * </p>
 *
 * @author liugan
 * @since 2019-12-19
 */
@TableName("leg_attachment")
public class LegAttachment extends Model<LegAttachment> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 资料名称
	 */
	@TableField("ATT_NAME")
	private String attName;
	/**
	 * 文件名称
	 */
	@TableField("FILE_NAME")
	private String fileName;
	/**
	 * 文件类型
	 */
	@TableField("FILE_TYPE")
	private String fileType;
	/**
	 * 对方系统附件ID
	 */
	@TableField("FILE_ID")
	private String fileId;
	/**
	 * 文件地址
	 */
	@TableField("FILE_URL")
	private String fileUrl;
	/**
	 * 文件guoup名称（对应fastdfs的）
	 */
	@TableField("FILE_GROUP")
	private String fileGroup;
	/**
	 * 文件大小
	 */
	@TableField("FILE_SIZE")
	private Integer fileSize;
	/**
	 * 上传时间
	 */
	@TableField("UPLOD_DATE")
	private Date uplodDate;
	/**
	 * 关联ID
	 */
	@TableField("RELA_ID")
	private String relaId;
	/**
	 * 合同:contract 合同模板:template 公司:company 印章:seal 综合:待补充 ... 其它系统：otherSys
	 */
	@TableField("ATT_TYPE")
	private String attType;
	/**
	 * --合同模板类型:1:标准主模板 2:标准专用模板 3:按标准编辑主模板 4:按标准编辑专用模板 5:标准通用模板 6：按标准编辑通用模板
	 * 7:中文非标模板 8:英文非标模板 9:修订记录表
	 * --合同类型：1:附件 5:辅助附件 6:合同扫描件 7:公议意见补充附件 8:合同附件pdf
	 * --公司类型：1:立项背景资料 2:工商登记文件 3:备案表 4:营业执照 5: 承诺书 6:工商登记文件扫描件 7:E企通文件模板
	 * --印章类型 1:印模 2:公安刻制
	 * --其它系统：具体系统简称
	 */
	@TableField("SPECIFIC_TYPE")
	private String specificType;
	/**
	 * 01：公司新设公议资料 02：公司新设归档资料 03：公司新设备案表 04：公司变更公议资料 05：公司变更归档资料 06：公司变更备案表
	 * 07：公司注销公议资料 08：公司注销归档资料 09：公司注销备案表
	 * 10：公司补充资料
	 */
	@TableField("READY_TYPE")
	private String readyType;
	/**
	 * 附件状态
	 */
	@TableField("ATT_FLAGE")
	private Integer attFlage;
	/**
	 * 附件等级1:上传文件(工商登记文件)2：立项背景资料3：文件自生成（工商登记文件）
	 */
	@TableField("RELA_RUNK")
	private String relaRunk;
	/**
	 * 有效状态#1:有效;2:无效;
	 */
	@TableField("ACTIVE_FLAGE")
	private BigDecimal activeFlage;
	/**
	 * 版本信息
	 */
	@TableField("ATT_VERSION")
	private BigDecimal attVersion;
	/**
	 * 文件后缀
	 */
	@TableField("SUFFIX")
	private String suffix;
	/**
	 * 原先关联ID号
	 */
	@TableField("RELA_ID_BACK")
	private String relaIdBack;
	@TableField("ATT_PUBLIC")
	private Integer attPublic;
	/**
	 * 流程id
	 */
	@TableField("PROC_ID")
	private String procId;
	/**
	 * 给直接采购回传文件的关联id
	 */
	@TableField("FILE_ID_BACK")
	private BigDecimal fileIdBack;
	@TableField("BKZ_REASON")
	private String bkzReason;
	
	/**
	 * 直接采购回传文件名称
	 */
	@TableField("HTGLXT_FNAME")
	private String htglxtFname;
	
	// 是否有电子印章
	@TableField(exist = false)
	private String progressEvent;
	// 是否有电子印章
	@TableField(exist = false)
	private String uploadUser;
	// 是否有电子印章
	@TableField(exist = false)
	private String size;
	// 是否有电子印章
	@TableField(exist = false)
	private String del;
	// 分页
	@TableField(exist = false)
	private Integer sizeFrist;
	// 分页
	@TableField(exist = false)
	private Integer sizeLast;

	public String getRowId() {
		return rowId;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getUploadUser() {
		return uploadUser;
	}

	public void setUploadUser(String uploadUser) {
		this.uploadUser = uploadUser;
	}

	public String getDel() {
		return del;
	}

	public void setDel(String del) {
		this.del = del;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getProgressEvent() {
		return progressEvent;
	}

	public Integer getSizeFrist() {
		return sizeFrist;
	}

	public void setSizeFrist(Integer sizeFrist) {
		this.sizeFrist = sizeFrist;
	}

	public Integer getSizeLast() {
		return sizeLast;
	}

	public void setSizeLast(Integer sizeLast) {
		this.sizeLast = sizeLast;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setProgressEvent(String progressEvent) {
		this.progressEvent = progressEvent;
	}

	public String getAttName() {
		return attName;
	}

	public void setAttName(String attName) {
		this.attName = attName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getFileGroup() {
		return fileGroup;
	}

	public void setFileGroup(String fileGroup) {
		this.fileGroup = fileGroup;
	}

	public Integer getFileSize() {
		return fileSize;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	public Date getUplodDate() {
		return uplodDate;
	}

	public void setUplodDate(Date uplodDate) {
		this.uplodDate = uplodDate;
	}

	public String getRelaId() {
		return relaId;
	}

	public void setRelaId(String relaId) {
		this.relaId = relaId;
	}

	public String getAttType() {
		return attType;
	}

	public void setAttType(String attType) {
		this.attType = attType;
	}

	public String getSpecificType() {
		return specificType;
	}

	public void setSpecificType(String specificType) {
		this.specificType = specificType;
	}

	public String getReadyType() {
		return readyType;
	}

	public void setReadyType(String readyType) {
		this.readyType = readyType;
	}

	public Integer getAttFlage() {
		return attFlage;
	}

	public void setAttFlage(Integer attFlage) {
		this.attFlage = attFlage;
	}

	public String getRelaRunk() {
		return relaRunk;
	}

	public void setRelaRunk(String relaRunk) {
		this.relaRunk = relaRunk;
	}

	public BigDecimal getActiveFlage() {
		return activeFlage;
	}

	public void setActiveFlage(BigDecimal activeFlage) {
		this.activeFlage = activeFlage;
	}

	public BigDecimal getAttVersion() {
		return attVersion;
	}

	public void setAttVersion(BigDecimal attVersion) {
		this.attVersion = attVersion;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getRelaIdBack() {
		return relaIdBack;
	}

	public void setRelaIdBack(String relaIdBack) {
		this.relaIdBack = relaIdBack;
	}

	public Integer getAttPublic() {
		return attPublic;
	}

	public void setAttPublic(Integer attPublic) {
		this.attPublic = attPublic;
	}

	public String getProcId() {
		return procId;
	}

	public void setProcId(String procId) {
		this.procId = procId;
	}

	public BigDecimal getFileIdBack() {
		return fileIdBack;
	}

	public void setFileIdBack(BigDecimal fileIdBack) {
		this.fileIdBack = fileIdBack;
	}

	public String getBkzReason() {
		return bkzReason;
	}

	public void setBkzReason(String bkzReason) {
		this.bkzReason = bkzReason;
	}

	public String getHtglxtFname() {
		return htglxtFname;
	}

	public void setHtglxtFname(String htglxtFname) {
		this.htglxtFname = htglxtFname;
	}

	@Override
	protected Serializable pkVal() {
		return this.rowId;
	}

	@Override
	public String toString() {
		return "LegAttachment{" + "rowId=" + rowId + ", attName=" + attName + ", fileName=" + fileName + ", fileType="
				+ fileType + ", fileId=" + fileId + ", fileUrl=" + fileUrl + ", fileGroup=" + fileGroup + ", fileSize="
				+ fileSize + ", uplodDate=" + uplodDate + ", relaId=" + relaId + ", attType=" + attType
				+ ", specificType=" + specificType + ", readyType=" + readyType + ", attFlage=" + attFlage
				+ ", relaRunk=" + relaRunk + ", activeFlage=" + activeFlage + ", attVersion=" + attVersion + ", suffix="
				+ suffix + ", relaIdBack=" + relaIdBack + ", attPublic=" + attPublic + ", procId=" + procId
				+ ", fileIdBack=" + fileIdBack + ", bkzReason=" + bkzReason + ", htglxtFname=" + htglxtFname + "}";
	}
}
