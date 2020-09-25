package com.haier.hop.ms.legcontract.dto;

import java.io.Serializable;

import com.haier.hop.ms.legcontract.domain.LegDictionary;

public class LegDictionaryDto extends LegDictionary implements Serializable {
	private static final long serialVersionUID = 1L;
	/*
	 * 下一级标示0：有下一级1：没有下一级
	 */
	private Integer nextFlag;

	public Integer getNextFlag() {
		return nextFlag;
	}

	public void setNextFlag(Integer nextFlag) {
		this.nextFlag = nextFlag;
	}

}
