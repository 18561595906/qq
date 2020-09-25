package com.haier.hop.ms.legcontract.dto;

import java.util.List;

/**
 * <p>
 * 会签表
 * </p>
 *
 * @author xuejinxin
 * @since 2019-06-10
 */
public class CountersignDto {
	/**
	 * 流程Id
	 */
	private String procId;

	/**
	 * 流程定义Id流程定义的key+版本+随机生成数
	 */
	private String processDefinitionId;

	/**
	 * 节点名称
	 */
	private String nodeName;

	private List<LegCountersignDto> legCountersignDtos;

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public List<LegCountersignDto> getLegCountersignDtos() {
		return legCountersignDtos;
	}

	public void setLegCountersignDtos(List<LegCountersignDto> legCountersignDtos) {
		this.legCountersignDtos = legCountersignDtos;
	}

	public String getProcId() {
		return procId;
	}

	public void setProcId(String procId) {
		this.procId = procId;
	}

	public String getProcessDefinitionId() {
		return processDefinitionId;
	}

	public void setProcessDefinitionId(String processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
	}

}
