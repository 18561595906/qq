package com.haier.hop.ms.legcontract.dto;

import com.haier.hop.ms.legcontract.domain.LegAttachment;
import com.haier.hop.ms.legcontract.domain.LegEmployee;
import com.haier.hop.ms.legcontract.domain.LegReview;
import com.haier.hop.ms.legcontract.domain.LegSealUse;

import java.util.Date;
import java.util.List;

public class LawSealUseDto {
    private String proId;

    private String taskId;

    /**
     * 申请单编号
     */
    private String applyId;

    /**
     * 申请时间
     */
    private Date applyDate;

    /**
     * 报送机关
     */
    private String outUnit;

    /**
     * 申请人
     */
    private LegEmployee apply;

    /**
     * 印章信息
     */
    private LegSealUse sealAdmin;

    /**
     * 审批信息
     */
    private LegReview review;

    /**
     * 用印详细
     */
    private List<LegSealDetailDto> sealDetail;

    /**
     * 审批文件
     */
    private List<LegAttachment> attachments;
    /**
     * 简要内容说明
     */
    private String desc;

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getOutUnit() {
        return outUnit;
    }

    public void setOutUnit(String outUnit) {
        this.outUnit = outUnit;
    }

    public LegEmployee getApply() {
        return apply;
    }

    public void setApply(LegEmployee apply) {
        this.apply = apply;
    }

    public LegSealUse getSealAdmin() {
        return sealAdmin;
    }

    public void setSealAdmin(LegSealUse sealAdmin) {
        this.sealAdmin = sealAdmin;
    }

    public LegReview getReview() {
        return review;
    }

    public void setReview(LegReview review) {
        this.review = review;
    }

    public List<LegSealDetailDto> getSealDetail() {
        return sealDetail;
    }

    public void setSealDetail(List<LegSealDetailDto> sealDetail) {
        this.sealDetail = sealDetail;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<LegAttachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<LegAttachment> attachments) {
        this.attachments = attachments;
    }
}
