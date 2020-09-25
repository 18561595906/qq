package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 合同到期提醒新增邮件发送人
 * </p>
 *
 * @author shiyingxin
 * @since 2020-04-02
 */
@TableName("leg_contract_email_remind")
public class LegContractEmailRemind extends Model<LegContractEmailRemind> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableField("row_id")
    private String rowId;
    /**
     * 业务单元
     */
    @TableField("biz_code")
    private String bizCode;
    /**
     * 合同类型
     */
    @TableField("contract_type")
    private String contractType;
    /**
     * 被提醒人
     */
    @TableField("reminded_people")
    private String remindedPeople;
    /**
     * 有效无效标志1为有效
     */
    private String flag;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private String createTime;
    /**
     * 创建人编码
     */
    @TableField("create_by_emp_sn")
    private String createByEmpSn;
    /**
     * 创建人姓名
     */
    @TableField("create_by_emp_name")
    private String createByEmpName;
    /**
     * 最后修改人姓名
     */
    @TableField("last_modification_by_emp_name")
    private String lastModificationByEmpName;
    /**
     * 最后修改时间
     */
    @TableField("last_modification_date")
    private String lastModificationDate;
    /**
     * 最后修改人编码
     */
    @TableField("last_modification_by_emp_sn")
    private String lastModificationByEmpSn;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getBizCode() {
        return bizCode;
    }

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getRemindedPeople() {
        return remindedPeople;
    }

    public void setRemindedPeople(String remindedPeople) {
        this.remindedPeople = remindedPeople;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateByEmpSn() {
        return createByEmpSn;
    }

    public void setCreateByEmpSn(String createByEmpSn) {
        this.createByEmpSn = createByEmpSn;
    }

    public String getCreateByEmpName() {
        return createByEmpName;
    }

    public void setCreateByEmpName(String createByEmpName) {
        this.createByEmpName = createByEmpName;
    }

    public String getLastModificationByEmpName() {
        return lastModificationByEmpName;
    }

    public void setLastModificationByEmpName(String lastModificationByEmpName) {
        this.lastModificationByEmpName = lastModificationByEmpName;
    }

    public String getLastModificationDate() {
        return lastModificationDate;
    }

    public void setLastModificationDate(String lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }

    public String getLastModificationByEmpSn() {
        return lastModificationByEmpSn;
    }

    public void setLastModificationByEmpSn(String lastModificationByEmpSn) {
        this.lastModificationByEmpSn = lastModificationByEmpSn;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegContractEmailRemind{" +
        "rowId=" + rowId +
        ", bizCode=" + bizCode +
        ", contractType=" + contractType +
        ", remindedPeople=" + remindedPeople +
        ", flag=" + flag +
        ", createTime=" + createTime +
        ", createByEmpSn=" + createByEmpSn +
        ", createByEmpName=" + createByEmpName +
        ", lastModificationByEmpName=" + lastModificationByEmpName +
        ", lastModificationDate=" + lastModificationDate +
        ", lastModificationByEmpSn=" + lastModificationByEmpSn +
        "}";
    }
}
