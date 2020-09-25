package com.haier.hop.ms.legcontract.domain;

import lombok.Data;

@Data
public class LegMilepostData {

	private int id;

	// 里程碑名称
	private String name;

	// 计划付款时间 yyyy-MM-dd
	private String payDate;

	// 付款比例 int
	private Integer payRate;

	// 付款金额
	private String payAm;

	// 税比 in（发票比例）
	private Integer taxRate;

	//付款条件（质保金标识）
	private String condition;

	//付款起止时间-开始时间
	private String payStartDate;

	//付款起止时间-结束时间
	private String payEndDate;

	//付款条件文本
	private String conditionText;

	//付款条件参数
	private String conditionParam1;
	private String conditionParam2;

}
