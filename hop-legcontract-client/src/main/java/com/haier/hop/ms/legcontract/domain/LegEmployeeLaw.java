package com.haier.hop.ms.legcontract.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author xuxu
 * @since 2019-06-26
 */
@TableName("leg_employee_law")
public class LegEmployeeLaw extends Model<LegEmployeeLaw> {

    private static final long serialVersionUID = 1L;

    @TableField("ROW_ID")
    private BigDecimal rowId;
    @TableField("EMP_SN")
    private String empSn;
    @TableField("EMP_NAME")
    private String empName;
    @TableField("EMP_TEL")
    private String empTel;
    @TableField("EMP_PHONE")
    private String empPhone;
    @TableField("EMP_EMAIL")
    private String empEmail;
    @TableField("EMP_IDNO")
    private String empIdno;
    @TableField("FIRST_LINEID")
    private String firstLineid;
    @TableField("FIRST_LINENAME")
    private String firstLinename;
    @TableField("SECOND_LINEID")
    private String secondLineid;
    @TableField("SECOND_LINENAME")
    private String secondLinename;
    @TableField("EMPGROUP_CODE")
    private String empgroupCode;
    @TableField("EMPGROUP_NAME")
    private String empgroupName;
    @TableField("EMPSUBGROUP_CODE")
    private String empsubgroupCode;
    @TableField("EMPSUBGROUP_NAME")
    private String empsubgroupName;
    @TableField("EMPSTATUS_CODE")
    private String empstatusCode;
    @TableField("EMPSTATUS_NAME")
    private String empstatusName;
    @TableField("POSITION_CODE")
    private String positionCode;
    @TableField("POSITION_NAME")
    private String positionName;
    @TableField("DEPARTMENT_CODE")
    private String departmentCode;
    @TableField("DEPARTMENT_NAME")
    private String departmentName;
    @TableField("ORG_CODE")
    private String orgCode;
    @TableField("ORG_NAME")
    private String orgName;
    @TableField("ORGBUFU_CODE")
    private String orgbufuCode;
    @TableField("ORGBUFU_NAME")
    private String orgbufuName;
    @TableField("BAND_CODE")
    private String bandCode;
    @TableField("BAND_NAME")
    private String bandName;
    @TableField("JBM")
    private String jbm;
    @TableField("JYT_CODE")
    private String jytCode;
    @TableField("JYT_NAME")
    private String jytName;
    @TableField("AH_CODE")
    private String ahCode;
    @TableField("AH")
    private String ah;
    @TableField("BUFU_CODE")
    private String bufuCode;
    @TableField("BUFU")
    private String bufu;
    @TableField("GWJYTLB_CODE")
    private String gwjytlbCode;
    @TableField("GWJYTLB")
    private String gwjytlb;
    @TableField("GWJYTJB_CODE")
    private String gwjytjbCode;
    @TableField("GWJYTJB")
    private String gwjytjb;
    @TableField("JYTZBM")
    private String jytzbm;
    @TableField("JYTZXM")
    private String jytzxm;
    @TableField("JYTHR")
    private String jythr;
    @TableField("JYTHR_NAME")
    private String jythrName;
    @TableField("BULXHR")
    private String bulxhr;
    @TableField("BULXHR_NAME")
    private String bulxhrName;
    @TableField("BUHR")
    private String buhr;
    @TableField("BUHR_NAME")
    private String buhrName;
    @TableField("BZ1")
    private String bz1;
    @TableField("TYPE_FLAG")
    private Integer typeFlag;
    @TableField("UPDATE_DATE")
    private Date updateDate;
    @TableField("IDCARDNO")
    private String idcardno;
    @TableField("ACCREDIT_SN")
    private String accreditSn;
    @TableField("ACCREDIT_NAME")
    private String accreditName;


    public BigDecimal getRowId() {
        return rowId;
    }

    public void setRowId(BigDecimal rowId) {
        this.rowId = rowId;
    }

    public String getEmpSn() {
        return empSn;
    }

    public void setEmpSn(String empSn) {
        this.empSn = empSn;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpTel() {
        return empTel;
    }

    public void setEmpTel(String empTel) {
        this.empTel = empTel;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpIdno() {
        return empIdno;
    }

    public void setEmpIdno(String empIdno) {
        this.empIdno = empIdno;
    }

    public String getFirstLineid() {
        return firstLineid;
    }

    public void setFirstLineid(String firstLineid) {
        this.firstLineid = firstLineid;
    }

    public String getFirstLinename() {
        return firstLinename;
    }

    public void setFirstLinename(String firstLinename) {
        this.firstLinename = firstLinename;
    }

    public String getSecondLineid() {
        return secondLineid;
    }

    public void setSecondLineid(String secondLineid) {
        this.secondLineid = secondLineid;
    }

    public String getSecondLinename() {
        return secondLinename;
    }

    public void setSecondLinename(String secondLinename) {
        this.secondLinename = secondLinename;
    }

    public String getEmpgroupCode() {
        return empgroupCode;
    }

    public void setEmpgroupCode(String empgroupCode) {
        this.empgroupCode = empgroupCode;
    }

    public String getEmpgroupName() {
        return empgroupName;
    }

    public void setEmpgroupName(String empgroupName) {
        this.empgroupName = empgroupName;
    }

    public String getEmpsubgroupCode() {
        return empsubgroupCode;
    }

    public void setEmpsubgroupCode(String empsubgroupCode) {
        this.empsubgroupCode = empsubgroupCode;
    }

    public String getEmpsubgroupName() {
        return empsubgroupName;
    }

    public void setEmpsubgroupName(String empsubgroupName) {
        this.empsubgroupName = empsubgroupName;
    }

    public String getEmpstatusCode() {
        return empstatusCode;
    }

    public void setEmpstatusCode(String empstatusCode) {
        this.empstatusCode = empstatusCode;
    }

    public String getEmpstatusName() {
        return empstatusName;
    }

    public void setEmpstatusName(String empstatusName) {
        this.empstatusName = empstatusName;
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgbufuCode() {
        return orgbufuCode;
    }

    public void setOrgbufuCode(String orgbufuCode) {
        this.orgbufuCode = orgbufuCode;
    }

    public String getOrgbufuName() {
        return orgbufuName;
    }

    public void setOrgbufuName(String orgbufuName) {
        this.orgbufuName = orgbufuName;
    }

    public String getBandCode() {
        return bandCode;
    }

    public void setBandCode(String bandCode) {
        this.bandCode = bandCode;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getJbm() {
        return jbm;
    }

    public void setJbm(String jbm) {
        this.jbm = jbm;
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

    public String getAhCode() {
        return ahCode;
    }

    public void setAhCode(String ahCode) {
        this.ahCode = ahCode;
    }

    public String getAh() {
        return ah;
    }

    public void setAh(String ah) {
        this.ah = ah;
    }

    public String getBufuCode() {
        return bufuCode;
    }

    public void setBufuCode(String bufuCode) {
        this.bufuCode = bufuCode;
    }

    public String getBufu() {
        return bufu;
    }

    public void setBufu(String bufu) {
        this.bufu = bufu;
    }

    public String getGwjytlbCode() {
        return gwjytlbCode;
    }

    public void setGwjytlbCode(String gwjytlbCode) {
        this.gwjytlbCode = gwjytlbCode;
    }

    public String getGwjytlb() {
        return gwjytlb;
    }

    public void setGwjytlb(String gwjytlb) {
        this.gwjytlb = gwjytlb;
    }

    public String getGwjytjbCode() {
        return gwjytjbCode;
    }

    public void setGwjytjbCode(String gwjytjbCode) {
        this.gwjytjbCode = gwjytjbCode;
    }

    public String getGwjytjb() {
        return gwjytjb;
    }

    public void setGwjytjb(String gwjytjb) {
        this.gwjytjb = gwjytjb;
    }

    public String getJytzbm() {
        return jytzbm;
    }

    public void setJytzbm(String jytzbm) {
        this.jytzbm = jytzbm;
    }

    public String getJytzxm() {
        return jytzxm;
    }

    public void setJytzxm(String jytzxm) {
        this.jytzxm = jytzxm;
    }

    public String getJythr() {
        return jythr;
    }

    public void setJythr(String jythr) {
        this.jythr = jythr;
    }

    public String getJythrName() {
        return jythrName;
    }

    public void setJythrName(String jythrName) {
        this.jythrName = jythrName;
    }

    public String getBulxhr() {
        return bulxhr;
    }

    public void setBulxhr(String bulxhr) {
        this.bulxhr = bulxhr;
    }

    public String getBulxhrName() {
        return bulxhrName;
    }

    public void setBulxhrName(String bulxhrName) {
        this.bulxhrName = bulxhrName;
    }

    public String getBuhr() {
        return buhr;
    }

    public void setBuhr(String buhr) {
        this.buhr = buhr;
    }

    public String getBuhrName() {
        return buhrName;
    }

    public void setBuhrName(String buhrName) {
        this.buhrName = buhrName;
    }

    public String getBz1() {
        return bz1;
    }

    public void setBz1(String bz1) {
        this.bz1 = bz1;
    }

    public Integer getTypeFlag() {
        return typeFlag;
    }

    public void setTypeFlag(Integer typeFlag) {
        this.typeFlag = typeFlag;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno;
    }

    public String getAccreditSn() {
        return accreditSn;
    }

    public void setAccreditSn(String accreditSn) {
        this.accreditSn = accreditSn;
    }

    public String getAccreditName() {
        return accreditName;
    }

    public void setAccreditName(String accreditName) {
        this.accreditName = accreditName;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegEmployeeLaw{" +
        "rowId=" + rowId +
        ", empSn=" + empSn +
        ", empName=" + empName +
        ", empTel=" + empTel +
        ", empPhone=" + empPhone +
        ", empEmail=" + empEmail +
        ", empIdno=" + empIdno +
        ", firstLineid=" + firstLineid +
        ", firstLinename=" + firstLinename +
        ", secondLineid=" + secondLineid +
        ", secondLinename=" + secondLinename +
        ", empgroupCode=" + empgroupCode +
        ", empgroupName=" + empgroupName +
        ", empsubgroupCode=" + empsubgroupCode +
        ", empsubgroupName=" + empsubgroupName +
        ", empstatusCode=" + empstatusCode +
        ", empstatusName=" + empstatusName +
        ", positionCode=" + positionCode +
        ", positionName=" + positionName +
        ", departmentCode=" + departmentCode +
        ", departmentName=" + departmentName +
        ", orgCode=" + orgCode +
        ", orgName=" + orgName +
        ", orgbufuCode=" + orgbufuCode +
        ", orgbufuName=" + orgbufuName +
        ", bandCode=" + bandCode +
        ", bandName=" + bandName +
        ", jbm=" + jbm +
        ", jytCode=" + jytCode +
        ", jytName=" + jytName +
        ", ahCode=" + ahCode +
        ", ah=" + ah +
        ", bufuCode=" + bufuCode +
        ", bufu=" + bufu +
        ", gwjytlbCode=" + gwjytlbCode +
        ", gwjytlb=" + gwjytlb +
        ", gwjytjbCode=" + gwjytjbCode +
        ", gwjytjb=" + gwjytjb +
        ", jytzbm=" + jytzbm +
        ", jytzxm=" + jytzxm +
        ", jythr=" + jythr +
        ", jythrName=" + jythrName +
        ", bulxhr=" + bulxhr +
        ", bulxhrName=" + bulxhrName +
        ", buhr=" + buhr +
        ", buhrName=" + buhrName +
        ", bz1=" + bz1 +
        ", typeFlag=" + typeFlag +
        ", updateDate=" + updateDate +
        ", idcardno=" + idcardno +
        ", accreditSn=" + accreditSn +
        ", accreditName=" + accreditName +
        "}";
    }
}
