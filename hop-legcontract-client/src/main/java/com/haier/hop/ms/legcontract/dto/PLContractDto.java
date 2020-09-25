package com.haier.hop.ms.legcontract.dto;

import com.haier.hop.ms.legcontract.domain.LegEmployee;
import com.haier.hop.ms.legcontract.domain.LegSealDetail;

import java.util.List;

public class PLContractDto {
    /**
     * 线上线下用印 线上用印 = "1"; 线下用印 = "0";
     */
    private String sealType;

    public String getYyjia() {
        return yyjia;
    }

    public void setYyjia(String yyjia) {
        this.yyjia = yyjia;
    }

    public String getYyyi() {
        return yyyi;
    }

    public void setYyyi(String yyyi) {
        this.yyyi = yyyi;
    }

    /**
     * 用印申请人
     */
    private LegEmployee emp;

    /**
     * 甲方用印顺序 数字即为顺序 线下用印时则为我方是否先用印 1：是，2：否
     */
    private String yyjia;

    /**
     * 乙方用印顺序
     */
    private String yyyi;

    /**
     * 用印初审审批人
     */
    private List<LegEmployee> csreview;

    /**
     * 印章使用信息
     */
    private List<LegSealUseInfoDto> sealUseInfo;

    /**
     * 用印明细信息 线下用印时有
     */
    private List<LegSealDetail> sealDetailInfo;

    public String getSealType() {
        return sealType;
    }

    public void setSealType(String sealType) {
        this.sealType = sealType;
    }

    public LegEmployee getEmp() {
        return emp;
    }

    public void setEmp(LegEmployee emp) {
        this.emp = emp;
    }

    public List<LegEmployee> getCsreview() {
        return csreview;
    }

    public void setCsreview(List<LegEmployee> csreview) {
        this.csreview = csreview;
    }

    public List<LegSealUseInfoDto> getSealUseInfo() {
        return sealUseInfo;
    }

    public void setSealUseInfo(List<LegSealUseInfoDto> sealUseInfo) {
        this.sealUseInfo = sealUseInfo;
    }

    public List<LegSealDetail> getSealDetailInfo() {
        return sealDetailInfo;
    }

    public void setSealDetailInfo(List<LegSealDetail> sealDetailInfo) {
        this.sealDetailInfo = sealDetailInfo;
    }
}
