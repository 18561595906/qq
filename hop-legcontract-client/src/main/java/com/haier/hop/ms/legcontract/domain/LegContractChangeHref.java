package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 合同变更关系表
 * </p>
 *
 * @author shiyingxin
 * @since 2019-11-11
 */
@TableName("leg_contract_change_href")
public class LegContractChangeHref extends Model<LegContractChangeHref> {

    private static final long serialVersionUID = 1L;

    @TableField("BEFORECONTRACT_NO")
    private String beforecontractNo;
    @TableField("AFTERCONTRACT_NO")
    private String aftercontractNo;


    public String getBeforecontractNo() {
        return beforecontractNo;
    }

    public void setBeforecontractNo(String beforecontractNo) {
        this.beforecontractNo = beforecontractNo;
    }

    public String getAftercontractNo() {
        return aftercontractNo;
    }

    public void setAftercontractNo(String aftercontractNo) {
        this.aftercontractNo = aftercontractNo;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegContractChangeHref{" +
        "beforecontractNo=" + beforecontractNo +
        ", aftercontractNo=" + aftercontractNo +
        "}";
    }
}
