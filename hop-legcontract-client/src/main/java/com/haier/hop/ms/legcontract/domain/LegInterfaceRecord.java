package com.haier.hop.ms.legcontract.domain;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 接口调用记录表
 * </p>
 *
 * @author wdh
 * @since 2019-08-14
 */
@TableName("leg_interface_record")
public class LegInterfaceRecord extends Model<LegInterfaceRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId("row_id")
    private String rowId;
    /**
     * 接口参数
     */
    private String parameters;
    /**
     * 接口返回值
     */
    private String result;
    /**
     * 接口名称
     */
    @TableField("interface_name")
    private String interfaceName;
    /**
     * 调用类名
     */
    private String clas;
    /**
     * 调用方法名
     */
    private String methods;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 创建人
     */
    @TableField("create_by")
    private String createBy;
    /**
     * 创建人姓名
     */
    @TableField("create_by_name")
    private String createByName;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getMethods() {
        return methods;
    }

    public void setMethods(String methods) {
        this.methods = methods;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateByName() {
        return createByName;
    }

    public void setCreateByName(String createByName) {
        this.createByName = createByName;
    }

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegInterfaceRecord{" +
        "rowId=" + rowId +
        ", parameters=" + parameters +
        ", result=" + result +
        ", interfaceName=" + interfaceName +
        ", clas=" + clas +
        ", methods=" + methods +
        ", createTime=" + createTime +
        ", createBy=" + createBy +
        ", createByName=" + createByName +
        "}";
    }
}
