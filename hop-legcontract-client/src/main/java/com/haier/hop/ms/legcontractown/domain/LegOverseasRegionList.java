package com.haier.hop.ms.legcontractown.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 海外合同大区列表
 * </p>
 *
 * @author xuejinxin
 * @since 2020-04-16
 */
@TableName("leg_overseas_region_list")
public class LegOverseasRegionList extends Model<LegOverseasRegionList> {

    private static final long serialVersionUID = 1L;

    /**
     * 大区编码
     */
    @TableField("REGION_CODE")
    private String regionCode;
    /**
     * 大区名称
     */
    @TableField("REGION_NAME")
    private String regionName;
    /**
     * 语言
     */
    @TableField("LANGUAGE")
    private String language;


    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "LegOverseasRegionList{" +
        "regionCode=" + regionCode +
        ", regionName=" + regionName +
        ", language=" + language +
        "}";
    }
}
