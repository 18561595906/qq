package com.haier.hop.ms.legcontract.dto;

import java.util.List;
import java.util.Map;

import com.haier.hop.ms.legcontract.domain.ActProcInfo;
import com.haier.hop.ms.legcontract.domain.LegAttachment;
import com.haier.hop.ms.legcontract.domain.LegCountersign;
import com.haier.hop.ms.legcontract.domain.LegCountersignTmp;
import com.haier.hop.ms.legcontract.domain.LegReview;
import com.haier.hop.ms.legcontract.domain.LegSealUse;

public class LegActivitiDto {
	// 驳回会签数据需要保留的taskKey
	private String notTaskey;
	// 任务表状态
	private Integer states;
	// 流程详细信息
	private ActProcInfo actProcInfo;
	// 公议节点同意走向的变量
	private String trueKey;
	// 公议节点通过走向的变量
	private String falseKey;
	// 判断驳回后最多可以跳转到哪一步（节点名称）
	private String activitiName;
	// 判断当前流程是都有重大改动
	private String flowFlg;
	// 判断当前公议是不是互斥
	private String mutexTask;
	// 查询律师需要的业务单元数据
	private String someUnit;
	// 会签表list插入
	private List<LegReview> legReviewList;
	// 会签表list插入
	private List<LegCountersign> legCountersignList;
	// 附加表list插入
	private List<LegAttachment> LegAttachmentList;
	// 会签临时表list插入
	private List<LegCountersignTmp> legCountersignTmpList;
	// 流程表中的变量Map
	private Map<String, Object> map;
	// 公议节点用的变量map
	private Map<String, Object> singeMap;
	// 流程的启动人变量值
	private String startUser;
	// 流程的单一的变量值
	private String keyMap;
	// 流程的单一的变量值
	private String falseKeyMap;
	// 流程的单一的设置值
	private String valueMap;
	// 流程的公议人变量值
	private String keyMapList;
	// 流程的公议人设置值
	private String valueMapList;
	// 流程的抢单的变量值
	private String keyMapArr;
	// 流程的抢单的设置值
	private String valueMapArr;
	// 申请人
	private String startUserId;
	// 任务ID
	private String taskId;
	// 任务主键
	private String taskKey;
	// 流程实例ID
	private String processInstanceId;
	// 流程定义key
	private String processDefinitionKey;
	// 任务办理人
	private String assignee;
	// 任务办理人
	private String assigneeName;
	// 判断当前是不是驳回后提交(0:没有，1：有)
	private String rejectKbn;

	/* 更新会签表子段 */
	// 审批结论 1：同意 0：不同意 2:非公议人-1：未公议
	// 会签表list更新 内部有三个字段 nodeId ,result,notReview
	private List<LegCountersign> legCountersignUpdateList;

	/* 流程审核表 */
	// 附件的rowid
	private String fileRowId;
	// 附件地址
	private String fileUrl;
	// 附件名称
	private String fileName;
	// 节点ID
	private String nodeId;
	// 审批意见
	private String reviewDesc;
	// 节点名称
	private String nodeName;
	// 流程实例id
	private String proId;
	// 审核人编码
	private String reviewSn;
	// 审批结果
	private String reviewResult;
	// 审批人
	private String reviewUser;
	// 自动通过的节点list
	private List<String> autoList;
	// 合同电子用印实体类
	private List<LegSealUse> legSealUses;

	public List<LegSealUse> getLegSealUses() {
		return legSealUses;
	}

	public void setLegSealUses(List<LegSealUse> legSealUses) {
		this.legSealUses = legSealUses;
	}

	public List<String> getAutoList() {
		return autoList;
	}

	public void setAutoList(List<String> autoList) {
		this.autoList = autoList;
	}

	public ActProcInfo getActProcInfo() {
		return actProcInfo;
	}

	public void setActProcInfo(ActProcInfo actProcInfo) {
		this.actProcInfo = actProcInfo;
	}

	public String getTrueKey() {
		return trueKey;
	}

	public String getTaskKey() {
		return taskKey;
	}

	public void setTaskKey(String taskKey) {
		this.taskKey = taskKey;
	}

	public String getFalseKeyMap() {
		return falseKeyMap;
	}

	public void setFalseKeyMap(String falseKeyMap) {
		this.falseKeyMap = falseKeyMap;
	}

	public Integer getStates() {
		return states;
	}

	public void setStates(Integer states) {
		this.states = states;
	}

	public String getNotTaskey() {
		return notTaskey;
	}

	public void setNotTaskey(String notTaskey) {
		this.notTaskey = notTaskey;
	}

	public void setTrueKey(String trueKey) {
		this.trueKey = trueKey;
	}

	public String getFalseKey() {
		return falseKey;
	}

	public List<LegReview> getLegReviewList() {
		return legReviewList;
	}

	public void setLegReviewList(List<LegReview> legReviewList) {
		this.legReviewList = legReviewList;
	}

	public void setFalseKey(String falseKey) {
		this.falseKey = falseKey;
	}

	public String getFlowFlg() {
		return flowFlg;
	}

	public Map<String, Object> getSingeMap() {
		return singeMap;
	}

	public void setSingeMap(Map<String, Object> singeMap) {
		this.singeMap = singeMap;
	}

	public String getMutexTask() {
		return mutexTask;
	}

	public List<LegAttachment> getLegAttachmentList() {
		return LegAttachmentList;
	}

	public void setLegAttachmentList(List<LegAttachment> legAttachmentList) {
		LegAttachmentList = legAttachmentList;
	}

	public void setMutexTask(String mutexTask) {
		this.mutexTask = mutexTask;
	}

	public void setFlowFlg(String flowFlg) {
		this.flowFlg = flowFlg;
	}

	public String getActivitiName() {
		return activitiName;
	}

	public void setActivitiName(String activitiName) {
		this.activitiName = activitiName;
	}

	public String getSomeUnit() {
		return someUnit;
	}

	public String getAssigneeName() {
		return assigneeName;
	}

	public void setAssigneeName(String assigneeName) {
		this.assigneeName = assigneeName;
	}

	public void setSomeUnit(String someUnit) {
		this.someUnit = someUnit;
	}

	public List<LegCountersign> getLegCountersignList() {
		return legCountersignList;
	}

	public void setLegCountersignList(List<LegCountersign> legCountersignList) {
		this.legCountersignList = legCountersignList;
	}

	public List<LegCountersignTmp> getLegCountersignTmpList() {
		return legCountersignTmpList;
	}

	public void setLegCountersignTmpList(List<LegCountersignTmp> legCountersignTmpList) {
		this.legCountersignTmpList = legCountersignTmpList;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public String getStartUser() {
		return startUser;
	}

	public void setStartUser(String startUser) {
		this.startUser = startUser;
	}

	public String getKeyMap() {
		return keyMap;
	}

	public void setKeyMap(String keyMap) {
		this.keyMap = keyMap;
	}

	public String getValueMap() {
		return valueMap;
	}

	public void setValueMap(String valueMap) {
		this.valueMap = valueMap;
	}

	public String getKeyMapList() {
		return keyMapList;
	}

	public void setKeyMapList(String keyMapList) {
		this.keyMapList = keyMapList;
	}

	public String getValueMapList() {
		return valueMapList;
	}

	public void setValueMapList(String valueMapList) {
		this.valueMapList = valueMapList;
	}

	public String getKeyMapArr() {
		return keyMapArr;
	}

	public void setKeyMapArr(String keyMapArr) {
		this.keyMapArr = keyMapArr;
	}

	public String getValueMapArr() {
		return valueMapArr;
	}

	public void setValueMapArr(String valueMapArr) {
		this.valueMapArr = valueMapArr;
	}

	public String getStartUserId() {
		return startUserId;
	}

	public void setStartUserId(String startUserId) {
		this.startUserId = startUserId;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getProcessDefinitionKey() {
		return processDefinitionKey;
	}

	public void setProcessDefinitionKey(String processDefinitionKey) {
		this.processDefinitionKey = processDefinitionKey;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public List<LegCountersign> getLegCountersignUpdateList() {
		return legCountersignUpdateList;
	}

	public void setLegCountersignUpdateList(List<LegCountersign> legCountersignUpdateList) {
		this.legCountersignUpdateList = legCountersignUpdateList;
	}

	public String getFileRowId() {
		return fileRowId;
	}

	public void setFileRowId(String fileRowId) {
		this.fileRowId = fileRowId;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getReviewDesc() {
		return reviewDesc;
	}

	public void setReviewDesc(String reviewDesc) {
		this.reviewDesc = reviewDesc;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getProId() {
		return proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}

	public String getReviewSn() {
		return reviewSn;
	}

	public void setReviewSn(String reviewSn) {
		this.reviewSn = reviewSn;
	}

	public String getReviewResult() {
		return reviewResult;
	}

	public void setReviewResult(String reviewResult) {
		this.reviewResult = reviewResult;
	}

	public String getReviewUser() {
		return reviewUser;
	}

	public void setReviewUser(String reviewUser) {
		this.reviewUser = reviewUser;
	}

	public String getRejectKbn() {
		return rejectKbn;
	}

	public void setRejectKbn(String rejectKbn) {
		this.rejectKbn = rejectKbn;
	}

}
