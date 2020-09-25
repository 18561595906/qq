package com.haier.hop.ms.legcontract.domain;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lixianhua
 * @since 2019-06-26
 */
@TableName("leg_user_photo")
public class LegUserPhoto extends Model<LegUserPhoto> {

    private static final long serialVersionUID = 1L;

    /**
     * 员工工号
     */
    @TableId("EMP_SN")
    private String empSn;
    /**
     * 上传时间
     */
    @TableField("UPLOAD_TIME")
    private Date uploadTime;
    /**
     * 图片文件
     */
    @TableField("EMP_SIGNATURE")
    private byte[] empSignature;
    /**
     * 文件扩展名
     */
    @TableField("EXTENSION")
    private String extension;


    public String getEmpSn() {
        return empSn;
    }

    public void setEmpSn(String empSn) {
        this.empSn = empSn;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public byte[] getEmpSignature() {
        return empSignature;
    }

    public void setEmpSignature(byte[] empSignature) {
        this.empSignature = empSignature;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    protected Serializable pkVal() {
        return this.empSn;
    }

    @Override
    public String toString() {
        return "LegUserPhoto{" +
        "empSn=" + empSn +
        ", uploadTime=" + uploadTime +
        ", empSignature=" + empSignature +
        ", extension=" + extension +
        "}";
    }
}
