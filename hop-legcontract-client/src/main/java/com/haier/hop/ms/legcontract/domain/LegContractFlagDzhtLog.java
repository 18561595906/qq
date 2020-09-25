package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 电签接口传输信息表
 * </p>
 *
 * @author shiyingxin
 * @since 2020-03-23
 */
@TableName("leg_contract_flag_dzht_log")
public class LegContractFlagDzhtLog extends Model<LegContractFlagDzhtLog> {

	private static final long serialVersionUID = 1L;

	@TableId("ROW_ID")
	private String rowId;

	@TableId("PROC_ID")
	private String procId;
	/**
	 * 传输方
	 */
	@TableField("APPLY_ID")
	private String apply_id;
	/**
	 * 接口名称
	 */
	@TableField("INTERFACE_NAME")
	private String interfaceName;
	/**
	 * 参数
	 */
	@TableField("PARAM")
	private String param;
	/**
	 * 文档地址
	 */
	@TableField("ATT_URL")
	private String attUrl;
	/**
	 * 调用时间
	 */
	@TableField("CREATE_TIME")
	private Date createTime;
	/**
	 * 返回时间
	 */
	@TableField("END_TIME")
	private Date endTime;
	/**
	 * 返回参数
	 */
	@TableField("RETURN_PARAM")
	private String returnParam;
	/**
	 * 申请人
	 */
	@TableField("APPLIER_ID")
	private String applier_id;
	/**
	 * 申请人名称
	 */
	@TableField("APPLIER_NAME")
	private String applier_name;
	/**
	 * 合同编码
	 */
	@TableField("CONTRACT_CODE")
	private String contract_code;
	/**
	 * 合同名称
	 */
	@TableField("CONTRACT_NAME")
	private String contract_name;
	/**
	 * 合同开始日期
	 */
	@TableField("BEGIN_TIME")
	private Date begin_time;
	/**
	 * 甲方编码
	 */
	@TableField("JIA_CODE")
	private String jia_code;
	/**
	 * 甲方名称
	 */
	@TableField("JIA_NAME")
	private String jia_name;
	/**
	 * 甲方地址
	 */
	@TableField("JIA_ADDRESS")
	private String jia_address;
	/**
	 * 乙方编码
	 */
	@TableField("YI_CODE")
	private String yi_code;
	/**
	 * 乙方名称
	 */
	@TableField("YI_NAME")
	private String yi_name;
	/**
	 * 乙方地址
	 */
	@TableField("YI_ADDRESS")
	private String yi_address;
	/**
	 * 丙方编码
	 */
	@TableField("BING_CODE")
	private String bing_code;
	/**
	 * 丙方名称
	 */
	@TableField("BING_NAME")
	private String bing_name;
	/**
	 * 丙方地址
	 */
	@TableField("BING_ADDRESS")
	private String bing_address;
	/**
	 * 丁方编码
	 */
	@TableField("DING_CODE")
	private String ding_code;
	/**
	 * 丁方名称
	 */
	@TableField("DING_NAME")
	private String ding_name;
	/**
	 * 丁方地址
	 */
	@TableField("DING_ADDRESS")
	private String ding_address;
	/**
	 * 文件名称
	 */
	@TableField("PDF_NAME")
	private String pdf_name;
	/**
	 * 0.待办；1.已办
	 */
	@TableField("STATUS")
	private String status;
	/**
	 * 备注
	 */
	@TableField("REMARKS")
	private String remarks;
	/**
	 * 关键字
	 */
	@TableField("SIGN_KEY_WORD")
	private String sign_keyword;
	/**
	 * 印章管理员工号
	 */
	@TableField("SEAL_MANAGER")
	private String seal_manager;
	/**
	 * 印章编号（这个地方参数命名有歧义，要注意）
	 */
	@TableField("SEAL_MANAGER_NAME")
	private String seal_manager_name;
	/**
	 * 文件唯一标识
	 */
	@TableField("PDF_ID")
	private String pdf_id;
	/**
	 * 接口方名称
	 */
	@TableField("APPLY_NAME")
	private String apply_name;
	/**
	 * 接口方合同详情查看网址
	 */
	@TableField("DETAIL_URL")
	private String detail_url;
	/**
	 * 用印完查看地址
	 */
	@TableField("VIEWPDF_URL")
	private String viewpdfUrl;
	/**
	 * 用印完下载地址
	 */
	@TableField("DOWNLOAD_URL")
	private String download_url;

	@Override
	protected Serializable pkVal() {
		return this.rowId;
	}

	public String getProcId() {
		return procId;
	}

	public void setProcId(String procId) {
		this.procId = procId;
	}

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getApply_id() {
		return apply_id;
	}

	public void setApply_id(String apply_id) {
		this.apply_id = apply_id;
	}

	public String getInterfaceName() {
		return interfaceName;
	}

	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public String getAttUrl() {
		return attUrl;
	}

	public void setAttUrl(String attUrl) {
		this.attUrl = attUrl;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getReturnParam() {
		return returnParam;
	}

	public void setReturnParam(String returnParam) {
		this.returnParam = returnParam;
	}

	public String getApplier_id() {
		return applier_id;
	}

	public void setApplier_id(String applier_id) {
		this.applier_id = applier_id;
	}

	public String getApplier_name() {
		return applier_name;
	}

	public void setApplier_name(String applier_name) {
		this.applier_name = applier_name;
	}

	public String getContract_code() {
		return contract_code;
	}

	public void setContract_code(String contract_code) {
		this.contract_code = contract_code;
	}

	public String getContract_name() {
		return contract_name;
	}

	public void setContract_name(String contract_name) {
		this.contract_name = contract_name;
	}

	public Date getBegin_time() {
		return begin_time;
	}

	public void setBegin_time(Date begin_time) {
		this.begin_time = begin_time;
	}

	public String getJia_code() {
		return jia_code;
	}

	public void setJia_code(String jia_code) {
		this.jia_code = jia_code;
	}

	public String getJia_name() {
		return jia_name;
	}

	public void setJia_name(String jia_name) {
		this.jia_name = jia_name;
	}

	public String getJia_address() {
		return jia_address;
	}

	public void setJia_address(String jia_address) {
		this.jia_address = jia_address;
	}

	public String getYi_code() {
		return yi_code;
	}

	public void setYi_code(String yi_code) {
		this.yi_code = yi_code;
	}

	public String getYi_name() {
		return yi_name;
	}

	public void setYi_name(String yi_name) {
		this.yi_name = yi_name;
	}

	public String getYi_address() {
		return yi_address;
	}

	public void setYi_address(String yi_address) {
		this.yi_address = yi_address;
	}

	public String getBing_code() {
		return bing_code;
	}

	public void setBing_code(String bing_code) {
		this.bing_code = bing_code;
	}

	public String getBing_name() {
		return bing_name;
	}

	public void setBing_name(String bing_name) {
		this.bing_name = bing_name;
	}

	public String getBing_address() {
		return bing_address;
	}

	public void setBing_address(String bing_address) {
		this.bing_address = bing_address;
	}

	public String getDing_code() {
		return ding_code;
	}

	public void setDing_code(String ding_code) {
		this.ding_code = ding_code;
	}

	public String getDing_name() {
		return ding_name;
	}

	public void setDing_name(String ding_name) {
		this.ding_name = ding_name;
	}

	public String getDing_address() {
		return ding_address;
	}

	public void setDing_address(String ding_address) {
		this.ding_address = ding_address;
	}

	public String getPdf_name() {
		return pdf_name;
	}

	public void setPdf_name(String pdf_name) {
		this.pdf_name = pdf_name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSign_keyword() {
		return sign_keyword;
	}

	public void setSign_keyword(String sign_keyword) {
		this.sign_keyword = sign_keyword;
	}

	public String getSeal_manager() {
		return seal_manager;
	}

	public void setSeal_manager(String seal_manager) {
		this.seal_manager = seal_manager;
	}

	public String getSeal_manager_name() {
		return seal_manager_name;
	}

	public void setSeal_manager_name(String seal_manager_name) {
		this.seal_manager_name = seal_manager_name;
	}

	public String getPdf_id() {
		return pdf_id;
	}

	public void setPdf_id(String pdf_id) {
		this.pdf_id = pdf_id;
	}

	public String getApply_name() {
		return apply_name;
	}

	public void setApply_name(String apply_name) {
		this.apply_name = apply_name;
	}

	public String getDetail_url() {
		return detail_url;
	}

	public void setDetail_url(String detail_url) {
		this.detail_url = detail_url;
	}

	public String getViewpdfUrl() {
		return viewpdfUrl;
	}

	public void setViewpdfUrl(String viewpdfUrl) {
		this.viewpdfUrl = viewpdfUrl;
	}

	public String getDownload_url() {
		return download_url;
	}

	public void setDownload_url(String download_url) {
		this.download_url = download_url;
	}

}
