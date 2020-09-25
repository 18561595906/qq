package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * VIEW
 * </p>
 *
 * @author shiyingxin
 * @since 2020-04-21
 */
@TableName("v_change_href_buss_new")
public class VChangeHrefBussOld extends Model<VChangeHrefBussOld> {

    private static final long serialVersionUID = 1L;

    @TableField("cont_no")
    private String contNo;
    @TableField("before_contract_no")
    private String beforeContractNo;
    /**
     * 合同编码（生成规则公议时间+流水号）
     */
    @TableField("contract_no_old")
    private String contractNoOld;


    public String getContNo() {
        return contNo;
    }

    public void setContNo(String contNo) {
        this.contNo = contNo;
    }

    public String getBeforeContractNo() {
        return beforeContractNo;
    }

    public void setBeforeContractNo(String beforeContractNo) {
        this.beforeContractNo = beforeContractNo;
    }

    public String getContractNoOld() {
        return contractNoOld;
    }

    public void setContractNoOld(String contractNoOld) {
        this.contractNoOld = contractNoOld;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "VChangeHrefBussNew{" +
        "contNo=" + contNo +
        ", beforeContractNo=" + beforeContractNo +
        ", contractNoOld=" + contractNoOld +
        "}";
    }
}
