package com.zero.constant;
/**
 * @创建人 caiyonggang
 * @创建时间 2016年12月20日下午3:58:16
 * @说明 通道对应的字段定义
 * @备注
 */
public class PathConstant{
	
	/**
	 * 中金 机构编号
	 */
	public static final String InstitutionID = "InstitutionID";
	/**
	 * 中金银行ID
	 */
	public static final String BankID = "BankID";
	/**
	 * 中金交易流水号
	 */
	public static final String TxSNBinding = "TxSNBinding";	
	/**
	 *  中金 账户名称
	 */
	public static final String AccountName = "AccountName";
	/**
	 *  中金账户号码
	 */
	public static final String AccountNumber = "AccountNumber";
	
	/**
	 * 账户类型
	 */
	public static final String AccountType = "AccountType";
	/**
	 * 中金开户证件类型
	 */
	public static final String IdentificationType = "IdentificationType";
	/**
	 *  中金开户证件号码
	 */
	public static final String IdentificationNumber = "IdentificationNumber";
	/**
	 * 中金信用卡有效期，格式YYMM
	 */
	public static final String ValidDate = "ValidDate";
	/**
	 *  中金信用卡背面的末3位数字
	 */
	public static final String CVN2 = "CVN2";
	/**
	 * 中金卡类型(10-借记卡，20-贷记卡)
	 */
	public static final String CardType = "CardType";
	/**
	 * 中金手机号
	 */
	public static final String PhoneNumber = "PhoneNumber";
	/**
	 *中金短信验证码
	 */
	public static final String SMSValidationCode = "SMSValidationCode";
	
	/**
	 * 中金返回码
	 */
	public static final String Code = "Code";
	/**
	 * 返回状态信息
	 */
	public static final String Message = "Message";
	
	/**
	 * 考拉账户号码
	 */
	public static final String accountNo = "accountNo";
	
	/**
	 * 附言
	 */
	public static final String Remark = "Remark";
	/**
	 * 邮箱
	 */
	public static final String Email = "Email";
	/**
	 * 账户名称
	 */
	public static final String name = "name";
	/**
	 * 考拉开户证件号码 四要素使用
	 */
	public static final String idCardCore = "idCardCore";
	/**
	 * 考拉开户证件号码 二要素使用
	 */
	public static final String idCardCode = "idCardCode";
	/**
	 * 考拉手机号
	 */
	public static final String bankPreMobile = "bankPreMobile";
	/**
	 * 考拉交易流水号
	 */
	public static final String outOrderNo = "outOrderNo";
	/**
	 * 考拉请求头 客户号
	 */
	public static final String customerId = "customerId";
	/**
	 * 考拉四要素产品组编码
	 */
	public static final String prdGrpId = "prdGrpId";
	/**
	 * 考拉四要素产品编码
	 */
	public static final String prdId = "prdId";
	/**
	 * 考拉二要素产品组编码
	 */
	public static final String productGroupId2="productGroupId2";
	/**
	 * 考拉二要素产品编码
	 */
	public static final String productId2="productId2";
	
	/**
	 * 考拉三要素产品组编码
	 */
	public static final String productGroupId3="productGroupId3";
	/**
	 * 考拉三要素产品编码
	 */
	public static final String productId3="productId3";
	/**
	 * 签名串
	 */
	public static final String sign = "sign";
	/**
	 * 请求数据
	 */
	public static final String reqData = "reqData";
	/**
	 * 考拉返回的消息流水号
	 */
	public static final String jnlNo = "jnlNo";
	/**
	 * 考拉返回的状态
	 */
	public static final String result = "result";
	/**
	 * 考拉返回的状态信息
	 */
	public static final String message = "message";
	
	/**
	 * 现代支付功能码
	 */
	public static final String funcode = "funcode";
	/**
	 * 现代支付商户唯一标识 在微信支付统一下单接口之后 是公众号 标识
	 */
	public static final String appId = "appId";
	/**
	 * 现代支付 持卡人姓名
	 */
	public static final String idCardName = "idCardName";
	/**
	 * 现代支付certiType 证件类型 只支持身份证
	 */
	public static final String certiType = "certiType";
	/**
	 * 现代支付证件号码
	 */
	public static final String idCard = "idCard";
	/**
	 * 现代支付银行卡号
	 */
	public static final String bankCardNum = "bankCardNum";
	/**
	 * 银行卡预留手机号
	 */
	public static final String mobile = "mobile";
	/**
	 * 现代支付商户订单号 流水号 
	 */
	public static final String mhtOrderNo = "mhtOrderNo";
	
	/**
	 * 现在支付对应的 MD5加密的
	 * 
	 */
	public static final String md5Key = "md5Key";
	/**
	 * 现代支付对应的des加密的
	 */
	public static final String des3Key = "des3Key";
	
	/**
	 * 现代支付鉴权提价的url
	 */
	public static final String nowPayUrl = "nowPayUrl";
	
	/**
	 * 现代支付返回的状态码
	 */
	public static final String responseCode = "responseCode";
	/**
	 * 现代支付返回的状态信息
	 */
	public static final String responseMsg = "responseMsg";
	/**
	 *  返回的状态
	 */
	public static final String status = "status";
	/**
	 * 现代支付返回的响应对象
	 */
	public static final String responseParams = "responseParams";
	
	/**
	 * 信联认证配置机构标识
	 */
	public static final String insId = "insId";
	/**
	 * 信联信联提供的商联操作员
	 */
	public static final String operId = "operId";
	/**
	 * 信联提供的私钥
	 */
	public static final String xlprivKey = "xlprivKey";
	/**
	 * 信联提供的公钥
	 */
	public static final String xlpubKey = "xlpubKey";
	/**
	 * 信联接口请求url
	 */
	public static final String xinLianUrl = "xinLianUrl";
	/**
	 * 银行卡号
	 */
	public static final String cardNo = "cardNo";
	/**
	 * 信联身份证号
	 */
	public static final String cidNo = "cidNo";
	/**
	 * 信联流水号
	 */
	public static final String cooperSerialNo = "cooperSerialNo";
	/**
	 * 版本号
	 */
	public static final String version = "version";
	/**
	 * 上海银商电子银行卡bin业务类型
	 */
	public static final String tradeTypeBin = "tradeTypeBin";
	/**
	 * 上海银商电子四要素业务类型
	 */
	public static final String tradeTypeFour = "tradeTypeFour";
	/**
	 * 上海银商电子三要素业务类型
	 */
	public static final String tradeTypeThree = "tradeTypeThree";
	/**
	 * 上海银商电子商户号
	 */
	public static final String merchant = "merchant";	
	/**
	 *  订单号（商户端产生的流水号）
	 */
	public static final String orderId = "orderId";
	/**
	 *  发起时间
	 */
	public static final String reqTime = "reqTime";
	
	/**
	 * 银商订单号（银商产生的流水号）
	 */
	public static final String ysOrderId = "ysOrderId";
	/**
	 * 上海银商电子 或者杭州鉴权返回码
	 */
	public static final String retCode = "retCode";
	/**
	 *  上海银商电子错误信息
	 */
	public static final String retMsg = "retMsg";
	/**
	 * 借贷标志
	 */
	public static final String dcType = "dcType";
	/**
	 * 证件类型
	 */
	public static final String idType = "idType";
	/**
	 * 证件号
	 */
	public static final String idNo = "idNo";
	/**
	 * 手机
	 */
	public static final String phoneNo = "phoneNo";
	
	/**
	 * 验证结果代码
	 */
	public static final String chkCode = "chkCode";
	/**
	 * 验证结果说明
	 */
	public static final String chkMsg = "chkMsg";
	
	/**
	 * 分配的商户密钥
	 */
	public static final String ylMerchantKey = "xlMerchantKey";
	
	/**
	 * 上海银商电子接口请求url
	 */
	public static final String shysdzUrl = "shysdzUrl";
	
	/**
	 * 上海银商电子接口请求key
	 */
	public static final String shysdzKey = "shysdzKey";
	
	/**
	 * 信联返回状态
	 */
	public static final String rspCod = "rspCod";
	
	/**
	 * 信联返回状态信息
	 */
	public static final String rspMsg = "rspMsg";
	
	/**
	 * haoservice接口请求url
	 */
	public static final String haoserviceUrl = "haoserviceUrl";
	
	/**
	 * haoservice接口请求密钥
	 */
	public static final String haoserviceKey = "haoserviceKey";
	
	/**
	 *haoservice姓名 
	 */
	public static final String realName = "realName";
	
	// 短信通道对应字段===================================
	/**
	 * 移通网络请求地址
	 */
	public static final String mlinkUrl = "mlinkUrl";
	/**
	 * 移通网络操作命令 单条
	 */
	public static final String command = "command";
	/**
	 * 移通网络 操作用户编号
	 */
	public static final String spid = "spid";
	/**
	 * 1 移通网络 操作用户密码
	 */
	public static final String sppassword = "sppassword";
	/**
	 * 移通网络 服务代码
	 */
	public static final String spsc = "spsc";
	/**
	 * 编码方式 
	 */
	public static final String dc = "dc";
	/**
	 * 编码字符集
	 */
	public static final String ecodeform = "ecodeform";
	
	/**
	 * 壹信通（软维）请求地址
	 */
	public static final String yxtUrl = "yxtUrl";
	/**
	 * 壹信通（软维）用户ID
	 */
	public static final String userid = "userid";
	/**
	 * 壹信通（软维）用户账户
	 */
	public static final String account = "account";
	/**
	 * 壹信通（软维）用户密码
	 * 或者  通联用户名密码
	 */
	public static final String password = "password";
	/**
	 * 阿里 Appkey 固定值
	 */
	public static final String appKey = "appKey";
	/**
	 * 阿里appSecret固定值
	 */
	public static final String appSecret = "appSecret";
	/**
	 * 阿里aliErrorkey 返回错误码 固定值 
	 * 对应最新的 主题名称 
	 */
	public static final String aliErrorkey = "aliErrorkey";
	/**
	 * 移通网络返回状态码
	 */
	public static final String mterrcode= "mterrcode";
	/**
	 * 移通网络返回状态信息
	 */
	public static final String mtstat= "mtstat";
	/**
	 * //移通网络返回
	 */
	public static final String mtmsgid= "mtmsgid";
	
	/**
	 * 壹信通返回状态
	 */
	public static final String returnstatus= "returnstatus";
	/**
	 * 壹信通返回id
	 */
	public static final String taskID= "taskID";
	/**
	 * 壹信通返回
	 */
	public static final String remainpoint = "remainpoint";
	/**
	 * 微信接口返回状态码
	 */
	public static final String errcode = "errcode";
	/**
	 * 微信接口返回的状态信息
	 */
	public static final String errmsg = "errmsg";
	/**
	 * 微信接口返回的access_token
	 */
	public static final String access_token = "access_token";
	/**
	 * 微信要发送的用户标识 对应openid
	 */
	public static final String touser = "touser";
	/**
	 * 上送给微信接口的模板id
	 */
	public static final String template_id = "template_id";
	/**
	 * 上送微信详情的url
	 */
	public static final String url = "url";
	/**
	 * 金额 
	 */
	public static final String Amount = "Amount";
	/**
	 * 中金对应分支行名称
	 */
	public static final String BranchName = "BranchName";
	/**
	 * 中金对应分支行省份
	 */
	public static final String Province = "Province";
	/**
	 *  中金对应分支行城市
	 */
	public static final String City = "City";
	/**
	 * 中金对应结算标识
	 */
	public static final String SettlementFlag = "SettlementFlag";
	/**
	 * 中金对应备注
	 */
	public static final String Note = "Note";
	/**
	 * 中金对应 协议用户编号。目前允许为空
	 */
	public static final String ContractUserID = "ContractUserID";
	/**
	 *  中金支付对应 交易流水
	 */
	public static final String TxSN = "TxSN";
	/**
	 * 中金支付对应 2000时ResponseCode的返回状态码
	 */
	public static final String ResponseCode = "ResponseCode";
	/**
	 * 中金支付对应 2000时ResponseMessage的返回状态码
	 */
	public static final String ResponseMessage = "ResponseMessage";
	/**
	 * 中金直清支付订单号
	 */
	public static final String OrderNo = "OrderNo";
	/**
	 * 中金直清 收款方列表 . 收款方名称，出现次数：0…n
	 */
	public static final String Payees = "Payees";
	/**
	 * 中金返回银行处理时间
	 */
	public static final String BankTxTime = "BankTxTime";
	/**
	 * 中金支付交易号
	 */
	public static final String PaymentNo = "PaymentNo";
	/**
	 * 中金支付平台收到银行通知时间，格式：YYYYMMDDhhmmss
	 */
	public static final String BankNotificationTime = "BankNotificationTime";
	/**
	 * 中金1341市场订单结算（结算）交易流水号
	 */
	public static final String SerialNumber = "SerialNumber";
	/**
	 * 中金1341市场订单结算（结算）账户名称
	 */
	public static final String PaymentAccountName = "PaymentAccountName";
	
	/**
	 * 中金1341市场订单结算（结算）账户号码
	 */
	public static final String PaymentAccountNumber = "PaymentAccountNumber";
	/**
	 * 中金1510 1520中金批量代付 批次号
	 */
	public static final String batchNo = "batchNo";
	/**
	 *  中金1510 1520中金批量代付 批次提交时间  格式：yyyyMMddhhmmss
	 */
	public static final String txTime = "txTime";
	/**
	 * 中金1510 1520中金批量代付 总金额，单位：分
	 */
	public static final String totalAmount = "totalAmount";
	/**
	 * 中金1510 1520中金批量代付 总笔数
	 */
	public static final String totalCount = "totalCount";
	/**
	 * 中金1510 1520中金批量代付 代付明细
	 */
	public static final String paymentItemList = "paymentItemList";
	/**
	 *中金1510批量 代付标识 0=普通代付 1=支付账户余额代付   传值为1
	 */
	public static final String paymentFlag = "paymentFlag";
	/**
	 * 中金1510批量 代付 记录流水
	 */
	public static final String itemNo = "itemNo";
	
	//一网通 使用的字段-----------------------------
	/**
	 * 一网通 参数编码,固定为“UTF-8” UTF-8
	 */
	public static final String charset = "charset";
	/**
	 *一网通 签名算法,固定为“SHA-256” SHA-256 
	 */
	public static final String signType = "signType";
	/**
	 * 一网通  请求时间 格式：yyyyMMddHHmmss
	 */
	public static final String dateTime = "dateTime";
	/**
	 * 一网通   商户分行号，4位数字 
	 */
	public static final String branchNo = "branchNo";
	  
	/**
	 * 一网通   商户号，6位数字 
	 */
	public static final String merchantNo = "merchantNo";
	/**
	 * 一网通使用签名商户私钥
	 */
	public static final String privateKey = "privateKey";
	/**
	 * 一网通   订单日期,格式：yyyyMMdd
	 */
	public static final String date = "date";
	
	/**
	 * 1  一网通   订单号 10位数字，由商户生成，一天内不能重复。
	 * 2  银联订单号
	 */
	public static final String orderNo = "orderNo";
	
	/**
	 * 一网通时 金  格式：xxxx.xx固定两位小数，最大11位整数 0.01 
	 *  通联时为分 整数
	 */
	public static final String amount = "amount";
	/**
	 * 一网通  过期时间跨度 必须为大于零的整数，单位为分钟。该参数指定当前支付请求必须在指定时间跨度内完成（从系统收到支付请求开始计时），否则按过期处理。一般适用于航空客票等对交易完成时间敏感的支付请求。 30 
	 */
	public static final String expireTimeSpan = "expireTimeSpan";
	
	/**
	 * 一网通  M 成功支付结果通知地址,商户接收成功支付结果通知的地址。 
	 */
	public static final String payNoticeUrl = "payNoticeUrl";
	/**
	 * 一网通   O 成功支付结果通知附加参数,该参数在发送成功支付结果通知时，将原样返回商户
	 * 注意：该参数可为空，商户如果需要不止一个参数，可以自行把参数组合、拼装，但组合后的结果不能带有’&’字符。 12345678|ABCDEFG|HIJKLM 
	 */
	public static final String payNoticePara = "payNoticePara";
	/**
	 * 一网通 O 成功页返回商户地址,支付成功页面上“返回商户”按钮跳转地址。为空则不显示“返回商户”按钮
	 */
	public static final String returnUrl = "returnUrl";
	/**
	 * 一网通 O 商户取得的客户IP，如果有多个IP用逗号”,”分隔。 99.12.38.165 
	 */
	public static final String clientIP = "clientIP";
	/**
	 * 1 一网通 O 允许支付的卡类型,默认对支付卡种不做限制，储蓄卡和信用卡均可支付 A:储蓄卡支付，即禁止信用卡支付  
	 * 2   银联卡 0-银行卡  1-存折
	 */
	public static final String cardType = "cardType";
	/**
	 * 一网通 M 客户协议号。必须为纯数字串，不超过30位。
	 * 未签约（首次支付）客户，填写新协议号，用于协议开通；
	 * 已签约（再次支付）客户，填写该客户已有的协议号。商户必须对协议号进行管理，确保客户与协议号一一对应。 12345678901234567890 
	 */
	public static final String agrNo = "agrNo";
	/**
	 * 一网通 C 协议开通请求流水号，开通协议时必填。 
	 */
	public static final String merchantSerialNo = "merchantSerialNo";
	
	/**
	 * 一网通  O 用于标识商户用户的唯一ID。商户系统内用户唯一标识，不超过20位，数字字母都可以，建议纯数字
	 */
	public static final String userID = "userID";
	/**
	 * 一网通   O 经度，商户app获取的手机定位数据，如30.949505 30.949505 
	 */
	public static final String lon = "lon";
	/**
	 * 一网通    O 纬度，商户app获取的手机定位数据，如50.949506 50.949506 
	 */
	public static final String lat = "lat";
	/**
	 * 一网通    O 风险等级:用户在商户系统内风险等级标识  
	 */
	public static final String riskLevel = "riskLevel";
	/**
	 * 一网通    C 成功签约结果通知地址:
	 * 首次签约，必填。商户接收成功签约结果通知的地址。
	 */
	public static final String signNoticeUrl = "signNoticeUrl";
	/**
	 *一网通      O 成功签约结果通知附加参数:
	 *该参数在发送成功签约结果通知时，将原样返回商户
	 *注意：该参数可为空，商户如果需要不止一个参数，可以自行把参数组合、拼装，但组合后的结果不能带有’&’字符。 12345678|ABCDEFG|HIJKLM 
	 */
	public static final String signNoticePara = "signNoticePara";
	/**
	 *一网通    O json格式写入的扩展信息，并使用extendInfoEncrypType指定的算法加密
	 */
	public static final String extendInfo = "extendInfo";
	/**
	 *一网通    O 扩展信息的加密算法
	 *扩展信息加密类型，取值为RC4或DES
	 *加密密钥：取值为RC4时，密钥为商户支付密钥；
	 *取值为DES时，密钥为商户支付密钥的前8位，不足8位则右补0
	 *注意：如果扩展信息字段非空，该字段必填
	 */
	public static final String extendInfoEncrypType = "extendInfoEncrypType";
	/**
	 * 一网通 最终请求参数key 
	 */
	public static final String jsonRequestData = "jsonRequestData";
	
	public static final String cancelAgereementTxcode = "cancelAgereementTxcode";
	
	public static final String cancelAgereementUrl = "cancelAgereementUrl";
	/**
	 * 一网通交易码
	 */
	public static final String txCode = "txCode";
	/**
	 * 一网通返回的业务数据
	 */
	public static final String noticeData = "noticeData";
	/**
	 * 一网通查询订单状态 查询类型,A：按银行订单流水号查询B：按商户订单日期和订单号查询；
	 */
	public static final String type = "type";
	/**
	 *  一网通 C 银行订单流水号,type=A时必填
	 */
	public static final String bankSerialNo = "bankSerialNo";
	/**
	 *  一网通  O商户结账系统的操作员号
	 */
	public static final String operatorNo = "operatorNo";
	
	/**
	 * 微信支付使用的 有效期为两个小时的有效 临时票据
	 */
	public static final String jsapi_ticket = "jsapi_ticket";
	/**
	 * 微信支付使用的 随机数
	 */
	public static final String noncestr = "noncestr";
	/***
	 * 微信支付 使用的时间戳
	 */
	public static final String timestamp = "timestamp";
	/**
	 * 微信支付 公众号唯一标识
	 */
	public static final String appid = "appid";
	/**
	 * 微信支付引导用户使用 微信支付获取的签名
	 */
	public static final String signature = "signature";
	/**
	 * 微信支付商户号
	 */
	public static final String mch_id = "mch_id";
	/**
	 * 微信支付（服务商子商户号）
	 */
	public static final String sub_mch_id = "sub_mch_id";
	/**
	 * 1，微信支付 订单号-
	 * 2，支付宝上送的订单号
	 */
	public static final String out_trade_no = "out_trade_no";
	
	/**
	 * 微信支付  随机数
	 */
	public static final String nonce_str = "nonce_str";
	/**
	 * 1 微信支付 附言
	 * 2回调商户返回的状态信息
	 */
	public static final String body = "body";
	/**
	 * 微信支付金额  单位 分
	 */
	public static final String total_fee = "total_fee";
	/**
	 * 微信支付 终端ip
	 */
	public static final String spbill_create_ip = "spbill_create_ip";
	/**
	 * 微信支付（官微） 通知地址
	 */
	public static final String notify_url = "notify_url";
	/**
	 * 微信支付（服务商） 通知地址
	 */
	public static final String servProNotifyUrl = "servProNotifyUrl";
	/**
	 * 微信支付公众号扫码付模式二回调地址
	 */
	public static final String nativeNotifyUrl = "nativeNotifyUrl";
	
	/**
	 * 微信支付 交易类型
	 */
	public static final String trade_type = "trade_type";
	/**
	 * 微信支付 用户标识
	 */
	public static final String openid = "openid";
	/**
	 * 微信支付 用户自定义内容 原样返回
	 */
	public static final String attach = "attach";
	/**
	 * 微信支付 统一下单接口返回的订单标识
	 */
	public static final String prepay_id = "prepay_id";
	
	/**
	 * 微信支付 统一下单接口  随机数
	 */
	public static final String nonceStr = "nonceStr";
	/**
	 * 微信支付 统一下单接口 时间戳
	 */
	public static final String timeStamp = "timeStamp";
	/**
	 * 一网通对账开始日期
	 */
	public static final String beginDate = "beginDate";
	/**
	 * 一网通对账结束日期
	 */
	public static final String endDate = "endDate";
	/**
	 * 一网通 对账续传字段
	 */
	public static final String nextKeyValue = "nextKeyValue";
	/**
	 * 一网通对账返回业务数据字段 其中包括对账明细和是否还需续传等信息
	 */
	public static final String rspData = "rspData";
	/**
	 * 一网通对账返回状态
	 */
	public static final String rspCode = "rspCode";
	/**
	 * 一网通对账返回的明细数据列表
	 */
	public static final String dataList = "dataList";
	
	/**
	 * 一网通对账返回是否询结束 Y为未结束 N为结束
	 */
	public static final String hasNext = "hasNext";
	
	/**
	 * 一网通 上送字符集
	 */
	public static final String charset_netpay = "charset_netpay";
	/**
	 * 一网通 上送版本号
	 */
	public static final String version_netpay = "version_netpay";
	/**
	 * 一网通 获取验签公钥请求地址
	 */
	public static final String pubKeyUrl = "pubKeyUrl";
	/**
	 * 一网通 进行对账下载请求地址
	 */
	public static final String netPaySettleUrl = "netPaySettleUrl";
	/**
	 * 一网通 进行单笔订单查询请求地址
	 */
	public static final String netPayStatusQueryUrl = "netPayStatusQueryUrl";
	
	/**
	 * 一网通 签约成功回调时 原样返回商户在签约或一网通支付请求报文中传送的成功签约通知附加参数
	 */
	public static final String noticePara = "noticePara";
	
	/**
	 * 一网通 支付成功回调时 商户附加参数，原样返回商户在一网通支付请求报文中传送的成功支付结果通知附加参数
	 */
	public static final String merchantPara = "merchantPara";
	
	/**
	 * 调用一网通加密使用的私钥key
	 */
	public static final String netPaymerPrivatekey = "netPaymerPrivatekey";
	/**
	 * 一网通签约+支付请求地址
	 */
	public static final String netPayUrl = "netPayUrl";
	/**
	 * 引导用户使用微信支付（官微）的重定向的地址
	 */
	public static final String redirect_uri = "redirect_uri";
	/**
	 * 引导用户使用微信支付（服务商）的重定向的地址
	 */
	public static final String servicePredirectUri = "servicePredirectUri";
	
	/**
	 * 微信引导用户使用微信支付 上送给微信的重定向的地址和数据
	 */
	public static final String redirectUriAndData = "redirectUriAndData";
	/**
	 * 商联的域名 微信支付时使用
	 */
	public static final String sl_domain = "sl_domain";
	/**
	 * 微信支付前台回调地址
	 */
	public static final String notifyFrontUrl = "notifyFrontUrl";
	/**
	 * 微信支付（服务商）前台回调地址
	 */
	public static final String servProNotifyFrontUrl = "servProNotifyFrontUrl";
	
	/**
	 * 微信统一下单接口
	 */
	public static final String wxUnifiedOrderUrl = "wxUnifiedOrderUrl";
	/**
	 * 微信支付金额 最后是分为单位
	 */
	public static final String totalfee = "totalfee";
	/**
	 * 微信订单 中间传值使用
	 */
	public static final String tradeNo = "tradeNo";
	/**
	 * 一网通查询订单状态时订单状态
	 */
	public static final String orderStatus = "orderStatus";
	/**
	 * 一网通返回的银行受理时间
	 */
	public static final String bankDate = "bankDate";
	/**
	 * 微信返回的通信标识
	 */
	public static final String return_code = "return_code";
	/**
	 * 微信返回的交易标识
	 */
	public static final String result_code = "result_code";
	/**
	 * 微信支付后台通知的错误返回的信息码
	 */
	public static final String err_code = "err_code";
	
	/**
	 * 微信支付后台通知的错误返回的信息描述
	 */
	public static final String err_code_des = "err_code_des";
	/**
	 * 微信通知时支付时间
	 */
	public static final String time_end = "time_end";
	/**
	 * 微信通信标识对应的描述信息
	 */
	public static final String return_msg = "return_msg";
	/**
	 * 微信查询接口返回的交易状态码
	 */
	public static final String trade_state = "trade_state";
	/**
	 * 微信查询接口返回的交易状态码描述
	 */
	public static final String trade_state_desc = "trade_state_desc";
	/**
	 * 微信获取的支付凭证
	 */
	public static final String ticket = "ticket";
	/**
	 * 商户号
	 */
	public static final String merchCode = "merchCode";
	/**
	 * 产品编号
	 */
	public static final String productCode = "productCode";
	/**
	 * 请求服务所提交的对应数据变量集合json串
	 */
	public static final String jsonStr = "jsonStr";
	/**
	 * 商户私有域
	 */
	public static final String merchPrivate = "merchPrivate";
	/**
	 * 交易时间
	 *  工行  返回通知日期时间
	 */
	public static final String tranTime = "tranTime";
	/**
	 * 者杭州鉴权 返回码描述
	 */
	public static final String retDesc = "retDesc";
	/**
	 * 本系统为null
	 */
	public static final String retInfo = "retInfo";
	/**
	 * 证件号 、身份证号
	 */
	public static final String certId = "certId";
	/**
	 * 姓名
	 */
	public static final String certName = "certName";
	/**
	 * 银行卡号
	 */
	public static final String cardId = "cardId";
	/**
	 * 手机号
	 */
	public static final String mp = "mp";
	/**
	 * 银联结算标识
	 */
	public static final String merId = "merId";
	/**
	 * 订单日期
	 */
	public static final String transDate = "transDate";
	/**
	 * 银联开户行号
	 */
	public static final String openBankId = "openBankId";
	/**
	 * 银联持卡人姓名
	 */
	public static final String usrName = "usrName";
	/**
	 * 银联证件类型
	 */
	public static final String certType = "certType";
	/**
	 * 金额 分 订单金额
	 */
	public static final String transAmt = "transAmt";
	/**
	 * 银联公钥
	 */
	public static final String pubkey = "pubkey";
	/**
	 * 私钥密码
	 */
	public static final String prvkeypwd = "prvkeypwd";
	/**
	 * 私钥
	 */
	public static final String prvkey = "prvkey";
	/**
	 * 银联交易状态
	 */
	public static final String transStat = "transStat";
	/**
	 * 签名值
	 */
	public static final String chkValue = "chkValue";
	/**
	 * 币种
	 */
	public static final String curyId = "curyId";
	/**
	 * 交易类型
	 */
	public static final String transType = "transType";
	/**
	 * 私有域
	 */
	public static final String priv1 = "priv1";
	/**
	 * 网关号
	 */
	public static final String gateId = "gateId";
	
	/**
	 *中金支付查询返回的银行处理时间 
	 */
	public static final String bankTxTime = "bankTxTime";
	
	/**
	 *通联用户名通道分配
	 */
	public static final String userName = "userName";
	
	/**
	 *通联商户号
	 */
	public static final String merchant_id = "merchant_id";
	
	/**
	 *通联业务代码
	 */
	public static final String busicode = "busicode";
	/**
	 *通联提交时间 yyyyMMddHHmmss
	 */
	public static final String submit_time = "submit_time";
	
	/**
	 *通联账户名称
	 */
	public static final String account_name = "account_name";
	/**
	 *通联账户号码
	 */
	public static final String account_no = "account_no";
	/**
	 *通联账户属性  账号属性 0私人，1公司。不填时，默认为私人
	 */
	public static final String account_prop = "account_prop";
	/**
	 * 通联银行编码
	 */
	public static final String bank_code = "bank_code";
	/**
	 * 通联通道用户名简写 商户自定义 
	 */
	public static final String cust_userid = "cust_userid";
	/**
	 * 通联手机号
	 */
	public static final String tel = "tel";
	/**
	 * 通联 私钥
	 */
	public static final String pfxPath = "pfxPath";
	/**
	 * 通联 私钥密码
	 */
	public static final String pfxPassword = "pfxPassword";
	/**
	 * 通联公钥
	 */
	public static final String tltcerPath = "tltcerPath";
	
	/**
	 * 通联流水号
	 */
	public static final String req_sn = "req_sn";
	/**
	 * 通联支付交易代码
	 */
	public static final String trx_code = "trx_code";
	/**
	 * 通联数据类型
	 */
	public static final String data_type = "data_type";
	/**
	 * 通联返回通讯状态码
	 */
	public static final String ret_code = "ret_code";
	/**
	 * 通联返回通讯状态码描述
	 */
	public static final String err_msg = "err_msg";
	/**
	 * 通联 通讯时间 这个接口文档中没有定义
	 */
	public static final String reptime = "reptime";
	/**
	 *  通联 交易状态
	 */
	public static final String tran_ret_code = "tran_ret_code";
	/**
	 *  通联 交易状态描述
	 */
	public static final String tran_err_msg = "tran_err_msg";
	/**
	 * 通联 sn 记录序号 也就是原请求交易中的SN的值
	 */
	public static final String sn = "sn";
	/**
	 * 通联 清算日期 yyyyMMdd
	 */
	public static final String settday = "settday";
	/**
	 *  通联 完成时间
	 */
	public static final String fintime = "fintime";
	/**
	 *  通联 证件类型
	 */
	public static final String id_type = "id_type";
	/**
	 * 通联 证件号
	 */
	public static final String id = "id";
	/**
	 * 中金单笔对账返回的列表
	 */
	public static final String txList = "txList";
	/**
	 * 一网通查询协议号地址
	 */
	public static final String netPayQueryUrl = "netPayQueryUrl";
	/**
	 * 一网通取消协议号地址
	 */
	public static final String netPayCancelUrl = "netPayCancelUrl";
	/**
	 * 微信对账日期
	 * 支付宝对账日期
	 */
	public static final String bill_date = "bill_date";
	/**
	 * 微信对账类型 成功或者全部
	 * 支付宝对账类型
	 */
	public static final String bill_type = "bill_type";
	/**
	 * 微信支付签名使用的安全加密的key对应数据库表mc_clearing_rel_path的des_key
	 */
	public static final String wechatSafeKey = "wechatSafeKey";
	/**
	 * 一网通查询入账明细api请求地址
	 */
	public static final String netPayQueryAccountList = "netPayQueryAccountList";
	/**
	 * 一网通退款使用
	 */
	public static final String refundSerialNo = "refundSerialNo";
	/**
	 * 一网通退款描述
	 */
	public static final String desc = "desc";
	/**
	 * 一网通退款时使用的商户登录员的密码
	 */
	public static final String pwd = "pwd";
	/**
	 * 一网通退款请求地址
	 */
	public static final String netPayDoRefundUrl = "netPayDoRefundUrl";
	/**
	 * 微信退款使用的微信订单号
	 */
	public static final String transaction_id = "transaction_id";
	/**
	 * 微信退款订单号
	 */
	public static final String out_refund_no = "out_refund_no";
	/**
	 * 微信退款金额 单位分
	 * 支付宝退款总金额 单位元
	 */
	public static final String refund_fee = "refund_fee";
	/**
	 * 一网通返回的对账条数 每一页的条数
	 */
	public static final String dataCount = "dataCount";
	/**
	 * 微信退款时退币种类 默认为 CNY
	 */
	public static final String refund_fee_type = "refund_fee_type";
	/**
	 * 微信退款原因
	 */
	public static final String refund_desc = "refund_desc";
	/**
	 * 退款资金来源
	 * 仅针对老资金流商户使用 REFUND_SOURCE_UNSETTLED_FUNDS---未结算资金退款（默认使用未结算资金退款） 
	 * REFUND_SOURCE_RECHARGE_FUNDS---可用余额退款
	 */
	public static final String refund_account = "refund_account";
	/**
	 * 支付宝支付 appid 自定义的字段
	 */
	public static final String aliPayAppid = "aliPayAppid";
	/**
	 * 支付宝RSA 签名使用的私钥
	 */
	public static final String rsaPrivateKey = "rsaPrivateKey";
	
	/**
	 * 支付宝公钥 验签使用
	 */
	public static final String alipayPublicKey = "alipayPublicKey";
	/**
	 * 商品的标题/交易标题/订单标题/订单关键字等
	 */
	public static final String subject = "subject";
	/**
	 * 支付宝金额
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	public static final String total_amount = "total_amount";
	/**
	 * 支付宝超时时间
	 * 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
	 */
	public static final String timeout_express = "timeout_express";
	/**
	 * 生成支付宝支付的form表单的字段
	 */
	public static final String aliPayForm = "aliPayForm";
	/**
	 * 支付宝 公用回传参数，如果请求时传递了该参数，则返回给商户时会回传该参数。支付宝会在异步通知时将该参数原样返回。本参数必须进行UrlEncode之后才可以发送给支付宝
	 */
	public static final String passback_params = "passback_params";
	/**
	 * 支付宝订单号
	 */
	public static final String trade_no = "trade_no";
	/**
	 * 商品主类型：0—虚拟类商品，1—实物类商品
                 注：虚拟类商品不支持使用花呗渠道
	 */
	public static final String goods_type = "goods_type";
	/**
	 * 支付宝网关返回码
	 */
	public static final String code = "code";
	/**
	 * 支付宝网关返回信息
	 */
	public static final String msg = "msg";
	/**
	 * 支付宝返回业务状态
	 */
	public static final String sub_code = "sub_code";
	/**
	 * 支付宝业务返回码
	 */
	public static final String sub_msg = "sub_msg";
	/**
	 * 支付宝交易状态
	 */
	public static final String trade_status = "trade_status";
	/**
	 * 支付宝实际扣款金额 元
	 */
	public static final String receipt_amount = "receipt_amount";
	/**
	 * 支付宝本次交易打款给卖家的时间
	 */
	public static final String send_pay_date = "send_pay_date";
	/**
	 * 支付宝通知时间
	 */
	public static final String notify_time = "notify_time";
	/**
	 * 支付宝交易付款时间
	 */
	public static final String gmt_payment = "gmt_payment";
	/**
	 * 支付宝下载对账单地址
	 */
	public static final String bill_download_url = "bill_download_url";
	
	/**
	 * 通道返回业务数据key
	 */
	public static final String retData = "retData";
	/**
	 * 调用一网通时订单已创建了的时间 分
	 */
	public static final String usedTime = "usedTime";
	
	/**
	 * 支付宝退款金额
	 */
	public static final String refund_amount = "refund_amount";
	
	/**
	 * 支付宝退款原因
	 */
	public static final String refund_reason = "refund_reason";
	/**
	 * 标识一次退款请求，同一笔交易多次退款需要保证唯一，如需部分退款，则此参数必传。
	 */
	public static final String out_request_no = "out_request_no";
	/**
	 * 用户的登录id
	 */
	public static final String buyer_logon_id = "buyer_logon_id";
	/**
	 * 本次退款是否发生了资金变化
	 */
	public static final String fund_change = "fund_change";
	/**
	 * 退款支付时间
	 */
	public static final String gmt_refund_pay = "gmt_refund_pay";
	/**
	 * 交易在支付时候的门店名称
	 */
	public static final String store_name = "store_name";
	/**
	 * 买家在支付宝的用户id
	 */
	public static final String buyer_user_id = "buyer_user_id";
	/**
	 * 微信支付安全秘钥
	 */
	public static final String partnerKey = "partnerKey";
	/**
	 * 一网通退款查询接口地址
	 */
	public static final String netPayDoRefundQueryUrl = "netPayDoRefundQueryUrl";
	
	/**
	 * 一网通按退款日期查询接口地址
	 */
	public static final String netPayQueryRefundByDateUrl = "netPayQueryRefundByDateUrl";
	/**
	 * 银行受理时间
	 */
	public static final String bankTime = "bankTime";
	/**
	 * 为应用系统做免登陆使用的微信回调地址
	 */
	public static final String redirect_uri_info = "redirect_uri_info";
	
	
	/**
	 * 纳税人识别号
	 */
	public static final String taxpayerId = "taxpayerId";
	
	/**
	 * 销售方银行账号
	 */
	public static final String saleAccountNo = "saleAccountNo";
	/**
	 * 购买方名称
	 */
	public static final String buyerName = "buyerName";
	/**
	 * 购买方识别号
	 */
	public static final String buyerTaxpayerId = "buyerTaxpayerId";
	/**
	 * 购买方地址
	 */
	public static final String buyerAddr = "buyerAddr";
	/**
	 * 购买方电话
	 */
	public static final String buyerMobile = "buyerMobile";
	/**
	 * 购买方银行及账号
	 */
	public static final String buyerAccountNo = "buyerAccountNo";
	/**
	 * 店铺编码
	 */
	public static final String storeCode = "storeCode";
	/**
	 * 购买方邮箱
	 */
	public static final String buyerEmail = "buyerEmail";
	/**
	 * 收票人手机
	 */
	public static final String collectorPhone = "collectorPhone";
	/**
	 * 开票人
	 */
	public static final String drawer = "drawer";
	/**
	 * 收款人
	 */
	public static final String payee = "payee";
	/**
	 * 复核
	 */
	public static final String checker = "checker";
	/**
	 * 价税合计金额
	 */
	public static final String priceTaxAmount = "priceTaxAmount";
	/**
	 * 订单号
	 */
//	public static final String orderNo = "orderNo";
	/**
	 * 开票点代码
	 */
	public static final String issueAddressCode = "issueAddressCode";
	/**
	 * 设备类型
	 */
	public static final String eqptType = "eqptType";
	/**
	 * 发票种类编码
	 */
	public static final String invoiceKind = "invoiceKind";
	/**
	 * 税控盘编号
	 */
	public static final String taxDiskCode = "taxDiskCode";
	/**
	 * 税控盘口令
	 */
	public static final String taxDiskPwd = "taxDiskPwd";
	/**
	 * 税务数字证书密码
	 */
	public static final String taxSignPwd = "taxSignPwd";
	/**
	 * 备注
	 */
	public static final String remark = "remark";
	/**
	 * 商品行项目信息（发票明细）
	 */
	public static final String wareListInfo = "wareListInfo";
	
	/**
	 * 商品行项目信息（发票明细）
	 */
	public static final String items = "items";
	
	/**
	 * 结果描述
	 */
	public static final String resMsg = "resMsg";
	/**
	 * 请求流水号
	 */
	public static final String requestCode = "requestCode";
	
	
	/**
	 * 原发票代码
	 */
	public static final String replacedInvoiceCode = "replacedInvoiceCode";
	/**
	 * 原发票号码
	 */
	public static final String replacedInvoiceNo = "replacedInvoiceNo";
	/**
	 * 冲红原因
	 */
	public static final String revokeReson = "revokeReson";
	/**
	 * 红字信息表编号
	 */
	public static final String redInfoCode = "redInfoCode";
	/**
	 * 通知单编号
	 */
	public static final String noticeOrderCode = "noticeOrderCode";
	/**
	 * 发票号码
	 */
	public static final String invoiceNum = "invoiceNum";
	/**
	 * 发票代码
	 */
	public static final String invoiceCode = "invoiceCode";
	/**
	 * 是否需要商品详情
	 */
	public static final String needItem = "needItem";
	/**
	 * 统计月份
	 */
	public static final String queryDate = "queryDate";
	/**
	 * 机器编号
	 */
	public static final String machineCode = "machineCode";
	/**
	 * 开票点代码（百望税盘且设备类型为0必填，开票点代码）
	 */
	public static final String teminalFlag = "teminalFlag";
	/**
	 * 请求流水号
	 */
	public static final String billRequestNum = "billRequestNum";
	/**
	 * 是否允许重开
	 */
	public static final String reIssue = "reIssue";
	
	
	/**
	 * 校验码
	 */
	public static final String checkNo = "checkNo";
	/**
	 * 二维码
	 */
	public static final String qrcode = "qrcode";
	/**
	 * 不含税总额
	 */
	public static final String priceAmount = "priceAmount";
	/**
	 * 总税额
	 */
	public static final String taxAmount = "taxAmount";
	/**
	 * PDF下载路径
	 */
	public static final String pdfFile = "pdfFile";
	/**
	 *   发票图片下载路径
	 */
	public static final String imageFiles = "imageFiles";
	/**
	 * 成功开票量
	 */
	public static final String totalSuccCount = "totalSuccCount";
	/**
	 * 开票总金额
	 */
	public static final String totalMoney = "totalMoney";
	/**
	 * 剩余发票量
	 */
	public static final String leftInvoiceNum = "leftInvoiceNum";
	
	/**
	 * 商品名称
	 */
	public static final String wareName = "wareName";
	
	/**
	 * 单位
	 */
	public static final String unit = "unit";
	
	/**
	 * 规格型号
	 */
	public static final String standard = "standard";
	
	/**
	 * 数量
	 */
	public static final String count = "count";
	
	/**
	 * 单价
	 */
	public static final String unitPrice = "unitPrice";
	
	/**
	 * 商品编码
	 */
	public static final String wareNo = "wareNo";
	
	/**
	 * 优惠后总额
	 */
	public static final String discountAmount = "discountAmount";
	
	/**
	 * 税率
	 */
	public static final String taxRate = "taxRate";
	
	/**
	 * 开票日期
	 */
	public static final String issueDate = "issueDate";
	
	/**
	 * 发票号码
	 */
	public static final String invoiceNo = "invoiceNo";
	/**
	 * 支付宝退款返回商户上送的退款订单 或者流水
	 */
	public static final String out_biz_no = "out_biz_no";
	/**
	 * 支付宝退款时间
	 */
	public static final String gmt_refund = "gmt_refund";
	/**
	 * 微信支付扫码付返回的二维码链接
	 */
	public static final String code_url = "code_url";
	
	/**
	 * 工行-支付接口字段-接口名称
	 * DATE: 2018-01-31
	 */
	public static final String ICBC_INTERFACE_NAME = "interfaceName";
	public static final String ICBC_INTERFACE_NAME_VALUE = "ICBC_WAPB_B2C";
	/**
	 * 工行-支付接口字段-版本号
	 * DATE: 2018-01-31
	 */
	public static final String ICBC_INTERFACE_VERSION = "interfaceVersion";
	public static final String ICBC_INTERFACE_VERSION_VALUE = "1.0.0.6";
	/**
	 * 工行-支付接口字段-接口数据
	 * DATE: 2018-01-31
	 */
	public static final String ICBC_TRANDATA = "tranData";
	/**
	 * 工行-支付接口字段-签名数据
	 * DATE: 2018-01-31
	 */
	public static final String ICBC_MER_SIGNMSG = "merSignMsg";
	/**
	 * 工行-支付接口字段-证书数据
	 * DATE: 2018-01-31
	 */
	public static final String ICBC_MERCERT = "merCert";
	/**
	 * 工行-支付接口字段-启动类型
	 * DATE: 2018-01-31
	 */
	public static final String ICBC_CLIENT_TYPE = "clientType";
	public static final String ICBC_CLIENT_TYPE_VALUE_0 = "0";
	/**
	 * 工行-支付-支付地址
	 * DATE: 2018-01-31
	 */
	public static final String ICBC_INTERFACE_URL = "interfaceUrl";
	
	/**
	 * 工行-查询-查询地址
	 * DATE: 2018-02-08
	 */
	public static final String ICBC_TARGET_URL= "targetUrl";
	
	/**
	 * 工行-查询-私钥库
	 * DATE: 2018-02-08
	 */
	public static final String ICBC_KEY_STORY = "keyStory";
	/**
	 * 工行-查询-私钥库密码
	 * DATE: 2018-02-08
	 */
	public static final String ICBC_KEY_STORY_PASS = "keyStoryPass";
	/**
	 * 工行-查询-公钥库
	 * DATE: 2018-02-08
	 */
	public static final String ICBC_TRUST_KEY_STORY = "trustKeyStory";
	/**
	 * 工行-查询-公钥库密码
	 * DATE: 2018-02-08
	 */
	public static final String ICBC_TRUST_KEY_STORY_PASS = "trustKeyStoryPass";
	/**
	 * 工行-查询-证书密码
	 * DATE: 2018-02-08
	 */
	public static final String ICBC_KEY_STORY_CERT_PASS = "keyStoryCertPass";
	/**
	 * 工行-查询请求字段-订单号
	 * DATE: 2018-02-08
	 */
	public static final String ICBC_ORDER_NUM = "orderNum";
	/**
	 * 工行-查询请求字段-支付时的交易日期
	 * YYYYMMDD
	 */
	public static final String ICBC_TRAN_DATE = "tranDate";
	/**
	 * 工行-查询请求字段-通道商户号
	 * DATE: 2018-02-08
	 */
	public static final String ICBC_SHOP_CODE = "ShopCode";
	/**
	 * 工行-查询请求字段-通道商户账号
	 * DATE: 2018-02-08
	 */
	public static final String ICBC_SHOP_ACCOUNT = "ShopAccount";
	/**
	 * 工行-支付-xml-根节点
	 * DATE: 2018-02-08
	 */
	public static final String ICBC_B2CREQ = "B2CReq";
	
	/**
	 * xml-头信息
	 * DATE: 2018-02-08
	 */
	public static final String XML_HEADER_GBK_NO = "<?xml version=\"1.0\" encoding=\"GBK\" standalone=\"no\"?>";
	public static final String XML_HEADER_GBK_YES = "<?xml version=\"1.0\" encoding=\"GBK\" standalone=\"yes\"?>";
	/**
	 * 工行-支付-请求字段
	 */
	public static final String BACKUP_1 = "backup1";
	public static final String BACKUP_2 = "backup2";
	public static final String BACKUP_3 = "backup3";
	public static final String BACKUP_4 = "backup4";
	public static final String CHARACTER_GBK = "GBK";
	public static final String CHARACTER_UTF_8 = "UTF-8";
	// 0-都通知 1-只通知成功的
	public static final String ICBC_RESULT_TYPE_0 = "0";
	public static final String ICBC_RESULT_TYPE_1 = "1";
	public static final String ICBC_RESULT_TYPE = "resultType";
	public static final String ICBC_NOTIFY_TYPE = "notifyType";
	public static final String ICBC_NOTIFY_TYPE_HS = "HS";
	public static final String ICBC_NOTIFY_TYPE_AG = "AG";
	public static final String ICBC_MER_VAR = "merVAR";
	public static final String ICBC_MER_URL = "merURL";
	public static final String ICBC_REMARK_2 = "remark2";
	public static final String ICBC_REMARK_1 = "remark1";
	public static final String ICBC_MER_HINT = "merHint";
	public static final String ICBC_CARRIAGE_AMT = "carriageAmt";
	public static final String ICBC_GOODS_NUM = "goodsNum";
	public static final String ICBC_GOODS_NAME = "goodsName";
	public static final String ICBC_GOODS_ID = "goodsID";
	public static final String ICBC_MESSAGE = "message";
	public static final String ICBC_LANGUAGE= "language";
	public static final String ICBC_LANGUAGE_ZH_CN = "zh_CN";
	// public static final String ICBC_MER_URL_ADDR = "http://cyglocal.shang-lian.com/sltf_outside/icbc-test.jsp";
	// public static final String ICBC_MER_URL_FRONT_ADDR= "http://cyglocal.shang-lian.com/sltf_outside/resultNotify/notifyByIcbcB2c.jsp";
	// public static final String ICBC_MER_URL_FRONT_ADDR= "http://cyglocal.shang-lian.com/sltf_outside/inter/zeroGoose";
	// public static final String ICBC_MER_URL_ADDR = "http://cyglocal.shang-lian.com/sltf_outside/inter/icbcB2cBack";
	public static final String ICBC_VERIFY_JOIN_FLAG = "verifyJoinFlag";
	public static final String ICBC_VERIFY_JOIN_FLAG_0 = "0";
	public static final String ICBC_CUSTOM = "custom";
	public static final String ICBC_CUR_TYPE_001 = "001";
	public static final String ICBC_CUR_TYPE = "curType";
	public static final String ICBC_MER_ID = "merID";
	public static final String ICBC_MER_ACCT = "merAcct";
	public static final String ICBC_INSTALL_MENT_TIMES = "installmentTimes" ;
	public static final String ICBC_INSTALL_MENT_TIMES_1 = "1";
	public static final String ICBC_ORDER_INFO = "orderInfo";
	public static final String ICBC_ORDER_DATE = "orderDate";
	public static final String ICBC_ORDER_ID = "orderid";
	public static final String ICBC_AMOUNT = "amount";
	public static final String ICBC_SIGN_MSG = "signMsg";
	public static final String ICBC_NOTIFY_DATA = "notifyData";
	public static final String ICBC_KEY_STORE = "icbcKeyStore";
	public static final String ICBC_KEY_STORE_TRUST = "icbcKeyStoreTrust";
	public static final String ICBC_KEY_CRT = "icbcKeyCrt";
	public static final String ICBC_KEY_KEY = "icbcKeyKey";
	public static final String ICBC_KEY_PASS = "icbcKeyPass";
	public static final String ICBC_APINAME = "APIName";
	public static final String ICBC_APINAME_VALUE = "EAPI";
	public static final String ICBC_EAPI_VERSION = "APIVersion";
	public static final String ICBC_EAPI_VERSION_VALUE = "001.001.002.001";
	public static final String ICBC_MER_REQ_DATA= "MerReqData";
	public static final String PATH_NO = "pathNo";
	public static final String PATH_SERIAL_ID = "pathSerialId";
	public static final String CHARACTER_ICBCAPI = "ICBCAPI";
	public static final String ICBC_RETURN_MSG_IN = "in";
	public static final String ICBC_RETURN_MSG_OUT = "out";
	public static final String CERT_PUBLIC_KEY = "cert_public_key";
	public static final String CERT_PRIVATE_KEY = "cert_private_key";
	public static final String TRAN_REQ_DATA = "tran_req_data";
	public static final String CERT_KEY_PASSWORD = "cert_key_password";
	public static final String SIGN_DATA = "sign_data";
	public static final String BASE64_DATA = "base64_data";
	public static final String PAY_FEE = "pay_fee";
	public static final String PAY_MEANS = "pay_means";
	public static final String PATH_MERCH_ID = "path_merch_id";
	public static final String PATH_ORDER_ID = "path_order_id ";
	public static final String SL_BUSI_ID = "sl_busi_id";
	public static final String REGIS_ORDER_NAME = "regis_order_name";
	/*
	 * ICBC 前台回调地址 
	 */
	public static final String ICBC_SLTF_FRONT_ADDR = "ICBC_SLTF_FRONT_ADDR";
	/*
	 * ICBC 后台回调地址
	 */
	public static final String ICBC_SLTF_BACK_ADDR = "ICBC_SLTF_BACK_ADDR";
	/*
	 * map 映射
	 */
	public static final String MAP_RESULT_DATA = "map_result_data";
	/**
	 * 订单处理状态 交易状态
	 */
	public static final String tranStat = "tranStat";
	/**
	 * 指令描述
	 */
	public static final String bankRem = "bankRem";
	/**
	 * 支付币种
	 */
	public static final String currType = "currType";
	/*
	 * 前台回调地址
	 */
	public static final String FRONT_URL = "fronturl";
	
	
	/*
	 * 推过接口字段
	 */
	public static final String ICBC_ICBCAPI = "ICBCAPI";
	public static final String ICBC_IN = "in";
	public static final String ICBC_PACK_NO = "PackNo";
	public static final String ICBC_ORDER_NO = "orderNo";
	public static final String ICBC_REJ_AMT = "RejAmt";
	public static final String ICBC_SIGN_DATA = "signData";
	public static final String ICBC_CERT_CERT = "Cert";
	
	
	
	
	
	
}