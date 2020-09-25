package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 合同到期不提醒（用于合同到期提醒）
 * </p>
 *
 * @author shiyingxin
 * @since 2020-04-02
 */
@TableName("leg_contract_expire_no_remind")
public class LegContractExpireNoRemind extends Model<LegContractExpireNoRemind> {

    private static final long serialVersionUID = 1L;

    /**
     * ID邮件到期不提醒
     */
    @TableField("row_id")
    private String rowId;
    /**
     * 合同流水号
     */
    @TableField("cont_no")
    private String contNo;
    /**
     * 流程ID
     */
    @TableField("proc_id")
    private String procId;
    /**
     * 创建人
     */
    @TableField("create_by_emp_sn")
    private String createByEmpSn;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private String createTime;
    /**
     * 创建人姓名
     */
    @TableField("create_by_emp_name")
    private String createByEmpName;
    /**
     * 请求头信息
     */
    private String agent;
    /**
     * IP
     */
    private String ip;


    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getContNo() {
        return contNo;
    }

    public void setContNo(String contNo) {
        this.contNo = contNo;
    }

    public String getProcId() {
        return procId;
    }

    public void setProcId(String procId) {
        this.procId = procId;
    }

    public String getCreateByEmpSn() {
        return createByEmpSn;
    }

    public void setCreateByEmpSn(String createByEmpSn) {
        this.createByEmpSn = createByEmpSn;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateByEmpName() {
        return createByEmpName;
    }

    public void setCreateByEmpName(String createByEmpName) {
        this.createByEmpName = createByEmpName;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegContractExpireNoRemind{" +
        "rowId=" + rowId +
        ", contNo=" + contNo +
        ", procId=" + procId +
        ", createByEmpSn=" + createByEmpSn +
        ", createTime=" + createTime +
        ", createByEmpName=" + createByEmpName +
        ", agent=" + agent +
        ", ip=" + ip +
        "}";
    }
}
