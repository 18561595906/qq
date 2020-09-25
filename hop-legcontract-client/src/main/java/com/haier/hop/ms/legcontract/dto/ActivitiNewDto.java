package com.haier.hop.ms.legcontract.dto;

import java.util.List;
import java.util.Map;

import com.haier.hop.ms.legcontract.domain.ActProcInfo;
import com.haier.hop.ms.legcontract.domain.LegCountersign;
import com.haier.hop.ms.legcontract.domain.LegCountersignTmp;
import com.haier.hop.ms.legcontract.domain.LegSealUse;

public class ActivitiNewDto {
	// 流程详细信息（流程启动用）
	private ActProcInfo actProcInfo;
	// 流程定义key（流程启动用）
	private String processDefinitionKey;
	// 任务ID（办理任务时用）
	private String taskId;
	// 审批结果(0:不通过 1：通过 2：非公议人（属于不通过的一种情况） 办理任务时用 )
	private String result;
	// 审批结果（办理任务时用）
	private String reviewResult;
	// 审批意见（办理任务时用）
	private String reviewDesc;
	// / 下一步会签数据从临时会签取值用的taskKey（下一步是并联公议用）
	private String signKey;
	// / 下一步会签数据从临时会签取值用的taskKey（下一步是并联公议用驳回）
	private String signFalseKey;
	/// 下一步会签数据直接插入（下一步是并联公议用）
	private List<LegCountersign> signList;
	// 临时会签全部删除区分（驳回用）
	private String counTmpDeleteFlg;
	// 驳回会签数据需要保留的taskKey（驳回用）
	private String notTaskey;
	// 公议节点同意正向走向的变量（并联公议全部审批后才通过用）
	private String trueKey;
	// 公议节点通过逆向走向的变量（并联公议全部审批后才通过用）
	private String falseKey;
	// 会签临时表list插入
	private List<LegCountersignTmp> signTmpList;
	// 流程表中的变量Map
	private Map<String, Object> map;
	// 合同电子用印实体类（合同用）
	private List<LegSealUse> legSealUses;
	
	
	//流程号
    private String procId;
    //审核人编码
    private String checkerCode;
    //审核人姓名
    private String checkerName;

	public ActProcInfo getActProcInfo() {
		return actProcInfo;
	}

	public void setActProcInfo(ActProcInfo actProcInfo) {
		this.actProcInfo = actProcInfo;
	}

	public String getSignFalseKey() {
		return signFalseKey;
	}

	public void setSignFalseKey(String signFalseKey) {
		this.signFalseKey = signFalseKey;
	}

	public String getProcessDefinitionKey() {
		return processDefinitionKey;
	}

	public void setProcessDefinitionKey(String processDefinitionKey) {
		this.processDefinitionKey = processDefinitionKey;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getReviewResult() {
		return reviewResult;
	}

	public void setReviewResult(String reviewResult) {
		this.reviewResult = reviewResult;
	}

	public String getReviewDesc() {
		return reviewDesc;
	}

	public void setReviewDesc(String reviewDesc) {
		this.reviewDesc = reviewDesc;
	}

	public String getSignKey() {
		return signKey;
	}

	public void setSignKey(String signKey) {
		this.signKey = signKey;
	}

	public List<LegCountersign> getSignList() {
		return signList;
	}

	public void setSignList(List<LegCountersign> signList) {
		this.signList = signList;
	}

	public String getCounTmpDeleteFlg() {
		return counTmpDeleteFlg;
	}

	public void setCounTmpDeleteFlg(String counTmpDeleteFlg) {
		this.counTmpDeleteFlg = counTmpDeleteFlg;
	}

	public String getNotTaskey() {
		return notTaskey;
	}

	public void setNotTaskey(String notTaskey) {
		this.notTaskey = notTaskey;
	}

	public String getTrueKey() {
		return trueKey;
	}

	public void setTrueKey(String trueKey) {
		this.trueKey = trueKey;
	}

	public String getFalseKey() {
		return falseKey;
	}

	public void setFalseKey(String falseKey) {
		this.falseKey = falseKey;
	}

	public List<LegCountersignTmp> getSignTmpList() {
		return signTmpList;
	}

	public void setSignTmpList(List<LegCountersignTmp> signTmpList) {
		this.signTmpList = signTmpList;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public List<LegSealUse> getLegSealUses() {
		return legSealUses;
	}

	public void setLegSealUses(List<LegSealUse> legSealUses) {
		this.legSealUses = legSealUses;
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
	 * @return the checkerCode
	 */
	public String getCheckerCode() {
		return checkerCode;
	}

	/**
	 * @param checkerCode the checkerCode to set
	 */
	public void setCheckerCode(String checkerCode) {
		this.checkerCode = checkerCode;
	}

	/**
	 * @return the checkerName
	 */
	public String getCheckerName() {
		return checkerName;
	}

	/**
	 * @param checkerName the checkerName to set
	 */
	public void setCheckerName(String checkerName) {
		this.checkerName = checkerName;
	}

}
