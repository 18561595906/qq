package com.haier.hop.ms.legcontract.dto;


public class LegGeneralFileSealDto {

    //private String applyNum;       //申请单编号
    private String applyUserCode;  //申请人员工号
    private String applyUserName;  //申请人员姓名
    private String applyUserPhone; //申请人员电话
    private String applyUserEmail; //申请人员邮箱
    private String sealDesc;       //用印说明
    private String outsideUnit;    //外报单位
    private String plCode;         //产业编码
    private String plName;         //产业名称
    private String isSingleItem;   //是否是单品（0：单品；1：成套）
    private String manufacturerName;//制造商名称
    private String xsOrXx;         //线上(xs)/线下(xx)
    private String sealFileType;   //用印文件类别（授权函）
    private String field1;         //授权函文件字段1
    private String field2;         //授权函文件字段2
    private String field3;		   //授权函文件字段3
    private String field4;	       //授权函文件字段4
    private String field5;         //授权函文件字段5
    private String field6;         //授权函文件字段6
    private String field7;         //授权函文件字段7
    private String field8;         //授权函文件字段8
    private String field9;         //授权函文件字段9
    private String field10;        //授权函文件字段10 授权期限自 年
    private String field11;        //授权函文件字段11 授权期限自 月
    private String field12;        //授权函文件字段12 授权期限自 日
    private String field13;        //授权函文件字段13 授权期限至 年
    private String field14;        //授权函文件字段14 授权期限至 月
    private String field15;        //授权函文件字段15 授权期限至 日
    private String field16;        //授权函文件字段16 授权期限   几个月
    private String sourceName;    //来源系统
    private String centreName;    //中心名称
    private String authLetterUrl; //客户提报的承诺函
    private String protocolUrl;   //客户提报的经销协议
    private String bz1;//备注字段1
    private String bz2;//备注字段2
    private String bz3;//备注字段3
    private String bz4;//备注字段4
    private String bz5;//备注字段5
    private String bz6;//备注字段6
	
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
	
}
