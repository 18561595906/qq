package com.haier.hop.ms.legcontract.domain;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * job日志表
 * </p>
 *
 * @author wdh
 * @since 2019-08-08
 */
@TableName("leg_job_log")
public class LegJobLog extends Model<LegJobLog> {

	private static final long serialVersionUID = 1L;

	@TableField("ID")
	private String id;
	/**
	 * 账号
	 */
	@TableField("USER_NAME")
	private String userName;
	/**
	 * 创建时间
	 */
	@TableField("CREATE_TIME")
	private String createTime;
	/**
	 * 数据
	 */
	@TableField("JSON")
	private String json;
	/**
	 * 父类id
	 */
	@TableField("PID")
	private String pid;
	/**
	 * 类
	 */
	@TableField("CLAS")
	private String clas;
	/**
	 * 方法
	 */
	@TableField("METHOD")
	private String method;
	/**
	 * 请求头信息
	 */
	@TableField("AGENT")
	private String agent;
	@TableField("IP")
	private String ip;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	protected Serializable pkVal() {
		return null;
	}

	@Override
	public String toString() {
		return "LegJobLog{" + "id=" + id + ", userName=" + userName + ", createTime=" + createTime + ", json=" + json
				+ ", pid=" + pid + ", clas=" + clas + ", method=" + method + ", agent=" + agent + ", ip=" + ip + "}";
	}
}
