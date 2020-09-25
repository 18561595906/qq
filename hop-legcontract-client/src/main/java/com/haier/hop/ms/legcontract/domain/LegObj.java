package com.haier.hop.ms.legcontract.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 项目支持表
 * </p>
 *
 * @author shiyingxin
 * @since 2019-09-27
 */
@TableName("leg_obj")
public class LegObj extends Model<LegObj> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ROW_ID")
    private BigDecimal rowId;
    /**
     * 流程实例ID
     */
    @TableField("PRO_ID")
    private String proId;
    /**
     * 业务单元（关联字典表(690/1169)）
     */
    @TableField("BUSIN_UNIT")
    private String businUnit;
    /**
     * 模块（关联字典表）
     */
    @TableField("BUSIN_MOUDULE")
    private String businMoudule;
    /**
     * 项目编号
     */
    @TableField("OBJ_NO")
    private String objNo;
    /**
     * 项目名称
     */
    @TableField("OBJ_NAME")
    private String objName;
    /**
     * 项目背景
     */
    @TableField("OBJ_BG")
    private String objBg;
    /**
     * 项目目标
     */
    @TableField("OBJ_TARGET")
    private String objTarget;
    /**
     * 项目负责人编号
     */
    @TableField("OBJ_HEARNO")
    private String objHearno;
    /**
     * 项目负责人
     */
    @TableField("OBJ_HEAD")
    private String objHead;
    /**
     * 项目负责人电话
     */
    @TableField("OBJ_HEAD_TEL")
    private String objHeadTel;
    /**
     * 法务支持事项
     */
    @TableField("SUPPT_ITEM")
    private String supptItem;
    /**
     * 法务接收人编码
     */
    @TableField("OBJ_APPCEPTNO")
    private String objAppceptno;
    /**
     * 法务接收人
     */
    @TableField("OBJ_ACCEPT")
    private String objAccept;
    /**
     * 接收时间
     */
    @TableField("OBJ_ACCEPDATE")
    private Date objAccepdate;
    /**
     * 结束时间
     */
    @TableField("OBJ_ENDDATE")
    private Date objEnddate;
    /**
     * 评价级别（1：好评；2：中评；3：差评；）
     */
    @TableField("EVAL_RUNK")
    private Integer evalRunk;
    /**
     * 评价内容
     */
    @TableField("ENAL_INFO")
    private String enalInfo;
    /**
     * 状态（1：申请；2：暂存；3：已接受；4：支持结束；5：评价结束；）
     */
    @TableField("OBJ_FLAGE")
    private Integer objFlage;
    /**
     * 申请人编码
     */
    @TableField("APPLY_BYNO")
    private String applyByno;
    /**
     * 申请人
     */
    @TableField("APPLY_BY")
    private String applyBy;
    /**
     * 创建时间
     */
    @TableField("CRAETE_DATE")
    private Date craeteDate;
    /**
     * 创建人
     */
    @TableField("UPDATE_BY")
    private String updateBy;
    /**
     * 修改时间
     */
    @TableField("UPDATE_DATE")
    private Date updateDate;
    /**
     * 页面显示参数（启动流程用参数，负责页面显示）
     */
    @TableField("SHOW_PARAM")
    private String showParam;
    /**
     * 项目开始时间
     */
    @TableField("OBJ_BEGIN_DATE")
    private Date objBeginDate;
    /**
     * 项目交易金额（万元）
     */
    @TableField("OBJ_TRADE_MONEY")
    private String objTradeMoney;


    public BigDecimal getRowId() {
        return rowId;
    }

    public void setRowId(BigDecimal rowId) {
        this.rowId = rowId;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getBusinUnit() {
        return businUnit;
    }

    public void setBusinUnit(String businUnit) {
        this.businUnit = businUnit;
    }

    public String getBusinMoudule() {
        return businMoudule;
    }

    public void setBusinMoudule(String businMoudule) {
        this.businMoudule = businMoudule;
    }

    public String getObjNo() {
        return objNo;
    }

    public void setObjNo(String objNo) {
        this.objNo = objNo;
    }

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public String getObjBg() {
        return objBg;
    }

    public void setObjBg(String objBg) {
        this.objBg = objBg;
    }

    public String getObjTarget() {
        return objTarget;
    }

    public void setObjTarget(String objTarget) {
        this.objTarget = objTarget;
    }

    public String getObjHearno() {
        return objHearno;
    }

    public void setObjHearno(String objHearno) {
        this.objHearno = objHearno;
    }

    public String getObjHead() {
        return objHead;
    }

    public void setObjHead(String objHead) {
        this.objHead = objHead;
    }

    public String getObjHeadTel() {
        return objHeadTel;
    }

    public void setObjHeadTel(String objHeadTel) {
        this.objHeadTel = objHeadTel;
    }

    public String getSupptItem() {
        return supptItem;
    }

    public void setSupptItem(String supptItem) {
        this.supptItem = supptItem;
    }

    public String getObjAppceptno() {
        return objAppceptno;
    }

    public void setObjAppceptno(String objAppceptno) {
        this.objAppceptno = objAppceptno;
    }

    public String getObjAccept() {
        return objAccept;
    }

    public void setObjAccept(String objAccept) {
        this.objAccept = objAccept;
    }

    public Date getObjAccepdate() {
        return objAccepdate;
    }

    public void setObjAccepdate(Date objAccepdate) {
        this.objAccepdate = objAccepdate;
    }

    public Date getObjEnddate() {
        return objEnddate;
    }

    public void setObjEnddate(Date objEnddate) {
        this.objEnddate = objEnddate;
    }

    public Integer getEvalRunk() {
        return evalRunk;
    }

    public void setEvalRunk(Integer evalRunk) {
        this.evalRunk = evalRunk;
    }

    public String getEnalInfo() {
        return enalInfo;
    }

    public void setEnalInfo(String enalInfo) {
        this.enalInfo = enalInfo;
    }

    public Integer getObjFlage() {
        return objFlage;
    }

    public void setObjFlage(Integer objFlage) {
        this.objFlage = objFlage;
    }

    public String getApplyByno() {
        return applyByno;
    }

    public void setApplyByno(String applyByno) {
        this.applyByno = applyByno;
    }

    public String getApplyBy() {
        return applyBy;
    }

    public void setApplyBy(String applyBy) {
        this.applyBy = applyBy;
    }

    public Date getCraeteDate() {
        return craeteDate;
    }

    public void setCraeteDate(Date craeteDate) {
        this.craeteDate = craeteDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getShowParam() {
        return showParam;
    }

    public void setShowParam(String showParam) {
        this.showParam = showParam;
    }

    public Date getObjBeginDate() {
        return objBeginDate;
    }

    public void setObjBeginDate(Date objBeginDate) {
        this.objBeginDate = objBeginDate;
    }

    public String getObjTradeMoney() {
        return objTradeMoney;
    }

    public void setObjTradeMoney(String objTradeMoney) {
        this.objTradeMoney = objTradeMoney;
    }

    @Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    @Override
    public String toString() {
        return "LegObj{" +
        "rowId=" + rowId +
        ", proId=" + proId +
        ", businUnit=" + businUnit +
        ", businMoudule=" + businMoudule +
        ", objNo=" + objNo +
        ", objName=" + objName +
        ", objBg=" + objBg +
        ", objTarget=" + objTarget +
        ", objHearno=" + objHearno +
        ", objHead=" + objHead +
        ", objHeadTel=" + objHeadTel +
        ", supptItem=" + supptItem +
        ", objAppceptno=" + objAppceptno +
        ", objAccept=" + objAccept +
        ", objAccepdate=" + objAccepdate +
        ", objEnddate=" + objEnddate +
        ", evalRunk=" + evalRunk +
        ", enalInfo=" + enalInfo +
        ", objFlage=" + objFlage +
        ", applyByno=" + applyByno +
        ", applyBy=" + applyBy +
        ", craeteDate=" + craeteDate +
        ", updateBy=" + updateBy +
        ", updateDate=" + updateDate +
        ", showParam=" + showParam +
        ", objBeginDate=" + objBeginDate +
        ", objTradeMoney=" + objTradeMoney +
        "}";
    }
}
