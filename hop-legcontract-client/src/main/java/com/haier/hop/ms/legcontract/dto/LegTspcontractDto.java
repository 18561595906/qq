package com.haier.hop.ms.legcontract.dto;

import java.util.List;

import com.haier.hop.ms.legcontract.domain.LegTspcontract;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-25
 */
public class LegTspcontractDto extends LegTspcontract {

	private static final long serialVersionUID = 1L;

	// 合同附件
	public List<LegTspcontractFileDto> contract_file;

	public List<LegTspcontractFileDto> getContract_file() {
		return contract_file;
	}

	public void setContract_file(List<LegTspcontractFileDto> contract_file) {
		this.contract_file = contract_file;
	}

}
