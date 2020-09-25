package com.haier.hop.ms.legcontract.dto;

import java.util.List;

import com.haier.hop.ms.legcontract.domain.LegContractFavorites;
import com.haier.hop.ms.legcontract.domain.LegDictionary;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2019-06-25
 */
public class LegContractCodeDto {
	/**
	 * 合同名称
	 */
	private List<LegDictionary> contractNameList;

	/**
	 * 收藏的合同
	 */
	private List<LegContractFavorites> collectionContractList;

	/**
	 * 可能提报的合同
	 */
	private List<LegDictionary> mayDeclaredContract;

	public List<LegDictionary> getContractNameList() {
		return contractNameList;
	}

	public void setContractNameList(List<LegDictionary> contractNameList) {
		this.contractNameList = contractNameList;
	}

	public List<LegContractFavorites> getCollectionContractList() {
		return collectionContractList;
	}

	public void setCollectionContractList(List<LegContractFavorites> collectionContractList) {
		this.collectionContractList = collectionContractList;
	}

	public List<LegDictionary> getMayDeclaredContract() {
		return mayDeclaredContract;
	}

	public void setMayDeclaredContract(List<LegDictionary> mayDeclaredContract) {
		this.mayDeclaredContract = mayDeclaredContract;
	}

}
