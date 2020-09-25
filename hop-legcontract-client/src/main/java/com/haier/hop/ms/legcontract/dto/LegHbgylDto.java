package com.haier.hop.ms.legcontract.dto;

import java.util.List;

public class LegHbgylDto {
    //合同rowid
	private String contractRowId;
	//商务支持抢单公议结论不同意  选择的合同类型
    private String proTypes[];
    //添加协助节点提示show ,用来判断如果增加了协助公议节点，先提交增加的协助公议节点
	private Boolean helpNodesTips;
    //是否添加协助节点 7：需要
	private String isaddnode;
    //审核意见
	private String jiein;
    //审核结果1：同意  0：不同意 2 非适合公议人
	private String jielun;
    //流程号
	private String procId;
    //操作人
	private String userId;
	
	private List<LegNodeDto> nodeInfo;
	
	private LegActivitiDto legActivitiDto;
    //
	private LegContractTmpDto data1;
	/**
	 * @return the contractRowId
	 */
	public String getContractRowId() {
		return contractRowId;
	}
	/**
	 * @param contractRowId the contractRowId to set
	 */
	public void setContractRowId(String contractRowId) {
		this.contractRowId = contractRowId;
	}
	/**
	 * @return the helpNodesTips
	 */
	public Boolean getHelpNodesTips() {
		return helpNodesTips;
	}
	/**
	 * @param helpNodesTips the helpNodesTips to set
	 */
	public void setHelpNodesTips(Boolean helpNodesTips) {
		this.helpNodesTips = helpNodesTips;
	}
	/**
	 * @return the isaddnode
	 */
	public String getIsaddnode() {
		return isaddnode;
	}
	/**
	 * @param isaddnode the isaddnode to set
	 */
	public void setIsaddnode(String isaddnode) {
		this.isaddnode = isaddnode;
	}
	/**
	 * @return the jiein
	 */
	public String getJiein() {
		return jiein;
	}
	/**
	 * @param jiein the jiein to set
	 */
	public void setJiein(String jiein) {
		this.jiein = jiein;
	}
	/**
	 * @return the jielun
	 */
	public String getJielun() {
		return jielun;
	}
	/**
	 * @param jielun the jielun to set
	 */
	public void setJielun(String jielun) {
		this.jielun = jielun;
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
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	 * @return the nodeInfo
	 */
	public List<LegNodeDto> getNodeInfo() {
		return nodeInfo;
	}
	/**
	 * @param nodeInfo the nodeInfo to set
	 */
	public void setNodeInfo(List<LegNodeDto> nodeInfo) {
		this.nodeInfo = nodeInfo;
	}
	/**
	 * @return the legActivitiDto
	 */
	public LegActivitiDto getLegActivitiDto() {
		return legActivitiDto;
	}
	/**
	 * @param legActivitiDto the legActivitiDto to set
	 */
	public void setLegActivitiDto(LegActivitiDto legActivitiDto) {
		this.legActivitiDto = legActivitiDto;
	}
	/**
	 * @return the data1
	 */
	public LegContractTmpDto getData1() {
		return data1;
	}
	/**
	 * @param data1 the data1 to set
	 */
	public void setData1(LegContractTmpDto data1) {
		this.data1 = data1;
	}
	/**
	 * @return the proTypes
	 */
	public String[] getProTypes() {
		return proTypes;
	}
	/**
	 * @param proTypes the proTypes to set
	 */
	public void setProTypes(String[] proTypes) {
		this.proTypes = proTypes;
	}
	
}
