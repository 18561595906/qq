package com.haier.hop.ms.legcontract.dto;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.haier.hop.ms.legcontract.domain.LegCountersign;

public class BaseEntity {
	// 查询律师需要的业务单元数据
	private String someUnit;
	// 会签表list插入
	private List<LegCountersign> LegCountersignList;
	// 流程表中的变量Map
	private Map<String, Object> map;
	// 流程的启动人变量值
	private String startUser;
	// 流程的单一的变量值
	private String keyMap;
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
	// 流程名称
	private String id;
	// 申请人
	private String startUserId;
	// 流程名称
	private String name;
	// 流程描述
	private String description;
	// 执行对象ID
	private String executionId;
	// 任务ID
	private String taskId;
	// 流程实例ID
	private String processInstanceId;
	// bpmn文件名字
	private String resourceName;
	// xml文件名字
	private String diagramResourceName;
	// 部署id
	private String deploymentId;
	// 流程定义ID
	private String processDefinitionId;
	// 流程状态
	private String processStatus;
	// 流程状态
	private String processStatusName;
	// 流程定义key
	private String processDefinitionKey;
	// 流程定义名称
	private String processDefinitionName;
	// 导入流程文件
	private MultipartFile uploadfile;
	// 创建时间
	private String createTime;
	// 任务办理人
	private String assignee;
	// 任务办理人
	private String assigneeName;
	// 任务组办理人
	private String candidateUser;
	// 判断驳回到最初节点还是上一级的flg
	private String rejectKbn;
	// 会签的flg(0：开始流程只更新流程实例id，1：流程实例id和任务id都更新)
	private String signFlg;
	// 审批人ID
	private String assigneeSn;
	/* 更新会签表子段 */
	/* 流程审核表 */
	// 附件的rowid
	private Integer fileRowId;
	// 附件地址
	private String fileUrl;
	// 附件名称
	private String fileName;
	// 是否删除
	private Integer isDelete;
	// 版本号
	private Integer versionNo;
	// 节点ID
	private String nodeId;
	// 审批轮数
	private Integer reviewNumber;
	// 审批意见
	private String reviewDesc;
	// 审批时间
	private Date reviewDate;
	// 节点名称
	private String nodeName;
	// 流程实例id
	private String proId;
	// 审核人编码
	private String reviewSn;
	// 主键
	private Integer rowId;
	// 审批结果
	private String reviewResult;
	// 审批人
	private String reviewUser;
	/* 分页字段 */
	// 当前页数
	private int currentPage;

	// 每页数据条数
	private int pageSize;

	// 当前页第一条
	private int sizeFrist;

	// 当前页最后一条
	private int sizeLast;

	public String getSomeUnit() {
		return someUnit;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public void setSomeUnit(String someUnit) {
		this.someUnit = someUnit;
	}

	public List<LegCountersign> getLegCountersignList() {
		return LegCountersignList;
	}

	public void setLegCountersignList(List<LegCountersign> legCountersignList) {
		LegCountersignList = legCountersignList;
	}

	public int getSizeFrist() {
		return sizeFrist;
	}

	public String getAssigneeName() {
		return assigneeName;
	}

	public void setAssigneeName(String assigneeName) {
		this.assigneeName = assigneeName;
	}

	public void setSizeFrist(int sizeFrist) {
		this.sizeFrist = sizeFrist;
	}

	public int getSizeLast() {
		return sizeLast;
	}

	public void setSizeLast(int sizeLast) {
		this.sizeLast = sizeLast;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public String getStartUser() {
		return startUser;
	}

	public void setStartUser(String startUser) {
		this.startUser = startUser;
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

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getStartUserId() {
		return startUserId;
	}

	public void setStartUserId(String startUserId) {
		this.startUserId = startUserId;
	}

	public String getAssigneeSn() {
		return assigneeSn;
	}

	public void setAssigneeSn(String assigneeSn) {
		this.assigneeSn = assigneeSn;
	}

	public String getSignFlg() {
		return signFlg;
	}

	public void setSignFlg(String signFlg) {
		this.signFlg = signFlg;
	}

	public String getRejectKbn() {
		return rejectKbn;
	}

	public void setRejectKbn(String rejectKbn) {
		this.rejectKbn = rejectKbn;
	}

	public String getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

	public String getProcessStatusName() {
		return processStatusName;
	}

	public void setProcessStatusName(String processStatusName) {
		this.processStatusName = processStatusName;
	}

	public Integer getFileRowId() {
		return fileRowId;
	}

	public void setFileRowId(Integer fileRowId) {
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

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Integer getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(Integer versionNo) {
		this.versionNo = versionNo;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public Integer getReviewNumber() {
		return reviewNumber;
	}

	public void setReviewNumber(Integer reviewNumber) {
		this.reviewNumber = reviewNumber;
	}

	public String getReviewDesc() {
		return reviewDesc;
	}

	public void setReviewDesc(String reviewDesc) {
		this.reviewDesc = reviewDesc;
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
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

	public Integer getRowId() {
		return rowId;
	}

	public void setRowId(Integer rowId) {
		this.rowId = rowId;
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

	public String getCandidateUser() {
		return candidateUser;
	}

	public void setCandidateUser(String candidateUser) {
		this.candidateUser = candidateUser;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getAssignee() {
		return assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public MultipartFile getUploadfile() {
		return uploadfile;
	}

	public void setUploadfile(MultipartFile uploadfile) {
		this.uploadfile = uploadfile;
	}

	public String getDeploymentId() {
		return deploymentId;
	}

	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
	}

	public String getProcessDefinitionId() {
		return processDefinitionId;
	}

	public void setProcessDefinitionId(String processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
	}

	public String getProcessDefinitionKey() {
		return processDefinitionKey;
	}

	public void setProcessDefinitionKey(String processDefinitionKey) {
		this.processDefinitionKey = processDefinitionKey;
	}

	public String getProcessDefinitionName() {
		return processDefinitionName;
	}

	public void setProcessDefinitionName(String processDefinitionName) {
		this.processDefinitionName = processDefinitionName;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getDiagramResourceName() {
		return diagramResourceName;
	}

	public void setDiagramResourceName(String diagramResourceName) {
		this.diagramResourceName = diagramResourceName;
	}

	public String getExecutionId() {
		return executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
