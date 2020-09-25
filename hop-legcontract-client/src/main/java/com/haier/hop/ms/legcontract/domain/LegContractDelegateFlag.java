package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 是否启用平台长授权闸口表
 * </p>
 *
 * @author shiyingxin
 * @since 2019-09-20
 */
@TableName("leg_contract_delegate_flag")
public class LegContractDelegateFlag extends Model<LegContractDelegateFlag> {

    private static final long serialVersionUID = 1L;

    /**
     * 1不授权2可以授权
     */
    @TableField("FLAG")
    private String flag;


    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegContractDelegateFlag{" +
        "flag=" + flag +
        "}";
    }
}
