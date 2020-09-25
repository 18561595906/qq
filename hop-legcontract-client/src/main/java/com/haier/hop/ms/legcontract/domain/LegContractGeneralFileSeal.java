package com.haier.hop.ms.legcontract.domain;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 一般文件用印授权函申请表
 * </p>
 *
 * @author lyy
 * @since 2020-05-14
 */
@TableName("leg_contract_general_file_seal")
public class LegContractGeneralFileSeal extends Model<LegContractGeneralFileSeal> {

    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    @TableId("ROW_ID")
    private String rowId;
    /**
     * 申请单号 
     */
    @TableField("APPLY_NUM")
    private String applyNum;
    /**
     * 申请人工号
     */
    @TableField("APPLY_USER_CODE")
    private String applyUserCode;
    /**
     * 申请人名称
     */
    @TableField("APPLY_USER_NAME")
    private String applyUserName;
    /**
     * 申请人电话
     */
    @TableField("APPLY_USER_PHONE")
    private String  applyUserPhone;
    /**
     * 申请人邮箱
     */
    @TableField("APPLY_USER_EMAIL")
    private String applyUserEmail;
    /**
     * 用印说明
     */
    @TableField("SEAL_DESC")
    private String sealDesc;
    /**
     * 外部单位
     */
    @TableField("OUTSIDE_UNIT")
    private String outsideUnit; 
    /**
     * 产业编码
     */
    @TableField("PL_CODE")
    private String plCode;
    /**
     * 产业名称
     */
    @TableField("PL_NAME")
    private String plName;
    /**
     * 是否是单品（0：单品；1：成套）
     */
    @TableField("IS_SINGLE_ITEM")
    private String isSingleItem;
    /**
     * 制造商名称（全）根据该名称匹配借款担保无效的公章
     */
    @TableField("MANUFACTURER_NAME")
    private String manufacturerName;
    /**
     * 线上XS/线下XX
     */
    @TableField("XS_OR_XX")
    private String xsOrXx;
    /**
     * 用印文件类别（授权函）
     */
    @TableField("SEAL_FILE_TYPE")
    private String sealFileType;
    /**
     * 授权函文件字段1
     */
    @TableField("FIELD1")
    private String field1;
    /**
     * 授权函文件字段2
     */
    @TableField("FIELD2")
    private String field2;
    /**
     * 授权函文件字段3
     */
    @TableField("FIELD3")
    private String field3;
    /**
     * 授权函文件字段4
     */
    @TableField("FIELD4")
    private String field4;
    /**
     *  授权函文件字段5
     */
    @TableField("FIELD5")
    private String field5;
    /**
     * 授权函文件字段6
     */
    @TableField("FIELD6")
    private String field6;
    /**
     * 授权函文件字段7
     */
    @TableField("FIELD7")
    private String field7;
    /**
     * 授权函文件字段8
     */
    @TableField("FIELD8")
    private String field8;
    /**
     * 授权函文件字段9
     */
    @TableField("FIELD9")
    private String field9;
    /**
     * 授权函文件字段10
     */
    @TableField("FIELD10")
    private String field10;
    /**
     *  授权函文件字段11
     */
    @TableField("FIELD11")
    private String field11;
    /**
     * 授权函文件字段12
     */
    @TableField("FIELD12")
    private String field12;
    /**
     * 授权函文件字段13
     */
    @TableField("FIELD13")
    private String field13;
    /**
     * 授权函文件字段14
     */
    @TableField("FIELD14")
    private String field14;
    /**
     *  授权函文件字段15
     */
    @TableField("FIELD15")
    private String field15;
    /**
     * 授权函文件字段16
     */
    @TableField("FIELD16")
    private String field16;
    /**
     * 来源系统
     */
    @TableField("SOURCE_NAME")
    private String sourceName;
    /**
     * 申请日期
     */
    @TableField("APPLY_DATE")
    private Date applyDate; 
    /**
     * 状态：  1：提交
     */
    @TableField("SEAL_STATUS")
    private String sealStatus;
    /**
     * 流程ID
     */
    @TableField("PROC_ID")
    private String procId;
    /**
     * 法大大自动盖章完成-查看地址（授权函线上用印）
     */
    @TableField("viewpdf_url")
    private String viewpdfUrl;
    /**
     * 法大大自动盖章完成-下载地址（授权函线上用印）
     */
    @TableField("download_url")
    private String downloadUrl;
    /**
     * 创建时间
     */
    @TableField("create_date")
    private Date createDate;
    /**
     * 创建人
     */
    @TableField("create_by")
    private String createBy;
    /**
     * 更新时间
     */
    @TableField("update_date")
    private Date updateDate;
    /**
     * 更新人
     */
    @TableField("update_by")
    private String updateBy;

    /**
     * 中心名称
     */
    @TableField("centre_name")
    private String centreName;
    
    /**
     *客户提报的承诺函
     */
    @TableField("authLetterUrl")
    private String authLetterUrl; 
    /**
     * 客户提报的经销协议
     */
    @TableField("protocolUrl")
    private String protocolUrl;   
    /**
     * 备注字段1
     */
    @TableField("bz1")
    private String bz1;
    /**
     * 备注字段2
     */
    @TableField("bz2")
    private String bz2;
    /**
     * 备注字段3
     */
    @TableField("bz3")
    private String bz3;
    /**
     * 备注字段4
     */
    @TableField("bz4")
    private String bz4;
    /**
     * 备注字段5
     */
    @TableField("bz5")
    private String bz5;
    /**
     * 备注字段6
     */
    @TableField("bz6")
    private String bz6;
    /**
	 * @return the rowId
	 */
	public String getRowId() {
		return rowId;
	}

	/**
	 * @param rowId the rowId to set
	 */
	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	/**
	 * @return the applyNum
	 */
	public String getApplyNum() {
		return applyNum;
	}

	/**
	 * @param applyNum the applyNum to set
	 */
	public void setApplyNum(String applyNum) {
		this.applyNum = applyNum;
	}

	/**
	 * @return the applyUserCode
	 */
	public String getApplyUserCode() {
		return applyUserCode;
	}

	/**
	 * @param applyUserCode the applyUserCode to set
	 */
	public void setApplyUserCode(String applyUserCode) {
		this.applyUserCode = applyUserCode;
	}

	/**
	 * @return the applyUserName
	 */
	public String getApplyUserName() {
		return applyUserName;
	}

	/**
	 * @param applyUserName the applyUserName to set
	 */
	public void setApplyUserName(String applyUserName) {
		this.applyUserName = applyUserName;
	}


	/**
	 * @return the applyUserPhone
	 */
	public String getApplyUserPhone() {
		return applyUserPhone;
	}

	/**
	 * @param applyUserPhone the applyUserPhone to set
	 */
	public void setApplyUserPhone(String applyUserPhone) {
		this.applyUserPhone = applyUserPhone;
	}

	/**
	 * @return the applyUserEmail
	 */
	public String getApplyUserEmail() {
		return applyUserEmail;
	}

	/**
	 * @param applyUserEmail the applyUserEmail to set
	 */
	public void setApplyUserEmail(String applyUserEmail) {
		this.applyUserEmail = applyUserEmail;
	}

	/**
	 * @return the sealDesc
	 */
	public String getSealDesc() {
		return sealDesc;
	}

	/**
	 * @param sealDesc the sealDesc to set
	 */
	public void setSealDesc(String sealDesc) {
		this.sealDesc = sealDesc;
	}

	/**
	 * @return the outsideUnit
	 */
	public String getOutsideUnit() {
		return outsideUnit;
	}

	/**
	 * @param outsideUnit the outsideUnit to set
	 */
	public void setOutsideUnit(String outsideUnit) {
		this.outsideUnit = outsideUnit;
	}

	/**
	 * @return the plCode
	 */
	public String getPlCode() {
		return plCode;
	}

	/**
	 * @param plCode the plCode to set
	 */
	public void setPlCode(String plCode) {
		this.plCode = plCode;
	}

	/**
	 * @return the plName
	 */
	public String getPlName() {
		return plName;
	}

	/**
	 * @param plName the plName to set
	 */
	public void setPlName(String plName) {
		this.plName = plName;
	}

	/**
	 * @return the isSingleItem
	 */
	public String getIsSingleItem() {
		return isSingleItem;
	}

	/**
	 * @param isSingleItem the isSingleItem to set
	 */
	public void setIsSingleItem(String isSingleItem) {
		this.isSingleItem = isSingleItem;
	}

	/**
	 * @return the manufacturerName
	 */
	public String getManufacturerName() {
		return manufacturerName;
	}

	/**
	 * @param manufacturerName the manufacturerName to set
	 */
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	/**
	 * @return the xsOrXx
	 */
	public String getXsOrXx() {
		return xsOrXx;
	}

	/**
	 * @param xsOrXx the xsOrXx to set
	 */
	public void setXsOrXx(String xsOrXx) {
		this.xsOrXx = xsOrXx;
	}

	/**
	 * @return the sealFileType
	 */
	public String getSealFileType() {
		return sealFileType;
	}

	/**
	 * @param sealFileType the sealFileType to set
	 */
	public void setSealFileType(String sealFileType) {
		this.sealFileType = sealFileType;
	}

	/**
	 * @return the field1
	 */
	public String getField1() {
		return field1;
	}

	/**
	 * @param field1 the field1 to set
	 */
	public void setField1(String field1) {
		this.field1 = field1;
	}

	/**
	 * @return the field2
	 */
	public String getField2() {
		return field2;
	}

	/**
	 * @param field2 the field2 to set
	 */
	public void setField2(String field2) {
		this.field2 = field2;
	}

	/**
	 * @return the field3
	 */
	public String getField3() {
		return field3;
	}

	/**
	 * @param field3 the field3 to set
	 */
	public void setField3(String field3) {
		this.field3 = field3;
	}

	/**
	 * @return the field4
	 */
	public String getField4() {
		return field4;
	}

	/**
	 * @param field4 the field4 to set
	 */
	public void setField4(String field4) {
		this.field4 = field4;
	}

	/**
	 * @return the field5
	 */
	public String getField5() {
		return field5;
	}

	/**
	 * @param field5 the field5 to set
	 */
	public void setField5(String field5) {
		this.field5 = field5;
	}

	/**
	 * @return the field6
	 */
	public String getField6() {
		return field6;
	}

	/**
	 * @param field6 the field6 to set
	 */
	public void setField6(String field6) {
		this.field6 = field6;
	}

	/**
	 * @return the field7
	 */
	public String getField7() {
		return field7;
	}

	/**
	 * @param field7 the field7 to set
	 */
	public void setField7(String field7) {
		this.field7 = field7;
	}

	/**
	 * @return the field8
	 */
	public String getField8() {
		return field8;
	}

	/**
	 * @param field8 the field8 to set
	 */
	public void setField8(String field8) {
		this.field8 = field8;
	}

	/**
	 * @return the field9
	 */
	public String getField9() {
		return field9;
	}

	/**
	 * @param field9 the field9 to set
	 */
	public void setField9(String field9) {
		this.field9 = field9;
	}

	/**
	 * @return the field10
	 */
	public String getField10() {
		return field10;
	}

	/**
	 * @param field10 the field10 to set
	 */
	public void setField10(String field10) {
		this.field10 = field10;
	}

	/**
	 * @return the field11
	 */
	public String getField11() {
		return field11;
	}

	/**
	 * @param field11 the field11 to set
	 */
	public void setField11(String field11) {
		this.field11 = field11;
	}

	/**
	 * @return the field12
	 */
	public String getField12() {
		return field12;
	}

	/**
	 * @param field12 the field12 to set
	 */
	public void setField12(String field12) {
		this.field12 = field12;
	}

	/**
	 * @return the field13
	 */
	public String getField13() {
		return field13;
	}

	/**
	 * @param field13 the field13 to set
	 */
	public void setField13(String field13) {
		this.field13 = field13;
	}

	/**
	 * @return the field14
	 */
	public String getField14() {
		return field14;
	}

	/**
	 * @param field14 the field14 to set
	 */
	public void setField14(String field14) {
		this.field14 = field14;
	}

	/**
	 * @return the field15
	 */
	public String getField15() {
		return field15;
	}

	/**
	 * @param field15 the field15 to set
	 */
	public void setField15(String field15) {
		this.field15 = field15;
	}

	/**
	 * @return the field16
	 */
	public String getField16() {
		return field16;
	}

	/**
	 * @param field16 the field16 to set
	 */
	public void setField16(String field16) {
		this.field16 = field16;
	}

	/**
	 * @return the sourceName
	 */
	public String getSourceName() {
		return sourceName;
	}

	/**
	 * @param sourceName the sourceName to set
	 */
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	/**
	 * @return the applyDate
	 */
	public Date getApplyDate() {
		return applyDate;
	}

	/**
	 * @param applyDate the applyDate to set
	 */
	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	/**
	 * @return the sealStatus
	 */
	public String getSealStatus() {
		return sealStatus;
	}

	/**
	 * @param sealStatus the sealStatus to set
	 */
	public void setSealStatus(String sealStatus) {
		this.sealStatus = sealStatus;
	}

	/**
	 * @return the procId
	 */
	public String getProcId() {
		return procId;
	}

	/**
	 * @param procId the procId to set
	 */
	public void setProcId(String procId) {
		this.procId = procId;
	}

	/**
	 * @return the viewpdfUrl
	 */
	public String getViewpdfUrl() {
		return viewpdfUrl;
	}

	/**
	 * @param viewpdfUrl the viewpdfUrl to set
	 */
	public void setViewpdfUrl(String viewpdfUrl) {
		this.viewpdfUrl = viewpdfUrl;
	}

	/**
	 * @return the downloadUrl
	 */
	public String getDownloadUrl() {
		return downloadUrl;
	}

	/**
	 * @param downloadUrl the downloadUrl to set
	 */
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return the createBy
	 */
	public String getCreateBy() {
		return createBy;
	}

	/**
	 * @param createBy the createBy to set
	 */
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	/**
	 * @return the updateDate
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * @return the authLetterUrl
	 */
	public String getAuthLetterUrl() {
		return authLetterUrl;
	}

	/**
	 * @param authLetterUrl the authLetterUrl to set
	 */
	public void setAuthLetterUrl(String authLetterUrl) {
		this.authLetterUrl = authLetterUrl;
	}

	/**
	 * @return the protocolUrl
	 */
	public String getProtocolUrl() {
		return protocolUrl;
	}

	/**
	 * @param protocolUrl the protocolUrl to set
	 */
	public void setProtocolUrl(String protocolUrl) {
		this.protocolUrl = protocolUrl;
	}

	/**
	 * @return the bz1
	 */
	public String getBz1() {
		return bz1;
	}

	/**
	 * @param bz1 the bz1 to set
	 */
	public void setBz1(String bz1) {
		this.bz1 = bz1;
	}

	/**
	 * @return the bz2
	 */
	public String getBz2() {
		return bz2;
	}

	/**
	 * @param bz2 the bz2 to set
	 */
	public void setBz2(String bz2) {
		this.bz2 = bz2;
	}

	/**
	 * @return the bz3
	 */
	public String getBz3() {
		return bz3;
	}

	/**
	 * @param bz3 the bz3 to set
	 */
	public void setBz3(String bz3) {
		this.bz3 = bz3;
	}

	/**
	 * @return the bz4
	 */
	public String getBz4() {
		return bz4;
	}

	/**
	 * @param bz4 the bz4 to set
	 */
	public void setBz4(String bz4) {
		this.bz4 = bz4;
	}

	/**
	 * @return the bz5
	 */
	public String getBz5() {
		return bz5;
	}

	/**
	 * @param bz5 the bz5 to set
	 */
	public void setBz5(String bz5) {
		this.bz5 = bz5;
	}

	/**
	 * @return the bz6
	 */
	public String getBz6() {
		return bz6;
	}

	/**
	 * @param bz6 the bz6 to set
	 */
	public void setBz6(String bz6) {
		this.bz6 = bz6;
	}

	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * @return the updateBy
	 */
	public String getUpdateBy() {
		return updateBy;
	}

	/**
	 * @param updateBy the updateBy to set
	 */
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	/**
	 * @return the centreName
	 */
	public String getCentreName() {
		return centreName;
	}

	/**
	 * @param centreName the centreName to set
	 */
	public void setCentreName(String centreName) {
		this.centreName = centreName;
	}

	@Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegContractGeneralFileSeal{" +
        "rowId=" + rowId +
        ", applyNum=" + applyNum +
        ", applyUserCode=" + applyUserCode +
        ", applyUserName=" + applyUserName +
        ", applyUserPhone=" + applyUserPhone +
        ", applyUserEmail=" + applyUserEmail +
        ", sealDesc=" + sealDesc +
        ", outsideUnit=" + outsideUnit +
        ", plCode=" + plCode +
        ", plName=" + plName +
        ", isSingleItem=" + isSingleItem +
        ", manufacturerName=" + manufacturerName +
        ", xsOrXx=" + xsOrXx +
        ", sealFileType=" + sealFileType +
        ", field1=" + field1 +
        ", field2=" + field2 +
        ", field3=" + field3 +
        ", field4=" + field4 +
        ", field5=" + field5 +
        ", field6=" + field6 +
        ", field7=" + field7 +
        ", field8=" + field8 +
        ", field9=" + field9 +
        ", field10=" + field10 +
        ", field11=" + field11 +
        ", field12=" + field12 +
        ", field13=" + field13 +
        ", field14=" + field14 +
        ", field15=" + field15 +
        ", field16=" + field16 +   
        ", sourceName=" + sourceName +
        ", applyDate=" + applyDate +
        ", sealStatus=" + sealStatus +
        ", procId=" + procId +
        ", viewpdfUrl=" + viewpdfUrl +
        ", downloadUrl=" + downloadUrl +   
        ", createBy=" + createBy +
        ", createDate=" + createDate + 
        ", updateBy=" + updateBy +
        ", updateDate=" + updateDate + 
        ", centreName=" + centreName +
        ", authLetterUrl=" + authLetterUrl +
        ", protocolUrl=" + protocolUrl + 
        ", bz1=" + bz1 +
        ", bz2=" + bz2 +
        ", bz3=" + bz3 + 
        ", bz4=" + bz4 +
        ", bz5=" + bz5 +
        ", bz6=" + bz6 + 
        "}";
    }
}

