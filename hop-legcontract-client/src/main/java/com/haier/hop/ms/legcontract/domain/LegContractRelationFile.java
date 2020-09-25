package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.enums.IdType;
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
 * @author shiyingxin
 * @since 2020-07-27
 */
@TableName("leg_contract_relation_file")
public class LegContractRelationFile extends Model<LegContractRelationFile> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 附件名称
     */
    @TableField("file_name")
    private String fileName;
    /**
     * 附件下载路径
     */
    @TableField("file_path")
    private String filePath;
    /**
     * 附件分类
     */
    @TableField("file_type")
    private String fileType;
    /**
     * 关联id
     */
    @TableField("relation_id")
    private Integer relationId;
    @TableField("create_time")
    private Date createTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Integer getRelationId() {
        return relationId;
    }

    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "LegContractRelationFile{" +
        "id=" + id +
        ", fileName=" + fileName +
        ", filePath=" + filePath +
        ", fileType=" + fileType +
        ", relationId=" + relationId +
        ", createTime=" + createTime +
        "}";
    }
}
