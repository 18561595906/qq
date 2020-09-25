package com.haier.hop.ms.legcontractown.domain;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 海外客户信息表
 * </p>
 *
 * @author xuejinxin
 * @since 2020-04-16
 */
@TableName("leg_overseas_customer")
public class LegOverseasCustomer extends Model<LegOverseasCustomer> {

    private static final long serialVersionUID = 1L;

    /**
     * 客户编码
     */
    @TableId("CUSTOMER_CODE")
    private String customerCode;
    /**
     * 客户名称
     */
    @TableField("CUSTOMER_NAME")
    private String customerName;
    /**
     * 大区编码
     */
    @TableField("REGION_CODE")
    private String regionCode;
    /**
     * 大区名称
     */
    @TableField("REGION_NAME")
    private String regionName;
    /**
     * 小微编码
     */
    @TableField("JYT_CODE")
    private String jytCode;
    /**
     * 小微名称
     */
    @TableField("JYT_NAME")
    private String jytName;
    /**
     * 更新时间
     */
    @TableField("UPDATE_TIME")
    private Date updateTime;


    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getJytCode() {
        return jytCode;
    }

    public void setJytCode(String jytCode) {
        this.jytCode = jytCode;
    }

    public String getJytName() {
        return jytName;
    }

    public void setJytName(String jytName) {
        this.jytName = jytName;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.customerCode;
    }

    @Override
    public String toString() {
        return "LegOverseasCustomer{" +
        "customerCode=" + customerCode +
        ", customerName=" + customerName +
        ", regionCode=" + regionCode +
        ", regionName=" + regionName +
        ", jytCode=" + jytCode +
        ", jytName=" + jytName +
        ", updateTime=" + updateTime +
        "}";
    }
}
