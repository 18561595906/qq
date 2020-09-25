package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 直接采购文件回传
 * </p>
 *
 * @author liugan
 * @since 2020-06-12
 */
@TableName("leg_contract_return")
public class LegContractReturn extends Model<LegContractReturn> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ROW_ID")
    private String rowId;
    /**
     * 回传类型
     */
    @TableField("TYPE")
    private String type;
    /**
     * 回传内容
     */
    @TableField("RETURN_VALUE")
    private String returnValue;
    /**
     * 回传标志位 0:未回传，1:已回传
     */
    @TableField("RETURN_FLG")
    private String returnFlg;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(String returnValue) {
        this.returnValue = returnValue;
    }

    public String getReturnFlg() {
        return returnFlg;
    }

    public void setReturnFlg(String returnFlg) {
        this.returnFlg = returnFlg;
    }

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegContractReturn{" +
        "rowId=" + rowId +
        ", type=" + type +
        ", returnValue=" + returnValue +
        ", returnFlg=" + returnFlg +
        "}";
    }
}
