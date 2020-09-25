package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author xuejinxin
 * @since 2019-10-31
 */
@TableName("leg_partners_4v")
public class LegPartners4v extends Model<LegPartners4v> {

    private static final long serialVersionUID = 1L;

    @TableField("CODE")
    private String code;
    @TableField("NAME")
    private String name;
    @TableField("PHONE")
    private String phone;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegPartners4v{" +
        "code=" + code +
        ", name=" + name +
        ", phone=" + phone +
        "}";
    }
}
