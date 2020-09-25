package com.haier.hop.ms.legcontract.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 公司基本信息
 * </p>
 *
 * @author lixianhua
 * @since 2019-09-18
 */
@TableName("leg_company")
public class LegCompany extends Model<LegCompany> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId("ROW_ID")
	private String rowId;
	/**
	 * 上市状态
	 */
	@TableField("COMPANY_LISTED")
	private String companyListed;
	/**
	 * 国家状态
	 */
	@TableField("COMPANY_COUNTRY")
	private String companyCountry;
	/**
	 * 公司性质
	 */
	@TableField("COMPANY_FUNDS")
	private String companyFunds;
	/**
	 * 资金状态
	 */
	@TableField("COMPANY_INVESTOR")
	private String companyInvestor;
	/**
	 * 股份类型
	 */
	@TableField("COMPANY_EQUITY")
	private String companyEquity;
	/**
	 * 公司属性
	 */
	@TableField("COMPANY_CODE_TYPE")
	private String companyCodeType;
	/**
	 * 公司编码
	 */
	@TableField("COMPANY_CODE")
	private String companyCode;
	/**
	 * 公司名称
	 */
	@TableField("COMPANY_NAME")
	private String companyName;
	/**
	 * 公司名称行政区划
	 */
	@TableField("COMPANY_DISTRICT")
	private String companyDistrict;
	/**
	 * 公司名称字号
	 */
	@TableField("COMPANY_FONT")
	private String companyFont;
	/**
	 * 公司名称行业名称
	 */
	@TableField("COMPANY_INDUSTRY")
	private String companyIndustry;
	/**
	 * 公司名称组织形式
	 */
	@TableField("COMPANY_ORGANIZATION")
	private String companyOrganization;
	/**
	 * 英文名称
	 */
	@TableField("COMPANY_NAME_ENG")
	private String companyNameEng;
	/**
	 * 注册资金单位
	 */
	@TableField("REGISTRATION_UNIT")
	private String registrationUnit;
	/**
	 * 注册资金
	 */
	@TableField("REGISTERED_CAPITAL")
	private BigDecimal registeredCapital;
	/**
	 * 实收资本（万）
	 */
	@TableField("PAIDIN_CAPITAL")
	private BigDecimal paidinCapital;
	/**
	 * 缴纳方式
	 */
	@TableField("PAY_TYPE")
	private String payType;
	/**
	 * 业务单元
	 */
	@TableField("COMPANY_TYPE")
	private String companyType;
	/**
	 * buFu
	 */
	@TableField("BU_FU")
	private String buFu;
	/**
	 * 纳税人信息
	 */
	@TableField("TAXPAYER")
	private String taxpayer;
	/**
	 * 是否特许经营：1:是;2:否;
	 */
	@TableField("BUSINESS_FLAGE")
	private BigDecimal businessFlage;
	/**
	 * 公司类型
	 */
	@TableField("ORGANIZATIONAL_FORMS")
	private String organizationalForms;
	/**
	 * 经营范围
	 */
	@TableField("BUSINESS")
	private String business;
	/**
	 * 法定代表人
	 */
	@TableField("LEGAL_REPRESENTATIVE")
	private String legalRepresentative;
	/**
	 * 法定代表人工号
	 */
	@TableField("LEGAL_REPRESENTATIVENO")
	private String legalRepresentativeno;
	/**
	 * 法定代表人身份证
	 */
	@TableField("LEGAL_REPRESENTATIVEID")
	private String legalRepresentativeid;
	/**
	 * 法定代表人类型:1：内部；2：外部；
	 */
	@TableField("LEGAL_REPRESENTATIVETYPE")
	private BigDecimal legalRepresentativetype;
	/**
	 * 总经理
	 */
	@TableField("GENERAL_MANAGER")
	private String generalManager;
	/**
	 * 总经理工号
	 */
	@TableField("GENERAL_MANAGERNO")
	private String generalManagerno;
	/**
	 * 总经理身份证
	 */
	@TableField("GENERAL_MANAGERID")
	private String generalManagerid;
	/**
	 * 总经理类型:1：内部；2：外部；
	 */
	@TableField("GENERAL_MANAGERTYPE")
	private BigDecimal generalManagertype;
	/**
	 * 负责人
	 */
	@TableField("PERSON_IN_CHARGE")
	private String personInCharge;
	/**
	 * 负责人工号
	 */
	@TableField("PERSON_IN_CHARGENO")
	private String personInChargeno;
	/**
	 * 负责人身份证
	 */
	@TableField("PERSON_IN_CHARGEID")
	private String personInChargeid;
	/**
	 * 负责人类型:1：内部；2：外部；
	 */
	@TableField("PERSON_IN_CHARGETYPE")
	private BigDecimal personInChargetype;
	/**
	 * 住所
	 */
	@TableField("RESIDENCE")
	private String residence;
	/**
	 * 住所（省）
	 */
	@TableField("RESIDENCE_PROVINCE")
	private String residenceProvince;
	/**
	 * 住所（市）
	 */
	@TableField("RESIDENCE_CITY")
	private String residenceCity;
	/**
	 * 住所（区，县）
	 */
	@TableField("RESIDENCE_DISTRICT")
	private String residenceDistrict;
	/**
	 * 住所（具体地址）
	 */
	@TableField("RESIDENCE_SPECIFIC")
	private String residenceSpecific;
	/**
	 * 注册号
	 */
	@TableField("REG_NO")
	private String regNo;
	/**
	 * 组织机构代码证号
	 */
	@TableField("ORGAN_SN")
	private String organSn;
	/**
	 * 注册机关
	 */
	@TableField("REG_ROGAN")
	private String regRogan;
	/**
	 * 若选择长期：经营期限起始日期为必填
	 */
	@TableField("PROSECUTION_DEADLINE")
	private String prosecutionDeadline;
	/**
	 * 经营期限起始日期
	 */
	@TableField("MANAGE_BEGINDATE")
	private Date manageBegindate;
	/**
	 * 经营期限结束日期
	 */
	@TableField("MANAGE_ENDDATE")
	private Date manageEnddate;
	/**
	 * 运营情况
	 */
	@TableField("MANAGE_INFO")
	private String manageInfo;
	/**
	 * 出资到位情况
	 */
	@TableField("FUNDED_SITUATION")
	private String fundedSituation;
	/**
	 * 营业执照存档情况
	 */
	@TableField("ARCHIVES_INFO")
	private String archivesInfo;
	/**
	 * 营业执照归档联系人编号
	 */
	@TableField("ARCHIVES_USERSN")
	private String archivesUsersn;
	/**
	 * 营业执照归档联系人
	 */
	@TableField("ARCHIVES_USER")
	private String archivesUser;
	/**
	 * 营业执照归档人电话
	 */
	@TableField("ARCHIVES_TEL")
	private String archivesTel;
	/**
	 * 营业执照归档人邮箱
	 */
	@TableField("ARCHIVES_EMAIL")
	private String archivesEmail;
	/**
	 * 组织代码证存档情况
	 */
	@TableField("ORGANSN_INFO")
	private String organsnInfo;
	/**
	 * 组织代码证保管人工号
	 */
	@TableField("ORGANSN_USERSN")
	private String organsnUsersn;
	/**
	 * 组织代码证保管人
	 */
	@TableField("ORGANSN_USER")
	private String organsnUser;
	/**
	 * 组织代码证保管人电话
	 */
	@TableField("ORGANSN_TEL")
	private String organsnTel;
	/**
	 * 组织代码证保管人电话
	 */
	@TableField("ORGANSN_EMAIL")
	private String organsnEmail;
	/**
	 * 企业档案编号
	 */
	@TableField("ARCHIVES_NO")
	private String archivesNo;
	/**
	 * 公司状态 1:正常；2：注销；3：注销中；4：变更中；
	 */
	@TableField("COMPANY_FLAGE")
	private String companyFlage;
	/**
	 * 一级行政编号
	 */
	@TableField("ADMIN_FIRST")
	private String adminFirst;
	/**
	 * 二级行政编号
	 */
	@TableField("ADMIN_SECOND")
	private String adminSecond;
	/**
	 * 三级行政编号
	 */
	@TableField("ADMIN_THIRD")
	private String adminThird;
	/**
	 * 年检状态：1：年检通过；2：需要年检；
	 */
	@TableField("INSPECTION_TYPE")
	private BigDecimal inspectionType;
	/**
	 * 创建人编号
	 */
	@TableField("CREATE_NO")
	private String createNo;
	/**
	 * 创建人
	 */
	@TableField("CREATE_BY")
	private String createBy;
	/**
	 * 创建人电话
	 */
	@TableField("CREATE_TEL")
	private String createTel;
	/**
	 * 创建人邮箱
	 */
	@TableField("CREATE_EMAIL")
	private String createEmail;
	/**
	 * 创建时间
	 */
	@TableField("CREATE_DATE")
	private Date createDate;
	/**
	 * 修改人
	 */
	@TableField("UPDATE_BY")
	private String updateBy;
	/**
	 * 修改时间
	 */
	@TableField("UDPATE_DATE")
	private Date udpateDate;
	/**
	 * 特许经营证件名称：否特许经营”如果选择了“是”,则字段必填
	 */
	@TableField("BUSINESS_CREDENTIALS")
	private String businessCredentials;
	/**
	 * 流程类型
	 */
	@TableField("PROC_TYPE")
	private String procType;
	/**
	 * 上市类别1：A股；2：H股
	 */
	@TableField("COMPANY_LISTED_TYPE")
	private String companyListedType;
	/**
	 * 执行事务合伙人（委派代表）1:内部组织2:外部组织3:内部自然人4:外部自然人
	 */
	@TableField("PARTNER_TYPE")
	private String partnerType;
	/**
	 * 执行事务合伙人（委派代表）为自然人
	 */
	@TableField("PARTNER")
	private String partner;
	/**
	 * 执行事务合伙人为内部自然人时填写工号
	 */
	@TableField("PARTNER_NO")
	private String partnerNo;
	/**
	 * 执行事务合伙人为自然人时填写身份证号
	 */
	@TableField("PARTNER_ID")
	private String partnerId;
	/**
	 * 执行事务合伙人为组织
	 */
	@TableField("PARTNER_ORG")
	private String partnerOrg;
	/**
	 * 执行事务合伙人为组织的委派代表自然人姓名
	 */
	@TableField("PARTNER_DELEGATE")
	private String partnerDelegate;
	/**
	 * 执行事务合伙人为内部组织的委派代表自然人工号
	 */
	@TableField("PARTNER_DELEGATE_NO")
	private String partnerDelegateNo;
	/**
	 * 执行事务合伙人为组织的委派代表自然人身份证号
	 */
	@TableField("PARTNER_DELEGATE_ID")
	private String partnerDelegateId;
	/**
	 * 投资总额
	 */
	@TableField("TOTAL_INVESTMENT")
	private String totalInvestment;
	/**
	 * 应缴时间
	 */
	@TableField("PAYABLE_DATE")
	private Date payableDate;
	/**
	 * 实缴时间
	 */
	@TableField("PAID_DATE")
	private Date paidDate;
	/**
	 * 财务负责人
	 */
	@TableField("FIN_CHARGER")
	private String finCharger;
	/**
	 * 财务负责人工号
	 */
	@TableField("FIN_CHARGERNO")
	private String finChargerno;
	/**
	 * 财务负责人身份证号
	 */
	@TableField("FIN_CHARGERID")
	private String finChargerid;
	/**
	 * 财务负责人电话
	 */
	@TableField("FIN_CHARGERTEL")
	private String finChargertel;
	/**
	 * 财务负责人邮箱
	 */
	@TableField("FIN_CHARGEREMAIL")
	private String finChargeremail;
	/**
	 * 财务负责人类型：1、内部 2、外部
	 */
	@TableField("FIN_CHARGER_TYPE")
	private String finChargerType;
	/**
	 * 联络员
	 */
	@TableField("CONTACTOR")
	private String contactor;
	/**
	 * 联络员工号
	 */
	@TableField("CONTACTORNO")
	private String contactorno;
	/**
	 * 联络员身份证号
	 */
	@TableField("CONTACTORID")
	private String contactorid;
	/**
	 * 联络员电话
	 */
	@TableField("CONTACTORTEL")
	private String contactortel;
	/**
	 * 联络员邮箱
	 */
	@TableField("CONTACTORMAIL")
	private String contactormail;
	/**
	 * 联络员类型：1、内部 2、外部
	 */
	@TableField("CONTACTOR_TYPE")
	private String contactorType;
	/**
	 * 是否三证合一1、是；0、否
	 */
	@TableField("IS_SANZHENG_MERGE")
	private BigDecimal isSanzhengMerge;
	/**
	 * 统一社会信息代码
	 */
	@TableField("UNI_INFO_CODE")
	private String uniInfoCode;
	/**
	 * 税务登记证注册号
	 */
	@TableField("TAX_REG_NO")
	private String taxRegNo;
	/**
	 * 三证合一执照存档单位
	 */
	@TableField("UNI_INFO")
	private String uniInfo;
	/**
	 * 三证合一执照保管人工号
	 */
	@TableField("UNI_INFO_USERSN")
	private String uniInfoUsersn;
	/**
	 * 三证合一执照保管人
	 */
	@TableField("UNI_INFO_USER")
	private String uniInfoUser;
	/**
	 * 三证合一执照保管人电话
	 */
	@TableField("UNI_INFO_TEL")
	private String uniInfoTel;
	/**
	 * 三证合一执照保管人邮箱
	 */
	@TableField("UNI_INFO_EMAIL")
	private String uniInfoEmail;
	/**
	 * 注册机关一级行政编号
	 */
	@TableField("REG_FIRST")
	private BigDecimal regFirst;
	/**
	 * 注册机关二级行政编号
	 */
	@TableField("REG_SECOND")
	private BigDecimal regSecond;
	/**
	 * 注册机关三级行政编号
	 */
	@TableField("REG_THIRD")
	private BigDecimal regThird;
	/**
	 * 营业执照核准日期
	 */
	@TableField("REG_CHECKDATE")
	private Date regCheckdate;
	/**
	 * 许可文件编号
	 */
	@TableField("BUSINESS_CREDENTIAL_NO")
	private String businessCredentialNo;
	/**
	 * 许可文件起始日期
	 */
	@TableField("BUSINESS_CREDENTIAL_SDATE")
	private Date businessCredentialSdate;
	/**
	 * 许可文件结束日期
	 */
	@TableField("BUSINESS_CREDENTIAL_EDATE")
	private Date businessCredentialEdate;
	/**
	 * 许可文件许可机关
	 */
	@TableField("BUSINESS_CREDENTIAL_SUBJECT")
	private String businessCredentialSubject;
	/**
	 * 许可文件登记状态
	 */
	@TableField("BUSINESS_CREDENTIAL_STATUS")
	private String businessCredentialStatus;
	/**
	 * 1为已评论
	 */
	@TableField("IS_ASSESSED")
	private BigDecimal isAssessed;
	/**
	 * 生产经营地
	 */
	@TableField("PRO_OPER_PLACE")
	private String proOperPlace;
	/**
	 * 经营期限标记，永久0，长期1
	 */
	@TableField("OPERATION_TIMEFLAG")
	private BigDecimal operationTimeflag;
	/**
	 * 经营期限
	 */
	@TableField("OPERATION_TIME")
	private BigDecimal operationTime;
	/**
	 * 投资资金单位
	 */
	@TableField("INVESTMENT_UNIT")
	private String investmentUnit;
	/**
	 * 申请营业执照副本数
	 */
	@TableField("BUSI_LICENSE_COPY")
	private BigDecimal busiLicenseCopy;
	/**
	 * 生产经营地一级行政单位
	 */
	@TableField("PROPLACE_FIRST")
	private BigDecimal proplaceFirst;
	/**
	 * 生产经营地二级行政单位
	 */
	@TableField("PROPLACE_SECOND")
	private BigDecimal proplaceSecond;
	/**
	 * 生产经营地三级行政单位
	 */
	@TableField("PROPLACE_THIRD")
	private BigDecimal proplaceThird;
	/**
	 * 法定代表人电话
	 */
	@TableField("LEGAL_REPRESENTATIVEIDTEL")
	private String legalRepresentativeidtel;
	/**
	 * 法定代表人手机
	 */
	@TableField("LEGAL_REPRESENTATIVEIDPHONE")
	private String legalRepresentativeidphone;
	/**
	 * 法定代表人MAIL
	 */
	@TableField("LEGAL_REPRESENTATIVEMAIL")
	private String legalRepresentativemail;
	/**
	 * 总经理电话
	 */
	@TableField("GENERAL_MANAGERTEL")
	private String generalManagertel;
	/**
	 * 总经理手机
	 */
	@TableField("GENERAL_MANAGERPHONE")
	private String generalManagerphone;
	/**
	 * 总经理MAIL
	 */
	@TableField("GENERAL_MANAGERMAIL")
	private String generalManagermail;
	/**
	 * 负责人手机
	 */
	@TableField("FIN_CHARGERPHONE")
	private String finChargerphone;
	/**
	 * 联络员手机
	 */
	@TableField("CONTACTORPHONE")
	private String contactorphone;
	/**
	 * 指定代理人电话
	 */
	@TableField("AGENTTEL")
	private String agenttel;
	/**
	 * 指定代理人手机
	 */
	@TableField("AGENTPHONE")
	private String agentphone;
	/**
	 * 指定代理人MAIL
	 */
	@TableField("AGENTEMAIL")
	private String agentemail;
	/**
	 * 指定代理人姓名
	 */
	@TableField("AGENT_NAME")
	private String agentName;
	/**
	 * 指定代理人工号
	 */
	@TableField("AGENTNO")
	private String agentno;
	/**
	 * 指定代理人证件号
	 */
	@TableField("AGENTID")
	private String agentid;
	/**
	 * 指定代理人类型，1内部，2外部
	 */
	@TableField("AGENTTYPE")
	private BigDecimal agenttype;
	/**
	 * 房屋所有人电话
	 */
	@TableField("FWOWNERTEL")
	private String fwownertel;
	/**
	 * 房屋所有人MAIL
	 */
	@TableField("FWOWNERMAIL")
	private String fwownermail;
	/**
	 * 名称预先核准文号
	 */
	@TableField("PREAPPROVALNO")
	private String preapprovalno;
	/**
	 * 法代人由谁兼任,00 未指定，1 董事长兼任，2经理兼任，3执行董事兼任
	 */
	@TableField("WHOISFDR")
	private BigDecimal whoisfdr;
	/**
	 * 经理有谁聘任,00未指定，1执行董事，2董事会，3股东，4股东会
	 */
	@TableField("WHOISORDERMANAGER")
	private BigDecimal whoisordermanager;
	/**
	 * 是否设立监事会0否，1是
	 */
	@TableField("ISJIANSHIHUI")
	private BigDecimal isjianshihui;
	/**
	 * 是否设立董事会0否，1是
	 */
	@TableField("ISDONGSHIHUI")
	private BigDecimal isdongshihui;
	/**
	 * 公司出资总金额
	 */
	@TableField("COM_OUTAMOUNTALL")
	private BigDecimal comOutamountall;
	/**
	 * 是否引入社会成本
	 */
	@TableField("ISYRSHCB")
	private BigDecimal isyrshcb;
	/**
	 * 融资轮次
	 */
	@TableField("FINANCINGROUNDS")
	private String financingrounds;
	/**
	 * 融资金额
	 */
	@TableField("FINANCINGAMOUNT")
	private String financingamount;
	/**
	 * 从业人数
	 */
	@TableField("CONGYENOS")
	private BigDecimal congyenos;
	/**
	 * 认缴出资额
	 */
	@TableField("PAYSUBSCRIBE")
	private BigDecimal paysubscribe;
	/**
	 * 认缴出资单位
	 */
	@TableField("PAYSUBSCRIBE_UNIT")
	private String paysubscribeUnit;
	/**
	 * 实缴出资单位
	 */
	@TableField("PAIDINCAPITAL_UNIT")
	private String paidincapitalUnit;
	/**
	 * 执行事务合伙人电话
	 */
	@TableField("PARTNERTEL")
	private String partnertel;
	/**
	 * 执行事务合伙人手机
	 */
	@TableField("PARTNERPHONE")
	private String partnerphone;
	/**
	 * 执行事务合伙人邮箱
	 */
	@TableField("PARTNEREMAIL")
	private String partneremail;
	/**
	 * 企业类别编码
	 */
	@TableField("ENTERPRISE_CATEGORY")
	private String enterpriseCategory;
	/**
	 * 流程类型 add/change/cancel
	 */
	@TableField("FLOW_TYPE")
	private String flowType;
	/**
	 * 是否有海尔字号 1有 0无
	 */
	@TableField("HAS_HAIER")
	private String hasHaier;
	/**
	 * 邮政编码
	 */
	@TableField("POSTCODE")
	private String postcode;
	/**
	 * 联系方式
	 */
	@TableField("JYDCONTRACTPHONE")
	private String jydcontractphone;
	/**
	 * 所属行业,门类代码 行业门类名称
	 */
	@TableField("INDUSTRY")
	private String industry;
	/**
	 * 行业类别，小类代码 大类/中类/小类
	 */
	@TableField("INDUSTRYCATEGORY")
	private String industrycategory;
	/**
	 * 是否有海尔方股东退出 1有 0无
	 */
	@TableField("DROP_HAIER_EQUITY")
	private String dropHaierEquity;
	/**
	 * 国家
	 */
	@TableField("COUNTRY")
	private String country;
	/**
	 * 小微名称（存放的是编码，自动表对应smallorg）
	 */
	@TableField("SMALLORG")
	private String smallorg;
	/**
	 * 法定代表人具体地址
	 */
	@TableField("LEGALREPRESENTATIVERESIDENCE")
	private String legalrepresentativeresidence;
	/**
	 * 经理国别
	 */
	@TableField("GENERAL_MANAGERCOUNTRY")
	private String generalManagercountry;
	/**
	 * 申请银行
	 */
	@TableField("SQYH")
	private String sqyh;
	/**
	 * 币种
	 */
	@TableField("BZ")
	private String bz;
	/**
	 * 财务部长工号
	 */
	@TableField("CWBZSN")
	private String cwbzsn;
	/**
	 * 财务部长名称
	 */
	@TableField("CWBZ")
	private String cwbz;
	/**
	 * 是否走业务付款
	 */
	@TableField("ISSEALMAKE")
	private String issealmake;
	/**
	 * 供应商编码
	 */
	@TableField("OUTVENDORCODE")
	private String outvendorcode;
	/**
	 * 客户编码
	 */
	@TableField("OUTCUSTOMERCODE")
	private String outcustomercode;
	/**
	 * 管理口径（境外公司新设使用）
	 */
	@TableField("MANAGECALIBER")
	private String managecaliber;
	/**
	 * 房屋所有人 电话
	 */
	@TableField("FW_OWNER_TEL")
	private String fwOwnerTel;
	/**
	 * 流程实例ID
	 */
	@TableField("PRO_ID")
	private String proId;
	/**
	 * 企业类别（0：小微1：领域2：集团）
	 */
	@TableField("COMPANY_DISCUSSION_TYPE")
	private Integer companyDiscussionType;

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public String getCompanyListed() {
		return companyListed;
	}

	public void setCompanyListed(String companyListed) {
		this.companyListed = companyListed;
	}

	public String getCompanyCountry() {
		return companyCountry;
	}

	public void setCompanyCountry(String companyCountry) {
		this.companyCountry = companyCountry;
	}

	public String getCompanyFunds() {
		return companyFunds;
	}

	public void setCompanyFunds(String companyFunds) {
		this.companyFunds = companyFunds;
	}

	public String getCompanyInvestor() {
		return companyInvestor;
	}

	public void setCompanyInvestor(String companyInvestor) {
		this.companyInvestor = companyInvestor;
	}

	public String getCompanyEquity() {
		return companyEquity;
	}

	public void setCompanyEquity(String companyEquity) {
		this.companyEquity = companyEquity;
	}

	public String getCompanyCodeType() {
		return companyCodeType;
	}

	public void setCompanyCodeType(String companyCodeType) {
		this.companyCodeType = companyCodeType;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyDistrict() {
		return companyDistrict;
	}

	public void setCompanyDistrict(String companyDistrict) {
		this.companyDistrict = companyDistrict;
	}

	public String getCompanyFont() {
		return companyFont;
	}

	public void setCompanyFont(String companyFont) {
		this.companyFont = companyFont;
	}

	public String getCompanyIndustry() {
		return companyIndustry;
	}

	public void setCompanyIndustry(String companyIndustry) {
		this.companyIndustry = companyIndustry;
	}

	public String getCompanyOrganization() {
		return companyOrganization;
	}

	public void setCompanyOrganization(String companyOrganization) {
		this.companyOrganization = companyOrganization;
	}

	public String getCompanyNameEng() {
		return companyNameEng;
	}

	public void setCompanyNameEng(String companyNameEng) {
		this.companyNameEng = companyNameEng;
	}

	public String getRegistrationUnit() {
		return registrationUnit;
	}

	public void setRegistrationUnit(String registrationUnit) {
		this.registrationUnit = registrationUnit;
	}

	public BigDecimal getRegisteredCapital() {
		return registeredCapital;
	}

	public void setRegisteredCapital(BigDecimal registeredCapital) {
		this.registeredCapital = registeredCapital;
	}

	public BigDecimal getPaidinCapital() {
		return paidinCapital;
	}

	public void setPaidinCapital(BigDecimal paidinCapital) {
		this.paidinCapital = paidinCapital;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getBuFu() {
		return buFu;
	}

	public void setBuFu(String buFu) {
		this.buFu = buFu;
	}

	public String getTaxpayer() {
		return taxpayer;
	}

	public void setTaxpayer(String taxpayer) {
		this.taxpayer = taxpayer;
	}

	public BigDecimal getBusinessFlage() {
		return businessFlage;
	}

	public void setBusinessFlage(BigDecimal businessFlage) {
		this.businessFlage = businessFlage;
	}

	public String getOrganizationalForms() {
		return organizationalForms;
	}

	public void setOrganizationalForms(String organizationalForms) {
		this.organizationalForms = organizationalForms;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public String getLegalRepresentative() {
		return legalRepresentative;
	}

	public void setLegalRepresentative(String legalRepresentative) {
		this.legalRepresentative = legalRepresentative;
	}

	public String getLegalRepresentativeno() {
		return legalRepresentativeno;
	}

	public void setLegalRepresentativeno(String legalRepresentativeno) {
		this.legalRepresentativeno = legalRepresentativeno;
	}

	public String getLegalRepresentativeid() {
		return legalRepresentativeid;
	}

	public void setLegalRepresentativeid(String legalRepresentativeid) {
		this.legalRepresentativeid = legalRepresentativeid;
	}

	public BigDecimal getLegalRepresentativetype() {
		return legalRepresentativetype;
	}

	public void setLegalRepresentativetype(BigDecimal legalRepresentativetype) {
		this.legalRepresentativetype = legalRepresentativetype;
	}

	public String getGeneralManager() {
		return generalManager;
	}

	public void setGeneralManager(String generalManager) {
		this.generalManager = generalManager;
	}

	public String getGeneralManagerno() {
		return generalManagerno;
	}

	public void setGeneralManagerno(String generalManagerno) {
		this.generalManagerno = generalManagerno;
	}

	public String getGeneralManagerid() {
		return generalManagerid;
	}

	public void setGeneralManagerid(String generalManagerid) {
		this.generalManagerid = generalManagerid;
	}

	public BigDecimal getGeneralManagertype() {
		return generalManagertype;
	}

	public void setGeneralManagertype(BigDecimal generalManagertype) {
		this.generalManagertype = generalManagertype;
	}

	public String getPersonInCharge() {
		return personInCharge;
	}

	public void setPersonInCharge(String personInCharge) {
		this.personInCharge = personInCharge;
	}

	public String getPersonInChargeno() {
		return personInChargeno;
	}

	public void setPersonInChargeno(String personInChargeno) {
		this.personInChargeno = personInChargeno;
	}

	public String getPersonInChargeid() {
		return personInChargeid;
	}

	public void setPersonInChargeid(String personInChargeid) {
		this.personInChargeid = personInChargeid;
	}

	public BigDecimal getPersonInChargetype() {
		return personInChargetype;
	}

	public void setPersonInChargetype(BigDecimal personInChargetype) {
		this.personInChargetype = personInChargetype;
	}

	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}

	public String getResidenceProvince() {
		return residenceProvince;
	}

	public void setResidenceProvince(String residenceProvince) {
		this.residenceProvince = residenceProvince;
	}

	public String getResidenceCity() {
		return residenceCity;
	}

	public void setResidenceCity(String residenceCity) {
		this.residenceCity = residenceCity;
	}

	public String getResidenceDistrict() {
		return residenceDistrict;
	}

	public void setResidenceDistrict(String residenceDistrict) {
		this.residenceDistrict = residenceDistrict;
	}

	public String getResidenceSpecific() {
		return residenceSpecific;
	}

	public void setResidenceSpecific(String residenceSpecific) {
		this.residenceSpecific = residenceSpecific;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getOrganSn() {
		return organSn;
	}

	public void setOrganSn(String organSn) {
		this.organSn = organSn;
	}

	public String getRegRogan() {
		return regRogan;
	}

	public void setRegRogan(String regRogan) {
		this.regRogan = regRogan;
	}

	public String getProsecutionDeadline() {
		return prosecutionDeadline;
	}

	public void setProsecutionDeadline(String prosecutionDeadline) {
		this.prosecutionDeadline = prosecutionDeadline;
	}

	public Date getManageBegindate() {
		return manageBegindate;
	}

	public void setManageBegindate(Date manageBegindate) {
		this.manageBegindate = manageBegindate;
	}

	public Date getManageEnddate() {
		return manageEnddate;
	}

	public void setManageEnddate(Date manageEnddate) {
		this.manageEnddate = manageEnddate;
	}

	public String getManageInfo() {
		return manageInfo;
	}

	public void setManageInfo(String manageInfo) {
		this.manageInfo = manageInfo;
	}

	public String getFundedSituation() {
		return fundedSituation;
	}

	public void setFundedSituation(String fundedSituation) {
		this.fundedSituation = fundedSituation;
	}

	public String getArchivesInfo() {
		return archivesInfo;
	}

	public void setArchivesInfo(String archivesInfo) {
		this.archivesInfo = archivesInfo;
	}

	public String getArchivesUsersn() {
		return archivesUsersn;
	}

	public void setArchivesUsersn(String archivesUsersn) {
		this.archivesUsersn = archivesUsersn;
	}

	public String getArchivesUser() {
		return archivesUser;
	}

	public void setArchivesUser(String archivesUser) {
		this.archivesUser = archivesUser;
	}

	public String getArchivesTel() {
		return archivesTel;
	}

	public void setArchivesTel(String archivesTel) {
		this.archivesTel = archivesTel;
	}

	public String getArchivesEmail() {
		return archivesEmail;
	}

	public void setArchivesEmail(String archivesEmail) {
		this.archivesEmail = archivesEmail;
	}

	public String getOrgansnInfo() {
		return organsnInfo;
	}

	public void setOrgansnInfo(String organsnInfo) {
		this.organsnInfo = organsnInfo;
	}

	public String getOrgansnUsersn() {
		return organsnUsersn;
	}

	public void setOrgansnUsersn(String organsnUsersn) {
		this.organsnUsersn = organsnUsersn;
	}

	public String getOrgansnUser() {
		return organsnUser;
	}

	public void setOrgansnUser(String organsnUser) {
		this.organsnUser = organsnUser;
	}

	public String getOrgansnTel() {
		return organsnTel;
	}

	public void setOrgansnTel(String organsnTel) {
		this.organsnTel = organsnTel;
	}

	public String getOrgansnEmail() {
		return organsnEmail;
	}

	public void setOrgansnEmail(String organsnEmail) {
		this.organsnEmail = organsnEmail;
	}

	public String getArchivesNo() {
		return archivesNo;
	}

	public void setArchivesNo(String archivesNo) {
		this.archivesNo = archivesNo;
	}

	public String getCompanyFlage() {
		return companyFlage;
	}

	public void setCompanyFlage(String companyFlage) {
		this.companyFlage = companyFlage;
	}

	public String getAdminFirst() {
		return adminFirst;
	}

	public void setAdminFirst(String adminFirst) {
		this.adminFirst = adminFirst;
	}

	public String getAdminSecond() {
		return adminSecond;
	}

	public void setAdminSecond(String adminSecond) {
		this.adminSecond = adminSecond;
	}

	public String getAdminThird() {
		return adminThird;
	}

	public void setAdminThird(String adminThird) {
		this.adminThird = adminThird;
	}

	public BigDecimal getInspectionType() {
		return inspectionType;
	}

	public void setInspectionType(BigDecimal inspectionType) {
		this.inspectionType = inspectionType;
	}

	public String getCreateNo() {
		return createNo;
	}

	public void setCreateNo(String createNo) {
		this.createNo = createNo;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getCreateTel() {
		return createTel;
	}

	public void setCreateTel(String createTel) {
		this.createTel = createTel;
	}

	public String getCreateEmail() {
		return createEmail;
	}

	public void setCreateEmail(String createEmail) {
		this.createEmail = createEmail;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUdpateDate() {
		return udpateDate;
	}

	public void setUdpateDate(Date udpateDate) {
		this.udpateDate = udpateDate;
	}

	public String getBusinessCredentials() {
		return businessCredentials;
	}

	public void setBusinessCredentials(String businessCredentials) {
		this.businessCredentials = businessCredentials;
	}

	public String getProcType() {
		return procType;
	}

	public void setProcType(String procType) {
		this.procType = procType;
	}

	public String getCompanyListedType() {
		return companyListedType;
	}

	public void setCompanyListedType(String companyListedType) {
		this.companyListedType = companyListedType;
	}

	public String getPartnerType() {
		return partnerType;
	}

	public void setPartnerType(String partnerType) {
		this.partnerType = partnerType;
	}

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public String getPartnerNo() {
		return partnerNo;
	}

	public void setPartnerNo(String partnerNo) {
		this.partnerNo = partnerNo;
	}

	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPartnerOrg() {
		return partnerOrg;
	}

	public void setPartnerOrg(String partnerOrg) {
		this.partnerOrg = partnerOrg;
	}

	public String getPartnerDelegate() {
		return partnerDelegate;
	}

	public void setPartnerDelegate(String partnerDelegate) {
		this.partnerDelegate = partnerDelegate;
	}

	public String getPartnerDelegateNo() {
		return partnerDelegateNo;
	}

	public void setPartnerDelegateNo(String partnerDelegateNo) {
		this.partnerDelegateNo = partnerDelegateNo;
	}

	public String getPartnerDelegateId() {
		return partnerDelegateId;
	}

	public void setPartnerDelegateId(String partnerDelegateId) {
		this.partnerDelegateId = partnerDelegateId;
	}

	public String getTotalInvestment() {
		return totalInvestment;
	}

	public void setTotalInvestment(String totalInvestment) {
		this.totalInvestment = totalInvestment;
	}

	public Date getPayableDate() {
		return payableDate;
	}

	public void setPayableDate(Date payableDate) {
		this.payableDate = payableDate;
	}

	public Date getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}

	public String getFinCharger() {
		return finCharger;
	}

	public void setFinCharger(String finCharger) {
		this.finCharger = finCharger;
	}

	public String getFinChargerno() {
		return finChargerno;
	}

	public void setFinChargerno(String finChargerno) {
		this.finChargerno = finChargerno;
	}

	public String getFinChargerid() {
		return finChargerid;
	}

	public void setFinChargerid(String finChargerid) {
		this.finChargerid = finChargerid;
	}

	public String getFinChargertel() {
		return finChargertel;
	}

	public void setFinChargertel(String finChargertel) {
		this.finChargertel = finChargertel;
	}

	public String getFinChargeremail() {
		return finChargeremail;
	}

	public void setFinChargeremail(String finChargeremail) {
		this.finChargeremail = finChargeremail;
	}

	public String getFinChargerType() {
		return finChargerType;
	}

	public void setFinChargerType(String finChargerType) {
		this.finChargerType = finChargerType;
	}

	public String getContactor() {
		return contactor;
	}

	public void setContactor(String contactor) {
		this.contactor = contactor;
	}

	public String getContactorno() {
		return contactorno;
	}

	public void setContactorno(String contactorno) {
		this.contactorno = contactorno;
	}

	public String getContactorid() {
		return contactorid;
	}

	public void setContactorid(String contactorid) {
		this.contactorid = contactorid;
	}

	public String getContactortel() {
		return contactortel;
	}

	public void setContactortel(String contactortel) {
		this.contactortel = contactortel;
	}

	public String getContactormail() {
		return contactormail;
	}

	public void setContactormail(String contactormail) {
		this.contactormail = contactormail;
	}

	public String getContactorType() {
		return contactorType;
	}

	public void setContactorType(String contactorType) {
		this.contactorType = contactorType;
	}

	public BigDecimal getIsSanzhengMerge() {
		return isSanzhengMerge;
	}

	public void setIsSanzhengMerge(BigDecimal isSanzhengMerge) {
		this.isSanzhengMerge = isSanzhengMerge;
	}

	public String getUniInfoCode() {
		return uniInfoCode;
	}

	public void setUniInfoCode(String uniInfoCode) {
		this.uniInfoCode = uniInfoCode;
	}

	public String getTaxRegNo() {
		return taxRegNo;
	}

	public void setTaxRegNo(String taxRegNo) {
		this.taxRegNo = taxRegNo;
	}

	public String getUniInfo() {
		return uniInfo;
	}

	public void setUniInfo(String uniInfo) {
		this.uniInfo = uniInfo;
	}

	public String getUniInfoUsersn() {
		return uniInfoUsersn;
	}

	public void setUniInfoUsersn(String uniInfoUsersn) {
		this.uniInfoUsersn = uniInfoUsersn;
	}

	public String getUniInfoUser() {
		return uniInfoUser;
	}

	public void setUniInfoUser(String uniInfoUser) {
		this.uniInfoUser = uniInfoUser;
	}

	public String getUniInfoTel() {
		return uniInfoTel;
	}

	public void setUniInfoTel(String uniInfoTel) {
		this.uniInfoTel = uniInfoTel;
	}

	public String getUniInfoEmail() {
		return uniInfoEmail;
	}

	public void setUniInfoEmail(String uniInfoEmail) {
		this.uniInfoEmail = uniInfoEmail;
	}

	public BigDecimal getRegFirst() {
		return regFirst;
	}

	public void setRegFirst(BigDecimal regFirst) {
		this.regFirst = regFirst;
	}

	public BigDecimal getRegSecond() {
		return regSecond;
	}

	public void setRegSecond(BigDecimal regSecond) {
		this.regSecond = regSecond;
	}

	public BigDecimal getRegThird() {
		return regThird;
	}

	public void setRegThird(BigDecimal regThird) {
		this.regThird = regThird;
	}

	public Date getRegCheckdate() {
		return regCheckdate;
	}

	public void setRegCheckdate(Date regCheckdate) {
		this.regCheckdate = regCheckdate;
	}

	public String getBusinessCredentialNo() {
		return businessCredentialNo;
	}

	public void setBusinessCredentialNo(String businessCredentialNo) {
		this.businessCredentialNo = businessCredentialNo;
	}

	public Date getBusinessCredentialSdate() {
		return businessCredentialSdate;
	}

	public void setBusinessCredentialSdate(Date businessCredentialSdate) {
		this.businessCredentialSdate = businessCredentialSdate;
	}

	public Date getBusinessCredentialEdate() {
		return businessCredentialEdate;
	}

	public void setBusinessCredentialEdate(Date businessCredentialEdate) {
		this.businessCredentialEdate = businessCredentialEdate;
	}

	public String getBusinessCredentialSubject() {
		return businessCredentialSubject;
	}

	public void setBusinessCredentialSubject(String businessCredentialSubject) {
		this.businessCredentialSubject = businessCredentialSubject;
	}

	public String getBusinessCredentialStatus() {
		return businessCredentialStatus;
	}

	public void setBusinessCredentialStatus(String businessCredentialStatus) {
		this.businessCredentialStatus = businessCredentialStatus;
	}

	public BigDecimal getIsAssessed() {
		return isAssessed;
	}

	public void setIsAssessed(BigDecimal isAssessed) {
		this.isAssessed = isAssessed;
	}

	public String getProOperPlace() {
		return proOperPlace;
	}

	public void setProOperPlace(String proOperPlace) {
		this.proOperPlace = proOperPlace;
	}

	public BigDecimal getOperationTimeflag() {
		return operationTimeflag;
	}

	public void setOperationTimeflag(BigDecimal operationTimeflag) {
		this.operationTimeflag = operationTimeflag;
	}

	public BigDecimal getOperationTime() {
		return operationTime;
	}

	public void setOperationTime(BigDecimal operationTime) {
		this.operationTime = operationTime;
	}

	public String getInvestmentUnit() {
		return investmentUnit;
	}

	public void setInvestmentUnit(String investmentUnit) {
		this.investmentUnit = investmentUnit;
	}

	public BigDecimal getBusiLicenseCopy() {
		return busiLicenseCopy;
	}

	public void setBusiLicenseCopy(BigDecimal busiLicenseCopy) {
		this.busiLicenseCopy = busiLicenseCopy;
	}

	public BigDecimal getProplaceFirst() {
		return proplaceFirst;
	}

	public void setProplaceFirst(BigDecimal proplaceFirst) {
		this.proplaceFirst = proplaceFirst;
	}

	public BigDecimal getProplaceSecond() {
		return proplaceSecond;
	}

	public void setProplaceSecond(BigDecimal proplaceSecond) {
		this.proplaceSecond = proplaceSecond;
	}

	public BigDecimal getProplaceThird() {
		return proplaceThird;
	}

	public void setProplaceThird(BigDecimal proplaceThird) {
		this.proplaceThird = proplaceThird;
	}

	public String getLegalRepresentativeidtel() {
		return legalRepresentativeidtel;
	}

	public void setLegalRepresentativeidtel(String legalRepresentativeidtel) {
		this.legalRepresentativeidtel = legalRepresentativeidtel;
	}

	public String getLegalRepresentativeidphone() {
		return legalRepresentativeidphone;
	}

	public void setLegalRepresentativeidphone(String legalRepresentativeidphone) {
		this.legalRepresentativeidphone = legalRepresentativeidphone;
	}

	public String getLegalRepresentativemail() {
		return legalRepresentativemail;
	}

	public void setLegalRepresentativemail(String legalRepresentativemail) {
		this.legalRepresentativemail = legalRepresentativemail;
	}

	public String getGeneralManagertel() {
		return generalManagertel;
	}

	public void setGeneralManagertel(String generalManagertel) {
		this.generalManagertel = generalManagertel;
	}

	public String getGeneralManagerphone() {
		return generalManagerphone;
	}

	public void setGeneralManagerphone(String generalManagerphone) {
		this.generalManagerphone = generalManagerphone;
	}

	public String getGeneralManagermail() {
		return generalManagermail;
	}

	public void setGeneralManagermail(String generalManagermail) {
		this.generalManagermail = generalManagermail;
	}

	public String getFinChargerphone() {
		return finChargerphone;
	}

	public void setFinChargerphone(String finChargerphone) {
		this.finChargerphone = finChargerphone;
	}

	public String getContactorphone() {
		return contactorphone;
	}

	public void setContactorphone(String contactorphone) {
		this.contactorphone = contactorphone;
	}

	public String getAgenttel() {
		return agenttel;
	}

	public void setAgenttel(String agenttel) {
		this.agenttel = agenttel;
	}

	public String getAgentphone() {
		return agentphone;
	}

	public void setAgentphone(String agentphone) {
		this.agentphone = agentphone;
	}

	public String getAgentemail() {
		return agentemail;
	}

	public void setAgentemail(String agentemail) {
		this.agentemail = agentemail;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentno() {
		return agentno;
	}

	public void setAgentno(String agentno) {
		this.agentno = agentno;
	}

	public String getAgentid() {
		return agentid;
	}

	public void setAgentid(String agentid) {
		this.agentid = agentid;
	}

	public BigDecimal getAgenttype() {
		return agenttype;
	}

	public void setAgenttype(BigDecimal agenttype) {
		this.agenttype = agenttype;
	}

	public String getFwownertel() {
		return fwownertel;
	}

	public void setFwownertel(String fwownertel) {
		this.fwownertel = fwownertel;
	}

	public String getFwownermail() {
		return fwownermail;
	}

	public void setFwownermail(String fwownermail) {
		this.fwownermail = fwownermail;
	}

	public String getPreapprovalno() {
		return preapprovalno;
	}

	public void setPreapprovalno(String preapprovalno) {
		this.preapprovalno = preapprovalno;
	}

	public BigDecimal getWhoisfdr() {
		return whoisfdr;
	}

	public void setWhoisfdr(BigDecimal whoisfdr) {
		this.whoisfdr = whoisfdr;
	}

	public BigDecimal getWhoisordermanager() {
		return whoisordermanager;
	}

	public void setWhoisordermanager(BigDecimal whoisordermanager) {
		this.whoisordermanager = whoisordermanager;
	}

	public BigDecimal getIsjianshihui() {
		return isjianshihui;
	}

	public void setIsjianshihui(BigDecimal isjianshihui) {
		this.isjianshihui = isjianshihui;
	}

	public BigDecimal getIsdongshihui() {
		return isdongshihui;
	}

	public void setIsdongshihui(BigDecimal isdongshihui) {
		this.isdongshihui = isdongshihui;
	}

	public BigDecimal getComOutamountall() {
		return comOutamountall;
	}

	public void setComOutamountall(BigDecimal comOutamountall) {
		this.comOutamountall = comOutamountall;
	}

	public BigDecimal getIsyrshcb() {
		return isyrshcb;
	}

	public void setIsyrshcb(BigDecimal isyrshcb) {
		this.isyrshcb = isyrshcb;
	}

	public String getFinancingrounds() {
		return financingrounds;
	}

	public void setFinancingrounds(String financingrounds) {
		this.financingrounds = financingrounds;
	}

	public String getFinancingamount() {
		return financingamount;
	}

	public void setFinancingamount(String financingamount) {
		this.financingamount = financingamount;
	}

	public BigDecimal getCongyenos() {
		return congyenos;
	}

	public void setCongyenos(BigDecimal congyenos) {
		this.congyenos = congyenos;
	}

	public BigDecimal getPaysubscribe() {
		return paysubscribe;
	}

	public void setPaysubscribe(BigDecimal paysubscribe) {
		this.paysubscribe = paysubscribe;
	}

	public String getPaysubscribeUnit() {
		return paysubscribeUnit;
	}

	public void setPaysubscribeUnit(String paysubscribeUnit) {
		this.paysubscribeUnit = paysubscribeUnit;
	}

	public String getPaidincapitalUnit() {
		return paidincapitalUnit;
	}

	public void setPaidincapitalUnit(String paidincapitalUnit) {
		this.paidincapitalUnit = paidincapitalUnit;
	}

	public String getPartnertel() {
		return partnertel;
	}

	public void setPartnertel(String partnertel) {
		this.partnertel = partnertel;
	}

	public String getPartnerphone() {
		return partnerphone;
	}

	public void setPartnerphone(String partnerphone) {
		this.partnerphone = partnerphone;
	}

	public String getPartneremail() {
		return partneremail;
	}

	public void setPartneremail(String partneremail) {
		this.partneremail = partneremail;
	}

	public String getEnterpriseCategory() {
		return enterpriseCategory;
	}

	public void setEnterpriseCategory(String enterpriseCategory) {
		this.enterpriseCategory = enterpriseCategory;
	}

	public String getFlowType() {
		return flowType;
	}

	public void setFlowType(String flowType) {
		this.flowType = flowType;
	}

	public String getHasHaier() {
		return hasHaier;
	}

	public void setHasHaier(String hasHaier) {
		this.hasHaier = hasHaier;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getJydcontractphone() {
		return jydcontractphone;
	}

	public void setJydcontractphone(String jydcontractphone) {
		this.jydcontractphone = jydcontractphone;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getIndustrycategory() {
		return industrycategory;
	}

	public void setIndustrycategory(String industrycategory) {
		this.industrycategory = industrycategory;
	}

	public String getDropHaierEquity() {
		return dropHaierEquity;
	}

	public void setDropHaierEquity(String dropHaierEquity) {
		this.dropHaierEquity = dropHaierEquity;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSmallorg() {
		return smallorg;
	}

	public void setSmallorg(String smallorg) {
		this.smallorg = smallorg;
	}

	public String getLegalrepresentativeresidence() {
		return legalrepresentativeresidence;
	}

	public void setLegalrepresentativeresidence(String legalrepresentativeresidence) {
		this.legalrepresentativeresidence = legalrepresentativeresidence;
	}

	public String getGeneralManagercountry() {
		return generalManagercountry;
	}

	public void setGeneralManagercountry(String generalManagercountry) {
		this.generalManagercountry = generalManagercountry;
	}

	public String getSqyh() {
		return sqyh;
	}

	public void setSqyh(String sqyh) {
		this.sqyh = sqyh;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public String getCwbzsn() {
		return cwbzsn;
	}

	public void setCwbzsn(String cwbzsn) {
		this.cwbzsn = cwbzsn;
	}

	public String getCwbz() {
		return cwbz;
	}

	public void setCwbz(String cwbz) {
		this.cwbz = cwbz;
	}

	public String getIssealmake() {
		return issealmake;
	}

	public void setIssealmake(String issealmake) {
		this.issealmake = issealmake;
	}

	public String getOutvendorcode() {
		return outvendorcode;
	}

	public void setOutvendorcode(String outvendorcode) {
		this.outvendorcode = outvendorcode;
	}

	public String getOutcustomercode() {
		return outcustomercode;
	}

	public void setOutcustomercode(String outcustomercode) {
		this.outcustomercode = outcustomercode;
	}

	public String getManagecaliber() {
		return managecaliber;
	}

	public void setManagecaliber(String managecaliber) {
		this.managecaliber = managecaliber;
	}

	public String getFwOwnerTel() {
		return fwOwnerTel;
	}

	public void setFwOwnerTel(String fwOwnerTel) {
		this.fwOwnerTel = fwOwnerTel;
	}

	public String getProId() {
		return proId;
	}

	public void setProId(String proId) {
		this.proId = proId;
	}

	public Integer getCompanyDiscussionType() {
		return companyDiscussionType;
	}

	public void setCompanyDiscussionType(Integer companyDiscussionType) {
		this.companyDiscussionType = companyDiscussionType;
	}

	@Override
	protected Serializable pkVal() {
		return this.rowId;
	}

	@Override
	public String toString() {
		return "LegCompany{" + "rowId=" + rowId + ", companyListed=" + companyListed + ", companyCountry="
				+ companyCountry + ", companyFunds=" + companyFunds + ", companyInvestor=" + companyInvestor
				+ ", companyEquity=" + companyEquity + ", companyCodeType=" + companyCodeType + ", companyCode="
				+ companyCode + ", companyName=" + companyName + ", companyDistrict=" + companyDistrict
				+ ", companyFont=" + companyFont + ", companyIndustry=" + companyIndustry + ", companyOrganization="
				+ companyOrganization + ", companyNameEng=" + companyNameEng + ", registrationUnit=" + registrationUnit
				+ ", registeredCapital=" + registeredCapital + ", paidinCapital=" + paidinCapital + ", payType="
				+ payType + ", companyType=" + companyType + ", buFu=" + buFu + ", taxpayer=" + taxpayer
				+ ", businessFlage=" + businessFlage + ", organizationalForms=" + organizationalForms + ", business="
				+ business + ", legalRepresentative=" + legalRepresentative + ", legalRepresentativeno="
				+ legalRepresentativeno + ", legalRepresentativeid=" + legalRepresentativeid
				+ ", legalRepresentativetype=" + legalRepresentativetype + ", generalManager=" + generalManager
				+ ", generalManagerno=" + generalManagerno + ", generalManagerid=" + generalManagerid
				+ ", generalManagertype=" + generalManagertype + ", personInCharge=" + personInCharge
				+ ", personInChargeno=" + personInChargeno + ", personInChargeid=" + personInChargeid
				+ ", personInChargetype=" + personInChargetype + ", residence=" + residence + ", residenceProvince="
				+ residenceProvince + ", residenceCity=" + residenceCity + ", residenceDistrict=" + residenceDistrict
				+ ", residenceSpecific=" + residenceSpecific + ", regNo=" + regNo + ", organSn=" + organSn
				+ ", regRogan=" + regRogan + ", prosecutionDeadline=" + prosecutionDeadline + ", manageBegindate="
				+ manageBegindate + ", manageEnddate=" + manageEnddate + ", manageInfo=" + manageInfo
				+ ", fundedSituation=" + fundedSituation + ", archivesInfo=" + archivesInfo + ", archivesUsersn="
				+ archivesUsersn + ", archivesUser=" + archivesUser + ", archivesTel=" + archivesTel
				+ ", archivesEmail=" + archivesEmail + ", organsnInfo=" + organsnInfo + ", organsnUsersn="
				+ organsnUsersn + ", organsnUser=" + organsnUser + ", organsnTel=" + organsnTel + ", organsnEmail="
				+ organsnEmail + ", archivesNo=" + archivesNo + ", companyFlage=" + companyFlage + ", adminFirst="
				+ adminFirst + ", adminSecond=" + adminSecond + ", adminThird=" + adminThird + ", inspectionType="
				+ inspectionType + ", createNo=" + createNo + ", createBy=" + createBy + ", createTel=" + createTel
				+ ", createEmail=" + createEmail + ", createDate=" + createDate + ", updateBy=" + updateBy
				+ ", udpateDate=" + udpateDate + ", businessCredentials=" + businessCredentials + ", procType="
				+ procType + ", companyListedType=" + companyListedType + ", partnerType=" + partnerType + ", partner="
				+ partner + ", partnerNo=" + partnerNo + ", partnerId=" + partnerId + ", partnerOrg=" + partnerOrg
				+ ", partnerDelegate=" + partnerDelegate + ", partnerDelegateNo=" + partnerDelegateNo
				+ ", partnerDelegateId=" + partnerDelegateId + ", totalInvestment=" + totalInvestment + ", payableDate="
				+ payableDate + ", paidDate=" + paidDate + ", finCharger=" + finCharger + ", finChargerno="
				+ finChargerno + ", finChargerid=" + finChargerid + ", finChargertel=" + finChargertel
				+ ", finChargeremail=" + finChargeremail + ", finChargerType=" + finChargerType + ", contactor="
				+ contactor + ", contactorno=" + contactorno + ", contactorid=" + contactorid + ", contactortel="
				+ contactortel + ", contactormail=" + contactormail + ", contactorType=" + contactorType
				+ ", isSanzhengMerge=" + isSanzhengMerge + ", uniInfoCode=" + uniInfoCode + ", taxRegNo=" + taxRegNo
				+ ", uniInfo=" + uniInfo + ", uniInfoUsersn=" + uniInfoUsersn + ", uniInfoUser=" + uniInfoUser
				+ ", uniInfoTel=" + uniInfoTel + ", uniInfoEmail=" + uniInfoEmail + ", regFirst=" + regFirst
				+ ", regSecond=" + regSecond + ", regThird=" + regThird + ", regCheckdate=" + regCheckdate
				+ ", businessCredentialNo=" + businessCredentialNo + ", businessCredentialSdate="
				+ businessCredentialSdate + ", businessCredentialEdate=" + businessCredentialEdate
				+ ", businessCredentialSubject=" + businessCredentialSubject + ", businessCredentialStatus="
				+ businessCredentialStatus + ", isAssessed=" + isAssessed + ", proOperPlace=" + proOperPlace
				+ ", operationTimeflag=" + operationTimeflag + ", operationTime=" + operationTime + ", investmentUnit="
				+ investmentUnit + ", busiLicenseCopy=" + busiLicenseCopy + ", proplaceFirst=" + proplaceFirst
				+ ", proplaceSecond=" + proplaceSecond + ", proplaceThird=" + proplaceThird
				+ ", legalRepresentativeidtel=" + legalRepresentativeidtel + ", legalRepresentativeidphone="
				+ legalRepresentativeidphone + ", legalRepresentativemail=" + legalRepresentativemail
				+ ", generalManagertel=" + generalManagertel + ", generalManagerphone=" + generalManagerphone
				+ ", generalManagermail=" + generalManagermail + ", finChargerphone=" + finChargerphone
				+ ", contactorphone=" + contactorphone + ", agenttel=" + agenttel + ", agentphone=" + agentphone
				+ ", agentemail=" + agentemail + ", agentName=" + agentName + ", agentno=" + agentno + ", agentid="
				+ agentid + ", agenttype=" + agenttype + ", fwownertel=" + fwownertel + ", fwownermail=" + fwownermail
				+ ", preapprovalno=" + preapprovalno + ", whoisfdr=" + whoisfdr + ", whoisordermanager="
				+ whoisordermanager + ", isjianshihui=" + isjianshihui + ", isdongshihui=" + isdongshihui
				+ ", comOutamountall=" + comOutamountall + ", isyrshcb=" + isyrshcb + ", financingrounds="
				+ financingrounds + ", financingamount=" + financingamount + ", congyenos=" + congyenos
				+ ", paysubscribe=" + paysubscribe + ", paysubscribeUnit=" + paysubscribeUnit + ", paidincapitalUnit="
				+ paidincapitalUnit + ", partnertel=" + partnertel + ", partnerphone=" + partnerphone
				+ ", partneremail=" + partneremail + ", enterpriseCategory=" + enterpriseCategory + ", flowType="
				+ flowType + ", hasHaier=" + hasHaier + ", postcode=" + postcode + ", jydcontractphone="
				+ jydcontractphone + ", industry=" + industry + ", industrycategory=" + industrycategory
				+ ", dropHaierEquity=" + dropHaierEquity + ", country=" + country + ", smallorg=" + smallorg
				+ ", legalrepresentativeresidence=" + legalrepresentativeresidence + ", generalManagercountry="
				+ generalManagercountry + ", sqyh=" + sqyh + ", bz=" + bz + ", cwbzsn=" + cwbzsn + ", cwbz=" + cwbz
				+ ", issealmake=" + issealmake + ", outvendorcode=" + outvendorcode + ", outcustomercode="
				+ outcustomercode + ", managecaliber=" + managecaliber + ", fwOwnerTel=" + fwOwnerTel + ", proId="
				+ proId + ", companyDiscussionType=" + companyDiscussionType + "}";
	}
}
