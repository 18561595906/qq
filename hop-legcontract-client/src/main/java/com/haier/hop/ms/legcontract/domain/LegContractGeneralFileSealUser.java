package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 一般文件用印授权函的 审核人维护表
 * </p>
 *
 * @author lyy
 * @since 2020-05-14
 */
@TableName("leg_general_file_seal_user")
public class LegContractGeneralFileSealUser extends Model<LegContractGeneralFileSealUser> {

    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    @TableId("row_Id")
    private String rowId;
    /**
     * 产业编码
     */
    @TableField("plcode")
    private String plcode;
    /**
     * 产业名称
     */
    @TableField("plname")
    private String plname;
    /**
     * 工号编码
     */
    @TableField("usercode")
    private String usercode;
    /**
     * 工号名称
     */
    @TableField("username")
    private String  username;
    /**
     * 角色
     */
    @TableField("post")
    private String post;
    /**
     * 电话
     */
    @TableField("phone")
    private String phone;
    /**
     * 邮箱
     */
    @TableField("email")
    private String email; 
    /**
     * 中心名称
     */
    @TableField("centrename")
    private String centrename;
    
	@Override
    protected Serializable pkVal() {
        return this.rowId;
    }

    /**
	 * @return the rowId
	 */
	public String getRowId() {
		return rowId;
	}

	/**
	 * @param rowId the rowId to set
	 */
	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	/**
	 * @return the plcode
	 */
	public String getPlcode() {
		return plcode;
	}

	/**
	 * @param plcode the plcode to set
	 */
	public void setPlcode(String plcode) {
		this.plcode = plcode;
	}

	/**
	 * @return the plname
	 */
	public String getPlname() {
		return plname;
	}

	/**
	 * @param plname the plname to set
	 */
	public void setPlname(String plname) {
		this.plname = plname;
	}

	/**
	 * @return the usercode
	 */
	public String getUsercode() {
		return usercode;
	}

	/**
	 * @param usercode the usercode to set
	 */
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the post
	 */
	public String getPost() {
		return post;
	}

	/**
	 * @param post the post to set
	 */
	public void setPost(String post) {
		this.post = post;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the centrename
	 */
	public String getCentrename() {
		return centrename;
	}

	/**
	 * @param centrename the centrename to set
	 */
	public void setCentrename(String centrename) {
		this.centrename = centrename;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
    public String toString() {
        return "LegContractGeneralFileSealUser{" +
        "rowId=" + rowId +
        ", plcode=" + plcode +
        ", plname=" + plname +
        ", usercode=" + usercode +
        ", username=" + username +
        ", post=" + post +
        ", phone=" + phone +
        ", email=" + email + 
        ", centrename=" + centrename +
        "}";
    }
}
