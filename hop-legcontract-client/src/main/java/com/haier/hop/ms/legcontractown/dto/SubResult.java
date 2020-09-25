/**
 * @Company： 青鸟软通   
 * @Title: Result.java 
 * @Description：描述 
 * @Author： wxinpeng   
 * @Date： 2014-1-6 下午3:40:41 
 * @Version： V1.0  
 * @Modify：          
 */
package com.haier.hop.ms.legcontractown.dto;

import java.io.Serializable;

/** 
 * @ClassName: SubResult 
 * @Description: (提交请求时WebService结果)  
 */
public class SubResult implements Serializable {
	private static final long serialVersionUID = 1L;
	private int retCode;//消息代码
	private String retMsg;//消息内容
	private String contNo;//合同流水号
	private String printUrl;// 免登陆跳转到云超市合同发起草稿页
	/**
	 * @Description: 属性 retCode 的get方法 
	 * @return retCode
	 */
	public int getRetCode() {
		return retCode;
	}
	/**
	 * @Description: 属性 retCode 的set方法 
	 * @param retCode 
	 */
	public void setRetCode(int retCode) {
		this.retCode = retCode;
	}
	/**
	 * @Description: 属性 retMsg 的get方法 
	 * @return retMsg
	 */
	public String getRetMsg() {
		return retMsg;
	}
	/**
	 * @Description: 属性 retMsg 的set方法 
	 * @param retMsg 
	 */
	public void setRetMsg(String retMsg) {
		this.retMsg = retMsg;
	}
	/**
	 * @Description: 属性 contNo 的get方法 
	 * @return contNo
	 */
	public String getContNo() {
		return contNo;
	}
	/**
	 * @Description: 属性 contNo 的set方法 
	 * @param contNo 
	 */
	public void setContNo(String contNo) {
		this.contNo = contNo;
	}
	public String getPrintUrl() {
		return printUrl;
	}
	public void setPrintUrl(String printUrl) {
		this.printUrl = printUrl;
	}
}
