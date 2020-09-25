package com.haier.hop.ms.legcontract.dto;

import com.haier.hop.ms.legcontract.domain.LegAttachment;
import com.haier.hop.ms.legcontract.domain.LegEmployee;
import com.haier.hop.ms.legcontract.domain.LegEmployeeAccredit;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class UseSealDto {
    private String proId;
    private String taskId;
    /**
     * 是否上传用印明细
     */
    private boolean upfile;
    /**
     * 当前用户
     */
    private LegEmployeeAccredit applyUser;
    /**
     * 申请编号
     */
    private String applyNo;
    /**
     * 申请日期
     */
    private Date applyDate;
    /** 
     * 用印说明
     */
    private String descript;
    /** 
     * 外报单位
     */
    private String outsideUnit;
    /** 
     * 业务单元
     */
    private String unitCode;
    /** 
     * 业务单元名
     */
    private String unitName;
    /** 
     * 用印文件类型
     */
    private String fileType;
    /** 
     * 用印编号
     */
    private String sealId;
    /** 
     * 印章名称
     */
    private String sealName;
    /** 
     * 印章所属公司
     */
    private String sealCom;
    /** 
     * 印章所属公司编号
     */
    private String sealComno;
    /** 
     * 印章管理员工号
     */
    private String sealAdminSn;
    /** 
     * 印章管理员
     */
    private String sealAdmin;
    /** 
     * 印章类型
     */
    private String sealType;
    /** 
     * 担保限制
     */
    private String restrLimit;
    /** 
     * 用印文件
     */
    private List<UseSealFile> file;
    /** 
     * 归档资料
     */
    private List<LegAttachment> attachments;
    /** 
     * 节点审批人
     */
    private List<UseSealNode> nodes;
    /** 
     *终审领导工号
     */
    private String finalLeader;
    /** 
     * 终审领导
     */
    private String finalLeaderName;

    /**
     * 是否特殊流程
     */
    private boolean isSpecial;

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public boolean isSpecial() {
        return isSpecial;
    }

    public void setSpecial(boolean special) {
        isSpecial = special;
    }

    public boolean isUpfile() {
        return upfile;
    }

    public void setUpfile(boolean upfile) {
        this.upfile = upfile;
    }

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

    public LegEmployeeAccredit getApplyUser() {
        return applyUser;
    }

    public void setApplyUser(LegEmployeeAccredit applyUser) {
        this.applyUser = applyUser;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public String getOutsideUnit() {
        return outsideUnit;
    }

    public void setOutsideUnit(String outsideUnit) {
        this.outsideUnit = outsideUnit;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fielType) {
        this.fileType = fielType;
    }

    public String getSealId() {
        return sealId;
    }

    public void setSealId(String sealId) {
        this.sealId = sealId;
    }

    public String getSealName() {
        return sealName;
    }

    public void setSealName(String sealName) {
        this.sealName = sealName;
    }

    public String getSealCom() {
        return sealCom;
    }

    public void setSealCom(String sealCom) {
        this.sealCom = sealCom;
    }

    public String getSealComno() {
        return sealComno;
    }

    public void setSealComno(String sealComno) {
        this.sealComno = sealComno;
    }


    public String getSealAdminSn() {
        return sealAdminSn;
    }

    public void setSealAdminSn(String sealAdminSn) {
        this.sealAdminSn = sealAdminSn;
    }

    public String getSealAdmin() {
        return sealAdmin;
    }

    public void setSealAdmin(String sealAdmin) {
        this.sealAdmin = sealAdmin;
    }

    public String getSealType() {
        return sealType;
    }

    public void setSealType(String sealType) {
        this.sealType = sealType;
    }

    public String getRestrLimit() {
        return restrLimit;
    }

    public void setRestrLimit(String restrLimit) {
        this.restrLimit = restrLimit;
    }

    public List<UseSealFile> getFile() {
        return file;
    }

    public void setFile(List<UseSealFile> file) {
        this.file = file;
    }

    public List<LegAttachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<LegAttachment> attachments) {
        this.attachments = attachments;
    }

    public List<UseSealNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<UseSealNode> nodes) {
        this.nodes = nodes;
    }

    public String getFinalLeader() {
        return finalLeader;
    }

    public void setFinalLeader(String finalLeader) {
        this.finalLeader = finalLeader;
    }

    public String getFinalLeaderName() {
        return finalLeaderName;
    }

    public void setFinalLeaderName(String finalLeaderName) {
        this.finalLeaderName = finalLeaderName;
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public boolean getIsSpecial() {
        return isSpecial;
    }

    public void setIsSpecial(boolean isSpecial) {
        this.isSpecial = isSpecial;
    }
}
