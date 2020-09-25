package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author shiyingxin
 * @since 2020-07-27
 */
@TableName("leg_contract_capital")
public class LegContractCapital extends Model<LegContractCapital> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 是否关联基金项目0：是，1：否
     */
    @TableField("if_relation")
    private String ifRelation;
    /**
     * 申请人
     */
    @TableField("apply_man")
    private String applyMan;
    /**
     * 申请人姓名
     */
    @TableField("apply_man_name")
    private String applyManName;
    /**
     * 申请日期
     */
    @TableField("apply_date")
    private String applyDate;
    /**
     * 出资方
     */
    @TableField("contribution_comp")
    private String contributionComp;
    /**
     * 关联项目
     */
    @TableField("relation_project")
    private String relationProject;
    /**
     * 平台小微
     */
    @TableField("platform_mic")
    private String platformMic;
    /**
     * 联系电话
     */
    @TableField("contect_phone")
    private String contectPhone;
    /**
     * 印章类型：0-公章，1-法人章，2-财务章，3-其他
     */
    @TableField("seal_type")
    private String sealType;
    /**
     * 外报单位
     */
    @TableField("out_comp")
    private String outComp;
    /**
     * 用印说明
     */
    @TableField("seal_explain")
    private String sealExplain;
    /**
     * 申请印章
     */
    @TableField("seal_apply")
    private String sealApply;
    /**
     * 流程id
     */
    @TableField("process_id")
    private String processId;
    /**
     * 流程名称
     */
    @TableField("process_name")
    private String processName;
    /**
     * 其它印章
     */
    @TableField("seal_qt")
    private String sealQt;
    @TableField("create_date")
    private Date createDate;
    // 申请时间开始
    @TableField(exist = false)
    private String createDateFrom;

    // 申请时间结束
    @TableField(exist = false)
    private String createDateTo;

    @TableField(exist = false)
    private List<LegContractRelationFile> fileList;//附件

    public List<LegContractRelationFile> getFileList() {
        return fileList;
    }

    public void setFileList(List<LegContractRelationFile> fileList) {
        this.fileList = fileList;
    }

    public String getCreateDateFrom() {
        return createDateFrom;
    }

    public void setCreateDateFrom(String createDateFrom) {
        this.createDateFrom = createDateFrom;
    }

    public String getCreateDateTo() {
        return createDateTo;
    }

    public void setCreateDateTo(String createDateTo) {
        this.createDateTo = createDateTo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIfRelation() {
        return ifRelation;
    }

    public void setIfRelation(String ifRelation) {
        this.ifRelation = ifRelation;
    }

    public String getApplyMan() {
        return applyMan;
    }

    public void setApplyMan(String applyMan) {
        this.applyMan = applyMan;
    }

    public String getApplyManName() {
        return applyManName;
    }

    public void setApplyManName(String applyManName) {
        this.applyManName = applyManName;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getContributionComp() {
        return contributionComp;
    }

    public void setContributionComp(String contributionComp) {
        this.contributionComp = contributionComp;
    }

    public String getRelationProject() {
        return relationProject;
    }

    public void setRelationProject(String relationProject) {
        this.relationProject = relationProject;
    }

    public String getPlatformMic() {
        return platformMic;
    }

    public void setPlatformMic(String platformMic) {
        this.platformMic = platformMic;
    }

    public String getContectPhone() {
        return contectPhone;
    }

    public void setContectPhone(String contectPhone) {
        this.contectPhone = contectPhone;
    }

    public String getSealType() {
        return sealType;
    }

    public void setSealType(String sealType) {
        this.sealType = sealType;
    }

    public String getOutComp() {
        return outComp;
    }

    public void setOutComp(String outComp) {
        this.outComp = outComp;
    }

    public String getSealExplain() {
        return sealExplain;
    }

    public void setSealExplain(String sealExplain) {
        this.sealExplain = sealExplain;
    }

    public String getSealApply() {
        return sealApply;
    }

    public void setSealApply(String sealApply) {
        this.sealApply = sealApply;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getSealQt() {
        return sealQt;
    }

    public void setSealQt(String sealQt) {
        this.sealQt = sealQt;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "LegContractCapital{" +
        "id=" + id +
        ", ifRelation=" + ifRelation +
        ", applyMan=" + applyMan +
        ", applyManName=" + applyManName +
        ", applyDate=" + applyDate +
        ", contributionComp=" + contributionComp +
        ", relationProject=" + relationProject +
        ", platformMic=" + platformMic +
        ", contectPhone=" + contectPhone +
        ", sealType=" + sealType +
        ", outComp=" + outComp +
        ", sealExplain=" + sealExplain +
        ", sealApply=" + sealApply +
        ", processId=" + processId +
        ", processName=" + processName +
        ", sealQt=" + sealQt +
        ", createDate=" + createDate +
        "}";
    }
}
