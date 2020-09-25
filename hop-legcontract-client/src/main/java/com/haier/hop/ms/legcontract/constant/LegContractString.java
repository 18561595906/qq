package com.haier.hop.ms.legcontract.constant;

/**
 * <p>
 *  合同使用常量类
 * </p>
 *
 * @author liugan	
 * @since 2019-10-10
 */
public class LegContractString {
	// 公司类型
	public static final String LETTER_A = "A";
	public static final String LETTER_B = "B";
	public static final String LETTER_C = "C";
	public static final String LETTER_F = "F";
	public static final String LETTER_E = "E";
	
	// 关联交易
	public static final String RELATED_TRANSATION = "1";
	// 非关联交易
	public static final String NON_RELATED_TRANSATION = "2";
	// 关联交易额度校验  1 够用
	public static final String TRANSATION_LIMIT_ENOUGH = "1";
	// 关联交易额度校验  2 不够
	public static final String TRANSATION_LIMIT_UNENOUGH = "2";
	// 无款项收付
	public static final String 无款项收付 = "5";
	// 关联交易金额占用，1169合同类型dicCode
	public static final String GET_CONTRACT_TYPE_1169 = "1169Type";
	// 关联交易金额占用，690合同类型dicCode
	public static final String GET_CONTRACT_TYPE_690 = "690Type";
	// 关联交易金额占用，生物医疗合同类型dicCode
	public static final String GET_CONTRACT_TYPE_F = "biology";
	
	// C类法律风控平台公议人字典表rowid
	public static final String CODE_C = "6901";
	// C类法律风控平台公议人字典表rowid
	public static final String CODE_C_互联网保险平台小微 = "6903";	
	// F类法律风控平台公议人字典表rowid
	public static final String CODE_F = "6902";
	
	// 指定业务单元
	 public static final String 互联网保险平台小微  = "CBU-JTCW-05";
	
	// 邮件相关
	public static final String EMAIL_HOST = "10.135.1.238";
	public static final String EMAIL_URL = "clss@haier.net";
	public static final String EMAIL_PASS = "";
	
	// nodeId
	// 业务主人
	public static final String NODEID_SIX = "6";
	// 财务风控平台
	public static final String NODEID_TWENTY = "20";	
	// 法律风控平台
	public static final String NODEID_TWENTYONE = "21";
	// 平台长审核
	public static final String NODEID_SEVENZEROONE = "7001";
	// 小微主审核
	public static final String NODEID_SEVENZERO = "7000";	
	
	// 我方业务主人
	public static final String LETTER_WFYWZR = "wfywzr";
	// 我方财务风控平台
	public static final String LETTER_WFFKPT = "wfcwfk";
	// 对方业务主人
	public static final String LETTER_DFYWZR = "dfywzr";
	// 对方财务风控平台
	public static final String LETTER_DFFKPT = "dfcwfk";
	// 法律风控C
	public static final String LETTER_FLFKC = "flfkc";
	// 法律风控F
	public static final String LETTER_FLFKF = "flfkf";
	// 我方平台主
	public static final String LETTER_WFPTZ = "xwzgy1";
	// 对方平台主
	public static final String LETTER_DFPTZ = "xwzgy2";
	// 内部合同并联公议节点展示标志
    public static final String IN_CONTRACT_SIGN = "inContract";
    // 借款担保合同并联公议节点展示标志
    public static final String JKDB_CONTRACT_SIGN = "jkdbContract";
	// 借款担保合同code
	public static final String LOANGUARANTEE_CODE = "CT-JK";
	// 借款担保小微主节点
	public static final String 担保小微主节点ID = "xwzgy";
	// 借款担保平台长节点
	public static final String 担保平台长节点ID = "ptzgy";
	// 借款担保三自平台主节点
	public static final String 担保三自平台主节点ID = "szptzgy";
	// 借款担保共享财务节点
	public static final String 担保共享财务节点ID = "gxcw";
	// 借款担保共享法务初审节点
	public static final String 担保共享法务初审节点ID = "gxfw1";
	// 借款担保共享法务复审节点
	public static final String 担保共享法务复审节点ID = "gxfw2";
	
	// 借款担保合同三自平台查询字典使用rowid
	public static final String ROWID_SANZI = "4567890";
	
	/* 特定值 */ 
	// 成功标志
	public static final Integer EXCEPTION_CODE_SUCCESS = 0;	
	// 逗号
	public static final String COMMA = ",";
	// 冒号
	public static final String COLON = ":";
	// 左斜线
	public static final String LEFT_SLASH = "/";
	public static final String BLANK = "";
	public static final String ZERO = "0";
	public static final String ONE = "1";
	public static final String TWO = "2";
	public static final String 合同类型_外部 = "1";
	public static final String 合同类型_内部 = "2";
	public static final String 合同类型_借款担保 = "3";
	public static final String NEGATIVE_TWO = "-2";
	// 同意
	public static final String 同意 = "1";
	// 不同意
	public static final String 不同意 = "0";
	// 合同类型
	public static final String COMPANY_TYPE = "合同类型：";
	// 我方业务主人
	public static final String WFYWZR = "我方业务主人";
	// 对方业务主人
	public static final String DFYWZR = "对方业务主人";
	// 我方财务风控平台
	public static final String WFCWPT = "我方财务风控平台";
	// 对方财务风控平台
	public static final String DFCWPT = "对方财务风控平台";
	// 平台长审核
	public static final String PTZSH = "平台长审核";
	// 小微主审核 
	public static final String XWZSH = "小微主审核";	
	// 法律风控平台
	public static final String FLFK = "法律风控平台";
	// 三自平台财务初审
	public static final String SZPTGY1  = "szptgy1";
	// 三自平台财务复审
	public static final String SZPTGY2 = "szptgy2";
	// 证券部初审
	public static final String ZQBGY1 = "zqbgy1";
	// 证券部复审
	public static final String ZQBGY2 = "zqbgy2";
	// 平台主
	public static final String XWZGY = "xwzgy";
	// 直接采购合同
	public static final String HTGLXT = "HTGLXT";
	
	// 海模智云
	public static final String HMZY = "HMZY";
	
	// 直接采购合同法律风控固定公议人
	public static final String  GYR_法律风控 = "HTGLXTLawyer";
	// 固定平台长
	public static final String PTZ_固定 = "zjcg_ptz";
	// 给直接采购回传审批信息的地址
	public static final String HTGLXT_URL = "HTGLXT_URL";
	
	// 好品海智
	public static final String HPHZPT = "HPHZPT";
	// 好品海智签约方code
	public static final String 好品海智签约方 = "0EK0";
	// 好品海智业务单元1（需相应合同）
	public static final String 好品海智业务单元1 = "CBU-690-04-06";
	// 好品海智合同code 
	public static final String 好品海智合同 = "CT-SP-01-01";
	// 好品海智业务单元2
	public static final String 好品海智业务单元2 = "CBU-690-01-01-13";
	// 好品海智 printUrl
	public static final String PRINT_URL = "999999976";
	// 好品海智 viewUrl
	public static final String VIEW_URL = "999999975";
	// PDF
	public static final String PDF = "1";
	// 扫描件
	public static final String 扫描件 = "0";
	// 是
	public static final String 是 = "1";  
	// 否
	public static final String 否 = "0";
	// 关联交易额度占用不足时，errorMessage
	public static final String AMOUNTNOTENOUGH = "该合同金额超过了年初由法人公司财务提报的同类关联交易额度上限，"
												 +"请与合同中上市子公司财务落实是否有剩余的额度可以调整，"
												 +"若有，则请将业务负责人、法人公司财务签署备案的额度调整说明"
												 +"（至少应涵盖需要调整额度的法人公司的名称、需要调整的额度，"
												 +"年初未申报原因、后续关差措施，该合同的业务交易背景，拟签订的合同文本）"
												 +"邮件至上市公司证券部、财务部备案后，证券部可后台调整。若本平台额度不足，"
												 +"可跨产业调整额度，需要的流程、材料参考前述"; 
	//  签约方不能走借款担保合同
	public static final String GOLOANGUARANTEE = "签约方不能走借款担保合同";
	// 错误信息
	public static final String ERR_MESSAGE = "系统错误,请联系运维人员!";

	// 交易关联额度check:2 不够用
	public static final String 不够用 = "2";
	
	// 退回原因 其他
	public static final String REASON_其他 = "5";
	// 退回原因 合同类型
	public static final String REASON_合同类型 = "4";
	
	/* 内部合同邮件使用模板code */
	// 内部合同申报提交发给对方业务人
	public static final String 申报发给对方业务人 = "incontractcomm01";
	// 内部合同申报提交发给并联公议人/三自平台/证券部/平台长
	public static final String 申报发给并联公议人 = "incontractcomm02";
	// 内部合同并联公议驳回通知/三自平台驳回/证券部/平台长
	public static final String 并联公议驳回通知 = "incontractcomm03";
	// 证券部通过到用印申请
	public static final String 证券部通过到用印申请 = "incontractcomm04";
	// 电子用印退回
	public static final String 电子用印退回 = "incontractcomm05";
	// 内部合同撤回（申报人）
	public static final String 内部合同撤回申报人 = "incontractcomm06";
	// 电子用印撤回（相应节点）
	public static final String 内部合同撤回相应节点 = "incontractcomm07";
	// 内部合同删除通知申报人
	public static final String 内部合同删除通知申报人 = "incontractcomm08";	
	// 内部合同删除通知需审批
	public static final String 用印确认删除通知 = "incontractcomm09";	
	// 用印确认撤回通知
	public static final String 用印确认撤回通知 = "incontractcomm10";
	
	/* 借款担保合同邮件使用模板code */
	// 借款担保流程通过邮件
	public static final String 借款担保流程通过邮件 = "legLoanGuarantee01";
	// 借款担保小微主审核驳回
	public static final String 借款担保小微主审核驳回邮件 = "legLoanGuarantee02";
	// 平台长授权办理邮件
	public static final String 平台长授权办理邮件 = "legLoanGuarantee03";
	
	public static final String 直接采购_文件 =  "contract";
	// 合同附件pdf
	public static final String 合同附件pdf = "8";
	// 合同扫描件
	public static final String 合同扫描件 = "6";
	
	// 标准内部合同申报提交发给并联公议人
	public static final String 标准内部合同申报发给并联公议人 = "incontractcomm11";
	// 非标准内部合同申报提交发给并联公议人
	public static final String 非标准内部合同申报发给并联公议人 = "incontractcomm12";
	
	// 标准外部合同申报提交发给并联公议人
	public static final String 标准外部合同申报发给并联公议人 = "incontractcomm13";
	// 非标准外部合同申报提交发给并联公议人
	public static final String 非标准外部合同申报发给并联公议人 = "incontractcomm14";
}
